package io.reactivex.disposables;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class SerialDisposable implements Disposable {
    final AtomicReference<Disposable> resource;

    public final void dispose() {
        DisposableHelper.dispose(this.resource);
    }

    public SerialDisposable() {
        this.resource = new AtomicReference<>();
    }

    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.resource.get());
    }

    @Nullable
    public final Disposable get() {
        Disposable disposable = this.resource.get();
        if (disposable == DisposableHelper.DISPOSED) {
            return Disposables.disposed();
        }
        return disposable;
    }

    public final boolean replace(@Nullable Disposable disposable) {
        return DisposableHelper.replace(this.resource, disposable);
    }

    public final boolean set(@Nullable Disposable disposable) {
        return DisposableHelper.set(this.resource, disposable);
    }

    public SerialDisposable(@Nullable Disposable disposable) {
        this.resource = new AtomicReference<>(disposable);
    }
}
