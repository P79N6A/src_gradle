package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends b<? extends R>> mapper;
    final int prefetch;

    static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, d {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapInner<R> inner = new ConcatMapInner<>(this);
        final int limit;
        final Function<? super T, ? extends b<? extends R>> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        int sourceMode;
        d upstream;

        /* access modifiers changed from: package-private */
        public abstract void drain();

        /* access modifiers changed from: package-private */
        public abstract void subscribeActual();

        public final void innerComplete() {
            this.active = false;
            drain();
        }

        public final void onComplete() {
            this.done = true;
            drain();
        }

        public final void onNext(T t) {
            if (this.sourceMode == 2 || this.queue.offer(t)) {
                drain();
                return;
            }
            this.upstream.cancel();
            onError(new IllegalStateException("Queue full?!"));
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
                        subscribeActual();
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        subscribeActual();
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                subscribeActual();
                dVar.request((long) this.prefetch);
            }
        }

        BaseConcatMapSubscriber(Function<? super T, ? extends b<? extends R>> function, int i) {
            this.mapper = function;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }
    }

    static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final c<? super R> downstream;
        final boolean veryEnd;

        /* access modifiers changed from: package-private */
        public final void subscribeActual() {
            this.downstream.onSubscribe(this);
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z2 = this.done;
                        if (!z2 || this.veryEnd || ((Throwable) this.errors.get()) == null) {
                            try {
                                Object poll = this.queue.poll();
                                if (poll == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z2 && z) {
                                    Throwable terminate = this.errors.terminate();
                                    if (terminate != null) {
                                        this.downstream.onError(terminate);
                                        return;
                                    } else {
                                        this.downstream.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    try {
                                        b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(poll), "The mapper returned a null Publisher");
                                        if (this.sourceMode != 1) {
                                            int i = this.consumed + 1;
                                            if (i == this.limit) {
                                                this.consumed = 0;
                                                this.upstream.request((long) i);
                                            } else {
                                                this.consumed = i;
                                            }
                                        }
                                        if (bVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) bVar).call();
                                                if (call == null) {
                                                    continue;
                                                } else if (this.inner.isUnbounded()) {
                                                    this.downstream.onNext(call);
                                                } else {
                                                    this.active = true;
                                                    this.inner.setSubscription(new WeakScalarSubscription(call, this.inner));
                                                }
                                            } catch (Throwable th) {
                                                Exceptions.throwIfFatal(th);
                                                this.upstream.cancel();
                                                this.errors.addThrowable(th);
                                                this.downstream.onError(this.errors.terminate());
                                                return;
                                            }
                                        } else {
                                            this.active = true;
                                            bVar.subscribe(this.inner);
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        this.upstream.cancel();
                                        this.errors.addThrowable(th2);
                                        this.downstream.onError(this.errors.terminate());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.upstream.cancel();
                                this.errors.addThrowable(th3);
                                this.downstream.onError(this.errors.terminate());
                                return;
                            }
                        } else {
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                    }
                }
            }
        }

        public final void innerNext(R r) {
            this.downstream.onNext(r);
        }

        public final void request(long j) {
            this.inner.request(j);
        }

        public final void innerError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (!this.veryEnd) {
                    this.upstream.cancel();
                    this.done = true;
                }
                this.active = false;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        ConcatMapDelayed(c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function, int i, boolean z) {
            super(function, i);
            this.downstream = cVar;
            this.veryEnd = z;
        }
    }

    static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final c<? super R> downstream;
        final AtomicInteger wip = new AtomicInteger();

        /* access modifiers changed from: package-private */
        public final void subscribeActual() {
            this.downstream.onSubscribe(this);
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean z;
            if (this.wip.getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z2 = this.done;
                        try {
                            Object poll = this.queue.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                this.downstream.onComplete();
                                return;
                            } else if (!z) {
                                try {
                                    b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(poll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i = this.consumed + 1;
                                        if (i == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request((long) i);
                                        } else {
                                            this.consumed = i;
                                        }
                                    }
                                    if (bVar instanceof Callable) {
                                        try {
                                            Object call = ((Callable) bVar).call();
                                            if (call == null) {
                                                continue;
                                            } else if (!this.inner.isUnbounded()) {
                                                this.active = true;
                                                this.inner.setSubscription(new WeakScalarSubscription(call, this.inner));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.downstream.onNext(call);
                                                if (!compareAndSet(1, 0)) {
                                                    this.downstream.onError(this.errors.terminate());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            this.upstream.cancel();
                                            this.errors.addThrowable(th);
                                            this.downstream.onError(this.errors.terminate());
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        bVar.subscribe(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.upstream.cancel();
                                    this.errors.addThrowable(th2);
                                    this.downstream.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.upstream.cancel();
                            this.errors.addThrowable(th3);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                    }
                }
            }
        }

        public final void request(long j) {
            this.inner.request(j);
        }

        public final void innerError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.downstream.onError(this.errors.terminate());
                }
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        public final void innerNext(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(r);
                if (!compareAndSet(1, 0)) {
                    this.downstream.onError(this.errors.terminate());
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.inner.cancel();
                if (getAndIncrement() == 0) {
                    this.downstream.onError(this.errors.terminate());
                }
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        ConcatMapImmediate(c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function, int i) {
            super(function, i);
            this.downstream = cVar;
        }
    }

    static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final ConcatMapSupport<R> parent;
        long produced;

        public final void onComplete() {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0;
                produced(j);
            }
            this.parent.innerComplete();
        }

        public final void onSubscribe(d dVar) {
            setSubscription(dVar);
        }

        ConcatMapInner(ConcatMapSupport<R> concatMapSupport) {
            super(false);
            this.parent = concatMapSupport;
        }

        public final void onNext(R r) {
            this.produced++;
            this.parent.innerNext(r);
        }

        public final void onError(Throwable th) {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0;
                produced(j);
            }
            this.parent.innerError(th);
        }
    }

    interface ConcatMapSupport<T> {
        void innerComplete();

        void innerError(Throwable th);

        void innerNext(T t);
    }

    static final class WeakScalarSubscription<T> implements d {
        final c<? super T> downstream;
        boolean once;
        final T value;

        public final void cancel() {
        }

        public final void request(long j) {
            if (j > 0 && !this.once) {
                this.once = true;
                c<? super T> cVar = this.downstream;
                cVar.onNext(this.value);
                cVar.onComplete();
            }
        }

        WeakScalarSubscription(T t, c<? super T> cVar) {
            this.value = t;
            this.downstream = cVar;
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        if (!FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            this.source.subscribe(subscribe(cVar, this.mapper, this.prefetch, this.errorMode));
        }
    }

    public FlowableConcatMap(Flowable<T> flowable, Function<? super T, ? extends b<? extends R>> function, int i, ErrorMode errorMode2) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i;
        this.errorMode = errorMode2;
    }

    public static <T, R> c<T> subscribe(c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function, int i, ErrorMode errorMode2) {
        switch (errorMode2) {
            case BOUNDARY:
                return new ConcatMapDelayed(cVar, function, i, false);
            case END:
                return new ConcatMapDelayed(cVar, function, i, true);
            default:
                return new ConcatMapImmediate(cVar, function, i);
        }
    }
}
