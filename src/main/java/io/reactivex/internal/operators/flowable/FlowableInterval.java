package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableInterval extends Flowable<Long> {
    final long initialDelay;
    final long period;
    final Scheduler scheduler;
    final TimeUnit unit;

    static final class IntervalSubscriber extends AtomicLong implements Runnable, d {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final c<? super Long> downstream;
        final AtomicReference<Disposable> resource = new AtomicReference<>();

        public final void cancel() {
            DisposableHelper.dispose(this.resource);
        }

        public final void run() {
            if (this.resource.get() != DisposableHelper.DISPOSED) {
                if (get() != 0) {
                    c<? super Long> cVar = this.downstream;
                    long j = this.count;
                    this.count = j + 1;
                    cVar.onNext(Long.valueOf(j));
                    BackpressureHelper.produced(this, 1);
                    return;
                }
                c<? super Long> cVar2 = this.downstream;
                cVar2.onError(new MissingBackpressureException("Can't deliver value " + this.count + " due to lack of requests"));
                DisposableHelper.dispose(this.resource);
            }
        }

        public final void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this.resource, disposable);
        }

        IntervalSubscriber(c<? super Long> cVar) {
            this.downstream = cVar;
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this, j);
            }
        }
    }

    public final void subscribeActual(c<? super Long> cVar) {
        IntervalSubscriber intervalSubscriber = new IntervalSubscriber(cVar);
        cVar.onSubscribe(intervalSubscriber);
        Scheduler scheduler2 = this.scheduler;
        if (scheduler2 instanceof TrampolineScheduler) {
            Scheduler.Worker createWorker = scheduler2.createWorker();
            intervalSubscriber.setResource(createWorker);
            createWorker.schedulePeriodically(intervalSubscriber, this.initialDelay, this.period, this.unit);
            return;
        }
        intervalSubscriber.setResource(scheduler2.schedulePeriodicallyDirect(intervalSubscriber, this.initialDelay, this.period, this.unit));
    }

    public FlowableInterval(long j, long j2, TimeUnit timeUnit, Scheduler scheduler2) {
        this.initialDelay = j;
        this.period = j2;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
    }
}
