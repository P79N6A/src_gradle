package com.tencent.bugly.proguard;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static w f79537a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f79538b = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(3, new ThreadFactory(this) {
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("BUGLY_THREAD");
            return thread;
        }
    });

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(int i, ThreadFactory threadFactory) {
            return (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(i).a(threadFactory).a());
        }
    }

    public static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            if (f79537a == null) {
                f79537a = new w();
            }
            wVar = f79537a;
        }
        return wVar;
    }

    public final synchronized void b() {
        if (this.f79538b != null && !this.f79538b.isShutdown()) {
            x.c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f79538b.shutdownNow();
        }
    }

    public final synchronized boolean c() {
        boolean z;
        if (this.f79538b == null || this.f79538b.isShutdown()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    protected w() {
        if (this.f79538b == null || this.f79538b.isShutdown()) {
            x.d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    public final synchronized boolean a(Runnable runnable) {
        if (!c()) {
            x.d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        } else if (runnable == null) {
            x.d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        } else {
            x.c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
            try {
                this.f79538b.execute(runnable);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public final synchronized boolean a(Runnable runnable, long j) {
        if (!c()) {
            x.d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        } else if (runnable == null) {
            x.d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        } else {
            if (j <= 0) {
                j = 0;
            }
            x.c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j), runnable.getClass().getName());
            try {
                this.f79538b.schedule(runnable, j, TimeUnit.MILLISECONDS);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
