package anet.channel.strategy.utils;

import anet.channel.util.ALog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static AtomicInteger f1419a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f1420b = null;

    static ScheduledThreadPoolExecutor a() {
        if (f1420b == null) {
            synchronized (a.class) {
                if (f1420b == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new b());
                    f1420b = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
                    f1420b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f1420b;
    }

    public static void a(Runnable runnable) {
        try {
            a().submit(runnable);
        } catch (Exception e2) {
            ALog.e("awcn.AmdcThreadPoolExecutor", "submit task failed", null, e2, new Object[0]);
        }
    }

    public static void a(Runnable runnable, long j) {
        try {
            a().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            ALog.e("awcn.AmdcThreadPoolExecutor", "schedule task failed", null, e2, new Object[0]);
        }
    }
}
