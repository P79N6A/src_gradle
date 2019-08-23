package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean nonScheduledRequests;
    final Scheduler scheduler;

    static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, Runnable, d {
        private static final long serialVersionUID = 8094547886072529208L;
        final c<? super T> downstream;
        final boolean nonScheduledRequests;
        final AtomicLong requested = new AtomicLong();
        b<T> source;
        final AtomicReference<d> upstream = new AtomicReference<>();
        final Scheduler.Worker worker;

        static final class Request implements Runnable {
            final long n;
            final d upstream;

            public final void run() {
                this.upstream.request(this.n);
            }

            Request(d dVar, long j) {
                this.upstream = dVar;
                this.n = j;
            }
        }

        public final void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        public final void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        public final void run() {
            lazySet(Thread.currentThread());
            b<T> bVar = this.source;
            this.source = null;
            bVar.subscribe(this);
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                long andSet = this.requested.getAndSet(0);
                if (andSet != 0) {
                    requestUpstream(andSet, dVar);
                }
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                d dVar = this.upstream.get();
                if (dVar != null) {
                    requestUpstream(j, dVar);
                    return;
                }
                BackpressureHelper.add(this.requested, j);
                d dVar2 = this.upstream.get();
                if (dVar2 != null) {
                    long andSet = this.requested.getAndSet(0);
                    if (andSet != 0) {
                        requestUpstream(andSet, dVar2);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void requestUpstream(long j, d dVar) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                dVar.request(j);
            } else {
                this.worker.schedule(new Request(dVar, j));
            }
        }

        SubscribeOnSubscriber(c<? super T> cVar, Scheduler.Worker worker2, b<T> bVar, boolean z) {
            this.downstream = cVar;
            this.worker = worker2;
            this.source = bVar;
            this.nonScheduledRequests = !z;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(cVar, createWorker, this.source, this.nonScheduledRequests);
        cVar.onSubscribe(subscribeOnSubscriber);
        createWorker.schedule(subscribeOnSubscriber);
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler2, boolean z) {
        super(flowable);
        this.scheduler = scheduler2;
        this.nonScheduledRequests = z;
    }
}
