package com.bytedance.common.utility.concurrent;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleThreadFactory implements ThreadFactory {
    private boolean ignoreStatusCheck;
    private String threadName;
    private AtomicInteger threadSeq;

    public SimpleThreadFactory(String str) {
        this(str, false);
    }

    public Thread newThread(Runnable runnable) {
        int incrementAndGet = this.threadSeq.incrementAndGet();
        Thread thread = new Thread(runnable, this.threadName + "-" + incrementAndGet);
        if (!this.ignoreStatusCheck) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        return thread;
    }

    public SimpleThreadFactory(String str, boolean z) {
        this.threadSeq = new AtomicInteger();
        this.threadName = str;
        this.ignoreStatusCheck = z;
    }
}
