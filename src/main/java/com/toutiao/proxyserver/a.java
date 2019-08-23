package com.toutiao.proxyserver;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.a;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.Call;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.toutiao.proxyserver.b.b;
import com.toutiao.proxyserver.b.c;
import com.toutiao.proxyserver.net.INetApi;
import com.toutiao.proxyserver.net.d;
import com.toutiao.proxyserver.net.e;
import com.toutiao.proxyserver.net.f;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public abstract class a implements x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f79960a;

    /* renamed from: b  reason: collision with root package name */
    protected volatile c f79961b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f79962c;

    /* renamed from: d  reason: collision with root package name */
    protected final AtomicInteger f79963d = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    protected final AtomicLong f79964e = new AtomicLong();

    /* renamed from: f  reason: collision with root package name */
    protected volatile List<com.toutiao.proxyserver.net.c> f79965f;
    protected volatile com.toutiao.proxyserver.net.a g;
    protected volatile String h;
    protected volatile String i;
    protected volatile t j;
    protected volatile y k;
    protected volatile int l;
    protected AtomicLong m = new AtomicLong(0);
    private AtomicLong n = new AtomicLong(0);
    private final AtomicInteger o = new AtomicInteger(0);
    private int p = -1;

    public final e a(String str, int i2, int i3, String str2) throws IOException {
        if (!PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f79960a, false, 91587, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, e.class)) {
            return b.a(this, str, i2, i3, str2);
        }
        return (e) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f79960a, false, 91587, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, e.class);
    }

    public final int g() {
        if (this.j != null) {
            return this.j.f80255d.f80257b;
        }
        if (this.f79961b instanceof g) {
            return 1;
        }
        return 0;
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f79960a, false, 91581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f79960a, false, 91581, new Class[0], Void.TYPE);
            return;
        }
        if (this.o.compareAndSet(0, 1)) {
            b();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f79960a, false, 91582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f79960a, false, 91582, new Class[0], Void.TYPE);
            return;
        }
        com.toutiao.proxyserver.net.a aVar = this.g;
        this.g = null;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f79960a, false, 91583, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f79960a, false, 91583, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.o.get() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f79960a, false, 91584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f79960a, false, 91584, new Class[0], Void.TYPE);
            return;
        }
        this.o.compareAndSet(0, 2);
        this.g = null;
    }

    public final boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f79960a, false, 91585, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f79960a, false, 91585, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.o.get() == 2) {
            z = true;
        }
        return z;
    }

    public final void f() throws e {
        if (PatchProxy.isSupport(new Object[0], this, f79960a, false, 91586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f79960a, false, 91586, new Class[0], Void.TYPE);
        } else if (c()) {
            throw new e();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f79960a, false, 91592, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f79960a, false, 91592, new Class[0], Void.TYPE);
            return;
        }
        this.m.getAndAdd(SystemClock.elapsedRealtime() - this.n.get());
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f79960a, false, 91593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f79960a, false, 91593, new Class[0], Void.TYPE);
            return;
        }
        this.n.set(SystemClock.elapsedRealtime());
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f79960a, false, 91594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f79960a, false, 91594, new Class[0], Void.TYPE);
            return;
        }
        this.m.set(0);
        this.n.set(0);
    }

    public final void a(String str) {
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f79960a, false, 91595, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f79960a, false, 91595, new Class[]{String.class}, Void.TYPE);
            return;
        }
        final n nVar = Proxy.g;
        if (nVar != null) {
            com.toutiao.proxyserver.f.c.b((Runnable) new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f79978a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f79978a, false, 91600, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f79978a, false, 91600, new Class[0], Void.TYPE);
                        return;
                    }
                    nVar.a(b.a(a.this.g()), str2, a.this.f79963d.get(), a.this.m.get(), 0);
                }
            });
        }
    }

    public a(c cVar, c cVar2) {
        this.f79961b = cVar;
        this.f79962c = cVar2;
        this.l = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r5 = r12;
        r6 = r13;
        r1 = new com.toutiao.proxyserver.a.AnonymousClass1(r11);
        com.toutiao.proxyserver.f.c.b((java.lang.Runnable) r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r12, int r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r9 = 0
            r1[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r10 = 1
            r1[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f79960a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r9] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 91589(0x165c5, float:1.28344E-40)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x004f
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r1[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f79960a
            r4 = 0
            r5 = 91589(0x165c5, float:1.28344E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r9] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x004f:
            com.toutiao.proxyserver.n r3 = com.toutiao.proxyserver.Proxy.g
            if (r3 == 0) goto L_0x008c
            if (r12 <= 0) goto L_0x008c
            if (r13 >= 0) goto L_0x0058
            goto L_0x008c
        L_0x0058:
            int r1 = com.toutiao.proxyserver.Proxy.r
            int r4 = r11.g()
            if (r1 == r10) goto L_0x0064
            if (r1 != r8) goto L_0x0088
            if (r4 != r10) goto L_0x0088
        L_0x0064:
            float r1 = (float) r13
            float r2 = (float) r12
            float r1 = r1 / r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            r2 = 100
            if (r1 <= r2) goto L_0x0072
            r1 = 100
        L_0x0072:
            monitor-enter(r11)
            int r2 = r11.p     // Catch:{ all -> 0x0089 }
            if (r1 > r2) goto L_0x0079
            monitor-exit(r11)     // Catch:{ all -> 0x0089 }
            return
        L_0x0079:
            r11.p = r1     // Catch:{ all -> 0x0089 }
            monitor-exit(r11)     // Catch:{ all -> 0x0089 }
            com.toutiao.proxyserver.a$1 r7 = new com.toutiao.proxyserver.a$1
            r1 = r7
            r2 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r3, r4, r5, r6)
            com.toutiao.proxyserver.f.c.b((java.lang.Runnable) r7)
        L_0x0088:
            return
        L_0x0089:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0089 }
            throw r0
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.a.a(int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: com.toutiao.proxyserver.net.f} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0246 A[Catch:{ Throwable -> 0x02f4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Throwable r24, java.lang.String r25, int r26) {
        /*
            r23 = this;
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            r13 = 1
            r0[r13] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r14 = 2
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f79960a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 91591(0x165c7, float:1.28346E-40)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005c
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r12] = r8
            r1[r13] = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r1[r14] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f79960a
            r4 = 0
            r5 = 91591(0x165c7, float:1.28346E-40)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r6[r12] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r13] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r14] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x005c:
            r15 = r23
            com.toutiao.proxyserver.net.a r7 = r15.g
            if (r7 == 0) goto L_0x02f4
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = com.toutiao.proxyserver.net.a.f80126a
            r3 = 0
            r4 = 91802(0x1669a, float:1.28642E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r7
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b2
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = com.toutiao.proxyserver.net.a.f80126a
            r3 = 0
            r4 = 91802(0x1669a, float:1.28642E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r7
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00b2:
            boolean r0 = r7.g
            if (r0 != 0) goto L_0x02f4
            r7.g = r13
            com.toutiao.proxyserver.net.e r0 = r7.f80129d     // Catch:{ Throwable -> 0x02f4 }
            if (r0 != 0) goto L_0x00bd
            return
        L_0x00bd:
            com.toutiao.proxyserver.net.e r0 = r7.f80129d     // Catch:{ Throwable -> 0x02f4 }
            com.bytedance.retrofit2.SsResponse<?> r0 = r0.f80161e     // Catch:{ Throwable -> 0x02f4 }
            if (r0 == 0) goto L_0x023f
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x02f4 }
            r0[r12] = r8     // Catch:{ Throwable -> 0x02f4 }
            r0[r13] = r9     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)     // Catch:{ Throwable -> 0x02f4 }
            r0[r14] = r1     // Catch:{ Throwable -> 0x02f4 }
            com.meituan.robust.ChangeQuickRedirect r2 = com.toutiao.proxyserver.net.a.f80126a     // Catch:{ Throwable -> 0x02f4 }
            r3 = 0
            r4 = 91804(0x1669c, float:1.28645E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r5[r12] = r1     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x02f4 }
            r5[r14] = r1     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x02f4 }
            r1 = r7
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x02f4 }
            if (r0 == 0) goto L_0x0114
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x02f4 }
            r0[r12] = r8     // Catch:{ Throwable -> 0x02f4 }
            r0[r13] = r9     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)     // Catch:{ Throwable -> 0x02f4 }
            r0[r14] = r1     // Catch:{ Throwable -> 0x02f4 }
            com.meituan.robust.ChangeQuickRedirect r2 = com.toutiao.proxyserver.net.a.f80126a     // Catch:{ Throwable -> 0x02f4 }
            r3 = 0
            r4 = 91804(0x1669c, float:1.28645E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r5[r12] = r1     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x02f4 }
            r5[r14] = r1     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x02f4 }
            r1 = r7
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x02f4 }
            goto L_0x023f
        L_0x0114:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x02f4 }
            r0 = 0
            com.bytedance.retrofit2.Call<?> r1 = r7.f80127b     // Catch:{ Throwable -> 0x02f4 }
            boolean r1 = r1 instanceof com.bytedance.retrofit2.i     // Catch:{ Throwable -> 0x02f4 }
            if (r1 == 0) goto L_0x0126
            com.bytedance.retrofit2.Call<?> r1 = r7.f80127b     // Catch:{ Throwable -> 0x02f4 }
            com.bytedance.retrofit2.i r1 = (com.bytedance.retrofit2.i) r1     // Catch:{ Throwable -> 0x02f4 }
            r1.doCollect()     // Catch:{ Throwable -> 0x02f4 }
        L_0x0126:
            com.toutiao.proxyserver.net.e r1 = r7.f80129d     // Catch:{ Throwable -> 0x02f4 }
            com.bytedance.retrofit2.SsResponse<?> r1 = r1.f80161e     // Catch:{ Throwable -> 0x02f4 }
            com.bytedance.retrofit2.client.Response r1 = r1.raw()     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Object r1 = r1.getExtraInfo()     // Catch:{ Throwable -> 0x02f4 }
            boolean r2 = r1 instanceof com.toutiao.proxyserver.net.f     // Catch:{ Throwable -> 0x02f4 }
            if (r2 == 0) goto L_0x0145
            r0 = r1
            com.toutiao.proxyserver.net.f r0 = (com.toutiao.proxyserver.net.f) r0     // Catch:{ Throwable -> 0x02f4 }
            long r1 = r7.f80130e     // Catch:{ Throwable -> 0x02f4 }
            r0.f19734e = r1     // Catch:{ Throwable -> 0x02f4 }
            long r1 = r7.f80131f     // Catch:{ Throwable -> 0x02f4 }
            r0.f19735f = r1     // Catch:{ Throwable -> 0x02f4 }
            r0.h = r5     // Catch:{ Throwable -> 0x02f4 }
            r0.C = r10     // Catch:{ Throwable -> 0x02f4 }
        L_0x0145:
            if (r8 != 0) goto L_0x019a
            long r1 = r7.f80130e     // Catch:{ Throwable -> 0x02f4 }
            r3 = 0
            long r16 = r5 - r1
            long r1 = r7.f80130e     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.net.d r3 = r7.f80128c     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r3 = r3.f80146b     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.net.e r4 = r7.f80129d     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r14 = "X-TT-LOGID"
            java.lang.String r13 = ""
            java.lang.String r21 = r4.a(r14, r13)     // Catch:{ Throwable -> 0x02f4 }
            r18 = r1
            r20 = r3
            r22 = r0
            com.bytedance.frameworks.baselib.network.http.e.a(r16, r18, r20, r21, r22)     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r1 = "HttpCall"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r3 = "api_succeed, from: "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x02f4 }
            r2.append(r9)     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r3 = ", cost: "
            r2.append(r3)     // Catch:{ Throwable -> 0x02f4 }
            long r3 = r7.f80130e     // Catch:{ Throwable -> 0x02f4 }
            r13 = 0
            long r5 = r5 - r3
            r2.append(r5)     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r3 = ", netInfo: "
            r2.append(r3)     // Catch:{ Throwable -> 0x02f4 }
            r2.append(r0)     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r0 = ", url: "
            r2.append(r0)     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.net.d r0 = r7.f80128c     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r0 = r0.f80146b     // Catch:{ Throwable -> 0x02f4 }
            r2.append(r0)     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r0 = r2.toString()     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.d.c.b(r1, r0)     // Catch:{ Throwable -> 0x02f4 }
            goto L_0x023f
        L_0x019a:
            if (r0 != 0) goto L_0x01be
            com.bytedance.retrofit2.Call<?> r1 = r7.f80127b     // Catch:{ Throwable -> 0x02f4 }
            boolean r1 = r1 instanceof com.bytedance.retrofit2.j     // Catch:{ Throwable -> 0x02f4 }
            if (r1 == 0) goto L_0x01be
            com.bytedance.retrofit2.Call<?> r1 = r7.f80127b     // Catch:{ Throwable -> 0x02f4 }
            com.bytedance.retrofit2.j r1 = (com.bytedance.retrofit2.j) r1     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Object r1 = r1.getRequestInfo()     // Catch:{ Throwable -> 0x02f4 }
            boolean r2 = r1 instanceof com.toutiao.proxyserver.net.f     // Catch:{ Throwable -> 0x02f4 }
            if (r2 == 0) goto L_0x01be
            com.toutiao.proxyserver.net.f r1 = (com.toutiao.proxyserver.net.f) r1     // Catch:{ Throwable -> 0x02f4 }
            long r2 = r7.f80130e     // Catch:{ Throwable -> 0x02f4 }
            r1.f19734e = r2     // Catch:{ Throwable -> 0x02f4 }
            long r2 = r7.f80131f     // Catch:{ Throwable -> 0x02f4 }
            r1.f19735f = r2     // Catch:{ Throwable -> 0x02f4 }
            r1.h = r5     // Catch:{ Throwable -> 0x02f4 }
            r1.C = r10     // Catch:{ Throwable -> 0x02f4 }
            r13 = r1
            goto L_0x01bf
        L_0x01be:
            r13 = r0
        L_0x01bf:
            if (r13 == 0) goto L_0x01d0
            org.json.JSONObject r0 = r13.w     // Catch:{ Throwable -> 0x02f4 }
            if (r0 == 0) goto L_0x01d0
            org.json.JSONObject r0 = r13.w     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r1 = "ex"
            java.lang.String r2 = r24.getMessage()     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.f.c.a((org.json.JSONObject) r0, (java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ Throwable -> 0x02f4 }
        L_0x01d0:
            if (r13 == 0) goto L_0x01df
            boolean r0 = r8 instanceof com.bytedance.frameworks.baselib.network.http.cronet.a.a     // Catch:{ Throwable -> 0x02f4 }
            if (r0 == 0) goto L_0x01df
            r0 = r8
            com.bytedance.frameworks.baselib.network.http.cronet.a.a r0 = (com.bytedance.frameworks.baselib.network.http.cronet.a.a) r0     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r0 = r0.getRequestLog()     // Catch:{ Throwable -> 0x02f4 }
            r13.v = r0     // Catch:{ Throwable -> 0x02f4 }
        L_0x01df:
            long r0 = r7.f80130e     // Catch:{ Throwable -> 0x02f4 }
            r2 = 0
            long r0 = r5 - r0
            long r2 = r7.f80130e     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.net.d r4 = r7.f80128c     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r4 = r4.f80146b     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.net.e r14 = r7.f80129d     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r12 = "X-TT-LOGID"
            java.lang.String r11 = ""
            java.lang.String r11 = r14.a(r12, r11)     // Catch:{ Throwable -> 0x02f4 }
            r16 = r5
            r5 = r11
            r6 = r13
            r11 = r7
            r7 = r24
            com.bytedance.frameworks.baselib.network.http.e.a(r0, r2, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r0 = "HttpCall"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r2 = "api_error, from: "
            r1.<init>(r2)     // Catch:{ Throwable -> 0x02f4 }
            r1.append(r9)     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r2 = ", cost: "
            r1.append(r2)     // Catch:{ Throwable -> 0x02f4 }
            long r2 = r11.f80130e     // Catch:{ Throwable -> 0x02f4 }
            r4 = 0
            long r5 = r16 - r2
            r1.append(r5)     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r2 = ", netInfo: "
            r1.append(r2)     // Catch:{ Throwable -> 0x02f4 }
            r1.append(r13)     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r2 = ", url: "
            r1.append(r2)     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.net.d r2 = r11.f80128c     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r2 = r2.f80146b     // Catch:{ Throwable -> 0x02f4 }
            r1.append(r2)     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r2 = ", error: "
            r1.append(r2)     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r2 = r24.getMessage()     // Catch:{ Throwable -> 0x02f4 }
            r1.append(r2)     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.d.c.d(r0, r1)     // Catch:{ Throwable -> 0x02f4 }
            goto L_0x0240
        L_0x023f:
            r11 = r7
        L_0x0240:
            com.toutiao.proxyserver.net.e r0 = r11.f80129d     // Catch:{ Throwable -> 0x02f4 }
            okhttp3.Response r0 = r0.f80162f     // Catch:{ Throwable -> 0x02f4 }
            if (r0 == 0) goto L_0x02f3
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x02f4 }
            r0 = 0
            r1[r0] = r8     // Catch:{ Throwable -> 0x02f4 }
            r0 = 1
            r1[r0] = r9     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)     // Catch:{ Throwable -> 0x02f4 }
            r2 = 2
            r1[r2] = r0     // Catch:{ Throwable -> 0x02f4 }
            com.meituan.robust.ChangeQuickRedirect r2 = com.toutiao.proxyserver.net.a.f80126a     // Catch:{ Throwable -> 0x02f4 }
            r3 = 0
            r4 = 91803(0x1669b, float:1.28643E-40)
            r0 = 3
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r6 = 0
            r5[r6] = r0     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6 = 1
            r5[r6] = r0     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x02f4 }
            r6 = 2
            r5[r6] = r0     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x02f4 }
            r0 = r1
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x02f4 }
            if (r0 == 0) goto L_0x02a8
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x02f4 }
            r0 = 0
            r1[r0] = r8     // Catch:{ Throwable -> 0x02f4 }
            r0 = 1
            r1[r0] = r9     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)     // Catch:{ Throwable -> 0x02f4 }
            r2 = 2
            r1[r2] = r0     // Catch:{ Throwable -> 0x02f4 }
            com.meituan.robust.ChangeQuickRedirect r2 = com.toutiao.proxyserver.net.a.f80126a     // Catch:{ Throwable -> 0x02f4 }
            r3 = 0
            r4 = 91803(0x1669b, float:1.28643E-40)
            r0 = 3
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r6 = 0
            r5[r6] = r0     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6 = 1
            r5[r6] = r0     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x02f4 }
            r6 = 2
            r5[r6] = r0     // Catch:{ Throwable -> 0x02f4 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x02f4 }
            r0 = r1
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x02f4 }
            goto L_0x02f4
        L_0x02a8:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.net.f r9 = new com.toutiao.proxyserver.net.f     // Catch:{ Throwable -> 0x02f4 }
            r9.<init>()     // Catch:{ Throwable -> 0x02f4 }
            long r2 = r11.f80130e     // Catch:{ Throwable -> 0x02f4 }
            r9.f19734e = r2     // Catch:{ Throwable -> 0x02f4 }
            long r2 = r11.f80131f     // Catch:{ Throwable -> 0x02f4 }
            r9.f19735f = r2     // Catch:{ Throwable -> 0x02f4 }
            r9.h = r0     // Catch:{ Throwable -> 0x02f4 }
            r9.C = r10     // Catch:{ Throwable -> 0x02f4 }
            if (r8 != 0) goto L_0x02d9
            long r2 = r11.f80130e     // Catch:{ Throwable -> 0x02f4 }
            r4 = 0
            long r2 = r0 - r2
            long r4 = r11.f80130e     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.net.d r0 = r11.f80128c     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r6 = r0.f80146b     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.net.e r0 = r11.f80129d     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r1 = "X-TT-LOGID"
            java.lang.String r7 = ""
            java.lang.String r7 = r0.a(r1, r7)     // Catch:{ Throwable -> 0x02f4 }
            r8 = r9
            com.bytedance.frameworks.baselib.network.http.e.a(r2, r4, r6, r7, r8)     // Catch:{ Throwable -> 0x02f4 }
            goto L_0x02f4
        L_0x02d9:
            long r2 = r11.f80130e     // Catch:{ Throwable -> 0x02f4 }
            r4 = 0
            long r0 = r0 - r2
            long r2 = r11.f80130e     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.net.d r4 = r11.f80128c     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r4 = r4.f80146b     // Catch:{ Throwable -> 0x02f4 }
            com.toutiao.proxyserver.net.e r5 = r11.f80129d     // Catch:{ Throwable -> 0x02f4 }
            java.lang.String r6 = "X-TT-LOGID"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.a(r6, r7)     // Catch:{ Throwable -> 0x02f4 }
            r6 = r9
            r7 = r24
            com.bytedance.frameworks.baselib.network.http.e.a(r0, r2, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x02f4 }
        L_0x02f3:
            return
        L_0x02f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.a.a(java.lang.Throwable, java.lang.String, int):void");
    }

    public final void a(String str, String str2, int i2, long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i2), new Long(j3)}, this, f79960a, false, 91596, new Class[]{String.class, String.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, str2, Integer.valueOf(i2), new Long(j3)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f79960a, false, 91596, new Class[]{String.class, String.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        final String str3 = str;
        final String str4 = str2;
        final int i3 = i2;
        final long j4 = j2;
        AnonymousClass4 r0 = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f79982a;

            public final void run() {
                com.toutiao.proxyserver.a.b bVar;
                if (PatchProxy.isSupport(new Object[0], this, f79982a, false, 91601, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f79982a, false, 91601, new Class[0], Void.TYPE);
                    return;
                }
                if (Proxy.g != null) {
                    try {
                        n nVar = Proxy.g;
                        String str = str3;
                        String str2 = str4;
                        int i = i3;
                        long j = j4;
                        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i), new Long(j)}, null, com.toutiao.proxyserver.f.c.f80072a, true, 91895, new Class[]{String.class, String.class, Integer.TYPE, Long.TYPE}, com.toutiao.proxyserver.a.b.class)) {
                            Object[] objArr = {str, str2, Integer.valueOf(i), new Long(j)};
                            Object[] objArr2 = objArr;
                            bVar = (com.toutiao.proxyserver.a.b) PatchProxy.accessDispatch(objArr2, null, com.toutiao.proxyserver.f.c.f80072a, true, 91895, new Class[]{String.class, String.class, Integer.TYPE, Long.TYPE}, com.toutiao.proxyserver.a.b.class);
                        } else {
                            com.toutiao.proxyserver.a.b bVar2 = new com.toutiao.proxyserver.a.b();
                            bVar2.f79998a = str;
                            bVar2.f79999b = str2;
                            bVar2.f80000c = i;
                            bVar2.f80001d = (int) j;
                            bVar = bVar2;
                        }
                        nVar.a(bVar);
                    } catch (Exception unused) {
                    }
                }
            }
        };
        com.toutiao.proxyserver.f.c.b((Runnable) r0);
    }

    public final e b(String str, int i2, int i3, String str2) throws IOException {
        String str3;
        boolean z;
        d dVar;
        com.toutiao.proxyserver.net.a aVar;
        Call call;
        String str4;
        String str5;
        String str6;
        String str7 = str;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{str7, Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f79960a, false, 91588, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{str7, Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f79960a, false, 91588, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, e.class);
        }
        d.a aVar2 = new d.a();
        if (PatchProxy.isSupport(new Object[]{str2}, aVar2, d.a.f80151a, false, 91819, new Class[]{String.class}, d.a.class)) {
            d.a aVar3 = (d.a) PatchProxy.accessDispatch(new Object[]{str2}, aVar2, d.a.f80151a, false, 91819, new Class[]{String.class}, d.a.class);
        } else if (str2 != null) {
            String upperCase = str2.toUpperCase();
            if ("GET".equals(upperCase) || "HEAD".equals(upperCase)) {
                aVar2.f80153c = upperCase;
            } else {
                throw new IllegalArgumentException("for now only GET and HEAD is support");
            }
        } else {
            throw new IllegalArgumentException("method is null");
        }
        List<com.toutiao.proxyserver.net.c> list = this.f79965f;
        if (list != null && !list.isEmpty()) {
            for (com.toutiao.proxyserver.net.c next : list) {
                if (!"Range".equalsIgnoreCase(next.f80143b) && !"Connection".equalsIgnoreCase(next.f80143b) && !"Proxy-Connection".equalsIgnoreCase(next.f80143b) && !"Host".equalsIgnoreCase(next.f80143b)) {
                    aVar2.a(next.f80143b, next.f80144c);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, com.toutiao.proxyserver.f.c.f80072a, true, 91872, new Class[]{Integer.TYPE, Integer.TYPE}, String.class)) {
            str3 = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, com.toutiao.proxyserver.f.c.f80072a, true, 91872, new Class[]{Integer.TYPE, Integer.TYPE}, String.class);
        } else {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, com.toutiao.proxyserver.f.c.f80072a, true, 91873, new Class[]{Integer.TYPE, Integer.TYPE}, String.class)) {
                str6 = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, com.toutiao.proxyserver.f.c.f80072a, true, 91873, new Class[]{Integer.TYPE, Integer.TYPE}, String.class);
            } else if (i4 >= 0 && i5 > 0) {
                str6 = i4 + "-" + i5;
            } else if (i4 > 0) {
                str6 = i4 + "-";
            } else if (i4 >= 0 || i5 <= 0) {
                str6 = null;
            } else {
                str6 = "-" + i5;
            }
            if (str6 == null) {
                str3 = null;
            } else {
                str3 = "bytes=" + str6;
            }
        }
        if (str3 != null) {
            aVar2.a("Range", str3);
        }
        try {
            if (this.j == null) {
                str4 = "preloader";
            } else {
                str4 = "proxy";
            }
            aVar2.a("Vpwp-Type", str4);
            aVar2.a("Vpwp-Key", this.i);
            aVar2.a("Vpwp-Raw-Key", this.h);
            if (this.j == null) {
                str5 = "";
            } else {
                str5 = this.j.f80255d.g;
                if (str5 == null) {
                    str5 = "";
                }
            }
            if (!TextUtils.isEmpty(str5)) {
                aVar2.a("Vpwp-Mp-Range", str5);
            }
            aVar2.a("Vpwp-Flag", String.valueOf(g()));
        } catch (Throwable th) {
            com.toutiao.proxyserver.d.c.d("AbsTask", com.toutiao.proxyserver.d.c.a(th));
        }
        if (PatchProxy.isSupport(new Object[]{str7}, aVar2, d.a.f80151a, false, 91818, new Class[]{String.class}, d.a.class)) {
            d.a aVar4 = (d.a) PatchProxy.accessDispatch(new Object[]{str7}, aVar2, d.a.f80151a, false, 91818, new Class[]{String.class}, d.a.class);
        } else if (str7 == null) {
            throw new IllegalArgumentException("url is null");
        } else if (str7.startsWith("http://") || str7.startsWith("https://")) {
            aVar2.f80152b = str7;
        } else {
            throw new IllegalArgumentException("url should start with http:// or https://, url: " + str7);
        }
        if (Proxy.q) {
            aVar2.a("Cache-Control", "no-cache");
        }
        if (this.j == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            p a2 = p.a();
            aVar2.a(a2.i);
            aVar2.b(a2.j);
            aVar2.c(a2.k);
        } else {
            q a3 = q.a();
            aVar2.a(a3.k);
            aVar2.b(a3.l);
            aVar2.c(a3.m);
        }
        if (PatchProxy.isSupport(new Object[0], aVar2, d.a.f80151a, false, 91821, new Class[0], d.class)) {
            dVar = (d) PatchProxy.accessDispatch(new Object[0], aVar2, d.a.f80151a, false, 91821, new Class[0], d.class);
        } else if (aVar2.f80152b != null) {
            if (aVar2.f80153c == null) {
                aVar2.f80153c = "GET";
            }
            dVar = new d(aVar2, (byte) 0);
        } else {
            throw new IllegalStateException("url is null");
        }
        if (PatchProxy.isSupport(new Object[]{dVar}, null, com.toutiao.proxyserver.net.b.f80132a, true, 91805, new Class[]{d.class}, com.toutiao.proxyserver.net.a.class)) {
            aVar = (com.toutiao.proxyserver.net.a) PatchProxy.accessDispatch(new Object[]{dVar}, null, com.toutiao.proxyserver.net.b.f80132a, true, 91805, new Class[]{d.class}, com.toutiao.proxyserver.net.a.class);
        } else {
            if (dVar.a("Accept-Encoding") == null) {
                dVar.f80148d.add(new com.toutiao.proxyserver.net.c("Accept-Encoding", "identity"));
            }
            if (Proxy.k) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair<String, String> parseUrl = UrlUtils.parseUrl(dVar.f80146b, linkedHashMap);
                String str8 = (String) parseUrl.second;
                INetApi iNetApi = (INetApi) RetrofitUtils.createSsService((String) parseUrl.first, INetApi.class);
                if (iNetApi != null) {
                    com.bytedance.ttnet.b.d dVar2 = new com.bytedance.ttnet.b.d();
                    dVar2.f19738c = dVar.f80149e;
                    dVar2.f19739d = dVar.f80150f;
                    dVar2.f19740e = dVar.g;
                    List a4 = com.toutiao.proxyserver.net.b.a(dVar.f80148d);
                    if ("GET".equals(dVar.f80147c)) {
                        call = iNetApi.get(str8, linkedHashMap, a4, dVar2);
                    } else {
                        call = iNetApi.head(str8, linkedHashMap, a4, dVar2);
                    }
                    com.toutiao.proxyserver.d.c.b("HttpExcutor", "use ttnet retrofit");
                    if (PatchProxy.isSupport(new Object[0], null, f.z, true, 91829, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f.z, true, 91829, new Class[0], Void.TYPE);
                    } else if (!f.D.getAndSet(true)) {
                        com.bytedance.frameworks.baselib.network.http.a.a(new a.C0159a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f80163a;

                            public final a a() {
                                if (!PatchProxy.isSupport(new Object[0], this, f80163a, false, 91830, new Class[0], a.class)) {
                                    return new f();
                                }
                                return (a) PatchProxy.accessDispatch(new Object[0], this, f80163a, false, 91830, new Class[0], a.class);
                            }
                        });
                    }
                    aVar = new com.toutiao.proxyserver.net.a(call, dVar);
                }
            }
            Request.Builder builder = new Request.Builder();
            builder.url(dVar.f80146b);
            builder.method(dVar.f80147c, null);
            builder.headers(com.toutiao.proxyserver.net.b.b(dVar.f80148d));
            OkHttpClient a5 = com.toutiao.proxyserver.net.b.a();
            if (!(dVar.f80149e == ((long) a5.connectTimeoutMillis()) && dVar.f80150f == ((long) a5.readTimeoutMillis()) && dVar.g == ((long) a5.writeTimeoutMillis()))) {
                a5 = a5.newBuilder().connectTimeout(dVar.f80149e, TimeUnit.MILLISECONDS).readTimeout(dVar.f80150f, TimeUnit.MILLISECONDS).writeTimeout(dVar.g, TimeUnit.MILLISECONDS).build();
            }
            com.toutiao.proxyserver.d.c.b("HttpExcutor", "use ttnet okhttp");
            aVar = new com.toutiao.proxyserver.net.a(a5.newCall(builder.build()), dVar);
        }
        this.g = aVar;
        return aVar.a();
    }

    public final void a(boolean z, String str, int i2, int i3, String str2, String str3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str, Integer.valueOf(i2), Integer.valueOf(i3), str2, str3}, this, f79960a, false, 91590, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z), str, Integer.valueOf(i2), Integer.valueOf(i3), str2, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f79960a, false, 91590, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        final n nVar = Proxy.g;
        if (nVar != null) {
            final boolean z2 = z;
            final String str4 = str;
            final int i4 = i2;
            final int i5 = i3;
            final String str5 = str2;
            final String str6 = str3;
            AnonymousClass2 r0 = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f79972a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f79972a, false, 91599, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f79972a, false, 91599, new Class[0], Void.TYPE);
                        return;
                    }
                    nVar.a(z2, str4, i4, i5, str5, str6);
                }
            };
            com.toutiao.proxyserver.f.c.b((Runnable) r0);
        }
    }
}
