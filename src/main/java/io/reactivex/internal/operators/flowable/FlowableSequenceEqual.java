package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableSequenceEqual<T> extends Flowable<Boolean> {
    final BiPredicate<? super T, ? super T> comparer;
    final b<? extends T> first;
    final int prefetch;
    final b<? extends T> second;

    static final class EqualCoordinator<T> extends DeferredScalarSubscription<Boolean> implements EqualCoordinatorHelper {
        private static final long serialVersionUID = -6178010334400373240L;
        final BiPredicate<? super T, ? super T> comparer;
        final AtomicThrowable error;
        final EqualSubscriber<T> first;
        final EqualSubscriber<T> second;
        T v1;
        T v2;
        final AtomicInteger wip = new AtomicInteger();

        public final void cancel() {
            super.cancel();
            this.first.cancel();
            this.second.cancel();
            if (this.wip.getAndIncrement() == 0) {
                this.first.clear();
                this.second.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public final void cancelAndClear() {
            this.first.cancel();
            this.first.clear();
            this.second.cancel();
            this.second.clear();
        }

        public final void drain() {
            boolean z;
            if (this.wip.getAndIncrement() == 0) {
                int i = 1;
                do {
                    SimpleQueue<T> simpleQueue = this.first.queue;
                    SimpleQueue<T> simpleQueue2 = this.second.queue;
                    if (simpleQueue != null && simpleQueue2 != null) {
                        while (!isCancelled()) {
                            if (((Throwable) this.error.get()) != null) {
                                cancelAndClear();
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                            boolean z2 = this.first.done;
                            T t = this.v1;
                            if (t == null) {
                                try {
                                    t = simpleQueue.poll();
                                    this.v1 = t;
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    cancelAndClear();
                                    this.error.addThrowable(th);
                                    this.downstream.onError(this.error.terminate());
                                    return;
                                }
                            }
                            boolean z3 = false;
                            if (t == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean z4 = this.second.done;
                            T t2 = this.v2;
                            if (t2 == null) {
                                try {
                                    t2 = simpleQueue2.poll();
                                    this.v2 = t2;
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    cancelAndClear();
                                    this.error.addThrowable(th2);
                                    this.downstream.onError(this.error.terminate());
                                    return;
                                }
                            }
                            if (t2 == null) {
                                z3 = true;
                            }
                            if (z2 && z4 && z && z3) {
                                complete(Boolean.TRUE);
                                return;
                            } else if (z2 && z4 && z != z3) {
                                cancelAndClear();
                                complete(Boolean.FALSE);
                                return;
                            } else if (!z && !z3) {
                                try {
                                    if (!this.comparer.test(t, t2)) {
                                        cancelAndClear();
                                        complete(Boolean.FALSE);
                                        return;
                                    }
                                    this.v1 = null;
                                    this.v2 = null;
                                    this.first.request();
                                    this.second.request();
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    cancelAndClear();
                                    this.error.addThrowable(th3);
                                    this.downstream.onError(this.error.terminate());
                                    return;
                                }
                            }
                        }
                        this.first.clear();
                        this.second.clear();
                        return;
                    } else if (isCancelled()) {
                        this.first.clear();
                        this.second.clear();
                        return;
                    } else if (((Throwable) this.error.get()) != null) {
                        cancelAndClear();
                        this.downstream.onError(this.error.terminate());
                        return;
                    }
                    i = this.wip.addAndGet(-i);
                } while (i != 0);
            }
        }

        public final void innerError(Throwable th) {
            if (this.error.addThrowable(th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public final void subscribe(b<? extends T> bVar, b<? extends T> bVar2) {
            bVar.subscribe(this.first);
            bVar2.subscribe(this.second);
        }

        EqualCoordinator(c<? super Boolean> cVar, int i, BiPredicate<? super T, ? super T> biPredicate) {
            super(cVar);
            this.comparer = biPredicate;
            this.first = new EqualSubscriber<>(this, i);
            this.second = new EqualSubscriber<>(this, i);
            this.error = new AtomicThrowable();
        }
    }

    interface EqualCoordinatorHelper {
        void drain();

        void innerError(Throwable th);
    }

    static final class EqualSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4804128302091633067L;
        volatile boolean done;
        final int limit;
        final EqualCoordinatorHelper parent;
        final int prefetch;
        long produced;
        volatile SimpleQueue<T> queue;
        int sourceMode;

        public final void cancel() {
            SubscriptionHelper.cancel(this);
        }

        /* access modifiers changed from: package-private */
        public final void clear() {
            SimpleQueue<T> simpleQueue = this.queue;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
        }

        public final void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public final void request() {
            if (this.sourceMode != 1) {
                long j = this.produced + 1;
                if (j >= ((long) this.limit)) {
                    this.produced = 0;
                    ((d) get()).request(j);
                    return;
                }
                this.produced = j;
            }
        }

        public final void onError(Throwable th) {
            this.parent.innerError(th);
        }

        public final void onNext(T t) {
            if (this.sourceMode != 0 || this.queue.offer(t)) {
                this.parent.drain();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(3);
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

        EqualSubscriber(EqualCoordinatorHelper equalCoordinatorHelper, int i) {
            this.parent = equalCoordinatorHelper;
            this.limit = i - (i >> 2);
            this.prefetch = i;
        }
    }

    public final void subscribeActual(c<? super Boolean> cVar) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(cVar, this.prefetch, this.comparer);
        cVar.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe(this.first, this.second);
    }

    public FlowableSequenceEqual(b<? extends T> bVar, b<? extends T> bVar2, BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.first = bVar;
        this.second = bVar2;
        this.comparer = biPredicate;
        this.prefetch = i;
    }
}
