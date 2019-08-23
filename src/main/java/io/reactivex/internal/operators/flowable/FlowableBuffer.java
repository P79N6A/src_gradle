package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;
import org.a.d;

public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {
    final Callable<C> bufferSupplier;
    final int size;
    final int skip;

    static final class PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, d {
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final c<? super C> downstream;
        int index;
        final int size;
        d upstream;

        public final void cancel() {
            this.upstream.cancel();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                C c2 = this.buffer;
                if (c2 != null && !c2.isEmpty()) {
                    this.downstream.onNext(c2);
                }
                this.downstream.onComplete();
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                this.upstream.request(BackpressureHelper.multiplyCap(j, (long) this.size));
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                C c2 = this.buffer;
                if (c2 == null) {
                    try {
                        c2 = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                        this.buffer = c2;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cancel();
                        onError(th);
                        return;
                    }
                }
                c2.add(t);
                int i = this.index + 1;
                if (i == this.size) {
                    this.index = 0;
                    this.buffer = null;
                    this.downstream.onNext(c2);
                    return;
                }
                this.index = i;
            }
        }

        PublisherBufferExactSubscriber(c<? super C> cVar, int i, Callable<C> callable) {
            this.downstream = cVar;
            this.size = i;
            this.bufferSupplier = callable;
        }
    }

    static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, BooleanSupplier, d {
        private static final long serialVersionUID = -7370244972039324525L;
        final Callable<C> bufferSupplier;
        final ArrayDeque<C> buffers = new ArrayDeque<>();
        volatile boolean cancelled;
        boolean done;
        final c<? super C> downstream;
        int index;
        final AtomicBoolean once = new AtomicBoolean();
        long produced;
        final int size;
        final int skip;
        d upstream;

        public final boolean getAsBoolean() {
            return this.cancelled;
        }

        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                long j = this.produced;
                if (j != 0) {
                    BackpressureHelper.produced(this, j);
                }
                QueueDrainHelper.postComplete(this.downstream, this.buffers, this, this);
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffers.clear();
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            if (!this.done) {
                ArrayDeque<C> arrayDeque = this.buffers;
                int i = this.index;
                int i2 = i + 1;
                if (i == 0) {
                    try {
                        arrayDeque.offer((Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer"));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cancel();
                        onError(th);
                        return;
                    }
                }
                Collection collection = (Collection) arrayDeque.peek();
                if (collection != null && collection.size() + 1 == this.size) {
                    arrayDeque.poll();
                    collection.add(t);
                    this.produced++;
                    this.downstream.onNext(collection);
                }
                Iterator<C> it2 = arrayDeque.iterator();
                while (it2.hasNext()) {
                    ((Collection) it2.next()).add(t);
                }
                if (i2 == this.skip) {
                    i2 = 0;
                }
                this.index = i2;
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                if (!QueueDrainHelper.postCompleteRequest(j, this.downstream, this.buffers, this, this)) {
                    if (this.once.get() || !this.once.compareAndSet(false, true)) {
                        this.upstream.request(BackpressureHelper.multiplyCap((long) this.skip, j));
                    } else {
                        this.upstream.request(BackpressureHelper.addCap((long) this.size, BackpressureHelper.multiplyCap((long) this.skip, j - 1)));
                    }
                }
            }
        }

        PublisherBufferOverlappingSubscriber(c<? super C> cVar, int i, int i2, Callable<C> callable) {
            this.downstream = cVar;
            this.size = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }
    }

    static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5616169793639412593L;
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final c<? super C> downstream;
        int index;
        final int size;
        final int skip;
        d upstream;

        public final void cancel() {
            this.upstream.cancel();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                C c2 = this.buffer;
                this.buffer = null;
                if (c2 != null) {
                    this.downstream.onNext(c2);
                }
                this.downstream.onComplete();
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffer = null;
            this.downstream.onError(th);
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.upstream.request(BackpressureHelper.multiplyCap((long) this.skip, j));
                } else {
                    this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(j, (long) this.size), BackpressureHelper.multiplyCap((long) (this.skip - this.size), j - 1)));
                }
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                C c2 = this.buffer;
                int i = this.index;
                int i2 = i + 1;
                if (i == 0) {
                    try {
                        c2 = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                        this.buffer = c2;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cancel();
                        onError(th);
                        return;
                    }
                }
                if (c2 != null) {
                    c2.add(t);
                    if (c2.size() == this.size) {
                        this.buffer = null;
                        this.downstream.onNext(c2);
                    }
                }
                if (i2 == this.skip) {
                    i2 = 0;
                }
                this.index = i2;
            }
        }

        PublisherBufferSkipSubscriber(c<? super C> cVar, int i, int i2, Callable<C> callable) {
            this.downstream = cVar;
            this.size = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }
    }

    public final void subscribeActual(c<? super C> cVar) {
        if (this.size == this.skip) {
            this.source.subscribe((FlowableSubscriber<? super T>) new PublisherBufferExactSubscriber<Object>(cVar, this.size, this.bufferSupplier));
        } else if (this.skip > this.size) {
            this.source.subscribe((FlowableSubscriber<? super T>) new PublisherBufferSkipSubscriber<Object>(cVar, this.size, this.skip, this.bufferSupplier));
        } else {
            this.source.subscribe((FlowableSubscriber<? super T>) new PublisherBufferOverlappingSubscriber<Object>(cVar, this.size, this.skip, this.bufferSupplier));
        }
    }

    public FlowableBuffer(Flowable<T> flowable, int i, int i2, Callable<C> callable) {
        super(flowable);
        this.size = i;
        this.skip = i2;
        this.bufferSupplier = callable;
    }
}
