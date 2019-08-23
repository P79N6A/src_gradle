package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import org.a.c;
import org.a.d;

public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final TimeUnit unit;

    static final class DelaySubscriber<T> implements FlowableSubscriber<T>, d {
        final long delay;
        final boolean delayError;
        final c<? super T> downstream;
        final TimeUnit unit;
        d upstream;
        final Scheduler.Worker w;

        final class OnComplete implements Runnable {
            public final void run() {
                try {
                    DelaySubscriber.this.downstream.onComplete();
                } finally {
                    DelaySubscriber.this.w.dispose();
                }
            }

            OnComplete() {
            }
        }

        final class OnError implements Runnable {
            private final Throwable t;

            public final void run() {
                try {
                    DelaySubscriber.this.downstream.onError(this.t);
                } finally {
                    DelaySubscriber.this.w.dispose();
                }
            }

            OnError(Throwable th) {
                this.t = th;
            }
        }

        final class OnNext implements Runnable {
            private final T t;

            public final void run() {
                DelaySubscriber.this.downstream.onNext(this.t);
            }

            OnNext(T t2) {
                this.t = t2;
            }
        }

        public final void cancel() {
            this.upstream.cancel();
            this.w.dispose();
        }

        public final void onComplete() {
            this.w.schedule(new OnComplete(), this.delay, this.unit);
        }

        public final void request(long j) {
            this.upstream.request(j);
        }

        public final void onNext(T t) {
            this.w.schedule(new OnNext(t), this.delay, this.unit);
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            long j;
            Scheduler.Worker worker = this.w;
            OnError onError = new OnError(th);
            if (this.delayError) {
                j = this.delay;
            } else {
                j = 0;
            }
            worker.schedule(onError, j, this.unit);
        }

        DelaySubscriber(c<? super T> cVar, long j, TimeUnit timeUnit, Scheduler.Worker worker, boolean z) {
            this.downstream = cVar;
            this.delay = j;
            this.unit = timeUnit;
            this.w = worker;
            this.delayError = z;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        SerializedSubscriber serializedSubscriber;
        if (this.delayError) {
            serializedSubscriber = cVar;
        } else {
            serializedSubscriber = new SerializedSubscriber(cVar);
        }
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        Flowable flowable = this.source;
        DelaySubscriber delaySubscriber = new DelaySubscriber(serializedSubscriber, this.delay, this.unit, createWorker, this.delayError);
        flowable.subscribe((FlowableSubscriber<? super T>) delaySubscriber);
    }

    public FlowableDelay(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler2, boolean z) {
        super(flowable);
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
        this.delayError = z;
    }
}
