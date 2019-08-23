package com.ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
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
import javax.microedition.khronos.opengles.GL10;

public class e extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f53248e;
    public static final j g = new j((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<e> f53249a = new WeakReference<>(this);

    /* renamed from: b  reason: collision with root package name */
    private boolean f53250b;

    /* renamed from: f  reason: collision with root package name */
    g f53251f;
    i h;
    public m i;
    public C0617e j;
    public f k;
    public g l;
    public k m;
    public int n;
    public int o;
    public boolean p;

    abstract class a implements C0617e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53252a;

        /* renamed from: b  reason: collision with root package name */
        protected int[] f53253b;

        /* access modifiers changed from: package-private */
        public abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public a(int[] iArr) {
            int[] iArr2;
            if (PatchProxy.isSupport(new Object[]{iArr}, this, f53252a, false, 55490, new Class[]{int[].class}, int[].class)) {
                iArr2 = (int[]) PatchProxy.accessDispatch(new Object[]{iArr}, this, f53252a, false, 55490, new Class[]{int[].class}, int[].class);
            } else if (e.this.o != 2) {
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
            this.f53253b = iArr2;
        }

        public final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay) {
            EGL10 egl102 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            if (PatchProxy.isSupport(new Object[]{egl102, eGLDisplay2}, this, f53252a, false, 55489, new Class[]{EGL10.class, EGLDisplay.class}, EGLConfig.class)) {
                return (EGLConfig) PatchProxy.accessDispatch(new Object[]{egl102, eGLDisplay2}, this, f53252a, false, 55489, new Class[]{EGL10.class, EGLDisplay.class}, EGLConfig.class);
            }
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f53253b, null, 0, iArr)) {
                e eVar = e.this;
                String stackTraceString = Log.getStackTraceString(new IllegalArgumentException("eglChooseConfig failed"));
                if (PatchProxy.isSupport(new Object[]{(byte) 0, stackTraceString}, eVar, e.f53248e, false, 55465, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
                    e eVar2 = eVar;
                    PatchProxy.accessDispatch(new Object[]{(byte) 0, stackTraceString}, eVar2, e.f53248e, false, 55465, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
                } else if (eVar.f53251f != null) {
                    eVar.f53251f.a(false, 0, 0, stackTraceString);
                }
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i > 0) {
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                if (egl10.eglChooseConfig(eGLDisplay, this.f53253b, eGLConfigArr, i, iArr)) {
                    EGLConfig a2 = a(egl102, eGLDisplay2, eGLConfigArr);
                    if (a2 != null) {
                        return a2;
                    }
                    throw new IllegalArgumentException("No config chosen");
                }
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            throw new IllegalArgumentException("No configs match configSpec");
        }
    }

    class b extends a {

        /* renamed from: d  reason: collision with root package name */
        public static ChangeQuickRedirect f53255d;

        /* renamed from: e  reason: collision with root package name */
        protected int f53256e;

        /* renamed from: f  reason: collision with root package name */
        protected int f53257f;
        protected int g;
        protected int h;
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
                com.meituan.robust.ChangeQuickRedirect r2 = f53255d
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<javax.microedition.khronos.egl.EGL10> r1 = javax.microedition.khronos.egl.EGL10.class
                r5[r10] = r1
                java.lang.Class<javax.microedition.khronos.egl.EGLDisplay> r1 = javax.microedition.khronos.egl.EGLDisplay.class
                r5[r11] = r1
                java.lang.Class<javax.microedition.khronos.egl.EGLConfig[]> r1 = javax.microedition.khronos.egl.EGLConfig[].class
                r5[r12] = r1
                java.lang.Class<javax.microedition.khronos.egl.EGLConfig> r6 = javax.microedition.khronos.egl.EGLConfig.class
                r3 = 0
                r4 = 55491(0xd8c3, float:7.776E-41)
                r1 = r14
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0052
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r15
                r0[r11] = r16
                r0[r12] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f53255d
                r3 = 0
                r4 = 55491(0xd8c3, float:7.776E-41)
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
            L_0x0052:
                int r6 = r8.length
            L_0x0053:
                if (r10 >= r6) goto L_0x00a3
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
                if (r11 < r1) goto L_0x00a0
                int r1 = r7.j
                if (r0 < r1) goto L_0x00a0
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
                int r1 = r7.f53256e
                if (r11 != r1) goto L_0x00a0
                int r1 = r7.f53257f
                if (r12 != r1) goto L_0x00a0
                int r1 = r7.g
                if (r13 != r1) goto L_0x00a0
                int r1 = r7.h
                if (r0 != r1) goto L_0x00a0
                return r9
            L_0x00a0:
                int r10 = r10 + 1
                goto L_0x0053
            L_0x00a3:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.e.b.a(javax.microedition.khronos.egl.EGL10, javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig[]):javax.microedition.khronos.egl.EGLConfig");
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2, int i3) {
            EGL10 egl102 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            EGLConfig eGLConfig2 = eGLConfig;
            if (PatchProxy.isSupport(new Object[]{egl102, eGLDisplay2, eGLConfig2, Integer.valueOf(i2), 0}, this, f53255d, false, 55492, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{egl102, eGLDisplay2, eGLConfig2, Integer.valueOf(i2), 0}, this, f53255d, false, 55492, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            if (egl102.eglGetConfigAttrib(eGLDisplay2, eGLConfig2, i2, this.l)) {
                return this.l[0];
            }
            return 0;
        }

        public b(int i2, int i3, int i4, int i5, int i6, int i7) {
            super(new int[]{12324, i2, 12323, i3, 12322, i4, 12321, i5, 12325, i6, 12326, i7, 12344});
            this.f53256e = i2;
            this.f53257f = i3;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            this.j = i7;
        }
    }

    class c implements f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53258a;

        /* renamed from: c  reason: collision with root package name */
        private int f53260c;

        private c() {
            this.f53260c = 12440;
        }

        /* synthetic */ c(e eVar, byte b2) {
            this();
        }

        public final EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            EGL10 egl102 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            EGLConfig eGLConfig2 = eGLConfig;
            if (PatchProxy.isSupport(new Object[]{egl102, eGLDisplay2, eGLConfig2}, this, f53258a, false, 55493, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class}, EGLContext.class)) {
                return (EGLContext) PatchProxy.accessDispatch(new Object[]{egl102, eGLDisplay2, eGLConfig2}, this, f53258a, false, 55493, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class}, EGLContext.class);
            }
            int[] iArr = {this.f53260c, e.this.o, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (e.this.o == 0) {
                iArr = null;
            }
            return egl102.eglCreateContext(eGLDisplay2, eGLConfig2, eGLContext, iArr);
        }

        public final void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (PatchProxy.isSupport(new Object[]{egl10, eGLDisplay, eGLContext}, this, f53258a, false, 55494, new Class[]{EGL10.class, EGLDisplay.class, EGLContext.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{egl10, eGLDisplay, eGLContext}, this, f53258a, false, 55494, new Class[]{EGL10.class, EGLDisplay.class, EGLContext.class}, Void.TYPE);
                return;
            }
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                h.a("eglDestroyContex", egl10.eglGetError());
            }
        }
    }

    static class d implements g {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53261a;

        private d() {
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        public final void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            if (PatchProxy.isSupport(new Object[]{egl10, eGLDisplay, eGLSurface}, this, f53261a, false, 55496, new Class[]{EGL10.class, EGLDisplay.class, EGLSurface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{egl10, eGLDisplay, eGLSurface}, this, f53261a, false, 55496, new Class[]{EGL10.class, EGLDisplay.class, EGLSurface.class}, Void.TYPE);
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
            if (PatchProxy.isSupport(new Object[]{egl102, eGLDisplay2, eGLConfig2, obj2}, this, f53261a, false, 55495, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class, Object.class}, EGLSurface.class)) {
                return (EGLSurface) PatchProxy.accessDispatch(new Object[]{egl102, eGLDisplay2, eGLConfig2, obj2}, this, f53261a, false, 55495, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class, Object.class}, EGLSurface.class);
            }
            try {
                eGLSurface = egl102.eglCreateWindowSurface(eGLDisplay2, eGLConfig2, obj2, null);
            } catch (IllegalArgumentException unused) {
                eGLSurface = null;
            }
            return eGLSurface;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.e$e  reason: collision with other inner class name */
    public interface C0617e {
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
        public static ChangeQuickRedirect f53262a;

        /* renamed from: b  reason: collision with root package name */
        WeakReference<e> f53263b;

        /* renamed from: c  reason: collision with root package name */
        EGL10 f53264c;

        /* renamed from: d  reason: collision with root package name */
        EGLDisplay f53265d;

        /* renamed from: e  reason: collision with root package name */
        EGLSurface f53266e;

        /* renamed from: f  reason: collision with root package name */
        EGLConfig f53267f;
        EGLContext g;

        /* access modifiers changed from: package-private */
        public void a() {
            if (PatchProxy.isSupport(new Object[0], this, f53262a, false, 55502, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53262a, false, 55502, new Class[0], Void.TYPE);
                return;
            }
            if (!(this.f53266e == null || this.f53266e == EGL10.EGL_NO_SURFACE)) {
                EGL10 egl10 = this.f53264c;
                EGLDisplay eGLDisplay = this.f53265d;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                e eVar = (e) this.f53263b.get();
                if (eVar != null) {
                    eVar.l.a(this.f53264c, this.f53265d, this.f53266e);
                }
                this.f53266e = null;
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f53262a, false, 55503, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53262a, false, 55503, new Class[0], Void.TYPE);
                return;
            }
            if (this.g != null) {
                e eVar = (e) this.f53263b.get();
                if (eVar != null) {
                    eVar.k.a(this.f53264c, this.f53265d, this.g);
                }
                this.g = null;
            }
            if (this.f53265d != null) {
                this.f53264c.eglTerminate(this.f53265d);
                this.f53265d = null;
            }
        }

        public h(WeakReference<e> weakReference) {
            this.f53263b = weakReference;
        }

        public static void a(String str, int i) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, null, f53262a, true, 55505, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, null, f53262a, true, 55505, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            throw new RuntimeException(b(str, i));
        }

        private static String b(String str, int i) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f53262a, true, 55506, new Class[]{String.class, Integer.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f53262a, true, 55506, new Class[]{String.class, Integer.TYPE}, String.class);
            }
            return str2 + " failed: " + i;
        }
    }

    static class i extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53268a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f53269b;

        /* renamed from: c  reason: collision with root package name */
        boolean f53270c;

        /* renamed from: d  reason: collision with root package name */
        boolean f53271d;

        /* renamed from: e  reason: collision with root package name */
        boolean f53272e;

        /* renamed from: f  reason: collision with root package name */
        boolean f53273f;
        boolean g = true;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private int m = 0;
        private int n = 0;
        private int o = 1;
        private boolean p;
        private ArrayList<Runnable> q = new ArrayList<>();
        private boolean r = true;
        private h s;
        private WeakReference<e> t;

        public final int a() {
            int i2;
            synchronized (e.g) {
                i2 = this.o;
            }
            return i2;
        }

        private boolean f() {
            if (this.f53271d || !this.f53272e || this.i || this.m <= 0 || this.n <= 0 || (!this.g && this.o != 1)) {
                return false;
            }
            return true;
        }

        private void d() {
            if (PatchProxy.isSupport(new Object[0], this, f53268a, false, 55509, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53268a, false, 55509, new Class[0], Void.TYPE);
                return;
            }
            if (this.j) {
                this.s.b();
                this.j = false;
                e.g.b(this);
            }
        }

        private void c() {
            if (PatchProxy.isSupport(new Object[0], this, f53268a, false, 55508, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53268a, false, 55508, new Class[0], Void.TYPE);
                return;
            }
            if (this.k) {
                this.k = false;
                h hVar = this.s;
                if (PatchProxy.isSupport(new Object[0], hVar, h.f53262a, false, 55501, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], hVar, h.f53262a, false, 55501, new Class[0], Void.TYPE);
                    return;
                }
                hVar.a();
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f53268a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 55519(0xd8df, float:7.7799E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f53268a
                r5 = 0
                r6 = 55519(0xd8df, float:7.7799E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0025:
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = com.ss.android.ugc.aweme.live.alphaplayer.e.g
                monitor-enter(r0)
                r1 = 1
                r9.h = r1     // Catch:{ all -> 0x0044 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0044 }
                r1.notifyAll()     // Catch:{ all -> 0x0044 }
            L_0x0030:
                boolean r1 = r9.f53269b     // Catch:{ all -> 0x0044 }
                if (r1 != 0) goto L_0x0042
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ InterruptedException -> 0x003a }
                r1.wait()     // Catch:{ InterruptedException -> 0x003a }
                goto L_0x0030
            L_0x003a:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0044 }
                r1.interrupt()     // Catch:{ all -> 0x0044 }
                goto L_0x0030
            L_0x0042:
                monitor-exit(r0)     // Catch:{ all -> 0x0044 }
                return
            L_0x0044:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0044 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.e.i.b():void");
        }

        public void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53268a, false, 55507, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53268a, false, 55507, new Class[0], Void.TYPE);
                return;
            }
            setName("GLThread " + getId());
            try {
                e();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                e.g.a(this);
                throw th;
            }
            e.g.a(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:147:0x02ff, code lost:
            if (r14 == null) goto L_0x0307;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0307, code lost:
            if (r12 == false) goto L_0x03df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0309, code lost:
            r0 = r8.s;
            r26 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0325, code lost:
            if (com.meituan.robust.PatchProxy.isSupport(new java.lang.Object[0], r0, com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a, false, 55498, new java.lang.Class[0], java.lang.Boolean.TYPE) == false) goto L_0x034a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0327, code lost:
            r0 = ((java.lang.Boolean) com.meituan.robust.PatchProxy.accessDispatch(new java.lang.Object[0], r0, com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a, false, 55498, new java.lang.Class[0], java.lang.Boolean.TYPE)).booleanValue();
            r27 = r3;
            r28 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x034c, code lost:
            if (r0.f53264c == null) goto L_0x03d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0350, code lost:
            if (r0.f53265d == null) goto L_0x03cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0354, code lost:
            if (r0.f53267f == null) goto L_0x03c7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0356, code lost:
            r0.a();
            r1 = (com.ss.android.ugc.aweme.live.alphaplayer.e) r0.f53263b.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0361, code lost:
            if (r1 == null) goto L_0x037b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x0363, code lost:
            r27 = r3;
            r28 = r4;
            r0.f53266e = r1.l.a(r0.f53264c, r0.f53265d, r0.f53267f, r1.getSurfaceTexture());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x037b, code lost:
            r27 = r3;
            r28 = r4;
            r0.f53266e = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0384, code lost:
            if (r0.f53266e == null) goto L_0x03a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x038a, code lost:
            if (r0.f53266e != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) goto L_0x038d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x039b, code lost:
            if (r0.f53264c.eglMakeCurrent(r0.f53265d, r0.f53266e, r0.f53266e, r0.g) != false) goto L_0x03a3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x039d, code lost:
            r0.f53264c.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x03a3, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x03a5, code lost:
            r0.f53264c.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x03aa, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x03ab, code lost:
            if (r0 != false) goto L_0x03c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x03ad, code lost:
            r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x03af, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
            r8.i = true;
            com.ss.android.ugc.aweme.live.alphaplayer.e.g.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x03b8, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x03b9, code lost:
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x03bb, code lost:
            r3 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x03c5, code lost:
            r12 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x03ce, code lost:
            throw new java.lang.RuntimeException("mEglConfig not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x03d6, code lost:
            throw new java.lang.RuntimeException("eglDisplay not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x03de, code lost:
            throw new java.lang.RuntimeException("egl not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x03df, code lost:
            r26 = r2;
            r27 = r3;
            r28 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x03e5, code lost:
            if (r5 == false) goto L_0x0463;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x03e7, code lost:
            r0 = r8.s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0401, code lost:
            if (com.meituan.robust.PatchProxy.isSupport(new java.lang.Object[0], r0, com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a, false, 55499, new java.lang.Class[0], javax.microedition.khronos.opengles.GL.class) == false) goto L_0x041e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0403, code lost:
            r0 = (javax.microedition.khronos.opengles.GL) com.meituan.robust.PatchProxy.accessDispatch(new java.lang.Object[0], r0, com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a, false, 55499, new java.lang.Class[0], javax.microedition.khronos.opengles.GL.class);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x041e, code lost:
            r1 = r0.g.getGL();
            r0 = (com.ss.android.ugc.aweme.live.alphaplayer.e) r0.f53263b.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x042c, code lost:
            if (r0 == null) goto L_0x0459;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x0430, code lost:
            if (r0.m == null) goto L_0x0438;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x0432, code lost:
            r1 = r0.m.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x043c, code lost:
            if ((r0.n & 3) == 0) goto L_0x0459;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0442, code lost:
            if ((r0.n & 1) == 0) goto L_0x0446;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0444, code lost:
            r2 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0446, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x044b, code lost:
            if ((r0.n & 2) == 0) goto L_0x0453;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x044d, code lost:
            r0 = new com.ss.android.ugc.aweme.live.alphaplayer.e.l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0453, code lost:
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x0454, code lost:
            r0 = android.opengl.GLDebugHelper.wrap(r1, r2, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x0459, code lost:
            r0 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x045a, code lost:
            r0 = (javax.microedition.khronos.opengles.GL10) r0;
            com.ss.android.ugc.aweme.live.alphaplayer.e.g.a(r0);
            r6 = r0;
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0463, code lost:
            if (r11 == false) goto L_0x0479;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0465, code lost:
            r0 = (com.ss.android.ugc.aweme.live.alphaplayer.e) r8.t.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x046d, code lost:
            if (r0 == null) goto L_0x0478;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x046f, code lost:
            r0.i.a(r6, r8.s.f53267f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x0478, code lost:
            r11 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x0479, code lost:
            if (r7 == false) goto L_0x048b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x047b, code lost:
            r0 = (com.ss.android.ugc.aweme.live.alphaplayer.e) r8.t.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x0483, code lost:
            if (r0 == null) goto L_0x048a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x0485, code lost:
            r0.i.a(r6, r9, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x048a, code lost:
            r7 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x048b, code lost:
            r0 = (com.ss.android.ugc.aweme.live.alphaplayer.e) r8.t.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x0493, code lost:
            if (r0 == null) goto L_0x049a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x0495, code lost:
            r0.i.a(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x049a, code lost:
            r0 = r8.s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x04b6, code lost:
            if (com.meituan.robust.PatchProxy.isSupport(new java.lang.Object[0], r0, com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a, false, 55500, new java.lang.Class[0], java.lang.Integer.TYPE) == false) goto L_0x04d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x04b8, code lost:
            r0 = ((java.lang.Integer) com.meituan.robust.PatchProxy.accessDispatch(new java.lang.Object[0], r0, com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a, false, 55500, new java.lang.Class[0], java.lang.Integer.TYPE)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x04e2, code lost:
            if (r0.f53264c.eglSwapBuffers(r0.f53265d, r0.f53266e) != false) goto L_0x04eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x04e4, code lost:
            r0 = r0.f53264c.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x04eb, code lost:
            r0 = 12288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x04ed, code lost:
            if (r0 == 12288) goto L_0x0506;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x04f1, code lost:
            if (r0 == 12302) goto L_0x0503;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x04f3, code lost:
            r2 = com.ss.android.ugc.aweme.live.alphaplayer.e.g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:243:0x04f5, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
            r8.i = true;
            com.ss.android.ugc.aweme.live.alphaplayer.e.g.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:247:0x04fe, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x0503, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:255:0x0507, code lost:
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:256:0x0509, code lost:
            if (r13 == false) goto L_0x03bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:257:0x050b, code lost:
            r3 = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void e() throws java.lang.InterruptedException {
            /*
                r29 = this;
                r8 = r29
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f53268a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 55510(0xd8d6, float:7.7786E-41)
                r2 = r29
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0029
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f53268a
                r4 = 0
                r5 = 55510(0xd8d6, float:7.7786E-41)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r2 = r29
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                return
            L_0x0029:
                com.ss.android.ugc.aweme.live.alphaplayer.e$h r1 = new com.ss.android.ugc.aweme.live.alphaplayer.e$h
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.live.alphaplayer.e> r2 = r8.t
                r1.<init>(r2)
                r8.s = r1
                r8.j = r0
                r8.k = r0
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
            L_0x0041:
                r14 = 0
            L_0x0042:
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r15 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0525 }
                monitor-enter(r15)     // Catch:{ all -> 0x0525 }
            L_0x0045:
                boolean r1 = r8.h     // Catch:{ all -> 0x0522 }
                if (r1 == 0) goto L_0x0058
                monitor-exit(r15)     // Catch:{ all -> 0x0522 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.g
                monitor-enter(r1)
                r29.c()     // Catch:{ all -> 0x0055 }
                r29.d()     // Catch:{ all -> 0x0055 }
                monitor-exit(r1)     // Catch:{ all -> 0x0055 }
                return
            L_0x0055:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0055 }
                throw r0
            L_0x0058:
                java.util.ArrayList<java.lang.Runnable> r1 = r8.q     // Catch:{ all -> 0x0522 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0522 }
                if (r1 != 0) goto L_0x006c
                java.util.ArrayList<java.lang.Runnable> r1 = r8.q     // Catch:{ all -> 0x0522 }
                r14 = 0
                java.lang.Object r1 = r1.remove(r14)     // Catch:{ all -> 0x0522 }
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0522 }
                r14 = r1
                goto L_0x02fe
            L_0x006c:
                boolean r1 = r8.f53271d     // Catch:{ all -> 0x0522 }
                boolean r0 = r8.f53270c     // Catch:{ all -> 0x0522 }
                if (r1 == r0) goto L_0x007e
                boolean r0 = r8.f53270c     // Catch:{ all -> 0x0522 }
                boolean r1 = r8.f53270c     // Catch:{ all -> 0x0522 }
                r8.f53271d = r1     // Catch:{ all -> 0x0522 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0522 }
                r1.notifyAll()     // Catch:{ all -> 0x0522 }
                goto L_0x007f
            L_0x007e:
                r0 = 0
            L_0x007f:
                boolean r1 = r8.l     // Catch:{ all -> 0x0522 }
                if (r1 == 0) goto L_0x008d
                r29.c()     // Catch:{ all -> 0x0522 }
                r29.d()     // Catch:{ all -> 0x0522 }
                r1 = 0
                r8.l = r1     // Catch:{ all -> 0x0522 }
                r4 = 1
            L_0x008d:
                if (r2 == 0) goto L_0x0096
                r29.c()     // Catch:{ all -> 0x0522 }
                r29.d()     // Catch:{ all -> 0x0522 }
                r2 = 0
            L_0x0096:
                if (r0 == 0) goto L_0x009f
                boolean r1 = r8.k     // Catch:{ all -> 0x0522 }
                if (r1 == 0) goto L_0x009f
                r29.c()     // Catch:{ all -> 0x0522 }
            L_0x009f:
                if (r0 == 0) goto L_0x00c0
                boolean r1 = r8.j     // Catch:{ all -> 0x0522 }
                if (r1 == 0) goto L_0x00c0
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.live.alphaplayer.e> r1 = r8.t     // Catch:{ all -> 0x0522 }
                java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0522 }
                com.ss.android.ugc.aweme.live.alphaplayer.e r1 = (com.ss.android.ugc.aweme.live.alphaplayer.e) r1     // Catch:{ all -> 0x0522 }
                if (r1 != 0) goto L_0x00b1
                r1 = 0
                goto L_0x00b3
            L_0x00b1:
                boolean r1 = r1.p     // Catch:{ all -> 0x0522 }
            L_0x00b3:
                if (r1 == 0) goto L_0x00bd
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0522 }
                boolean r1 = r1.a()     // Catch:{ all -> 0x0522 }
                if (r1 == 0) goto L_0x00c0
            L_0x00bd:
                r29.d()     // Catch:{ all -> 0x0522 }
            L_0x00c0:
                if (r0 == 0) goto L_0x00cf
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0522 }
                boolean r0 = r0.b()     // Catch:{ all -> 0x0522 }
                if (r0 == 0) goto L_0x00cf
                com.ss.android.ugc.aweme.live.alphaplayer.e$h r0 = r8.s     // Catch:{ all -> 0x0522 }
                r0.b()     // Catch:{ all -> 0x0522 }
            L_0x00cf:
                boolean r0 = r8.f53272e     // Catch:{ all -> 0x0522 }
                if (r0 != 0) goto L_0x00e9
                boolean r0 = r8.f53273f     // Catch:{ all -> 0x0522 }
                if (r0 != 0) goto L_0x00e9
                boolean r0 = r8.k     // Catch:{ all -> 0x0522 }
                if (r0 == 0) goto L_0x00de
                r29.c()     // Catch:{ all -> 0x0522 }
            L_0x00de:
                r0 = 1
                r8.f53273f = r0     // Catch:{ all -> 0x0522 }
                r0 = 0
                r8.i = r0     // Catch:{ all -> 0x0522 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0522 }
                r0.notifyAll()     // Catch:{ all -> 0x0522 }
            L_0x00e9:
                boolean r0 = r8.f53272e     // Catch:{ all -> 0x0522 }
                if (r0 == 0) goto L_0x00f9
                boolean r0 = r8.f53273f     // Catch:{ all -> 0x0522 }
                if (r0 == 0) goto L_0x00f9
                r0 = 0
                r8.f53273f = r0     // Catch:{ all -> 0x0522 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0522 }
                r0.notifyAll()     // Catch:{ all -> 0x0522 }
            L_0x00f9:
                if (r3 == 0) goto L_0x0105
                r0 = 1
                r8.p = r0     // Catch:{ all -> 0x0522 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0522 }
                r0.notifyAll()     // Catch:{ all -> 0x0522 }
                r3 = 0
                r13 = 0
            L_0x0105:
                boolean r0 = r29.f()     // Catch:{ all -> 0x0522 }
                if (r0 == 0) goto L_0x0511
                boolean r0 = r8.j     // Catch:{ all -> 0x0522 }
                if (r0 != 0) goto L_0x02ca
                if (r4 == 0) goto L_0x0118
                r24 = r2
                r25 = r3
                r4 = 0
                goto L_0x02ce
            L_0x0118:
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0522 }
                r24 = r2
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0522 }
                r16 = 0
                r2[r16] = r8     // Catch:{ all -> 0x0522 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.live.alphaplayer.e.j.f53274a     // Catch:{ all -> 0x0522 }
                r20 = 0
                r21 = 55523(0xd8e3, float:7.7804E-41)
                r25 = r3
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0522 }
                java.lang.Class<com.ss.android.ugc.aweme.live.alphaplayer.e$i> r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.i.class
                r3[r16] = r1     // Catch:{ all -> 0x0522 }
                java.lang.Class r23 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0522 }
                r17 = r2
                r18 = r0
                r22 = r3
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0522 }
                if (r1 == 0) goto L_0x0168
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0522 }
                r3 = 0
                r2[r3] = r8     // Catch:{ all -> 0x0522 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.live.alphaplayer.e.j.f53274a     // Catch:{ all -> 0x0522 }
                r20 = 0
                r21 = 55523(0xd8e3, float:7.7804E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0522 }
                java.lang.Class<com.ss.android.ugc.aweme.live.alphaplayer.e$i> r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.i.class
                r16 = 0
                r3[r16] = r1     // Catch:{ all -> 0x0522 }
                java.lang.Class r23 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0522 }
                r17 = r2
                r18 = r0
                r22 = r3
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0522 }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0522 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0522 }
                goto L_0x01c1
            L_0x0168:
                com.ss.android.ugc.aweme.live.alphaplayer.e$i r1 = r0.f53277c     // Catch:{ all -> 0x0522 }
                if (r1 == r8) goto L_0x01bb
                com.ss.android.ugc.aweme.live.alphaplayer.e$i r1 = r0.f53277c     // Catch:{ all -> 0x0522 }
                if (r1 != 0) goto L_0x0171
                goto L_0x01bb
            L_0x0171:
                r0.c()     // Catch:{ all -> 0x0522 }
                boolean r1 = r0.f53276b     // Catch:{ all -> 0x0522 }
                if (r1 == 0) goto L_0x0179
                goto L_0x01c0
            L_0x0179:
                com.ss.android.ugc.aweme.live.alphaplayer.e$i r1 = r0.f53277c     // Catch:{ all -> 0x0522 }
                if (r1 == 0) goto L_0x01b9
                com.ss.android.ugc.aweme.live.alphaplayer.e$i r0 = r0.f53277c     // Catch:{ all -> 0x0522 }
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0522 }
                com.meituan.robust.ChangeQuickRedirect r19 = f53268a     // Catch:{ all -> 0x0522 }
                r20 = 0
                r21 = 55520(0xd8e0, float:7.78E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0522 }
                java.lang.Class r23 = java.lang.Void.TYPE     // Catch:{ all -> 0x0522 }
                r17 = r2
                r18 = r0
                r22 = r3
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0522 }
                if (r1 == 0) goto L_0x01b1
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0522 }
                com.meituan.robust.ChangeQuickRedirect r19 = f53268a     // Catch:{ all -> 0x0522 }
                r20 = 0
                r21 = 55520(0xd8e0, float:7.78E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0522 }
                java.lang.Class r23 = java.lang.Void.TYPE     // Catch:{ all -> 0x0522 }
                r17 = r2
                r18 = r0
                r22 = r3
                com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0522 }
                goto L_0x01b9
            L_0x01b1:
                r1 = 1
                r0.l = r1     // Catch:{ all -> 0x0522 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0522 }
                r0.notifyAll()     // Catch:{ all -> 0x0522 }
            L_0x01b9:
                r0 = 0
                goto L_0x01c1
            L_0x01bb:
                r0.f53277c = r8     // Catch:{ all -> 0x0522 }
                r0.notifyAll()     // Catch:{ all -> 0x0522 }
            L_0x01c0:
                r0 = 1
            L_0x01c1:
                if (r0 == 0) goto L_0x02ce
                com.ss.android.ugc.aweme.live.alphaplayer.e$h r0 = r8.s     // Catch:{ RuntimeException -> 0x02c3 }
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ RuntimeException -> 0x02c3 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a     // Catch:{ RuntimeException -> 0x02c3 }
                r20 = 0
                r21 = 55497(0xd8c9, float:7.7768E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ RuntimeException -> 0x02c3 }
                java.lang.Class r23 = java.lang.Void.TYPE     // Catch:{ RuntimeException -> 0x02c3 }
                r17 = r2
                r18 = r0
                r22 = r3
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ RuntimeException -> 0x02c3 }
                if (r1 == 0) goto L_0x01f9
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ RuntimeException -> 0x02c3 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a     // Catch:{ RuntimeException -> 0x02c3 }
                r20 = 0
                r21 = 55497(0xd8c9, float:7.7768E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ RuntimeException -> 0x02c3 }
                java.lang.Class r23 = java.lang.Void.TYPE     // Catch:{ RuntimeException -> 0x02c3 }
                r17 = r2
                r18 = r0
                r22 = r3
                com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ RuntimeException -> 0x02c3 }
            L_0x01f6:
                r0 = 1
                goto L_0x02aa
            L_0x01f9:
                javax.microedition.khronos.egl.EGL r1 = javax.microedition.khronos.egl.EGLContext.getEGL()     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGL10 r1 = (javax.microedition.khronos.egl.EGL10) r1     // Catch:{ RuntimeException -> 0x02c3 }
                r0.f53264c = r1     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGL10 r1 = r0.f53264c     // Catch:{ RuntimeException -> 0x02c3 }
                java.lang.Object r2 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGLDisplay r1 = r1.eglGetDisplay(r2)     // Catch:{ RuntimeException -> 0x02c3 }
                r0.f53265d = r1     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGLDisplay r1 = r0.f53265d     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGLDisplay r2 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY     // Catch:{ RuntimeException -> 0x02c3 }
                if (r1 == r2) goto L_0x02bb
                r1 = 2
                int[] r2 = new int[r1]     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGL10 r1 = r0.f53264c     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGLDisplay r3 = r0.f53265d     // Catch:{ RuntimeException -> 0x02c3 }
                boolean r1 = r1.eglInitialize(r3, r2)     // Catch:{ RuntimeException -> 0x02c3 }
                if (r1 == 0) goto L_0x02b3
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.live.alphaplayer.e> r1 = r0.f53263b     // Catch:{ RuntimeException -> 0x02c3 }
                java.lang.Object r1 = r1.get()     // Catch:{ RuntimeException -> 0x02c3 }
                com.ss.android.ugc.aweme.live.alphaplayer.e r1 = (com.ss.android.ugc.aweme.live.alphaplayer.e) r1     // Catch:{ RuntimeException -> 0x02c3 }
                if (r1 != 0) goto L_0x022e
                r2 = 0
                r0.f53267f = r2     // Catch:{ RuntimeException -> 0x02c3 }
                r0.g = r2     // Catch:{ RuntimeException -> 0x02c3 }
                goto L_0x0248
            L_0x022e:
                com.ss.android.ugc.aweme.live.alphaplayer.e$e r2 = r1.j     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGL10 r3 = r0.f53264c     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGLDisplay r11 = r0.f53265d     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGLConfig r2 = r2.a(r3, r11)     // Catch:{ RuntimeException -> 0x02c3 }
                r0.f53267f = r2     // Catch:{ RuntimeException -> 0x02c3 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$f r1 = r1.k     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGL10 r2 = r0.f53264c     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGLDisplay r3 = r0.f53265d     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGLConfig r11 = r0.f53267f     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGLContext r1 = r1.a((javax.microedition.khronos.egl.EGL10) r2, (javax.microedition.khronos.egl.EGLDisplay) r3, (javax.microedition.khronos.egl.EGLConfig) r11)     // Catch:{ RuntimeException -> 0x02c3 }
                r0.g = r1     // Catch:{ RuntimeException -> 0x02c3 }
            L_0x0248:
                javax.microedition.khronos.egl.EGLContext r1 = r0.g     // Catch:{ RuntimeException -> 0x02c3 }
                if (r1 == 0) goto L_0x0255
                javax.microedition.khronos.egl.EGLContext r1 = r0.g     // Catch:{ RuntimeException -> 0x02c3 }
                javax.microedition.khronos.egl.EGLContext r2 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ RuntimeException -> 0x02c3 }
                if (r1 != r2) goto L_0x0253
                goto L_0x0255
            L_0x0253:
                r1 = 0
                goto L_0x02a6
            L_0x0255:
                r1 = 0
                r0.g = r1     // Catch:{ RuntimeException -> 0x02c3 }
                java.lang.String r1 = "createContext"
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ RuntimeException -> 0x02c3 }
                r11 = 0
                r3[r11] = r1     // Catch:{ RuntimeException -> 0x02c3 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a     // Catch:{ RuntimeException -> 0x02c3 }
                r20 = 0
                r21 = 55504(0xd8d0, float:7.7778E-41)
                java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ RuntimeException -> 0x02c3 }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r16 = 0
                r11[r16] = r2     // Catch:{ RuntimeException -> 0x02c3 }
                java.lang.Class r23 = java.lang.Void.TYPE     // Catch:{ RuntimeException -> 0x02c3 }
                r17 = r3
                r18 = r0
                r22 = r11
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ RuntimeException -> 0x02c3 }
                if (r2 == 0) goto L_0x029c
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ RuntimeException -> 0x02c3 }
                r11 = 0
                r3[r11] = r1     // Catch:{ RuntimeException -> 0x02c3 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a     // Catch:{ RuntimeException -> 0x02c3 }
                r20 = 0
                r21 = 55504(0xd8d0, float:7.7778E-41)
                java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ RuntimeException -> 0x02c3 }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r11] = r2     // Catch:{ RuntimeException -> 0x02c3 }
                java.lang.Class r23 = java.lang.Void.TYPE     // Catch:{ RuntimeException -> 0x02c3 }
                r17 = r3
                r18 = r0
                r22 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ RuntimeException -> 0x02c3 }
                goto L_0x0253
            L_0x029c:
                javax.microedition.khronos.egl.EGL10 r2 = r0.f53264c     // Catch:{ RuntimeException -> 0x02c3 }
                int r2 = r2.eglGetError()     // Catch:{ RuntimeException -> 0x02c3 }
                com.ss.android.ugc.aweme.live.alphaplayer.e.h.a(r1, r2)     // Catch:{ RuntimeException -> 0x02c3 }
                goto L_0x0253
            L_0x02a6:
                r0.f53266e = r1     // Catch:{ RuntimeException -> 0x02c3 }
                goto L_0x01f6
            L_0x02aa:
                r8.j = r0     // Catch:{ all -> 0x0522 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0522 }
                r0.notifyAll()     // Catch:{ all -> 0x0522 }
                r11 = 1
                goto L_0x02ce
            L_0x02b3:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x02c3 }
                java.lang.String r1 = "eglInitialize failed"
                r0.<init>(r1)     // Catch:{ RuntimeException -> 0x02c3 }
                throw r0     // Catch:{ RuntimeException -> 0x02c3 }
            L_0x02bb:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x02c3 }
                java.lang.String r1 = "eglGetDisplay failed"
                r0.<init>(r1)     // Catch:{ RuntimeException -> 0x02c3 }
                throw r0     // Catch:{ RuntimeException -> 0x02c3 }
            L_0x02c3:
                r0 = move-exception
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0522 }
                r1.b(r8)     // Catch:{ all -> 0x0522 }
                throw r0     // Catch:{ all -> 0x0522 }
            L_0x02ca:
                r24 = r2
                r25 = r3
            L_0x02ce:
                boolean r0 = r8.j     // Catch:{ all -> 0x0522 }
                if (r0 == 0) goto L_0x02dd
                boolean r0 = r8.k     // Catch:{ all -> 0x0522 }
                if (r0 != 0) goto L_0x02dd
                r0 = 1
                r8.k = r0     // Catch:{ all -> 0x0522 }
                r0 = 1
                r5 = 1
                r12 = 1
                goto L_0x02de
            L_0x02dd:
                r0 = r7
            L_0x02de:
                boolean r1 = r8.k     // Catch:{ all -> 0x0522 }
                if (r1 == 0) goto L_0x050e
                boolean r1 = r8.r     // Catch:{ all -> 0x0522 }
                if (r1 == 0) goto L_0x02f1
                int r9 = r8.m     // Catch:{ all -> 0x0522 }
                int r10 = r8.n     // Catch:{ all -> 0x0522 }
                r1 = 0
                r8.r = r1     // Catch:{ all -> 0x0522 }
                r0 = 1
                r12 = 1
                r13 = 1
                goto L_0x02f2
            L_0x02f1:
                r1 = 0
            L_0x02f2:
                r8.g = r1     // Catch:{ all -> 0x0522 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0522 }
                r1.notifyAll()     // Catch:{ all -> 0x0522 }
                r7 = r0
                r2 = r24
                r3 = r25
            L_0x02fe:
                monitor-exit(r15)     // Catch:{ all -> 0x0522 }
                if (r14 == 0) goto L_0x0307
                r14.run()     // Catch:{ all -> 0x0525 }
                r0 = 0
                goto L_0x0041
            L_0x0307:
                if (r12 == 0) goto L_0x03df
                com.ss.android.ugc.aweme.live.alphaplayer.e$h r0 = r8.s     // Catch:{ all -> 0x0525 }
                r1 = 0
                java.lang.Object[] r15 = new java.lang.Object[r1]     // Catch:{ all -> 0x0525 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a     // Catch:{ all -> 0x0525 }
                r20 = 0
                r21 = 55498(0xd8ca, float:7.7769E-41)
                r26 = r2
                java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0525 }
                java.lang.Class r23 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0525 }
                r17 = r15
                r18 = r0
                r22 = r2
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0525 }
                if (r1 == 0) goto L_0x034a
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0525 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a     // Catch:{ all -> 0x0525 }
                r20 = 0
                r21 = 55498(0xd8ca, float:7.7769E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ all -> 0x0525 }
                java.lang.Class r23 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0525 }
                r17 = r2
                r18 = r0
                r22 = r15
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0525 }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0525 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0525 }
                r27 = r3
                r28 = r4
                goto L_0x03ab
            L_0x034a:
                javax.microedition.khronos.egl.EGL10 r1 = r0.f53264c     // Catch:{ all -> 0x0525 }
                if (r1 == 0) goto L_0x03d7
                javax.microedition.khronos.egl.EGLDisplay r1 = r0.f53265d     // Catch:{ all -> 0x0525 }
                if (r1 == 0) goto L_0x03cf
                javax.microedition.khronos.egl.EGLConfig r1 = r0.f53267f     // Catch:{ all -> 0x0525 }
                if (r1 == 0) goto L_0x03c7
                r0.a()     // Catch:{ all -> 0x0525 }
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.live.alphaplayer.e> r1 = r0.f53263b     // Catch:{ all -> 0x0525 }
                java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0525 }
                com.ss.android.ugc.aweme.live.alphaplayer.e r1 = (com.ss.android.ugc.aweme.live.alphaplayer.e) r1     // Catch:{ all -> 0x0525 }
                if (r1 == 0) goto L_0x037b
                com.ss.android.ugc.aweme.live.alphaplayer.e$g r2 = r1.l     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.egl.EGL10 r15 = r0.f53264c     // Catch:{ all -> 0x0525 }
                r27 = r3
                javax.microedition.khronos.egl.EGLDisplay r3 = r0.f53265d     // Catch:{ all -> 0x0525 }
                r28 = r4
                javax.microedition.khronos.egl.EGLConfig r4 = r0.f53267f     // Catch:{ all -> 0x0525 }
                android.graphics.SurfaceTexture r1 = r1.getSurfaceTexture()     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.egl.EGLSurface r1 = r2.a(r15, r3, r4, r1)     // Catch:{ all -> 0x0525 }
                r0.f53266e = r1     // Catch:{ all -> 0x0525 }
                r2 = 0
                goto L_0x0382
            L_0x037b:
                r27 = r3
                r28 = r4
                r2 = 0
                r0.f53266e = r2     // Catch:{ all -> 0x0525 }
            L_0x0382:
                javax.microedition.khronos.egl.EGLSurface r1 = r0.f53266e     // Catch:{ all -> 0x0525 }
                if (r1 == 0) goto L_0x03a5
                javax.microedition.khronos.egl.EGLSurface r1 = r0.f53266e     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.egl.EGLSurface r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ all -> 0x0525 }
                if (r1 != r3) goto L_0x038d
                goto L_0x03a5
            L_0x038d:
                javax.microedition.khronos.egl.EGL10 r1 = r0.f53264c     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.egl.EGLDisplay r3 = r0.f53265d     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.egl.EGLSurface r4 = r0.f53266e     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.egl.EGLSurface r15 = r0.f53266e     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.egl.EGLContext r2 = r0.g     // Catch:{ all -> 0x0525 }
                boolean r1 = r1.eglMakeCurrent(r3, r4, r15, r2)     // Catch:{ all -> 0x0525 }
                if (r1 != 0) goto L_0x03a3
                javax.microedition.khronos.egl.EGL10 r0 = r0.f53264c     // Catch:{ all -> 0x0525 }
                r0.eglGetError()     // Catch:{ all -> 0x0525 }
                goto L_0x03aa
            L_0x03a3:
                r0 = 1
                goto L_0x03ab
            L_0x03a5:
                javax.microedition.khronos.egl.EGL10 r0 = r0.f53264c     // Catch:{ all -> 0x0525 }
                r0.eglGetError()     // Catch:{ all -> 0x0525 }
            L_0x03aa:
                r0 = 0
            L_0x03ab:
                if (r0 != 0) goto L_0x03c5
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0525 }
                monitor-enter(r1)     // Catch:{ all -> 0x0525 }
                r0 = 1
                r8.i = r0     // Catch:{ all -> 0x03c2 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x03c2 }
                r0.notifyAll()     // Catch:{ all -> 0x03c2 }
                monitor-exit(r1)     // Catch:{ all -> 0x03c2 }
                r2 = r26
            L_0x03bb:
                r3 = r27
            L_0x03bd:
                r4 = r28
                r0 = 0
                goto L_0x0042
            L_0x03c2:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x03c2 }
                throw r0     // Catch:{ all -> 0x0525 }
            L_0x03c5:
                r12 = 0
                goto L_0x03e5
            L_0x03c7:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0525 }
                java.lang.String r1 = "mEglConfig not initialized"
                r0.<init>(r1)     // Catch:{ all -> 0x0525 }
                throw r0     // Catch:{ all -> 0x0525 }
            L_0x03cf:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0525 }
                java.lang.String r1 = "eglDisplay not initialized"
                r0.<init>(r1)     // Catch:{ all -> 0x0525 }
                throw r0     // Catch:{ all -> 0x0525 }
            L_0x03d7:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0525 }
                java.lang.String r1 = "egl not initialized"
                r0.<init>(r1)     // Catch:{ all -> 0x0525 }
                throw r0     // Catch:{ all -> 0x0525 }
            L_0x03df:
                r26 = r2
                r27 = r3
                r28 = r4
            L_0x03e5:
                if (r5 == 0) goto L_0x0463
                com.ss.android.ugc.aweme.live.alphaplayer.e$h r0 = r8.s     // Catch:{ all -> 0x0525 }
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0525 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a     // Catch:{ all -> 0x0525 }
                r20 = 0
                r21 = 55499(0xd8cb, float:7.777E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0525 }
                java.lang.Class<javax.microedition.khronos.opengles.GL> r23 = javax.microedition.khronos.opengles.GL.class
                r17 = r2
                r18 = r0
                r22 = r3
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0525 }
                if (r1 == 0) goto L_0x041e
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0525 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a     // Catch:{ all -> 0x0525 }
                r20 = 0
                r21 = 55499(0xd8cb, float:7.777E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0525 }
                java.lang.Class<javax.microedition.khronos.opengles.GL> r23 = javax.microedition.khronos.opengles.GL.class
                r17 = r2
                r18 = r0
                r22 = r3
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.opengles.GL r0 = (javax.microedition.khronos.opengles.GL) r0     // Catch:{ all -> 0x0525 }
                goto L_0x045a
            L_0x041e:
                javax.microedition.khronos.egl.EGLContext r1 = r0.g     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.opengles.GL r1 = r1.getGL()     // Catch:{ all -> 0x0525 }
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.live.alphaplayer.e> r0 = r0.f53263b     // Catch:{ all -> 0x0525 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0525 }
                com.ss.android.ugc.aweme.live.alphaplayer.e r0 = (com.ss.android.ugc.aweme.live.alphaplayer.e) r0     // Catch:{ all -> 0x0525 }
                if (r0 == 0) goto L_0x0459
                com.ss.android.ugc.aweme.live.alphaplayer.e$k r2 = r0.m     // Catch:{ all -> 0x0525 }
                if (r2 == 0) goto L_0x0438
                com.ss.android.ugc.aweme.live.alphaplayer.e$k r1 = r0.m     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.opengles.GL r1 = r1.a()     // Catch:{ all -> 0x0525 }
            L_0x0438:
                int r2 = r0.n     // Catch:{ all -> 0x0525 }
                r2 = r2 & 3
                if (r2 == 0) goto L_0x0459
                int r2 = r0.n     // Catch:{ all -> 0x0525 }
                r3 = 1
                r2 = r2 & r3
                if (r2 == 0) goto L_0x0446
                r2 = 1
                goto L_0x0447
            L_0x0446:
                r2 = 0
            L_0x0447:
                int r0 = r0.n     // Catch:{ all -> 0x0525 }
                r3 = 2
                r0 = r0 & r3
                if (r0 == 0) goto L_0x0453
                com.ss.android.ugc.aweme.live.alphaplayer.e$l r0 = new com.ss.android.ugc.aweme.live.alphaplayer.e$l     // Catch:{ all -> 0x0525 }
                r0.<init>()     // Catch:{ all -> 0x0525 }
                goto L_0x0454
            L_0x0453:
                r0 = 0
            L_0x0454:
                javax.microedition.khronos.opengles.GL r0 = android.opengl.GLDebugHelper.wrap(r1, r2, r0)     // Catch:{ all -> 0x0525 }
                goto L_0x045a
            L_0x0459:
                r0 = r1
            L_0x045a:
                javax.microedition.khronos.opengles.GL10 r0 = (javax.microedition.khronos.opengles.GL10) r0     // Catch:{ all -> 0x0525 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0525 }
                r1.a((javax.microedition.khronos.opengles.GL10) r0)     // Catch:{ all -> 0x0525 }
                r6 = r0
                r5 = 0
            L_0x0463:
                if (r11 == 0) goto L_0x0479
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.live.alphaplayer.e> r0 = r8.t     // Catch:{ all -> 0x0525 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0525 }
                com.ss.android.ugc.aweme.live.alphaplayer.e r0 = (com.ss.android.ugc.aweme.live.alphaplayer.e) r0     // Catch:{ all -> 0x0525 }
                if (r0 == 0) goto L_0x0478
                com.ss.android.ugc.aweme.live.alphaplayer.e$m r0 = r0.i     // Catch:{ all -> 0x0525 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$h r1 = r8.s     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.egl.EGLConfig r1 = r1.f53267f     // Catch:{ all -> 0x0525 }
                r0.a(r6, r1)     // Catch:{ all -> 0x0525 }
            L_0x0478:
                r11 = 0
            L_0x0479:
                if (r7 == 0) goto L_0x048b
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.live.alphaplayer.e> r0 = r8.t     // Catch:{ all -> 0x0525 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0525 }
                com.ss.android.ugc.aweme.live.alphaplayer.e r0 = (com.ss.android.ugc.aweme.live.alphaplayer.e) r0     // Catch:{ all -> 0x0525 }
                if (r0 == 0) goto L_0x048a
                com.ss.android.ugc.aweme.live.alphaplayer.e$m r0 = r0.i     // Catch:{ all -> 0x0525 }
                r0.a(r6, r9, r10)     // Catch:{ all -> 0x0525 }
            L_0x048a:
                r7 = 0
            L_0x048b:
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.live.alphaplayer.e> r0 = r8.t     // Catch:{ all -> 0x0525 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0525 }
                com.ss.android.ugc.aweme.live.alphaplayer.e r0 = (com.ss.android.ugc.aweme.live.alphaplayer.e) r0     // Catch:{ all -> 0x0525 }
                if (r0 == 0) goto L_0x049a
                com.ss.android.ugc.aweme.live.alphaplayer.e$m r0 = r0.i     // Catch:{ all -> 0x0525 }
                r0.a(r6)     // Catch:{ all -> 0x0525 }
            L_0x049a:
                com.ss.android.ugc.aweme.live.alphaplayer.e$h r0 = r8.s     // Catch:{ all -> 0x0525 }
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0525 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a     // Catch:{ all -> 0x0525 }
                r20 = 0
                r21 = 55500(0xd8cc, float:7.7772E-41)
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0525 }
                java.lang.Class r23 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0525 }
                r17 = r2
                r18 = r0
                r22 = r3
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0525 }
                r2 = 12288(0x3000, float:1.7219E-41)
                if (r1 == 0) goto L_0x04d7
                r1 = 0
                java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0525 }
                com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.live.alphaplayer.e.h.f53262a     // Catch:{ all -> 0x0525 }
                r20 = 0
                r21 = 55500(0xd8cc, float:7.7772E-41)
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ all -> 0x0525 }
                java.lang.Class r23 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0525 }
                r17 = r3
                r18 = r0
                r22 = r4
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0525 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0525 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x0525 }
                goto L_0x04ed
            L_0x04d7:
                r1 = 0
                javax.microedition.khronos.egl.EGL10 r3 = r0.f53264c     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f53265d     // Catch:{ all -> 0x0525 }
                javax.microedition.khronos.egl.EGLSurface r15 = r0.f53266e     // Catch:{ all -> 0x0525 }
                boolean r3 = r3.eglSwapBuffers(r4, r15)     // Catch:{ all -> 0x0525 }
                if (r3 != 0) goto L_0x04eb
                javax.microedition.khronos.egl.EGL10 r0 = r0.f53264c     // Catch:{ all -> 0x0525 }
                int r0 = r0.eglGetError()     // Catch:{ all -> 0x0525 }
                goto L_0x04ed
            L_0x04eb:
                r0 = 12288(0x3000, float:1.7219E-41)
            L_0x04ed:
                if (r0 == r2) goto L_0x0506
                r2 = 12302(0x300e, float:1.7239E-41)
                if (r0 == r2) goto L_0x0503
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r2 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0525 }
                monitor-enter(r2)     // Catch:{ all -> 0x0525 }
                r0 = 1
                r8.i = r0     // Catch:{ all -> 0x0500 }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r3 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0500 }
                r3.notifyAll()     // Catch:{ all -> 0x0500 }
                monitor-exit(r2)     // Catch:{ all -> 0x0500 }
                goto L_0x0507
            L_0x0500:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0500 }
                throw r0     // Catch:{ all -> 0x0525 }
            L_0x0503:
                r0 = 1
                r2 = 1
                goto L_0x0509
            L_0x0506:
                r0 = 1
            L_0x0507:
                r2 = r26
            L_0x0509:
                if (r13 == 0) goto L_0x03bb
                r3 = 1
                goto L_0x03bd
            L_0x050e:
                r1 = 0
                r7 = r0
                goto L_0x0516
            L_0x0511:
                r24 = r2
                r25 = r3
                r1 = 0
            L_0x0516:
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x0522 }
                r0.wait()     // Catch:{ all -> 0x0522 }
                r2 = r24
                r3 = r25
                r0 = 0
                goto L_0x0045
            L_0x0522:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x0522 }
                throw r0     // Catch:{ all -> 0x0525 }
            L_0x0525:
                r0 = move-exception
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r1 = com.ss.android.ugc.aweme.live.alphaplayer.e.g
                monitor-enter(r1)
                r29.c()     // Catch:{ all -> 0x0531 }
                r29.d()     // Catch:{ all -> 0x0531 }
                monitor-exit(r1)     // Catch:{ all -> 0x0531 }
                throw r0
            L_0x0531:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0531 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.e.i.e():void");
        }

        i(WeakReference<e> weakReference) {
            this.t = weakReference;
        }

        public final void a(int i2) {
            int i3 = i2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f53268a, false, 55512, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f53268a, false, 55512, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (i3 < 0 || i3 > 1) {
                throw new IllegalArgumentException("renderMode");
            } else {
                synchronized (e.g) {
                    this.o = i3;
                    e.g.notifyAll();
                }
            }
        }

        public final void a(Runnable runnable) {
            Runnable runnable2 = runnable;
            if (PatchProxy.isSupport(new Object[]{runnable2}, this, f53268a, false, 55521, new Class[]{Runnable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{runnable2}, this, f53268a, false, 55521, new Class[]{Runnable.class}, Void.TYPE);
            } else if (runnable2 != null) {
                synchronized (e.g) {
                    this.q.add(runnable2);
                    e.g.notifyAll();
                }
            } else {
                throw new IllegalArgumentException("r must not be null");
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:26|27|28|29|41|35) */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0061, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b1 */
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
                com.meituan.robust.ChangeQuickRedirect r3 = f53268a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r2 = java.lang.Integer.TYPE
                r6[r8] = r2
                java.lang.Class r2 = java.lang.Integer.TYPE
                r6[r9] = r2
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 55518(0xd8de, float:7.7797E-41)
                r2 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x004f
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
                r1[r8] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
                r1[r9] = r2
                com.meituan.robust.ChangeQuickRedirect r3 = f53268a
                r4 = 0
                r5 = 55518(0xd8de, float:7.7797E-41)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r0 = java.lang.Integer.TYPE
                r6[r8] = r0
                java.lang.Class r0 = java.lang.Integer.TYPE
                r6[r9] = r0
                java.lang.Class r7 = java.lang.Void.TYPE
                r2 = r11
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                return
            L_0x004f:
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r10 = com.ss.android.ugc.aweme.live.alphaplayer.e.g
                monitor-enter(r10)
                r11.m = r12     // Catch:{ all -> 0x00bb }
                r11.n = r13     // Catch:{ all -> 0x00bb }
                r11.r = r9     // Catch:{ all -> 0x00bb }
                r11.g = r9     // Catch:{ all -> 0x00bb }
                r11.p = r8     // Catch:{ all -> 0x00bb }
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ all -> 0x00bb }
                r0.notifyAll()     // Catch:{ all -> 0x00bb }
            L_0x0061:
                boolean r0 = r11.f53269b     // Catch:{ all -> 0x00bb }
                if (r0 != 0) goto L_0x00b9
                boolean r0 = r11.f53271d     // Catch:{ all -> 0x00bb }
                if (r0 != 0) goto L_0x00b9
                boolean r0 = r11.p     // Catch:{ all -> 0x00bb }
                if (r0 != 0) goto L_0x00b9
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x00bb }
                com.meituan.robust.ChangeQuickRedirect r3 = f53268a     // Catch:{ all -> 0x00bb }
                r4 = 0
                r5 = 55511(0xd8d7, float:7.7787E-41)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x00bb }
                java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00bb }
                r2 = r11
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00bb }
                if (r0 == 0) goto L_0x0098
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x00bb }
                com.meituan.robust.ChangeQuickRedirect r3 = f53268a     // Catch:{ all -> 0x00bb }
                r4 = 0
                r5 = 55511(0xd8d7, float:7.7787E-41)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x00bb }
                java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00bb }
                r2 = r11
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00bb }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00bb }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00bb }
                goto L_0x00a9
            L_0x0098:
                boolean r0 = r11.j     // Catch:{ all -> 0x00bb }
                if (r0 == 0) goto L_0x00a8
                boolean r0 = r11.k     // Catch:{ all -> 0x00bb }
                if (r0 == 0) goto L_0x00a8
                boolean r0 = r11.f()     // Catch:{ all -> 0x00bb }
                if (r0 == 0) goto L_0x00a8
                r0 = 1
                goto L_0x00a9
            L_0x00a8:
                r0 = 0
            L_0x00a9:
                if (r0 == 0) goto L_0x00b9
                com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = com.ss.android.ugc.aweme.live.alphaplayer.e.g     // Catch:{ InterruptedException -> 0x00b1 }
                r0.wait()     // Catch:{ InterruptedException -> 0x00b1 }
                goto L_0x0061
            L_0x00b1:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00bb }
                r0.interrupt()     // Catch:{ all -> 0x00bb }
                goto L_0x0061
            L_0x00b9:
                monitor-exit(r10)     // Catch:{ all -> 0x00bb }
                return
            L_0x00bb:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00bb }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.e.i.a(int, int):void");
        }
    }

    static class j {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53274a = null;

        /* renamed from: d  reason: collision with root package name */
        private static String f53275d = "GLThreadManager";

        /* renamed from: b  reason: collision with root package name */
        boolean f53276b;

        /* renamed from: c  reason: collision with root package name */
        i f53277c;

        /* renamed from: e  reason: collision with root package name */
        private boolean f53278e;

        /* renamed from: f  reason: collision with root package name */
        private int f53279f;
        private boolean g;
        private boolean h;

        private j() {
        }

        public final synchronized boolean a() {
            return this.h;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (!this.f53278e) {
                this.f53278e = true;
            }
        }

        public final synchronized boolean b() {
            if (PatchProxy.isSupport(new Object[0], this, f53274a, false, 55525, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53274a, false, 55525, new Class[0], Boolean.TYPE)).booleanValue();
            }
            c();
            if (!this.f53276b) {
                return true;
            }
            return false;
        }

        /* synthetic */ j(byte b2) {
            this();
        }

        public final void b(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f53274a, false, 55524, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f53274a, false, 55524, new Class[]{i.class}, Void.TYPE);
                return;
            }
            if (this.f53277c == iVar) {
                this.f53277c = null;
            }
            notifyAll();
        }

        public final synchronized void a(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f53274a, false, 55522, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f53274a, false, 55522, new Class[]{i.class}, Void.TYPE);
                return;
            }
            iVar.f53269b = true;
            if (this.f53277c == iVar) {
                this.f53277c = null;
            }
            notifyAll();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void a(javax.microedition.khronos.opengles.GL10 r11) {
            /*
                r10 = this;
                monitor-enter(r10)
                r8 = 1
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x005c }
                r9 = 0
                r1[r9] = r11     // Catch:{ all -> 0x005c }
                com.meituan.robust.ChangeQuickRedirect r3 = f53274a     // Catch:{ all -> 0x005c }
                r4 = 0
                r5 = 55526(0xd8e6, float:7.7808E-41)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x005c }
                java.lang.Class<javax.microedition.khronos.opengles.GL10> r2 = javax.microedition.khronos.opengles.GL10.class
                r6[r9] = r2     // Catch:{ all -> 0x005c }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x005c }
                r2 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005c }
                if (r1 == 0) goto L_0x0034
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x005c }
                r1[r9] = r11     // Catch:{ all -> 0x005c }
                com.meituan.robust.ChangeQuickRedirect r3 = f53274a     // Catch:{ all -> 0x005c }
                r4 = 0
                r5 = 55526(0xd8e6, float:7.7808E-41)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x005c }
                java.lang.Class<javax.microedition.khronos.opengles.GL10> r0 = javax.microedition.khronos.opengles.GL10.class
                r6[r9] = r0     // Catch:{ all -> 0x005c }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x005c }
                r2 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005c }
                monitor-exit(r10)
                return
            L_0x0034:
                boolean r1 = r10.g     // Catch:{ all -> 0x005c }
                if (r1 != 0) goto L_0x005a
                r10.c()     // Catch:{ all -> 0x005c }
                r1 = 7937(0x1f01, float:1.1122E-41)
                java.lang.String r0 = r11.glGetString(r1)     // Catch:{ all -> 0x005c }
                int r1 = r10.f53279f     // Catch:{ all -> 0x005c }
                r2 = 131072(0x20000, float:1.83671E-40)
                if (r1 >= r2) goto L_0x0053
                java.lang.String r1 = "Q3Dimension MSM7500 "
                boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x005c }
                r0 = r0 ^ r8
                r10.f53276b = r0     // Catch:{ all -> 0x005c }
                r10.notifyAll()     // Catch:{ all -> 0x005c }
            L_0x0053:
                boolean r0 = r10.f53276b     // Catch:{ all -> 0x005c }
                r0 = r0 ^ r8
                r10.h = r0     // Catch:{ all -> 0x005c }
                r10.g = r8     // Catch:{ all -> 0x005c }
            L_0x005a:
                monitor-exit(r10)
                return
            L_0x005c:
                r0 = move-exception
                monitor-exit(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.e.j.a(javax.microedition.khronos.opengles.GL10):void");
        }
    }

    public interface k {
        GL a();
    }

    static class l extends Writer {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53280a;

        /* renamed from: b  reason: collision with root package name */
        private StringBuilder f53281b = new StringBuilder();

        l() {
        }

        private void a() {
            if (PatchProxy.isSupport(new Object[0], this, f53280a, false, 55530, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53280a, false, 55530, new Class[0], Void.TYPE);
                return;
            }
            if (this.f53281b.length() > 0) {
                this.f53281b.delete(0, this.f53281b.length());
            }
        }

        public final void close() {
            if (PatchProxy.isSupport(new Object[0], this, f53280a, false, 55527, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53280a, false, 55527, new Class[0], Void.TYPE);
                return;
            }
            a();
        }

        public final void flush() {
            if (PatchProxy.isSupport(new Object[0], this, f53280a, false, 55528, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53280a, false, 55528, new Class[0], Void.TYPE);
                return;
            }
            a();
        }

        public final void write(char[] cArr, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{cArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53280a, false, 55529, new Class[]{char[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53280a, false, 55529, new Class[]{char[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            int i3 = i2;
            for (int i4 = 0; i4 < i3; i4++) {
                char c2 = cArr[i + i4];
                if (c2 == 10) {
                    a();
                } else {
                    this.f53281b.append(c2);
                }
            }
        }
    }

    public interface m {
        void a(GL10 gl10);

        void a(GL10 gl10, int i, int i2);

        void a(GL10 gl10, EGLConfig eGLConfig);
    }

    class n extends b {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public n(boolean r10) {
            /*
                r8 = this;
                com.ss.android.ugc.aweme.live.alphaplayer.e.this = r9
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.e.n.<init>(com.ss.android.ugc.aweme.live.alphaplayer.e, boolean):void");
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public int getDebugFlags() {
        return this.n;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.p;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f53248e, false, 55488, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53248e, false, 55488, new Class[0], Void.TYPE);
        } else if (this.h != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public void finalize() throws Throwable {
        if (PatchProxy.isSupport(new Object[0], this, f53248e, false, 55463, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53248e, false, 55463, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (this.h != null) {
                this.h.b();
            }
        } finally {
            super.finalize();
        }
    }

    public int getRenderMode() {
        if (!PatchProxy.isSupport(new Object[0], this, f53248e, false, 55474, new Class[0], Integer.TYPE)) {
            return this.h.a();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53248e, false, 55474, new Class[0], Integer.TYPE)).intValue();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f53248e, false, 55483, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53248e, false, 55483, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.b();
        }
        this.f53250b = true;
        super.onDetachedFromWindow();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53248e, false, 55475, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53248e, false, 55475, new Class[0], Void.TYPE);
            return;
        }
        i iVar = this.h;
        if (PatchProxy.isSupport(new Object[0], iVar, i.f53268a, false, 55513, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], iVar, i.f53268a, false, 55513, new Class[0], Void.TYPE);
            return;
        }
        synchronized (g) {
            iVar.g = true;
            g.notifyAll();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:17|18|19|20|30|26|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f53248e
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 55479(0xd8b7, float:7.7743E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f53248e
            r5 = 0
            r6 = 55479(0xd8b7, float:7.7743E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.live.alphaplayer.e$i r9 = r10.h
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.live.alphaplayer.e.i.f53268a
            r5 = 0
            r6 = 55516(0xd8dc, float:7.7794E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004b
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.live.alphaplayer.e.i.f53268a
            r5 = 0
            r6 = 55516(0xd8dc, float:7.7794E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x004b:
            com.ss.android.ugc.aweme.live.alphaplayer.e$j r2 = g
            monitor-enter(r2)
            r0 = 1
            r9.f53270c = r0     // Catch:{ all -> 0x006e }
            com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = g     // Catch:{ all -> 0x006e }
            r0.notifyAll()     // Catch:{ all -> 0x006e }
        L_0x0056:
            boolean r0 = r9.f53269b     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x006c
            boolean r0 = r9.f53271d     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x006c
            com.ss.android.ugc.aweme.live.alphaplayer.e$j r0 = g     // Catch:{ InterruptedException -> 0x0064 }
            r0.wait()     // Catch:{ InterruptedException -> 0x0064 }
            goto L_0x0056
        L_0x0064:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x006e }
            r0.interrupt()     // Catch:{ all -> 0x006e }
            goto L_0x0056
        L_0x006c:
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.e.b():void");
    }

    public void onAttachedToWindow() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f53248e, false, 55482, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53248e, false, 55482, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (this.f53250b && this.i != null) {
            if (this.h != null) {
                i2 = this.h.a();
            } else {
                i2 = 1;
            }
            this.h = new i(this.f53249a);
            if (i2 != 1) {
                this.h.a(i2);
            }
            this.h.start();
        }
        this.f53250b = false;
    }

    public void setDebugFlags(int i2) {
        this.n = i2;
    }

    public void setGLWrapper(k kVar) {
        this.m = kVar;
    }

    public void setMonitor(g gVar) {
        this.f53251f = gVar;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.p = z;
    }

    public void setEGLConfigChooser(C0617e eVar) {
        C0617e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f53248e, false, 55469, new Class[]{C0617e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f53248e, false, 55469, new Class[]{C0617e.class}, Void.TYPE);
            return;
        }
        c();
        this.j = eVar2;
    }

    public void setEGLContextFactory(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f53248e, false, 55467, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f53248e, false, 55467, new Class[]{f.class}, Void.TYPE);
            return;
        }
        c();
        this.k = fVar2;
    }

    public void setEGLWindowSurfaceFactory(g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f53248e, false, 55468, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f53248e, false, 55468, new Class[]{g.class}, Void.TYPE);
            return;
        }
        c();
        this.l = gVar2;
    }

    public void setEGLConfigChooser(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53248e, false, 55470, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53248e, false, 55470, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        setEGLConfigChooser((C0617e) new n(z));
    }

    public void setEGLContextClientVersion(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f53248e, false, 55472, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f53248e, false, 55472, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        c();
        this.o = i2;
    }

    public void setRenderMode(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f53248e, false, 55473, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f53248e, false, 55473, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h.a(i2);
    }

    public void setRenderer(m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, this, f53248e, false, 55466, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, this, f53248e, false, 55466, new Class[]{m.class}, Void.TYPE);
            return;
        }
        c();
        if (this.j == null) {
            this.j = new n(true);
        }
        if (this.k == null) {
            this.k = new c(this, (byte) 0);
        }
        if (this.l == null) {
            this.l = new d((byte) 0);
        }
        this.i = mVar;
        this.h = new i(this.f53249a);
        this.h.start();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|18|19|29|25|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0074 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.graphics.SurfaceTexture r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f53248e
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.SurfaceTexture> r3 = android.graphics.SurfaceTexture.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 55476(0xd8b4, float:7.7738E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f53248e
            r13 = 0
            r14 = 55476(0xd8b4, float:7.7738E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            r2 = r17
            com.ss.android.ugc.aweme.live.alphaplayer.e$i r0 = r2.h
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.live.alphaplayer.e.i.f53268a
            r13 = 0
            r14 = 55514(0xd8da, float:7.7792E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x005c
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.live.alphaplayer.e.i.f53268a
            r13 = 0
            r14 = 55514(0xd8da, float:7.7792E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x005c:
            com.ss.android.ugc.aweme.live.alphaplayer.e$j r3 = g
            monitor-enter(r3)
            r0.f53272e = r1     // Catch:{ all -> 0x007e }
            com.ss.android.ugc.aweme.live.alphaplayer.e$j r1 = g     // Catch:{ all -> 0x007e }
            r1.notifyAll()     // Catch:{ all -> 0x007e }
        L_0x0066:
            boolean r1 = r0.f53273f     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x007c
            boolean r1 = r0.f53269b     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x007c
            com.ss.android.ugc.aweme.live.alphaplayer.e$j r1 = g     // Catch:{ InterruptedException -> 0x0074 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0074 }
            goto L_0x0066
        L_0x0074:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x007e }
            r1.interrupt()     // Catch:{ all -> 0x007e }
            goto L_0x0066
        L_0x007c:
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            return
        L_0x007e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.e.a(android.graphics.SurfaceTexture):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:18|19|20|21|31|27|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f53248e
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.SurfaceTexture> r3 = android.graphics.SurfaceTexture.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 55487(0xd8bf, float:7.7754E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f53248e
            r13 = 0
            r14 = 55487(0xd8bf, float:7.7754E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f53248e
            r5 = 0
            r6 = 55477(0xd8b5, float:7.774E-41)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.SurfaceTexture> r3 = android.graphics.SurfaceTexture.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x006f
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f53248e
            r13 = 0
            r14 = 55477(0xd8b5, float:7.774E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r2 = r17
            goto L_0x00b8
        L_0x006f:
            r2 = r17
            com.ss.android.ugc.aweme.live.alphaplayer.e$i r0 = r2.h
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.live.alphaplayer.e.i.f53268a
            r13 = 0
            r14 = 55515(0xd8db, float:7.7793E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x0097
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.live.alphaplayer.e.i.f53268a
            r13 = 0
            r14 = 55515(0xd8db, float:7.7793E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00b8
        L_0x0097:
            com.ss.android.ugc.aweme.live.alphaplayer.e$j r3 = g
            monitor-enter(r3)
            r0.f53272e = r9     // Catch:{ all -> 0x00b9 }
            com.ss.android.ugc.aweme.live.alphaplayer.e$j r4 = g     // Catch:{ all -> 0x00b9 }
            r4.notifyAll()     // Catch:{ all -> 0x00b9 }
        L_0x00a1:
            boolean r4 = r0.f53273f     // Catch:{ all -> 0x00b9 }
            if (r4 != 0) goto L_0x00b7
            boolean r4 = r0.f53269b     // Catch:{ all -> 0x00b9 }
            if (r4 != 0) goto L_0x00b7
            com.ss.android.ugc.aweme.live.alphaplayer.e$j r4 = g     // Catch:{ InterruptedException -> 0x00af }
            r4.wait()     // Catch:{ InterruptedException -> 0x00af }
            goto L_0x00a1
        L_0x00af:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00b9 }
            r4.interrupt()     // Catch:{ all -> 0x00b9 }
            goto L_0x00a1
        L_0x00b7:
            monitor-exit(r3)     // Catch:{ all -> 0x00b9 }
        L_0x00b8:
            return r1
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.e.onSurfaceTextureDestroyed(android.graphics.SurfaceTexture):boolean");
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (PatchProxy.isSupport(new Object[0], this, f53248e, false, 55464, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53248e, false, 55464, new Class[0], Void.TYPE);
            return;
        }
        setSurfaceTextureListener(this);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53248e, false, 55485, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53248e, false, 55485, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(surfaceTexture);
        a(surfaceTexture2, 0, i2, i3);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53248e, false, 55486, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53248e, false, 55486, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(surfaceTexture2, 0, i2, i3);
    }

    private void a(SurfaceTexture surfaceTexture, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture, 0, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f53248e, false, 55478, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture, 0, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f53248e, false, 55478, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h.a(i3, i4);
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)}, this, f53248e, false, 55484, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)}, this, f53248e, false, 55484, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(getSurfaceTexture(), 0, i4 - i2, i5 - i3);
    }
}
