package com.ss.android.ugc.aweme.thread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a extends ThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4174a;

    /* renamed from: b  reason: collision with root package name */
    public p f4175b;

    public final void shutdown() {
        if (PatchProxy.isSupport(new Object[0], this, f4174a, false, 86856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4174a, false, 86856, new Class[0], Void.TYPE);
        } else if (!h.a((ExecutorService) this)) {
            super.shutdown();
        }
    }

    public final List<Runnable> shutdownNow() {
        if (PatchProxy.isSupport(new Object[0], this, f4174a, false, 86857, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f4174a, false, 86857, new Class[0], List.class);
        } else if (h.a((ExecutorService) this)) {
            return Collections.emptyList();
        } else {
            return super.shutdownNow();
        }
    }

    public final void execute(Runnable runnable) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{runnable}, this, f4174a, false, 86855, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable}, this, f4174a, false, 86855, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f4174a, false, 86859, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4174a, false, 86859, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z = h.a().f4230c.contains(this.f4175b);
        }
        if (z) {
            super.execute(new b(runnable, this));
        } else {
            super.execute(runnable);
        }
    }

    public final void afterExecute(Runnable runnable, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{runnable, th}, this, f4174a, false, 86858, new Class[]{Runnable.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable, th}, this, f4174a, false, 86858, new Class[]{Runnable.class, Throwable.class}, Void.TYPE);
            return;
        }
        super.afterExecute(runnable, th);
    }

    a(p pVar, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 30, timeUnit, blockingQueue, threadFactory);
        this.f4175b = pVar;
    }

    a(p pVar, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f4175b = pVar;
    }
}
