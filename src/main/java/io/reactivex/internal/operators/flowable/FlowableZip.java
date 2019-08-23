package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableZip<T, R> extends Flowable<R> {
    final int bufferSize;
    final boolean delayError;
    final b<? extends T>[] sources;
    final Iterable<? extends b<? extends T>> sourcesIterable;
    final Function<? super Object[], ? extends R> zipper;

    static final class ZipCoordinator<T, R> extends AtomicInteger implements d {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final c<? super R> downstream;
        final AtomicThrowable errors;
        final AtomicLong requested;
        final ZipSubscriber<T, R>[] subscribers;
        final Function<? super Object[], ? extends R> zipper;

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
            }
        }

        /* access modifiers changed from: package-private */
        public final void cancelAll() {
            for (ZipSubscriber<T, R> cancel : this.subscribers) {
                cancel.cancel();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            Object obj;
            boolean z;
            Object obj2;
            boolean z2;
            if (getAndIncrement() == 0) {
                c<? super R> cVar = this.downstream;
                ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
                int length = zipSubscriberArr.length;
                Object[] objArr = this.current;
                int i = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j != j2) {
                        if (!this.cancelled) {
                            if (this.delayErrors || this.errors.get() == null) {
                                boolean z3 = false;
                                for (int i2 = 0; i2 < length; i2++) {
                                    ZipSubscriber<T, R> zipSubscriber = zipSubscriberArr[i2];
                                    if (objArr[i2] == null) {
                                        try {
                                            boolean z4 = zipSubscriber.done;
                                            SimpleQueue<T> simpleQueue = zipSubscriber.queue;
                                            if (simpleQueue != null) {
                                                obj2 = simpleQueue.poll();
                                            } else {
                                                obj2 = null;
                                            }
                                            if (obj2 == null) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (!z4 || !z2) {
                                                if (!z2) {
                                                    objArr[i2] = obj2;
                                                }
                                                z3 = true;
                                            } else {
                                                cancelAll();
                                                if (((Throwable) this.errors.get()) != null) {
                                                    cVar.onError(this.errors.terminate());
                                                    return;
                                                } else {
                                                    cVar.onComplete();
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            this.errors.addThrowable(th);
                                            if (!this.delayErrors) {
                                                cancelAll();
                                                cVar.onError(this.errors.terminate());
                                                return;
                                            }
                                        }
                                    }
                                }
                                if (z3) {
                                    break;
                                }
                                try {
                                    cVar.onNext(ObjectHelper.requireNonNull(this.zipper.apply(objArr.clone()), "The zipper returned a null value"));
                                    j2++;
                                    Arrays.fill(objArr, null);
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    cancelAll();
                                    this.errors.addThrowable(th2);
                                    cVar.onError(this.errors.terminate());
                                    return;
                                }
                            } else {
                                cancelAll();
                                cVar.onError(this.errors.terminate());
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j == j2) {
                        if (!this.cancelled) {
                            if (this.delayErrors || this.errors.get() == null) {
                                for (int i3 = 0; i3 < length; i3++) {
                                    ZipSubscriber<T, R> zipSubscriber2 = zipSubscriberArr[i3];
                                    if (objArr[i3] == null) {
                                        try {
                                            boolean z5 = zipSubscriber2.done;
                                            SimpleQueue<T> simpleQueue2 = zipSubscriber2.queue;
                                            if (simpleQueue2 != null) {
                                                obj = simpleQueue2.poll();
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (z5 && z) {
                                                cancelAll();
                                                if (((Throwable) this.errors.get()) != null) {
                                                    cVar.onError(this.errors.terminate());
                                                    return;
                                                } else {
                                                    cVar.onComplete();
                                                    return;
                                                }
                                            } else if (!z) {
                                                objArr[i3] = obj;
                                            }
                                        } catch (Throwable th3) {
                                            Exceptions.throwIfFatal(th3);
                                            this.errors.addThrowable(th3);
                                            if (!this.delayErrors) {
                                                cancelAll();
                                                cVar.onError(this.errors.terminate());
                                                return;
                                            }
                                        }
                                    }
                                }
                            } else {
                                cancelAll();
                                cVar.onError(this.errors.terminate());
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        for (ZipSubscriber<T, R> request : zipSubscriberArr) {
                            request.request(j2);
                        }
                        if (j != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j2);
                        }
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        public final void error(ZipSubscriber<T, R> zipSubscriber, Throwable th) {
            if (this.errors.addThrowable(th)) {
                zipSubscriber.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* access modifiers changed from: package-private */
        public final void subscribe(b<? extends T>[] bVarArr, int i) {
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            for (int i2 = 0; i2 < i && !this.cancelled && (this.delayErrors || this.errors.get() == null); i2++) {
                bVarArr[i2].subscribe(zipSubscriberArr[i2]);
            }
        }

        ZipCoordinator(c<? super R> cVar, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.downstream = cVar;
            this.zipper = function;
            this.delayErrors = z;
            ZipSubscriber<T, R>[] zipSubscriberArr = new ZipSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                zipSubscriberArr[i3] = new ZipSubscriber<>(this, i2);
            }
            this.current = new Object[i];
            this.subscribers = zipSubscriberArr;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
        }
    }

    static final class ZipSubscriber<T, R> extends AtomicReference<d> implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final ZipCoordinator<T, R> parent;
        final int prefetch;
        long produced;
        SimpleQueue<T> queue;
        int sourceMode;

        public final void cancel() {
            SubscriptionHelper.cancel(this);
        }

        public final void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public final void onError(Throwable th) {
            this.parent.error(this, th);
        }

        public final void onNext(T t) {
            if (this.sourceMode != 2) {
                this.queue.offer(t);
            }
            this.parent.drain();
        }

        public final void request(long j) {
            if (this.sourceMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((d) get()).request(j2);
                    return;
                }
                this.produced = j2;
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                dVar.request((long) this.prefetch);
            }
        }

        ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        b<? extends T>[] bVarArr;
        int i;
        b<? extends T>[] bVarArr2 = this.sources;
        if (bVarArr2 == null) {
            b<? extends T>[] bVarArr3 = new b[8];
            i = 0;
            for (b<? extends T> bVar : this.sourcesIterable) {
                if (i == bVarArr3.length) {
                    b<? extends T>[] bVarArr4 = new b[((i >> 2) + i)];
                    System.arraycopy(bVarArr3, 0, bVarArr4, 0, i);
                    bVarArr3 = bVarArr4;
                }
                bVarArr3[i] = bVar;
                i++;
            }
            bVarArr = bVarArr3;
        } else {
            bVarArr = bVarArr2;
            i = bVarArr2.length;
        }
        if (i == 0) {
            EmptySubscription.complete(cVar);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(cVar, this.zipper, i, this.bufferSize, this.delayError);
        cVar.onSubscribe(zipCoordinator);
        zipCoordinator.subscribe(bVarArr, i);
    }

    public FlowableZip(b<? extends T>[] bVarArr, Iterable<? extends b<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.sources = bVarArr;
        this.sourcesIterable = iterable;
        this.zipper = function;
        this.bufferSize = i;
        this.delayError = z;
    }
}
