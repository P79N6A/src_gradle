package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {
    final b<? extends T> other;

    static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {
        final SubscriptionArbiter arbiter = new SubscriptionArbiter(false);
        final c<? super T> downstream;
        boolean empty = true;
        final b<? extends T> other;

        public final void onComplete() {
            if (this.empty) {
                this.empty = false;
                this.other.subscribe(this);
                return;
            }
            this.downstream.onComplete();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSubscribe(d dVar) {
            this.arbiter.setSubscription(dVar);
        }

        public final void onNext(T t) {
            if (this.empty) {
                this.empty = false;
            }
            this.downstream.onNext(t);
        }

        SwitchIfEmptySubscriber(c<? super T> cVar, b<? extends T> bVar) {
            this.downstream = cVar;
            this.other = bVar;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        SwitchIfEmptySubscriber switchIfEmptySubscriber = new SwitchIfEmptySubscriber(cVar, this.other);
        cVar.onSubscribe(switchIfEmptySubscriber.arbiter);
        this.source.subscribe((FlowableSubscriber<? super T>) switchIfEmptySubscriber);
    }

    public FlowableSwitchIfEmpty(Flowable<T> flowable, b<? extends T> bVar) {
        super(flowable);
        this.other = bVar;
    }
}
