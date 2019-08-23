package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.a.c;
import org.a.d;

public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {
    final long limit;

    static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final c<? super T> downstream;
        final long limit;
        long remaining;
        d upstream;

        public final void cancel() {
            this.upstream.cancel();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.upstream.cancel();
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onNext(T t) {
            boolean z;
            if (!this.done) {
                long j = this.remaining;
                this.remaining = j - 1;
                if (j > 0) {
                    if (this.remaining == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.downstream.onNext(t);
                    if (z) {
                        this.upstream.cancel();
                        onComplete();
                    }
                }
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (this.limit == 0) {
                    dVar.cancel();
                    this.done = true;
                    EmptySubscription.complete(this.downstream);
                    return;
                }
                this.downstream.onSubscribe(this);
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                if (get() || !compareAndSet(false, true) || j < this.limit) {
                    this.upstream.request(j);
                } else {
                    this.upstream.request(Long.MAX_VALUE);
                }
            }
        }

        TakeSubscriber(c<? super T> cVar, long j) {
            this.downstream = cVar;
            this.limit = j;
            this.remaining = j;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new TakeSubscriber<Object>(cVar, this.limit));
    }

    public FlowableTake(Flowable<T> flowable, long j) {
        super(flowable);
        this.limit = j;
    }
}
