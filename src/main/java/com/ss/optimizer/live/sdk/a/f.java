package com.ss.optimizer.live.sdk.a;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f78418a;

    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadGroup f78419a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f78420b;

        /* renamed from: c  reason: collision with root package name */
        private final String f78421c;

        private a() {
            ThreadGroup threadGroup;
            this.f78420b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f78419a = threadGroup;
            this.f78421c = "live-sdk-";
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f78419a;
            Thread thread = new Thread(threadGroup, runnable, this.f78421c + this.f78420b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a((byte) 0));
        this.f78418a = threadPoolExecutor;
    }

    public final void a(Runnable runnable) {
        this.f78418a.execute(runnable);
    }
}
