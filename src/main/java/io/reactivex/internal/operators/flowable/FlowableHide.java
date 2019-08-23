package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.c;
import org.a.d;

public final class FlowableHide<T> extends AbstractFlowableWithUpstream<T, T> {

    static final class HideSubscriber<T> implements FlowableSubscriber<T>, d {
        final c<? super T> downstream;
        d upstream;

        public final void cancel() {
            this.upstream.cancel();
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        HideSubscriber(c<? super T> cVar) {
            this.downstream = cVar;
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void request(long j) {
            this.upstream.request(j);
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public FlowableHide(Flowable<T> flowable) {
        super(flowable);
    }

    public final void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new HideSubscriber<Object>(cVar));
    }
}
