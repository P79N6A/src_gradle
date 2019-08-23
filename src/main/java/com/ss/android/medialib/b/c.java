package com.ss.android.medialib.b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import android.support.annotation.NonNull;
import com.bef.effectsdk.OpenGLUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.NativePort.NativeRenderWrapper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class c implements GLSurfaceView.Renderer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29385a;

    /* renamed from: b  reason: collision with root package name */
    public NativeRenderWrapper f29386b = new NativeRenderWrapper();

    /* renamed from: c  reason: collision with root package name */
    public boolean f29387c;

    /* renamed from: d  reason: collision with root package name */
    public a f29388d;

    /* renamed from: e  reason: collision with root package name */
    public b f29389e;

    /* renamed from: f  reason: collision with root package name */
    public C0356c f29390f = new C0356c((byte) 0);
    private Bitmap g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private b n = new b();
    private float[] o = new float[16];
    private int p;
    private int q;

    public interface a {
        void a(int i, int i2, ByteBuffer byteBuffer);
    }

    public interface b {
        void a();
    }

    /* renamed from: com.ss.android.medialib.b.c$c  reason: collision with other inner class name */
    public static class C0356c {

        /* renamed from: a  reason: collision with root package name */
        public String f29391a;

        /* renamed from: b  reason: collision with root package name */
        public float f29392b;

        /* renamed from: c  reason: collision with root package name */
        public String f29393c;

        /* renamed from: d  reason: collision with root package name */
        public float f29394d;

        private C0356c() {
            this.f29391a = "";
            this.f29392b = -1.0f;
            this.f29393c = "";
        }

        /* synthetic */ C0356c(byte b2) {
            this();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f29385a, false, 17420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29385a, false, 17420, new Class[0], Void.TYPE);
            return;
        }
        NativeRenderWrapper nativeRenderWrapper = this.f29386b;
        if (PatchProxy.isSupport(new Object[0], nativeRenderWrapper, NativeRenderWrapper.f29324a, false, 16586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], nativeRenderWrapper, NativeRenderWrapper.f29324a, false, 16586, new Class[0], Void.TYPE);
        } else if (nativeRenderWrapper.f29325b != 0) {
            nativeRenderWrapper.nativeDestroy(nativeRenderWrapper.f29325b);
            nativeRenderWrapper.f29325b = 0;
        }
        this.l = 0;
        this.k = 0;
        this.j = true;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29385a, false, 17426, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29385a, false, 17426, new Class[0], Void.TYPE);
            return;
        }
        float f2 = ((float) this.h) / ((float) this.i);
        float f3 = ((float) this.p) / ((float) this.q);
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        if (this.p > this.q) {
            if (f2 > f3) {
                Matrix.orthoM(fArr, 0, -1.0f, 1.0f, (-f3) * f2, f3 * f2, 3.0f, 5.0f);
            } else {
                Matrix.orthoM(fArr, 0, (-f3) / f2, f3 / f2, -1.0f, 1.0f, 3.0f, 5.0f);
            }
        } else if (f2 > f3) {
            Matrix.orthoM(fArr, 0, -1.0f, 1.0f, (-1.0f / f3) * f2, (1.0f / f3) * f2, 3.0f, 5.0f);
        } else {
            Matrix.orthoM(fArr, 0, (-f3) / f2, f3 / f2, -1.0f, 1.0f, 3.0f, 5.0f);
        }
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.o, 0, fArr, 0, fArr2, 0);
        this.n.g = this.o;
    }

    public final void a(@NonNull Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{bitmap}, this, f29385a, false, 17416, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap}, this, f29385a, false, 17416, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        this.g = bitmap;
        this.h = this.g.getWidth();
        this.i = this.g.getHeight();
        if (this.p > 0 && this.q > 0) {
            b();
        }
        this.j = true;
    }

    public final void onDrawFrame(GL10 gl10) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{gl10}, this, f29385a, false, 17423, new Class[]{GL10.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gl10}, this, f29385a, false, 17423, new Class[]{GL10.class}, Void.TYPE);
        } else if (this.g != null && !this.g.isRecycled()) {
            if (this.j) {
                b bVar = this.n;
                if (PatchProxy.isSupport(new Object[0], bVar, b.f29379a, false, 17414, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], bVar, b.f29379a, false, 17414, new Class[0], Void.TYPE);
                } else {
                    bVar.f29380b = OpenGLUtils.loadProgram("attribute vec4 vPosition;\nattribute vec2 vCoordinate;\nuniform mat4 vMatrix;\nvarying vec2 aCoordinate;\n\nvoid main(){\n    gl_Position=vMatrix*vPosition;\n    aCoordinate=vCoordinate;\n}", "precision mediump float;\nvarying vec2 aCoordinate;\nuniform sampler2D s_texture;\nvoid main() {\n    gl_FragColor = texture2D(s_texture, aCoordinate);\n}");
                    bVar.f29381c = GLES20.glGetAttribLocation(bVar.f29380b, "vPosition");
                    bVar.f29382d = GLES20.glGetAttribLocation(bVar.f29380b, "vCoordinate");
                    bVar.f29383e = GLES20.glGetUniformLocation(bVar.f29380b, "s_texture");
                    bVar.f29384f = GLES20.glGetUniformLocation(bVar.f29380b, "vMatrix");
                }
                int[] iArr = new int[1];
                if (this.k == 0) {
                    if (PatchProxy.isSupport(new Object[0], this, f29385a, false, 17424, new Class[0], Integer.TYPE)) {
                        i3 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29385a, false, 17424, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        int[] iArr2 = new int[1];
                        GLES20.glGenFramebuffers(1, iArr2, 0);
                        i3 = iArr2[0];
                    }
                    this.k = i3;
                }
                this.m = OpenGLUtils.initEffectTexture(this.h, this.i, iArr, 3553);
                GLES20.glBindFramebuffer(36160, this.k);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.m, 0);
                GLES20.glBindFramebuffer(36160, 0);
                if (PatchProxy.isSupport(new Object[0], this, f29385a, false, 17427, new Class[0], Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29385a, false, 17427, new Class[0], Integer.TYPE)).intValue();
                } else {
                    int[] iArr3 = new int[1];
                    GLES20.glGenTextures(1, iArr3, 0);
                    GLES20.glBindTexture(3553, iArr3[0]);
                    GLES20.glTexParameterf(3553, 10241, 9728.0f);
                    GLES20.glTexParameterf(3553, 10240, 9729.0f);
                    GLES20.glTexParameterf(3553, 10242, 33071.0f);
                    GLES20.glTexParameterf(3553, 10243, 33071.0f);
                    GLUtils.texImage2D(3553, 0, this.g, 0);
                    i2 = iArr3[0];
                }
                this.l = i2;
                NativeRenderWrapper nativeRenderWrapper = this.f29386b;
                int i4 = this.h;
                int i5 = this.i;
                String str = Build.DEVICE;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), str}, nativeRenderWrapper, NativeRenderWrapper.f29324a, false, 16582, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    NativeRenderWrapper nativeRenderWrapper2 = nativeRenderWrapper;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), str}, nativeRenderWrapper2, NativeRenderWrapper.f29324a, false, 16582, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                } else if (nativeRenderWrapper.f29325b == 0) {
                    nativeRenderWrapper.f29325b = nativeRenderWrapper.nativeCreate();
                    nativeRenderWrapper.nativeInit(nativeRenderWrapper.f29325b, i4, i5, str);
                }
                this.j = false;
                this.f29386b.a(this.f29390f.f29391a, this.f29390f.f29393c, this.f29390f.f29394d, this.f29390f.f29392b);
            }
            if (this.l > 0) {
                GLES20.glViewport(0, 0, this.h, this.i);
                NativeRenderWrapper nativeRenderWrapper3 = this.f29386b;
                int i6 = this.l;
                int i7 = this.m;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i6), Integer.valueOf(i7)}, nativeRenderWrapper3, NativeRenderWrapper.f29324a, false, 16585, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    NativeRenderWrapper nativeRenderWrapper4 = nativeRenderWrapper3;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i6), Integer.valueOf(i7)}, nativeRenderWrapper4, NativeRenderWrapper.f29324a, false, 16585, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (nativeRenderWrapper3.f29325b != 0) {
                    nativeRenderWrapper3.nativeProcessTexture(nativeRenderWrapper3.f29325b, i6, i7, 0.0d);
                }
                GLES20.glBindFramebuffer(36160, this.k);
                if (this.f29387c) {
                    if (PatchProxy.isSupport(new Object[0], this, f29385a, false, 17425, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f29385a, false, 17425, new Class[0], Void.TYPE);
                    } else {
                        ByteBuffer allocate = ByteBuffer.allocate(this.h * this.i * 4);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.rewind();
                        GLES20.glReadPixels(0, 0, this.h, this.i, 6408, 5121, allocate);
                        this.f29388d.a(this.h, this.i, allocate);
                    }
                    this.f29387c = false;
                }
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, this.p, this.q);
                b bVar2 = this.n;
                int i8 = this.m;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i8)}, bVar2, b.f29379a, false, 17415, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    b bVar3 = bVar2;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i8)}, bVar3, b.f29379a, false, 17415, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    GLES20.glClear(16640);
                    GLES20.glUseProgram(bVar2.f29380b);
                    GLES20.glUniformMatrix4fv(bVar2.f29384f, 1, false, bVar2.g, 0);
                    GLES20.glEnableVertexAttribArray(bVar2.f29381c);
                    GLES20.glEnableVertexAttribArray(bVar2.f29382d);
                    GLES20.glVertexAttribPointer(bVar2.f29381c, 2, 5126, false, 0, bVar2.h);
                    GLES20.glVertexAttribPointer(bVar2.f29382d, 2, 5126, false, 0, bVar2.i);
                    GLES20.glUniform1i(bVar2.f29383e, 0);
                    GLES20.glBindTexture(i8, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                }
                if (this.f29389e != null) {
                    this.f29389e.a();
                }
            }
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        if (PatchProxy.isSupport(new Object[]{gl10, eGLConfig}, this, f29385a, false, 17421, new Class[]{GL10.class, EGLConfig.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gl10, eGLConfig}, this, f29385a, false, 17421, new Class[]{GL10.class, EGLConfig.class}, Void.TYPE);
            return;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glEnable(3553);
        GLES20.glDisable(2929);
        this.j = true;
    }

    public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{gl10, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29385a, false, 17422, new Class[]{GL10.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gl10, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29385a, false, 17422, new Class[]{GL10.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.p = i2;
        this.q = i3;
        b();
    }
}
