package com.facebook.common.executors;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;

public final class e<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f23519a;

    /* renamed from: b  reason: collision with root package name */
    private final FutureTask<V> f23520b;

    public final V get() throws InterruptedException, ExecutionException {
        return this.f23520b.get();
    }

    public final boolean isCancelled() {
        return this.f23520b.isCancelled();
    }

    public final boolean isDone() {
        return this.f23520b.isDone();
    }

    public final void run() {
        this.f23520b.run();
    }

    public final boolean cancel(boolean z) {
        return this.f23520b.cancel(z);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f23520b.get(j, timeUnit);
    }

    public e(Handler handler, Callable<V> callable) {
        this.f23519a = handler;
        this.f23520b = new FutureTask<>(callable);
    }

    public e(Handler handler, Runnable runnable, @Nullable V v) {
        this.f23519a = handler;
        this.f23520b = new FutureTask<>(runnable, v);
    }
}
