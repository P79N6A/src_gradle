package com.taobao.accs.common;

import com.taobao.accs.utl.ALog;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExecutorFactory {
    public static final AtomicInteger integer = new AtomicInteger();
    private static volatile ScheduledThreadPoolExecutor scheduleThreadPoolExecutor;
    private static volatile ScheduledThreadPoolExecutor sendThreadPoolExecutor;

    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f78922a;

        public a(String str) {
            this.f78922a = str;
        }

        public Thread newThread(Runnable runnable) {
            int andIncrement = ThreadPoolExecutorFactory.integer.getAndIncrement();
            Thread thread = new Thread(runnable, this.f78922a + andIncrement);
            thread.setPriority(5);
            return thread;
        }
    }

    public static ScheduledThreadPoolExecutor getScheduledExecutor() {
        if (scheduleThreadPoolExecutor == null) {
            synchronized (ThreadPoolExecutorFactory.class) {
                if (scheduleThreadPoolExecutor == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("ACCS"));
                    scheduleThreadPoolExecutor = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
                    scheduleThreadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return scheduleThreadPoolExecutor;
    }

    public static ScheduledThreadPoolExecutor getSendScheduledExecutor() {
        if (sendThreadPoolExecutor == null) {
            synchronized (ThreadPoolExecutorFactory.class) {
                if (sendThreadPoolExecutor == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("ACCS-SEND"));
                    sendThreadPoolExecutor = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
                    sendThreadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return sendThreadPoolExecutor;
    }

    public static void execute(Runnable runnable) {
        try {
            getScheduledExecutor().execute(runnable);
        } catch (Throwable th) {
            ALog.e("ThreadPoolExecutorFactory", "ThreadPoolExecutorFactory execute", th, new Object[0]);
        }
    }

    public static ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            return getScheduledExecutor().schedule(runnable, j, timeUnit);
        } catch (Throwable th) {
            ALog.e("ThreadPoolExecutorFactory", "ThreadPoolExecutorFactory schedule", th, new Object[0]);
            return null;
        }
    }
}
