package com.amap.api.services.a;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ai {

    /* renamed from: c  reason: collision with root package name */
    private static volatile ai f6452c;

    /* renamed from: a  reason: collision with root package name */
    private BlockingQueue<Runnable> f6453a = new LinkedBlockingQueue();

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f6454b = null;

    public static ai a() {
        if (f6452c == null) {
            synchronized (ai.class) {
                if (f6452c == null) {
                    f6452c = new ai();
                }
            }
        }
        return f6452c;
    }

    public static void b() {
        if (f6452c != null) {
            synchronized (ai.class) {
                if (f6452c != null) {
                    f6452c.f6454b.shutdownNow();
                    f6452c.f6454b = null;
                    f6452c = null;
                }
            }
        }
    }

    private ai() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors * 2, 1, TimeUnit.SECONDS, this.f6453a, new ThreadPoolExecutor.AbortPolicy());
        this.f6454b = threadPoolExecutor;
    }

    public void a(Runnable runnable) {
        if (this.f6454b != null) {
            this.f6454b.execute(runnable);
        }
    }
}
