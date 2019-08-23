package com.ss.android.ugc.effectmanager.common;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class e implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private String f77311a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f77312b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    private boolean f77313c;

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f77312b.incrementAndGet();
        Thread thread = new Thread(runnable, this.f77311a + "-" + incrementAndGet);
        if (!this.f77313c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        return thread;
    }

    public e(String str, boolean z) {
        this.f77311a = str;
        this.f77313c = true;
    }
}
