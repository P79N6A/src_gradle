package io.reactivex.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

public final class FutureDisposable extends AtomicReference<Future<?>> implements Disposable {
    private static final long serialVersionUID = 6545242830671168775L;
    private final boolean allowInterrupt;

    public final void dispose() {
        Future future = (Future) getAndSet(null);
        if (future != null) {
            future.cancel(this.allowInterrupt);
        }
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        if (future == null || future.isDone()) {
            return true;
        }
        return false;
    }

    FutureDisposable(Future<?> future, boolean z) {
        super(future);
        this.allowInterrupt = z;
    }
}
