package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import org.a.b;
import org.a.c;
import org.a.d;

public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {
    final int parallelism;
    final int prefetch;
    final b<? extends T> source;

    static final class ParallelDispatcher<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        volatile boolean cancelled;
        volatile boolean done;
        final long[] emissions;
        Throwable error;
        int index;
        final int limit;
        final int prefetch;
        int produced;
        SimpleQueue<T> queue;
        final AtomicLongArray requests;
        int sourceMode;
        final AtomicInteger subscriberCount = new AtomicInteger();
        final c<? super T>[] subscribers;
        d upstream;

        final class RailSubscription implements d {
            final int j;
            final int m;

            public final void cancel() {
                if (ParallelDispatcher.this.requests.compareAndSet(this.j + this.m, 0, 1)) {
                    ParallelDispatcher.this.cancel(this.m + this.m);
                }
            }

            public final void request(long j2) {
                long j3;
                if (SubscriptionHelper.validate(j2)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.requests;
                    do {
                        j3 = atomicLongArray.get(this.j);
                        if (j3 != Long.MAX_VALUE) {
                        } else {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.j, j3, BackpressureHelper.addCap(j3, j2)));
                    if (ParallelDispatcher.this.subscriberCount.get() == this.m) {
                        ParallelDispatcher.this.drain();
                    }
                }
            }

            RailSubscription(int i, int i2) {
                this.j = i;
                this.m = i2;
            }
        }

        public final void onComplete() {
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                if (this.sourceMode == 1) {
                    drainSync();
                } else {
                    drainAsync();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void setupSubscribers() {
            c<? super T>[] cVarArr = this.subscribers;
            int length = cVarArr.length;
            int i = 0;
            while (i < length && !this.cancelled) {
                int i2 = i + 1;
                this.subscriberCount.lazySet(i2);
                cVarArr[i].onSubscribe(new RailSubscription(i, length));
                i = i2;
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainAsync() {
            SimpleQueue<T> simpleQueue = this.queue;
            c<? super T>[] cVarArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i = this.index;
            int i2 = this.produced;
            int i3 = i;
            int i4 = 1;
            while (true) {
                int i5 = 0;
                int i6 = i2;
                int i7 = 0;
                while (!this.cancelled) {
                    boolean z = this.done;
                    if (z) {
                        Throwable th = this.error;
                        if (th != null) {
                            simpleQueue.clear();
                            int length2 = cVarArr.length;
                            while (i5 < length2) {
                                cVarArr[i5].onError(th);
                                i5++;
                            }
                            return;
                        }
                    }
                    boolean isEmpty = simpleQueue.isEmpty();
                    if (!z || !isEmpty) {
                        if (!isEmpty) {
                            long j = atomicLongArray.get(i3);
                            long j2 = jArr[i3];
                            if (j == j2 || atomicLongArray.get(length + i3) != 0) {
                                i7++;
                            } else {
                                try {
                                    Object poll = simpleQueue.poll();
                                    if (poll != null) {
                                        cVarArr[i3].onNext(poll);
                                        jArr[i3] = j2 + 1;
                                        int i8 = i6 + 1;
                                        if (i8 == this.limit) {
                                            this.upstream.request((long) i8);
                                            i8 = 0;
                                        }
                                        i6 = i8;
                                        i7 = 0;
                                    }
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    Exceptions.throwIfFatal(th3);
                                    this.upstream.cancel();
                                    int length3 = cVarArr.length;
                                    while (i5 < length3) {
                                        cVarArr[i5].onError(th3);
                                        i5++;
                                    }
                                    return;
                                }
                            }
                            i3++;
                            if (i3 == length) {
                                i3 = 0;
                                continue;
                            }
                            if (i7 == length) {
                            }
                        }
                        i2 = i6;
                        int i9 = get();
                        if (i9 == i4) {
                            this.index = i3;
                            this.produced = i2;
                            i4 = addAndGet(-i4);
                            if (i4 == 0) {
                                return;
                            }
                        } else {
                            i4 = i9;
                        }
                    } else {
                        int length4 = cVarArr.length;
                        while (i5 < length4) {
                            cVarArr[i5].onComplete();
                            i5++;
                        }
                        return;
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainSync() {
            SimpleQueue<T> simpleQueue = this.queue;
            c<? super T>[] cVarArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i = this.index;
            int i2 = 1;
            while (true) {
                int i3 = 0;
                int i4 = 0;
                while (!this.cancelled) {
                    if (simpleQueue.isEmpty()) {
                        int length2 = cVarArr.length;
                        while (i3 < length2) {
                            cVarArr[i3].onComplete();
                            i3++;
                        }
                        return;
                    }
                    long j = atomicLongArray.get(i);
                    long j2 = jArr[i];
                    if (j == j2 || atomicLongArray.get(length + i) != 0) {
                        i4++;
                    } else {
                        try {
                            Object poll = simpleQueue.poll();
                            if (poll == null) {
                                int length3 = cVarArr.length;
                                while (i3 < length3) {
                                    cVarArr[i3].onComplete();
                                    i3++;
                                }
                                return;
                            }
                            cVarArr[i].onNext(poll);
                            jArr[i] = j2 + 1;
                            i4 = 0;
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            Exceptions.throwIfFatal(th2);
                            this.upstream.cancel();
                            int length4 = cVarArr.length;
                            while (i3 < length4) {
                                cVarArr[i3].onError(th2);
                                i3++;
                            }
                            return;
                        }
                    }
                    i++;
                    if (i == length) {
                        i = 0;
                        continue;
                    }
                    if (i4 == length) {
                        int i5 = get();
                        if (i5 == i2) {
                            this.index = i;
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            i2 = i5;
                        }
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void cancel(int i) {
            if (this.requests.decrementAndGet(i) == 0) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final void onNext(T t) {
            if (this.sourceMode != 0 || this.queue.offer(t)) {
                drain();
                return;
            }
            this.upstream.cancel();
            onError(new MissingBackpressureException("Queue is full?"));
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        setupSubscribers();
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        setupSubscribers();
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                setupSubscribers();
                dVar.request((long) this.prefetch);
            }
        }

        ParallelDispatcher(c<? super T>[] cVarArr, int i) {
            this.subscribers = cVarArr;
            this.prefetch = i;
            this.limit = i - (i >> 2);
            int length = cVarArr.length;
            int i2 = length + length;
            this.requests = new AtomicLongArray(i2 + 1);
            this.requests.lazySet(i2, (long) length);
            this.emissions = new long[length];
        }
    }

    public final int parallelism() {
        return this.parallelism;
    }

    public final void subscribe(c<? super T>[] cVarArr) {
        if (validate(cVarArr)) {
            this.source.subscribe(new ParallelDispatcher(cVarArr, this.prefetch));
        }
    }

    public ParallelFromPublisher(b<? extends T> bVar, int i, int i2) {
        this.source = bVar;
        this.parallelism = i;
        this.prefetch = i2;
    }
}
