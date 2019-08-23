package com.bytedance.common.utility.concurrent;

import com.bytedance.common.utility.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPlus implements Runnable {
    private static ExecutorService CACHED_EXECUTOR = TTExecutors.getNormalExecutor();
    private static ExecutorService FIXED_EXECUTOR = TTExecutors.getNormalExecutor();
    protected static final AtomicInteger sCount = new AtomicInteger();
    private final boolean mBackground;
    private Runnable runnable;

    public static void shutdown() {
    }

    public ThreadPlus() {
        this(false);
    }

    public void run() {
        if (this.runnable != null) {
            this.runnable.run();
        }
    }

    public void start() {
        Runnable runnable2;
        if (Logger.debug()) {
            runnable2 = new Runnable() {
                public void run() {
                    try {
                        ThreadPlus.this.run();
                    } catch (Exception unused) {
                    }
                }
            };
        } else {
            runnable2 = this;
        }
        if (this.mBackground) {
            FIXED_EXECUTOR.submit(runnable2);
        } else {
            CACHED_EXECUTOR.submit(runnable2);
        }
    }

    public static void setExecutorService(ExecutorService executorService) {
        CACHED_EXECUTOR = executorService;
        FIXED_EXECUTOR = executorService;
    }

    public static void submitRunnable(Runnable runnable2) {
        if (runnable2 != null) {
            CACHED_EXECUTOR.submit(runnable2);
        }
    }

    public ThreadPlus(String str) {
        this(false);
    }

    public ThreadPlus(boolean z) {
        this.mBackground = z;
    }

    public ThreadPlus(Runnable runnable2, String str, boolean z) {
        this.runnable = runnable2;
        this.mBackground = z;
    }
}
