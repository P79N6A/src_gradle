package com.umeng.message.common;

import com.umeng.commonsdk.debug.UMLog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81157a = "com.umeng.message.common.d";

    /* renamed from: b  reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f81158b;

    /* renamed from: c  reason: collision with root package name */
    private static ThreadFactory f81159c = new ThreadFactory() {

        /* renamed from: a  reason: collision with root package name */
        private AtomicInteger f81160a = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("UMThreadPoolExecutor" + this.f81160a.addAndGet(1));
            return thread;
        }
    };

    private static ScheduledThreadPoolExecutor a() {
        if (f81158b == null) {
            synchronized (d.class) {
                if (f81158b == null) {
                    f81158b = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 4, f81159c);
                }
            }
        }
        return f81158b;
    }

    public static void a(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable unused) {
            UMLog.mutlInfo(f81157a, 0, "UmengThreadPoolExecutorFactory execute exception");
        }
    }

    public static void a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            a().schedule(runnable, j, timeUnit);
        } catch (Throwable unused) {
            UMLog.mutlInfo(f81157a, 0, "UmengThreadPoolExecutorFactory schedule exception");
        }
    }
}
