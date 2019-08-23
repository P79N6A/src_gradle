package io.agora.rtc.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import io.agora.rtc.internal.Logging;
import io.agora.rtc.video.EglBase10;
import io.agora.rtc.video.EglBase14;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

@TargetApi(19)
public class MediaCodecVideoEncoder {
    private static final String[] H264_HW_EXCEPTION_MODELS = {"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"};
    private static int codecErrors;
    private static MediaCodecVideoEncoderErrorCallback errorCallback;
    private static Set<String> hwEncoderDisabledTypes = new HashSet();
    private static MediaCodecVideoEncoder runningInstance;
    private static final int[] supportedColorList = {19, 21, 2141391872, 2141391876};
    private static final String[] supportedH264HwCodecPrefixes = {"OMX.qcom."};
    private static final int[] supportedSurfaceColorList = {2130708361};
    private static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Intel."};
    private static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom."};
    private int adjusted_kbps;
    private int colorFormat;
    private ByteBuffer configData;
    private GlRectDrawer drawer;
    private EglBase eglBase;
    private FileOutputStream fos;
    private int height;
    private Surface inputSurface;
    public MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private VideoCodecType type;
    private int width;

    static class EncoderProperties {
        public final String codecName;
        public final int colorFormat;
        public final boolean supportedList;

        public EncoderProperties(String str, int i, boolean z) {
            this.codecName = str;
            this.colorFormat = i;
            this.supportedList = z;
        }
    }

    public interface MediaCodecVideoEncoderErrorCallback {
        void onMediaCodecVideoEncoderCriticalError(int i);
    }

    static class OutputBufferInfo {
        public final ByteBuffer buffer;
        public final int index;
        public final boolean isKeyFrame;
        public final long presentationTimestampUs;
        public final int size;

        public OutputBufferInfo(int i, ByteBuffer byteBuffer, boolean z, long j, int i2) {
            this.index = i;
            this.buffer = byteBuffer;
            this.isKeyFrame = z;
            this.presentationTimestampUs = j;
            this.size = i2;
        }
    }

    public enum VideoCodecType {
        VIDEO_CODEC_VP8,
        VIDEO_CODEC_VP9,
        VIDEO_CODEC_H264
    }

    private void checkOnMediaCodecThread() {
    }

    public static void disableH264HwCodec() {
        Logging.w("MediaCodecVideoEncoder", "H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableVp8HwCodec() {
        Logging.w("MediaCodecVideoEncoder", "VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Logging.w("MediaCodecVideoEncoder", "VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    public static boolean isVp8HwSupported() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findHwEncoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, supportedColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findHwEncoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, supportedSurfaceColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp9HwSupported() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findHwEncoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, supportedColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findHwEncoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, supportedSurfaceColorList) == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(0);
        } catch (IllegalStateException e2) {
            Logging.e("MediaCodecVideoEncoder", "dequeueIntputBuffer failed", e2);
            return -2;
        }
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer[] getInputBuffers() {
        ByteBuffer[] inputBuffers = this.mediaCodec.getInputBuffers();
        Logging.d("MediaCodecVideoEncoder", "Input buffers: " + inputBuffers.length);
        return inputBuffers;
    }

    public static boolean isH264HwSupported() {
        try {
            if (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", supportedH264HwCodecPrefixes, supportedColorList) == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            Logging.e("MediaCodecVideoEncoder", "isH264HwSupported failed!");
            return false;
        }
    }

    public static boolean isH264HwSupportedUsingTextures() {
        boolean z = false;
        try {
            if (!hwEncoderDisabledTypes.contains("video/avc") && findHwEncoder("video/avc", supportedH264HwCodecPrefixes, supportedSurfaceColorList) != null) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            Logging.e("MediaCodecVideoEncoder", "isH264HwSupportedUsingTextures failed!");
            return false;
        }
    }

    public static void printStackTrace() {
        if (runningInstance != null && runningInstance.mediaCodecThread != null) {
            StackTraceElement[] stackTrace = runningInstance.mediaCodecThread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.d("MediaCodecVideoEncoder", "MediaCodecVideoEncoder stacks trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.d("MediaCodecVideoEncoder", stackTraceElement.toString());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void release() {
        Logging.d("MediaCodecVideoEncoder", "Java releaseEncoder");
        checkOnMediaCodecThread();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Logging.d("MediaCodecVideoEncoder", "Java releaseEncoder on release thread");
                    MediaCodecVideoEncoder.this.mediaCodec.stop();
                    MediaCodecVideoEncoder.this.mediaCodec.release();
                    Logging.d("MediaCodecVideoEncoder", "Java releaseEncoder on release thread done");
                } catch (Exception e2) {
                    Logging.e("MediaCodecVideoEncoder", "Media encoder release failed", e2);
                }
                countDownLatch.countDown();
            }
        }).start();
        if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 5000)) {
            Logging.e("MediaCodecVideoEncoder", "Media encoder release timeout");
            codecErrors++;
            if (errorCallback != null) {
                Logging.e("MediaCodecVideoEncoder", "Invoke codec error callback. Errors: " + codecErrors);
                errorCallback.onMediaCodecVideoEncoderCriticalError(codecErrors);
            }
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        if (this.drawer != null) {
            this.drawer.release();
            this.drawer = null;
        }
        if (this.eglBase != null) {
            this.eglBase.release();
            this.eglBase = null;
        }
        if (this.inputSurface != null) {
            this.inputSurface.release();
            this.inputSurface = null;
        }
        runningInstance = null;
        Logging.d("MediaCodecVideoEncoder", "Java releaseEncoder done");
    }

    /* access modifiers changed from: package-private */
    public OutputBufferInfo dequeueOutputBuffer() {
        boolean z;
        checkOnMediaCodecThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            boolean z2 = true;
            if (dequeueOutputBuffer >= 0) {
                if ((bufferInfo.flags & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Logging.d("MediaCodecVideoEncoder", "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                    this.configData = ByteBuffer.allocateDirect(bufferInfo.size);
                    this.outputBuffers[dequeueOutputBuffer].position(bufferInfo.offset);
                    this.outputBuffers[dequeueOutputBuffer].limit(bufferInfo.offset + bufferInfo.size);
                    this.configData.put(this.outputBuffers[dequeueOutputBuffer]);
                    this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
                }
            }
            int i = dequeueOutputBuffer;
            if (i >= 0) {
                ByteBuffer duplicate = this.outputBuffers[i].duplicate();
                duplicate.position(bufferInfo.offset);
                duplicate.limit(bufferInfo.offset + bufferInfo.size);
                if ((bufferInfo.flags & 1) == 0) {
                    z2 = false;
                }
                if (z2) {
                    Logging.d("MediaCodecVideoEncoder", "Sync frame generated");
                }
                if (!z2 || this.type != VideoCodecType.VIDEO_CODEC_H264) {
                    OutputBufferInfo outputBufferInfo = new OutputBufferInfo(i, duplicate.slice(), z2, bufferInfo.presentationTimeUs, bufferInfo.size);
                    return outputBufferInfo;
                }
                Logging.d("MediaCodecVideoEncoder", "Appending config frame of size " + this.configData.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.configData.capacity() + bufferInfo.size);
                this.configData.rewind();
                allocateDirect.put(this.configData);
                allocateDirect.put(duplicate);
                allocateDirect.position(0);
                OutputBufferInfo outputBufferInfo2 = new OutputBufferInfo(i, allocateDirect, true, bufferInfo.presentationTimeUs, bufferInfo.size + this.configData.capacity());
                return outputBufferInfo2;
            } else if (i == -3) {
                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                return dequeueOutputBuffer();
            } else if (i == -2) {
                return dequeueOutputBuffer();
            } else {
                if (i == -1) {
                    return null;
                }
                throw new RuntimeException("dequeueOutputBuffer: " + i);
            }
        } catch (IllegalStateException e2) {
            Logging.e("MediaCodecVideoEncoder", "dequeueOutputBuffer failed", e2);
            OutputBufferInfo outputBufferInfo3 = new OutputBufferInfo(-1, null, false, -1, 0);
            return outputBufferInfo3;
        }
    }

    static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setErrorCallback(MediaCodecVideoEncoderErrorCallback mediaCodecVideoEncoderErrorCallback) {
        Logging.d("MediaCodecVideoEncoder", "Set error callback");
        errorCallback = mediaCodecVideoEncoderErrorCallback;
    }

    /* access modifiers changed from: package-private */
    public boolean releaseOutputBuffer(int i) {
        checkOnMediaCodecThread();
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException e2) {
            Logging.e("MediaCodecVideoEncoder", "releaseOutputBuffer failed", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void dumpIntoFile(OutputBufferInfo outputBufferInfo) {
        if (this.fos == null) {
            try {
                this.fos = new FileOutputStream(String.format("/sdcard/java_dump_video_%d_%d.h264", new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)}), true);
            } catch (Exception unused) {
                Logging.i("MediaCodecVideoEncoder", "dumpIntoFile: failed to open java_dump_video.h264");
                return;
            }
        }
        if (outputBufferInfo != null && outputBufferInfo.index >= 0) {
            Logging.i("MediaCodecVideoEncoder", "Dump nal: " + outputBufferInfo.buffer);
            try {
                byte[] bArr = new byte[outputBufferInfo.buffer.remaining()];
                outputBufferInfo.buffer.get(bArr);
                this.fos.write(bArr, 0, outputBufferInfo.size);
            } catch (Exception e2) {
                Logging.e("MediaCodecVideoEncoder", "Run: 4.1 Exception ", e2);
            }
        }
    }

    private boolean setRates(int i, int i2) {
        checkOnMediaCodecThread();
        Logging.d("MediaCodecVideoEncoder", "Bwe setRates: " + i + " kbps");
        try {
            if (i > this.adjusted_kbps) {
                this.adjusted_kbps = i;
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", this.adjusted_kbps * 950);
                this.mediaCodec.setParameters(bundle);
            }
            if (i >= this.adjusted_kbps - 25) {
                return true;
            }
            this.adjusted_kbps = Math.min(i, this.adjusted_kbps - 50);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("video-bitrate", this.adjusted_kbps * 950);
            this.mediaCodec.setParameters(bundle2);
            return false;
        } catch (IllegalStateException e2) {
            Logging.e("MediaCodecVideoEncoder", "setRates failed", e2);
            return false;
        }
    }

    private static EncoderProperties findHwEncoder(String str, String[] strArr, int[] iArr) {
        try {
            return do_findHwEncoder(str, strArr, iArr);
        } catch (Exception unused) {
            return null;
        }
    }

    private static EncoderProperties do_findHwEncoder(String str, String[] strArr, int[] iArr) {
        boolean z;
        String str2;
        boolean z2;
        String str3 = str;
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        if (Build.VERSION.SDK_INT < 19) {
            return null;
        }
        if (iArr2[0] == 2130708361) {
            z = true;
        } else {
            z = false;
        }
        if (!str3.equals("video/avc") || !Arrays.asList(H264_HW_EXCEPTION_MODELS).contains(Build.MODEL)) {
            for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder()) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            str2 = null;
                            break;
                        } else if (supportedTypes[i2].equals(str3)) {
                            str2 = codecInfoAt.getName();
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (str2 != null) {
                        Logging.i("MediaCodecVideoEncoder", "Found candidate encoder " + str2);
                        int length2 = strArr2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                z2 = false;
                                break;
                            } else if (str2.startsWith(strArr2[i3])) {
                                z2 = true;
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (z2 || z) {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str3);
                            for (int i4 : capabilitiesForType.colorFormats) {
                                Logging.d("MediaCodecVideoEncoder", "   Color: 0x" + Integer.toHexString(i4));
                            }
                            for (int i5 : iArr2) {
                                for (int i6 : capabilitiesForType.colorFormats) {
                                    if (i6 == i5) {
                                        Logging.d("MediaCodecVideoEncoder", "Found target encoder for mime " + str3 + " : " + str2 + ". Color: 0x" + Integer.toHexString(i6));
                                        return new EncoderProperties(str2, i6, z2);
                                    }
                                }
                            }
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        }
        Logging.w("MediaCodecVideoEncoder", "Model: " + Build.MODEL + " has black listed H.264 encoder.");
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean encodeBuffer(boolean z, int i, int i2, long j) {
        checkOnMediaCodecThread();
        if (z) {
            try {
                Logging.d("MediaCodecVideoEncoder", "Sync frame request");
                Bundle bundle = new Bundle();
                bundle.putInt("request-sync", 0);
                this.mediaCodec.setParameters(bundle);
            } catch (IllegalStateException e2) {
                Logging.e("MediaCodecVideoEncoder", "encodeBuffer failed", e2);
                return false;
            }
        }
        this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean initEncode(int i, int i2, int i3, int i4, int i5, int i6, int i7, EGLContext eGLContext) {
        boolean z;
        EGLContext eGLContext2 = eGLContext;
        if (eGLContext2 != null) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (createEncoder(i, i2, i3, i4, i5, i6, i7, z)) {
                if (eGLContext2 != null) {
                    this.eglBase = new EglBase14(new EglBase14.Context(eGLContext2), EglBase.CONFIG_RECORDABLE);
                    this.inputSurface = this.mediaCodec.createInputSurface();
                    this.eglBase.createSurface(this.inputSurface);
                    this.drawer = new GlRectDrawer();
                }
                this.mediaCodec.start();
                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                Logging.d("MediaCodecVideoEncoder", "Output buffers: " + this.outputBuffers.length);
                return true;
            }
            Logging.e("MediaCodecVideoEncoder", "failed to create hardware encoder!!");
            return false;
        } catch (Exception e2) {
            Logging.e("MediaCodecVideoEncoder", "failed to create hardware encoder,", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean initEncode(int i, int i2, int i3, int i4, int i5, int i6, int i7, javax.microedition.khronos.egl.EGLContext eGLContext) {
        boolean z;
        javax.microedition.khronos.egl.EGLContext eGLContext2 = eGLContext;
        if (eGLContext2 != null) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (createEncoder(i, i2, i3, i4, i5, i6, i7, z)) {
                if (eGLContext2 != null) {
                    this.eglBase = new EglBase10(new EglBase10.Context(eGLContext2), EglBase.CONFIG_RECORDABLE);
                    this.inputSurface = this.mediaCodec.createInputSurface();
                    this.eglBase.createSurface(this.inputSurface);
                    this.drawer = new GlRectDrawer();
                }
                this.mediaCodec.start();
                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                Logging.d("MediaCodecVideoEncoder", "Output buffers: " + this.outputBuffers.length);
                return true;
            }
            Logging.e("MediaCodecVideoEncoder", "failed to create hardware encoder!!");
            return false;
        } catch (Exception e2) {
            Logging.e("MediaCodecVideoEncoder", "failed to create hardware encoder,", e2);
            return false;
        }
    }

    private boolean createEncoder(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) throws RuntimeException {
        EncoderProperties encoderProperties;
        String str;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        Logging.d("MediaCodecVideoEncoder", "Java initEncode: " + this.type + " : " + i2 + " x " + i3 + ". @ " + i4 + " kbps. Fps: " + i5 + " key interval: " + i6 + "s. Encode from texture : " + z);
        this.width = i2;
        this.height = i3;
        this.adjusted_kbps = i4;
        if (this.mediaCodecThread == null) {
            if (i5 <= 0) {
                i5 = 1;
            }
            if (i6 <= 0) {
                i6 = 1;
            }
            VideoCodecType videoCodecType = VideoCodecType.values()[i];
            if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP8) {
                str = "video/x-vnd.on2.vp8";
                String[] strArr = supportedVp8HwCodecPrefixes;
                if (z) {
                    iArr3 = supportedSurfaceColorList;
                } else {
                    iArr3 = supportedColorList;
                }
                encoderProperties = findHwEncoder("video/x-vnd.on2.vp8", strArr, iArr3);
            } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP9) {
                str = "video/x-vnd.on2.vp9";
                String[] strArr2 = supportedH264HwCodecPrefixes;
                if (z) {
                    iArr2 = supportedSurfaceColorList;
                } else {
                    iArr2 = supportedColorList;
                }
                encoderProperties = findHwEncoder("video/x-vnd.on2.vp9", strArr2, iArr2);
            } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_H264) {
                str = "video/avc";
                String[] strArr3 = supportedH264HwCodecPrefixes;
                if (z) {
                    iArr = supportedSurfaceColorList;
                } else {
                    iArr = supportedColorList;
                }
                encoderProperties = findHwEncoder("video/avc", strArr3, iArr);
            } else {
                encoderProperties = null;
                str = null;
            }
            if (encoderProperties != null) {
                runningInstance = this;
                this.colorFormat = encoderProperties.colorFormat;
                Logging.d("MediaCodecVideoEncoder", "Color format: " + this.colorFormat);
                this.mediaCodecThread = Thread.currentThread();
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i2, i3);
                if (!encoderProperties.supportedList) {
                    i7 = 66;
                }
                if (Build.VERSION.SDK_INT > 19 && i7 == 100) {
                    createVideoFormat.setInteger("profile", 8);
                    createVideoFormat.setInteger("level", 512);
                }
                createVideoFormat.setInteger("bitrate", i4 * 950);
                createVideoFormat.setInteger("color-format", encoderProperties.colorFormat);
                createVideoFormat.setInteger("frame-rate", i5);
                createVideoFormat.setInteger("i-frame-interval", i6);
                Logging.d("MediaCodecVideoEncoder", "  Format: " + createVideoFormat);
                this.mediaCodec = createByCodecName(encoderProperties.codecName);
                this.type = videoCodecType;
                if (this.mediaCodec != null) {
                    this.mediaCodec.configure(createVideoFormat, null, null, 1);
                    return true;
                }
                throw new RuntimeException("Can not create media encoder");
            }
            throw new RuntimeException("Can not find HW encoder for " + videoCodecType);
        }
        throw new RuntimeException("Forgot to release()?");
    }

    /* access modifiers changed from: package-private */
    public boolean encodeTexture(boolean z, int i, int i2, float[] fArr, int i3, int i4, int i5, int i6, long j) {
        int i7 = i5;
        int i8 = i6;
        checkOnMediaCodecThread();
        if (z) {
            try {
                Logging.d("MediaCodecVideoEncoder", "Sync frame request");
                Bundle bundle = new Bundle();
                bundle.putInt("request-sync", 0);
                this.mediaCodec.setParameters(bundle);
            } catch (RuntimeException e2) {
                Logging.e("MediaCodecVideoEncoder", "encodeTexture failed", e2);
                return false;
            }
        }
        Logging.d("MediaCodecVideoEncoder", "enter encodeTexture:" + i3 + "x" + i4 + "->" + this.width + "x" + this.height);
        this.eglBase.makeCurrent();
        GLES20.glClear(16384);
        if (i2 == 10) {
            if (i7 == this.width || i8 == this.height) {
                this.drawer.drawRgb(i, fArr, 0, 0, i3, i4, this.width, this.height);
            } else {
                this.drawer.drawRgb(i, fArr, 0, 0, i3, i4, this.width, this.height, i5, i6);
            }
        } else if (i7 == this.width || i8 == this.height) {
            this.drawer.drawOes(i, fArr, 0, 0, i3, i4, this.width, this.height);
        } else {
            this.drawer.drawOes(i, fArr, 0, 0, i3, i4, this.width, this.height, i5, i6);
        }
        this.eglBase.swapBuffers();
        return true;
    }
}
