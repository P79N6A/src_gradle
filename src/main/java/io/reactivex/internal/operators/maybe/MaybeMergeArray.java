package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.a.c;

public final class MaybeMergeArray<T> extends Flowable<T> {
    final MaybeSource<? extends T>[] sources;

    static final class ClqSimpleQueue<T> extends ConcurrentLinkedQueue<T> implements SimpleQueueWithConsumerIndex<T> {
        private static final long serialVersionUID = -4025173261791142821L;
        int consumerIndex;
        final AtomicInteger producerIndex = new AtomicInteger();

        public final int consumerIndex() {
            return this.consumerIndex;
        }

        public final void drop() {
            poll();
        }

        public final int producerIndex() {
            return this.producerIndex.get();
        }

        ClqSimpleQueue() {
        }

        @Nullable
        public final T poll() {
            T poll = super.poll();
            if (poll != null) {
                this.consumerIndex++;
            }
            return poll;
        }

        public final boolean offer(T t) {
            this.producerIndex.getAndIncrement();
            return super.offer(t);
        }

        public final boolean offer(T t, T t2) {
            throw new UnsupportedOperationException();
        }
    }

    static final class MergeMaybeObserver<T> extends BasicIntQueueSubscription<T> implements MaybeObserver<T> {
        private static final long serialVersionUID = -660395290758764731L;
        volatile boolean cancelled;
        long consumed;
        final c<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        boolean outputFused;
        final SimpleQueueWithConsumerIndex<Object> queue;
        final AtomicLong requested = new AtomicLong();
        final CompositeDisposable set = new CompositeDisposable();
        final int sourceCount;

        /* access modifiers changed from: package-private */
        public final boolean isCancelled() {
            return this.cancelled;
        }

        public final void clear() {
            this.queue.clear();
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public final void onComplete() {
            this.queue.offer(NotificationLite.COMPLETE);
            drain();
        }

        @Nullable
        public final T poll() throws Exception {
            T poll;
            do {
                poll = this.queue.poll();
            } while (poll == NotificationLite.COMPLETE);
            return poll;
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.set.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                if (this.outputFused) {
                    drainFused();
                } else {
                    drainNormal();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainFused() {
            boolean z;
            c<? super T> cVar = this.downstream;
            SimpleQueueWithConsumerIndex<Object> simpleQueueWithConsumerIndex = this.queue;
            int i = 1;
            while (!this.cancelled) {
                Throwable th = (Throwable) this.error.get();
                if (th != null) {
                    simpleQueueWithConsumerIndex.clear();
                    cVar.onError(th);
                    return;
                }
                if (simpleQueueWithConsumerIndex.producerIndex() == this.sourceCount) {
                    z = true;
                } else {
                    z = false;
                }
                if (!simpleQueueWithConsumerIndex.isEmpty()) {
                    cVar.onNext(null);
                }
                if (z) {
                    cVar.onComplete();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            simpleQueueWithConsumerIndex.clear();
        }

        /* access modifiers changed from: package-private */
        public final void drainNormal() {
            c<? super T> cVar = this.downstream;
            SimpleQueueWithConsumerIndex<Object> simpleQueueWithConsumerIndex = this.queue;
            long j = this.consumed;
            int i = 1;
            do {
                long j2 = this.requested.get();
                while (j != j2) {
                    if (!this.cancelled) {
                        if (((Throwable) this.error.get()) == null) {
                            if (simpleQueueWithConsumerIndex.consumerIndex() != this.sourceCount) {
                                Object poll = simpleQueueWithConsumerIndex.poll();
                                if (poll == null) {
                                    break;
                                } else if (poll != NotificationLite.COMPLETE) {
                                    cVar.onNext(poll);
                                    j++;
                                }
                            } else {
                                cVar.onComplete();
                                return;
                            }
                        } else {
                            simpleQueueWithConsumerIndex.clear();
                            cVar.onError(this.error.terminate());
                            return;
                        }
                    } else {
                        simpleQueueWithConsumerIndex.clear();
                        return;
                    }
                }
                if (j == j2) {
                    if (((Throwable) this.error.get()) != null) {
                        simpleQueueWithConsumerIndex.clear();
                        cVar.onError(this.error.terminate());
                        return;
                    }
                    while (simpleQueueWithConsumerIndex.peek() == NotificationLite.COMPLETE) {
                        simpleQueueWithConsumerIndex.drop();
                    }
                    if (simpleQueueWithConsumerIndex.consumerIndex() == this.sourceCount) {
                        cVar.onComplete();
                        return;
                    }
                }
                this.consumed = j;
                i = addAndGet(-i);
            } while (i != 0);
        }

        public final void onSubscribe(Disposable disposable) {
            this.set.add(disposable);
        }

        public final void onSuccess(T t) {
            this.queue.offer(t);
            drain();
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public final void onError(Throwable th) {
            if (this.error.addThrowable(th)) {
                this.set.dispose();
                this.queue.offer(NotificationLite.COMPLETE);
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        MergeMaybeObserver(c<? super T> cVar, int i, SimpleQueueWithConsumerIndex<Object> simpleQueueWithConsumerIndex) {
            this.downstream = cVar;
            this.sourceCount = i;
            this.queue = simpleQueueWithConsumerIndex;
        }
    }

    static final class MpscFillOnceSimpleQueue<T> extends AtomicReferenceArray<T> implements SimpleQueueWithConsumerIndex<T> {
        private static final long serialVersionUID = -7969063454040569579L;
        int consumerIndex;
        final AtomicInteger producerIndex = new AtomicInteger();

        public final int consumerIndex() {
            return this.consumerIndex;
        }

        public final int producerIndex() {
            return this.producerIndex.get();
        }

        public final void clear() {
            while (poll() != null) {
                if (isEmpty()) {
                    return;
                }
            }
        }

        public final void drop() {
            int i = this.consumerIndex;
            lazySet(i, null);
            this.consumerIndex = i + 1;
        }

        public final boolean isEmpty() {
            if (this.consumerIndex == producerIndex()) {
                return true;
            }
            return false;
        }

        public final T peek() {
            int i = this.consumerIndex;
            if (i == length()) {
                return null;
            }
            return get(i);
        }

        @Nullable
        public final T poll() {
            int i = this.consumerIndex;
            if (i == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.producerIndex;
            do {
                T t = get(i);
                if (t != null) {
                    this.consumerIndex = i + 1;
                    lazySet(i, null);
                    return t;
                }
            } while (atomicInteger.get() != i);
            return null;
        }

        MpscFillOnceSimpleQueue(int i) {
            super(i);
        }

        public final boolean offer(T t) {
            ObjectHelper.requireNonNull(t, "value is null");
            int andIncrement = this.producerIndex.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t);
            return true;
        }

        public final boolean offer(T t, T t2) {
            throw new UnsupportedOperationException();
        }
    }

    interface SimpleQueueWithConsumerIndex<T> extends SimpleQueue<T> {
        int consumerIndex();

        void drop();

        T peek();

        @Nullable
        T poll();

        int producerIndex();
    }

    public MaybeMergeArray(MaybeSource<? extends T>[] maybeSourceArr) {
        this.sources = maybeSourceArr;
    }

    public final void subscribeActual(c<? super T> cVar) {
        SimpleQueueWithConsumerIndex simpleQueueWithConsumerIndex;
        MaybeSource<? extends T>[] maybeSourceArr = this.sources;
        int length = maybeSourceArr.length;
        if (length <= bufferSize()) {
            simpleQueueWithConsumerIndex = new MpscFillOnceSimpleQueue(length);
        } else {
            simpleQueueWithConsumerIndex = new ClqSimpleQueue();
        }
        MergeMaybeObserver mergeMaybeObserver = new MergeMaybeObserver(cVar, length, simpleQueueWithConsumerIndex);
        cVar.onSubscribe(mergeMaybeObserver);
        AtomicThrowable atomicThrowable = mergeMaybeObserver.error;
        int length2 = maybeSourceArr.length;
        int i = 0;
        while (i < length2) {
            MaybeSource<? extends T> maybeSource = maybeSourceArr[i];
            if (!mergeMaybeObserver.isCancelled() && atomicThrowable.get() == null) {
                maybeSource.subscribe(mergeMaybeObserver);
                i++;
            } else {
                return;
            }
        }
    }
}
