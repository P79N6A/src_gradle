package com.alipay.b.b.a.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class u implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f5294a = new AtomicInteger(1);

    u() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #" + this.f5294a.getAndIncrement());
        thread.setPriority(4);
        return thread;
    }
}
