package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {
    final long count;

    static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final c<? super T> downstream;
        long produced;
        long remaining;
        final SubscriptionArbiter sa;
        final b<? extends T> source;

        public final void onComplete() {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.sa.isCancelled()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0;
                        this.sa.produced(j);
                    }
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSubscribe(d dVar) {
            this.sa.setSubscription(dVar);
        }

        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        RepeatSubscriber(c<? super T> cVar, long j, SubscriptionArbiter subscriptionArbiter, b<? extends T> bVar) {
            this.downstream = cVar;
            this.sa = subscriptionArbiter;
            this.source = bVar;
            this.remaining = j;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        long j = Long.MAX_VALUE;
        if (this.count != Long.MAX_VALUE) {
            j = this.count - 1;
        }
        RepeatSubscriber repeatSubscriber = new RepeatSubscriber(cVar, j, subscriptionArbiter, this.source);
        repeatSubscriber.subscribeNext();
    }

    public FlowableRepeat(Flowable<T> flowable, long j) {
        super(flowable);
        this.count = j;
    }
}
