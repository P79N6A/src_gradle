package com.ss.android.ugc.aweme.live.alphaplayer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.live.alphaplayer.d;
import com.ss.android.ugc.aweme.live.alphaplayer.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53283a = null;

    /* renamed from: b  reason: collision with root package name */
    private static String f53284b = "VideoRender";
    private static int s = 36197;

    /* renamed from: c  reason: collision with root package name */
    private float[] f53285c = {-1.0f, -1.0f, 0.0f, 0.5f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: d  reason: collision with root package name */
    private FloatBuffer f53286d;

    /* renamed from: e  reason: collision with root package name */
    private final String f53287e = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* renamed from: f  reason: collision with root package name */
    private final String f53288f = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  vec4 color2Map = vec4(1.0, 1.0, 1.0, 1.0);\n  if (vTextureCoord.x >= 0.5) {\n     color2Map = texture2D(sTexture, vec2(vTextureCoord.x - 0.5, vTextureCoord.y));\n     gl_FragColor = vec4(color.r, color.g, color.b, color2Map.g);\n  } else {\n     gl_FragColor = vec4(color.r, color.g, color.b, color.a);\n  }\n}\n";
    private String g = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  vec4 color2Map = vec4(1.0, 1.0, 1.0, 1.0);\n  if (vTextureCoord.x >= 0.5) {\n     color2Map = texture2D(sTexture, vec2(vTextureCoord.x - 0.5, vTextureCoord.y));\n     gl_FragColor = vec4(color.r, color.g, color.b, color2Map.g);\n  } else {\n     gl_FragColor = vec4(color.r, color.g, color.b, color.a);\n  }\n}\n";
    private float[] h = new float[16];
    private float[] i = new float[16];
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private SurfaceTexture p;
    private AtomicBoolean q = new AtomicBoolean(false);
    private AtomicInteger r = new AtomicInteger(0);
    private i.a t;
    private e u;
    private d.a v = d.a.ScaleAspectFill;

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.k$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53289a = new int[d.a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.android.ugc.aweme.live.alphaplayer.d$a[] r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53289a = r0
                int[] r0 = f53289a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.ScaleToFill     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f53289a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.ScaleAspectFitCenter     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f53289a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.ScaleAspectFill     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f53289a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.TopFill     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f53289a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.BottomFill     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f53289a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.LeftFill     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f53289a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.RightFill     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f53289a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.TopFit     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f53289a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.BottomFit     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f53289a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.LeftFit     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f53289a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.RightFit     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.k.AnonymousClass1.<clinit>():void");
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53283a, false, 55582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53283a, false, 55582, new Class[0], Void.TYPE);
            return;
        }
        this.r.set(2);
        this.u.a();
    }

    public final void a(d.a aVar) {
        this.v = aVar;
    }

    public final void a(i.a aVar) {
        this.t = aVar;
    }

    public final void a(String str) {
        this.g = str;
    }

    private void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f53283a, false, 55585, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f53283a, false, 55585, new Class[]{String.class}, Void.TYPE);
            return;
        }
        GLES20.glGetError();
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f53283a, false, 55581, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f53283a, false, 55581, new Class[]{SurfaceTexture.class}, Void.TYPE);
            return;
        }
        this.q.compareAndSet(false, true);
        this.u.a();
    }

    k(e eVar) {
        this.u = eVar;
        this.f53286d = ByteBuffer.allocateDirect(this.f53285c.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f53286d.put(this.f53285c).position(0);
        Matrix.setIdentityM(this.i, 0);
    }

    public final void a(GL10 gl10) {
        if (PatchProxy.isSupport(new Object[]{gl10}, this, f53283a, false, 55576, new Class[]{GL10.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gl10}, this, f53283a, false, 55576, new Class[]{GL10.class}, Void.TYPE);
            return;
        }
        if (this.q.compareAndSet(true, false)) {
            this.p.updateTexImage();
            this.p.getTransformMatrix(this.i);
        }
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.r.get() > 0) {
            this.r.decrementAndGet();
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUseProgram(this.j);
        b("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(s, this.k);
        this.f53286d.position(0);
        GLES20.glVertexAttribPointer(this.n, 3, 5126, false, 20, this.f53286d);
        b("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.n);
        b("glEnableVertexAttribArray aPositionHandle");
        this.f53286d.position(3);
        GLES20.glVertexAttribPointer(this.o, 3, 5126, false, 20, this.f53286d);
        b("glVertexAttribPointer aTextureHandle");
        GLES20.glEnableVertexAttribArray(this.o);
        b("glEnableVertexAttribArray aTextureHandle");
        Matrix.setIdentityM(this.h, 0);
        GLES20.glUniformMatrix4fv(this.l, 1, false, this.h, 0);
        GLES20.glUniformMatrix4fv(this.m, 1, false, this.i, 0);
        GLES20.glDrawArrays(5, 0, 4);
        b("glDrawArrays");
        GLES20.glFinish();
    }

    private int a(int i2, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, this, f53283a, false, 55583, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, this, f53283a, false, 55583, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
        }
        int glCreateShader = GLES20.glCreateShader(i2);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str2);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteShader(glCreateShader);
                glCreateShader = 0;
            }
        }
        return glCreateShader;
    }

    public final void a(GL10 gl10, EGLConfig eGLConfig) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{gl10, eGLConfig}, this, f53283a, false, 55579, new Class[]{GL10.class, EGLConfig.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gl10, eGLConfig}, this, f53283a, false, 55579, new Class[]{GL10.class, EGLConfig.class}, Void.TYPE);
            return;
        }
        String str = this.g;
        if (PatchProxy.isSupport(new Object[]{"uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", str}, this, f53283a, false, 55584, new Class[]{String.class, String.class}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{"uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", str}, this, f53283a, false, 55584, new Class[]{String.class, String.class}, Integer.TYPE)).intValue();
        } else {
            int a2 = a(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
            if (a2 != 0) {
                int a3 = a(35632, str);
                if (a3 != 0) {
                    int glCreateProgram = GLES20.glCreateProgram();
                    if (glCreateProgram != 0) {
                        GLES20.glAttachShader(glCreateProgram, a2);
                        b("glAttachShader");
                        GLES20.glAttachShader(glCreateProgram, a3);
                        b("glAttachShader");
                        GLES20.glLinkProgram(glCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                        if (iArr[0] != 1) {
                            GLES20.glDeleteProgram(glCreateProgram);
                            glCreateProgram = 0;
                        }
                    }
                    i2 = glCreateProgram;
                }
            }
            i2 = 0;
        }
        this.j = i2;
        if (this.j != 0) {
            this.n = GLES20.glGetAttribLocation(this.j, "aPosition");
            b("glGetAttribLocation aPosition");
            if (this.n != -1) {
                this.o = GLES20.glGetAttribLocation(this.j, "aTextureCoord");
                b("glGetAttribLocation aTextureCoord");
                if (this.o != -1) {
                    this.l = GLES20.glGetUniformLocation(this.j, "uMVPMatrix");
                    b("glGetUniformLocation uMVPMatrix");
                    if (this.l != -1) {
                        this.m = GLES20.glGetUniformLocation(this.j, "uSTMatrix");
                        b("glGetUniformLocation uSTMatrix");
                        if (this.m != -1) {
                            if (PatchProxy.isSupport(new Object[0], this, f53283a, false, 55580, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f53283a, false, 55580, new Class[0], Void.TYPE);
                                return;
                            }
                            int[] iArr2 = new int[1];
                            GLES20.glGenTextures(1, iArr2, 0);
                            this.k = iArr2[0];
                            GLES20.glBindTexture(s, this.k);
                            b("glBindTexture textureID");
                            GLES20.glTexParameterf(s, 10241, 9728.0f);
                            GLES20.glTexParameterf(s, 10240, 9729.0f);
                            this.p = new SurfaceTexture(this.k);
                            if (Build.VERSION.SDK_INT >= 15) {
                                this.p.setDefaultBufferSize(this.u.getMeasuredWidth(), this.u.getMeasuredHeight());
                            }
                            this.p.setOnFrameAvailableListener(this);
                            Surface surface = new Surface(this.p);
                            if (this.t != null) {
                                this.t.a(surface);
                            }
                            this.q.compareAndSet(true, false);
                            return;
                        }
                        throw new RuntimeException("Could not get attrib location for uSTMatrix");
                    }
                    throw new RuntimeException("Could not get attrib location for uMVPMatrix");
                }
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
    }

    public final void a(GL10 gl10, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{gl10, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53283a, false, 55578, new Class[]{GL10.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gl10, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53283a, false, 55578, new Class[]{GL10.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        GLES20.glViewport(0, 0, i2, i3);
    }

    private static float[] b(float f2, float f3, float f4, float f5) {
        float f6 = (f2 * 2.0f) - 4.0f;
        float f7 = (f5 * 2.0f) - 4.0f;
        float f8 = 1.0f - (f4 * 2.0f);
        float f9 = 1.0f - (f3 * 2.0f);
        return new float[]{f6, f7, 0.0f, 0.5f, 0.0f, f8, f7, 0.0f, 1.0f, 0.0f, f6, f9, 0.0f, 0.5f, 1.0f, f8, f9, 0.0f, 1.0f, 1.0f};
    }

    private static float[] c(float f2, float f3, float f4, float f5) {
        float f6 = (f2 / 2.0f) + 0.5f;
        float f7 = f5 + 0.0f;
        float f8 = 1.0f - (f4 / 2.0f);
        float f9 = 1.0f - f3;
        return new float[]{-1.0f, -1.0f, 0.0f, f6, f7, 1.0f, -1.0f, 0.0f, f8, f7, -1.0f, 1.0f, 0.0f, f6, f9, 1.0f, 1.0f, 0.0f, f8, f9};
    }

    public final void a(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f53283a, false, 55575, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f53283a, false, 55575, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        float f9 = 0.0f;
        if (f2 > 0.0f && f3 > 0.0f && f4 > 0.0f && f5 > 0.0f) {
            float f10 = f2 / f3;
            float f11 = f4 / f5;
            if (f10 > f11) {
                f6 = (1.0f - (f3 / (f2 / f11))) / 2.0f;
                f7 = 0.0f;
            } else {
                f7 = (1.0f - (f2 / (f3 * f11))) / 2.0f;
                f6 = 0.0f;
            }
            switch (AnonymousClass1.f53289a[this.v.ordinal()]) {
                case 1:
                    this.f53285c = c(0.0f, 0.0f, 0.0f, 0.0f);
                    break;
                case 2:
                    if (f10 > f11) {
                        f9 = (1.0f - ((f3 * f11) / f2)) / 2.0f;
                        f8 = 0.0f;
                    } else {
                        f8 = (1.0f - ((f2 / f11) / f3)) / 2.0f;
                    }
                    this.f53285c = b(f9, f8, f9, f8);
                    break;
                case 3:
                    this.f53285c = c(f7, f6, f7, f6);
                    break;
                case 4:
                    this.f53285c = c(f7, 0.0f, f7, f6 * 2.0f);
                    break;
                case 5:
                    this.f53285c = c(f7, f6 * 2.0f, f7, 0.0f);
                    break;
                case 6:
                    this.f53285c = c(0.0f, f6, f7 * 2.0f, f6);
                    break;
                case e.l:
                    this.f53285c = c(f7 * 2.0f, f6, 0.0f, f6);
                    break;
                case 8:
                    this.f53285c = b(0.0f, 0.0f, 0.0f, ((1.0f - ((f2 / f11) / f3)) / 2.0f) * 2.0f);
                    break;
                case 9:
                    this.f53285c = b(0.0f, ((1.0f - ((f2 / f11) / f3)) / 2.0f) * 2.0f, 0.0f, 0.0f);
                    break;
                case 10:
                    this.f53285c = b(0.0f, 0.0f, ((1.0f - ((f3 * f11) / f2)) / 2.0f) * 2.0f, 0.0f);
                    break;
                case 11:
                    this.f53285c = b(((1.0f - ((f3 * f11) / f2)) / 2.0f) * 2.0f, 0.0f, 0.0f, 0.0f);
                    break;
            }
            this.f53286d = ByteBuffer.allocateDirect(this.f53285c.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f53286d.put(this.f53285c).position(0);
        }
    }
}
