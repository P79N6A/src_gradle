package com.ss.android.medialib.b;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.TextureView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

public class a extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2485a;

    /* renamed from: c  reason: collision with root package name */
    public static final j f2486c = new j((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    SurfaceTexture f2487b;

    /* renamed from: d  reason: collision with root package name */
    i f2488d;

    /* renamed from: e  reason: collision with root package name */
    public GLSurfaceView.Renderer f2489e;

    /* renamed from: f  reason: collision with root package name */
    public e f2490f;
    public f g;
    public g h;
    public k i;
    public int j;
    public int k;
    public boolean l;
    private final WeakReference<a> m = new WeakReference<>(this);
    private boolean n;

    /* renamed from: com.ss.android.medialib.b.a$a  reason: collision with other inner class name */
    abstract class C0355a implements e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29349a;

        /* renamed from: b  reason: collision with root package name */
        protected int[] f29350b;

        /* access modifiers changed from: package-private */
        public abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public C0355a(int[] iArr) {
            int[] iArr2;
            if (PatchProxy.isSupport(new Object[]{iArr}, this, f29349a, false, 17373, new Class[]{int[].class}, int[].class)) {
                iArr2 = (int[]) PatchProxy.accessDispatch(new Object[]{iArr}, this, f29349a, false, 17373, new Class[]{int[].class}, int[].class);
            } else if (a.this.k != 2) {
                iArr2 = iArr;
            } else {
                int length = iArr.length;
                int[] iArr3 = new int[(length + 2)];
                int i = length - 1;
                System.arraycopy(iArr, 0, iArr3, 0, i);
                iArr3[i] = 12352;
                iArr3[length] = 4;
                iArr3[length + 1] = 12344;
                iArr2 = iArr3;
            }
            this.f29350b = iArr2;
        }

        public final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay) {
            if (PatchProxy.isSupport(new Object[]{egl10, eGLDisplay}, this, f29349a, false, 17372, new Class[]{EGL10.class, EGLDisplay.class}, EGLConfig.class)) {
                return (EGLConfig) PatchProxy.accessDispatch(new Object[]{egl10, eGLDisplay}, this, f29349a, false, 17372, new Class[]{EGL10.class, EGLDisplay.class}, EGLConfig.class);
            }
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.f29350b, null, 0, iArr)) {
                int i = iArr[0];
                if (i > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i];
                    if (egl10.eglChooseConfig(eGLDisplay, this.f29350b, eGLConfigArr, i, iArr)) {
                        EGLConfig a2 = a(egl10, eGLDisplay, eGLConfigArr);
                        if (a2 != null) {
                            return a2;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    class b extends C0355a {

        /* renamed from: d  reason: collision with root package name */
        public static ChangeQuickRedirect f29352d;

        /* renamed from: e  reason: collision with root package name */
        protected int f29353e = 8;

        /* renamed from: f  reason: collision with root package name */
        protected int f29354f = 8;
        protected int g = 8;
        protected int h = 0;
        protected int i;
        protected int j;
        private int[] l = new int[1];

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final javax.microedition.khronos.egl.EGLConfig a(javax.microedition.khronos.egl.EGL10 r15, javax.microedition.khronos.egl.EGLDisplay r16, javax.microedition.khronos.egl.EGLConfig[] r17) {
            /*
                r14 = this;
                r7 = r14
                r8 = r17
                r9 = 3
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r15
                r11 = 1
                r0[r11] = r16
                r12 = 2
                r0[r12] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f29352d
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<javax.microedition.khronos.egl.EGL10> r1 = javax.microedition.khronos.egl.EGL10.class
                r5[r10] = r1
                java.lang.Class<javax.microedition.khronos.egl.EGLDisplay> r1 = javax.microedition.khronos.egl.EGLDisplay.class
                r5[r11] = r1
                java.lang.Class<javax.microedition.khronos.egl.EGLConfig[]> r1 = javax.microedition.khronos.egl.EGLConfig[].class
                r5[r12] = r1
                java.lang.Class<javax.microedition.khronos.egl.EGLConfig> r6 = javax.microedition.khronos.egl.EGLConfig.class
                r3 = 0
                r4 = 17374(0x43de, float:2.4346E-41)
                r1 = r14
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0050
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r15
                r0[r11] = r16
                r0[r12] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f29352d
                r3 = 0
                r4 = 17374(0x43de, float:2.4346E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<javax.microedition.khronos.egl.EGL10> r1 = javax.microedition.khronos.egl.EGL10.class
                r5[r10] = r1
                java.lang.Class<javax.microedition.khronos.egl.EGLDisplay> r1 = javax.microedition.khronos.egl.EGLDisplay.class
                r5[r11] = r1
                java.lang.Class<javax.microedition.khronos.egl.EGLConfig[]> r1 = javax.microedition.khronos.egl.EGLConfig[].class
                r5[r12] = r1
                java.lang.Class<javax.microedition.khronos.egl.EGLConfig> r6 = javax.microedition.khronos.egl.EGLConfig.class
                r1 = r14
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                javax.microedition.khronos.egl.EGLConfig r0 = (javax.microedition.khronos.egl.EGLConfig) r0
                return r0
            L_0x0050:
                int r6 = r8.length
            L_0x0051:
                if (r10 >= r6) goto L_0x00a1
                r9 = r8[r10]
                r4 = 12325(0x3025, float:1.7271E-41)
                r5 = 0
                r0 = r14
                r1 = r15
                r2 = r16
                r3 = r9
                int r11 = r0.a(r1, r2, r3, r4, r5)
                r4 = 12326(0x3026, float:1.7272E-41)
                int r0 = r0.a(r1, r2, r3, r4, r5)
                int r1 = r7.i
                if (r11 < r1) goto L_0x009e
                int r1 = r7.j
                if (r0 < r1) goto L_0x009e
                r4 = 12324(0x3024, float:1.727E-41)
                r5 = 0
                r0 = r14
                r1 = r15
                r2 = r16
                r3 = r9
                int r11 = r0.a(r1, r2, r3, r4, r5)
                r4 = 12323(0x3023, float:1.7268E-41)
                int r12 = r0.a(r1, r2, r3, r4, r5)
                r4 = 12322(0x3022, float:1.7267E-41)
                int r13 = r0.a(r1, r2, r3, r4, r5)
                r4 = 12321(0x3021, float:1.7265E-41)
                int r0 = r0.a(r1, r2, r3, r4, r5)
                int r1 = r7.f29353e
                if (r11 != r1) goto L_0x009e
                int r1 = r7.f29354f
                if (r12 != r1) goto L_0x009e
                int r1 = r7.g
                if (r13 != r1) goto L_0x009e
                int r1 = r7.h
                if (r0 != r1) goto L_0x009e
                return r9
            L_0x009e:
                int r10 = r10 + 1
                goto L_0x0051
            L_0x00a1:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.b.a.b.a(javax.microedition.khronos.egl.EGL10, javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig[]):javax.microedition.khronos.egl.EGLConfig");
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2, int i3) {
            EGL10 egl102 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            EGLConfig eGLConfig2 = eGLConfig;
            if (PatchProxy.isSupport(new Object[]{egl102, eGLDisplay2, eGLConfig2, Integer.valueOf(i2), 0}, this, f29352d, false, 17375, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{egl102, eGLDisplay2, eGLConfig2, Integer.valueOf(i2), 0}, this, f29352d, false, 17375, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            if (egl102.eglGetConfigAttrib(eGLDisplay2, eGLConfig2, i2, this.l)) {
                return this.l[0];
            }
            return 0;
        }

        public b(int i2, int i3, int i4, int i5, int i6, int i7) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, i6, 12326, 0, 12344});
            this.i = i6;
            this.j = 0;
        }
    }

    class c implements f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29355a;

        /* renamed from: c  reason: collision with root package name */
        private int f29357c;

        private c() {
            this.f29357c = 12440;
        }

        /* synthetic */ c(a aVar, byte b2) {
            this();
        }

        public final EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            EGL10 egl102 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            EGLConfig eGLConfig2 = eGLConfig;
            if (PatchProxy.isSupport(new Object[]{egl102, eGLDisplay2, eGLConfig2}, this, f29355a, false, 17376, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class}, EGLContext.class)) {
                return (EGLContext) PatchProxy.accessDispatch(new Object[]{egl102, eGLDisplay2, eGLConfig2}, this, f29355a, false, 17376, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class}, EGLContext.class);
            }
            int[] iArr = {this.f29357c, a.this.k, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (a.this.k == 0) {
                iArr = null;
            }
            return egl102.eglCreateContext(eGLDisplay2, eGLConfig2, eGLContext, iArr);
        }

        public final void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (PatchProxy.isSupport(new Object[]{egl10, eGLDisplay, eGLContext}, this, f29355a, false, 17377, new Class[]{EGL10.class, EGLDisplay.class, EGLContext.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{egl10, eGLDisplay, eGLContext}, this, f29355a, false, 17377, new Class[]{EGL10.class, EGLDisplay.class, EGLContext.class}, Void.TYPE);
                return;
            }
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                h.a("eglDestroyContex", egl10.eglGetError());
            }
        }
    }

    static class d implements g {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29358a;

        private d() {
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        public final void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            if (PatchProxy.isSupport(new Object[]{egl10, eGLDisplay, eGLSurface}, this, f29358a, false, 17379, new Class[]{EGL10.class, EGLDisplay.class, EGLSurface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{egl10, eGLDisplay, eGLSurface}, this, f29358a, false, 17379, new Class[]{EGL10.class, EGLDisplay.class, EGLSurface.class}, Void.TYPE);
                return;
            }
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        public final EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            EGLSurface eGLSurface;
            EGL10 egl102 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            EGLConfig eGLConfig2 = eGLConfig;
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{egl102, eGLDisplay2, eGLConfig2, obj2}, this, f29358a, false, 17378, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class, Object.class}, EGLSurface.class)) {
                return (EGLSurface) PatchProxy.accessDispatch(new Object[]{egl102, eGLDisplay2, eGLConfig2, obj2}, this, f29358a, false, 17378, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class, Object.class}, EGLSurface.class);
            }
            try {
                eGLSurface = egl102.eglCreateWindowSurface(eGLDisplay2, eGLConfig2, obj2, null);
            } catch (IllegalArgumentException unused) {
                eGLSurface = null;
            }
            return eGLSurface;
        }
    }

    public interface e {
        EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    public interface f {
        EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    public interface g {
        EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    static class h {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29359a;

        /* renamed from: b  reason: collision with root package name */
        WeakReference<a> f29360b;

        /* renamed from: c  reason: collision with root package name */
        EGL10 f29361c;

        /* renamed from: d  reason: collision with root package name */
        EGLDisplay f29362d;

        /* renamed from: e  reason: collision with root package name */
        EGLSurface f29363e;

        /* renamed from: f  reason: collision with root package name */
        EGLConfig f29364f;
        EGLContext g;

        /* access modifiers changed from: package-private */
        public void a() {
            if (PatchProxy.isSupport(new Object[0], this, f29359a, false, 17385, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29359a, false, 17385, new Class[0], Void.TYPE);
                return;
            }
            if (!(this.f29363e == null || this.f29363e == EGL10.EGL_NO_SURFACE)) {
                EGL10 egl10 = this.f29361c;
                EGLDisplay eGLDisplay = this.f29362d;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                a aVar = (a) this.f29360b.get();
                if (aVar != null) {
                    aVar.h.a(this.f29361c, this.f29362d, this.f29363e);
                }
                this.f29363e = null;
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f29359a, false, 17386, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29359a, false, 17386, new Class[0], Void.TYPE);
                return;
            }
            if (this.g != null) {
                a aVar = (a) this.f29360b.get();
                if (aVar != null) {
                    aVar.g.a(this.f29361c, this.f29362d, this.g);
                }
                this.g = null;
            }
            if (this.f29362d != null) {
                this.f29361c.eglTerminate(this.f29362d);
                this.f29362d = null;
            }
        }

        public h(WeakReference<a> weakReference) {
            this.f29360b = weakReference;
        }

        public static void a(String str, int i) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, null, f29359a, true, 17388, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, null, f29359a, true, 17388, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            throw new RuntimeException(b(str, i));
        }

        private static String b(String str, int i) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f29359a, true, 17389, new Class[]{String.class, Integer.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f29359a, true, 17389, new Class[]{String.class, Integer.TYPE}, String.class);
            }
            return str2 + " failed";
        }
    }

    static class i extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29365a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f29366b;

        /* renamed from: c  reason: collision with root package name */
        boolean f29367c;

        /* renamed from: d  reason: collision with root package name */
        boolean f29368d;

        /* renamed from: e  reason: collision with root package name */
        boolean f29369e;

        /* renamed from: f  reason: collision with root package name */
        boolean f29370f;
        boolean g = true;
        boolean h;
        ArrayList<Runnable> i = new ArrayList<>();
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;
        private boolean n;
        private boolean o;
        private int p = 0;
        private int q = 0;
        private int r = 1;
        private boolean s = true;
        private h t;
        private WeakReference<a> u;

        public final int a() {
            int i2;
            synchronized (a.f2486c) {
                i2 = this.r;
            }
            return i2;
        }

        private boolean g() {
            if (this.f29368d || !this.f29369e || this.k || this.p <= 0 || this.q <= 0 || (!this.g && this.r != 1)) {
                return false;
            }
            return true;
        }

        private void e() {
            if (PatchProxy.isSupport(new Object[0], this, f29365a, false, 17392, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29365a, false, 17392, new Class[0], Void.TYPE);
                return;
            }
            if (this.l) {
                this.t.b();
                this.l = false;
                a.f2486c.b(this);
            }
        }

        private void d() {
            if (PatchProxy.isSupport(new Object[0], this, f29365a, false, 17391, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29365a, false, 17391, new Class[0], Void.TYPE);
                return;
            }
            if (this.m) {
                this.m = false;
                h hVar = this.t;
                if (PatchProxy.isSupport(new Object[0], hVar, h.f29359a, false, 17384, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], hVar, h.f29359a, false, 17384, new Class[0], Void.TYPE);
                    return;
                }
                hVar.a();
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:15|16|17|18|29|24|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0030, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0042 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f29365a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 17397(0x43f5, float:2.4378E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0023
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f29365a
                r5 = 0
                r6 = 17397(0x43f5, float:2.4378E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0023:
                com.ss.android.medialib.b.a$j r1 = com.ss.android.medialib.b.a.f2486c
                monitor-enter(r1)
                r2 = 1
                r9.f29369e = r2     // Catch:{ all -> 0x004c }
                r9.n = r0     // Catch:{ all -> 0x004c }
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x004c }
                r0.notifyAll()     // Catch:{ all -> 0x004c }
            L_0x0030:
                boolean r0 = r9.f29370f     // Catch:{ all -> 0x004c }
                if (r0 == 0) goto L_0x004a
                boolean r0 = r9.n     // Catch:{ all -> 0x004c }
                if (r0 != 0) goto L_0x004a
                boolean r0 = r9.f29366b     // Catch:{ all -> 0x004c }
                if (r0 != 0) goto L_0x004a
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ InterruptedException -> 0x0042 }
                r0.wait()     // Catch:{ InterruptedException -> 0x0042 }
                goto L_0x0030
            L_0x0042:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004c }
                r0.interrupt()     // Catch:{ all -> 0x004c }
                goto L_0x0030
            L_0x004a:
                monitor-exit(r1)     // Catch:{ all -> 0x004c }
                return
            L_0x004c:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x004c }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.b.a.i.b():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f29365a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 17402(0x43fa, float:2.4385E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0023
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f29365a
                r5 = 0
                r6 = 17402(0x43fa, float:2.4385E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0023:
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c
                monitor-enter(r0)
                r1 = 1
                r9.j = r1     // Catch:{ all -> 0x0042 }
                com.ss.android.medialib.b.a$j r1 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0042 }
                r1.notifyAll()     // Catch:{ all -> 0x0042 }
            L_0x002e:
                boolean r1 = r9.f29366b     // Catch:{ all -> 0x0042 }
                if (r1 != 0) goto L_0x0040
                com.ss.android.medialib.b.a$j r1 = com.ss.android.medialib.b.a.f2486c     // Catch:{ InterruptedException -> 0x0038 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0038 }
                goto L_0x002e
            L_0x0038:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0042 }
                r1.interrupt()     // Catch:{ all -> 0x0042 }
                goto L_0x002e
            L_0x0040:
                monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                return
            L_0x0042:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.b.a.i.c():void");
        }

        public void run() {
            if (PatchProxy.isSupport(new Object[0], this, f29365a, false, 17390, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29365a, false, 17390, new Class[0], Void.TYPE);
                return;
            }
            setName("GLThread " + getId());
            try {
                f();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                a.f2486c.a(this);
                throw th;
            }
            a.f2486c.a(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f5, code lost:
            if (r14 == null) goto L_0x02fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x02fd, code lost:
            if (r5 == false) goto L_0x03e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ff, code lost:
            r0 = r8.t;
            r26 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x031a, code lost:
            if (com.meituan.robust.PatchProxy.isSupport(new java.lang.Object[0], r0, com.ss.android.medialib.b.a.h.f29359a, false, 17381, new java.lang.Class[0], java.lang.Boolean.TYPE) == false) goto L_0x033e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x031c, code lost:
            r0 = ((java.lang.Boolean) com.meituan.robust.PatchProxy.accessDispatch(new java.lang.Object[0], r0, com.ss.android.medialib.b.a.h.f29359a, false, 17381, new java.lang.Class[0], java.lang.Boolean.TYPE)).booleanValue();
            r27 = r3;
            r28 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0340, code lost:
            if (r0.f29361c == null) goto L_0x03dc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0344, code lost:
            if (r0.f29362d == null) goto L_0x03d4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0348, code lost:
            if (r0.f29364f == null) goto L_0x03cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x034a, code lost:
            r0.a();
            r1 = (com.ss.android.medialib.b.a) r0.f29360b.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0355, code lost:
            if (r1 == null) goto L_0x036f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x0357, code lost:
            r27 = r3;
            r28 = r4;
            r0.f29363e = r1.h.a(r0.f29361c, r0.f29362d, r0.f29364f, r1.getSurfaceTexture());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x036f, code lost:
            r27 = r3;
            r28 = r4;
            r0.f29363e = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0378, code lost:
            if (r0.f29363e == null) goto L_0x0399;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x037e, code lost:
            if (r0.f29363e != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) goto L_0x0381;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x038f, code lost:
            if (r0.f29361c.eglMakeCurrent(r0.f29362d, r0.f29363e, r0.f29363e, r0.g) != false) goto L_0x0397;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0391, code lost:
            r0.f29361c.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0397, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x0399, code lost:
            r0.f29361c.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x039e, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x039f, code lost:
            if (r0 == false) goto L_0x03b2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x03a1, code lost:
            r1 = com.ss.android.medialib.b.a.f2486c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x03a3, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
            r8.n = true;
            com.ss.android.medialib.b.a.f2486c.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x03ac, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x03ad, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x03b2, code lost:
            r1 = com.ss.android.medialib.b.a.f2486c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x03b4, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
            r8.n = true;
            r8.k = true;
            com.ss.android.medialib.b.a.f2486c.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x03bf, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x03c0, code lost:
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x03c2, code lost:
            r3 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x03d3, code lost:
            throw new java.lang.RuntimeException("mEglConfig not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x03db, code lost:
            throw new java.lang.RuntimeException("eglDisplay not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x03e3, code lost:
            throw new java.lang.RuntimeException("egl not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x03e4, code lost:
            r26 = r2;
            r27 = r3;
            r28 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x03ea, code lost:
            if (r6 == false) goto L_0x0466;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x03ec, code lost:
            r0 = r8.t;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0405, code lost:
            if (com.meituan.robust.PatchProxy.isSupport(new java.lang.Object[0], r0, com.ss.android.medialib.b.a.h.f29359a, false, 17382, new java.lang.Class[0], javax.microedition.khronos.opengles.GL.class) == false) goto L_0x0421;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0407, code lost:
            r0 = (javax.microedition.khronos.opengles.GL) com.meituan.robust.PatchProxy.accessDispatch(new java.lang.Object[0], r0, com.ss.android.medialib.b.a.h.f29359a, false, 17382, new java.lang.Class[0], javax.microedition.khronos.opengles.GL.class);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0421, code lost:
            r1 = r0.g.getGL();
            r0 = (com.ss.android.medialib.b.a) r0.f29360b.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x042f, code lost:
            if (r0 == null) goto L_0x045c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x0433, code lost:
            if (r0.i == null) goto L_0x043b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0435, code lost:
            r1 = r0.i.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x043f, code lost:
            if ((r0.j & 3) == 0) goto L_0x045c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0445, code lost:
            if ((r0.j & 1) == 0) goto L_0x0449;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0447, code lost:
            r2 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x0449, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x044e, code lost:
            if ((r0.j & 2) == 0) goto L_0x0456;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x0450, code lost:
            r0 = new com.ss.android.medialib.b.a.l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x0456, code lost:
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x0457, code lost:
            r0 = android.opengl.GLDebugHelper.wrap(r1, r2, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x045c, code lost:
            r0 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x045d, code lost:
            r0 = (javax.microedition.khronos.opengles.GL10) r0;
            com.ss.android.medialib.b.a.f2486c.a(r0);
            r7 = r0;
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x0466, code lost:
            if (r12 == false) goto L_0x047c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x0468, code lost:
            r0 = (com.ss.android.medialib.b.a) r8.u.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x0470, code lost:
            if (r0 == null) goto L_0x047b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x0472, code lost:
            r0.f2489e.onSurfaceCreated(r7, r8.t.f29364f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x047b, code lost:
            r12 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x047c, code lost:
            if (r9 == false) goto L_0x048e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x047e, code lost:
            r0 = (com.ss.android.medialib.b.a) r8.u.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x0486, code lost:
            if (r0 == null) goto L_0x048d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x0488, code lost:
            r0.f2489e.onSurfaceChanged(r7, r10, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x048d, code lost:
            r9 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x048e, code lost:
            r0 = (com.ss.android.medialib.b.a) r8.u.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x0496, code lost:
            if (r0 == null) goto L_0x049d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x0498, code lost:
            r0.f2489e.onDrawFrame(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x049d, code lost:
            r0 = r8.t;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:243:0x04b8, code lost:
            if (com.meituan.robust.PatchProxy.isSupport(new java.lang.Object[0], r0, com.ss.android.medialib.b.a.h.f29359a, false, 17383, new java.lang.Class[0], java.lang.Integer.TYPE) == false) goto L_0x04d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:244:0x04ba, code lost:
            r0 = ((java.lang.Integer) com.meituan.robust.PatchProxy.accessDispatch(new java.lang.Object[0], r0, com.ss.android.medialib.b.a.h.f29359a, false, 17383, new java.lang.Class[0], java.lang.Integer.TYPE)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:246:0x04e3, code lost:
            if (r0.f29361c.eglSwapBuffers(r0.f29362d, r0.f29363e) != false) goto L_0x04ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:247:0x04e5, code lost:
            r0 = r0.f29361c.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:248:0x04ec, code lost:
            r0 = 12288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:249:0x04ee, code lost:
            if (r0 == 12288) goto L_0x0507;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:251:0x04f2, code lost:
            if (r0 == 12302) goto L_0x0504;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:252:0x04f4, code lost:
            r2 = com.ss.android.medialib.b.a.f2486c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x04f6, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
            r8.k = true;
            com.ss.android.medialib.b.a.f2486c.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:257:0x04ff, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:263:0x0504, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:265:0x0508, code lost:
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:266:0x050a, code lost:
            if (r13 == false) goto L_0x03c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:267:0x050c, code lost:
            r3 = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void f() throws java.lang.InterruptedException {
            /*
                r29 = this;
                r8 = r29
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f29365a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 17393(0x43f1, float:2.4373E-41)
                r2 = r29
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0027
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f29365a
                r4 = 0
                r5 = 17393(0x43f1, float:2.4373E-41)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r2 = r29
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                return
            L_0x0027:
                com.ss.android.medialib.b.a$h r1 = new com.ss.android.medialib.b.a$h
                java.lang.ref.WeakReference<com.ss.android.medialib.b.a> r2 = r8.u
                r1.<init>(r2)
                r8.t = r1
                r8.l = r0
                r8.m = r0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
            L_0x003f:
                r14 = 0
            L_0x0040:
                com.ss.android.medialib.b.a$j r15 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0526 }
                monitor-enter(r15)     // Catch:{ all -> 0x0526 }
            L_0x0043:
                boolean r1 = r8.j     // Catch:{ all -> 0x0523 }
                if (r1 == 0) goto L_0x0056
                monitor-exit(r15)     // Catch:{ all -> 0x0523 }
                com.ss.android.medialib.b.a$j r1 = com.ss.android.medialib.b.a.f2486c
                monitor-enter(r1)
                r29.d()     // Catch:{ all -> 0x0053 }
                r29.e()     // Catch:{ all -> 0x0053 }
                monitor-exit(r1)     // Catch:{ all -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0053 }
                throw r0
            L_0x0056:
                java.util.ArrayList<java.lang.Runnable> r1 = r8.i     // Catch:{ all -> 0x0523 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0523 }
                if (r1 != 0) goto L_0x006a
                java.util.ArrayList<java.lang.Runnable> r1 = r8.i     // Catch:{ all -> 0x0523 }
                r14 = 0
                java.lang.Object r1 = r1.remove(r14)     // Catch:{ all -> 0x0523 }
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0523 }
                r14 = r1
                goto L_0x02f4
            L_0x006a:
                boolean r1 = r8.f29368d     // Catch:{ all -> 0x0523 }
                boolean r0 = r8.f29367c     // Catch:{ all -> 0x0523 }
                if (r1 == r0) goto L_0x007c
                boolean r0 = r8.f29367c     // Catch:{ all -> 0x0523 }
                boolean r1 = r8.f29367c     // Catch:{ all -> 0x0523 }
                r8.f29368d = r1     // Catch:{ all -> 0x0523 }
                com.ss.android.medialib.b.a$j r1 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0523 }
                r1.notifyAll()     // Catch:{ all -> 0x0523 }
                goto L_0x007d
            L_0x007c:
                r0 = 0
            L_0x007d:
                boolean r1 = r8.o     // Catch:{ all -> 0x0523 }
                if (r1 == 0) goto L_0x008b
                r29.d()     // Catch:{ all -> 0x0523 }
                r29.e()     // Catch:{ all -> 0x0523 }
                r1 = 0
                r8.o = r1     // Catch:{ all -> 0x0523 }
                r4 = 1
            L_0x008b:
                if (r2 == 0) goto L_0x0094
                r29.d()     // Catch:{ all -> 0x0523 }
                r29.e()     // Catch:{ all -> 0x0523 }
                r2 = 0
            L_0x0094:
                if (r0 == 0) goto L_0x009d
                boolean r1 = r8.m     // Catch:{ all -> 0x0523 }
                if (r1 == 0) goto L_0x009d
                r29.d()     // Catch:{ all -> 0x0523 }
            L_0x009d:
                if (r0 == 0) goto L_0x00be
                boolean r1 = r8.l     // Catch:{ all -> 0x0523 }
                if (r1 == 0) goto L_0x00be
                java.lang.ref.WeakReference<com.ss.android.medialib.b.a> r1 = r8.u     // Catch:{ all -> 0x0523 }
                java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0523 }
                com.ss.android.medialib.b.a r1 = (com.ss.android.medialib.b.a) r1     // Catch:{ all -> 0x0523 }
                if (r1 != 0) goto L_0x00af
                r1 = 0
                goto L_0x00b1
            L_0x00af:
                boolean r1 = r1.l     // Catch:{ all -> 0x0523 }
            L_0x00b1:
                if (r1 == 0) goto L_0x00bb
                com.ss.android.medialib.b.a$j r1 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0523 }
                boolean r1 = r1.a()     // Catch:{ all -> 0x0523 }
                if (r1 == 0) goto L_0x00be
            L_0x00bb:
                r29.e()     // Catch:{ all -> 0x0523 }
            L_0x00be:
                if (r0 == 0) goto L_0x00cd
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0523 }
                boolean r0 = r0.b()     // Catch:{ all -> 0x0523 }
                if (r0 == 0) goto L_0x00cd
                com.ss.android.medialib.b.a$h r0 = r8.t     // Catch:{ all -> 0x0523 }
                r0.b()     // Catch:{ all -> 0x0523 }
            L_0x00cd:
                boolean r0 = r8.f29369e     // Catch:{ all -> 0x0523 }
                if (r0 != 0) goto L_0x00e7
                boolean r0 = r8.f29370f     // Catch:{ all -> 0x0523 }
                if (r0 != 0) goto L_0x00e7
                boolean r0 = r8.m     // Catch:{ all -> 0x0523 }
                if (r0 == 0) goto L_0x00dc
                r29.d()     // Catch:{ all -> 0x0523 }
            L_0x00dc:
                r0 = 1
                r8.f29370f = r0     // Catch:{ all -> 0x0523 }
                r0 = 0
                r8.k = r0     // Catch:{ all -> 0x0523 }
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0523 }
                r0.notifyAll()     // Catch:{ all -> 0x0523 }
            L_0x00e7:
                boolean r0 = r8.f29369e     // Catch:{ all -> 0x0523 }
                if (r0 == 0) goto L_0x00f7
                boolean r0 = r8.f29370f     // Catch:{ all -> 0x0523 }
                if (r0 == 0) goto L_0x00f7
                r0 = 0
                r8.f29370f = r0     // Catch:{ all -> 0x0523 }
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0523 }
                r0.notifyAll()     // Catch:{ all -> 0x0523 }
            L_0x00f7:
                if (r3 == 0) goto L_0x0103
                r0 = 1
                r8.h = r0     // Catch:{ all -> 0x0523 }
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0523 }
                r0.notifyAll()     // Catch:{ all -> 0x0523 }
                r3 = 0
                r13 = 0
            L_0x0103:
                boolean r0 = r29.g()     // Catch:{ all -> 0x0523 }
                if (r0 == 0) goto L_0x0512
                boolean r0 = r8.l     // Catch:{ all -> 0x0523 }
                if (r0 != 0) goto L_0x02c0
                if (r4 == 0) goto L_0x0116
                r24 = r2
                r25 = r3
                r4 = 0
                goto L_0x02c4
            L_0x0116:
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0523 }
                r24 = r2
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0523 }
                r16 = 0
                r2[r16] = r8     // Catch:{ all -> 0x0523 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.medialib.b.a.j.f29371a     // Catch:{ all -> 0x0523 }
                r20 = 0
                r21 = 17406(0x43fe, float:2.4391E-41)
                r25 = r3
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0523 }
                java.lang.Class<com.ss.android.medialib.b.a$i> r1 = com.ss.android.medialib.b.a.i.class
                r3[r16] = r1     // Catch:{ all -> 0x0523 }
                java.lang.Class r23 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0523 }
                r17 = r2
                r18 = r0
                r22 = r3
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0523 }
                if (r1 == 0) goto L_0x0164
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0523 }
                r3 = 0
                r2[r3] = r8     // Catch:{ all -> 0x0523 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.medialib.b.a.j.f29371a     // Catch:{ all -> 0x0523 }
                r20 = 0
                r21 = 17406(0x43fe, float:2.4391E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0523 }
                java.lang.Class<com.ss.android.medialib.b.a$i> r1 = com.ss.android.medialib.b.a.i.class
                r16 = 0
                r3[r16] = r1     // Catch:{ all -> 0x0523 }
                java.lang.Class r23 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0523 }
                r17 = r2
                r18 = r0
                r22 = r3
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0523 }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0523 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0523 }
                goto L_0x01bb
            L_0x0164:
                com.ss.android.medialib.b.a$i r1 = r0.f29374c     // Catch:{ all -> 0x0523 }
                if (r1 == r8) goto L_0x01b5
                com.ss.android.medialib.b.a$i r1 = r0.f29374c     // Catch:{ all -> 0x0523 }
                if (r1 != 0) goto L_0x016d
                goto L_0x01b5
            L_0x016d:
                r0.c()     // Catch:{ all -> 0x0523 }
                boolean r1 = r0.f29373b     // Catch:{ all -> 0x0523 }
                if (r1 == 0) goto L_0x0175
                goto L_0x01ba
            L_0x0175:
                com.ss.android.medialib.b.a$i r1 = r0.f29374c     // Catch:{ all -> 0x0523 }
                if (r1 == 0) goto L_0x01b3
                com.ss.android.medialib.b.a$i r0 = r0.f29374c     // Catch:{ all -> 0x0523 }
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0523 }
                com.meituan.robust.ChangeQuickRedirect r19 = f29365a     // Catch:{ all -> 0x0523 }
                r20 = 0
                r21 = 17403(0x43fb, float:2.4387E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0523 }
                java.lang.Class r23 = java.lang.Void.TYPE     // Catch:{ all -> 0x0523 }
                r17 = r2
                r18 = r0
                r22 = r3
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0523 }
                if (r1 == 0) goto L_0x01ab
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0523 }
                com.meituan.robust.ChangeQuickRedirect r19 = f29365a     // Catch:{ all -> 0x0523 }
                r20 = 0
                r21 = 17403(0x43fb, float:2.4387E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0523 }
                java.lang.Class r23 = java.lang.Void.TYPE     // Catch:{ all -> 0x0523 }
                r17 = r2
                r18 = r0
                r22 = r3
                com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0523 }
                goto L_0x01b3
            L_0x01ab:
                r1 = 1
                r0.o = r1     // Catch:{ all -> 0x0523 }
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0523 }
                r0.notifyAll()     // Catch:{ all -> 0x0523 }
            L_0x01b3:
                r0 = 0
                goto L_0x01bb
            L_0x01b5:
                r0.f29374c = r8     // Catch:{ all -> 0x0523 }
                r0.notifyAll()     // Catch:{ all -> 0x0523 }
            L_0x01ba:
                r0 = 1
            L_0x01bb:
                if (r0 == 0) goto L_0x02c4
                com.ss.android.medialib.b.a$h r0 = r8.t     // Catch:{ RuntimeException -> 0x02b9 }
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ RuntimeException -> 0x02b9 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.medialib.b.a.h.f29359a     // Catch:{ RuntimeException -> 0x02b9 }
                r20 = 0
                r21 = 17380(0x43e4, float:2.4355E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ RuntimeException -> 0x02b9 }
                java.lang.Class r23 = java.lang.Void.TYPE     // Catch:{ RuntimeException -> 0x02b9 }
                r17 = r2
                r18 = r0
                r22 = r3
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ RuntimeException -> 0x02b9 }
                if (r1 == 0) goto L_0x01f1
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ RuntimeException -> 0x02b9 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.medialib.b.a.h.f29359a     // Catch:{ RuntimeException -> 0x02b9 }
                r20 = 0
                r21 = 17380(0x43e4, float:2.4355E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ RuntimeException -> 0x02b9 }
                java.lang.Class r23 = java.lang.Void.TYPE     // Catch:{ RuntimeException -> 0x02b9 }
                r17 = r2
                r18 = r0
                r22 = r3
                com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ RuntimeException -> 0x02b9 }
            L_0x01ee:
                r0 = 1
                goto L_0x02a0
            L_0x01f1:
                javax.microedition.khronos.egl.EGL r1 = javax.microedition.khronos.egl.EGLContext.getEGL()     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGL10 r1 = (javax.microedition.khronos.egl.EGL10) r1     // Catch:{ RuntimeException -> 0x02b9 }
                r0.f29361c = r1     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGL10 r1 = r0.f29361c     // Catch:{ RuntimeException -> 0x02b9 }
                java.lang.Object r2 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGLDisplay r1 = r1.eglGetDisplay(r2)     // Catch:{ RuntimeException -> 0x02b9 }
                r0.f29362d = r1     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGLDisplay r1 = r0.f29362d     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGLDisplay r2 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY     // Catch:{ RuntimeException -> 0x02b9 }
                if (r1 == r2) goto L_0x02b1
                r1 = 2
                int[] r2 = new int[r1]     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGL10 r1 = r0.f29361c     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGLDisplay r3 = r0.f29362d     // Catch:{ RuntimeException -> 0x02b9 }
                boolean r1 = r1.eglInitialize(r3, r2)     // Catch:{ RuntimeException -> 0x02b9 }
                if (r1 == 0) goto L_0x02a9
                java.lang.ref.WeakReference<com.ss.android.medialib.b.a> r1 = r0.f29360b     // Catch:{ RuntimeException -> 0x02b9 }
                java.lang.Object r1 = r1.get()     // Catch:{ RuntimeException -> 0x02b9 }
                com.ss.android.medialib.b.a r1 = (com.ss.android.medialib.b.a) r1     // Catch:{ RuntimeException -> 0x02b9 }
                if (r1 != 0) goto L_0x0226
                r2 = 0
                r0.f29364f = r2     // Catch:{ RuntimeException -> 0x02b9 }
                r0.g = r2     // Catch:{ RuntimeException -> 0x02b9 }
                goto L_0x0240
            L_0x0226:
                com.ss.android.medialib.b.a$e r2 = r1.f2490f     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGL10 r3 = r0.f29361c     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGLDisplay r12 = r0.f29362d     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGLConfig r2 = r2.a(r3, r12)     // Catch:{ RuntimeException -> 0x02b9 }
                r0.f29364f = r2     // Catch:{ RuntimeException -> 0x02b9 }
                com.ss.android.medialib.b.a$f r1 = r1.g     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGL10 r2 = r0.f29361c     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGLDisplay r3 = r0.f29362d     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGLConfig r12 = r0.f29364f     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGLContext r1 = r1.a((javax.microedition.khronos.egl.EGL10) r2, (javax.microedition.khronos.egl.EGLDisplay) r3, (javax.microedition.khronos.egl.EGLConfig) r12)     // Catch:{ RuntimeException -> 0x02b9 }
                r0.g = r1     // Catch:{ RuntimeException -> 0x02b9 }
            L_0x0240:
                javax.microedition.khronos.egl.EGLContext r1 = r0.g     // Catch:{ RuntimeException -> 0x02b9 }
                if (r1 == 0) goto L_0x024d
                javax.microedition.khronos.egl.EGLContext r1 = r0.g     // Catch:{ RuntimeException -> 0x02b9 }
                javax.microedition.khronos.egl.EGLContext r2 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ RuntimeException -> 0x02b9 }
                if (r1 != r2) goto L_0x024b
                goto L_0x024d
            L_0x024b:
                r1 = 0
                goto L_0x029c
            L_0x024d:
                r1 = 0
                r0.g = r1     // Catch:{ RuntimeException -> 0x02b9 }
                java.lang.String r1 = "createContext"
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ RuntimeException -> 0x02b9 }
                r12 = 0
                r3[r12] = r1     // Catch:{ RuntimeException -> 0x02b9 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.medialib.b.a.h.f29359a     // Catch:{ RuntimeException -> 0x02b9 }
                r20 = 0
                r21 = 17387(0x43eb, float:2.4364E-41)
                java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ RuntimeException -> 0x02b9 }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r16 = 0
                r12[r16] = r2     // Catch:{ RuntimeException -> 0x02b9 }
                java.lang.Class r23 = java.lang.Void.TYPE     // Catch:{ RuntimeException -> 0x02b9 }
                r17 = r3
                r18 = r0
                r22 = r12
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ RuntimeException -> 0x02b9 }
                if (r2 == 0) goto L_0x0292
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ RuntimeException -> 0x02b9 }
                r12 = 0
                r3[r12] = r1     // Catch:{ RuntimeException -> 0x02b9 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.medialib.b.a.h.f29359a     // Catch:{ RuntimeException -> 0x02b9 }
                r20 = 0
                r21 = 17387(0x43eb, float:2.4364E-41)
                java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ RuntimeException -> 0x02b9 }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r12] = r2     // Catch:{ RuntimeException -> 0x02b9 }
                java.lang.Class r23 = java.lang.Void.TYPE     // Catch:{ RuntimeException -> 0x02b9 }
                r17 = r3
                r18 = r0
                r22 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ RuntimeException -> 0x02b9 }
                goto L_0x024b
            L_0x0292:
                javax.microedition.khronos.egl.EGL10 r2 = r0.f29361c     // Catch:{ RuntimeException -> 0x02b9 }
                int r2 = r2.eglGetError()     // Catch:{ RuntimeException -> 0x02b9 }
                com.ss.android.medialib.b.a.h.a(r1, r2)     // Catch:{ RuntimeException -> 0x02b9 }
                goto L_0x024b
            L_0x029c:
                r0.f29363e = r1     // Catch:{ RuntimeException -> 0x02b9 }
                goto L_0x01ee
            L_0x02a0:
                r8.l = r0     // Catch:{ all -> 0x0523 }
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0523 }
                r0.notifyAll()     // Catch:{ all -> 0x0523 }
                r12 = 1
                goto L_0x02c4
            L_0x02a9:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x02b9 }
                java.lang.String r1 = "eglInitialize failed"
                r0.<init>(r1)     // Catch:{ RuntimeException -> 0x02b9 }
                throw r0     // Catch:{ RuntimeException -> 0x02b9 }
            L_0x02b1:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x02b9 }
                java.lang.String r1 = "eglGetDisplay failed"
                r0.<init>(r1)     // Catch:{ RuntimeException -> 0x02b9 }
                throw r0     // Catch:{ RuntimeException -> 0x02b9 }
            L_0x02b9:
                r0 = move-exception
                com.ss.android.medialib.b.a$j r1 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0523 }
                r1.b(r8)     // Catch:{ all -> 0x0523 }
                throw r0     // Catch:{ all -> 0x0523 }
            L_0x02c0:
                r24 = r2
                r25 = r3
            L_0x02c4:
                boolean r0 = r8.l     // Catch:{ all -> 0x0523 }
                if (r0 == 0) goto L_0x02d3
                boolean r0 = r8.m     // Catch:{ all -> 0x0523 }
                if (r0 != 0) goto L_0x02d3
                r0 = 1
                r8.m = r0     // Catch:{ all -> 0x0523 }
                r0 = 1
                r6 = 1
                r9 = 1
                goto L_0x02d4
            L_0x02d3:
                r0 = r5
            L_0x02d4:
                boolean r1 = r8.m     // Catch:{ all -> 0x0523 }
                if (r1 == 0) goto L_0x050f
                boolean r1 = r8.s     // Catch:{ all -> 0x0523 }
                if (r1 == 0) goto L_0x02e7
                int r10 = r8.p     // Catch:{ all -> 0x0523 }
                int r11 = r8.q     // Catch:{ all -> 0x0523 }
                r1 = 0
                r8.s = r1     // Catch:{ all -> 0x0523 }
                r0 = 1
                r9 = 1
                r13 = 1
                goto L_0x02e8
            L_0x02e7:
                r1 = 0
            L_0x02e8:
                r8.g = r1     // Catch:{ all -> 0x0523 }
                com.ss.android.medialib.b.a$j r1 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0523 }
                r1.notifyAll()     // Catch:{ all -> 0x0523 }
                r5 = r0
                r2 = r24
                r3 = r25
            L_0x02f4:
                monitor-exit(r15)     // Catch:{ all -> 0x0523 }
                if (r14 == 0) goto L_0x02fd
                r14.run()     // Catch:{ all -> 0x0526 }
                r0 = 0
                goto L_0x003f
            L_0x02fd:
                if (r5 == 0) goto L_0x03e4
                com.ss.android.medialib.b.a$h r0 = r8.t     // Catch:{ all -> 0x0526 }
                r1 = 0
                java.lang.Object[] r15 = new java.lang.Object[r1]     // Catch:{ all -> 0x0526 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.medialib.b.a.h.f29359a     // Catch:{ all -> 0x0526 }
                r20 = 0
                r21 = 17381(0x43e5, float:2.4356E-41)
                r26 = r2
                java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0526 }
                java.lang.Class r23 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0526 }
                r17 = r15
                r18 = r0
                r22 = r2
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0526 }
                if (r1 == 0) goto L_0x033e
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0526 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.medialib.b.a.h.f29359a     // Catch:{ all -> 0x0526 }
                r20 = 0
                r21 = 17381(0x43e5, float:2.4356E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ all -> 0x0526 }
                java.lang.Class r23 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0526 }
                r17 = r2
                r18 = r0
                r22 = r15
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0526 }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0526 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0526 }
                r27 = r3
                r28 = r4
                goto L_0x039f
            L_0x033e:
                javax.microedition.khronos.egl.EGL10 r1 = r0.f29361c     // Catch:{ all -> 0x0526 }
                if (r1 == 0) goto L_0x03dc
                javax.microedition.khronos.egl.EGLDisplay r1 = r0.f29362d     // Catch:{ all -> 0x0526 }
                if (r1 == 0) goto L_0x03d4
                javax.microedition.khronos.egl.EGLConfig r1 = r0.f29364f     // Catch:{ all -> 0x0526 }
                if (r1 == 0) goto L_0x03cc
                r0.a()     // Catch:{ all -> 0x0526 }
                java.lang.ref.WeakReference<com.ss.android.medialib.b.a> r1 = r0.f29360b     // Catch:{ all -> 0x0526 }
                java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0526 }
                com.ss.android.medialib.b.a r1 = (com.ss.android.medialib.b.a) r1     // Catch:{ all -> 0x0526 }
                if (r1 == 0) goto L_0x036f
                com.ss.android.medialib.b.a$g r2 = r1.h     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.egl.EGL10 r15 = r0.f29361c     // Catch:{ all -> 0x0526 }
                r27 = r3
                javax.microedition.khronos.egl.EGLDisplay r3 = r0.f29362d     // Catch:{ all -> 0x0526 }
                r28 = r4
                javax.microedition.khronos.egl.EGLConfig r4 = r0.f29364f     // Catch:{ all -> 0x0526 }
                android.graphics.SurfaceTexture r1 = r1.getSurfaceTexture()     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.egl.EGLSurface r1 = r2.a(r15, r3, r4, r1)     // Catch:{ all -> 0x0526 }
                r0.f29363e = r1     // Catch:{ all -> 0x0526 }
                r2 = 0
                goto L_0x0376
            L_0x036f:
                r27 = r3
                r28 = r4
                r2 = 0
                r0.f29363e = r2     // Catch:{ all -> 0x0526 }
            L_0x0376:
                javax.microedition.khronos.egl.EGLSurface r1 = r0.f29363e     // Catch:{ all -> 0x0526 }
                if (r1 == 0) goto L_0x0399
                javax.microedition.khronos.egl.EGLSurface r1 = r0.f29363e     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.egl.EGLSurface r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ all -> 0x0526 }
                if (r1 != r3) goto L_0x0381
                goto L_0x0399
            L_0x0381:
                javax.microedition.khronos.egl.EGL10 r1 = r0.f29361c     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.egl.EGLDisplay r3 = r0.f29362d     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.egl.EGLSurface r4 = r0.f29363e     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.egl.EGLSurface r15 = r0.f29363e     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.egl.EGLContext r2 = r0.g     // Catch:{ all -> 0x0526 }
                boolean r1 = r1.eglMakeCurrent(r3, r4, r15, r2)     // Catch:{ all -> 0x0526 }
                if (r1 != 0) goto L_0x0397
                javax.microedition.khronos.egl.EGL10 r0 = r0.f29361c     // Catch:{ all -> 0x0526 }
                r0.eglGetError()     // Catch:{ all -> 0x0526 }
                goto L_0x039e
            L_0x0397:
                r0 = 1
                goto L_0x039f
            L_0x0399:
                javax.microedition.khronos.egl.EGL10 r0 = r0.f29361c     // Catch:{ all -> 0x0526 }
                r0.eglGetError()     // Catch:{ all -> 0x0526 }
            L_0x039e:
                r0 = 0
            L_0x039f:
                if (r0 == 0) goto L_0x03b2
                com.ss.android.medialib.b.a$j r1 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0526 }
                monitor-enter(r1)     // Catch:{ all -> 0x0526 }
                r0 = 1
                r8.n = r0     // Catch:{ all -> 0x03af }
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x03af }
                r0.notifyAll()     // Catch:{ all -> 0x03af }
                monitor-exit(r1)     // Catch:{ all -> 0x03af }
                r5 = 0
                goto L_0x03ea
            L_0x03af:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x03af }
                throw r0     // Catch:{ all -> 0x0526 }
            L_0x03b2:
                com.ss.android.medialib.b.a$j r1 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0526 }
                monitor-enter(r1)     // Catch:{ all -> 0x0526 }
                r0 = 1
                r8.n = r0     // Catch:{ all -> 0x03c9 }
                r8.k = r0     // Catch:{ all -> 0x03c9 }
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x03c9 }
                r0.notifyAll()     // Catch:{ all -> 0x03c9 }
                monitor-exit(r1)     // Catch:{ all -> 0x03c9 }
                r2 = r26
            L_0x03c2:
                r3 = r27
            L_0x03c4:
                r4 = r28
                r0 = 0
                goto L_0x0040
            L_0x03c9:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x03c9 }
                throw r0     // Catch:{ all -> 0x0526 }
            L_0x03cc:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0526 }
                java.lang.String r1 = "mEglConfig not initialized"
                r0.<init>(r1)     // Catch:{ all -> 0x0526 }
                throw r0     // Catch:{ all -> 0x0526 }
            L_0x03d4:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0526 }
                java.lang.String r1 = "eglDisplay not initialized"
                r0.<init>(r1)     // Catch:{ all -> 0x0526 }
                throw r0     // Catch:{ all -> 0x0526 }
            L_0x03dc:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0526 }
                java.lang.String r1 = "egl not initialized"
                r0.<init>(r1)     // Catch:{ all -> 0x0526 }
                throw r0     // Catch:{ all -> 0x0526 }
            L_0x03e4:
                r26 = r2
                r27 = r3
                r28 = r4
            L_0x03ea:
                if (r6 == 0) goto L_0x0466
                com.ss.android.medialib.b.a$h r0 = r8.t     // Catch:{ all -> 0x0526 }
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0526 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.medialib.b.a.h.f29359a     // Catch:{ all -> 0x0526 }
                r20 = 0
                r21 = 17382(0x43e6, float:2.4357E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0526 }
                java.lang.Class<javax.microedition.khronos.opengles.GL> r23 = javax.microedition.khronos.opengles.GL.class
                r17 = r2
                r18 = r0
                r22 = r3
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0526 }
                if (r1 == 0) goto L_0x0421
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0526 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.medialib.b.a.h.f29359a     // Catch:{ all -> 0x0526 }
                r20 = 0
                r21 = 17382(0x43e6, float:2.4357E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0526 }
                java.lang.Class<javax.microedition.khronos.opengles.GL> r23 = javax.microedition.khronos.opengles.GL.class
                r17 = r2
                r18 = r0
                r22 = r3
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.opengles.GL r0 = (javax.microedition.khronos.opengles.GL) r0     // Catch:{ all -> 0x0526 }
                goto L_0x045d
            L_0x0421:
                javax.microedition.khronos.egl.EGLContext r1 = r0.g     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.opengles.GL r1 = r1.getGL()     // Catch:{ all -> 0x0526 }
                java.lang.ref.WeakReference<com.ss.android.medialib.b.a> r0 = r0.f29360b     // Catch:{ all -> 0x0526 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0526 }
                com.ss.android.medialib.b.a r0 = (com.ss.android.medialib.b.a) r0     // Catch:{ all -> 0x0526 }
                if (r0 == 0) goto L_0x045c
                com.ss.android.medialib.b.a$k r2 = r0.i     // Catch:{ all -> 0x0526 }
                if (r2 == 0) goto L_0x043b
                com.ss.android.medialib.b.a$k r1 = r0.i     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.opengles.GL r1 = r1.a()     // Catch:{ all -> 0x0526 }
            L_0x043b:
                int r2 = r0.j     // Catch:{ all -> 0x0526 }
                r2 = r2 & 3
                if (r2 == 0) goto L_0x045c
                int r2 = r0.j     // Catch:{ all -> 0x0526 }
                r3 = 1
                r2 = r2 & r3
                if (r2 == 0) goto L_0x0449
                r2 = 1
                goto L_0x044a
            L_0x0449:
                r2 = 0
            L_0x044a:
                int r0 = r0.j     // Catch:{ all -> 0x0526 }
                r3 = 2
                r0 = r0 & r3
                if (r0 == 0) goto L_0x0456
                com.ss.android.medialib.b.a$l r0 = new com.ss.android.medialib.b.a$l     // Catch:{ all -> 0x0526 }
                r0.<init>()     // Catch:{ all -> 0x0526 }
                goto L_0x0457
            L_0x0456:
                r0 = 0
            L_0x0457:
                javax.microedition.khronos.opengles.GL r0 = android.opengl.GLDebugHelper.wrap(r1, r2, r0)     // Catch:{ all -> 0x0526 }
                goto L_0x045d
            L_0x045c:
                r0 = r1
            L_0x045d:
                javax.microedition.khronos.opengles.GL10 r0 = (javax.microedition.khronos.opengles.GL10) r0     // Catch:{ all -> 0x0526 }
                com.ss.android.medialib.b.a$j r1 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0526 }
                r1.a((javax.microedition.khronos.opengles.GL10) r0)     // Catch:{ all -> 0x0526 }
                r7 = r0
                r6 = 0
            L_0x0466:
                if (r12 == 0) goto L_0x047c
                java.lang.ref.WeakReference<com.ss.android.medialib.b.a> r0 = r8.u     // Catch:{ all -> 0x0526 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0526 }
                com.ss.android.medialib.b.a r0 = (com.ss.android.medialib.b.a) r0     // Catch:{ all -> 0x0526 }
                if (r0 == 0) goto L_0x047b
                android.opengl.GLSurfaceView$Renderer r0 = r0.f2489e     // Catch:{ all -> 0x0526 }
                com.ss.android.medialib.b.a$h r1 = r8.t     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.egl.EGLConfig r1 = r1.f29364f     // Catch:{ all -> 0x0526 }
                r0.onSurfaceCreated(r7, r1)     // Catch:{ all -> 0x0526 }
            L_0x047b:
                r12 = 0
            L_0x047c:
                if (r9 == 0) goto L_0x048e
                java.lang.ref.WeakReference<com.ss.android.medialib.b.a> r0 = r8.u     // Catch:{ all -> 0x0526 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0526 }
                com.ss.android.medialib.b.a r0 = (com.ss.android.medialib.b.a) r0     // Catch:{ all -> 0x0526 }
                if (r0 == 0) goto L_0x048d
                android.opengl.GLSurfaceView$Renderer r0 = r0.f2489e     // Catch:{ all -> 0x0526 }
                r0.onSurfaceChanged(r7, r10, r11)     // Catch:{ all -> 0x0526 }
            L_0x048d:
                r9 = 0
            L_0x048e:
                java.lang.ref.WeakReference<com.ss.android.medialib.b.a> r0 = r8.u     // Catch:{ all -> 0x0526 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0526 }
                com.ss.android.medialib.b.a r0 = (com.ss.android.medialib.b.a) r0     // Catch:{ all -> 0x0526 }
                if (r0 == 0) goto L_0x049d
                android.opengl.GLSurfaceView$Renderer r0 = r0.f2489e     // Catch:{ all -> 0x0526 }
                r0.onDrawFrame(r7)     // Catch:{ all -> 0x0526 }
            L_0x049d:
                com.ss.android.medialib.b.a$h r0 = r8.t     // Catch:{ all -> 0x0526 }
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0526 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.medialib.b.a.h.f29359a     // Catch:{ all -> 0x0526 }
                r20 = 0
                r21 = 17383(0x43e7, float:2.4359E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0526 }
                java.lang.Class r23 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0526 }
                r17 = r2
                r18 = r0
                r22 = r3
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0526 }
                r2 = 12288(0x3000, float:1.7219E-41)
                if (r1 == 0) goto L_0x04d8
                r1 = 0
                java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0526 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.medialib.b.a.h.f29359a     // Catch:{ all -> 0x0526 }
                r20 = 0
                r21 = 17383(0x43e7, float:2.4359E-41)
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ all -> 0x0526 }
                java.lang.Class r23 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0526 }
                r17 = r3
                r18 = r0
                r22 = r4
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0526 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0526 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x0526 }
                goto L_0x04ee
            L_0x04d8:
                r1 = 0
                javax.microedition.khronos.egl.EGL10 r3 = r0.f29361c     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f29362d     // Catch:{ all -> 0x0526 }
                javax.microedition.khronos.egl.EGLSurface r15 = r0.f29363e     // Catch:{ all -> 0x0526 }
                boolean r3 = r3.eglSwapBuffers(r4, r15)     // Catch:{ all -> 0x0526 }
                if (r3 != 0) goto L_0x04ec
                javax.microedition.khronos.egl.EGL10 r0 = r0.f29361c     // Catch:{ all -> 0x0526 }
                int r0 = r0.eglGetError()     // Catch:{ all -> 0x0526 }
                goto L_0x04ee
            L_0x04ec:
                r0 = 12288(0x3000, float:1.7219E-41)
            L_0x04ee:
                if (r0 == r2) goto L_0x0507
                r2 = 12302(0x300e, float:1.7239E-41)
                if (r0 == r2) goto L_0x0504
                com.ss.android.medialib.b.a$j r2 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0526 }
                monitor-enter(r2)     // Catch:{ all -> 0x0526 }
                r0 = 1
                r8.k = r0     // Catch:{ all -> 0x0501 }
                com.ss.android.medialib.b.a$j r3 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0501 }
                r3.notifyAll()     // Catch:{ all -> 0x0501 }
                monitor-exit(r2)     // Catch:{ all -> 0x0501 }
                goto L_0x0508
            L_0x0501:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0501 }
                throw r0     // Catch:{ all -> 0x0526 }
            L_0x0504:
                r0 = 1
                r2 = 1
                goto L_0x050a
            L_0x0507:
                r0 = 1
            L_0x0508:
                r2 = r26
            L_0x050a:
                if (r13 == 0) goto L_0x03c2
                r3 = 1
                goto L_0x03c4
            L_0x050f:
                r1 = 0
                r5 = r0
                goto L_0x0517
            L_0x0512:
                r24 = r2
                r25 = r3
                r1 = 0
            L_0x0517:
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x0523 }
                r0.wait()     // Catch:{ all -> 0x0523 }
                r2 = r24
                r3 = r25
                r0 = 0
                goto L_0x0043
            L_0x0523:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x0523 }
                throw r0     // Catch:{ all -> 0x0526 }
            L_0x0526:
                r0 = move-exception
                com.ss.android.medialib.b.a$j r1 = com.ss.android.medialib.b.a.f2486c
                monitor-enter(r1)
                r29.d()     // Catch:{ all -> 0x0532 }
                r29.e()     // Catch:{ all -> 0x0532 }
                monitor-exit(r1)     // Catch:{ all -> 0x0532 }
                throw r0
            L_0x0532:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0532 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.b.a.i.f():void");
        }

        i(WeakReference<a> weakReference) {
            this.u = weakReference;
        }

        public final void a(int i2) {
            int i3 = i2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29365a, false, 17395, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29365a, false, 17395, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (i3 < 0 || i3 > 1) {
                throw new IllegalArgumentException("renderMode");
            } else {
                synchronized (a.f2486c) {
                    this.r = i3;
                    a.f2486c.notifyAll();
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:26|27|28|29|41|35) */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x005f, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00ad */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r12, int r13) {
            /*
                r11 = this;
                r0 = 2
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
                r8 = 0
                r1[r8] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
                r9 = 1
                r1[r9] = r2
                com.meituan.robust.ChangeQuickRedirect r3 = f29365a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r2 = java.lang.Integer.TYPE
                r6[r8] = r2
                java.lang.Class r2 = java.lang.Integer.TYPE
                r6[r9] = r2
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 17401(0x43f9, float:2.4384E-41)
                r2 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x004d
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
                r1[r8] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
                r1[r9] = r2
                com.meituan.robust.ChangeQuickRedirect r3 = f29365a
                r4 = 0
                r5 = 17401(0x43f9, float:2.4384E-41)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r0 = java.lang.Integer.TYPE
                r6[r8] = r0
                java.lang.Class r0 = java.lang.Integer.TYPE
                r6[r9] = r0
                java.lang.Class r7 = java.lang.Void.TYPE
                r2 = r11
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                return
            L_0x004d:
                com.ss.android.medialib.b.a$j r10 = com.ss.android.medialib.b.a.f2486c
                monitor-enter(r10)
                r11.p = r12     // Catch:{ all -> 0x00b7 }
                r11.q = r13     // Catch:{ all -> 0x00b7 }
                r11.s = r9     // Catch:{ all -> 0x00b7 }
                r11.g = r9     // Catch:{ all -> 0x00b7 }
                r11.h = r8     // Catch:{ all -> 0x00b7 }
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ all -> 0x00b7 }
                r0.notifyAll()     // Catch:{ all -> 0x00b7 }
            L_0x005f:
                boolean r0 = r11.f29366b     // Catch:{ all -> 0x00b7 }
                if (r0 != 0) goto L_0x00b5
                boolean r0 = r11.f29368d     // Catch:{ all -> 0x00b7 }
                if (r0 != 0) goto L_0x00b5
                boolean r0 = r11.h     // Catch:{ all -> 0x00b7 }
                if (r0 != 0) goto L_0x00b5
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x00b7 }
                com.meituan.robust.ChangeQuickRedirect r3 = f29365a     // Catch:{ all -> 0x00b7 }
                r4 = 0
                r5 = 17394(0x43f2, float:2.4374E-41)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x00b7 }
                java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b7 }
                r2 = r11
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b7 }
                if (r0 == 0) goto L_0x0094
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x00b7 }
                com.meituan.robust.ChangeQuickRedirect r3 = f29365a     // Catch:{ all -> 0x00b7 }
                r4 = 0
                r5 = 17394(0x43f2, float:2.4374E-41)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x00b7 }
                java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b7 }
                r2 = r11
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b7 }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00b7 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00b7 }
                goto L_0x00a5
            L_0x0094:
                boolean r0 = r11.l     // Catch:{ all -> 0x00b7 }
                if (r0 == 0) goto L_0x00a4
                boolean r0 = r11.m     // Catch:{ all -> 0x00b7 }
                if (r0 == 0) goto L_0x00a4
                boolean r0 = r11.g()     // Catch:{ all -> 0x00b7 }
                if (r0 == 0) goto L_0x00a4
                r0 = 1
                goto L_0x00a5
            L_0x00a4:
                r0 = 0
            L_0x00a5:
                if (r0 == 0) goto L_0x00b5
                com.ss.android.medialib.b.a$j r0 = com.ss.android.medialib.b.a.f2486c     // Catch:{ InterruptedException -> 0x00ad }
                r0.wait()     // Catch:{ InterruptedException -> 0x00ad }
                goto L_0x005f
            L_0x00ad:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00b7 }
                r0.interrupt()     // Catch:{ all -> 0x00b7 }
                goto L_0x005f
            L_0x00b5:
                monitor-exit(r10)     // Catch:{ all -> 0x00b7 }
                return
            L_0x00b7:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00b7 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.b.a.i.a(int, int):void");
        }
    }

    static class j {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29371a = null;

        /* renamed from: d  reason: collision with root package name */
        private static String f29372d = "GLThreadManager";

        /* renamed from: b  reason: collision with root package name */
        boolean f29373b;

        /* renamed from: c  reason: collision with root package name */
        i f29374c;

        /* renamed from: e  reason: collision with root package name */
        private boolean f29375e;

        /* renamed from: f  reason: collision with root package name */
        private int f29376f;
        private boolean g;
        private boolean h;

        private j() {
        }

        public final synchronized boolean a() {
            return this.h;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (!this.f29375e) {
                this.f29373b = true;
                this.f29375e = true;
            }
        }

        public final synchronized boolean b() {
            if (PatchProxy.isSupport(new Object[0], this, f29371a, false, 17408, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29371a, false, 17408, new Class[0], Boolean.TYPE)).booleanValue();
            }
            c();
            if (!this.f29373b) {
                return true;
            }
            return false;
        }

        /* synthetic */ j(byte b2) {
            this();
        }

        public final void b(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f29371a, false, 17407, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f29371a, false, 17407, new Class[]{i.class}, Void.TYPE);
                return;
            }
            if (this.f29374c == iVar) {
                this.f29374c = null;
            }
            notifyAll();
        }

        public final synchronized void a(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f29371a, false, 17405, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f29371a, false, 17405, new Class[]{i.class}, Void.TYPE);
                return;
            }
            iVar.f29366b = true;
            if (this.f29374c == iVar) {
                this.f29374c = null;
            }
            notifyAll();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void a(javax.microedition.khronos.opengles.GL10 r11) {
            /*
                r10 = this;
                monitor-enter(r10)
                r8 = 1
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x005a }
                r9 = 0
                r1[r9] = r11     // Catch:{ all -> 0x005a }
                com.meituan.robust.ChangeQuickRedirect r3 = f29371a     // Catch:{ all -> 0x005a }
                r4 = 0
                r5 = 17409(0x4401, float:2.4395E-41)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x005a }
                java.lang.Class<javax.microedition.khronos.opengles.GL10> r2 = javax.microedition.khronos.opengles.GL10.class
                r6[r9] = r2     // Catch:{ all -> 0x005a }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x005a }
                r2 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005a }
                if (r1 == 0) goto L_0x0032
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x005a }
                r1[r9] = r11     // Catch:{ all -> 0x005a }
                com.meituan.robust.ChangeQuickRedirect r3 = f29371a     // Catch:{ all -> 0x005a }
                r4 = 0
                r5 = 17409(0x4401, float:2.4395E-41)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x005a }
                java.lang.Class<javax.microedition.khronos.opengles.GL10> r0 = javax.microedition.khronos.opengles.GL10.class
                r6[r9] = r0     // Catch:{ all -> 0x005a }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x005a }
                r2 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005a }
                monitor-exit(r10)
                return
            L_0x0032:
                boolean r1 = r10.g     // Catch:{ all -> 0x005a }
                if (r1 != 0) goto L_0x0058
                r10.c()     // Catch:{ all -> 0x005a }
                r1 = 7937(0x1f01, float:1.1122E-41)
                java.lang.String r0 = r11.glGetString(r1)     // Catch:{ all -> 0x005a }
                int r1 = r10.f29376f     // Catch:{ all -> 0x005a }
                r2 = 131072(0x20000, float:1.83671E-40)
                if (r1 >= r2) goto L_0x0051
                java.lang.String r1 = "Q3Dimension MSM7500 "
                boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x005a }
                r0 = r0 ^ r8
                r10.f29373b = r0     // Catch:{ all -> 0x005a }
                r10.notifyAll()     // Catch:{ all -> 0x005a }
            L_0x0051:
                boolean r0 = r10.f29373b     // Catch:{ all -> 0x005a }
                r0 = r0 ^ r8
                r10.h = r0     // Catch:{ all -> 0x005a }
                r10.g = r8     // Catch:{ all -> 0x005a }
            L_0x0058:
                monitor-exit(r10)
                return
            L_0x005a:
                r0 = move-exception
                monitor-exit(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.b.a.j.a(javax.microedition.khronos.opengles.GL10):void");
        }
    }

    public interface k {
        GL a();
    }

    static class l extends Writer {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29377a;

        /* renamed from: b  reason: collision with root package name */
        private StringBuilder f29378b = new StringBuilder();

        l() {
        }

        private void a() {
            if (PatchProxy.isSupport(new Object[0], this, f29377a, false, 17413, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29377a, false, 17413, new Class[0], Void.TYPE);
                return;
            }
            if (this.f29378b.length() > 0) {
                this.f29378b.delete(0, this.f29378b.length());
            }
        }

        public final void close() {
            if (PatchProxy.isSupport(new Object[0], this, f29377a, false, 17410, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29377a, false, 17410, new Class[0], Void.TYPE);
                return;
            }
            a();
        }

        public final void flush() {
            if (PatchProxy.isSupport(new Object[0], this, f29377a, false, 17411, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29377a, false, 17411, new Class[0], Void.TYPE);
                return;
            }
            a();
        }

        public final void write(char[] cArr, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{cArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, f29377a, false, 17412, new Class[]{char[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, f29377a, false, 17412, new Class[]{char[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            int i3 = i2;
            for (int i4 = 0; i4 < i3; i4++) {
                char c2 = cArr[i + i4];
                if (c2 == 10) {
                    a();
                } else {
                    this.f29378b.append(c2);
                }
            }
        }
    }

    class m extends b {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public m(boolean r10) {
            /*
                r8 = this;
                com.ss.android.medialib.b.a.this = r9
                if (r10 == 0) goto L_0x0009
                r10 = 16
                r6 = 16
                goto L_0x000b
            L_0x0009:
                r10 = 0
                r6 = 0
            L_0x000b:
                r7 = 0
                r2 = 8
                r3 = 8
                r4 = 8
                r5 = 0
                r0 = r8
                r1 = r9
                r0.<init>(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.b.a.m.<init>(com.ss.android.medialib.b.a, boolean):void");
        }
    }

    public int getDebugFlags() {
        return this.j;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.l;
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f2485a, false, 17348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2485a, false, 17348, new Class[0], Void.TYPE);
            return;
        }
        setSurfaceTextureListener(this);
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f2485a, false, 17371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2485a, false, 17371, new Class[0], Void.TYPE);
        } else if (this.f2488d != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public void finalize() throws Throwable {
        if (PatchProxy.isSupport(new Object[0], this, f2485a, false, 17347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2485a, false, 17347, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (this.f2488d != null) {
                this.f2488d.c();
            }
        } finally {
            super.finalize();
        }
    }

    public int getRenderMode() {
        if (!PatchProxy.isSupport(new Object[0], this, f2485a, false, 17357, new Class[0], Integer.TYPE)) {
            return this.f2488d.a();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2485a, false, 17357, new Class[0], Integer.TYPE)).intValue();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f2485a, false, 17370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2485a, false, 17370, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2488d != null) {
            this.f2488d.c();
        }
        this.n = true;
        super.onDetachedFromWindow();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2485a, false, 17358, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2485a, false, 17358, new Class[0], Void.TYPE);
            return;
        }
        i iVar = this.f2488d;
        if (PatchProxy.isSupport(new Object[0], iVar, i.f29365a, false, 17396, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], iVar, i.f29365a, false, 17396, new Class[0], Void.TYPE);
            return;
        }
        synchronized (f2486c) {
            iVar.g = true;
            f2486c.notifyAll();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:17|18|19|20|30|26|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2485a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 17365(0x43d5, float:2.4334E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f2485a
            r5 = 0
            r6 = 17365(0x43d5, float:2.4334E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            com.ss.android.medialib.b.a$i r9 = r10.f2488d
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.medialib.b.a.i.f29365a
            r5 = 0
            r6 = 17399(0x43f7, float:2.4381E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0047
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.medialib.b.a.i.f29365a
            r5 = 0
            r6 = 17399(0x43f7, float:2.4381E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0047:
            com.ss.android.medialib.b.a$j r2 = f2486c
            monitor-enter(r2)
            r0 = 1
            r9.f29367c = r0     // Catch:{ all -> 0x006a }
            com.ss.android.medialib.b.a$j r0 = f2486c     // Catch:{ all -> 0x006a }
            r0.notifyAll()     // Catch:{ all -> 0x006a }
        L_0x0052:
            boolean r0 = r9.f29366b     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0068
            boolean r0 = r9.f29368d     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0068
            com.ss.android.medialib.b.a$j r0 = f2486c     // Catch:{ InterruptedException -> 0x0060 }
            r0.wait()     // Catch:{ InterruptedException -> 0x0060 }
            goto L_0x0052
        L_0x0060:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x006a }
            r0.interrupt()     // Catch:{ all -> 0x006a }
            goto L_0x0052
        L_0x0068:
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.b.a.b():void");
    }

    public void onAttachedToWindow() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f2485a, false, 17369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2485a, false, 17369, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (this.n && this.f2489e != null) {
            if (this.f2488d != null) {
                i2 = this.f2488d.a();
            } else {
                i2 = 1;
            }
            this.f2488d = new i(this.m);
            if (i2 != 1) {
                this.f2488d.a(i2);
            }
            this.f2488d.start();
        }
        this.n = false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:25|26|27|28|39|34|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0084 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2485a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 17366(0x43d6, float:2.4335E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f2485a
            r5 = 0
            r6 = 17366(0x43d6, float:2.4335E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            android.graphics.SurfaceTexture r1 = r9.f2487b
            if (r1 == 0) goto L_0x003f
            android.graphics.SurfaceTexture r1 = r9.getSurfaceTexture()
            android.graphics.SurfaceTexture r2 = r9.f2487b
            if (r1 == r2) goto L_0x003f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x003f
            android.graphics.SurfaceTexture r1 = r9.f2487b
            r9.setSurfaceTexture(r1)
            com.ss.android.medialib.b.a$i r1 = r9.f2488d
            r1.b()
        L_0x003f:
            com.ss.android.medialib.b.a$i r1 = r9.f2488d
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.medialib.b.a.i.f29365a
            r5 = 0
            r6 = 17400(0x43f8, float:2.4383E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0063
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.medialib.b.a.i.f29365a
            r5 = 0
            r6 = 17400(0x43f8, float:2.4383E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0063:
            com.ss.android.medialib.b.a$j r2 = f2486c
            monitor-enter(r2)
            r1.f29367c = r0     // Catch:{ all -> 0x008e }
            r3 = 1
            r1.g = r3     // Catch:{ all -> 0x008e }
            r1.h = r0     // Catch:{ all -> 0x008e }
            com.ss.android.medialib.b.a$j r0 = f2486c     // Catch:{ all -> 0x008e }
            r0.notifyAll()     // Catch:{ all -> 0x008e }
        L_0x0072:
            boolean r0 = r1.f29366b     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x008c
            boolean r0 = r1.f29368d     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x008c
            boolean r0 = r1.h     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x008c
            com.ss.android.medialib.b.a$j r0 = f2486c     // Catch:{ InterruptedException -> 0x0084 }
            r0.wait()     // Catch:{ InterruptedException -> 0x0084 }
            goto L_0x0072
        L_0x0084:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x008e }
            r0.interrupt()     // Catch:{ all -> 0x008e }
            goto L_0x0072
        L_0x008c:
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.b.a.c():void");
    }

    public void setDebugFlags(int i2) {
        this.j = i2;
    }

    public void setGLWrapper(k kVar) {
        this.i = kVar;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.l = z;
    }

    public a(Context context) {
        super(context);
        d();
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f2485a, false, 17363, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f2485a, false, 17363, new Class[]{SurfaceTexture.class}, Void.TYPE);
            return;
        }
        if (getRenderMode() != 0) {
            a();
        }
    }

    public void setEGLConfigChooser(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f2485a, false, 17352, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f2485a, false, 17352, new Class[]{e.class}, Void.TYPE);
            return;
        }
        e();
        this.f2490f = eVar2;
    }

    public void setEGLContextFactory(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f2485a, false, 17350, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f2485a, false, 17350, new Class[]{f.class}, Void.TYPE);
            return;
        }
        e();
        this.g = fVar2;
    }

    public void setEGLWindowSurfaceFactory(g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f2485a, false, 17351, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f2485a, false, 17351, new Class[]{g.class}, Void.TYPE);
            return;
        }
        e();
        this.h = gVar2;
    }

    public void setEGLConfigChooser(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2485a, false, 17353, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2485a, false, 17353, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        setEGLConfigChooser((e) new m(z));
    }

    public void setEGLContextClientVersion(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2485a, false, 17355, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2485a, false, 17355, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        e();
        this.k = i2;
    }

    public void setRenderMode(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2485a, false, 17356, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2485a, false, 17356, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f2488d.a(i2);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        if (PatchProxy.isSupport(new Object[]{renderer}, this, f2485a, false, 17349, new Class[]{GLSurfaceView.Renderer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{renderer}, this, f2485a, false, 17349, new Class[]{GLSurfaceView.Renderer.class}, Void.TYPE);
            return;
        }
        e();
        if (this.f2490f == null) {
            this.f2490f = new m(true);
        }
        if (this.g == null) {
            this.g = new c(this, (byte) 0);
        }
        if (this.h == null) {
            this.h = new d((byte) 0);
        }
        this.f2489e = renderer;
        this.f2488d = new i(this.m);
        this.f2488d.start();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:15|16|17|18|28|24|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0077 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f2485a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.SurfaceTexture> r3 = android.graphics.SurfaceTexture.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 17362(0x43d2, float:2.433E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f2485a
            r13 = 0
            r14 = 17362(0x43d2, float:2.433E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0039:
            r1 = r17
            com.ss.android.medialib.b.a$i r0 = r1.f2488d
            java.lang.Object[] r2 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.medialib.b.a.i.f29365a
            r5 = 0
            r6 = 17398(0x43f6, float:2.438E-41)
            java.lang.Class[] r7 = new java.lang.Class[r9]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r0
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x005f
            java.lang.Object[] r2 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.medialib.b.a.i.f29365a
            r5 = 0
            r6 = 17398(0x43f6, float:2.438E-41)
            java.lang.Class[] r7 = new java.lang.Class[r9]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0080
        L_0x005f:
            com.ss.android.medialib.b.a$j r2 = f2486c
            monitor-enter(r2)
            r0.f29369e = r9     // Catch:{ all -> 0x0081 }
            com.ss.android.medialib.b.a$j r3 = f2486c     // Catch:{ all -> 0x0081 }
            r3.notifyAll()     // Catch:{ all -> 0x0081 }
        L_0x0069:
            boolean r3 = r0.f29370f     // Catch:{ all -> 0x0081 }
            if (r3 != 0) goto L_0x007f
            boolean r3 = r0.f29366b     // Catch:{ all -> 0x0081 }
            if (r3 != 0) goto L_0x007f
            com.ss.android.medialib.b.a$j r3 = f2486c     // Catch:{ InterruptedException -> 0x0077 }
            r3.wait()     // Catch:{ InterruptedException -> 0x0077 }
            goto L_0x0069
        L_0x0077:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0081 }
            r3.interrupt()     // Catch:{ all -> 0x0081 }
            goto L_0x0069
        L_0x007f:
            monitor-exit(r2)     // Catch:{ all -> 0x0081 }
        L_0x0080:
            return r9
        L_0x0081:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0081 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.b.a.onSurfaceTextureDestroyed(android.graphics.SurfaceTexture):boolean");
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2485a, false, 17359, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2485a, false, 17359, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f2487b = surfaceTexture2;
        this.f2488d.b();
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2485a, false, 17360, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2485a, false, 17360, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f2488d.a(i2, i3);
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f2485a, false, 17361, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f2485a, false, 17361, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        this.f2488d.a(i2, i3);
    }
}
