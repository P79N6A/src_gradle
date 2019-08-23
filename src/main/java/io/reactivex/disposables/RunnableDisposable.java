package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;

public final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public final String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    RunnableDisposable(Runnable runnable) {
        super(runnable);
    }

    /* access modifiers changed from: protected */
    public final void onDisposed(@NonNull Runnable runnable) {
        runnable.run();
    }
}
