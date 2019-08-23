package com.loc;

import android.content.Context;
import com.google.a.a.a.a.a.a;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class i extends f implements Thread.UncaughtExceptionHandler {

    /* renamed from: e  reason: collision with root package name */
    private static ExecutorService f25828e;

    /* renamed from: f  reason: collision with root package name */
    private static Set<Integer> f25829f = Collections.synchronizedSet(new HashSet());
    private static WeakReference<Context> g;
    private static final ThreadFactory h = new ThreadFactory() {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f25835a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "pama#" + this.f25835a.getAndIncrement());
        }
    };

    /* renamed from: d  reason: collision with root package name */
    Context f25830d;

    private i(Context context) {
        this.f25830d = context;
        try {
            this.f25817b = Thread.getDefaultUncaughtExceptionHandler();
            if (this.f25817b == null) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.f25818c = true;
                return;
            }
            String obj = this.f25817b.toString();
            if (obj.indexOf("com.amap.api") == -1) {
                if (obj.indexOf("com.loc") == -1) {
                    Thread.setDefaultUncaughtExceptionHandler(this);
                    this.f25818c = true;
                    return;
                }
            }
            this.f25818c = false;
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public static void a(dh dhVar, String str, cx cxVar) {
        if (cxVar != null) {
            a(dhVar, str, cxVar.c(), cxVar.d(), cxVar.b());
        }
    }

    public static void a(dh dhVar, String str, String str2, String str3, String str4) {
        try {
            if (f.f25816a != null) {
                f.f25816a.a(dhVar, "path:" + str + ",type:" + str2 + ",gsid:" + str3 + ",code:" + str4, "networkError");
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(dh dhVar, String str, String str2) {
        try {
            if (f.f25816a != null) {
                f.f25816a.a(dhVar, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Throwable th, String str, String str2) {
        try {
            if (f.f25816a != null) {
                f.f25816a.a(th, 1, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void c() {
        if (g == null || g.get() == null) {
            if (f.f25816a != null) {
                f.f25816a.a();
            }
            return;
        }
        g.a((Context) g.get());
    }

    public static synchronized ExecutorService d() {
        ExecutorService executorService;
        synchronized (i.class) {
            try {
                if (f25828e == null || f25828e.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), h);
                    f25828e = threadPoolExecutor;
                }
            } catch (Throwable th) {
                a.b(th);
            }
            executorService = f25828e;
        }
        return executorService;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        g.a(this.f25830d);
    }

    /* access modifiers changed from: protected */
    public final void a(final Context context, final dh dhVar, final boolean z) {
        try {
            ExecutorService d2 = d();
            if (d2 != null) {
                if (!d2.isShutdown()) {
                    d2.submit(new Runnable() {
                        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a8, code lost:
                            r0 = move-exception;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a9, code lost:
                            com.google.a.a.a.a.a.a.b(r0);
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ac, code lost:
                            return;
                         */
                        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                                r8 = this;
                                android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ Throwable -> 0x00a8 }
                                monitor-enter(r0)     // Catch:{ Throwable -> 0x00a8 }
                                com.loc.q r1 = new com.loc.q     // Catch:{ all -> 0x00a5 }
                                android.content.Context r2 = r3     // Catch:{ all -> 0x00a5 }
                                r3 = 1
                                r1.<init>(r2, r3)     // Catch:{ all -> 0x00a5 }
                                com.loc.dh r2 = r4     // Catch:{ all -> 0x00a5 }
                                if (r2 == 0) goto L_0x0072
                                com.loc.n r4 = r1.f25868a     // Catch:{ Throwable -> 0x006a }
                                r5 = 0
                                if (r4 != 0) goto L_0x001e
                                android.content.Context r4 = r1.f25869b     // Catch:{ Throwable -> 0x006a }
                                com.loc.n r4 = com.loc.q.a(r4, r5)     // Catch:{ Throwable -> 0x006a }
                                r1.f25868a = r4     // Catch:{ Throwable -> 0x006a }
                            L_0x001e:
                                java.lang.String r4 = r2.a()     // Catch:{ Throwable -> 0x006a }
                                java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Throwable -> 0x006a }
                                r6.<init>()     // Catch:{ Throwable -> 0x006a }
                                java.lang.String r7 = "a1"
                                java.lang.String r4 = com.loc.di.b((java.lang.String) r4)     // Catch:{ Throwable -> 0x006a }
                                r6.put(r7, r4)     // Catch:{ Throwable -> 0x006a }
                                java.lang.String r4 = com.loc.n.a((java.util.Map<java.lang.String, java.lang.String>) r6)     // Catch:{ Throwable -> 0x006a }
                                com.loc.n r6 = r1.f25868a     // Catch:{ Throwable -> 0x006a }
                                java.lang.Class<com.loc.dh> r7 = com.loc.dh.class
                                java.util.List r6 = r6.b(r4, r7)     // Catch:{ Throwable -> 0x006a }
                                if (r6 == 0) goto L_0x0064
                                int r7 = r6.size()     // Catch:{ Throwable -> 0x006a }
                                if (r7 != 0) goto L_0x0045
                                goto L_0x0064
                            L_0x0045:
                                java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x006a }
                            L_0x0049:
                                boolean r7 = r6.hasNext()     // Catch:{ Throwable -> 0x006a }
                                if (r7 == 0) goto L_0x005c
                                java.lang.Object r7 = r6.next()     // Catch:{ Throwable -> 0x006a }
                                com.loc.dh r7 = (com.loc.dh) r7     // Catch:{ Throwable -> 0x006a }
                                boolean r7 = r7.equals(r2)     // Catch:{ Throwable -> 0x006a }
                                if (r7 == 0) goto L_0x0049
                                r3 = 0
                            L_0x005c:
                                if (r3 == 0) goto L_0x0072
                                com.loc.n r1 = r1.f25868a     // Catch:{ Throwable -> 0x006a }
                                r1.a((java.lang.String) r4, (java.lang.Object) r2)     // Catch:{ Throwable -> 0x006a }
                                goto L_0x0072
                            L_0x0064:
                                com.loc.n r1 = r1.f25868a     // Catch:{ Throwable -> 0x006a }
                                r1.a(r2)     // Catch:{ Throwable -> 0x006a }
                                goto L_0x0072
                            L_0x006a:
                                r1 = move-exception
                                java.lang.String r2 = "sd"
                                java.lang.String r3 = "it"
                                com.loc.i.b((java.lang.Throwable) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x00a5 }
                            L_0x0072:
                                monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
                                boolean r0 = r5     // Catch:{ Throwable -> 0x00a8 }
                                if (r0 == 0) goto L_0x00a4
                                com.loc.i r0 = com.loc.i.this     // Catch:{ Throwable -> 0x00a8 }
                                android.content.Context r0 = r0.f25830d     // Catch:{ Throwable -> 0x00a8 }
                                java.util.List r1 = com.loc.g.b(r0)     // Catch:{ Throwable -> 0x00a8 }
                                if (r1 == 0) goto L_0x00a4
                                int r2 = r1.size()     // Catch:{ Throwable -> 0x00a8 }
                                if (r2 != 0) goto L_0x0088
                                goto L_0x00a4
                            L_0x0088:
                                java.lang.String r1 = com.loc.j.a((java.util.List<com.loc.dh>) r1)     // Catch:{ Throwable -> 0x00a8 }
                                if (r1 == 0) goto L_0x00a4
                                java.lang.String r2 = ""
                                boolean r2 = r2.equals(r1)     // Catch:{ Throwable -> 0x00a8 }
                                if (r2 != 0) goto L_0x00a4
                                com.loc.dh r2 = com.loc.j.f25840e     // Catch:{ Throwable -> 0x00a8 }
                                if (r2 != 0) goto L_0x009b
                                goto L_0x00a4
                            L_0x009b:
                                java.lang.String r2 = "ANR"
                                com.loc.dh r3 = com.loc.j.f25840e     // Catch:{ Throwable -> 0x00a8 }
                                r4 = 2
                                com.loc.j.a(r0, r3, r4, r2, r1)     // Catch:{ Throwable -> 0x00a8 }
                            L_0x00a4:
                                return
                            L_0x00a5:
                                r1 = move-exception
                                monitor-exit(r0)     // Catch:{ Throwable -> 0x00a8 }
                                throw r1     // Catch:{ Throwable -> 0x00a8 }
                            L_0x00a8:
                                r0 = move-exception
                                com.google.a.a.a.a.a.a.b(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.loc.i.AnonymousClass1.run():void");
                        }
                    });
                }
            }
        } catch (RejectedExecutionException unused) {
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            a(th, 0, null, null);
            if (this.f25817b != null) {
                try {
                    Thread.setDefaultUncaughtExceptionHandler(this.f25817b);
                } catch (Throwable unused) {
                }
                this.f25817b.uncaughtException(thread, th);
            }
        }
    }

    public static synchronized void b() {
        synchronized (i.class) {
            try {
                if (f25828e != null) {
                    f25828e.shutdown();
                }
                if (ad.f25421e != null && !ad.f25421e.isShutdown()) {
                    ad.f25421e.shutdown();
                }
            } catch (Throwable th) {
                a.b(th);
            }
            try {
                if (!(f.f25816a == null || Thread.getDefaultUncaughtExceptionHandler() != f.f25816a || f.f25816a.f25817b == null)) {
                    Thread.setDefaultUncaughtExceptionHandler(f.f25816a.f25817b);
                }
                f.f25816a = null;
            } catch (Throwable th2) {
                a.b(th2);
                return;
            }
        }
        return;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:8|9|10|11|12|(1:14)(1:15)|(1:17)(6:18|19|20|23|24|(4:29|(4:35|(2:39|(1:41)(2:42|(2:44|(1:46)(3:47|(2:50|(1:52)(1:53))|(3:55|56|92)(1:91)))))|57|58)|59|25))|61|62|(3:64|65|66)(7:67|68|(1:70)(1:71)|72|76|77|78)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00c0 */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d0 A[Catch:{ Throwable -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d6 A[SYNTHETIC, Splitter:B:67:0x00d6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.loc.i a(android.content.Context r10, com.loc.dh r11) throws com.loc.cx {
        /*
            java.lang.Class<com.loc.i> r0 = com.loc.i.class
            monitor-enter(r0)
            if (r11 == 0) goto L_0x0102
            java.lang.String r1 = r11.a()     // Catch:{ all -> 0x010a }
            if (r1 == 0) goto L_0x00fa
            java.lang.String r1 = ""
            java.lang.String r2 = r11.a()     // Catch:{ all -> 0x010a }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x010a }
            if (r1 != 0) goto L_0x00fa
            com.loc.k r1 = new com.loc.k     // Catch:{ Throwable -> 0x00f0 }
            r1.<init>()     // Catch:{ Throwable -> 0x00f0 }
            r2 = 0
            java.lang.String r3 = com.loc.g.f25823e     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r3 = com.loc.g.c(r10, r3)     // Catch:{ Throwable -> 0x00c0 }
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x00c0 }
            r4.<init>(r3)     // Catch:{ Throwable -> 0x00c0 }
            boolean r3 = r4.isDirectory()     // Catch:{ Throwable -> 0x00c0 }
            r5 = 0
            if (r3 != 0) goto L_0x0031
            r3 = r5
            goto L_0x0035
        L_0x0031:
            java.io.File[] r3 = r4.listFiles()     // Catch:{ Throwable -> 0x00c0 }
        L_0x0035:
            if (r3 != 0) goto L_0x0039
            goto L_0x00c0
        L_0x0039:
            r1.f25850e = r3     // Catch:{ Throwable -> 0x00c0 }
            com.loc.dh$a r1 = new com.loc.dh$a     // Catch:{ Throwable -> 0x0051 }
            java.lang.String r4 = com.loc.k.f25849f     // Catch:{ Throwable -> 0x0051 }
            java.lang.String r6 = "1.0"
            java.lang.String r7 = ""
            r1.<init>(r4, r6, r7)     // Catch:{ Throwable -> 0x0051 }
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ Throwable -> 0x0051 }
            com.loc.dh$a r1 = r1.a(r4)     // Catch:{ Throwable -> 0x0051 }
            com.loc.dh r1 = r1.a()     // Catch:{ Throwable -> 0x0051 }
            goto L_0x0052
        L_0x0051:
            r1 = r5
        L_0x0052:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00c0 }
            r4.<init>()     // Catch:{ Throwable -> 0x00c0 }
            r5 = 0
        L_0x0058:
            int r6 = r3.length     // Catch:{ Throwable -> 0x00c0 }
            if (r5 >= r6) goto L_0x00c0
            r6 = 10
            if (r5 >= r6) goto L_0x00c0
            r6 = r3[r5]     // Catch:{ Throwable -> 0x00c0 }
            if (r6 == 0) goto L_0x00bd
            boolean r7 = r6.exists()     // Catch:{ Throwable -> 0x00c0 }
            if (r7 == 0) goto L_0x00bd
            boolean r7 = r6.isFile()     // Catch:{ Throwable -> 0x00c0 }
            if (r7 == 0) goto L_0x00bd
            byte[] r7 = com.loc.k.a(r6)     // Catch:{ Throwable -> 0x00c0 }
            if (r7 == 0) goto L_0x00ba
            int r8 = r7.length     // Catch:{ Throwable -> 0x00c0 }
            if (r8 == 0) goto L_0x00ba
            int r8 = r7.length     // Catch:{ Throwable -> 0x00c0 }
            r9 = 100000(0x186a0, float:1.4013E-40)
            if (r8 <= r9) goto L_0x007f
            goto L_0x00ba
        L_0x007f:
            java.lang.String r8 = com.loc.de.a((byte[]) r7)     // Catch:{ Throwable -> 0x00c0 }
            boolean r9 = com.loc.k.a((java.util.List<com.loc.k.b>) r4, (java.lang.String) r8)     // Catch:{ Throwable -> 0x00c0 }
            if (r9 != 0) goto L_0x00ba
            java.util.HashSet<java.lang.String> r9 = com.loc.k.f25845a     // Catch:{ Throwable -> 0x00c0 }
            boolean r9 = r9.contains(r8)     // Catch:{ Throwable -> 0x00c0 }
            if (r9 == 0) goto L_0x0092
            goto L_0x00ba
        L_0x0092:
            com.loc.k.a((android.content.Context) r10, (byte[]) r7)     // Catch:{ Throwable -> 0x00c0 }
            java.util.HashSet<java.lang.String> r9 = com.loc.k.f25845a     // Catch:{ Throwable -> 0x00c0 }
            r9.add(r8)     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r7 = com.loc.dd.b((byte[]) r7)     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r8 = com.loc.k.f25849f     // Catch:{ Throwable -> 0x00c0 }
            boolean r9 = com.loc.j.a((com.loc.dh) r1)     // Catch:{ Throwable -> 0x00c0 }
            if (r9 == 0) goto L_0x00b4
            if (r8 == 0) goto L_0x00b4
            java.lang.String r9 = ""
            boolean r9 = r9.equals(r8)     // Catch:{ Throwable -> 0x00c0 }
            if (r9 == 0) goto L_0x00b1
            goto L_0x00b4
        L_0x00b1:
            com.loc.j.a(r10, r1, r2, r8, r7)     // Catch:{ Throwable -> 0x00c0 }
        L_0x00b4:
            if (r6 == 0) goto L_0x00bd
            r6.delete()     // Catch:{ Exception -> 0x00bd }
            goto L_0x00bd
        L_0x00ba:
            r6.delete()     // Catch:{ Throwable -> 0x00c0 }
        L_0x00bd:
            int r5 = r5 + 1
            goto L_0x0058
        L_0x00c0:
            java.util.Set<java.lang.Integer> r1 = f25829f     // Catch:{ Throwable -> 0x00f0 }
            int r3 = r11.hashCode()     // Catch:{ Throwable -> 0x00f0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Throwable -> 0x00f0 }
            boolean r1 = r1.add(r3)     // Catch:{ Throwable -> 0x00f0 }
            if (r1 != 0) goto L_0x00d6
            com.loc.f r10 = com.loc.f.f25816a     // Catch:{ Throwable -> 0x00f0 }
            com.loc.i r10 = (com.loc.i) r10     // Catch:{ Throwable -> 0x00f0 }
            monitor-exit(r0)
            return r10
        L_0x00d6:
            com.loc.f r1 = com.loc.f.f25816a     // Catch:{ Throwable -> 0x00f0 }
            if (r1 != 0) goto L_0x00e2
            com.loc.i r1 = new com.loc.i     // Catch:{ Throwable -> 0x00f0 }
            r1.<init>(r10)     // Catch:{ Throwable -> 0x00f0 }
            com.loc.f.f25816a = r1     // Catch:{ Throwable -> 0x00f0 }
            goto L_0x00e6
        L_0x00e2:
            com.loc.f r1 = com.loc.f.f25816a     // Catch:{ Throwable -> 0x00f0 }
            r1.f25818c = r2     // Catch:{ Throwable -> 0x00f0 }
        L_0x00e6:
            com.loc.f r1 = com.loc.f.f25816a     // Catch:{ Throwable -> 0x00f0 }
            com.loc.f r2 = com.loc.f.f25816a     // Catch:{ Throwable -> 0x00f0 }
            boolean r2 = r2.f25818c     // Catch:{ Throwable -> 0x00f0 }
            r1.a((android.content.Context) r10, (com.loc.dh) r11, (boolean) r2)     // Catch:{ Throwable -> 0x00f0 }
            goto L_0x00f4
        L_0x00f0:
            r10 = move-exception
            com.google.a.a.a.a.a.a.b(r10)     // Catch:{ all -> 0x010a }
        L_0x00f4:
            com.loc.f r10 = com.loc.f.f25816a     // Catch:{ all -> 0x010a }
            com.loc.i r10 = (com.loc.i) r10     // Catch:{ all -> 0x010a }
            monitor-exit(r0)
            return r10
        L_0x00fa:
            com.loc.cx r10 = new com.loc.cx     // Catch:{ all -> 0x010a }
            java.lang.String r11 = "sdk name is invalid"
            r10.<init>(r11)     // Catch:{ all -> 0x010a }
            throw r10     // Catch:{ all -> 0x010a }
        L_0x0102:
            com.loc.cx r10 = new com.loc.cx     // Catch:{ all -> 0x010a }
            java.lang.String r11 = "sdk info is null"
            r10.<init>(r11)     // Catch:{ all -> 0x010a }
            throw r10     // Catch:{ all -> 0x010a }
        L_0x010a:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.i.a(android.content.Context, com.loc.dh):com.loc.i");
    }

    /* access modifiers changed from: protected */
    public final void a(dh dhVar, String str, String str2) {
        Context context = this.f25830d;
        if (j.a(dhVar) && str2 != null && !"".equals(str2)) {
            j.a(context, dhVar, 1, str2, str);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th, int i, String str, String str2) {
        Context context = this.f25830d;
        String a2 = di.a(th);
        dh a3 = j.a(context, a2);
        if (j.a(a3)) {
            String replaceAll = a2.replaceAll("\n", "<br/>");
            String th2 = th.toString();
            if (th2 != null && !"".equals(th2)) {
                StringBuilder sb = new StringBuilder();
                if (str != null) {
                    sb.append("class:");
                    sb.append(str);
                }
                if (str2 != null) {
                    sb.append(" method:");
                    sb.append(str2);
                    sb.append("$<br/>");
                }
                sb.append(replaceAll);
                j.a(context, a3, i, th2, sb.toString());
            }
        }
    }
}
