package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import org.a.d;

public final class SubscriptionDisposable extends ReferenceDisposable<d> {
    private static final long serialVersionUID = -707001650852963139L;

    SubscriptionDisposable(d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    public final void onDisposed(@NonNull d dVar) {
        dVar.cancel();
    }
}
