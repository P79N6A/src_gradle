package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableTimeoutTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final b<? extends T> other;
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    static final class FallbackSubscriber<T> implements FlowableSubscriber<T> {
        final SubscriptionArbiter arbiter;
        final c<? super T> downstream;

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onSubscribe(d dVar) {
            this.arbiter.setSubscription(dVar);
        }

        FallbackSubscriber(c<? super T> cVar, SubscriptionArbiter subscriptionArbiter) {
            this.downstream = cVar;
            this.arbiter = subscriptionArbiter;
        }
    }

    static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final c<? super T> downstream;
        b<? extends T> fallback;
        final AtomicLong index = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<d> upstream = new AtomicReference<>();
        final Scheduler.Worker worker;

        public final void cancel() {
            super.cancel();
            this.worker.dispose();
        }

        public final void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                setSubscription(dVar);
            }
        }

        /* access modifiers changed from: package-private */
        public final void startTimeout(long j) {
            this.task.replace(this.worker.schedule(new TimeoutTask(j, this), this.timeout, this.unit));
        }

        public final void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.index.compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).dispose();
                    this.consumed++;
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        public final void onTimeout(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                long j2 = this.consumed;
                if (j2 != 0) {
                    produced(j2);
                }
                b<? extends T> bVar = this.fallback;
                this.fallback = null;
                bVar.subscribe(new FallbackSubscriber(this.downstream, this));
                this.worker.dispose();
            }
        }

        TimeoutFallbackSubscriber(c<? super T> cVar, long j, TimeUnit timeUnit, Scheduler.Worker worker2, b<? extends T> bVar) {
            super(true);
            this.downstream = cVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker2;
            this.fallback = bVar;
        }
    }

    static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, TimeoutSupport, d {
        private static final long serialVersionUID = 3764492702657003550L;
        final c<? super T> downstream;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<d> upstream = new AtomicReference<>();
        final Scheduler.Worker worker;

        public final void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        public final void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        /* access modifiers changed from: package-private */
        public final void startTimeout(long j) {
            this.task.replace(this.worker.schedule(new TimeoutTask(j, this), this.timeout, this.unit));
        }

        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        public final void onTimeout(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.timeoutMessage(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        TimeoutSubscriber(c<? super T> cVar, long j, TimeUnit timeUnit, Scheduler.Worker worker2) {
            this.downstream = cVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker2;
        }
    }

    interface TimeoutSupport {
        void onTimeout(long j);
    }

    static final class TimeoutTask implements Runnable {
        final long idx;
        final TimeoutSupport parent;

        public final void run() {
            this.parent.onTimeout(this.idx);
        }

        TimeoutTask(long j, TimeoutSupport timeoutSupport) {
            this.idx = j;
            this.parent = timeoutSupport;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        if (this.other == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(cVar, this.timeout, this.unit, this.scheduler.createWorker());
            cVar.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.startTimeout(0);
            this.source.subscribe((FlowableSubscriber<? super T>) timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(cVar, this.timeout, this.unit, this.scheduler.createWorker(), this.other);
        cVar.onSubscribe(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.startTimeout(0);
        this.source.subscribe((FlowableSubscriber<? super T>) timeoutFallbackSubscriber);
    }

    public FlowableTimeoutTimed(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler2, b<? extends T> bVar) {
        super(flowable);
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
        this.other = bVar;
    }
}
