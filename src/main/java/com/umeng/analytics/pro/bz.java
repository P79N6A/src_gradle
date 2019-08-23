package com.umeng.analytics.pro;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class bz {

    /* renamed from: a  reason: collision with root package name */
    private static List<WeakReference<ScheduledFuture<?>>> f80543a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static ExecutorService f80544b = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor();

    /* renamed from: c  reason: collision with root package name */
    private static long f80545c = 5;

    /* renamed from: d  reason: collision with root package name */
    private static ScheduledExecutorService f80546d = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadScheduledExecutor();

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor() {
            return h.a(m.a(p.FIXED).a(1).a());
        }

        @TargetClass
        @Proxy
        static ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadScheduledExecutor() {
            return (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(1).a());
        }
    }

    public static void a() {
        try {
            for (WeakReference<ScheduledFuture<?>> weakReference : f80543a) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) weakReference.get();
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
            }
            f80543a.clear();
            if (!f80544b.isShutdown()) {
                f80544b.shutdown();
            }
            if (!f80546d.isShutdown()) {
                f80546d.shutdown();
            }
            f80544b.awaitTermination(f80545c, TimeUnit.SECONDS);
            f80546d.awaitTermination(f80545c, TimeUnit.SECONDS);
        } catch (Exception unused) {
        }
    }

    public static void a(Runnable runnable) {
        if (f80544b.isShutdown()) {
            f80544b = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor();
        }
        f80544b.execute(runnable);
    }

    public static synchronized void b(Runnable runnable) {
        synchronized (bz.class) {
            if (f80546d.isShutdown()) {
                f80546d = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadScheduledExecutor();
            }
            f80546d.execute(runnable);
        }
    }

    public static synchronized void c(Runnable runnable) {
        synchronized (bz.class) {
            if (f80546d.isShutdown()) {
                f80546d = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadScheduledExecutor();
            }
            try {
                f80546d.submit(runnable).get(5, TimeUnit.SECONDS);
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void a(Runnable runnable, long j) {
        synchronized (bz.class) {
            if (f80546d.isShutdown()) {
                f80546d = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadScheduledExecutor();
            }
            f80543a.add(new WeakReference(f80546d.schedule(runnable, j, TimeUnit.MILLISECONDS)));
        }
    }
}
