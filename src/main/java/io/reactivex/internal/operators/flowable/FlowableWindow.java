package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.a.a;
import org.a.c;
import org.a.d;

public final class FlowableWindow<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final long size;
    final long skip;

    static final class WindowExactSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Runnable, d {
        private static final long serialVersionUID = -2365647875069161133L;
        final int bufferSize;
        final c<? super Flowable<T>> downstream;
        long index;
        final AtomicBoolean once = new AtomicBoolean();
        final long size;
        d upstream;
        UnicastProcessor<T> window;

        public final void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        public final void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        public final void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }

        public final void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                this.upstream.request(BackpressureHelper.multiplyCap(this.size, j));
            }
        }

        public final void onNext(T t) {
            long j = this.index;
            UnicastProcessor<T> unicastProcessor = this.window;
            if (j == 0) {
                getAndIncrement();
                unicastProcessor = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessor;
                this.downstream.onNext(unicastProcessor);
            }
            long j2 = j + 1;
            unicastProcessor.onNext(t);
            if (j2 == this.size) {
                this.index = 0;
                this.window = null;
                unicastProcessor.onComplete();
                return;
            }
            this.index = j2;
        }

        WindowExactSubscriber(c<? super Flowable<T>> cVar, long j, int i) {
            super(1);
            this.downstream = cVar;
            this.size = j;
            this.bufferSize = i;
        }
    }

    static final class WindowOverlapSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Runnable, d {
        private static final long serialVersionUID = 2428527070996323976L;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final c<? super Flowable<T>> downstream;
        Throwable error;
        final AtomicBoolean firstRequest = new AtomicBoolean();
        long index;
        final AtomicBoolean once = new AtomicBoolean();
        long produced;
        final SpscLinkedArrayQueue<UnicastProcessor<T>> queue;
        final AtomicLong requested = new AtomicLong();
        final long size;
        final long skip;
        d upstream;
        final ArrayDeque<UnicastProcessor<T>> windows = new ArrayDeque<>();
        final AtomicInteger wip = new AtomicInteger();

        public final void cancel() {
            this.cancelled = true;
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        public final void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }

        public final void onComplete() {
            if (!this.done) {
                Iterator<UnicastProcessor<T>> it2 = this.windows.iterator();
                while (it2.hasNext()) {
                    it2.next().onComplete();
                }
                this.windows.clear();
                this.done = true;
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean z;
            if (this.wip.getAndIncrement() == 0) {
                c<? super Flowable<T>> cVar = this.downstream;
                SpscLinkedArrayQueue<UnicastProcessor<T>> spscLinkedArrayQueue = this.queue;
                int i = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.done;
                        UnicastProcessor unicastProcessor = (UnicastProcessor) spscLinkedArrayQueue.poll();
                        if (unicastProcessor == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!checkTerminated(z2, z, cVar, spscLinkedArrayQueue)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(unicastProcessor);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.requested.addAndGet(-j2);
                        }
                        i = this.wip.addAndGet(-i);
                    } else {
                        return;
                    }
                } while (i != 0);
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
            Iterator<UnicastProcessor<T>> it2 = this.windows.iterator();
            while (it2.hasNext()) {
                it2.next().onError(th);
            }
            this.windows.clear();
            this.error = th;
            this.done = true;
            drain();
        }

        public final void onNext(T t) {
            if (!this.done) {
                long j = this.index;
                if (j == 0 && !this.cancelled) {
                    getAndIncrement();
                    UnicastProcessor create = UnicastProcessor.create(this.bufferSize, this);
                    this.windows.offer(create);
                    this.queue.offer(create);
                    drain();
                }
                long j2 = j + 1;
                Iterator<UnicastProcessor<T>> it2 = this.windows.iterator();
                while (it2.hasNext()) {
                    it2.next().onNext(t);
                }
                long j3 = this.produced + 1;
                if (j3 == this.size) {
                    this.produced = j3 - this.skip;
                    a poll = this.windows.poll();
                    if (poll != null) {
                        poll.onComplete();
                    }
                } else {
                    this.produced = j3;
                }
                if (j2 == this.skip) {
                    this.index = 0;
                } else {
                    this.index = j2;
                }
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j));
                } else {
                    this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j - 1)));
                }
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean checkTerminated(boolean z, boolean z2, c<?> cVar, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (z) {
                Throwable th = this.error;
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    cVar.onError(th);
                    return true;
                } else if (z2) {
                    cVar.onComplete();
                    return true;
                }
            }
            return false;
        }

        WindowOverlapSubscriber(c<? super Flowable<T>> cVar, long j, long j2, int i) {
            super(1);
            this.downstream = cVar;
            this.size = j;
            this.skip = j2;
            this.queue = new SpscLinkedArrayQueue<>(i);
            this.bufferSize = i;
        }
    }

    static final class WindowSkipSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Runnable, d {
        private static final long serialVersionUID = -8792836352386833856L;
        final int bufferSize;
        final c<? super Flowable<T>> downstream;
        final AtomicBoolean firstRequest = new AtomicBoolean();
        long index;
        final AtomicBoolean once = new AtomicBoolean();
        final long size;
        final long skip;
        d upstream;
        UnicastProcessor<T> window;

        public final void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        public final void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        public final void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }

        public final void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            long j = this.index;
            UnicastProcessor<T> unicastProcessor = this.window;
            if (j == 0) {
                getAndIncrement();
                unicastProcessor = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessor;
                this.downstream.onNext(unicastProcessor);
            }
            long j2 = j + 1;
            if (unicastProcessor != null) {
                unicastProcessor.onNext(t);
            }
            if (j2 == this.size) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            if (j2 == this.skip) {
                this.index = 0;
            } else {
                this.index = j2;
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j));
                } else {
                    this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(this.size, j), BackpressureHelper.multiplyCap(this.skip - this.size, j - 1)));
                }
            }
        }

        WindowSkipSubscriber(c<? super Flowable<T>> cVar, long j, long j2, int i) {
            super(1);
            this.downstream = cVar;
            this.size = j;
            this.skip = j2;
            this.bufferSize = i;
        }
    }

    public final void subscribeActual(c<? super Flowable<T>> cVar) {
        if (this.skip == this.size) {
            this.source.subscribe((FlowableSubscriber<? super T>) new WindowExactSubscriber<Object>(cVar, this.size, this.bufferSize));
        } else if (this.skip > this.size) {
            Flowable flowable = this.source;
            WindowSkipSubscriber windowSkipSubscriber = new WindowSkipSubscriber(cVar, this.size, this.skip, this.bufferSize);
            flowable.subscribe((FlowableSubscriber<? super T>) windowSkipSubscriber);
        } else {
            Flowable flowable2 = this.source;
            WindowOverlapSubscriber windowOverlapSubscriber = new WindowOverlapSubscriber(cVar, this.size, this.skip, this.bufferSize);
            flowable2.subscribe((FlowableSubscriber<? super T>) windowOverlapSubscriber);
        }
    }

    public FlowableWindow(Flowable<T> flowable, long j, long j2, int i) {
        super(flowable);
        this.size = j;
        this.skip = j2;
        this.bufferSize = i;
    }
}
