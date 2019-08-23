package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;
import org.a.d;

public final class FlowableTakeLast<T> extends AbstractFlowableWithUpstream<T, T> {
    final int count;

    static final class TakeLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        volatile boolean done;
        final c<? super T> downstream;
        final AtomicLong requested = new AtomicLong();
        d upstream;
        final AtomicInteger wip = new AtomicInteger();

        public final void onComplete() {
            this.done = true;
            drain();
        }

        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (this.wip.getAndIncrement() == 0) {
                c<? super T> cVar = this.downstream;
                long j = this.requested.get();
                while (!this.cancelled) {
                    if (this.done) {
                        long j2 = 0;
                        while (j2 != j) {
                            if (!this.cancelled) {
                                Object poll = poll();
                                if (poll == null) {
                                    cVar.onComplete();
                                    return;
                                } else {
                                    cVar.onNext(poll);
                                    j2++;
                                }
                            } else {
                                return;
                            }
                        }
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            j = this.requested.addAndGet(-j2);
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            if (this.count == size()) {
                poll();
            }
            offer(t);
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        TakeLastSubscriber(c<? super T> cVar, int i) {
            this.downstream = cVar;
            this.count = i;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new TakeLastSubscriber<Object>(cVar, this.count));
    }

    public FlowableTakeLast(Flowable<T> flowable, int i) {
        super(flowable);
        this.count = i;
    }
}
