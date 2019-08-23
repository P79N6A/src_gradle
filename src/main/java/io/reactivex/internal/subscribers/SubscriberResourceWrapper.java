package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class SubscriberResourceWrapper<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, Disposable, d {
    private static final long serialVersionUID = -8612022020200669122L;
    final c<? super T> downstream;
    final AtomicReference<d> upstream = new AtomicReference<>();

    public final void cancel() {
        dispose();
    }

    public final void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose(this);
    }

    public final boolean isDisposed() {
        if (this.upstream.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    public final void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }

    public final void onNext(T t) {
        this.downstream.onNext(t);
    }

    public SubscriberResourceWrapper(c<? super T> cVar) {
        this.downstream = cVar;
    }

    public final void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    public final void onSubscribe(d dVar) {
        if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            this.upstream.get().request(j);
        }
    }
}
