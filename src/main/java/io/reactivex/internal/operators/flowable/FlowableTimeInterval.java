package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import org.a.c;
import org.a.d;

public final class FlowableTimeInterval<T> extends AbstractFlowableWithUpstream<T, Timed<T>> {
    final Scheduler scheduler;
    final TimeUnit unit;

    static final class TimeIntervalSubscriber<T> implements FlowableSubscriber<T>, d {
        final c<? super Timed<T>> downstream;
        long lastTime;
        final Scheduler scheduler;
        final TimeUnit unit;
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
            long now = this.scheduler.now(this.unit);
            long j = this.lastTime;
            this.lastTime = now;
            this.downstream.onNext(new Timed(t, now - j, this.unit));
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.lastTime = this.scheduler.now(this.unit);
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        TimeIntervalSubscriber(c<? super Timed<T>> cVar, TimeUnit timeUnit, Scheduler scheduler2) {
            this.downstream = cVar;
            this.scheduler = scheduler2;
            this.unit = timeUnit;
        }
    }

    public final void subscribeActual(c<? super Timed<T>> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new TimeIntervalSubscriber<Object>(cVar, this.unit, this.scheduler));
    }

    public FlowableTimeInterval(Flowable<T> flowable, TimeUnit timeUnit, Scheduler scheduler2) {
        super(flowable);
        this.scheduler = scheduler2;
        this.unit = timeUnit;
    }
}
