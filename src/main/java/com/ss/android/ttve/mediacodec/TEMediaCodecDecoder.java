package com.ss.android.ttve.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.support.annotation.Keep;
import android.view.Surface;
import com.ss.android.ttve.common.b;
import com.ss.android.ttve.common.f;
import com.ss.android.ttve.common.i;
import com.ss.android.vesdk.y;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

@Keep
@SuppressLint({"NewApi"})
public class TEMediaCodecDecoder implements SurfaceTexture.OnFrameAvailableListener {
    private final int MAX_DELAY_COUNT = 10;
    private final long MAX_SLEEP_MS = 0;
    private boolean m_bIsNeedReconfigure;
    private MediaCodec.BufferInfo m_bufferInfo = new MediaCodec.BufferInfo();
    private MediaCodec m_decoder = null;
    private boolean m_decoderStarted = false;
    private b m_eglStateSaver = null;
    private ByteBuffer m_extraDataBuf;
    private MediaFormat m_format;
    private boolean m_frameAvailable = false;
    private final Object m_frameSyncObject = new Object();
    private int m_iCurCount = 0;
    private int m_iHeight;
    private int m_iOutputHeight;
    private int m_iOutputWidth;
    private int m_iWidth;
    private boolean m_inputBufferQueued = false;
    private int m_pendingInputFrameCount = 0;
    private ByteBuffer m_ppsBuf;
    private boolean m_sawInputEOS = false;
    private boolean m_sawOutputEOS = false;
    private f m_sharedContext = null;
    private ByteBuffer m_spsBuf;
    private Surface m_surface;
    private int[] m_surfaceTexID = new int[1];
    private SurfaceTexture m_surfaceTexture;
    private i m_textureDrawer = null;
    private a m_textureRender = null;
    private long m_timestampOfCurTexFrame = Long.MIN_VALUE;
    private long m_timestampOfLastDecodedFrame = Long.MIN_VALUE;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final float[] f31195a = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

        /* renamed from: b  reason: collision with root package name */
        FloatBuffer f31196b = ByteBuffer.allocateDirect(this.f31195a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();

        /* renamed from: c  reason: collision with root package name */
        float[] f31197c = new float[16];

        /* renamed from: d  reason: collision with root package name */
        float[] f31198d = new float[16];

        /* renamed from: e  reason: collision with root package name */
        int f31199e;

        /* renamed from: f  reason: collision with root package name */
        int f31200f;
        int g;
        int h;
        int i;
        int[] j = new int[1];

        public static void a() {
            do {
            } while (GLES20.glGetError() != 0);
        }

        public a(SurfaceTexture surfaceTexture) {
            this.f31196b.put(this.f31195a).position(0);
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.f31198d);
            } else {
                Matrix.setIdentityM(this.f31198d, 0);
            }
        }

        /* access modifiers changed from: package-private */
        public int a(int i2, String str) {
            int glCreateShader = GLES20.glCreateShader(i2);
            new StringBuilder("glCreateShader type=").append(i2);
            a();
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
    }

    private boolean IsValid() {
        if (this.m_decoder != null) {
            return true;
        }
        return false;
    }

    private int restartDecoder() {
        stopDecoder();
        return startDecoder();
    }

    private boolean AwaitNewImage() {
        synchronized (this.m_frameSyncObject) {
            do {
                if (!this.m_frameAvailable) {
                    try {
                        this.m_frameSyncObject.wait(500);
                    } catch (InterruptedException unused) {
                        return false;
                    }
                } else {
                    this.m_frameAvailable = false;
                    return true;
                }
            } while (this.m_frameAvailable);
            return false;
        }
    }

    private void deleteTexture() {
        if (this.m_surfaceTexID[0] != 0) {
            GLES20.glDeleteTextures(1, this.m_surfaceTexID, 0);
            this.m_surfaceTexID[0] = 0;
        }
    }

    public int closeEncoder() {
        stopDecoder();
        if (this.m_textureDrawer != null) {
            this.m_textureDrawer.b();
            this.m_textureDrawer = null;
        }
        deleteTexture();
        return 0;
    }

    public static boolean IsInAndriodHardwareBlacklist() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str.compareTo("Meizu") == 0 && str2.compareTo("m2") == 0) {
            return true;
        }
        if (str.compareTo("Xiaomi") == 0 && str2.compareTo("MI 4W") == 0) {
            return true;
        }
        return false;
    }

    public static boolean IsInAndriodHardwareWhitelist() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str.compareTo("samsung") == 0 && str2.compareTo("GT-I9152") == 0) {
            return true;
        }
        if (str.compareTo("HUAWEI") == 0 && str2.compareTo("HUAWEI P6-C00") == 0) {
            return true;
        }
        return false;
    }

    private int createTexture() {
        GLES20.glGenTextures(1, this.m_surfaceTexID, 0);
        if (this.m_surfaceTexID[0] <= 0) {
            return 0;
        }
        GLES20.glBindTexture(36197, this.m_surfaceTexID[0]);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return this.m_surfaceTexID[0];
    }

    private int stopDecoder() {
        CleanupDecoder();
        if (this.m_textureRender != null) {
            a aVar = this.m_textureRender;
            if (aVar.f31199e != 0) {
                GLES20.glDeleteProgram(aVar.f31199e);
                aVar.f31199e = 0;
            }
            if (aVar.j[0] != 0) {
                GLES20.glDeleteFramebuffers(1, aVar.j, 0);
            }
            this.m_textureRender = null;
        }
        if (this.m_surface != null) {
            this.m_surface.release();
            this.m_surface = null;
        }
        if (this.m_surfaceTexture != null) {
            this.m_surfaceTexture.setOnFrameAvailableListener(null);
            this.m_surfaceTexture.release();
            this.m_surfaceTexture = null;
        }
        return 0;
    }

    public void CleanupDecoder() {
        if (this.m_decoder != null) {
            if (this.m_decoderStarted) {
                try {
                    if (this.m_inputBufferQueued) {
                        this.m_decoder.flush();
                        this.m_inputBufferQueued = false;
                    }
                    this.m_decoder.stop();
                } catch (Exception unused) {
                }
                this.m_decoderStarted = false;
            }
            this.m_decoder.release();
            this.m_decoder = null;
        }
        this.m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
        this.m_timestampOfCurTexFrame = Long.MIN_VALUE;
        this.m_pendingInputFrameCount = 0;
        this.m_sawInputEOS = false;
        this.m_sawOutputEOS = false;
    }

    public int flushDecoder() {
        if (this.m_decoder != null) {
            try {
                if (!this.m_sawInputEOS) {
                    if (!this.m_sawOutputEOS) {
                        if (this.m_inputBufferQueued) {
                            this.m_decoder.flush();
                            this.m_inputBufferQueued = false;
                            this.m_pendingInputFrameCount = 0;
                            return 0;
                        }
                    }
                }
                CleanupDecoder();
                if (!SetupDecoder("video/avc")) {
                    return -2;
                }
                return 0;
            } catch (Exception unused) {
            }
        }
        return -3;
    }

    public boolean initTextureDrawer() {
        if (this.m_textureDrawer != null) {
            this.m_textureDrawer.b();
            this.m_textureDrawer = null;
        }
        this.m_textureDrawer = i.a();
        if (this.m_textureDrawer == null) {
            return false;
        }
        this.m_textureDrawer.a(0.0f);
        this.m_textureDrawer.a(1.0f, -1.0f);
        return true;
    }

    private int reconfigureMediaFormat() {
        MediaCodecInfo mediaCodecInfo;
        int i = 0;
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                mediaCodecInfo = getMediaCodecInfo21("video/avc");
            } else {
                mediaCodecInfo = getMediaCodecInfo("video/avc");
            }
            if (mediaCodecInfo == null) {
                y.d("TEMediaCodecDecoder", "MediaCodecInfo is null!");
                return -2;
            } else if (!mediaCodecInfo.getCapabilitiesForType("video/avc").getVideoCapabilities().isSizeSupported(this.m_iWidth, this.m_iHeight)) {
                y.d("TEMediaCodecDecoder", "is not size support! width: " + this.m_iWidth + " height: " + this.m_iHeight);
                return -3;
            } else {
                this.m_format = MediaFormat.createVideoFormat("video/avc", this.m_iWidth, this.m_iHeight);
                if (this.m_spsBuf != null) {
                    this.m_format.setByteBuffer("csd-0", this.m_spsBuf);
                }
                if (this.m_ppsBuf != null) {
                    this.m_format.setByteBuffer("csd-1", this.m_ppsBuf);
                }
                if (Build.VERSION.SDK_INT == 16) {
                    this.m_format.setInteger("max-input-size", 0);
                }
                return i;
            }
        } catch (Exception unused) {
            i = -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int startDecoder() {
        /*
            r7 = this;
            boolean r0 = r7.IsValid()
            r1 = -1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            int[] r0 = r7.m_surfaceTexID
            r2 = 0
            r0 = r0[r2]
            if (r0 != 0) goto L_0x0013
            int r0 = r7.createTexture()
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            return r1
        L_0x0016:
            android.graphics.SurfaceTexture r3 = new android.graphics.SurfaceTexture     // Catch:{ Exception -> 0x00fd }
            r3.<init>(r0)     // Catch:{ Exception -> 0x00fd }
            r7.m_surfaceTexture = r3     // Catch:{ Exception -> 0x00fd }
            android.graphics.SurfaceTexture r0 = r7.m_surfaceTexture     // Catch:{ Exception -> 0x00fd }
            r0.setOnFrameAvailableListener(r7)     // Catch:{ Exception -> 0x00fd }
            android.view.Surface r0 = new android.view.Surface     // Catch:{ Exception -> 0x00fd }
            android.graphics.SurfaceTexture r3 = r7.m_surfaceTexture     // Catch:{ Exception -> 0x00fd }
            r0.<init>(r3)     // Catch:{ Exception -> 0x00fd }
            r7.m_surface = r0     // Catch:{ Exception -> 0x00fd }
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$a r0 = new com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$a
            android.graphics.SurfaceTexture r3 = r7.m_surfaceTexture
            r0.<init>(r3)
            r7.m_textureRender = r0
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$a r0 = r7.m_textureRender
            java.lang.String r3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"
            java.lang.String r4 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"
            r5 = 35633(0x8b31, float:4.9932E-41)
            int r3 = r0.a(r5, r3)
            r5 = 1
            if (r3 != 0) goto L_0x0046
        L_0x0044:
            r6 = 0
            goto L_0x0076
        L_0x0046:
            r6 = 35632(0x8b30, float:4.9931E-41)
            int r4 = r0.a(r6, r4)
            if (r4 != 0) goto L_0x0050
            goto L_0x0044
        L_0x0050:
            int r6 = android.opengl.GLES20.glCreateProgram()
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.a.a()
            android.opengl.GLES20.glAttachShader(r6, r3)
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.a.a()
            android.opengl.GLES20.glAttachShader(r6, r4)
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.a.a()
            android.opengl.GLES20.glLinkProgram(r6)
            int[] r3 = new int[r5]
            r4 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r6, r4, r3, r2)
            r3 = r3[r2]
            if (r3 == r5) goto L_0x0076
            android.opengl.GLES20.glDeleteProgram(r6)
            goto L_0x0044
        L_0x0076:
            r0.f31199e = r6
            int r3 = r0.f31199e
            if (r3 == 0) goto L_0x00f5
            int r3 = r0.f31199e
            java.lang.String r4 = "aPosition"
            int r3 = android.opengl.GLES20.glGetAttribLocation(r3, r4)
            r0.h = r3
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.a.a()
            int r3 = r0.h
            if (r3 == r1) goto L_0x00ed
            int r3 = r0.f31199e
            java.lang.String r4 = "aTextureCoord"
            int r3 = android.opengl.GLES20.glGetAttribLocation(r3, r4)
            r0.i = r3
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.a.a()
            int r3 = r0.i
            if (r3 == r1) goto L_0x00e5
            int r3 = r0.f31199e
            java.lang.String r4 = "uMVPMatrix"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r4)
            r0.f31200f = r3
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.a.a()
            int r3 = r0.f31200f
            if (r3 == r1) goto L_0x00dd
            int r3 = r0.f31199e
            java.lang.String r4 = "uSTMatrix"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r4)
            r0.g = r3
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.a.a()
            int r3 = r0.g
            if (r3 == r1) goto L_0x00d5
            int[] r0 = r0.j
            android.opengl.GLES20.glGenFramebuffers(r5, r0, r2)
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.a.a()
            java.lang.String r0 = "video/avc"
            boolean r0 = r7.SetupDecoder(r0)
            if (r0 != 0) goto L_0x00d4
            r7.stopDecoder()
            return r1
        L_0x00d4:
            return r2
        L_0x00d5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not get attrib location for uSTMatrix"
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not get attrib location for uMVPMatrix"
            r0.<init>(r1)
            throw r0
        L_0x00e5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not get attrib location for aTextureCoord"
            r0.<init>(r1)
            throw r0
        L_0x00ed:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not get attrib location for aPosition"
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "failed creating program"
            r0.<init>(r1)
            throw r0
        L_0x00fd:
            r7.stopDecoder()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.startDecoder():int");
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.m_frameSyncObject) {
            this.m_frameAvailable = true;
            this.m_frameSyncObject.notifyAll();
        }
    }

    private boolean SetupDecoder(String str) {
        try {
            this.m_decoder = MediaCodec.createDecoderByType(str);
            this.m_decoder.configure(this.m_format, this.m_surface, null, 0);
            this.m_decoder.start();
            this.m_decoderStarted = true;
            this.m_iCurCount = 0;
            return true;
        } catch (Exception unused) {
            CleanupDecoder();
            return false;
        }
    }

    private ByteBuffer getInputBufferByIdx(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.m_decoder.getInputBuffer(i);
        }
        return this.m_decoder.getInputBuffers()[i];
    }

    private MediaCodecInfo getMediaCodecInfo(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(str)) {
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
    private MediaCodecInfo getMediaCodecInfo21(String str) {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos == null || codecInfos.length == 0) {
            return null;
        }
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                String name = mediaCodecInfo.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                            return mediaCodecInfo;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public int getInfoByFlag(int[] iArr, int i) {
        if (i == 1) {
            iArr[0] = (int) (this.m_timestampOfLastDecodedFrame & -1);
            iArr[1] = (int) (-1 & (this.m_timestampOfLastDecodedFrame >> 32));
            return 2;
        } else if (i != 2) {
            return 0;
        } else {
            iArr[0] = (int) (this.m_timestampOfCurTexFrame & -1);
            iArr[1] = (int) (-1 & (this.m_timestampOfCurTexFrame >> 32));
            return 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x006c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int DecodeFrame2Surface(byte[] r18, int r19, long r20) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r4 = r19
            boolean r1 = r0.m_sawInputEOS
            r8 = 1
            r9 = 0
            if (r1 != 0) goto L_0x005a
            android.media.MediaCodec r1 = r0.m_decoder
            r2 = 30000(0x7530, double:1.4822E-319)
            int r1 = r1.dequeueInputBuffer(r2)
            r5 = 0
        L_0x0013:
            if (r1 >= 0) goto L_0x0025
            r6 = 5
            java.lang.Thread.sleep(r6, r9)     // Catch:{ InterruptedException -> 0x001a }
        L_0x001a:
            android.media.MediaCodec r1 = r0.m_decoder
            int r1 = r1.dequeueInputBuffer(r2)
            int r5 = r5 + r8
            r6 = 20
            if (r5 < r6) goto L_0x0013
        L_0x0025:
            r11 = r1
            if (r11 < 0) goto L_0x0058
            java.nio.ByteBuffer r1 = r0.getInputBufferByIdx(r11)
            if (r4 != 0) goto L_0x003c
            android.media.MediaCodec r10 = r0.m_decoder
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 4
            r10.queueInputBuffer(r11, r12, r13, r14, r16)
            r0.m_sawInputEOS = r8
            goto L_0x005a
        L_0x003c:
            r1.clear()
            r2 = r18
            r1.put(r2, r9, r4)
            android.media.MediaCodec r1 = r0.m_decoder
            r3 = 0
            r7 = 0
            r2 = r11
            r4 = r19
            r5 = r20
            r1.queueInputBuffer(r2, r3, r4, r5, r7)
            r0.m_inputBufferQueued = r8
            int r1 = r0.m_pendingInputFrameCount
            int r1 = r1 + r8
            r0.m_pendingInputFrameCount = r1
            goto L_0x005a
        L_0x0058:
            r1 = 1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            boolean r2 = r0.m_sawOutputEOS
            if (r2 == 0) goto L_0x0063
            r2 = 600000(0x927c0, float:8.40779E-40)
            goto L_0x006c
        L_0x0063:
            int r2 = r0.m_pendingInputFrameCount
            r3 = 2
            if (r2 <= r3) goto L_0x006b
            r2 = 30000(0x7530, float:4.2039E-41)
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            android.media.MediaCodec r3 = r0.m_decoder
            android.media.MediaCodec$BufferInfo r4 = r0.m_bufferInfo
            long r5 = (long) r2
            int r3 = r3.dequeueOutputBuffer(r4, r5)
            r4 = -3
            if (r3 == r4) goto L_0x006c
            r5 = 4
            r6 = -2
            if (r3 != r6) goto L_0x0108
            android.media.MediaCodec r3 = r0.m_decoder
            android.media.MediaFormat r3 = r3.getOutputFormat()
            java.lang.String r4 = "width"
            int r4 = r3.getInteger(r4)
            java.lang.String r6 = "height"
            int r6 = r3.getInteger(r6)
            java.lang.String r7 = "crop-left"
            int r7 = r3.getInteger(r7)
            java.lang.String r10 = "crop-right"
            int r10 = r3.getInteger(r10)
            java.lang.String r11 = "crop-top"
            int r11 = r3.getInteger(r11)
            java.lang.String r12 = "crop-bottom"
            int r3 = r3.getInteger(r12)
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$a r12 = r0.m_textureRender
            if (r4 <= 0) goto L_0x006c
            if (r6 <= 0) goto L_0x006c
            if (r3 < r11) goto L_0x006c
            if (r10 < r7) goto L_0x006c
            if (r10 > r4) goto L_0x006c
            if (r3 <= r6) goto L_0x00b5
            goto L_0x006c
        L_0x00b5:
            float[] r13 = r12.f31195a
            r14 = 3
            float r7 = (float) r7
            r15 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 * r15
            float r4 = (float) r4
            float r7 = r7 / r4
            r13[r14] = r7
            float[] r13 = r12.f31195a
            float r11 = (float) r11
            float r11 = r11 * r15
            float r6 = (float) r6
            float r11 = r11 / r6
            r13[r5] = r11
            float[] r5 = r12.f31195a
            r13 = 8
            float r10 = (float) r10
            float r10 = r10 * r15
            float r10 = r10 / r4
            r5[r13] = r10
            float[] r4 = r12.f31195a
            r5 = 9
            r4[r5] = r11
            float[] r4 = r12.f31195a
            r5 = 13
            r4[r5] = r7
            float[] r4 = r12.f31195a
            r5 = 14
            float r3 = (float) r3
            float r3 = r3 * r15
            float r3 = r3 / r6
            r4[r5] = r3
            float[] r4 = r12.f31195a
            r5 = 18
            r4[r5] = r10
            float[] r4 = r12.f31195a
            r5 = 19
            r4[r5] = r3
            java.nio.FloatBuffer r3 = r12.f31196b
            r3.clear()
            java.nio.FloatBuffer r3 = r12.f31196b
            float[] r4 = r12.f31195a
            java.nio.FloatBuffer r3 = r3.put(r4)
            r3.position(r9)
            goto L_0x006c
        L_0x0108:
            r2 = -1
            if (r3 == r2) goto L_0x0144
            if (r3 >= 0) goto L_0x010e
            return r6
        L_0x010e:
            android.media.MediaCodec$BufferInfo r1 = r0.m_bufferInfo
            int r1 = r1.flags
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0117
            r0.m_sawOutputEOS = r8
        L_0x0117:
            boolean r1 = r0.m_sawOutputEOS
            if (r1 != 0) goto L_0x0127
            android.media.MediaCodec$BufferInfo r1 = r0.m_bufferInfo
            long r4 = r1.presentationTimeUs
            r0.m_timestampOfLastDecodedFrame = r4
            int r1 = r0.m_pendingInputFrameCount
            int r1 = r1 - r8
            r0.m_pendingInputFrameCount = r1
            goto L_0x0128
        L_0x0127:
            r8 = 0
        L_0x0128:
            android.media.MediaCodec r1 = r0.m_decoder
            r1.releaseOutputBuffer(r3, r8)
            if (r8 == 0) goto L_0x0143
            boolean r1 = r17.AwaitNewImage()
            if (r1 == 0) goto L_0x0142
            android.media.MediaCodec$BufferInfo r1 = r0.m_bufferInfo
            long r1 = r1.presentationTimeUs
            r0.m_timestampOfCurTexFrame = r1
        L_0x013b:
            int r1 = android.opengl.GLES20.glGetError()
            if (r1 != 0) goto L_0x013b
            return r9
        L_0x0142:
            return r6
        L_0x0143:
            return r2
        L_0x0144:
            if (r1 == 0) goto L_0x0147
            return r4
        L_0x0147:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.DecodeFrame2Surface(byte[], int, long):int");
    }

    public int decodeFrame(byte[] bArr, int i, long j, int i2) throws IOException {
        int i3;
        int i4 = i2;
        if (this.m_eglStateSaver == null) {
            this.m_eglStateSaver = new b();
            this.m_eglStateSaver.a();
        }
        if (!EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.f31154a)) {
            this.m_bIsNeedReconfigure = true;
        }
        if (this.m_bIsNeedReconfigure) {
            restartDecoder();
            this.m_bIsNeedReconfigure = false;
            this.m_eglStateSaver.a();
        }
        if (this.m_decoder == null) {
            return -2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            i3 = DecodeFrame2Surface(bArr, i, j);
        } catch (IllegalStateException unused) {
            i3 = -2;
        }
        long currentTimeMillis2 = 0 - (System.currentTimeMillis() - currentTimeMillis);
        if (this.m_iCurCount < 10 && currentTimeMillis2 > 0) {
            try {
                Thread.sleep(currentTimeMillis2, 0);
            } catch (InterruptedException unused2) {
            }
            this.m_iCurCount++;
        }
        if (i3 == 0) {
            this.m_surfaceTexture.updateTexImage();
            if (this.m_textureRender != null && i4 > 0) {
                a aVar = this.m_textureRender;
                int i5 = this.m_iOutputWidth;
                int i6 = this.m_iOutputHeight;
                int i7 = this.m_surfaceTexID[0];
                GLES20.glViewport(0, 0, i5, i6);
                GLES20.glBindTexture(3553, i4);
                a.a();
                GLES20.glBindFramebuffer(36160, aVar.j[0]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i4, 0);
                a.a();
                a.a();
                GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
                GLES20.glUseProgram(aVar.f31199e);
                a.a();
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, i7);
                a.a();
                aVar.f31196b.position(0);
                GLES20.glVertexAttribPointer(aVar.h, 3, 5126, false, 20, aVar.f31196b);
                a.a();
                GLES20.glEnableVertexAttribArray(aVar.h);
                a.a();
                aVar.f31196b.position(3);
                GLES20.glVertexAttribPointer(aVar.i, 2, 5126, false, 20, aVar.f31196b);
                a.a();
                GLES20.glEnableVertexAttribArray(aVar.i);
                a.a();
                Matrix.setIdentityM(aVar.f31197c, 0);
                GLES20.glUniformMatrix4fv(aVar.f31200f, 1, false, aVar.f31197c, 0);
                GLES20.glUniformMatrix4fv(aVar.g, 1, false, aVar.f31198d, 0);
                GLES20.glDrawArrays(5, 0, 4);
                a.a();
                GLES20.glDisableVertexAttribArray(aVar.h);
                GLES20.glDisableVertexAttribArray(aVar.i);
                GLES20.glBindTexture(36197, 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glFinish();
            }
        }
        return i3;
    }

    public int initDecoder(int i, int i2, byte[] bArr, int i3, byte[] bArr2, int i4, int i5, int i6) {
        int encoder = setEncoder(i, i2, bArr, i3, bArr2, i4, i5, i6);
        if (this.m_bIsNeedReconfigure) {
            encoder = reconfigureMediaFormat();
        }
        if (encoder != 0) {
            return encoder;
        }
        if (this.m_eglStateSaver == null) {
            this.m_eglStateSaver = new b();
            this.m_eglStateSaver.a();
        }
        if (this.m_bIsNeedReconfigure) {
            restartDecoder();
            this.m_bIsNeedReconfigure = false;
        }
        return encoder;
    }

    public int setEncoder(int i, int i2, byte[] bArr, int i3, byte[] bArr2, int i4, int i5, int i6) {
        this.m_iWidth = i;
        this.m_iHeight = i2;
        this.m_iOutputWidth = i5;
        this.m_iOutputHeight = i6;
        this.m_spsBuf = null;
        this.m_ppsBuf = null;
        if (i3 > 0) {
            this.m_spsBuf = ByteBuffer.wrap(bArr, 0, i3);
        }
        if (i4 > 0) {
            this.m_ppsBuf = ByteBuffer.wrap(bArr2, 0, i4);
        }
        this.m_bIsNeedReconfigure = true;
        return 0;
    }
}
