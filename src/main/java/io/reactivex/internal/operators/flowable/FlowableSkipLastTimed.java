package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;
import org.a.d;

public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final c<? super T> downstream;
        Throwable error;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested = new AtomicLong();
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        d upstream;

        public final void onComplete() {
            this.done = true;
            drain();
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                c<? super T> cVar = this.downstream;
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                boolean z3 = this.delayError;
                TimeUnit timeUnit = this.unit;
                Scheduler scheduler2 = this.scheduler;
                long j = this.time;
                int i = 1;
                do {
                    long j2 = this.requested.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z4 = this.done;
                        Long l = (Long) spscLinkedArrayQueue.peek();
                        if (l == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        long now = scheduler2.now(timeUnit);
                        if (z || l.longValue() <= now - j) {
                            z2 = z;
                        } else {
                            z2 = true;
                        }
                        if (!checkTerminated(z4, z2, cVar, z3)) {
                            if (z2) {
                                break;
                            }
                            spscLinkedArrayQueue.poll();
                            cVar.onNext(spscLinkedArrayQueue.poll());
                            j3++;
                        } else {
                            return;
                        }
                    }
                    if (j3 != 0) {
                        BackpressureHelper.produced(this.requested, j3);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public final void onNext(T t) {
            this.queue.offer(Long.valueOf(this.scheduler.now(this.unit)), t);
            drain();
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean checkTerminated(boolean z, boolean z2, c<? super T> cVar, boolean z3) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        cVar.onError(th);
                        return true;
                    } else if (z2) {
                        cVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        SkipLastTimedSubscriber(c<? super T> cVar, long j, TimeUnit timeUnit, Scheduler scheduler2, int i, boolean z) {
            this.downstream = cVar;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = scheduler2;
            this.queue = new SpscLinkedArrayQueue<>(i);
            this.delayError = z;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        Flowable flowable = this.source;
        SkipLastTimedSubscriber skipLastTimedSubscriber = new SkipLastTimedSubscriber(cVar, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError);
        flowable.subscribe((FlowableSubscriber<? super T>) skipLastTimedSubscriber);
    }

    public FlowableSkipLastTimed(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler2, int i, boolean z) {
        super(flowable);
        this.time = j;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
        this.bufferSize = i;
        this.delayError = z;
    }
}