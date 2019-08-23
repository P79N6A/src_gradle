package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

public abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements Disposable, SchedulerRunnableIntrospection {
    protected static final FutureTask<Void> DISPOSED = new FutureTask<>(Functions.EMPTY_RUNNABLE, null);
    protected static final FutureTask<Void> FINISHED = new FutureTask<>(Functions.EMPTY_RUNNABLE, null);
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    public Runnable getWrappedRunnable() {
        return this.runnable;
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        if (future == FINISHED || future == DISPOSED) {
            return true;
        }
        return false;
    }

    public final void dispose() {
        boolean z;
        Future future = (Future) get();
        if (future != FINISHED && future != DISPOSED && compareAndSet(future, DISPOSED) && future != null) {
            if (this.runner != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }

    AbstractDirectTask(Runnable runnable2) {
        this.runnable = runnable2;
    }

    public final void setFuture(Future<?> future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) get();
            if (future2 == FINISHED) {
                break;
            } else if (future2 == DISPOSED) {
                if (this.runner != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
