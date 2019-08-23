package com.facebook.common.executors;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class d extends AbstractExecutorService implements c {

    /* renamed from: a  reason: collision with root package name */
    final Handler f23518a;

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public d(Handler handler) {
        this.f23518a = handler;
    }

    public void execute(Runnable runnable) {
        this.f23518a.post(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return submit(runnable, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> e<T> newTaskFor(Callable<T> callable) {
        return new e<>(this.f23518a, callable);
    }

    public /* synthetic */ Future submit(Callable callable) {
        if (callable != null) {
            e a2 = newTaskFor(callable);
            execute(a2);
            return a2;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> e<T> newTaskFor(Runnable runnable, T t) {
        return new e<>(this.f23518a, runnable, t);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public <T> ScheduledFuture<T> submit(Runnable runnable, @Nullable T t) {
        if (runnable != null) {
            e a2 = newTaskFor(runnable, t);
            execute(a2);
            return a2;
        }
        throw new NullPointerException();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        e a2 = newTaskFor(runnable, null);
        this.f23518a.postDelayed(a2, timeUnit.toMillis(j));
        return a2;
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        e<T> a2 = newTaskFor(callable);
        this.f23518a.postDelayed(a2, timeUnit.toMillis(j));
        return a2;
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
