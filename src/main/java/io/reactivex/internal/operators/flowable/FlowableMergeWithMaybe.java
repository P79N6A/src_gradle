package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableMergeWithMaybe<T> extends AbstractFlowableWithUpstream<T, T> {
    final MaybeSource<? extends T> other;

    static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean cancelled;
        int consumed;
        final c<? super T> downstream;
        long emitted;
        final AtomicThrowable error = new AtomicThrowable();
        final int limit = (this.prefetch - (this.prefetch >> 2));
        volatile boolean mainDone;
        final AtomicReference<d> mainSubscription = new AtomicReference<>();
        final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        volatile int otherState;
        final int prefetch = Flowable.bufferSize();
        volatile SimplePlainQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        T singleItem;

        static final class OtherObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithObserver<T> parent;

            public final void onComplete() {
                this.parent.otherComplete();
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            public final void onError(Throwable th) {
                this.parent.otherError(th);
            }

            public final void onSuccess(T t) {
                this.parent.otherSuccess(t);
            }
        }

        public final void onComplete() {
            this.mainDone = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void otherComplete() {
            this.otherState = 2;
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* access modifiers changed from: package-private */
        public final SimplePlainQueue<T> getOrCreateQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(Flowable.bufferSize());
            this.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        public final void cancel() {
            this.cancelled = true;
            SubscriptionHelper.cancel(this.mainSubscription);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainLoop() {
            boolean z;
            Object obj;
            boolean z2;
            c<? super T> cVar = this.downstream;
            long j = this.emitted;
            int i = this.consumed;
            int i2 = this.limit;
            int i3 = 1;
            long j2 = j;
            int i4 = 1;
            while (true) {
                long j3 = this.requested.get();
                while (j2 != j3) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    } else if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        cVar.onError(this.error.terminate());
                        return;
                    } else {
                        int i5 = this.otherState;
                        if (i5 == i3) {
                            T t = this.singleItem;
                            this.singleItem = null;
                            this.otherState = 2;
                            cVar.onNext(t);
                            j2++;
                        } else {
                            boolean z3 = this.mainDone;
                            SimplePlainQueue<T> simplePlainQueue = this.queue;
                            if (simplePlainQueue != null) {
                                obj = simplePlainQueue.poll();
                            } else {
                                obj = null;
                            }
                            if (obj == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z3 || !z2 || i5 != 2) {
                                if (z2) {
                                    break;
                                }
                                cVar.onNext(obj);
                                j2++;
                                i++;
                                if (i == i2) {
                                    this.mainSubscription.get().request((long) i2);
                                    i = 0;
                                }
                                i3 = 1;
                            } else {
                                this.queue = null;
                                cVar.onComplete();
                                return;
                            }
                        }
                    }
                }
                if (j2 == j3) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    } else if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        cVar.onError(this.error.terminate());
                        return;
                    } else {
                        boolean z4 = this.mainDone;
                        SimplePlainQueue<T> simplePlainQueue2 = this.queue;
                        if (simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z4 && z && this.otherState == 2) {
                            this.queue = null;
                            cVar.onComplete();
                            return;
                        }
                    }
                }
                this.emitted = j2;
                this.consumed = i;
                i4 = addAndGet(-i4);
                if (i4 != 0) {
                    i3 = 1;
                } else {
                    return;
                }
            }
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this.mainSubscription, dVar, (long) this.prefetch);
        }

        public final void request(long j) {
            BackpressureHelper.add(this.requested, j);
            drain();
        }

        public final void onError(Throwable th) {
            if (this.error.addThrowable(th)) {
                SubscriptionHelper.cancel(this.mainSubscription);
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* access modifiers changed from: package-private */
        public final void otherError(Throwable th) {
            if (this.error.addThrowable(th)) {
                SubscriptionHelper.cancel(this.mainSubscription);
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        MergeWithObserver(c<? super T> cVar) {
            this.downstream = cVar;
        }

        /* access modifiers changed from: package-private */
        public final void otherSuccess(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.emitted;
                if (this.requested.get() != j) {
                    this.emitted = j + 1;
                    this.downstream.onNext(t);
                    this.otherState = 2;
                } else {
                    this.singleItem = t;
                    this.otherState = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.singleItem = t;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public final void onNext(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.emitted;
                if (this.requested.get() != j) {
                    SimplePlainQueue<T> simplePlainQueue = this.queue;
                    if (simplePlainQueue == null || simplePlainQueue.isEmpty()) {
                        this.emitted = j + 1;
                        this.downstream.onNext(t);
                        int i = this.consumed + 1;
                        if (i == this.limit) {
                            this.consumed = 0;
                            this.mainSubscription.get().request((long) i);
                        } else {
                            this.consumed = i;
                        }
                    } else {
                        simplePlainQueue.offer(t);
                    }
                } else {
                    getOrCreateQueue().offer(t);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(cVar);
        cVar.onSubscribe(mergeWithObserver);
        this.source.subscribe((FlowableSubscriber<? super T>) mergeWithObserver);
        this.other.subscribe(mergeWithObserver.otherObserver);
    }

    public FlowableMergeWithMaybe(Flowable<T> flowable, MaybeSource<? extends T> maybeSource) {
        super(flowable);
        this.other = maybeSource;
    }
}
