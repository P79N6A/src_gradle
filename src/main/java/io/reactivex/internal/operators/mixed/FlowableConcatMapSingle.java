package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final int prefetch;
    final Flowable<T> source;

    static final class ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final c<? super R> downstream;
        long emitted;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapSingleObserver<R> inner = new ConcatMapSingleObserver<>(this);
        R item;
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        final int prefetch;
        final SimplePlainQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        volatile int state;
        d upstream;

        static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final ConcatMapSingleSubscriber<?, R> parent;

            /* access modifiers changed from: package-private */
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            ConcatMapSingleObserver(ConcatMapSingleSubscriber<?, R> concatMapSingleSubscriber) {
                this.parent = concatMapSingleSubscriber;
            }

            public final void onError(Throwable th) {
                this.parent.innerError(th);
            }

            public final void onSuccess(R r) {
                this.parent.innerSuccess(r);
            }
        }

        public final void onComplete() {
            this.done = true;
            drain();
        }

        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                c<? super R> cVar = this.downstream;
                ErrorMode errorMode2 = this.errorMode;
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicLong atomicLong = this.requested;
                int i = this.prefetch - (this.prefetch >> 1);
                int i2 = 1;
                while (true) {
                    if (this.cancelled) {
                        simplePlainQueue.clear();
                        this.item = null;
                    } else {
                        int i3 = this.state;
                        if (atomicThrowable.get() == null || !(errorMode2 == ErrorMode.IMMEDIATE || (errorMode2 == ErrorMode.BOUNDARY && i3 == 0))) {
                            if (i3 == 0) {
                                boolean z2 = this.done;
                                Object poll = simplePlainQueue.poll();
                                if (poll == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z2 && z) {
                                    Throwable terminate = atomicThrowable.terminate();
                                    if (terminate == null) {
                                        cVar.onComplete();
                                        return;
                                    } else {
                                        cVar.onError(terminate);
                                        return;
                                    }
                                } else if (!z) {
                                    int i4 = this.consumed + 1;
                                    if (i4 == i) {
                                        this.consumed = 0;
                                        this.upstream.request((long) i);
                                    } else {
                                        this.consumed = i4;
                                    }
                                    try {
                                        SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.mapper.apply(poll), "The mapper returned a null SingleSource");
                                        this.state = 1;
                                        singleSource.subscribe(this.inner);
                                    } catch (Throwable th) {
                                        Exceptions.throwIfFatal(th);
                                        this.upstream.cancel();
                                        simplePlainQueue.clear();
                                        atomicThrowable.addThrowable(th);
                                        cVar.onError(atomicThrowable.terminate());
                                        return;
                                    }
                                }
                            } else if (i3 == 2) {
                                long j = this.emitted;
                                if (j != atomicLong.get()) {
                                    R r = this.item;
                                    this.item = null;
                                    cVar.onNext(r);
                                    this.emitted = j + 1;
                                    this.state = 0;
                                }
                            }
                        }
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
                simplePlainQueue.clear();
                this.item = null;
                cVar.onError(atomicThrowable.terminate());
            }
        }

        /* access modifiers changed from: package-private */
        public final void innerSuccess(R r) {
            this.item = r;
            this.state = 2;
            drain();
        }

        public final void request(long j) {
            BackpressureHelper.add(this.requested, j);
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void innerError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (this.errorMode != ErrorMode.END) {
                    this.upstream.cancel();
                }
                this.state = 0;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    this.inner.dispose();
                }
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onNext(T t) {
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                onError(new MissingBackpressureException("queue full?!"));
                return;
            }
            drain();
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request((long) this.prefetch);
            }
        }

        ConcatMapSingleSubscriber(c<? super R> cVar, Function<? super T, ? extends SingleSource<? extends R>> function, int i, ErrorMode errorMode2) {
            this.downstream = cVar;
            this.mapper = function;
            this.prefetch = i;
            this.errorMode = errorMode2;
            this.queue = new SpscArrayQueue(i);
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new ConcatMapSingleSubscriber<Object>(cVar, this.mapper, this.prefetch, this.errorMode));
    }

    public FlowableConcatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, ErrorMode errorMode2, int i) {
        this.source = flowable;
        this.mapper = function;
        this.errorMode = errorMode2;
        this.prefetch = i;
    }
}
