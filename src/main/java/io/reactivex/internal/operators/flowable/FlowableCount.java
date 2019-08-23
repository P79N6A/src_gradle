package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.c;
import org.a.d;

public final class FlowableCount<T> extends AbstractFlowableWithUpstream<T, Long> {

    static final class CountSubscriber extends DeferredScalarSubscription<Long> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = 4973004223787171406L;
        long count;
        d upstream;

        public final void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        public final void onComplete() {
            complete(Long.valueOf(this.count));
        }

        CountSubscriber(c<? super Long> cVar) {
            super(cVar);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onNext(Object obj) {
            this.count++;
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCount(Flowable<T> flowable) {
        super(flowable);
    }

    public final void subscribeActual(c<? super Long> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new CountSubscriber<Object>(cVar));
    }
}
