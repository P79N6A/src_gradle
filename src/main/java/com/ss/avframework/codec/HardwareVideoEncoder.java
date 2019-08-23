package com.ss.avframework.codec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AndroidRuntimeException;
import android.view.Surface;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.VideoEncoder;
import com.ss.avframework.opengl.GLSurface;
import com.ss.avframework.opengl.GlRenderDrawer;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.opengl.YuvHelper;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.TEBundle;
import com.ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

@TargetApi(19)
public class HardwareVideoEncoder extends VideoEncoder {
    private static AtomicInteger mROIOn = new AtomicInteger(0);
    private static AtomicInteger mROI_QOP = new AtomicInteger(-6);
    private int adjustedBitrate;
    @Nullable
    private MediaCodec codec;
    private String codecName;
    private String codecType;
    public byte[] configbyte;
    private EGLDisplay currDisplay;
    private EGLSurface currSurface;
    private GlRenderDrawer drawer;
    private GLSurface encoder_surface;
    private long forcedKeyFrameNs;
    private int fps;
    private int height;
    private int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private MediaCodecInfo mMediaCodecInfo;
    private String mROIRectPayload = "0,0-0,0=-6;";
    private boolean mSwap;
    private ThreadUtils.ThreadChecker mThreadChecker;
    @Nullable
    private Thread outputThread;
    private byte[] pps;
    public Object readEncoderDataFence = new Object();
    public volatile boolean running;
    @Nullable
    private volatile Exception shutdownException;
    private byte[] sps;
    private Integer surfaceColorFormat;
    @Nullable
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private byte[] vps_sps_pps;
    private int width;
    private Integer yuvColorFormat;
    private YuvFormat yuvFormat;

    enum YuvFormat {
        I420 {
            /* access modifiers changed from: package-private */
            public final void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 {
            /* access modifiers changed from: package-private */
            public final void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };

        /* access modifiers changed from: package-private */
        public abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);

        static YuvFormat valueOf(int i) {
            if (i == 19) {
                return I420;
            }
            if (i == 21 || i == 2141391872 || i == 2141391876) {
                return NV12;
            }
            throw new IllegalArgumentException("Unsupported colorFormat: " + i);
        }
    }

    private boolean isH265KeyFrame(byte b2) {
        int i = (b2 & 126) >> 1;
        return i == 16 || i == 17 || i == 18 || i == 19 || i == 20 || i == 21;
    }

    private int mapProfileLevel(int i) {
        switch (i) {
            case 2:
                return 2;
            case 3:
                return 8;
            default:
                return 1;
        }
    }

    public boolean setupCodecName() {
        return false;
    }

    private boolean canUseSurface() {
        if (this.surfaceColorFormat != null) {
            return true;
        }
        return false;
    }

    private Thread createOutputThread() {
        return new Thread() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r2 = this;
                L_0x0000:
                    com.ss.avframework.codec.HardwareVideoEncoder r0 = com.ss.avframework.codec.HardwareVideoEncoder.this
                    boolean r0 = r0.running
                    if (r0 == 0) goto L_0x001e
                    com.ss.avframework.codec.HardwareVideoEncoder r0 = com.ss.avframework.codec.HardwareVideoEncoder.this
                    java.lang.Object r0 = r0.readEncoderDataFence
                    monitor-enter(r0)
                    com.ss.avframework.codec.HardwareVideoEncoder r1 = com.ss.avframework.codec.HardwareVideoEncoder.this     // Catch:{ InterruptedException -> 0x0015 }
                    java.lang.Object r1 = r1.readEncoderDataFence     // Catch:{ InterruptedException -> 0x0015 }
                    r1.wait()     // Catch:{ InterruptedException -> 0x0015 }
                    goto L_0x0015
                L_0x0013:
                    r1 = move-exception
                    goto L_0x001c
                L_0x0015:
                    monitor-exit(r0)     // Catch:{ all -> 0x0013 }
                    com.ss.avframework.codec.HardwareVideoEncoder r0 = com.ss.avframework.codec.HardwareVideoEncoder.this
                    r0.deliverEncodedImage()
                    goto L_0x0000
                L_0x001c:
                    monitor-exit(r0)     // Catch:{ all -> 0x0013 }
                    throw r1
                L_0x001e:
                    com.ss.avframework.codec.HardwareVideoEncoder r0 = com.ss.avframework.codec.HardwareVideoEncoder.this
                    r0.releaseCodecOnOutputThread()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.codec.HardwareVideoEncoder.AnonymousClass1.run():void");
            }
        };
    }

    public byte[] getExtraData() {
        if (this.configbyte != null) {
            return this.configbyte;
        }
        return new byte[0];
    }

    private int getOneColorFormat() {
        int[] colorFormats = getColorFormats();
        if (colorFormats == null) {
            return -1;
        }
        for (int i = 0; i < colorFormats.length; i++) {
            if (colorFormats[i] == 2130708361) {
                AVLog.d("HardwareVideoEncoder", "colorFormat support COLOR_FormatSurface");
                return colorFormats[i];
            }
        }
        return -1;
    }

    private MediaCodecInfo getMediaCodecInfo() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(this.codecType)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    @TargetApi(21)
    private MediaCodecInfo getMediaCodecInfo21() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos == null || codecInfos.length == 0) {
            return null;
        }
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                String name = mediaCodecInfo.getName();
                AVLog.d("HardwareVideoEncoder", "mMediaCodecInfo name = " + name);
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(this.codecType)) {
                            return mediaCodecInfo;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public int[] getColorFormats() {
        MediaCodecInfo mediaCodecInfo;
        if (Build.VERSION.SDK_INT >= 21) {
            mediaCodecInfo = getMediaCodecInfo21();
        } else {
            mediaCodecInfo = getMediaCodecInfo();
        }
        this.mMediaCodecInfo = mediaCodecInfo;
        if (this.mMediaCodecInfo == null) {
            return null;
        }
        AVLog.d("HardwareVideoEncoder", "mMediaCodecInfo name = " + this.mMediaCodecInfo.getName());
        MediaCodecInfo.CodecCapabilities capabilitiesForType = this.mMediaCodecInfo.getCapabilitiesForType(this.codecType);
        int length = capabilitiesForType.colorFormats.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = capabilitiesForType.colorFormats[i];
        }
        return iArr;
    }

    public void release() {
        if (this.mThreadChecker != null) {
            this.mThreadChecker.checkIsOnValidThread();
            if (this.outputThread != null) {
                this.running = false;
                synchronized (this.readEncoderDataFence) {
                    this.readEncoderDataFence.notifyAll();
                }
                if (ThreadUtils.joinUninterruptibly(this.outputThread, 5000)) {
                    Exception exc = this.shutdownException;
                }
            }
            if (this.drawer != null) {
                this.drawer.release();
                this.drawer = null;
            }
            if (this.encoder_surface != null) {
                this.encoder_surface.release();
                this.encoder_surface = null;
            }
            if (this.textureInputSurface != null) {
                this.textureInputSurface.release();
                this.textureInputSurface = null;
            }
            this.codec = null;
            this.outputThread = null;
        }
    }

    public void releaseCodecOnOutputThread() {
        AVLog.d("HardwareVideoEncoder", "Releasing MediaCodec on output thread");
        try {
            this.codec.signalEndOfInputStream();
            this.codec.stop();
        } catch (Exception e2) {
            AVLog.e("HardwareVideoEncoder", "Media encoder stop failed" + e2);
        }
        try {
            this.codec.release();
        } catch (Exception e3) {
            AVLog.e("HardwareVideoEncoder", "Media encoder release failed" + e3);
            this.shutdownException = e3;
        }
        AVLog.d("HardwareVideoEncoder", "Release on output thread done");
    }

    public void deliverEncodedImage() {
        ByteBuffer byteBuffer;
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int i = -1;
            try {
                i = this.codec.dequeueOutputBuffer(bufferInfo, 0);
            } catch (Exception unused) {
            }
            while (i >= 0) {
                ByteBuffer byteBuffer2 = this.codec.getOutputBuffers()[i];
                byteBuffer2.position(bufferInfo.offset);
                byteBuffer2.limit(bufferInfo.size);
                ByteBuffer slice = byteBuffer2.slice();
                if (!slice.isDirect()) {
                    byteBuffer = ByteBuffer.allocateDirect(bufferInfo.size);
                    byteBuffer.position(0);
                    byteBuffer.put(slice);
                    byteBuffer.position(0);
                } else {
                    byteBuffer = slice;
                }
                if ((bufferInfo.flags & 2) != 0) {
                    AVLog.d("HardwareVideoEncoder", "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                    if (this.configbyte == null) {
                        this.configbyte = new byte[bufferInfo.size];
                        byteBuffer.get(this.configbyte);
                        byteBuffer.position(0);
                    }
                    nativeEncoded(byteBuffer, bufferInfo.size, bufferInfo.flags, 0, 0, 0);
                } else if (bufferInfo.flags != 4) {
                    if (bufferInfo.flags == 1 && this.configbyte != null) {
                        if (this.codecType == "video/avc") {
                            if (bufferInfo.size > this.configbyte.length && byteBuffer.get(4) == this.configbyte[4] && (byteBuffer.get(this.configbyte.length + 4) & 31) == 5) {
                                byteBuffer.position(this.configbyte.length);
                                byteBuffer.limit(byteBuffer.limit() - this.configbyte.length);
                                byteBuffer = byteBuffer.slice();
                            }
                        } else if (this.codecType == "video/hevc" && bufferInfo.size > this.configbyte.length && byteBuffer.get(4) == this.configbyte[4] && isH265KeyFrame(byteBuffer.get(this.configbyte.length + 4))) {
                            byteBuffer.position(this.configbyte.length);
                            byteBuffer.limit(byteBuffer.limit() - this.configbyte.length);
                            byteBuffer = byteBuffer.slice();
                        }
                    }
                    nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, bufferInfo.presentationTimeUs, bufferInfo.presentationTimeUs);
                } else {
                    return;
                }
                this.codec.releaseOutputBuffer(i, false);
                i = this.codec.dequeueOutputBuffer(bufferInfo, 0);
            }
            if (i == -2) {
                MediaFormat outputFormat = this.codec.getOutputFormat();
                ByteBuffer byteBuffer3 = outputFormat.getByteBuffer("csd-0");
                ByteBuffer byteBuffer4 = outputFormat.getByteBuffer("csd-1");
                if (this.codecType == "video/avc" && byteBuffer3 != null && byteBuffer4 != null) {
                    this.sps = (byte[]) byteBuffer3.array().clone();
                    this.pps = (byte[]) byteBuffer4.array().clone();
                    this.configbyte = new byte[(this.sps.length + this.pps.length)];
                    System.arraycopy(this.sps, 0, this.configbyte, 0, this.sps.length);
                    System.arraycopy(this.pps, 0, this.configbyte, this.sps.length, this.pps.length);
                } else if (this.codecType == "video/hevc" && byteBuffer3 != null) {
                    this.vps_sps_pps = (byte[]) byteBuffer3.array().clone();
                    this.configbyte = new byte[this.vps_sps_pps.length];
                    System.arraycopy(this.vps_sps_pps, 0, this.configbyte, 0, this.vps_sps_pps.length);
                }
            }
        } catch (IllegalStateException e2) {
            AVLog.e("HardwareVideoEncoder", "deliverOutput failed\n" + e2.getMessage());
        }
    }

    private boolean shouldForceKeyFrame(long j) {
        if (this.forcedKeyFrameNs <= 0 || j <= this.lastKeyFrameNs + this.forcedKeyFrameNs) {
            return false;
        }
        return true;
    }

    private void requestKeyFrame(long j) {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (IllegalStateException e2) {
            AVLog.e("HardwareVideoEncoder", "requestKeyFrame failed\n" + e2.getMessage());
        }
    }

    public int Encode(VideoFrame videoFrame) {
        int i;
        if (this.codec == null) {
            return -1;
        }
        this.mThreadChecker.checkIsOnValidThread();
        synchronized (this.readEncoderDataFence) {
            this.readEncoderDataFence.notify();
        }
        if (this.useSurfaceMode) {
            i = encodeTextureBuffer(videoFrame);
        } else {
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            i = encodeByteBuffer(videoFrame, buffer, ((buffer.getHeight() * buffer.getWidth()) * 3) / 2);
        }
        return i;
    }

    public boolean InitEncoder(TEBundle tEBundle) {
        int i;
        int i2;
        if (this.mThreadChecker == null) {
            this.mThreadChecker = new ThreadUtils.ThreadChecker();
        }
        this.width = tEBundle.getInt("video_width");
        this.height = tEBundle.getInt("video_height");
        this.useSurfaceMode = canUseSurface();
        this.fps = tEBundle.getInt("video_fps");
        if (this.fps > 0) {
            i = this.fps;
        } else {
            i = 25;
        }
        this.fps = i;
        this.adjustedBitrate = (int) tEBundle.getLong("video_bitrate");
        if (this.adjustedBitrate < 900000) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        mROIOn.getAndSet(i2 & tEBundle.getInt("roi_on"));
        this.keyFrameIntervalSec = tEBundle.getInt("video_gop") / this.fps;
        this.forcedKeyFrameNs = (long) (((this.fps * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        if (tEBundle.getInt("configuration_type") != 0) {
            return initEncodeInternal(tEBundle);
        }
        AVLog.e("HardwareVideoEncoder", "Value of TEBundle.kKeyVideoConfigurationType error, should be 1 (Annex-B)");
        return false;
    }

    public void SetBitrate(int i) {
        int i2;
        if (i < 900000) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        mROIOn.getAndSet(i2 & mROIOn.get());
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", i);
                this.codec.setParameters(bundle);
                this.adjustedBitrate = i;
            } catch (IllegalStateException e2) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("video-bitrate", this.adjustedBitrate);
                this.codec.setParameters(bundle2);
            } catch (Throwable unused) {
                AVLog.e("HardwareVideoEncoder", "updateBitrate failed" + e2);
                AVLog.ioe("HardwareVideoEncoder", "Update bitrate failed new bitrate " + i + " old bitrate " + this.adjustedBitrate + " cause:" + e2.getMessage());
            }
        }
    }

    private int encodeTextureBuffer(VideoFrame videoFrame) {
        try {
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            if (!(buffer instanceof VideoFrame.TextureBuffer)) {
                return -1;
            }
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            if (this.mSwap) {
                this.encoder_surface.nativeSwapBuffers();
            } else {
                this.mSwap = true;
            }
            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                this.drawer.drawOes(textureBuffer.getTextureId(), null, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix()), 0, 0, this.width, this.height);
            } else if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.RGB) {
                this.drawer.drawRgb(textureBuffer.getTextureId(), null, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix()), 0, 0, this.width, this.height);
            }
            GLES20.glFlush();
            if (Build.VERSION.SDK_INT >= 18) {
                EGLExt.eglPresentationTimeANDROID(this.currDisplay, this.currSurface, videoFrame.getTimestampNs());
                if (mROIOn.get() == 0) {
                    return 0;
                }
                long timestampNs = videoFrame.getTimestampNs();
                Bundle bundle = new Bundle();
                bundle.putLong("vendor.qti-ext-enc-roiinfo.timestamp", timestampNs / 1000);
                bundle.putString("vendor.qti-ext-enc-roiinfo.type", "rect");
                VideoFrame.Buffer buffer2 = videoFrame.getBuffer();
                TextureBufferImpl textureBufferImpl = null;
                if (buffer2 != null && (buffer2 instanceof TextureBufferImpl)) {
                    textureBufferImpl = (TextureBufferImpl) buffer2;
                }
                VideoFrame.Buffer.stRoiInfo rOIInfo = textureBufferImpl.getROIInfo();
                if (rOIInfo != null) {
                    int centerPosX = rOIInfo.getCenterPosX();
                    int centerPosY = rOIInfo.getCenterPosY();
                    int roiWidth = rOIInfo.getRoiWidth();
                    int roiHeight = rOIInfo.getRoiHeight();
                    int i = mROI_QOP.get();
                    if (centerPosX + centerPosY + roiWidth + roiHeight > 0) {
                        this.mROIRectPayload = (centerPosY - (roiHeight / 2)) + "," + (centerPosX - (roiWidth / 2)) + "-" + (centerPosY + (roiHeight / 2)) + "," + (centerPosX + (roiWidth / 2)) + "=" + i + ";";
                    } else {
                        this.mROIRectPayload = "0,0-0,0=" + i + ";";
                    }
                }
                bundle.putString("vendor.qti-ext-enc-roiinfo.rect-payload", this.mROIRectPayload);
                this.codec.setParameters(bundle);
                return 0;
            }
            throw new AndroidRuntimeException("Current API no supports.");
        } catch (RuntimeException e2) {
            AVLog.e("HardwareVideoEncoder", "encodeTexture failed\n" + e2.getMessage());
            return -2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:52|53|54|55|(2:57|(1:59)(3:60|61|62))|63) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0168 */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0198 A[Catch:{ Exception -> 0x01b9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean initEncodeInternal(com.ss.avframework.utils.TEBundle r13) {
        /*
            r12 = this;
            r0 = -1
            r12.lastKeyFrameNs = r0
            int r0 = r12.getOneColorFormat()
            r1 = 0
            if (r0 >= 0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.String r2 = r12.codecName     // Catch:{ Exception -> 0x01b9 }
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r2)     // Catch:{ Exception -> 0x01b9 }
            r12.codec = r2     // Catch:{ Exception -> 0x01b9 }
            android.media.MediaCodec r2 = r12.codec     // Catch:{ Exception -> 0x01b9 }
            android.media.MediaCodecInfo r2 = r2.getCodecInfo()     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r3 = r2.getName()     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r4 = "OMX.google."
            boolean r3 = r3.startsWith(r4)     // Catch:{ Exception -> 0x01b9 }
            if (r3 == 0) goto L_0x0027
            return r1
        L_0x0027:
            java.lang.String r3 = r12.codecType     // Catch:{ Exception -> 0x01b9 }
            int r4 = r12.width     // Catch:{ Exception -> 0x01b9 }
            int r5 = r12.height     // Catch:{ Exception -> 0x01b9 }
            android.media.MediaFormat r3 = android.media.MediaFormat.createVideoFormat(r3, r4, r5)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r4 = "bitrate"
            int r5 = r12.adjustedBitrate     // Catch:{ Exception -> 0x01b9 }
            r3.setInteger(r4, r5)     // Catch:{ Exception -> 0x01b9 }
            java.util.concurrent.atomic.AtomicInteger r4 = mROIOn     // Catch:{ Exception -> 0x01b9 }
            int r4 = r4.get()     // Catch:{ Exception -> 0x01b9 }
            r5 = 1
            int r4 = 1 - r4
            java.lang.String r6 = "video_is_cbr"
            int r6 = r13.getInt(r6)     // Catch:{ Exception -> 0x01b9 }
            r4 = r4 & r6
            if (r4 != r5) goto L_0x004c
            r4 = 1
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            java.lang.String r6 = "bitrate-mode"
            r7 = 2
            if (r4 == 0) goto L_0x0054
            r4 = 2
            goto L_0x0055
        L_0x0054:
            r4 = 1
        L_0x0055:
            r3.setInteger(r6, r4)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r4 = "color-format"
            r3.setInteger(r4, r0)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = "frame-rate"
            int r4 = r12.fps     // Catch:{ Exception -> 0x01b9 }
            r3.setInteger(r0, r4)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = "i-frame-interval"
            int r4 = r12.keyFrameIntervalSec     // Catch:{ Exception -> 0x01b9 }
            r3.setInteger(r0, r4)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = r12.codecType     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r4 = "video/avc"
            r6 = 0
            if (r0 != r4) goto L_0x010e
            java.lang.String r0 = r12.codecType     // Catch:{ Exception -> 0x01b9 }
            android.media.MediaCodecInfo$CodecCapabilities r0 = r2.getCapabilitiesForType(r0)     // Catch:{ Exception -> 0x01b9 }
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels     // Catch:{ Exception -> 0x01b9 }
            int r2 = r0.length     // Catch:{ Exception -> 0x01b9 }
            r4 = 0
        L_0x007c:
            if (r4 >= r2) goto L_0x00d6
            r8 = r0[r4]     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r9 = "HardwareVideoEncoder"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r11 = "Profile = "
            r10.<init>(r11)     // Catch:{ Exception -> 0x01b9 }
            int r11 = r8.profile     // Catch:{ Exception -> 0x01b9 }
            r10.append(r11)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r11 = ", Level = "
            r10.append(r11)     // Catch:{ Exception -> 0x01b9 }
            int r11 = r8.level     // Catch:{ Exception -> 0x01b9 }
            r10.append(r11)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01b9 }
            com.ss.avframework.utils.AVLog.d(r9, r10)     // Catch:{ Exception -> 0x01b9 }
            int r9 = r8.profile     // Catch:{ Exception -> 0x01b9 }
            if (r9 != r5) goto L_0x00ab
            java.lang.String r9 = "HardwareVideoEncoder"
            java.lang.String r10 = "Support Baseline Profile!"
            com.ss.avframework.utils.AVLog.d(r9, r10)     // Catch:{ Exception -> 0x01b9 }
            goto L_0x00c4
        L_0x00ab:
            int r9 = r8.profile     // Catch:{ Exception -> 0x01b9 }
            if (r9 != r7) goto L_0x00b7
            java.lang.String r9 = "HardwareVideoEncoder"
            java.lang.String r10 = "Support Main Profile!"
            com.ss.avframework.utils.AVLog.d(r9, r10)     // Catch:{ Exception -> 0x01b9 }
            goto L_0x00c4
        L_0x00b7:
            int r9 = r8.profile     // Catch:{ Exception -> 0x01b9 }
            r10 = 8
            if (r9 != r10) goto L_0x00c4
            java.lang.String r9 = "HardwareVideoEncoder"
            java.lang.String r10 = "Support High Profile!"
            com.ss.avframework.utils.AVLog.d(r9, r10)     // Catch:{ Exception -> 0x01b9 }
        L_0x00c4:
            int r9 = r8.profile     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r10 = "video_profileLevel"
            int r10 = r13.getInt(r10)     // Catch:{ Exception -> 0x01b9 }
            int r10 = r12.mapProfileLevel(r10)     // Catch:{ Exception -> 0x01b9 }
            if (r9 != r10) goto L_0x00d3
            goto L_0x00d7
        L_0x00d3:
            int r4 = r4 + 1
            goto L_0x007c
        L_0x00d6:
            r8 = r6
        L_0x00d7:
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01b9 }
            r0 = 24
            if (r13 < r0) goto L_0x010d
            if (r8 == 0) goto L_0x010d
            java.lang.String r13 = "HardwareVideoEncoder"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r2 = "Set Profile: "
            r0.<init>(r2)     // Catch:{ Exception -> 0x01b9 }
            int r2 = r8.profile     // Catch:{ Exception -> 0x01b9 }
            r0.append(r2)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r2 = ", Level = "
            r0.append(r2)     // Catch:{ Exception -> 0x01b9 }
            int r2 = r8.level     // Catch:{ Exception -> 0x01b9 }
            r0.append(r2)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01b9 }
            com.ss.avframework.utils.AVLog.d(r13, r0)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r13 = "profile"
            int r0 = r8.profile     // Catch:{ Exception -> 0x01b9 }
            r3.setInteger(r13, r0)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r13 = "level"
            int r0 = r8.level     // Catch:{ Exception -> 0x01b9 }
            r3.setInteger(r13, r0)     // Catch:{ Exception -> 0x01b9 }
            goto L_0x012f
        L_0x010d:
            return r1
        L_0x010e:
            java.lang.String r0 = r12.codecType     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r2 = "video/hevc"
            if (r0 != r2) goto L_0x012f
            java.lang.String r0 = "video_profileLevel"
            int r13 = r13.getInt(r0)     // Catch:{ Exception -> 0x01b9 }
            r0 = 5
            if (r13 == r0) goto L_0x0123
            java.lang.String r13 = "profile"
            r3.setInteger(r13, r5)     // Catch:{ Exception -> 0x01b9 }
            goto L_0x0128
        L_0x0123:
            java.lang.String r13 = "profile"
            r3.setInteger(r13, r7)     // Catch:{ Exception -> 0x01b9 }
        L_0x0128:
            java.lang.String r13 = "level"
            r0 = 256(0x100, float:3.59E-43)
            r3.setInteger(r13, r0)     // Catch:{ Exception -> 0x01b9 }
        L_0x012f:
            java.lang.String r13 = "HardwareVideoEncoder"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r2 = "Format: "
            r0.<init>(r2)     // Catch:{ Exception -> 0x01b9 }
            r0.append(r3)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01b9 }
            com.ss.avframework.utils.AVLog.d(r13, r0)     // Catch:{ Exception -> 0x01b9 }
            java.util.concurrent.atomic.AtomicInteger r13 = mROIOn     // Catch:{ Exception -> 0x01b9 }
            int r13 = r13.get()     // Catch:{ Exception -> 0x01b9 }
            if (r13 != r5) goto L_0x0151
            java.lang.String r13 = "vendor.qti-ext-extradata-enable.types"
            java.lang.String r0 = "roiinfo"
            r3.setString(r13, r0)     // Catch:{ Exception -> 0x01b9 }
        L_0x0151:
            android.media.MediaCodec r13 = r12.codec     // Catch:{ Exception -> 0x01b9 }
            r13.configure(r3, r6, r6, r5)     // Catch:{ Exception -> 0x01b9 }
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01b9 }
            r0 = 18
            if (r13 < r0) goto L_0x01b8
            boolean r13 = r12.useSurfaceMode     // Catch:{ Exception -> 0x01b9 }
            if (r13 == 0) goto L_0x01b8
            android.media.MediaCodec r13 = r12.codec     // Catch:{ Exception -> 0x0168 }
            android.view.Surface r13 = r13.createInputSurface()     // Catch:{ Exception -> 0x0168 }
            r12.textureInputSurface = r13     // Catch:{ Exception -> 0x0168 }
        L_0x0168:
            com.ss.avframework.opengl.GLSurface r13 = new com.ss.avframework.opengl.GLSurface     // Catch:{ Exception -> 0x01b9 }
            r13.<init>()     // Catch:{ Exception -> 0x01b9 }
            r12.encoder_surface = r13     // Catch:{ Exception -> 0x01b9 }
            com.ss.avframework.opengl.GlRenderDrawer r13 = new com.ss.avframework.opengl.GlRenderDrawer     // Catch:{ Exception -> 0x01b9 }
            r13.<init>()     // Catch:{ Exception -> 0x01b9 }
            r12.drawer = r13     // Catch:{ Exception -> 0x01b9 }
            com.ss.avframework.opengl.GLSurface r13 = r12.encoder_surface     // Catch:{ Exception -> 0x01b9 }
            int r0 = r12.width     // Catch:{ Exception -> 0x01b9 }
            int r2 = r12.height     // Catch:{ Exception -> 0x01b9 }
            android.view.Surface r3 = r12.textureInputSurface     // Catch:{ Exception -> 0x01b9 }
            r13.nativeSurfaceCreate(r0, r2, r3)     // Catch:{ Exception -> 0x01b9 }
            com.ss.avframework.opengl.GLSurface r13 = r12.encoder_surface     // Catch:{ Exception -> 0x01b9 }
            r13.nativeMakeCurrent()     // Catch:{ Exception -> 0x01b9 }
            android.opengl.EGLDisplay r13 = android.opengl.EGL14.eglGetCurrentDisplay()     // Catch:{ Exception -> 0x01b9 }
            r12.currDisplay = r13     // Catch:{ Exception -> 0x01b9 }
            r13 = 12378(0x305a, float:1.7345E-41)
            android.opengl.EGLSurface r13 = android.opengl.EGL14.eglGetCurrentSurface(r13)     // Catch:{ Exception -> 0x01b9 }
            r12.currSurface = r13     // Catch:{ Exception -> 0x01b9 }
            android.opengl.EGLSurface r13 = r12.currSurface     // Catch:{ Exception -> 0x01b9 }
            if (r13 == 0) goto L_0x01b7
            android.opengl.EGLDisplay r13 = r12.currDisplay     // Catch:{ Exception -> 0x01b9 }
            if (r13 != 0) goto L_0x019d
            goto L_0x01b7
        L_0x019d:
            android.media.MediaCodec r13 = r12.codec     // Catch:{ Exception -> 0x01b9 }
            r13.start()     // Catch:{ Exception -> 0x01b9 }
            r12.running = r5
            java.lang.Thread r13 = r12.createOutputThread()
            r12.outputThread = r13
            java.lang.Thread r13 = r12.outputThread
            java.lang.String r0 = "HwEncoderReadThread"
            r13.setName(r0)
            java.lang.Thread r13 = r12.outputThread
            r13.start()
            return r5
        L_0x01b7:
            return r1
        L_0x01b8:
            return r1
        L_0x01b9:
            r13 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "initEncodeInternal failed"
            r2.<init>(r3)
            java.lang.String r13 = r13.getMessage()
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            com.ss.avframework.utils.AVLog.e(r0, r13)
            r12.release()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.codec.HardwareVideoEncoder.initEncodeInternal(com.ss.avframework.utils.TEBundle):boolean");
    }

    private int encodeByteBuffer(VideoFrame videoFrame, VideoFrame.Buffer buffer, int i) {
        long timestampNs = (videoFrame.getTimestampNs() + 500) / 1000;
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0);
            if (dequeueInputBuffer == -1) {
                AVLog.d("HardwareVideoEncoder", "Dropped frame, no input buffers available");
                return -2;
            }
            try {
                this.yuvFormat.fillBuffer(this.codec.getInputBuffers()[dequeueInputBuffer], buffer);
                try {
                    if (!this.running) {
                        this.codec.queueInputBuffer(dequeueInputBuffer, 0, i, timestampNs, 4);
                    } else {
                        this.codec.queueInputBuffer(dequeueInputBuffer, 0, i, timestampNs, 0);
                    }
                    return 0;
                } catch (IllegalStateException e2) {
                    AVLog.e("HardwareVideoEncoder", "queueInputBuffer failed\n" + e2);
                    return -4;
                }
            } catch (IllegalStateException e3) {
                AVLog.e("HardwareVideoEncoder", "getInputBuffers failed\n" + e3);
                return -3;
            }
        } catch (IllegalStateException e4) {
            AVLog.e("HardwareVideoEncoder", "dequeueInputBuffer failed\n" + e4.getMessage());
            return -1;
        }
    }

    public void setupCodecName(String str, String str2, Integer num, Integer num2) {
        this.codecName = str;
        this.codecType = str2;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
    }
}
