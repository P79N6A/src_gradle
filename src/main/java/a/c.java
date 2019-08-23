package a;

import com.ss.android.ugc.aweme.thread.h;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final c f1035a = new c();

    /* renamed from: b  reason: collision with root package name */
    final Executor f1036b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f1037c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f1038d;

    static class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private ThreadLocal<Integer> f1039a;

        private a() {
            this.f1039a = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.f1039a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f1039a.remove();
            } else {
                this.f1039a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void execute(Runnable runnable) {
            Integer num = this.f1039a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f1039a.set(Integer.valueOf(intValue));
            if (intValue <= 15) {
                try {
                    runnable.run();
                } finally {
                    a();
                }
            } else {
                c.a().execute(runnable);
            }
        }
    }

    public static ExecutorService a() {
        return h.d();
    }

    static ScheduledExecutorService b() {
        return h.f();
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private c() {
        /*
            r10 = this;
            r10.<init>()
            java.lang.String r0 = "java.runtime.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            r0 = 0
            goto L_0x001a
        L_0x000e:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.String r2 = "android"
            boolean r0 = r0.contains(r2)
        L_0x001a:
            r2 = 1
            if (r0 != 0) goto L_0x0022
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            goto L_0x003e
        L_0x0022:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            int r4 = a.b.f1031c
            int r5 = a.b.f1032d
            r6 = 1
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r3 = r0
            r3.<init>(r4, r5, r6, r8, r9)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 9
            if (r3 < r4) goto L_0x003e
            r0.allowCoreThreadTimeOut(r2)
        L_0x003e:
            r10.f1037c = r0
            com.ss.android.ugc.aweme.thread.p r0 = com.ss.android.ugc.aweme.thread.p.SCHEDULED
            com.ss.android.ugc.aweme.thread.m$a r0 = com.ss.android.ugc.aweme.thread.m.a(r0)
            com.ss.android.ugc.aweme.thread.m$a r0 = r0.a((int) r2)
            com.ss.android.ugc.aweme.thread.m r0 = r0.a()
            java.util.concurrent.ExecutorService r0 = com.ss.android.ugc.aweme.thread.h.a((com.ss.android.ugc.aweme.thread.m) r0)
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r10.f1038d = r0
            a.c$a r0 = new a.c$a
            r0.<init>(r1)
            r10.f1036b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c.<init>():void");
    }
}
