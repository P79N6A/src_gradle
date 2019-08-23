package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableSampleTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean emitLast;
    final long period;
    final Scheduler scheduler;
    final TimeUnit unit;

    static final class SampleTimedEmitLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip = new AtomicInteger(1);

        /* access modifiers changed from: package-private */
        public final void complete() {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        public final void run() {
            if (this.wip.incrementAndGet() == 2) {
                emit();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }

        SampleTimedEmitLast(c<? super T> cVar, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(cVar, j, timeUnit, scheduler);
        }
    }

    static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public final void run() {
            emit();
        }

        /* access modifiers changed from: package-private */
        public final void complete() {
            this.downstream.onComplete();
        }

        SampleTimedNoLast(c<? super T> cVar, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(cVar, j, timeUnit, scheduler);
        }
    }

    static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, Runnable, d {
        private static final long serialVersionUID = -3517602651313910099L;
        final c<? super T> downstream;
        final long period;
        final AtomicLong requested = new AtomicLong();
        final Scheduler scheduler;
        final SequentialDisposable timer = new SequentialDisposable();
        final TimeUnit unit;
        d upstream;

        /* access modifiers changed from: package-private */
        public abstract void complete();

        /* access modifiers changed from: package-private */
        public void cancelTimer() {
            DisposableHelper.dispose(this.timer);
        }

        public void onComplete() {
            cancelTimer();
            complete();
        }

        public void cancel() {
            cancelTimer();
            this.upstream.cancel();
        }

        /* access modifiers changed from: package-private */
        public void emit() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(andSet);
                    BackpressureHelper.produced(this.requested, 1);
                    return;
                }
                cancel();
                this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
            }
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onError(Throwable th) {
            cancelTimer();
            this.downstream.onError(th);
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
            }
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                this.timer.replace(this.scheduler.schedulePeriodicallyDirect(this, this.period, this.period, this.unit));
                dVar.request(Long.MAX_VALUE);
            }
        }

        SampleTimedSubscriber(c<? super T> cVar, long j, TimeUnit timeUnit, Scheduler scheduler2) {
            this.downstream = cVar;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = scheduler2;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(cVar);
        if (this.emitLast) {
            Flowable flowable = this.source;
            SampleTimedEmitLast sampleTimedEmitLast = new SampleTimedEmitLast(serializedSubscriber, this.period, this.unit, this.scheduler);
            flowable.subscribe((FlowableSubscriber<? super T>) sampleTimedEmitLast);
            return;
        }
        Flowable flowable2 = this.source;
        SampleTimedNoLast sampleTimedNoLast = new SampleTimedNoLast(serializedSubscriber, this.period, this.unit, this.scheduler);
        flowable2.subscribe((FlowableSubscriber<? super T>) sampleTimedNoLast);
    }

    public FlowableSampleTimed(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler2, boolean z) {
        super(flowable);
        this.period = j;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
        this.emitLast = z;
    }
}
