package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.c;
import org.a.d;

public final class FlowableIgnoreElements<T> extends AbstractFlowableWithUpstream<T, T> {

    static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, QueueSubscription<T> {
        final c<? super T> downstream;
        d upstream;

        public final void clear() {
        }

        public final boolean isEmpty() {
            return true;
        }

        public final void onNext(T t) {
        }

        @Nullable
        public final T poll() {
            return null;
        }

        public final void request(long j) {
        }

        public final int requestFusion(int i) {
            return i & 2;
        }

        public final void cancel() {
            this.upstream.cancel();
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        IgnoreElementsSubscriber(c<? super T> cVar) {
            this.downstream = cVar;
        }

        public final boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    public FlowableIgnoreElements(Flowable<T> flowable) {
        super(flowable);
    }

    public final void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new IgnoreElementsSubscriber<Object>(cVar));
    }
}
