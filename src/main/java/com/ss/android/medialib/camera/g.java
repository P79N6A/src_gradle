package com.ss.android.medialib.camera;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.medialib.camera.a.b;
import com.ss.android.medialib.camera.a.d;
import com.ss.android.medialib.common.a;
import com.ss.android.medialib.log.e;
import com.ss.android.medialib.presenter.c;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.vesdk.y;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29525a = null;

    /* renamed from: b  reason: collision with root package name */
    public static LinkedList<Pair<Integer, Integer>> f29526b = null;
    public static boolean m = true;
    private static g z;
    private int A = -1;
    private a.C0357a B = new a.C0357a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29531a;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f29531a, false, 16808, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29531a, false, 16808, new Class[0], Void.TYPE);
                return;
            }
            y.b("IESCameraManager", "onOpenGLDestroy...");
            if (g.this.v != null) {
                g.this.v.b();
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f29531a, false, 16807, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29531a, false, 16807, new Class[0], Void.TYPE);
                return;
            }
            y.b("IESCameraManager", "onOpenGLCreate...");
            if (g.this.g == null || g.this.v == null) {
                y.d("IESCameraManager", "presenter or camera provider is null!");
                return;
            }
            g.this.v.a();
            g.this.v.a((b.a) new b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29533a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f29533a, false, 16810, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f29533a, false, 16810, new Class[0], Void.TYPE);
                        return;
                    }
                    if (g.this.k != null) {
                        g.this.k.a();
                    }
                    g.this.p++;
                    if (g.this.p == 30) {
                        g.this.q = System.currentTimeMillis();
                        y.b("IESCameraManager", "Render FPS = " + (30000.0f / ((float) (g.this.q - g.this.r))));
                        g.this.r = g.this.q;
                        g.this.p = 0;
                    }
                }
            });
            g.this.v.d();
            g.this.p = 0;
            g gVar = g.this;
            g gVar2 = g.this;
            long currentTimeMillis = System.currentTimeMillis();
            gVar2.r = currentTimeMillis;
            gVar.q = currentTimeMillis;
        }

        public final int c() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f29531a, false, 16809, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29531a, false, 16809, new Class[0], Integer.TYPE)).intValue();
            }
            y.b("IESCameraManager", "onOpenGLRunning...");
            if (g.this.w.getAndSet(false) && g.this.l.f29517b != null) {
                g.this.b(g.this.l.f29517b);
            }
            if (g.this.v != null) {
                i = g.this.v.c();
            } else {
                i = 0;
            }
            if (i < 0) {
                return i;
            }
            if (g.this.f29527c != null && g.this.f29527c.l()) {
                return -3;
            }
            if (g.this.u) {
                return -4;
            }
            return 0;
        }
    };
    private int[] C = new int[2];

    /* renamed from: c  reason: collision with root package name */
    public IESCameraInterface f29527c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.medialib.presenter.b f29528d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.medialib.presenter.a f29529e;

    /* renamed from: f  reason: collision with root package name */
    public IESCameraInterface.d f29530f;
    public c g;
    public int h;
    public volatile boolean i;
    public boolean j;
    public a k;
    public d l;
    public boolean n;
    public int o;
    public int p;
    public long q;
    public long r;
    public final Object s = new Object();
    public long t = 0;
    public boolean u = false;
    public b v;
    public AtomicBoolean w = new AtomicBoolean(false);
    public c x;
    c y;

    public interface a {
        void a();
    }

    public final synchronized void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f29525a, false, 16766, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f29525a, false, 16766, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (this.f29527c != null) {
            this.f29527c.c();
        }
        this.l = dVar;
        if (Build.VERSION.SDK_INT >= 23 && dVar.f29518c == 3) {
            this.f29527c = new IESHwCamera();
        } else if (dVar.f29518c == 4 && Build.VERSION.SDK_INT >= 23) {
            this.f29527c = new h();
            dVar.f29518c = 4;
        } else if (Build.VERSION.SDK_INT > 27 && dVar.f29518c == 5) {
            this.f29527c = new i();
        } else if (dVar.f29518c != 2 || Build.VERSION.SDK_INT < 24) {
            this.f29527c = new a();
            dVar.f29518c = 1;
        } else {
            this.f29527c = new b();
            dVar.f29518c = 2;
        }
        synchronized (this.s) {
            this.f29527c.a(dVar);
        }
        this.j = true;
    }

    public final synchronized void a(@NonNull Context context, int i2, @Nullable c cVar) {
        int i3 = i2;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i2), cVar}, this, f29525a, false, 16769, new Class[]{Context.class, Integer.TYPE, c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i2), cVar}, this, f29525a, false, 16769, new Class[]{Context.class, Integer.TYPE, c.class}, Void.TYPE);
                return;
            }
            y.a("IESCameraManager", "changeCamera: " + i3);
            if (this.i) {
                y.a("IESCameraManager", "changeCamera: return");
                return;
            }
            this.i = true;
            final long currentTimeMillis = System.currentTimeMillis();
            e.f29699b = currentTimeMillis;
            synchronized (this.s) {
                IESCameraInterface iESCameraInterface = this.f29527c;
                final Context context2 = context;
                final c cVar2 = cVar;
                AnonymousClass2 r1 = new c() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f29535a;

                    public final void a(int i) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f29535a, false, 16811, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f29535a, false, 16811, new Class[]{Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                        float f2 = (float) currentTimeMillis;
                        if (TextUtils.isEmpty("iesve_record_switch_camera_time")) {
                            y.c("TEMonitor", "perfLong: key is null");
                        } else {
                            TEMonitorInvoker.nativePerfRational("iesve_record_switch_camera_time", 1.0f, f2);
                        }
                        com.ss.android.ttve.monitor.e.a(0, "te_record_switch_camera_time", currentTimeMillis);
                        g.this.a(context2);
                        if (g.this.v != null) {
                            g.this.v.d();
                            if (g.this.n) {
                                g.this.v.a(g.this.n, g.this.o);
                            }
                        }
                        if (cVar2 != null) {
                            cVar2.a(i);
                        }
                        g.this.i = false;
                        g.this.t = System.currentTimeMillis();
                    }

                    public final void a(int i, int i2, String str) {
                        String str2 = str;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f29535a, false, 16812, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f29535a, false, 16812, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                            return;
                        }
                        if (cVar2 != null) {
                            int i3 = i;
                            int i4 = i2;
                            cVar2.a(i, i2, str2);
                        }
                        g.this.i = false;
                        g.this.t = System.currentTimeMillis();
                    }
                };
                if (!iESCameraInterface.b(i3, r1)) {
                    this.i = false;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ss.android.medialib.camera.IESCameraInterface.d r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x003f }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x003f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29525a     // Catch:{ all -> 0x003f }
            r4 = 0
            r5 = 16775(0x4187, float:2.3507E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x003f }
            java.lang.Class<com.ss.android.medialib.camera.IESCameraInterface$d> r2 = com.ss.android.medialib.camera.IESCameraInterface.d.class
            r6[r9] = r2     // Catch:{ all -> 0x003f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x003f }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x003f }
            r1[r9] = r11     // Catch:{ all -> 0x003f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29525a     // Catch:{ all -> 0x003f }
            r4 = 0
            r5 = 16775(0x4187, float:2.3507E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x003f }
            java.lang.Class<com.ss.android.medialib.camera.IESCameraInterface$d> r0 = com.ss.android.medialib.camera.IESCameraInterface.d.class
            r6[r9] = r0     // Catch:{ all -> 0x003f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x003f }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x003f }
            monitor-exit(r10)
            return
        L_0x0032:
            r10.f29530f = r11     // Catch:{ all -> 0x003f }
            com.ss.android.medialib.camera.IESCameraInterface r1 = r10.f29527c     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            com.ss.android.medialib.camera.IESCameraInterface r1 = r10.f29527c     // Catch:{ all -> 0x003f }
            r1.a((com.ss.android.medialib.camera.IESCameraInterface.d) r11)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r10)
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.g.a(com.ss.android.medialib.camera.IESCameraInterface$d):void");
    }

    public final synchronized void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29525a, false, 16777, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29525a, false, 16777, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        synchronized (this.s) {
            if (this.f29527c != null) {
                this.f29527c.a(z2);
            }
        }
    }

    public final synchronized boolean a(@IESCameraInterface.FlashMode int i2) {
        boolean a2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29525a, false, 16778, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29525a, false, 16778, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        synchronized (this.s) {
            a2 = this.f29527c.a(i2);
        }
        return a2;
    }

    public final synchronized boolean a(int i2, int i3, float f2, float[] fArr, int i4) {
        boolean a2;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4)}, this, f29525a, false, 16782, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE}, Boolean.TYPE)) {
                boolean booleanValue = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), fArr, Integer.valueOf(i4)}, this, f29525a, false, 16782, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                return booleanValue;
            }
            synchronized (this.s) {
                a2 = this.f29527c.a(i2, i3, f2, fArr, i4);
            }
            return a2;
        }
    }

    public final synchronized boolean a(final int i2, c cVar) {
        boolean a2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar}, this, f29525a, false, 16787, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar}, this, f29525a, false, 16787, new Class[]{Integer.TYPE, c.class}, Boolean.TYPE)).booleanValue();
        }
        y.a("IESCameraManager", "open: thread id = " + Thread.currentThread().getId());
        e.f29698a = System.currentTimeMillis();
        com.ss.android.ttve.monitor.e.a(0, "te_record_camera_direction", (long) i2);
        this.x = cVar;
        this.y = new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29540a;

            public final void a(int i) {
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f29540a, false, 16813, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f29540a, false, 16813, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                y.a("IESCameraManager", "Open camera " + i2 + " succeed, thread id = " + Thread.currentThread().getId());
                g gVar = g.this;
                if (PatchProxy.isSupport(new Object[0], gVar, g.f29525a, false, 16767, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], gVar, g.f29525a, false, 16767, new Class[0], Void.TYPE);
                } else {
                    if (gVar.l.o == 1) {
                        gVar.v = new d(gVar.f29527c);
                    } else {
                        gVar.v = new com.ss.android.medialib.camera.a.c(gVar.f29527c);
                    }
                    gVar.v.a(gVar.g);
                }
                if (g.this.x != null) {
                    g.this.x.a(i2);
                } else {
                    y.d("IESCameraManager", "mClientListener is null!");
                }
            }

            public final void a(int i, int i2, String str) {
                int i3 = i;
                int i4 = i2;
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f29540a, false, 16814, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f29540a, false, 16814, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                    return;
                }
                y.d("IESCameraManager", "Open camera " + i3 + " failed, errorCodec = " + i4 + ", info: " + str2);
                if (i3 == 2 && g.this.l.s) {
                    y.c("IESCameraManager", "Switch to camera1 api!");
                    synchronized (g.this.s) {
                        if (g.this.f29527c != null) {
                            g.this.f29527c.b();
                        }
                        g.this.l.f29518c = 1;
                        g.this.f29527c = new a();
                        g.this.f29527c.a(g.this.l);
                        g.this.f29527c.a(g.this.f29530f);
                        g.this.f29527c.a(i2, g.this.y);
                    }
                } else if (g.this.x != null) {
                    g.this.x.a(i3, i4, str2);
                }
            }
        };
        synchronized (this.s) {
            a2 = this.f29527c.a(i2, this.y);
        }
        return a2;
    }

    public final synchronized void a(@NonNull c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f29525a, false, 16789, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f29525a, false, 16789, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.g = cVar;
        this.g.a(this.B);
        if (this.v != null) {
            this.v.a(this.g);
        } else {
            y.d("IESCameraManager", "attach::CameraProvider is null!");
        }
    }

    @RequiresApi(api = 23)
    public final void a(String str) {
        if (this.f29527c instanceof IESHwCamera) {
            ((IESHwCamera) this.f29527c).u = str;
        }
    }

    public final int c() {
        return this.C[0];
    }

    public final int d() {
        return this.C[1];
    }

    public final int a() {
        if (this.l != null) {
            return this.l.f29518c;
        }
        return 1;
    }

    @RequiresApi(api = 23)
    public final int m() {
        if (this.f29527c instanceof IESHwCamera) {
            return ((IESHwCamera) this.f29527c).J;
        }
        return -1;
    }

    private g() {
    }

    public static g b() {
        if (PatchProxy.isSupport(new Object[0], null, f29525a, true, 16765, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], null, f29525a, true, 16765, new Class[0], g.class);
        }
        if (z == null) {
            synchronized (g.class) {
                if (z == null) {
                    z = new g();
                }
            }
        }
        return z;
    }

    public final synchronized float f() {
        if (PatchProxy.isSupport(new Object[0], this, f29525a, false, 16772, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f29525a, false, 16772, new Class[0], Float.TYPE)).floatValue();
        }
        float g2 = this.f29527c.g();
        com.ss.android.ttve.monitor.e.a(0, "te_preview_camera_zoom", (double) g2);
        return g2;
    }

    @Nullable
    public final int[] i() {
        if (!PatchProxy.isSupport(new Object[0], this, f29525a, false, 16781, new Class[0], int[].class)) {
            return this.f29527c.i();
        }
        return (int[]) PatchProxy.accessDispatch(new Object[0], this, f29525a, false, 16781, new Class[0], int[].class);
    }

    public final synchronized void j() {
        if (PatchProxy.isSupport(new Object[0], this, f29525a, false, 16790, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29525a, false, 16790, new Class[0], Void.TYPE);
            return;
        }
        e();
        if (this.v != null) {
            this.v.a((c) null);
        }
        this.g = null;
    }

    public final int k() {
        if (PatchProxy.isSupport(new Object[0], this, f29525a, false, 16792, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29525a, false, 16792, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f29527c == null) {
            return -1;
        } else {
            return this.f29527c.k();
        }
    }

    @RequiresApi(api = 23)
    public final void l() throws Exception {
        if (PatchProxy.isSupport(new Object[0], this, f29525a, false, 16801, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29525a, false, 16801, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29527c instanceof IESHwCamera) {
            ((IESHwCamera) this.f29527c).takeSuperSlowMotion();
        }
    }

    public final synchronized void e() {
        if (PatchProxy.isSupport(new Object[0], this, f29525a, false, 16768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29525a, false, 16768, new Class[0], Void.TYPE);
            return;
        }
        synchronized (this.s) {
            if (this.f29527c != null) {
                this.f29527c.b();
            }
        }
        this.n = false;
        this.o = 0;
        this.x = null;
    }

    public final synchronized boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f29525a, false, 16776, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29525a, false, 16776, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.A == -1 && this.f29527c != null) {
            this.A = this.f29527c.a() ? 1 : 0;
        }
        if (this.A == 1) {
            return true;
        }
        return false;
    }

    public final synchronized boolean h() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f29525a, false, 16780, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29525a, false, 16780, new Class[0], Boolean.TYPE)).booleanValue();
        }
        synchronized (this.s) {
            if (this.f29527c != null && this.f29527c.h()) {
                z2 = true;
            }
        }
        return z2;
    }

    @RequiresApi(api = 23)
    public final void a(f fVar) {
        if (this.f29527c instanceof IESHwCamera) {
            ((IESHwCamera) this.f29527c).K = fVar;
        }
    }

    @RequiresApi(api = 23)
    public final synchronized void b(int i2) {
        if (this.f29527c instanceof IESHwCamera) {
            ((IESHwCamera) this.f29527c).F = i2;
        }
    }

    public final void a(IESCameraInterface.a aVar) {
        IESCameraInterface.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f29525a, false, 16798, new Class[]{IESCameraInterface.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f29525a, false, 16798, new Class[]{IESCameraInterface.a.class}, Void.TYPE);
            return;
        }
        this.f29527c.a(aVar2);
    }

    public final synchronized void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29525a, false, 16773, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29525a, false, 16773, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f29527c.b(f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        return;
     */
    @android.support.annotation.RequiresApi(api = 23)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x004b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x004b }
            r9 = 0
            r1[r9] = r2     // Catch:{ all -> 0x004b }
            com.meituan.robust.ChangeQuickRedirect r3 = f29525a     // Catch:{ all -> 0x004b }
            r4 = 0
            r5 = 16805(0x41a5, float:2.3549E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x004b }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x004b }
            r6[r9] = r2     // Catch:{ all -> 0x004b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x004b }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x003a
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x004b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x004b }
            r1[r9] = r0     // Catch:{ all -> 0x004b }
            com.meituan.robust.ChangeQuickRedirect r3 = f29525a     // Catch:{ all -> 0x004b }
            r4 = 0
            r5 = 16805(0x41a5, float:2.3549E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x004b }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x004b }
            r6[r9] = r0     // Catch:{ all -> 0x004b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x004b }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004b }
            monitor-exit(r10)
            return
        L_0x003a:
            com.ss.android.medialib.camera.IESCameraInterface r1 = r10.f29527c     // Catch:{ all -> 0x004b }
            boolean r1 = r1 instanceof com.ss.android.medialib.camera.IESHwCamera     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0049
            com.ss.android.medialib.camera.IESCameraInterface r1 = r10.f29527c     // Catch:{ all -> 0x004b }
            com.ss.android.medialib.camera.IESHwCamera r1 = (com.ss.android.medialib.camera.IESHwCamera) r1     // Catch:{ all -> 0x004b }
            r1.c((int) r11)     // Catch:{ all -> 0x004b }
            r10.o = r11     // Catch:{ all -> 0x004b }
        L_0x0049:
            monitor-exit(r10)
            return
        L_0x004b:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.g.c(int):void");
    }

    public final synchronized void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29525a, false, 16771, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29525a, false, 16771, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        synchronized (this.s) {
            this.f29527c.a(f2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(android.content.Context r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x007b }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x007b }
            com.meituan.robust.ChangeQuickRedirect r3 = f29525a     // Catch:{ all -> 0x007b }
            r4 = 0
            r5 = 16791(0x4197, float:2.3529E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x007b }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r9] = r2     // Catch:{ all -> 0x007b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x007b }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x007b }
            r1[r9] = r11     // Catch:{ all -> 0x007b }
            com.meituan.robust.ChangeQuickRedirect r3 = f29525a     // Catch:{ all -> 0x007b }
            r4 = 0
            r5 = 16791(0x4197, float:2.3529E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x007b }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r9] = r0     // Catch:{ all -> 0x007b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x007b }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007b }
            monitor-exit(r10)
            return
        L_0x0032:
            java.lang.String r1 = "window"
            java.lang.Object r0 = r11.getSystemService(r1)     // Catch:{ all -> 0x007b }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ all -> 0x007b }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ all -> 0x007b }
            int r0 = r0.getRotation()     // Catch:{ all -> 0x007b }
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x004c;
                case 2: goto L_0x0049;
                case 3: goto L_0x0046;
                default: goto L_0x0045;
            }     // Catch:{ all -> 0x007b }
        L_0x0045:
            goto L_0x004e
        L_0x0046:
            r9 = 270(0x10e, float:3.78E-43)
            goto L_0x004e
        L_0x0049:
            r9 = 180(0xb4, float:2.52E-43)
            goto L_0x004e
        L_0x004c:
            r9 = 90
        L_0x004e:
            java.lang.Object r1 = r10.s     // Catch:{ all -> 0x007b }
            monitor-enter(r1)     // Catch:{ all -> 0x007b }
            com.ss.android.medialib.camera.IESCameraInterface r0 = r10.f29527c     // Catch:{ all -> 0x0078 }
            int r0 = r0.b((int) r9)     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            r10.h = r0     // Catch:{ all -> 0x007b }
            com.ss.android.medialib.presenter.b r1 = r10.f29528d     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0076
            java.lang.String r1 = "IESCameraManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            java.lang.String r3 = "摄像头偏转角度: "
            r2.<init>(r3)     // Catch:{ all -> 0x007b }
            r2.append(r0)     // Catch:{ all -> 0x007b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007b }
            com.ss.android.vesdk.y.a(r1, r2)     // Catch:{ all -> 0x007b }
            com.ss.android.medialib.presenter.b r1 = r10.f29528d     // Catch:{ all -> 0x007b }
            r1.b(r0)     // Catch:{ all -> 0x007b }
        L_0x0076:
            monitor-exit(r10)
            return
        L_0x0078:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.g.b(android.content.Context):void");
    }

    @RequiresApi(api = 23)
    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29525a, false, 16806, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29525a, false, 16806, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f29527c instanceof h) {
            ((h) this.f29527c).q = z2;
        } else if (this.f29527c instanceof i) {
            ((i) this.f29527c).s = z2;
        } else {
            if (this.f29527c instanceof IESHwCamera) {
                ((IESHwCamera) this.f29527c).m.m = z2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        return;
     */
    @android.support.annotation.RequiresApi(api = 23)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(boolean r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x004b }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r11)     // Catch:{ all -> 0x004b }
            r9 = 0
            r1[r9] = r2     // Catch:{ all -> 0x004b }
            com.meituan.robust.ChangeQuickRedirect r3 = f29525a     // Catch:{ all -> 0x004b }
            r4 = 0
            r5 = 16804(0x41a4, float:2.3547E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x004b }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x004b }
            r6[r9] = r2     // Catch:{ all -> 0x004b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x004b }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x003a
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x004b }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r11)     // Catch:{ all -> 0x004b }
            r1[r9] = r0     // Catch:{ all -> 0x004b }
            com.meituan.robust.ChangeQuickRedirect r3 = f29525a     // Catch:{ all -> 0x004b }
            r4 = 0
            r5 = 16804(0x41a4, float:2.3547E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x004b }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x004b }
            r6[r9] = r0     // Catch:{ all -> 0x004b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x004b }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004b }
            monitor-exit(r10)
            return
        L_0x003a:
            com.ss.android.medialib.camera.IESCameraInterface r1 = r10.f29527c     // Catch:{ all -> 0x004b }
            boolean r1 = r1 instanceof com.ss.android.medialib.camera.IESHwCamera     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0049
            com.ss.android.medialib.camera.IESCameraInterface r1 = r10.f29527c     // Catch:{ all -> 0x004b }
            com.ss.android.medialib.camera.IESHwCamera r1 = (com.ss.android.medialib.camera.IESHwCamera) r1     // Catch:{ all -> 0x004b }
            r1.c((boolean) r11)     // Catch:{ all -> 0x004b }
            r10.n = r11     // Catch:{ all -> 0x004b }
        L_0x0049:
            monitor-exit(r10)
            return
        L_0x004b:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.g.b(boolean):void");
    }

    public final synchronized void a(@NonNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f29525a, false, 16770, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f29525a, false, 16770, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        y.b("IESCameraManager", "start: ");
        com.ss.android.ttve.monitor.e.a(0, "te_record_camera_type", (long) this.l.f29518c);
        b(context);
        synchronized (this.s) {
            this.C = this.f29527c.f();
        }
        if (f29526b == null) {
            List<int[]> j2 = this.f29527c.j();
            f29526b = new LinkedList<>();
            for (int[] iArr : j2) {
                f29526b.add(new Pair(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])));
            }
        }
        if (this.f29529e != null) {
            this.f29529e.b(this.C[0], this.C[1]);
        } else {
            y.d("IESCameraManager", "mCameraPreviewSizeInterface is null!");
        }
        com.ss.android.ttve.monitor.e.a(0, "te_preview_camera_resolution", this.C[0] + "*" + this.C[1]);
    }

    public static boolean a(Context context, int i2) {
        boolean z2;
        boolean z3;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i2)}, null, f29525a, true, 16802, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i2)}, null, f29525a, true, 16802, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i3 == 3) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (PatchProxy.isSupport(new Object[]{context}, null, IESHwCamera.f29409a, true, 16861, new Class[]{Context.class}, Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, IESHwCamera.f29409a, true, 16861, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                } else {
                    z3 = IESHwCamera.a(IESHwCamera.a(context));
                }
                if (z3) {
                    return true;
                }
            }
            return false;
        } else {
            if (i3 == 4 && Build.VERSION.SDK_INT >= 23) {
                if (PatchProxy.isSupport(new Object[]{context}, null, h.f29543a, true, 16935, new Class[]{Context.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, h.f29543a, true, 16935, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                } else {
                    String a2 = com.miui.camera.a.a(21);
                    if (PatchProxy.isSupport(new Object[]{a2}, null, h.f29543a, true, 16936, new Class[]{String.class}, Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{a2}, null, h.f29543a, true, 16936, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                    } else if (!PushConstants.PUSH_TYPE_NOTIFY.equals(a2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean a(Context context, int i2, int i3) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i2), Integer.valueOf(i3)}, null, f29525a, true, 16803, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i2), Integer.valueOf(i3)}, null, f29525a, true, 16803, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i2 != 5 || Build.VERSION.SDK_INT <= 27 || !i.a(context2, i3)) {
            return false;
        } else {
            return true;
        }
    }

    public final synchronized void a(int i2, int i3, IESCameraInterface.b bVar) {
        IESCameraInterface.b bVar2 = bVar;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f29525a, false, 16797, new Class[]{Integer.TYPE, Integer.TYPE, IESCameraInterface.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f29525a, false, 16797, new Class[]{Integer.TYPE, Integer.TYPE, IESCameraInterface.b.class}, Void.TYPE);
                return;
            }
            int i4 = i2;
            int i5 = i3;
            this.f29527c.a(i2, i3, bVar2);
        }
    }
}
