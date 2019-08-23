package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;
import org.a.d;

public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final BiFunction<R, ? super T, R> accumulator;
    final Callable<R> seedSupplier;

    static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -1776795561228106469L;
        final BiFunction<R, ? super T, R> accumulator;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final c<? super R> downstream;
        Throwable error;
        final int limit;
        final int prefetch;
        final SimplePlainQueue<R> queue;
        final AtomicLong requested = new AtomicLong();
        d upstream;
        R value;

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                c<? super R> cVar = this.downstream;
                SimplePlainQueue<R> simplePlainQueue = this.queue;
                int i = this.limit;
                int i2 = this.consumed;
                int i3 = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.cancelled) {
                            simplePlainQueue.clear();
                            return;
                        }
                        boolean z2 = this.done;
                        if (z2) {
                            Throwable th = this.error;
                            if (th != null) {
                                simplePlainQueue.clear();
                                cVar.onError(th);
                                return;
                            }
                        }
                        Object poll = simplePlainQueue.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2 || !z) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j2++;
                            i2++;
                            if (i2 == i) {
                                this.upstream.request((long) i);
                                i2 = 0;
                            }
                        } else {
                            cVar.onComplete();
                            return;
                        }
                    }
                    if (j2 == j && this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            simplePlainQueue.clear();
                            cVar.onError(th2);
                            return;
                        } else if (simplePlainQueue.isEmpty()) {
                            cVar.onComplete();
                            return;
                        }
                    }
                    if (j2 != 0) {
                        BackpressureHelper.produced(this.requested, j2);
                    }
                    this.consumed = i2;
                    i3 = addAndGet(-i3);
                } while (i3 != 0);
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request((long) (this.prefetch - 1));
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                try {
                    R requireNonNull = ObjectHelper.requireNonNull(this.accumulator.apply(this.value, t), "The accumulator returned a null value");
                    this.value = requireNonNull;
                    this.queue.offer(requireNonNull);
                    drain();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    onError(th);
                }
            }
        }

        ScanSeedSubscriber(c<? super R> cVar, BiFunction<R, ? super T, R> biFunction, R r, int i) {
            this.downstream = cVar;
            this.accumulator = biFunction;
            this.value = r;
            this.prefetch = i;
            this.limit = i - (i >> 2);
            this.queue = new SpscArrayQueue(i);
            this.queue.offer(r);
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        try {
            this.source.subscribe((FlowableSubscriber<? super T>) new ScanSeedSubscriber<Object>(cVar, this.accumulator, ObjectHelper.requireNonNull(this.seedSupplier.call(), "The seed supplied is null"), bufferSize()));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }

    public FlowableScanSeed(Flowable<T> flowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(flowable);
        this.accumulator = biFunction;
        this.seedSupplier = callable;
    }
}
