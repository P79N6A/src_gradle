package com.ss.android.downloadlib.c.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private String f28873a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f28874b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    private boolean f28875c;

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f28874b.incrementAndGet();
        Thread thread = new Thread(runnable, this.f28873a + "-" + incrementAndGet);
        if (!this.f28875c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        return thread;
    }

    public b(String str, boolean z) {
        this.f28873a = str;
        this.f28875c = true;
    }
}
