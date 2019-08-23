package com.amap.api.services.a;

import android.content.Context;
import android.os.Looper;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class ca extends bx implements Thread.UncaughtExceptionHandler {

    /* renamed from: e  reason: collision with root package name */
    private static ExecutorService f6677e;

    /* renamed from: f  reason: collision with root package name */
    private static Set<Integer> f6678f = Collections.synchronizedSet(new HashSet());
    private static WeakReference<Context> g;
    private static final ThreadFactory h = new ThreadFactory() {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f6684a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "pama#" + this.f6684a.getAndIncrement());
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Context f6679d;

    /* access modifiers changed from: protected */
    public void a() {
        by.b(this.f6679d);
    }

    public static synchronized ca d() {
        ca caVar;
        synchronized (ca.class) {
            caVar = (ca) bx.f6665a;
        }
        return caVar;
    }

    public static void b() {
        if (g == null || g.get() == null) {
            if (bx.f6665a != null) {
                bx.f6665a.a();
            }
            return;
        }
        by.b((Context) g.get());
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.concurrent.ExecutorService c() {
        /*
            java.lang.Class<com.amap.api.services.a.ca> r0 = com.amap.api.services.a.ca.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = f6677e     // Catch:{ Throwable -> 0x0029 }
            if (r1 == 0) goto L_0x000f
            java.util.concurrent.ExecutorService r1 = f6677e     // Catch:{ Throwable -> 0x0029 }
            boolean r1 = r1.isShutdown()     // Catch:{ Throwable -> 0x0029 }
            if (r1 == 0) goto L_0x0029
        L_0x000f:
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ Throwable -> 0x0029 }
            r3 = 1
            r4 = 1
            r5 = 0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Throwable -> 0x0029 }
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch:{ Throwable -> 0x0029 }
            r2 = 256(0x100, float:3.59E-43)
            r8.<init>(r2)     // Catch:{ Throwable -> 0x0029 }
            java.util.concurrent.ThreadFactory r9 = h     // Catch:{ Throwable -> 0x0029 }
            r2 = r1
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch:{ Throwable -> 0x0029 }
            f6677e = r1     // Catch:{ Throwable -> 0x0029 }
            goto L_0x0029
        L_0x0027:
            r1 = move-exception
            goto L_0x002d
        L_0x0029:
            java.util.concurrent.ExecutorService r1 = f6677e     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)
            return r1
        L_0x002d:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.ca.c():java.util.concurrent.ExecutorService");
    }

    private void e() {
        try {
            this.f6666b = Thread.getDefaultUncaughtExceptionHandler();
            if (this.f6666b == null) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.f6667c = true;
            } else {
                String obj = this.f6666b.toString();
                if (obj.indexOf("com.amap.api") == -1) {
                    if (obj.indexOf("com.loc") == -1) {
                        Thread.setDefaultUncaughtExceptionHandler(this);
                        this.f6667c = true;
                        return;
                    }
                }
                this.f6667c = false;
            }
        } catch (Throwable unused) {
        }
    }

    private ca(Context context, bn bnVar) {
        this.f6679d = context;
        e();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            a(th, 0, null, null);
            if (this.f6666b != null) {
                try {
                    Thread.setDefaultUncaughtExceptionHandler(this.f6666b);
                } catch (Throwable unused) {
                }
                this.f6666b.uncaughtException(thread, th);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:14|15|(1:17)(1:18)|19|20|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0055=Splitter:B:24:0x0055, B:20:0x004f=Splitter:B:20:0x004f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.amap.api.services.a.ca a(android.content.Context r3, com.amap.api.services.a.bn r4) throws com.amap.api.services.a.be {
        /*
            java.lang.Class<com.amap.api.services.a.ca> r0 = com.amap.api.services.a.ca.class
            monitor-enter(r0)
            if (r4 == 0) goto L_0x005d
            java.lang.String r1 = r4.a()     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = ""
            java.lang.String r2 = r4.a()     // Catch:{ all -> 0x0065 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0055
            com.amap.api.services.a.cc r1 = new com.amap.api.services.a.cc     // Catch:{ Throwable -> 0x004f }
            r1.<init>()     // Catch:{ Throwable -> 0x004f }
            r1.a((android.content.Context) r3)     // Catch:{ Throwable -> 0x004f }
            java.util.Set<java.lang.Integer> r1 = f6678f     // Catch:{ Throwable -> 0x004f }
            int r2 = r4.hashCode()     // Catch:{ Throwable -> 0x004f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x004f }
            boolean r1 = r1.add(r2)     // Catch:{ Throwable -> 0x004f }
            if (r1 != 0) goto L_0x0035
            com.amap.api.services.a.bx r3 = com.amap.api.services.a.bx.f6665a     // Catch:{ Throwable -> 0x004f }
            com.amap.api.services.a.ca r3 = (com.amap.api.services.a.ca) r3     // Catch:{ Throwable -> 0x004f }
            monitor-exit(r0)
            return r3
        L_0x0035:
            com.amap.api.services.a.bx r1 = com.amap.api.services.a.bx.f6665a     // Catch:{ Throwable -> 0x004f }
            if (r1 != 0) goto L_0x0041
            com.amap.api.services.a.ca r1 = new com.amap.api.services.a.ca     // Catch:{ Throwable -> 0x004f }
            r1.<init>(r3, r4)     // Catch:{ Throwable -> 0x004f }
            com.amap.api.services.a.bx.f6665a = r1     // Catch:{ Throwable -> 0x004f }
            goto L_0x0046
        L_0x0041:
            com.amap.api.services.a.bx r1 = com.amap.api.services.a.bx.f6665a     // Catch:{ Throwable -> 0x004f }
            r2 = 0
            r1.f6667c = r2     // Catch:{ Throwable -> 0x004f }
        L_0x0046:
            com.amap.api.services.a.bx r1 = com.amap.api.services.a.bx.f6665a     // Catch:{ Throwable -> 0x004f }
            com.amap.api.services.a.bx r2 = com.amap.api.services.a.bx.f6665a     // Catch:{ Throwable -> 0x004f }
            boolean r2 = r2.f6667c     // Catch:{ Throwable -> 0x004f }
            r1.a((android.content.Context) r3, (com.amap.api.services.a.bn) r4, (boolean) r2)     // Catch:{ Throwable -> 0x004f }
        L_0x004f:
            com.amap.api.services.a.bx r3 = com.amap.api.services.a.bx.f6665a     // Catch:{ all -> 0x0065 }
            com.amap.api.services.a.ca r3 = (com.amap.api.services.a.ca) r3     // Catch:{ all -> 0x0065 }
            monitor-exit(r0)
            return r3
        L_0x0055:
            com.amap.api.services.a.be r3 = new com.amap.api.services.a.be     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = "sdk name is invalid"
            r3.<init>(r4)     // Catch:{ all -> 0x0065 }
            throw r3     // Catch:{ all -> 0x0065 }
        L_0x005d:
            com.amap.api.services.a.be r3 = new com.amap.api.services.a.be     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = "sdk info is null"
            r3.<init>(r4)     // Catch:{ all -> 0x0065 }
            throw r3     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.ca.a(android.content.Context, com.amap.api.services.a.bn):com.amap.api.services.a.ca");
    }

    public static void b(bn bnVar, String str, String str2) {
        try {
            if (bx.f6665a != null) {
                bx.f6665a.a(bnVar, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void c(Throwable th, String str, String str2) {
        try {
            if (bx.f6665a != null) {
                bx.f6665a.a(th, 1, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void a(bn bnVar, String str, String str2) {
        cb.b(bnVar, this.f6679d, str2, str);
    }

    public static void a(bn bnVar, String str, be beVar) {
        if (beVar != null) {
            a(bnVar, str, beVar.c(), beVar.d(), beVar.b());
        }
    }

    public void b(Throwable th, String str, String str2) {
        if (th != null) {
            try {
                a(th, 1, str, str2);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(final Context context, final bn bnVar, final boolean z) {
        try {
            ExecutorService c2 = c();
            if (c2 != null) {
                if (!c2.isShutdown()) {
                    c2.submit(new Runnable() {
                        public void run() {
                            try {
                                synchronized (Looper.getMainLooper()) {
                                    new cj(context, true).a(bnVar);
                                }
                                if (z) {
                                    cb.a(ca.this.f6679d);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            }
        } catch (RejectedExecutionException unused) {
        } catch (Throwable unused2) {
        }
    }

    /* access modifiers changed from: protected */
    public void a(Throwable th, int i, String str, String str2) {
        cb.a(this.f6679d, th, i, str, str2);
    }

    public static void a(bn bnVar, String str, String str2, String str3, String str4) {
        try {
            if (bx.f6665a != null) {
                bx.f6665a.a(bnVar, "path:" + str + ",type:" + str2 + ",gsid:" + str3 + ",code:" + str4, "networkError");
            }
        } catch (Throwable unused) {
        }
    }
}
