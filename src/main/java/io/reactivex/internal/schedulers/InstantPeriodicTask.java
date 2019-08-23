package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

public final class InstantPeriodicTask implements Disposable, Callable<Void> {
    static final FutureTask<Void> CANCELLED = new FutureTask<>(Functions.EMPTY_RUNNABLE, null);
    final ExecutorService executor;
    final AtomicReference<Future<?>> first = new AtomicReference<>();
    final AtomicReference<Future<?>> rest = new AtomicReference<>();
    Thread runner;
    final Runnable task;

    public final boolean isDisposed() {
        if (this.first.get() == CANCELLED) {
            return true;
        }
        return false;
    }

    public final Void call() throws Exception {
        this.runner = Thread.currentThread();
        try {
            this.task.run();
            setRest(this.executor.submit(this));
            this.runner = null;
        } catch (Throwable th) {
            this.runner = null;
            RxJavaPlugins.onError(th);
        }
        return null;
    }

    public final void dispose() {
        boolean z;
        Future andSet = this.first.getAndSet(CANCELLED);
        boolean z2 = false;
        if (!(andSet == null || andSet == CANCELLED)) {
            if (this.runner != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            andSet.cancel(z);
        }
        Future andSet2 = this.rest.getAndSet(CANCELLED);
        if (andSet2 != null && andSet2 != CANCELLED) {
            if (this.runner != Thread.currentThread()) {
                z2 = true;
            }
            andSet2.cancel(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setFirst(Future<?> future) {
        Future future2;
        boolean z;
        do {
            future2 = this.first.get();
            if (future2 == CANCELLED) {
                if (this.runner != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!this.first.compareAndSet(future2, future));
    }

    /* access modifiers changed from: package-private */
    public final void setRest(Future<?> future) {
        Future future2;
        boolean z;
        do {
            future2 = this.rest.get();
            if (future2 == CANCELLED) {
                if (this.runner != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!this.rest.compareAndSet(future2, future));
    }

    InstantPeriodicTask(Runnable runnable, ExecutorService executorService) {
        this.task = runnable;
        this.executor = executorService;
    }
}
