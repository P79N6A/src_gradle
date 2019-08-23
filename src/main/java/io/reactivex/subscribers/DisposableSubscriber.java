package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    final AtomicReference<d> upstream = new AtomicReference<>();

    /* access modifiers changed from: protected */
    public final void cancel() {
        dispose();
    }

    public final void dispose() {
        SubscriptionHelper.cancel(this.upstream);
    }

    public final boolean isDisposed() {
        if (this.upstream.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.upstream.get().request(Long.MAX_VALUE);
    }

    public final void onSubscribe(d dVar) {
        if (EndConsumerHelper.setOnce(this.upstream, dVar, getClass())) {
            onStart();
        }
    }

    /* access modifiers changed from: protected */
    public final void request(long j) {
        this.upstream.get().request(j);
    }
}
