package io.fabric.sdk.android.services.concurrency;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class j extends ThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    public static final int f83261a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f83262b = ((f83263c * 2) + 1);

    /* renamed from: c  reason: collision with root package name */
    private static final int f83263c;

    public static final class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final int f83264a = 10;

        public a(int i) {
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.f83264a);
            thread.setName("Queue");
            return thread;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public c getQueue() {
        return (c) super.getQueue();
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f83263c = availableProcessors;
        f83261a = availableProcessors + 1;
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new g(callable);
    }

    @TargetApi(9)
    public final void execute(Runnable runnable) {
        if (i.isProperDelegate(runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new g(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        k kVar = (k) runnable;
        kVar.setFinished(true);
        kVar.setError(th);
        getQueue().recycleBlockedQueue();
        super.afterExecute(runnable, th);
    }

    public <T extends Runnable & b & k & h> j(int i, int i2, long j, TimeUnit timeUnit, c<T> cVar, ThreadFactory threadFactory) {
        super(i, i2, 1, timeUnit, cVar, threadFactory);
        prestartAllCoreThreads();
    }
}
