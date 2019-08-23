package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EmptyComponent;
import org.a.c;
import org.a.d;

public final class FlowableDetach<T> extends AbstractFlowableWithUpstream<T, T> {

    static final class DetachSubscriber<T> implements FlowableSubscriber<T>, d {
        c<? super T> downstream;
        d upstream;

        public final void cancel() {
            d dVar = this.upstream;
            this.upstream = EmptyComponent.INSTANCE;
            this.downstream = EmptyComponent.asSubscriber();
            dVar.cancel();
        }

        public final void onComplete() {
            c<? super T> cVar = this.downstream;
            this.upstream = EmptyComponent.INSTANCE;
            this.downstream = EmptyComponent.asSubscriber();
            cVar.onComplete();
        }

        DetachSubscriber(c<? super T> cVar) {
            this.downstream = cVar;
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void request(long j) {
            this.upstream.request(j);
        }

        public final void onError(Throwable th) {
            c<? super T> cVar = this.downstream;
            this.upstream = EmptyComponent.INSTANCE;
            this.downstream = EmptyComponent.asSubscriber();
            cVar.onError(th);
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public FlowableDetach(Flowable<T> flowable) {
        super(flowable);
    }

    public final void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new DetachSubscriber<Object>(cVar));
    }
}
