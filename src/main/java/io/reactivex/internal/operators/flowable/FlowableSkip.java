package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.a.c;
import org.a.d;

public final class FlowableSkip<T> extends AbstractFlowableWithUpstream<T, T> {
    final long n;

    static final class SkipSubscriber<T> implements FlowableSubscriber<T>, d {
        final c<? super T> downstream;
        long remaining;
        d upstream;

        public final void cancel() {
            this.upstream.cancel();
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void request(long j) {
            this.upstream.request(j);
        }

        public final void onNext(T t) {
            if (this.remaining != 0) {
                this.remaining--;
            } else {
                this.downstream.onNext(t);
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                long j = this.remaining;
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(j);
            }
        }

        SkipSubscriber(c<? super T> cVar, long j) {
            this.downstream = cVar;
            this.remaining = j;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new SkipSubscriber<Object>(cVar, this.n));
    }

    public FlowableSkip(Flowable<T> flowable, long j) {
        super(flowable);
        this.n = j;
    }
}
