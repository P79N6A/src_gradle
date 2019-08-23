package com.xiaomi.push.service;

import android.os.SystemClock;
import java.util.concurrent.RejectedExecutionException;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static long f82561a;

    /* renamed from: b  reason: collision with root package name */
    private static long f82562b;

    /* renamed from: c  reason: collision with root package name */
    private static long f82563c;

    /* renamed from: a  reason: collision with other field name */
    private final a f983a;

    /* renamed from: a  reason: collision with other field name */
    private final c f984a;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final c f82564a;

        a(c cVar) {
            this.f82564a = cVar;
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            try {
                synchronized (this.f82564a) {
                    boolean unused = this.f82564a.f82568c = true;
                    this.f82564a.notify();
                }
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }
    }

    public static abstract class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        protected int f82565a;

        public b(int i) {
            this.f82565a = i;
        }
    }

    static final class c extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private volatile long f82566a;

        /* renamed from: a  reason: collision with other field name */
        private a f985a = new a();

        /* renamed from: a  reason: collision with other field name */
        private volatile boolean f986a;

        /* renamed from: b  reason: collision with root package name */
        private long f82567b = 50;

        /* renamed from: b  reason: collision with other field name */
        private boolean f987b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f82568c;

        static final class a {

            /* renamed from: a  reason: collision with root package name */
            private int f82569a;

            /* renamed from: a  reason: collision with other field name */
            private d[] f988a;

            /* renamed from: b  reason: collision with root package name */
            private int f82570b;

            /* renamed from: c  reason: collision with root package name */
            private int f82571c;

            private a() {
                this.f82569a = 256;
                this.f988a = new d[this.f82569a];
            }

            /* access modifiers changed from: private */
            public int a(d dVar) {
                for (int i = 0; i < this.f988a.length; i++) {
                    if (this.f988a[i] == dVar) {
                        return i;
                    }
                }
                return -1;
            }

            private void c() {
                int i = this.f82570b - 1;
                int i2 = (i - 1) / 2;
                while (this.f988a[i].f989a < this.f988a[i2].f989a) {
                    d dVar = this.f988a[i];
                    d[] dVarArr = this.f988a;
                    dVarArr[i] = dVarArr[i2];
                    this.f988a[i2] = dVar;
                    int i3 = i2;
                    i2 = (i2 - 1) / 2;
                    i = i3;
                }
            }

            private void c(int i) {
                int i2 = (i * 2) + 1;
                while (i2 < this.f82570b && this.f82570b > 0) {
                    int i3 = i2 + 1;
                    if (i3 < this.f82570b && this.f988a[i3].f989a < this.f988a[i2].f989a) {
                        i2 = i3;
                    }
                    if (this.f988a[i].f989a >= this.f988a[i2].f989a) {
                        d dVar = this.f988a[i];
                        d[] dVarArr = this.f988a;
                        dVarArr[i] = dVarArr[i2];
                        this.f988a[i2] = dVar;
                        int i4 = i2;
                        i2 = (i2 * 2) + 1;
                        i = i4;
                    } else {
                        return;
                    }
                }
            }

            public final d a() {
                return this.f988a[0];
            }

            /* renamed from: a  reason: collision with other method in class */
            public final void m633a() {
                this.f988a = new d[this.f82569a];
                this.f82570b = 0;
            }

            public final void a(int i) {
                for (int i2 = 0; i2 < this.f82570b; i2++) {
                    if (this.f988a[i2].f82572a == i) {
                        this.f988a[i2].a();
                    }
                }
                b();
            }

            public final void a(int i, b bVar) {
                for (int i2 = 0; i2 < this.f82570b; i2++) {
                    if (this.f988a[i2].f990a == bVar) {
                        this.f988a[i2].a();
                    }
                }
                b();
            }

            /* renamed from: a  reason: collision with other method in class */
            public final void m634a(d dVar) {
                if (this.f988a.length == this.f82570b) {
                    d[] dVarArr = new d[(this.f82570b * 2)];
                    System.arraycopy(this.f988a, 0, dVarArr, 0, this.f82570b);
                    this.f988a = dVarArr;
                }
                d[] dVarArr2 = this.f988a;
                int i = this.f82570b;
                this.f82570b = i + 1;
                dVarArr2[i] = dVar;
                c();
            }

            /* renamed from: a  reason: collision with other method in class */
            public final boolean m635a() {
                return this.f82570b == 0;
            }

            /* renamed from: a  reason: collision with other method in class */
            public final boolean m636a(int i) {
                for (int i2 = 0; i2 < this.f82570b; i2++) {
                    if (this.f988a[i2].f82572a == i) {
                        return true;
                    }
                }
                return false;
            }

            public final void b() {
                int i = 0;
                while (i < this.f82570b) {
                    if (this.f988a[i].f992a) {
                        this.f82571c++;
                        b(i);
                        i--;
                    }
                    i++;
                }
            }

            public final void b(int i) {
                if (i >= 0 && i < this.f82570b) {
                    d[] dVarArr = this.f988a;
                    d[] dVarArr2 = this.f988a;
                    int i2 = this.f82570b - 1;
                    this.f82570b = i2;
                    dVarArr[i] = dVarArr2[i2];
                    this.f988a[this.f82570b] = null;
                    c(i);
                }
            }
        }

        c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        /* access modifiers changed from: private */
        public void a(d dVar) {
            this.f985a.a(dVar);
            notify();
        }

        public final void a() {
            synchronized (this) {
                this.f987b = true;
                this.f985a.a();
                notify();
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m632a() {
            return this.f986a && SystemClock.uptimeMillis() - this.f82566a > 600000;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|(2:8|(3:83|10|11)(2:12|13))(2:17|26)|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            r10.f82566a = android.os.SystemClock.uptimeMillis();
            r10.f986a = true;
            r2.f990a.run();
            r10.f986a = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a8, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a9, code lost:
            monitor-enter(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            r10.f987b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ad, code lost:
            throw r1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0018 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r10 = this;
            L_0x0000:
                monitor-enter(r10)
                boolean r0 = r10.f987b     // Catch:{ all -> 0x00b7 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r10)     // Catch:{ all -> 0x00b7 }
                return
            L_0x0007:
                com.xiaomi.push.service.g$c$a r0 = r10.f985a     // Catch:{ all -> 0x00b7 }
                boolean r0 = r0.a()     // Catch:{ all -> 0x00b7 }
                if (r0 == 0) goto L_0x001a
                boolean r0 = r10.f82568c     // Catch:{ all -> 0x00b7 }
                if (r0 == 0) goto L_0x0015
                monitor-exit(r10)     // Catch:{ all -> 0x00b7 }
                return
            L_0x0015:
                r10.wait()     // Catch:{ InterruptedException -> 0x0018 }
            L_0x0018:
                monitor-exit(r10)     // Catch:{ all -> 0x00b7 }
                goto L_0x0000
            L_0x001a:
                long r0 = com.xiaomi.push.service.g.a()     // Catch:{ all -> 0x00b7 }
                com.xiaomi.push.service.g$c$a r2 = r10.f985a     // Catch:{ all -> 0x00b7 }
                com.xiaomi.push.service.g$d r2 = r2.a()     // Catch:{ all -> 0x00b7 }
                java.lang.Object r3 = r2.f991a     // Catch:{ all -> 0x00b7 }
                monitor-enter(r3)     // Catch:{ all -> 0x00b7 }
                boolean r4 = r2.f992a     // Catch:{ all -> 0x00b4 }
                r5 = 0
                if (r4 == 0) goto L_0x0033
                com.xiaomi.push.service.g$c$a r0 = r10.f985a     // Catch:{ all -> 0x00b4 }
                r0.b(r5)     // Catch:{ all -> 0x00b4 }
                monitor-exit(r3)     // Catch:{ all -> 0x00b4 }
                goto L_0x0018
            L_0x0033:
                long r6 = r2.f989a     // Catch:{ all -> 0x00b4 }
                r4 = 0
                long r6 = r6 - r0
                monitor-exit(r3)     // Catch:{ all -> 0x00b4 }
                r0 = 50
                r3 = 0
                int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r8 <= 0) goto L_0x005c
                long r2 = r10.f82567b     // Catch:{ all -> 0x00b7 }
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0048
                long r6 = r10.f82567b     // Catch:{ all -> 0x00b7 }
            L_0x0048:
                long r2 = r10.f82567b     // Catch:{ all -> 0x00b7 }
                r4 = 0
                long r2 = r2 + r0
                r10.f82567b = r2     // Catch:{ all -> 0x00b7 }
                long r0 = r10.f82567b     // Catch:{ all -> 0x00b7 }
                r2 = 500(0x1f4, double:2.47E-321)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0058
                r10.f82567b = r2     // Catch:{ all -> 0x00b7 }
            L_0x0058:
                r10.wait(r6)     // Catch:{ InterruptedException -> 0x0018 }
                goto L_0x0018
            L_0x005c:
                r10.f82567b = r0     // Catch:{ all -> 0x00b7 }
                java.lang.Object r0 = r2.f991a     // Catch:{ all -> 0x00b7 }
                monitor-enter(r0)     // Catch:{ all -> 0x00b7 }
                com.xiaomi.push.service.g$c$a r1 = r10.f985a     // Catch:{ all -> 0x00b1 }
                com.xiaomi.push.service.g$d r1 = r1.a()     // Catch:{ all -> 0x00b1 }
                long r6 = r1.f989a     // Catch:{ all -> 0x00b1 }
                long r8 = r2.f989a     // Catch:{ all -> 0x00b1 }
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 == 0) goto L_0x0076
                com.xiaomi.push.service.g$c$a r1 = r10.f985a     // Catch:{ all -> 0x00b1 }
                int r1 = r1.a((com.xiaomi.push.service.g.d) r2)     // Catch:{ all -> 0x00b1 }
                goto L_0x0077
            L_0x0076:
                r1 = 0
            L_0x0077:
                boolean r6 = r2.f992a     // Catch:{ all -> 0x00b1 }
                if (r6 == 0) goto L_0x0088
                com.xiaomi.push.service.g$c$a r1 = r10.f985a     // Catch:{ all -> 0x00b1 }
                com.xiaomi.push.service.g$c$a r3 = r10.f985a     // Catch:{ all -> 0x00b1 }
                int r2 = r3.a((com.xiaomi.push.service.g.d) r2)     // Catch:{ all -> 0x00b1 }
                r1.b(r2)     // Catch:{ all -> 0x00b1 }
                monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
                goto L_0x0018
            L_0x0088:
                long r6 = r2.f989a     // Catch:{ all -> 0x00b1 }
                r2.a(r6)     // Catch:{ all -> 0x00b1 }
                com.xiaomi.push.service.g$c$a r6 = r10.f985a     // Catch:{ all -> 0x00b1 }
                r6.b(r1)     // Catch:{ all -> 0x00b1 }
                r2.f989a = r3     // Catch:{ all -> 0x00b1 }
                monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
                monitor-exit(r10)     // Catch:{ all -> 0x00b7 }
                r0 = 1
                long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00a8 }
                r10.f82566a = r3     // Catch:{ all -> 0x00a8 }
                r10.f986a = r0     // Catch:{ all -> 0x00a8 }
                com.xiaomi.push.service.g$b r1 = r2.f990a     // Catch:{ all -> 0x00a8 }
                r1.run()     // Catch:{ all -> 0x00a8 }
                r10.f986a = r5     // Catch:{ all -> 0x00a8 }
                goto L_0x0000
            L_0x00a8:
                r1 = move-exception
                monitor-enter(r10)
                r10.f987b = r0     // Catch:{ all -> 0x00ae }
                monitor-exit(r10)     // Catch:{ all -> 0x00ae }
                throw r1
            L_0x00ae:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00ae }
                throw r0
            L_0x00b1:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
                throw r1     // Catch:{ all -> 0x00b7 }
            L_0x00b4:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x00b4 }
                throw r0     // Catch:{ all -> 0x00b7 }
            L_0x00b7:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00b7 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.g.c.run():void");
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        int f82572a;

        /* renamed from: a  reason: collision with other field name */
        long f989a;

        /* renamed from: a  reason: collision with other field name */
        b f990a;

        /* renamed from: a  reason: collision with other field name */
        final Object f991a = new Object();

        /* renamed from: a  reason: collision with other field name */
        boolean f992a;

        /* renamed from: b  reason: collision with root package name */
        private long f82573b;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void a(long j) {
            synchronized (this.f991a) {
                this.f82573b = j;
            }
        }

        public boolean a() {
            boolean z;
            synchronized (this.f991a) {
                z = !this.f992a && this.f989a > 0;
                this.f992a = true;
            }
            return z;
        }
    }

    static {
        long j = 0;
        if (SystemClock.elapsedRealtime() > 0) {
            j = SystemClock.elapsedRealtime();
        }
        f82561a = j;
        f82562b = j;
    }

    public g() {
        this(false);
    }

    public g(String str) {
        this(str, false);
    }

    public g(String str, boolean z) {
        if (str != null) {
            this.f984a = new c(str, z);
            this.f983a = new a(this.f984a);
            return;
        }
        throw new NullPointerException("name == null");
    }

    public g(boolean z) {
        this("Timer-" + b(), z);
    }

    static long a() {
        long j;
        synchronized (g.class) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > f82562b) {
                    f82561a += elapsedRealtime - f82562b;
                }
                f82562b = elapsedRealtime;
                j = f82561a;
            } catch (Throwable th) {
                Class<g> cls = g.class;
                throw th;
            }
        }
        return j;
    }

    private static long b() {
        long j;
        synchronized (g.class) {
            try {
                j = f82563c;
                f82563c = 1 + j;
            } catch (Throwable th) {
                Class<g> cls = g.class;
                throw th;
            }
        }
        return j;
    }

    private void b(b bVar, long j) {
        synchronized (this.f984a) {
            if (!c.a(this.f984a)) {
                long a2 = a() + j;
                if (a2 >= 0) {
                    d dVar = new d();
                    dVar.f82572a = bVar.f82565a;
                    dVar.f990a = bVar;
                    dVar.f989a = a2;
                    this.f984a.a(dVar);
                } else {
                    throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + a2);
                }
            } else {
                throw new IllegalStateException("Timer was canceled");
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m628a() {
        this.f984a.a();
    }

    public void a(int i) {
        synchronized (this.f984a) {
            c.a(this.f984a).a(i);
        }
    }

    public void a(int i, b bVar) {
        synchronized (this.f984a) {
            c.a(this.f984a).a(i, bVar);
        }
    }

    public void a(b bVar) {
        if (com.xiaomi.channel.commonutils.logger.b.a() > 0 || Thread.currentThread() == this.f984a) {
            bVar.run();
        } else {
            com.xiaomi.channel.commonutils.logger.b.d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    public void a(b bVar, long j) {
        if (j >= 0) {
            b(bVar, j);
            return;
        }
        throw new IllegalArgumentException("delay < 0: " + j);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m629a() {
        return this.f984a.a();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m630a(int i) {
        boolean a2;
        synchronized (this.f984a) {
            a2 = c.a(this.f984a).a(i);
        }
        return a2;
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m631b() {
        synchronized (this.f984a) {
            c.a(this.f984a).a();
        }
    }
}
