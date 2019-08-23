package com.meizu.cloud.pushsdk.c.b.a;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f27101a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f27102b = 2;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(int i) {
            return (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(i).a());
        }
    }

    public static ExecutorService a() {
        synchronized (b.class) {
            if (f27101a == null) {
                f27101a = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(f27102b);
            }
        }
        return f27101a;
    }

    public static Future a(Callable callable) {
        return a().submit(callable);
    }

    public static void a(int i) {
        f27102b = i;
    }

    public static void a(Runnable runnable) {
        a().execute(runnable);
    }
}
