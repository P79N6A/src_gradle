package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    final long count;
    final Predicate<? super Throwable> predicate;

    static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final c<? super T> downstream;
        final Predicate<? super Throwable> predicate;
        long produced;
        long remaining;
        final SubscriptionArbiter sa;
        final b<? extends T> source;

        public final void onComplete() {
            this.downstream.onComplete();
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

        public final void onSubscribe(d dVar) {
            this.sa.setSubscription(dVar);
        }

        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        public final void onError(Throwable th) {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.test(th)) {
                    this.downstream.onError(th);
                } else {
                    subscribeNext();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        RetrySubscriber(c<? super T> cVar, long j, Predicate<? super Throwable> predicate2, SubscriptionArbiter subscriptionArbiter, b<? extends T> bVar) {
            this.downstream = cVar;
            this.sa = subscriptionArbiter;
            this.source = bVar;
            this.predicate = predicate2;
            this.remaining = j;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        RetrySubscriber retrySubscriber = new RetrySubscriber(cVar, this.count, this.predicate, subscriptionArbiter, this.source);
        retrySubscriber.subscribeNext();
    }

    public FlowableRetryPredicate(Flowable<T> flowable, long j, Predicate<? super Throwable> predicate2) {
        super(flowable);
        this.predicate = predicate2;
        this.count = j;
    }
}