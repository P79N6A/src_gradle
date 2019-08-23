package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    final AtomicReference<c<? super T>> downstream;
    boolean enableOperatorFusion;
    Throwable error;
    final AtomicReference<Runnable> onTerminate;
    final AtomicBoolean once;
    final SpscLinkedArrayQueue<T> queue;
    final AtomicLong requested;
    final BasicIntQueueSubscription<T> wip;

    final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public final void clear() {
            UnicastProcessor.this.queue.clear();
        }

        public final boolean isEmpty() {
            return UnicastProcessor.this.queue.isEmpty();
        }

        @Nullable
        public final T poll() {
            return UnicastProcessor.this.queue.poll();
        }

        public final void cancel() {
            if (!UnicastProcessor.this.cancelled) {
                UnicastProcessor.this.cancelled = true;
                UnicastProcessor.this.doTerminate();
                if (!UnicastProcessor.this.enableOperatorFusion && UnicastProcessor.this.wip.getAndIncrement() == 0) {
                    UnicastProcessor.this.queue.clear();
                    UnicastProcessor.this.downstream.lazySet(null);
                }
            }
        }

        UnicastQueueSubscription() {
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.enableOperatorFusion = true;
            return 2;
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(UnicastProcessor.this.requested, j);
                UnicastProcessor.this.drain();
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create() {
        return new UnicastProcessor<>(bufferSize());
    }

    /* access modifiers changed from: package-private */
    public final void doTerminate() {
        Runnable andSet = this.onTerminate.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    @Nullable
    public final Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    public final boolean hasComplete() {
        if (!this.done || this.error != null) {
            return false;
        }
        return true;
    }

    public final boolean hasSubscribers() {
        if (this.downstream.get() != null) {
            return true;
        }
        return false;
    }

    public final boolean hasThrowable() {
        if (!this.done || this.error == null) {
            return false;
        }
        return true;
    }

    public final void onComplete() {
        if (!this.done && !this.cancelled) {
            this.done = true;
            doTerminate();
            drain();
        }
    }

    /* access modifiers changed from: package-private */
    public final void drain() {
        if (this.wip.getAndIncrement() == 0) {
            int i = 1;
            c cVar = this.downstream.get();
            while (cVar == null) {
                i = this.wip.addAndGet(-i);
                if (i != 0) {
                    cVar = this.downstream.get();
                } else {
                    return;
                }
            }
            if (this.enableOperatorFusion) {
                drainFused(cVar);
            } else {
                drainRegular(cVar);
            }
        }
    }

    UnicastProcessor(int i) {
        this(i, null, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i) {
        return new UnicastProcessor<>(i);
    }

    public final void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        doTerminate();
        drain();
    }

    public final void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.done && !this.cancelled) {
            this.queue.offer(t);
            drain();
        }
    }

    public final void onSubscribe(d dVar) {
        if (this.done || this.cancelled) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.onSubscribe(this.wip);
        this.downstream.set(cVar);
        if (this.cancelled) {
            this.downstream.lazySet(null);
        } else {
            drain();
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(boolean z) {
        return new UnicastProcessor<>(bufferSize(), null, z);
    }

    /* access modifiers changed from: package-private */
    public final void drainFused(c<? super T> cVar) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        int i = 1;
        boolean z = !this.delayError;
        while (!this.cancelled) {
            boolean z2 = this.done;
            if (!z || !z2 || this.error == null) {
                cVar.onNext(null);
                if (z2) {
                    this.downstream.lazySet(null);
                    Throwable th = this.error;
                    if (th != null) {
                        cVar.onError(th);
                        return;
                    } else {
                        cVar.onComplete();
                        return;
                    }
                } else {
                    i = this.wip.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            } else {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                cVar.onError(this.error);
                return;
            }
        }
        spscLinkedArrayQueue.clear();
        this.downstream.lazySet(null);
    }

    /* access modifiers changed from: package-private */
    public final void drainRegular(c<? super T> cVar) {
        long j;
        boolean z;
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z2 = !this.delayError;
        int i = 1;
        do {
            long j2 = this.requested.get();
            long j3 = 0;
            while (true) {
                if (j2 == j3) {
                    j = j3;
                    break;
                }
                boolean z3 = this.done;
                Object poll = spscLinkedArrayQueue.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                j = j3;
                if (!checkTerminated(z2, z3, z, cVar, spscLinkedArrayQueue)) {
                    if (z) {
                        break;
                    }
                    cVar.onNext(poll);
                    j3 = 1 + j;
                } else {
                    return;
                }
            }
            c<? super T> cVar2 = cVar;
            if (j2 == j) {
                if (checkTerminated(z2, this.done, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                    return;
                }
            }
            if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                this.requested.addAndGet(-j);
            }
            i = this.wip.addAndGet(-i);
        } while (i != 0);
    }

    UnicastProcessor(int i, Runnable runnable) {
        this(i, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i, Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i, runnable);
    }

    UnicastProcessor(int i, Runnable runnable, boolean z) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i, "capacityHint"));
        this.onTerminate = new AtomicReference<>(runnable);
        this.delayError = z;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueSubscription();
        this.requested = new AtomicLong();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i, Runnable runnable, boolean z) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i, runnable, z);
    }

    /* access modifiers changed from: package-private */
    public final boolean checkTerminated(boolean z, boolean z2, boolean z3, c<? super T> cVar, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.cancelled) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            return true;
        }
        if (z2) {
            if (z && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                cVar.onError(this.error);
                return true;
            } else if (z3) {
                Throwable th = this.error;
                this.downstream.lazySet(null);
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}
