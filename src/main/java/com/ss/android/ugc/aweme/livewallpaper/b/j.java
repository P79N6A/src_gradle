package com.ss.android.ugc.aweme.livewallpaper.b;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@TargetApi(11)
public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53628a;

    /* renamed from: b  reason: collision with root package name */
    public Object f53629b = null;

    /* renamed from: c  reason: collision with root package name */
    Object f53630c;

    /* renamed from: d  reason: collision with root package name */
    f f53631d;

    /* renamed from: e  reason: collision with root package name */
    q f53632e;

    /* renamed from: f  reason: collision with root package name */
    s f53633f;
    s g;
    int h;
    int i;
    public int j;
    float[] k;
    public Pair<Float, Float> l = new Pair<>(Float.valueOf(1.0f), Float.valueOf(1.0f));
    private d m;
    private e n;
    private Thread o = new Thread(this);
    private Handler p;
    private List<k> q = new ArrayList();
    private List<k> r = new ArrayList();
    private float[] s;
    private boolean t;
    private Object u = new Object();
    private int v = 8;

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53634a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<j> f53635b;

        a(j jVar) {
            this.f53635b = new WeakReference<>(jVar);
        }

        public final void handleMessage(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f53634a, false, 56160, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f53634a, false, 56160, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            j jVar = (j) this.f53635b.get();
            if (jVar != null) {
                switch (message2.what) {
                    case 1:
                        jVar.b(message2.obj);
                        return;
                    case 2:
                        jVar.a(message2.obj);
                        return;
                    case 3:
                        Message message3 = (Message) message2.obj;
                        int i = message2.arg1;
                        int i2 = message2.arg2;
                        if (!PatchProxy.isSupport(new Object[]{message3, Integer.valueOf(i), Integer.valueOf(i2)}, jVar, j.f53628a, false, 56133, new Class[]{Message.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            h hVar = null;
                            if (i == 0 && i2 == 0 && jVar.g != null) {
                                hVar = jVar.g.a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                            } else if (jVar.f53633f != null) {
                                hVar = jVar.f53633f.a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                            }
                            message3.obj = hVar;
                            synchronized (message3) {
                                message3.arg1 = 0;
                                message3.notify();
                            }
                            break;
                        } else {
                            j jVar2 = jVar;
                            PatchProxy.accessDispatch(new Object[]{message3, Integer.valueOf(i), Integer.valueOf(i2)}, jVar2, j.f53628a, false, 56133, new Class[]{Message.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            break;
                        }
                    case 4:
                        jVar.a();
                        return;
                    case 5:
                        if (PatchProxy.isSupport(new Object[0], jVar, j.f53628a, false, 56132, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], jVar, j.f53628a, false, 56132, new Class[0], Void.TYPE);
                            break;
                        } else {
                            try {
                                jVar.b(jVar.f53629b);
                                jVar.j = 4;
                            } catch (Throwable unused) {
                                break;
                            }
                            return;
                        }
                    case 6:
                        if (jVar.j == 4) {
                            jVar.j = 2;
                        }
                        return;
                    case e.l:
                        if (jVar.j == 2) {
                            jVar.j = 4;
                        }
                        return;
                    case 8:
                        if (PatchProxy.isSupport(new Object[0], jVar, j.f53628a, false, 56130, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], jVar, j.f53628a, false, 56130, new Class[0], Void.TYPE);
                            break;
                        } else {
                            jVar.a();
                            Looper.myLooper().quit();
                            jVar.j = 5;
                            return;
                        }
                    case 9:
                    case 11:
                        Surface surface = (Surface) message2.obj;
                        if (PatchProxy.isSupport(new Object[]{surface}, jVar, j.f53628a, false, 56128, new Class[]{Surface.class}, Void.TYPE)) {
                            j jVar3 = jVar;
                            PatchProxy.accessDispatch(new Object[]{surface}, jVar3, j.f53628a, false, 56128, new Class[]{Surface.class}, Void.TYPE);
                            break;
                        } else {
                            jVar.f53630c = surface;
                            if (surface != null) {
                                jVar.c();
                            }
                            return;
                        }
                    case 10:
                        int i3 = message2.arg1;
                        int i4 = message2.arg2;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, jVar, j.f53628a, false, 56129, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            j jVar4 = jVar;
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, jVar4, j.f53628a, false, 56129, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            break;
                        } else {
                            jVar.i = i3;
                            jVar.h = i4;
                            if (jVar.f53632e != null) {
                                jVar.f53632e.c();
                                jVar.f53632e.a(jVar.i, jVar.h);
                            }
                            if (jVar.f53631d != null) {
                                jVar.f53631d.c();
                                jVar.f53631d.a(jVar.i, jVar.h);
                            }
                            return;
                        }
                    default:
                        super.handleMessage(message);
                        break;
                }
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0028 */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0028 A[LOOP:0: B:6:0x0028->B:17:0x0028, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f53628a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 56141(0xdb4d, float:7.867E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f53628a
            r5 = 0
            r6 = 56141(0xdb4d, float:7.867E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.Object r0 = r9.u
            monitor-enter(r0)
        L_0x0028:
            boolean r1 = r9.t     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            java.lang.Object r1 = r9.u     // Catch:{ InterruptedException -> 0x0028 }
            r2 = 10
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0028 }
            goto L_0x0028
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.b.j.g():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0028 */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0028 A[LOOP:0: B:6:0x0028->B:17:0x0028, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f53628a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 56144(0xdb50, float:7.8675E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f53628a
            r5 = 0
            r6 = 56144(0xdb50, float:7.8675E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.Object r0 = r9.u
            monitor-enter(r0)
        L_0x0028:
            boolean r1 = r9.t     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0034
            java.lang.Object r1 = r9.u     // Catch:{ InterruptedException -> 0x0028 }
            r2 = 10
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0028 }
            goto L_0x0028
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.b.j.h():void");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53628a, false, 56131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53628a, false, 56131, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != 3) {
            b();
            this.j = 3;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f53628a, false, 56143, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53628a, false, 56143, new Class[0], Void.TYPE);
            return;
        }
        this.p.sendEmptyMessage(8);
        h();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f53628a, false, 56145, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53628a, false, 56145, new Class[0], Void.TYPE);
            return;
        }
        this.p.sendEmptyMessage(5);
    }

    public final k f() {
        if (PatchProxy.isSupport(new Object[0], this, f53628a, false, 56147, new Class[0], k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[0], this, f53628a, false, 56147, new Class[0], k.class);
        }
        k kVar = null;
        h b2 = b(0, 0);
        if (b2 != null) {
            kVar = new k(b2);
            b2.b();
            kVar.setOnFrameAvailableListener(this);
        }
        return kVar;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f53628a, false, 56135, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53628a, false, 56135, new Class[0], Void.TYPE);
            return;
        }
        if (this.f53633f != null) {
            this.f53633f.a();
        }
        if (this.g != null) {
            this.g.a();
        }
        if (this.f53631d != null) {
            this.f53631d.c();
            this.f53631d = null;
        }
        if (this.f53632e != null) {
            this.f53632e.c();
            this.f53632e = null;
        }
        if (this.n != null) {
            this.n.c();
            this.n = null;
        }
        if (this.m != null) {
            this.m.a();
            this.m = null;
        }
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f53628a, false, 56159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53628a, false, 56159, new Class[0], Void.TYPE);
            return;
        }
        Looper.prepare();
        this.p = new a(this);
        synchronized (this.u) {
            this.t = true;
            this.u.notify();
        }
        Looper.loop();
        synchronized (this.u) {
            this.t = false;
            this.u.notify();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f53628a, false, 56137, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53628a, false, 56137, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.c();
        }
        if (this.f53630c == null) {
            this.n = new l(this.m, 1, 1);
        } else if (this.f53630c instanceof Surface) {
            this.n = new t(this.m, (Surface) this.f53630c, true);
        } else if (this.f53630c instanceof SurfaceTexture) {
            this.n = new t(this.m, (SurfaceTexture) this.f53630c);
        } else {
            throw new AndroidRuntimeException("UnsupportedOperation");
        }
        this.i = this.n.a();
        this.h = this.n.b();
        this.n.d();
        this.f53629b = d.b();
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f53628a, false, 56157, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f53628a, false, 56157, new Class[]{SurfaceTexture.class}, Void.TYPE);
            return;
        }
        synchronized (this.q) {
            this.q.add((k) surfaceTexture);
        }
        if (PatchProxy.isSupport(new Object[]{null}, this, f53628a, false, 56152, new Class[]{h.class}, Boolean.TYPE)) {
            ((Boolean) PatchProxy.accessDispatch(new Object[]{null}, this, f53628a, false, 56152, new Class[]{h.class}, Boolean.TYPE)).booleanValue();
        } else if (this.j == 4) {
            Message obtainMessage = this.p.obtainMessage(2);
            obtainMessage.obj = null;
            this.p.sendMessage(obtainMessage);
        }
    }

    public final void b(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53628a, false, 56136, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f53628a, false, 56136, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b();
        this.m = new d(obj, 0);
        c();
        this.f53633f = new s(this.v, this.i, this.h, false);
        this.f53633f.f53664d = "MusMediaRender.TexQueue";
        this.g = new s(this.v, 0, 0, false);
        this.g.f53664d = "MusMediaRender.OESQueue";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r23) {
        /*
            r22 = this;
            r8 = r22
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r23
            com.meituan.robust.ChangeQuickRedirect r3 = f53628a
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 56134(0xdb46, float:7.866E-41)
            r2 = r22
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r23
            com.meituan.robust.ChangeQuickRedirect r3 = f53628a
            r4 = 0
            r5 = 56134(0xdb46, float:7.866E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0036:
            r11 = 4
            if (r23 == 0) goto L_0x00e4
            r0 = r23
            com.ss.android.ugc.aweme.livewallpaper.b.h r0 = (com.ss.android.ugc.aweme.livewallpaper.b.h) r0
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f53628a
            r4 = 0
            r5 = 56155(0xdb5b, float:7.869E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.h> r2 = com.ss.android.ugc.aweme.livewallpaper.b.h.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r22
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0070
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f53628a
            r4 = 0
            r5 = 56155(0xdb5b, float:7.869E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.h> r2 = com.ss.android.ugc.aweme.livewallpaper.b.h.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00e0
        L_0x0070:
            int r1 = r8.j
            if (r1 != r11) goto L_0x00e0
            com.ss.android.ugc.aweme.livewallpaper.b.q r1 = r8.f53632e
            if (r1 != 0) goto L_0x00b4
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f53628a
            r4 = 0
            r5 = 56156(0xdb5c, float:7.8691E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r22
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x009e
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f53628a
            r4 = 0
            r5 = 56156(0xdb5c, float:7.8691E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00b4
        L_0x009e:
            com.ss.android.ugc.aweme.livewallpaper.b.q r1 = new com.ss.android.ugc.aweme.livewallpaper.b.q
            r1.<init>()
            r8.f53632e = r1
            com.ss.android.ugc.aweme.livewallpaper.b.q r1 = r8.f53632e
            int r2 = r8.i
            int r3 = r8.h
            boolean r1 = r1.a(r2, r3)
            if (r1 != 0) goto L_0x00b4
            r22.a()
        L_0x00b4:
            com.ss.android.ugc.aweme.livewallpaper.b.q r1 = r8.f53632e
            if (r1 == 0) goto L_0x00e0
            if (r0 != 0) goto L_0x00bb
            goto L_0x00e0
        L_0x00bb:
            java.lang.Object r1 = r8.f53630c
            if (r1 == 0) goto L_0x00e0
            float[] r1 = r8.k
            android.opengl.Matrix.setIdentityM(r1, r10)
            com.ss.android.ugc.aweme.livewallpaper.b.q r1 = r8.f53632e
            int r2 = r0.c()
            float[] r3 = r8.k
            r1.a(r2, r10, r10, r3)
            r0.d()
            com.ss.android.ugc.aweme.livewallpaper.b.e r1 = r8.n
            long r2 = java.lang.System.nanoTime()
            r1.a((long) r2)
            com.ss.android.ugc.aweme.livewallpaper.b.e r1 = r8.n
            r1.e()
        L_0x00e0:
            r0.b()
            return
        L_0x00e4:
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.k> r12 = r8.q
            monitor-enter(r12)
        L_0x00e7:
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.k> r0 = r8.q     // Catch:{ all -> 0x02aa }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02aa }
            if (r0 != 0) goto L_0x02a8
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.k> r0 = r8.q     // Catch:{ all -> 0x02aa }
            java.lang.Object r0 = r0.remove(r10)     // Catch:{ all -> 0x02aa }
            r13 = r0
            com.ss.android.ugc.aweme.livewallpaper.b.k r13 = (com.ss.android.ugc.aweme.livewallpaper.b.k) r13     // Catch:{ all -> 0x02aa }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x02aa }
            r1[r10] = r13     // Catch:{ all -> 0x02aa }
            com.meituan.robust.ChangeQuickRedirect r3 = f53628a     // Catch:{ all -> 0x02aa }
            r4 = 0
            r5 = 56153(0xdb59, float:7.8687E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x02aa }
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.k> r0 = com.ss.android.ugc.aweme.livewallpaper.b.k.class
            r6[r10] = r0     // Catch:{ all -> 0x02aa }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x02aa }
            r2 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02aa }
            if (r0 == 0) goto L_0x012a
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x02aa }
            r1[r10] = r13     // Catch:{ all -> 0x02aa }
            com.meituan.robust.ChangeQuickRedirect r3 = f53628a     // Catch:{ all -> 0x02aa }
            r4 = 0
            r5 = 56153(0xdb59, float:7.8687E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x02aa }
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.k> r0 = com.ss.android.ugc.aweme.livewallpaper.b.k.class
            r6[r10] = r0     // Catch:{ all -> 0x02aa }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x02aa }
            r2 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02aa }
            goto L_0x00e7
        L_0x012a:
            int r0 = r8.j     // Catch:{ all -> 0x02aa }
            if (r0 != r11) goto L_0x00e7
            com.ss.android.ugc.aweme.livewallpaper.b.f r0 = r8.f53631d     // Catch:{ all -> 0x02aa }
            if (r0 != 0) goto L_0x0174
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x02aa }
            com.meituan.robust.ChangeQuickRedirect r3 = f53628a     // Catch:{ all -> 0x02aa }
            r4 = 0
            r5 = 56154(0xdb5a, float:7.8689E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x02aa }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x02aa }
            r2 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02aa }
            if (r0 == 0) goto L_0x0158
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x02aa }
            com.meituan.robust.ChangeQuickRedirect r3 = f53628a     // Catch:{ all -> 0x02aa }
            r4 = 0
            r5 = 56154(0xdb5a, float:7.8689E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x02aa }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x02aa }
            r2 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02aa }
            goto L_0x0174
        L_0x0158:
            com.ss.android.ugc.aweme.livewallpaper.b.f r0 = new com.ss.android.ugc.aweme.livewallpaper.b.f     // Catch:{ all -> 0x02aa }
            r0.<init>()     // Catch:{ all -> 0x02aa }
            r8.f53631d = r0     // Catch:{ all -> 0x02aa }
            com.ss.android.ugc.aweme.livewallpaper.b.f r0 = r8.f53631d     // Catch:{ all -> 0x02aa }
            int r1 = r8.i     // Catch:{ all -> 0x02aa }
            int r2 = r8.h     // Catch:{ all -> 0x02aa }
            boolean r0 = r0.a(r1, r2)     // Catch:{ all -> 0x02aa }
            if (r0 != 0) goto L_0x016e
            r22.a()     // Catch:{ all -> 0x02aa }
        L_0x016e:
            r0 = 16
            float[] r0 = new float[r0]     // Catch:{ all -> 0x02aa }
            r8.s = r0     // Catch:{ all -> 0x02aa }
        L_0x0174:
            com.ss.android.ugc.aweme.livewallpaper.b.f r0 = r8.f53631d     // Catch:{ all -> 0x02aa }
            if (r0 == 0) goto L_0x00e7
            if (r13 != 0) goto L_0x017c
            goto L_0x00e7
        L_0x017c:
            java.lang.Object r0 = r8.f53630c     // Catch:{ all -> 0x02aa }
            if (r0 == 0) goto L_0x00e7
            monitor-enter(r13)     // Catch:{ all -> 0x02aa }
            boolean r0 = r13.f53639d     // Catch:{ all -> 0x02a5 }
            if (r0 == 0) goto L_0x0188
            monitor-exit(r13)     // Catch:{ all -> 0x02a5 }
            goto L_0x00e7
        L_0x0188:
            r13.updateTexImage()     // Catch:{ all -> 0x02a5 }
            long r0 = r13.getTimestamp()     // Catch:{ all -> 0x02a5 }
            monitor-exit(r13)     // Catch:{ all -> 0x02a5 }
            boolean r2 = r13.f53638c     // Catch:{ all -> 0x02aa }
            if (r2 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.livewallpaper.b.h r2 = r13.f53637b     // Catch:{ all -> 0x02aa }
            float[] r3 = r8.s     // Catch:{ all -> 0x02aa }
            r13.getTransformMatrix(r3)     // Catch:{ all -> 0x02aa }
            float[] r3 = r8.k     // Catch:{ all -> 0x02aa }
            android.opengl.Matrix.setIdentityM(r3, r10)     // Catch:{ all -> 0x02aa }
            float[] r3 = r8.k     // Catch:{ all -> 0x02aa }
            android.util.Pair<java.lang.Float, java.lang.Float> r4 = r8.l     // Catch:{ all -> 0x02aa }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x02aa }
            java.lang.Float r4 = (java.lang.Float) r4     // Catch:{ all -> 0x02aa }
            float r4 = r4.floatValue()     // Catch:{ all -> 0x02aa }
            android.util.Pair<java.lang.Float, java.lang.Float> r5 = r8.l     // Catch:{ all -> 0x02aa }
            java.lang.Object r5 = r5.second     // Catch:{ all -> 0x02aa }
            java.lang.Float r5 = (java.lang.Float) r5     // Catch:{ all -> 0x02aa }
            float r5 = r5.floatValue()     // Catch:{ all -> 0x02aa }
            r6 = 1065353216(0x3f800000, float:1.0)
            android.opengl.Matrix.scaleM(r3, r10, r4, r5, r6)     // Catch:{ all -> 0x02aa }
            int r3 = r8.i     // Catch:{ all -> 0x02aa }
            int r4 = r8.h     // Catch:{ all -> 0x02aa }
            android.opengl.GLES20.glViewport(r10, r10, r3, r4)     // Catch:{ all -> 0x02aa }
            com.ss.android.ugc.aweme.livewallpaper.b.f r3 = r8.f53631d     // Catch:{ all -> 0x02aa }
            int r4 = r2.c()     // Catch:{ all -> 0x02aa }
            float[] r5 = r8.s     // Catch:{ all -> 0x02aa }
            float[] r6 = r8.k     // Catch:{ all -> 0x02aa }
            r7 = 5
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x02aa }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x02aa }
            r13[r10] = r14     // Catch:{ all -> 0x02aa }
            java.lang.Byte r14 = java.lang.Byte.valueOf(r10)     // Catch:{ all -> 0x02aa }
            r13[r9] = r14     // Catch:{ all -> 0x02aa }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02aa }
            r20 = 2
            r13[r20] = r14     // Catch:{ all -> 0x02aa }
            r21 = 3
            r13[r21] = r5     // Catch:{ all -> 0x02aa }
            r13[r11] = r6     // Catch:{ all -> 0x02aa }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.livewallpaper.b.o.f53649a     // Catch:{ all -> 0x02aa }
            r16 = 0
            r17 = 56185(0xdb79, float:7.8732E-41)
            java.lang.Class[] r14 = new java.lang.Class[r7]     // Catch:{ all -> 0x02aa }
            java.lang.Class r18 = java.lang.Integer.TYPE     // Catch:{ all -> 0x02aa }
            r14[r10] = r18     // Catch:{ all -> 0x02aa }
            java.lang.Class r18 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x02aa }
            r14[r9] = r18     // Catch:{ all -> 0x02aa }
            java.lang.Class r18 = java.lang.Integer.TYPE     // Catch:{ all -> 0x02aa }
            r14[r20] = r18     // Catch:{ all -> 0x02aa }
            java.lang.Class<float[]> r18 = float[].class
            r14[r21] = r18     // Catch:{ all -> 0x02aa }
            java.lang.Class<float[]> r18 = float[].class
            r14[r11] = r18     // Catch:{ all -> 0x02aa }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ all -> 0x02aa }
            r18 = r14
            r14 = r3
            boolean r13 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x02aa }
            if (r13 == 0) goto L_0x024f
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x02aa }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x02aa }
            r13[r10] = r4     // Catch:{ all -> 0x02aa }
            java.lang.Byte r4 = java.lang.Byte.valueOf(r10)     // Catch:{ all -> 0x02aa }
            r13[r9] = r4     // Catch:{ all -> 0x02aa }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02aa }
            r13[r20] = r4     // Catch:{ all -> 0x02aa }
            r13[r21] = r5     // Catch:{ all -> 0x02aa }
            r13[r11] = r6     // Catch:{ all -> 0x02aa }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.livewallpaper.b.o.f53649a     // Catch:{ all -> 0x02aa }
            r16 = 0
            r17 = 56185(0xdb79, float:7.8732E-41)
            java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch:{ all -> 0x02aa }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x02aa }
            r4[r10] = r5     // Catch:{ all -> 0x02aa }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x02aa }
            r4[r9] = r5     // Catch:{ all -> 0x02aa }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x02aa }
            r4[r20] = r5     // Catch:{ all -> 0x02aa }
            java.lang.Class<float[]> r5 = float[].class
            r4[r21] = r5     // Catch:{ all -> 0x02aa }
            java.lang.Class<float[]> r5 = float[].class
            r4[r11] = r5     // Catch:{ all -> 0x02aa }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ all -> 0x02aa }
            r14 = r3
            r18 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x02aa }
            goto L_0x0296
        L_0x024f:
            boolean r13 = r3.h     // Catch:{ all -> 0x02aa }
            if (r13 == 0) goto L_0x0296
            r13 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r13)     // Catch:{ all -> 0x02aa }
            int r13 = r3.f53652d     // Catch:{ all -> 0x02aa }
            android.opengl.GLES20.glUseProgram(r13)     // Catch:{ all -> 0x02aa }
            r13 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r13)     // Catch:{ all -> 0x02aa }
            int r13 = r3.a()     // Catch:{ all -> 0x02aa }
            android.opengl.GLES20.glBindTexture(r13, r4)     // Catch:{ all -> 0x02aa }
            r3.a(r10)     // Catch:{ all -> 0x02aa }
            int r4 = r3.f53653e     // Catch:{ all -> 0x02aa }
            android.opengl.GLES20.glUniformMatrix4fv(r4, r9, r10, r6, r10)     // Catch:{ all -> 0x02aa }
            if (r5 != 0) goto L_0x0276
            float[] r5 = com.ss.android.ugc.aweme.livewallpaper.b.i.f53626b     // Catch:{ all -> 0x02aa }
        L_0x0276:
            int r4 = r3.f53654f     // Catch:{ all -> 0x02aa }
            android.opengl.GLES20.glUniformMatrix4fv(r4, r9, r10, r5, r10)     // Catch:{ all -> 0x02aa }
            int r4 = r3.g     // Catch:{ all -> 0x02aa }
            android.opengl.GLES20.glUniform1i(r4, r10)     // Catch:{ all -> 0x02aa }
            android.opengl.GLES20.glDrawArrays(r7, r10, r11)     // Catch:{ all -> 0x02aa }
            android.opengl.GLES20.glDisableVertexAttribArray(r10)     // Catch:{ all -> 0x02aa }
            android.opengl.GLES20.glDisableVertexAttribArray(r9)     // Catch:{ all -> 0x02aa }
            r4 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r4, r10)     // Catch:{ all -> 0x02aa }
            int r3 = r3.a()     // Catch:{ all -> 0x02aa }
            android.opengl.GLES20.glBindTexture(r3, r10)     // Catch:{ all -> 0x02aa }
        L_0x0296:
            r2.d()     // Catch:{ all -> 0x02aa }
            com.ss.android.ugc.aweme.livewallpaper.b.e r2 = r8.n     // Catch:{ all -> 0x02aa }
            r2.a((long) r0)     // Catch:{ all -> 0x02aa }
            com.ss.android.ugc.aweme.livewallpaper.b.e r0 = r8.n     // Catch:{ all -> 0x02aa }
            r0.e()     // Catch:{ all -> 0x02aa }
            goto L_0x00e7
        L_0x02a5:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x02a5 }
            throw r0     // Catch:{ all -> 0x02aa }
        L_0x02a8:
            monitor-exit(r12)     // Catch:{ all -> 0x02aa }
            return
        L_0x02aa:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x02aa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.b.j.a(java.lang.Object):void");
    }

    public j(Object obj, Object obj2) {
        this.f53630c = obj;
        this.t = false;
        this.j = 3;
        this.o.start();
        g();
        this.k = new float[16];
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53628a, false, 56138, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53628a, false, 56138, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Message obtainMessage = this.p.obtainMessage(10);
        obtainMessage.arg1 = i2;
        obtainMessage.arg2 = i3;
        this.p.sendMessage(obtainMessage);
    }

    private h b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{0, 0}, this, f53628a, false, 56150, new Class[]{Integer.TYPE, Integer.TYPE}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{0, 0}, this, f53628a, false, 56150, new Class[]{Integer.TYPE, Integer.TYPE}, h.class);
        }
        Message obtainMessage = this.p.obtainMessage(3);
        Message message = new Message();
        message.arg1 = 1;
        obtainMessage.arg1 = 0;
        obtainMessage.arg2 = 0;
        obtainMessage.obj = message;
        this.p.sendMessage(obtainMessage);
        try {
            synchronized (message) {
                while (message.arg1 != 0) {
                    message.wait(10);
                }
            }
            return (h) message.obj;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
