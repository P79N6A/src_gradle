package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public abstract class ResourceSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    private final AtomicLong missedRequested = new AtomicLong();
    private final ListCompositeDisposable resources = new ListCompositeDisposable();
    private final AtomicReference<d> upstream = new AtomicReference<>();

    public final void dispose() {
        if (SubscriptionHelper.cancel(this.upstream)) {
            this.resources.dispose();
        }
    }

    public final boolean isDisposed() {
        if (this.upstream.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        request(Long.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    public final void request(long j) {
        SubscriptionHelper.deferredRequest(this.upstream, this.missedRequested, j);
    }

    public final void add(Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "resource is null");
        this.resources.add(disposable);
    }

    public final void onSubscribe(d dVar) {
        if (EndConsumerHelper.setOnce(this.upstream, dVar, getClass())) {
            long andSet = this.missedRequested.getAndSet(0);
            if (andSet != 0) {
                dVar.request(andSet);
            }
            onStart();
        }
    }
}
