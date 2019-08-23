package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Looper;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.lang.Thread;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class dg extends dd implements Thread.UncaughtExceptionHandler {

    /* renamed from: e  reason: collision with root package name */
    private static ExecutorService f5946e;

    /* renamed from: f  reason: collision with root package name */
    private static Set<Integer> f5947f = Collections.synchronizedSet(new HashSet());
    private static final ThreadFactory g = new ThreadFactory() {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f5953a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "pama#" + this.f5953a.getAndIncrement());
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Context f5948d;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor(ThreadFactory threadFactory) {
            return h.a(m.a(p.FIXED).a(1).a(threadFactory).a());
        }
    }

    static class a implements et {

        /* renamed from: a  reason: collision with root package name */
        private Context f5954a;

        public void a() {
            try {
                de.b(this.f5954a);
            } catch (Throwable th) {
                dd.a(th, "LogNetListener", "onNetCompleted");
            }
        }

        a(Context context) {
            this.f5954a = context;
        }
    }

    public static synchronized dg a() {
        dg dgVar;
        synchronized (dg.class) {
            dgVar = (dg) dd.f5925a;
        }
        return dgVar;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.concurrent.ExecutorService c() {
        /*
            java.lang.Class<com.amap.api.mapcore2d.dg> r0 = com.amap.api.mapcore2d.dg.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = f5946e     // Catch:{ Throwable -> 0x001a }
            if (r1 == 0) goto L_0x000f
            java.util.concurrent.ExecutorService r1 = f5946e     // Catch:{ Throwable -> 0x001a }
            boolean r1 = r1.isShutdown()     // Catch:{ Throwable -> 0x001a }
            if (r1 == 0) goto L_0x001a
        L_0x000f:
            java.util.concurrent.ThreadFactory r1 = g     // Catch:{ Throwable -> 0x001a }
            java.util.concurrent.ExecutorService r1 = com.amap.api.mapcore2d.dg._lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor(r1)     // Catch:{ Throwable -> 0x001a }
            f5946e = r1     // Catch:{ Throwable -> 0x001a }
            goto L_0x001a
        L_0x0018:
            r1 = move-exception
            goto L_0x001e
        L_0x001a:
            java.util.concurrent.ExecutorService r1 = f5946e     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            return r1
        L_0x001e:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.dg.c():java.util.concurrent.ExecutorService");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void b() {
        /*
            java.lang.Class<com.amap.api.mapcore2d.dg> r0 = com.amap.api.mapcore2d.dg.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = f5946e     // Catch:{ Throwable -> 0x0012, all -> 0x0010 }
            if (r1 == 0) goto L_0x000c
            java.util.concurrent.ExecutorService r1 = f5946e     // Catch:{ Throwable -> 0x0012, all -> 0x0010 }
            r1.shutdown()     // Catch:{ Throwable -> 0x0012, all -> 0x0010 }
        L_0x000c:
            com.amap.api.mapcore2d.el.a()     // Catch:{ Throwable -> 0x0012, all -> 0x0010 }
            goto L_0x0012
        L_0x0010:
            r1 = move-exception
            goto L_0x0030
        L_0x0012:
            com.amap.api.mapcore2d.dd r1 = com.amap.api.mapcore2d.dd.f5925a     // Catch:{ Throwable -> 0x0032, all -> 0x0010 }
            if (r1 == 0) goto L_0x002b
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Throwable -> 0x0032, all -> 0x0010 }
            com.amap.api.mapcore2d.dd r2 = com.amap.api.mapcore2d.dd.f5925a     // Catch:{ Throwable -> 0x0032, all -> 0x0010 }
            if (r1 != r2) goto L_0x002b
            com.amap.api.mapcore2d.dd r1 = com.amap.api.mapcore2d.dd.f5925a     // Catch:{ Throwable -> 0x0032, all -> 0x0010 }
            java.lang.Thread$UncaughtExceptionHandler r1 = r1.f5926b     // Catch:{ Throwable -> 0x0032, all -> 0x0010 }
            if (r1 == 0) goto L_0x002b
            com.amap.api.mapcore2d.dd r1 = com.amap.api.mapcore2d.dd.f5925a     // Catch:{ Throwable -> 0x0032, all -> 0x0010 }
            java.lang.Thread$UncaughtExceptionHandler r1 = r1.f5926b     // Catch:{ Throwable -> 0x0032, all -> 0x0010 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)     // Catch:{ Throwable -> 0x0032, all -> 0x0010 }
        L_0x002b:
            r1 = 0
            com.amap.api.mapcore2d.dd.f5925a = r1     // Catch:{ Throwable -> 0x0032, all -> 0x0010 }
            monitor-exit(r0)
            return
        L_0x0030:
            monitor-exit(r0)
            throw r1
        L_0x0032:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.dg.b():void");
    }

    private void d() {
        try {
            this.f5926b = Thread.getDefaultUncaughtExceptionHandler();
            if (this.f5926b == null) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.f5927c = true;
            } else {
                String obj = this.f5926b.toString();
                if (obj.indexOf("com.amap.api") == -1) {
                    if (obj.indexOf("com.loc") == -1) {
                        Thread.setDefaultUncaughtExceptionHandler(this);
                        this.f5927c = true;
                        return;
                    }
                }
                this.f5927c = false;
            }
        } catch (Throwable unused) {
        }
    }

    private dg(Context context, cy cyVar) {
        this.f5948d = context;
        es.a((et) new a(context));
        d();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            a(th, 0, null, null);
            if (this.f5926b != null) {
                try {
                    Thread.setDefaultUncaughtExceptionHandler(this.f5926b);
                } catch (Throwable unused) {
                }
                this.f5926b.uncaughtException(thread, th);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:14|15|(1:17)(1:18)|19|20|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0047 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0047=Splitter:B:20:0x0047, B:24:0x004d=Splitter:B:24:0x004d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.amap.api.mapcore2d.dg a(android.content.Context r3, com.amap.api.mapcore2d.cy r4) throws com.amap.api.mapcore2d.co {
        /*
            java.lang.Class<com.amap.api.mapcore2d.dg> r0 = com.amap.api.mapcore2d.dg.class
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0055
            java.lang.String r1 = r4.a()     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = ""
            java.lang.String r2 = r4.a()     // Catch:{ all -> 0x005d }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x005d }
            if (r1 != 0) goto L_0x004d
            java.util.Set<java.lang.Integer> r1 = f5947f     // Catch:{ Throwable -> 0x0047 }
            int r2 = r4.hashCode()     // Catch:{ Throwable -> 0x0047 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x0047 }
            boolean r1 = r1.add(r2)     // Catch:{ Throwable -> 0x0047 }
            if (r1 != 0) goto L_0x002d
            com.amap.api.mapcore2d.dd r3 = com.amap.api.mapcore2d.dd.f5925a     // Catch:{ Throwable -> 0x0047 }
            com.amap.api.mapcore2d.dg r3 = (com.amap.api.mapcore2d.dg) r3     // Catch:{ Throwable -> 0x0047 }
            monitor-exit(r0)
            return r3
        L_0x002d:
            com.amap.api.mapcore2d.dd r1 = com.amap.api.mapcore2d.dd.f5925a     // Catch:{ Throwable -> 0x0047 }
            if (r1 != 0) goto L_0x0039
            com.amap.api.mapcore2d.dg r1 = new com.amap.api.mapcore2d.dg     // Catch:{ Throwable -> 0x0047 }
            r1.<init>(r3, r4)     // Catch:{ Throwable -> 0x0047 }
            com.amap.api.mapcore2d.dd.f5925a = r1     // Catch:{ Throwable -> 0x0047 }
            goto L_0x003e
        L_0x0039:
            com.amap.api.mapcore2d.dd r1 = com.amap.api.mapcore2d.dd.f5925a     // Catch:{ Throwable -> 0x0047 }
            r2 = 0
            r1.f5927c = r2     // Catch:{ Throwable -> 0x0047 }
        L_0x003e:
            com.amap.api.mapcore2d.dd r1 = com.amap.api.mapcore2d.dd.f5925a     // Catch:{ Throwable -> 0x0047 }
            com.amap.api.mapcore2d.dd r2 = com.amap.api.mapcore2d.dd.f5925a     // Catch:{ Throwable -> 0x0047 }
            boolean r2 = r2.f5927c     // Catch:{ Throwable -> 0x0047 }
            r1.a((android.content.Context) r3, (com.amap.api.mapcore2d.cy) r4, (boolean) r2)     // Catch:{ Throwable -> 0x0047 }
        L_0x0047:
            com.amap.api.mapcore2d.dd r3 = com.amap.api.mapcore2d.dd.f5925a     // Catch:{ all -> 0x005d }
            com.amap.api.mapcore2d.dg r3 = (com.amap.api.mapcore2d.dg) r3     // Catch:{ all -> 0x005d }
            monitor-exit(r0)
            return r3
        L_0x004d:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x005d }
            java.lang.String r4 = "sdk name is invalid"
            r3.<init>(r4)     // Catch:{ all -> 0x005d }
            throw r3     // Catch:{ all -> 0x005d }
        L_0x0055:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x005d }
            java.lang.String r4 = "sdk info is null"
            r3.<init>(r4)     // Catch:{ all -> 0x005d }
            throw r3     // Catch:{ all -> 0x005d }
        L_0x005d:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.dg.a(android.content.Context, com.amap.api.mapcore2d.cy):com.amap.api.mapcore2d.dg");
    }

    /* access modifiers changed from: protected */
    public void a(cy cyVar, String str, String str2) {
        de.a(this.f5948d, cyVar, str, str2);
    }

    public static void b(cy cyVar, String str, String str2) {
        if (dd.f5925a != null) {
            dd.f5925a.a(cyVar, str, str2);
        }
    }

    public void c(Throwable th, String str, String str2) {
        if (th != null) {
            try {
                a(th, 1, str, str2);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(cy cyVar, String str, co coVar) {
        if (coVar != null) {
            a(cyVar, str, coVar.c(), coVar.d(), coVar.b());
        }
    }

    public static void b(Throwable th, String str, String str2) {
        if (dd.f5925a != null) {
            dd.f5925a.a(th, 1, str, str2);
        }
    }

    /* access modifiers changed from: protected */
    public void a(final Context context, final cy cyVar, final boolean z) {
        try {
            ExecutorService c2 = c();
            if (c2 != null) {
                if (!c2.isShutdown()) {
                    c2.submit(new Runnable() {
                        public void run() {
                            try {
                                synchronized (Looper.getMainLooper()) {
                                    new dw(context, true).a(cyVar);
                                }
                                if (z) {
                                    synchronized (Looper.getMainLooper()) {
                                        dx dxVar = new dx(context);
                                        dy dyVar = new dy();
                                        dyVar.c(true);
                                        dyVar.a(true);
                                        dyVar.b(true);
                                        dxVar.a(dyVar);
                                    }
                                    de.a(dg.this.f5948d);
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
        de.a(this.f5948d, th, i, str, str2);
    }

    public static void a(cy cyVar, String str, String str2, String str3, String str4) {
        if (dd.f5925a != null) {
            dd.f5925a.a(cyVar, "path:" + str + ",type:" + str2 + ",gsid:" + str3 + ",code:" + str4, "networkError");
        }
    }
}
