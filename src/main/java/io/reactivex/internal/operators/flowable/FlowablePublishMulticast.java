package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowablePublishMulticast<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final boolean delayError;
    final int prefetch;
    final Function<? super Flowable<T>, ? extends b<? extends R>> selector;

    static final class MulticastProcessor<T> extends Flowable<T> implements FlowableSubscriber<T>, Disposable {
        static final MulticastSubscription[] EMPTY = new MulticastSubscription[0];
        static final MulticastSubscription[] TERMINATED = new MulticastSubscription[0];
        int consumed;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        final int prefetch;
        volatile SimpleQueue<T> queue;
        int sourceMode;
        final AtomicReference<MulticastSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
        final AtomicReference<d> upstream = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();

        public final boolean isDisposed() {
            if (this.upstream.get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public final void dispose() {
            SubscriptionHelper.cancel(this.upstream);
            if (this.wip.getAndIncrement() == 0) {
                SimpleQueue<T> simpleQueue = this.queue;
                if (simpleQueue != null) {
                    simpleQueue.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void completeAll() {
            for (MulticastSubscription multicastSubscription : (MulticastSubscription[]) this.subscribers.getAndSet(TERMINATED)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onComplete();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean z;
            AtomicReference<MulticastSubscription<T>[]> atomicReference;
            boolean z2;
            if (this.wip.getAndIncrement() == 0) {
                SimpleQueue<T> simpleQueue = this.queue;
                int i = this.consumed;
                int i2 = this.limit;
                if (this.sourceMode != 1) {
                    z = true;
                } else {
                    z = false;
                }
                AtomicReference<MulticastSubscription<T>[]> atomicReference2 = this.subscribers;
                MulticastSubscription[] multicastSubscriptionArr = (MulticastSubscription[]) atomicReference2.get();
                int i3 = i;
                int i4 = 1;
                while (true) {
                    int length = multicastSubscriptionArr.length;
                    if (simpleQueue == null || length == 0) {
                        atomicReference = atomicReference2;
                    } else {
                        int length2 = multicastSubscriptionArr.length;
                        long j = Long.MAX_VALUE;
                        int i5 = length;
                        long j2 = Long.MAX_VALUE;
                        int i6 = 0;
                        while (i6 < length2) {
                            MulticastSubscription multicastSubscription = multicastSubscriptionArr[i6];
                            AtomicReference<MulticastSubscription<T>[]> atomicReference3 = atomicReference2;
                            long j3 = multicastSubscription.get() - multicastSubscription.emitted;
                            if (j3 == Long.MIN_VALUE) {
                                i5--;
                            } else if (j2 > j3) {
                                j2 = j3;
                            }
                            i6++;
                            atomicReference2 = atomicReference3;
                        }
                        atomicReference = atomicReference2;
                        long j4 = 0;
                        if (i5 == 0) {
                            j2 = 0;
                        }
                        while (j2 != j4) {
                            if (isDisposed()) {
                                simpleQueue.clear();
                                return;
                            }
                            boolean z3 = this.done;
                            if (z3 && !this.delayError) {
                                Throwable th = this.error;
                                if (th != null) {
                                    errorAll(th);
                                    return;
                                }
                            }
                            try {
                                Object poll = simpleQueue.poll();
                                if (poll == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z3 || !z2) {
                                    if (z2) {
                                        break;
                                    }
                                    int length3 = multicastSubscriptionArr.length;
                                    int i7 = 0;
                                    boolean z4 = false;
                                    while (i7 < length3) {
                                        MulticastSubscription multicastSubscription2 = multicastSubscriptionArr[i7];
                                        long j5 = multicastSubscription2.get();
                                        if (j5 != Long.MIN_VALUE) {
                                            if (j5 != j) {
                                                multicastSubscription2.emitted++;
                                            }
                                            multicastSubscription2.downstream.onNext(poll);
                                        } else {
                                            z4 = true;
                                        }
                                        i7++;
                                        j = Long.MAX_VALUE;
                                    }
                                    j2--;
                                    if (z) {
                                        i3++;
                                        if (i3 == i2) {
                                            this.upstream.get().request((long) i2);
                                            i3 = 0;
                                        }
                                    }
                                    MulticastSubscription[] multicastSubscriptionArr2 = (MulticastSubscription[]) atomicReference.get();
                                    if (z4 || multicastSubscriptionArr2 != multicastSubscriptionArr) {
                                        multicastSubscriptionArr = multicastSubscriptionArr2;
                                        break;
                                    } else {
                                        j4 = 0;
                                        j = Long.MAX_VALUE;
                                    }
                                } else {
                                    Throwable th2 = this.error;
                                    if (th2 != null) {
                                        errorAll(th2);
                                        return;
                                    } else {
                                        completeAll();
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                Throwable th4 = th3;
                                Exceptions.throwIfFatal(th4);
                                SubscriptionHelper.cancel(this.upstream);
                                errorAll(th4);
                                return;
                            }
                        }
                        if (j2 == j4) {
                            if (isDisposed()) {
                                simpleQueue.clear();
                                return;
                            }
                            boolean z5 = this.done;
                            if (z5 && !this.delayError) {
                                Throwable th5 = this.error;
                                if (th5 != null) {
                                    errorAll(th5);
                                    return;
                                }
                            }
                            if (z5 && simpleQueue.isEmpty()) {
                                Throwable th6 = this.error;
                                if (th6 != null) {
                                    errorAll(th6);
                                    return;
                                } else {
                                    completeAll();
                                    return;
                                }
                            }
                        }
                    }
                    this.consumed = i3;
                    i4 = this.wip.addAndGet(-i4);
                    if (i4 != 0) {
                        if (simpleQueue == null) {
                            simpleQueue = this.queue;
                        }
                        multicastSubscriptionArr = (MulticastSubscription[]) atomicReference.get();
                        atomicReference2 = atomicReference;
                    } else {
                        return;
                    }
                }
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

        /* access modifiers changed from: package-private */
        public final boolean add(MulticastSubscription<T> multicastSubscription) {
            MulticastSubscription[] multicastSubscriptionArr;
            MulticastSubscription[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = (MulticastSubscription[]) this.subscribers.get();
                if (multicastSubscriptionArr == TERMINATED) {
                    return false;
                }
                int length = multicastSubscriptionArr.length;
                multicastSubscriptionArr2 = new MulticastSubscription[(length + 1)];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
                multicastSubscriptionArr2[length] = multicastSubscription;
            } while (!this.subscribers.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void errorAll(Throwable th) {
            for (MulticastSubscription multicastSubscription : (MulticastSubscription[]) this.subscribers.getAndSet(TERMINATED)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onError(th);
                }
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 0 || this.queue.offer(t)) {
                    drain();
                    return;
                }
                this.upstream.get().cancel();
                onError(new MissingBackpressureException());
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        QueueDrainHelper.request(dVar, this.prefetch);
                        return;
                    }
                }
                this.queue = QueueDrainHelper.createQueue(this.prefetch);
                QueueDrainHelper.request(dVar, this.prefetch);
            }
        }

        /* access modifiers changed from: package-private */
        public final void remove(MulticastSubscription<T> multicastSubscription) {
            MulticastSubscription<T>[] multicastSubscriptionArr;
            MulticastSubscription[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = (MulticastSubscription[]) this.subscribers.get();
                int length = multicastSubscriptionArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (multicastSubscriptionArr[i2] == multicastSubscription) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            multicastSubscriptionArr2 = EMPTY;
                        } else {
                            MulticastSubscription[] multicastSubscriptionArr3 = new MulticastSubscription[(length - 1)];
                            System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr3, 0, i);
                            System.arraycopy(multicastSubscriptionArr, i + 1, multicastSubscriptionArr3, i, (length - i) - 1);
                            multicastSubscriptionArr2 = multicastSubscriptionArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2));
        }

        public final void subscribeActual(c<? super T> cVar) {
            MulticastSubscription multicastSubscription = new MulticastSubscription(cVar, this);
            cVar.onSubscribe(multicastSubscription);
            if (!add(multicastSubscription)) {
                Throwable th = this.error;
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
            } else if (multicastSubscription.isCancelled()) {
                remove(multicastSubscription);
            } else {
                drain();
            }
        }

        MulticastProcessor(int i, boolean z) {
            this.prefetch = i;
            this.limit = i - (i >> 2);
            this.delayError = z;
        }
    }

    static final class MulticastSubscription<T> extends AtomicLong implements d {
        private static final long serialVersionUID = 8664815189257569791L;
        final c<? super T> downstream;
        long emitted;
        final MulticastProcessor<T> parent;

        public final boolean isCancelled() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.drain();
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.addCancel(this, j);
                this.parent.drain();
            }
        }

        MulticastSubscription(c<? super T> cVar, MulticastProcessor<T> multicastProcessor) {
            this.downstream = cVar;
            this.parent = multicastProcessor;
        }
    }

    static final class OutputCanceller<R> implements FlowableSubscriber<R>, d {
        final c<? super R> downstream;
        final MulticastProcessor<?> processor;
        d upstream;

        public final void cancel() {
            this.upstream.cancel();
            this.processor.dispose();
        }

        public final void onComplete() {
            this.downstream.onComplete();
            this.processor.dispose();
        }

        public final void onNext(R r) {
            this.downstream.onNext(r);
        }

        public final void request(long j) {
            this.upstream.request(j);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            this.processor.dispose();
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        OutputCanceller(c<? super R> cVar, MulticastProcessor<?> multicastProcessor) {
            this.downstream = cVar;
            this.processor = multicastProcessor;
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        MulticastProcessor multicastProcessor = new MulticastProcessor(this.prefetch, this.delayError);
        try {
            ((b) ObjectHelper.requireNonNull(this.selector.apply(multicastProcessor), "selector returned a null Publisher")).subscribe(new OutputCanceller(cVar, multicastProcessor));
            this.source.subscribe((FlowableSubscriber<? super T>) multicastProcessor);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }

    public FlowablePublishMulticast(Flowable<T> flowable, Function<? super Flowable<T>, ? extends b<? extends R>> function, int i, boolean z) {
        super(flowable);
        this.selector = function;
        this.prefetch = i;
        this.delayError = z;
    }
}
