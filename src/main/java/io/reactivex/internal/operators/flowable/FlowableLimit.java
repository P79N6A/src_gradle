package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;
import org.a.d;

public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {
    final long n;

    static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 2288246011222124525L;
        final c<? super T> downstream;
        long remaining;
        d upstream;

        public final void cancel() {
            this.upstream.cancel();
        }

        public final void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0;
                this.downstream.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.remaining > 0) {
                this.remaining = 0;
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onNext(T t) {
            long j = this.remaining;
            if (j > 0) {
                long j2 = j - 1;
                this.remaining = j2;
                this.downstream.onNext(t);
                if (j2 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                if (this.remaining == 0) {
                    dVar.cancel();
                    EmptySubscription.complete(this.downstream);
                    return;
                }
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void request(long j) {
            long j2;
            long j3;
            if (SubscriptionHelper.validate(j)) {
                do {
                    j2 = get();
                    if (j2 != 0) {
                        if (j2 <= j) {
                            j3 = j2;
                        } else {
                            j3 = j;
                        }
                    }
                } while (!compareAndSet(j2, j2 - j3));
                this.upstream.request(j3);
            }
        }

        LimitSubscriber(c<? super T> cVar, long j) {
            this.downstream = cVar;
            this.remaining = j;
            lazySet(j);
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new LimitSubscriber<Object>(cVar, this.n));
    }

    public FlowableLimit(Flowable<T> flowable, long j) {
        super(flowable);
        this.n = j;
    }
}
