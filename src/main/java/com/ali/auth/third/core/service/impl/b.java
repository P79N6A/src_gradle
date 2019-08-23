package com.ali.auth.third.core.service.impl;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f4957a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f4958b = new AtomicInteger(1);

    b(a aVar) {
        this.f4957a = aVar;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ExecutorTask #" + this.f4958b.getAndIncrement());
    }
}
