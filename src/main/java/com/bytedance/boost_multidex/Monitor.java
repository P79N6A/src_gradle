package com.bytedance.boost_multidex;

import android.os.Looper;
import android.os.MessageQueue;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class Monitor {
    private static Monitor sMonitor;
    private Executor mExecutor = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(4);

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(int i) {
            return (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(i).a());
        }
    }

    static Monitor get() {
        return sMonitor;
    }

    static void init(Monitor monitor) {
        if (monitor == null) {
            monitor = new Monitor();
        }
        sMonitor = monitor;
    }

    /* access modifiers changed from: protected */
    public void doOptAfterInstall(final Runnable runnable) {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
            public boolean queueIdle() {
                Monitor.this.getExecutor().execute(runnable);
                return false;
            }
        });
    }

    /* access modifiers changed from: protected */
    public Executor getExecutor() {
        return this.mExecutor;
    }

    /* access modifiers changed from: protected */
    public boolean isEnableNativeCheckSum() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }

    /* access modifiers changed from: protected */
    public void logDebug(String str) {
    }

    /* access modifiers changed from: protected */
    public void logError(String str) {
    }

    /* access modifiers changed from: protected */
    public void logError(String str, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void logErrorAfterInstall(String str, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void logInfo(String str) {
    }

    /* access modifiers changed from: protected */
    public void logWarning(String str) {
    }

    /* access modifiers changed from: protected */
    public void logWarning(String str, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void reportAfterInstall(long j, long j2, long j3, String str) {
    }
}
