package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends b<? extends U>> mapper;
    final int maxConcurrency;

    static final class InnerSubscriber<T, U> extends AtomicReference<d> implements FlowableSubscriber<U>, Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit = (this.bufferSize >> 2);
        final MergeSubscriber<T, U> parent;
        long produced;
        volatile SimpleQueue<U> queue;

        public final void dispose() {
            SubscriptionHelper.cancel(this);
        }

        public final boolean isDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public final void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th);
        }

        public final void onNext(U u) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u, this);
            } else {
                this.parent.drain();
            }
        }

        /* access modifiers changed from: package-private */
        public final void requestMore(long j) {
            if (this.fusionMode != 1) {
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
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                    }
                }
                dVar.request((long) this.bufferSize);
            }
        }

        InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j) {
            this.id = j;
            this.parent = mergeSubscriber;
            this.bufferSize = mergeSubscriber.bufferSize;
        }
    }

    static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, d {
        static final InnerSubscriber<?, ?>[] CANCELLED = new InnerSubscriber[0];
        static final InnerSubscriber<?, ?>[] EMPTY = new InnerSubscriber[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final c<? super U> downstream;
        final AtomicThrowable errs = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends b<? extends U>> mapper;
        final int maxConcurrency;
        volatile SimplePlainQueue<U> queue;
        final AtomicLong requested = new AtomicLong();
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<InnerSubscriber<?, ?>[]> subscribers = new AtomicReference<>();
        long uniqueId;
        d upstream;

        /* access modifiers changed from: package-private */
        public final void clearScalarQueue() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                simplePlainQueue.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                disposeAll();
                if (getAndIncrement() == 0) {
                    SimplePlainQueue<U> simplePlainQueue = this.queue;
                    if (simplePlainQueue != null) {
                        simplePlainQueue.clear();
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final SimpleQueue<U> getMainQueue() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue == null) {
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    simplePlainQueue = new SpscLinkedArrayQueue<>(this.bufferSize);
                } else {
                    simplePlainQueue = new SpscArrayQueue<>(this.maxConcurrency);
                }
                this.queue = simplePlainQueue;
            }
            return simplePlainQueue;
        }

        /* access modifiers changed from: package-private */
        public final boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            } else if (this.delayErrors || this.errs.get() == null) {
                return false;
            } else {
                clearScalarQueue();
                Throwable terminate = this.errs.terminate();
                if (terminate != ExceptionHelper.TERMINATED) {
                    this.downstream.onError(terminate);
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final void disposeAll() {
            if (((InnerSubscriber[]) this.subscribers.get()) != CANCELLED) {
                InnerSubscriber<?, ?>[] innerSubscriberArr = (InnerSubscriber[]) this.subscribers.getAndSet(CANCELLED);
                if (innerSubscriberArr != CANCELLED) {
                    for (InnerSubscriber<?, ?> dispose : innerSubscriberArr) {
                        dispose.dispose();
                    }
                    Throwable terminate = this.errs.terminate();
                    if (terminate != null && terminate != ExceptionHelper.TERMINATED) {
                        RxJavaPlugins.onError(terminate);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainLoop() {
            boolean z;
            long j;
            long j2;
            int i;
            long j3;
            boolean z2;
            InnerSubscriber[] innerSubscriberArr;
            int i2;
            int i3;
            c<? super U> cVar = this.downstream;
            int i4 = 1;
            while (!checkTerminate()) {
                SimplePlainQueue<U> simplePlainQueue = this.queue;
                long j4 = this.requested.get();
                if (j4 == Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (simplePlainQueue != null) {
                    j = 0;
                    while (true) {
                        long j5 = 0;
                        Object obj = null;
                        while (true) {
                            if (j4 == 0) {
                                break;
                            }
                            Object poll = simplePlainQueue.poll();
                            if (!checkTerminate()) {
                                if (poll == null) {
                                    obj = poll;
                                    break;
                                }
                                cVar.onNext(poll);
                                j++;
                                j5++;
                                j4--;
                                obj = poll;
                            } else {
                                return;
                            }
                        }
                        if (j5 != 0) {
                            if (z) {
                                j4 = Long.MAX_VALUE;
                            } else {
                                j4 = this.requested.addAndGet(-j5);
                            }
                        }
                        if (j4 == 0 || obj == null) {
                            break;
                        }
                    }
                } else {
                    j = 0;
                }
                boolean z3 = this.done;
                SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (!z3 || ((simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) || length != 0)) {
                    if (length != 0) {
                        i = i4;
                        long j6 = this.lastId;
                        int i5 = this.lastIndex;
                        if (length <= i5 || innerSubscriberArr2[i5].id != j6) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            int i6 = i5;
                            for (int i7 = 0; i7 < length && innerSubscriberArr2[i6].id != j6; i7++) {
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                            }
                            this.lastIndex = i6;
                            this.lastId = innerSubscriberArr2[i6].id;
                            i5 = i6;
                        }
                        int i8 = i5;
                        z2 = false;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= length) {
                                innerSubscriberArr = innerSubscriberArr2;
                                break;
                            } else if (!checkTerminate()) {
                                InnerSubscriber innerSubscriber = innerSubscriberArr2[i8];
                                Object obj2 = null;
                                while (!checkTerminate()) {
                                    SimpleQueue<U> simpleQueue = innerSubscriber.queue;
                                    if (simpleQueue != null) {
                                        innerSubscriberArr = innerSubscriberArr2;
                                        i2 = length;
                                        long j7 = 0;
                                        while (j2 != 0) {
                                            try {
                                                obj2 = simpleQueue.poll();
                                                if (obj2 == null) {
                                                    break;
                                                }
                                                cVar.onNext(obj2);
                                                if (!checkTerminate()) {
                                                    j2--;
                                                    j7++;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                Exceptions.throwIfFatal(th2);
                                                innerSubscriber.dispose();
                                                this.errs.addThrowable(th2);
                                                if (!this.delayErrors) {
                                                    this.upstream.cancel();
                                                }
                                                if (!checkTerminate()) {
                                                    removeInner(innerSubscriber);
                                                    i9++;
                                                    i3 = i2;
                                                    z2 = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j7 != 0) {
                                            if (!z) {
                                                j2 = this.requested.addAndGet(-j7);
                                            } else {
                                                j2 = Long.MAX_VALUE;
                                            }
                                            innerSubscriber.requestMore(j7);
                                        }
                                        if (!(j2 == 0 || obj2 == null)) {
                                            innerSubscriberArr2 = innerSubscriberArr;
                                            length = i2;
                                        }
                                    } else {
                                        innerSubscriberArr = innerSubscriberArr2;
                                        i2 = length;
                                    }
                                    boolean z4 = innerSubscriber.done;
                                    SimpleQueue<U> simpleQueue2 = innerSubscriber.queue;
                                    if (z4 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                        removeInner(innerSubscriber);
                                        if (!checkTerminate()) {
                                            j++;
                                            z2 = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j2 == 0) {
                                        break;
                                    }
                                    int i10 = i8 + 1;
                                    i3 = i2;
                                    if (i10 == i3) {
                                        i8 = 0;
                                    } else {
                                        i8 = i10;
                                    }
                                    i9++;
                                    length = i3;
                                    innerSubscriberArr2 = innerSubscriberArr;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i8;
                        this.lastId = innerSubscriberArr[i8].id;
                        j3 = j;
                    } else {
                        i = i4;
                        j3 = j;
                        z2 = false;
                    }
                    if (j3 != 0 && !this.cancelled) {
                        this.upstream.request(j3);
                    }
                    if (!z2) {
                        i4 = addAndGet(-i);
                        if (i4 == 0) {
                            return;
                        }
                    } else {
                        i4 = i;
                    }
                } else {
                    Throwable terminate = this.errs.terminate();
                    if (terminate != ExceptionHelper.TERMINATED) {
                        if (terminate == null) {
                            cVar.onComplete();
                            return;
                        }
                        cVar.onError(terminate);
                    }
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final SimpleQueue<U> getInnerQueue(InnerSubscriber<T, U> innerSubscriber) {
            SimpleQueue<U> simpleQueue = innerSubscriber.queue;
            if (simpleQueue != null) {
                return simpleQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
            innerSubscriber.queue = spscArrayQueue;
            return spscArrayQueue;
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
            } else if (this.errs.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean addInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                if (innerSubscriberArr == CANCELLED) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[(length + 1)];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    if (this.maxConcurrency == Integer.MAX_VALUE) {
                        dVar.request(Long.MAX_VALUE);
                        return;
                    }
                    dVar.request((long) this.maxConcurrency);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void removeInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<T, U>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (innerSubscriberArr[i2] == innerSubscriber) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerSubscriberArr2 = EMPTY;
                        } else {
                            InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[(length - 1)];
                            System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i);
                            System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                            innerSubscriberArr2 = innerSubscriberArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
        }

        public final void onNext(T t) {
            if (!this.done) {
                try {
                    b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null Publisher");
                    if (bVar instanceof Callable) {
                        try {
                            Object call = ((Callable) bVar).call();
                            if (call != null) {
                                tryEmitScalar(call);
                            } else {
                                if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                                    int i = this.scalarEmitted + 1;
                                    this.scalarEmitted = i;
                                    if (i == this.scalarLimit) {
                                        this.scalarEmitted = 0;
                                        this.upstream.request((long) this.scalarLimit);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.errs.addThrowable(th);
                            drain();
                        }
                    } else {
                        long j = this.uniqueId;
                        this.uniqueId = 1 + j;
                        InnerSubscriber innerSubscriber = new InnerSubscriber(this, j);
                        if (addInner(innerSubscriber)) {
                            bVar.subscribe(innerSubscriber);
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void tryEmitScalar(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                SimpleQueue simpleQueue = this.queue;
                if (j == 0 || (simpleQueue != null && !simpleQueue.isEmpty())) {
                    if (simpleQueue == null) {
                        simpleQueue = getMainQueue();
                    }
                    if (!simpleQueue.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i = this.scalarEmitted + 1;
                        this.scalarEmitted = i;
                        if (i == this.scalarLimit) {
                            this.scalarEmitted = 0;
                            this.upstream.request((long) this.scalarLimit);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!getMainQueue().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        /* access modifiers changed from: package-private */
        public final void innerError(InnerSubscriber<T, U> innerSubscriber, Throwable th) {
            if (this.errs.addThrowable(th)) {
                innerSubscriber.done = true;
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    for (InnerSubscriber dispose : (InnerSubscriber[]) this.subscribers.getAndSet(CANCELLED)) {
                        dispose.dispose();
                    }
                }
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* access modifiers changed from: package-private */
        public final void tryEmit(U u, InnerSubscriber<T, U> innerSubscriber) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                SimpleQueue simpleQueue = innerSubscriber.queue;
                if (simpleQueue == null) {
                    simpleQueue = new SpscArrayQueue(this.bufferSize);
                    innerSubscriber.queue = simpleQueue;
                }
                if (!simpleQueue.offer(u)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = this.requested.get();
                SimpleQueue<U> simpleQueue2 = innerSubscriber.queue;
                if (j == 0 || (simpleQueue2 != null && !simpleQueue2.isEmpty())) {
                    if (simpleQueue2 == null) {
                        simpleQueue2 = getInnerQueue(innerSubscriber);
                    }
                    if (!simpleQueue2.offer(u)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    innerSubscriber.requestMore(1);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            drainLoop();
        }

        MergeSubscriber(c<? super U> cVar, Function<? super T, ? extends b<? extends U>> function, boolean z, int i, int i2) {
            this.downstream = cVar;
            this.mapper = function;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            this.scalarLimit = Math.max(1, i >> 1);
            this.subscribers.lazySet(EMPTY);
        }
    }

    public final void subscribeActual(c<? super U> cVar) {
        if (!FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            this.source.subscribe(subscribe(cVar, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
        }
    }

    public FlowableFlatMap(Flowable<T> flowable, Function<? super T, ? extends b<? extends U>> function, boolean z, int i, int i2) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z;
        this.maxConcurrency = i;
        this.bufferSize = i2;
    }

    public static <T, U> FlowableSubscriber<T> subscribe(c<? super U> cVar, Function<? super T, ? extends b<? extends U>> function, boolean z, int i, int i2) {
        MergeSubscriber mergeSubscriber = new MergeSubscriber(cVar, function, z, i, i2);
        return mergeSubscriber;
    }
}
