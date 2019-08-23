package com.meizu.cloud.pushsdk.base;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class f extends j<Executor> implements Executor {

    /* renamed from: c  reason: collision with root package name */
    private static f f27078c;

    protected f(Executor executor) {
        super(executor);
    }

    public static f a() {
        if (f27078c == null) {
            synchronized (f.class) {
                if (f27078c == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 5, 30, TimeUnit.SECONDS, new LinkedBlockingDeque(100), new RejectedExecutionHandler() {
                        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                            new Thread(runnable).start();
                        }
                    });
                    f27078c = new f(threadPoolExecutor);
                }
            }
        }
        return f27078c;
    }

    public void execute(Runnable runnable) {
        ((Executor) c()).execute(runnable);
    }
}
