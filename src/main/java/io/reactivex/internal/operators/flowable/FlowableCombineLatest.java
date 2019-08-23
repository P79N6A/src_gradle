package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableMap;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableCombineLatest<T, R> extends Flowable<R> {
    @Nullable
    final b<? extends T>[] array;
    final int bufferSize;
    final Function<? super Object[], ? extends R> combiner;
    final boolean delayErrors;
    @Nullable
    final Iterable<? extends b<? extends T>> iterable;

    static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final c<? super R> downstream;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested;
        final CombineLatestInnerSubscriber<T>[] subscribers;

        public final void cancel() {
            this.cancelled = true;
            cancelAll();
        }

        public final void clear() {
            this.queue.clear();
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public final void cancelAll() {
            for (CombineLatestInnerSubscriber<T> cancel : this.subscribers) {
                cancel.cancel();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                if (this.outputFused) {
                    drainOutput();
                } else {
                    drainAsync();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainOutput() {
            c<? super R> cVar = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            int i = 1;
            while (!this.cancelled) {
                Throwable th = this.error.get();
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    cVar.onError(th);
                    return;
                }
                boolean z = this.done;
                boolean isEmpty = spscLinkedArrayQueue.isEmpty();
                if (!isEmpty) {
                    cVar.onNext(null);
                }
                if (!z || !isEmpty) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    cVar.onComplete();
                    return;
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Nullable
        public final R poll() throws Exception {
            Object poll = this.queue.poll();
            if (poll == null) {
                return null;
            }
            R requireNonNull = ObjectHelper.requireNonNull(this.combiner.apply((Object[]) this.queue.poll()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) poll).requestOne();
            return requireNonNull;
        }

        /* access modifiers changed from: package-private */
        public final void drainAsync() {
            boolean z;
            c<? super R> cVar = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            int i = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = this.done;
                    Object poll = spscLinkedArrayQueue.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!checkTerminated(z2, z, cVar, spscLinkedArrayQueue)) {
                        if (z) {
                            break;
                        }
                        try {
                            cVar.onNext(ObjectHelper.requireNonNull(this.combiner.apply((Object[]) spscLinkedArrayQueue.poll()), "The combiner returned a null value"));
                            ((CombineLatestInnerSubscriber) poll).requestOne();
                            j2++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            cancelAll();
                            ExceptionHelper.addThrowable(this.error, th);
                            cVar.onError(ExceptionHelper.terminate(this.error));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j2 != j || !checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        this.requested.addAndGet(-j2);
                    }
                    i = addAndGet(-i);
                } else {
                    return;
                }
            } while (i != 0);
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public final int requestFusion(int i) {
            boolean z = false;
            if ((i & 4) != 0) {
                return 0;
            }
            int i2 = i & 2;
            if (i2 != 0) {
                z = true;
            }
            this.outputFused = z;
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
            drain();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void innerComplete(int r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                java.lang.Object[] r0 = r2.latest     // Catch:{ all -> 0x001c }
                r3 = r0[r3]     // Catch:{ all -> 0x001c }
                r1 = 1
                if (r3 == 0) goto L_0x0015
                int r3 = r2.completedSources     // Catch:{ all -> 0x001c }
                int r3 = r3 + r1
                int r0 = r0.length     // Catch:{ all -> 0x001c }
                if (r3 != r0) goto L_0x0011
                r2.done = r1     // Catch:{ all -> 0x001c }
                goto L_0x0017
            L_0x0011:
                r2.completedSources = r3     // Catch:{ all -> 0x001c }
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                return
            L_0x0015:
                r2.done = r1     // Catch:{ all -> 0x001c }
            L_0x0017:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                r2.drain()
                return
            L_0x001c:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator.innerComplete(int):void");
        }

        /* access modifiers changed from: package-private */
        public final void innerError(int i, Throwable th) {
            if (!ExceptionHelper.addThrowable(this.error, th)) {
                RxJavaPlugins.onError(th);
            } else if (!this.delayErrors) {
                cancelAll();
                this.done = true;
                drain();
            } else {
                innerComplete(i);
            }
        }

        /* access modifiers changed from: package-private */
        public final void subscribe(b<? extends T>[] bVarArr, int i) {
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.subscribers;
            for (int i2 = 0; i2 < i && !this.done && !this.cancelled; i2++) {
                bVarArr[i2].subscribe(combineLatestInnerSubscriberArr[i2]);
            }
        }

        /* access modifiers changed from: package-private */
        public final void innerValue(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.latest;
                int i2 = this.nonEmptySources;
                if (objArr[i] == null) {
                    i2++;
                    this.nonEmptySources = i2;
                }
                objArr[i] = t;
                if (objArr.length == i2) {
                    this.queue.offer(this.subscribers[i], objArr.clone());
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                this.subscribers[i].requestOne();
            } else {
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean checkTerminated(boolean z, boolean z2, c<?> cVar, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (z) {
                if (!this.delayErrors) {
                    Throwable terminate = ExceptionHelper.terminate(this.error);
                    if (terminate != null && terminate != ExceptionHelper.TERMINATED) {
                        cancelAll();
                        spscLinkedArrayQueue.clear();
                        cVar.onError(terminate);
                        return true;
                    } else if (z2) {
                        cancelAll();
                        cVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    cancelAll();
                    Throwable terminate2 = ExceptionHelper.terminate(this.error);
                    if (terminate2 == null || terminate2 == ExceptionHelper.TERMINATED) {
                        cVar.onComplete();
                    } else {
                        cVar.onError(terminate2);
                    }
                    return true;
                }
            }
            return false;
        }

        CombineLatestCoordinator(c<? super R> cVar, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.downstream = cVar;
            this.combiner = function;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                combineLatestInnerSubscriberArr[i3] = new CombineLatestInnerSubscriber<>(this, i3, i2);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new Object[i];
            this.queue = new SpscLinkedArrayQueue<>(i2);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z;
        }
    }

    static final class CombineLatestInnerSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final CombineLatestCoordinator<T, ?> parent;
        final int prefetch;
        int produced;

        public final void cancel() {
            SubscriptionHelper.cancel(this);
        }

        public final void onComplete() {
            this.parent.innerComplete(this.index);
        }

        public final void requestOne() {
            int i = this.produced + 1;
            if (i == this.limit) {
                this.produced = 0;
                ((d) get()).request((long) i);
                return;
            }
            this.produced = i;
        }

        public final void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        public final void onNext(T t) {
            this.parent.innerValue(this.index, t);
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, (long) this.prefetch);
        }

        CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i, int i2) {
            this.parent = combineLatestCoordinator;
            this.index = i;
            this.prefetch = i2;
            this.limit = i2 - (i2 >> 2);
        }
    }

    final class SingletonArrayFunc implements Function<T, R> {
        SingletonArrayFunc() {
        }

        public final R apply(T t) throws Exception {
            return FlowableCombineLatest.this.combiner.apply(new Object[]{t});
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        int i;
        b<? extends T>[] bVarArr = this.array;
        if (bVarArr == null) {
            bVarArr = new b[8];
            try {
                Iterator it2 = (Iterator) ObjectHelper.requireNonNull(this.iterable.iterator(), "The iterator returned is null");
                i = 0;
                while (it2.hasNext()) {
                    try {
                        try {
                            b<? extends T> bVar = (b) ObjectHelper.requireNonNull(it2.next(), "The publisher returned by the iterator is null");
                            if (i == bVarArr.length) {
                                b<? extends T>[] bVarArr2 = new b[((i >> 2) + i)];
                                System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
                                bVarArr = bVarArr2;
                            }
                            bVarArr[i] = bVar;
                            i++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            EmptySubscription.error(th, cVar);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        EmptySubscription.error(th2, cVar);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, cVar);
                return;
            }
        } else {
            i = bVarArr.length;
        }
        if (i == 0) {
            EmptySubscription.complete(cVar);
        } else if (i == 1) {
            bVarArr[0].subscribe(new FlowableMap.MapSubscriber(cVar, new SingletonArrayFunc()));
        } else {
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(cVar, this.combiner, i, this.bufferSize, this.delayErrors);
            cVar.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(bVarArr, i);
        }
    }

    public FlowableCombineLatest(@NonNull Iterable<? extends b<? extends T>> iterable2, @NonNull Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.iterable = iterable2;
        this.combiner = function;
        this.bufferSize = i;
        this.delayErrors = z;
    }

    public FlowableCombineLatest(@NonNull b<? extends T>[] bVarArr, @NonNull Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.array = bVarArr;
        this.combiner = function;
        this.bufferSize = i;
        this.delayErrors = z;
    }
}
