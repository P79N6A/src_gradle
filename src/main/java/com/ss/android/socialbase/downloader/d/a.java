package com.ss.android.socialbase.downloader.d;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f30855a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f30856b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    private final boolean f30857c;

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f30856b.incrementAndGet();
        Thread thread = new Thread(runnable, this.f30855a + "-" + incrementAndGet);
        if (!this.f30857c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        return thread;
    }

    public a(String str, boolean z) {
        this.f30855a = str;
        this.f30857c = true;
    }
}
