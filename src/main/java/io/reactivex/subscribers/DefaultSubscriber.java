package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import org.a.d;

public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {
    d upstream;

    /* access modifiers changed from: protected */
    public final void cancel() {
        d dVar = this.upstream;
        this.upstream = SubscriptionHelper.CANCELLED;
        dVar.cancel();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        request(Long.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    public final void request(long j) {
        d dVar = this.upstream;
        if (dVar != null) {
            dVar.request(j);
        }
    }

    public final void onSubscribe(d dVar) {
        if (EndConsumerHelper.validate(this.upstream, dVar, getClass())) {
            this.upstream = dVar;
            onStart();
        }
    }
}
