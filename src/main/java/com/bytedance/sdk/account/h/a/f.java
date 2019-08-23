package com.bytedance.sdk.account.h.a;

import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.sdk.account.h.a.e;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f22428a = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    private static volatile f f22429c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f22430d = true;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f22431b;

    /* renamed from: e  reason: collision with root package name */
    private int f22432e;

    /* renamed from: f  reason: collision with root package name */
    private int f22433f;
    private final PriorityBlockingQueue<e> g;
    private final PriorityBlockingQueue<e> h;
    private final PriorityBlockingQueue<e> i;
    private a[] j;
    private d[] k;
    private b l;
    private volatile long m;
    private volatile long n;
    private volatile long o;
    private volatile long p;

    public f() {
        this(4, 4);
    }

    private static int f() {
        return f22428a.incrementAndGet();
    }

    public static f a() {
        if (f22429c == null) {
            synchronized (f.class) {
                if (f22429c == null) {
                    f22429c = new f();
                }
            }
        }
        return f22429c;
    }

    private synchronized void g() {
        h();
        this.l = new b(this.g, this.h);
        this.l.start();
        for (int i2 = 0; i2 < this.f22432e; i2++) {
            a aVar = new a(this.h, "ApiDispatcher-Thread", "ApiDispatcher");
            this.j[i2] = aVar;
            aVar.start();
        }
        for (int i3 = 0; i3 < this.f22433f; i3++) {
            d dVar = new d(this.i, "DownloadDispatcher-Thread", "DownloadDispatcher");
            this.k[i3] = dVar;
            dVar.start();
        }
        this.f22431b = true;
    }

    private synchronized void h() {
        this.f22431b = false;
        if (this.l != null) {
            b bVar = this.l;
            bVar.f22419a = true;
            bVar.interrupt();
        }
        for (int i2 = 0; i2 < this.j.length; i2++) {
            if (this.j[i2] != null) {
                this.j[i2].a();
                this.j[i2] = null;
            }
        }
        for (int i3 = 0; i3 < this.k.length; i3++) {
            if (this.k[i3] != null) {
                this.k[i3].a();
                this.k[i3] = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = f22430d     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            long r2 = r7.m     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            r7.m = r0     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
        L_0x0013:
            long r2 = r7.m     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r4 = 0
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            monitor-exit(r7)
            return
        L_0x0020:
            r7.m = r0     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r0 = 0
            r1 = 0
        L_0x0024:
            com.bytedance.sdk.account.h.a.a[] r2 = r7.j     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            int r2 = r2.length     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r0 >= r2) goto L_0x004a
            com.bytedance.sdk.account.h.a.a[] r2 = r7.j     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r2 = r2[r0]     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r2 != 0) goto L_0x0047
            int r1 = r1 + 1
            int r2 = r7.f22432e     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r1 > r2) goto L_0x004a
            com.bytedance.sdk.account.h.a.a r2 = new com.bytedance.sdk.account.h.a.a     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            java.util.concurrent.PriorityBlockingQueue<com.bytedance.sdk.account.h.a.e> r3 = r7.h     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            java.lang.String r4 = "ApiDispatcher-Thread"
            java.lang.String r5 = "ApiDispatcher"
            r2.<init>(r3, r4, r5)     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            com.bytedance.sdk.account.h.a.a[] r3 = r7.j     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r3[r0] = r2     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r2.start()     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0024
        L_0x004a:
            monitor-exit(r7)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x004f:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.h.a.f.b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = f22430d     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            long r2 = r7.n     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            r7.n = r0     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
        L_0x0013:
            long r2 = r7.n     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r4 = 0
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            monitor-exit(r7)
            return
        L_0x0020:
            r7.n = r0     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r0 = 0
            r1 = 0
        L_0x0024:
            com.bytedance.sdk.account.h.a.d[] r2 = r7.k     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            int r2 = r2.length     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r0 >= r2) goto L_0x004a
            com.bytedance.sdk.account.h.a.d[] r2 = r7.k     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r2 = r2[r0]     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r2 != 0) goto L_0x0047
            int r1 = r1 + 1
            int r2 = r7.f22433f     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            if (r1 > r2) goto L_0x004a
            com.bytedance.sdk.account.h.a.d r2 = new com.bytedance.sdk.account.h.a.d     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            java.util.concurrent.PriorityBlockingQueue<com.bytedance.sdk.account.h.a.e> r3 = r7.i     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            java.lang.String r4 = "DownloadDispatcher-Thread"
            java.lang.String r5 = "DownloadDispatcher"
            r2.<init>(r3, r4, r5)     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            com.bytedance.sdk.account.h.a.d[] r3 = r7.k     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r3[r0] = r2     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
            r2.start()     // Catch:{ Throwable -> 0x004f, all -> 0x004c }
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0024
        L_0x004a:
            monitor-exit(r7)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x004f:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.h.a.f.c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void d() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = f22430d     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r9)
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            long r2 = r9.o     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            r9.o = r0     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
        L_0x0013:
            long r2 = r9.o     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r4 = 0
            long r2 = r0 - r2
            r4 = 2000(0x7d0, double:9.88E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            monitor-exit(r9)
            return
        L_0x0020:
            com.bytedance.sdk.account.h.a.a[] r2 = r9.j     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r2 = r2.length     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r3 = 1
            int r2 = r2 - r3
            r4 = 1
            r5 = 1
        L_0x0027:
            int r6 = r9.f22432e     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r2 < r6) goto L_0x003f
            com.bytedance.sdk.account.h.a.a[] r6 = r9.j     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r6 = r6[r2]     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r7 = 0
            if (r6 == 0) goto L_0x0039
            boolean r8 = r6.b()     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r8 == 0) goto L_0x0039
            r4 = 0
        L_0x0039:
            if (r6 == 0) goto L_0x003c
            r5 = 0
        L_0x003c:
            int r2 = r2 + -1
            goto L_0x0027
        L_0x003f:
            r9.o = r0     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r4 == 0) goto L_0x006f
            if (r5 == 0) goto L_0x0046
            goto L_0x006f
        L_0x0046:
            com.bytedance.sdk.account.h.a.a[] r0 = r9.j     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r0 = r0 - r3
        L_0x004a:
            int r1 = r9.f22432e     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r0 < r1) goto L_0x006d
            com.bytedance.sdk.account.h.a.a[] r1 = r9.j     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            r1 = r1[r0]     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r1 == 0) goto L_0x006a
            java.lang.Thread$State r2 = r1.getState()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            java.lang.Thread$State r3 = java.lang.Thread.State.RUNNABLE     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r2 == r3) goto L_0x006a
            boolean r2 = r1.b()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r2 != 0) goto L_0x006a
            r1.a()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            com.bytedance.sdk.account.h.a.a[] r1 = r9.j     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            r2 = 0
            r1[r0] = r2     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
        L_0x006a:
            int r0 = r0 + -1
            goto L_0x004a
        L_0x006d:
            monitor-exit(r9)
            return
        L_0x006f:
            monitor-exit(r9)
            return
        L_0x0071:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0074:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.h.a.f.d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = f22430d     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r9)
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            long r2 = r9.p     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0013
            r9.p = r0     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
        L_0x0013:
            long r2 = r9.p     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r4 = 0
            long r2 = r0 - r2
            r4 = 2000(0x7d0, double:9.88E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            monitor-exit(r9)
            return
        L_0x0020:
            com.bytedance.sdk.account.h.a.d[] r2 = r9.k     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r2 = r2.length     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r3 = 1
            int r2 = r2 - r3
            r4 = 1
            r5 = 1
        L_0x0027:
            int r6 = r9.f22433f     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r2 < r6) goto L_0x003f
            com.bytedance.sdk.account.h.a.d[] r6 = r9.k     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r6 = r6[r2]     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            r7 = 0
            if (r6 == 0) goto L_0x0039
            boolean r8 = r6.b()     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r8 == 0) goto L_0x0039
            r4 = 0
        L_0x0039:
            if (r6 == 0) goto L_0x003c
            r5 = 0
        L_0x003c:
            int r2 = r2 + -1
            goto L_0x0027
        L_0x003f:
            r9.p = r0     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r4 == 0) goto L_0x006f
            if (r5 == 0) goto L_0x0046
            goto L_0x006f
        L_0x0046:
            com.bytedance.sdk.account.h.a.d[] r0 = r9.k     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            int r0 = r0 - r3
        L_0x004a:
            int r1 = r9.f22433f     // Catch:{ Throwable -> 0x0074, all -> 0x0071 }
            if (r0 < r1) goto L_0x006d
            com.bytedance.sdk.account.h.a.d[] r1 = r9.k     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            r1 = r1[r0]     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r1 == 0) goto L_0x006a
            java.lang.Thread$State r2 = r1.getState()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            java.lang.Thread$State r3 = java.lang.Thread.State.RUNNABLE     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r2 == r3) goto L_0x006a
            boolean r2 = r1.b()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            if (r2 != 0) goto L_0x006a
            r1.a()     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            com.bytedance.sdk.account.h.a.d[] r1 = r9.k     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
            r2 = 0
            r1[r0] = r2     // Catch:{ Throwable -> 0x006a, all -> 0x0071 }
        L_0x006a:
            int r0 = r0 + -1
            goto L_0x004a
        L_0x006d:
            monitor-exit(r9)
            return
        L_0x006f:
            monitor-exit(r9)
            return
        L_0x0071:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0074:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.h.a.f.e():void");
    }

    public final synchronized void a(c cVar) {
        cVar.a(f());
        if (!this.f22431b) {
            g();
        }
        if (cVar.d() == e.a.IMMEDIATE) {
            ThreadPlus.submitRunnable(cVar);
            return;
        }
        cVar.f();
        this.h.add(cVar);
    }

    private f(int i2, int i3) {
        this.g = new PriorityBlockingQueue<>();
        this.h = new PriorityBlockingQueue<>();
        this.i = new PriorityBlockingQueue<>();
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.f22432e = 4;
        this.f22433f = 4;
        this.j = new a[16];
        this.k = new d[16];
    }
}
