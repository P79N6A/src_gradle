package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public final class SequentialDisposable extends AtomicReference<Disposable> implements Disposable {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public SequentialDisposable(Disposable disposable) {
        lazySet(disposable);
    }

    public final boolean replace(Disposable disposable) {
        return DisposableHelper.replace(this, disposable);
    }

    public final boolean update(Disposable disposable) {
        return DisposableHelper.set(this, disposable);
    }
}
