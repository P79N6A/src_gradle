package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.a.c;
import org.a.d;

public final class FlowableUnsubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final Scheduler scheduler;

    static final class UnsubscribeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 1015244841293359600L;
        final c<? super T> downstream;
        final Scheduler scheduler;
        d upstream;

        final class Cancellation implements Runnable {
            public final void run() {
                UnsubscribeSubscriber.this.upstream.cancel();
            }

            Cancellation() {
            }
        }

        public final void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        public final void cancel() {
            if (compareAndSet(false, true)) {
                this.scheduler.scheduleDirect(new Cancellation());
            }
        }

        public final void request(long j) {
            this.upstream.request(j);
        }

        public final void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        public final void onNext(T t) {
            if (!get()) {
                this.downstream.onNext(t);
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        UnsubscribeSubscriber(c<? super T> cVar, Scheduler scheduler2) {
            this.downstream = cVar;
            this.scheduler = scheduler2;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new UnsubscribeSubscriber<Object>(cVar, this.scheduler));
    }

    public FlowableUnsubscribeOn(Flowable<T> flowable, Scheduler scheduler2) {
        super(flowable);
        this.scheduler = scheduler2;
    }
}
