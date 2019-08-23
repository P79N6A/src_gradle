package com.bytedance.frameworks.core.b;

import android.text.TextUtils;
import com.bytedance.frameworks.core.b.b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class d implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f19978a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private final ThreadGroup f19979b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f19980c = new AtomicInteger(1);

    /* renamed from: d  reason: collision with root package name */
    private final String f19981d;

    /* renamed from: e  reason: collision with root package name */
    private final b.a f19982e;

    public final Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f19979b;
        Thread thread = new Thread(threadGroup, runnable, this.f19981d + this.f19980c.getAndIncrement(), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (this.f19982e != null && this.f19982e.getValue() == b.a.LOW.getValue()) {
            thread.setPriority(1);
        } else if (thread.getPriority() != 5) {
            thread.setPriority(3);
        } else {
            thread.setPriority(5);
        }
        return thread;
    }

    d(b.a aVar, String str) {
        ThreadGroup threadGroup;
        this.f19982e = aVar;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.f19979b = threadGroup;
        if (TextUtils.isEmpty(str)) {
            this.f19981d = "ttdefault-" + f19978a.getAndIncrement() + "-thread-";
            return;
        }
        this.f19981d = str + f19978a.getAndIncrement() + "-thread-";
    }
}
