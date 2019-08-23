package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableBufferTimed<T, U extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, U> {
    final Callable<U> bufferSupplier;
    final int maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    static final class BufferExactBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Disposable, Runnable, d {
        U buffer;
        final Callable<U> bufferSupplier;
        long consumerIndex;
        final int maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        Disposable timer;
        final long timespan;
        final TimeUnit unit;
        d upstream;
        final Scheduler.Worker w;

        public final boolean isDisposed() {
            return this.w.isDisposed();
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                dispose();
            }
        }

        public final void dispose() {
            synchronized (this) {
                this.buffer = null;
            }
            this.upstream.cancel();
            this.w.dispose();
        }

        public final void onComplete() {
            U u;
            synchronized (this) {
                u = this.buffer;
                this.buffer = null;
            }
            this.queue.offer(u);
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
            }
            this.w.dispose();
        }

        public final void run() {
            try {
                U u = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u2 = this.buffer;
                    if (u2 != null) {
                        if (this.producerIndex == this.consumerIndex) {
                            this.buffer = u;
                            fastPathOrderedEmitMax(u2, false, this);
                        }
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
            }
        }

        public final void request(long j) {
            requested(j);
        }

        public final void onError(Throwable th) {
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
            this.w.dispose();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r7.restartTimerOnMaxSize == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r7.timer.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
            fastPathOrderedEmitMax(r0, false, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r8 = (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7.bufferSupplier.call(), "The supplied buffer is null");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r7.buffer = r8;
            r7.consumerIndex++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
            if (r7.restartTimerOnMaxSize == false) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
            r7.timer = r7.w.schedulePeriodically(r7, r7.timespan, r7.timespan, r7.unit);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r8);
            cancel();
            r7.downstream.onError(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U r0 = r7.buffer     // Catch:{ all -> 0x0068 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r7)     // Catch:{ all -> 0x0068 }
                return
            L_0x0007:
                r0.add(r8)     // Catch:{ all -> 0x0068 }
                int r8 = r0.size()     // Catch:{ all -> 0x0068 }
                int r1 = r7.maxSize     // Catch:{ all -> 0x0068 }
                if (r8 >= r1) goto L_0x0014
                monitor-exit(r7)     // Catch:{ all -> 0x0068 }
                return
            L_0x0014:
                r8 = 0
                r7.buffer = r8     // Catch:{ all -> 0x0068 }
                long r1 = r7.producerIndex     // Catch:{ all -> 0x0068 }
                r3 = 1
                long r1 = r1 + r3
                r7.producerIndex = r1     // Catch:{ all -> 0x0068 }
                monitor-exit(r7)     // Catch:{ all -> 0x0068 }
                boolean r8 = r7.restartTimerOnMaxSize
                if (r8 == 0) goto L_0x0028
                io.reactivex.disposables.Disposable r8 = r7.timer
                r8.dispose()
            L_0x0028:
                r8 = 0
                r7.fastPathOrderedEmitMax(r0, r8, r7)
                java.util.concurrent.Callable<U> r8 = r7.bufferSupplier     // Catch:{ Throwable -> 0x005b }
                java.lang.Object r8 = r8.call()     // Catch:{ Throwable -> 0x005b }
                java.lang.String r0 = "The supplied buffer is null"
                java.lang.Object r8 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, (java.lang.String) r0)     // Catch:{ Throwable -> 0x005b }
                java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ Throwable -> 0x005b }
                monitor-enter(r7)
                r7.buffer = r8     // Catch:{ all -> 0x0058 }
                long r0 = r7.consumerIndex     // Catch:{ all -> 0x0058 }
                r8 = 0
                long r0 = r0 + r3
                r7.consumerIndex = r0     // Catch:{ all -> 0x0058 }
                monitor-exit(r7)     // Catch:{ all -> 0x0058 }
                boolean r8 = r7.restartTimerOnMaxSize
                if (r8 == 0) goto L_0x0057
                io.reactivex.Scheduler$Worker r0 = r7.w
                long r2 = r7.timespan
                long r4 = r7.timespan
                java.util.concurrent.TimeUnit r6 = r7.unit
                r1 = r7
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodically(r1, r2, r4, r6)
                r7.timer = r8
            L_0x0057:
                return
            L_0x0058:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0058 }
                throw r8
            L_0x005b:
                r8 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r8)
                r7.cancel()
                org.a.c r0 = r7.downstream
                r0.onError(r8)
                return
            L_0x0068:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0068 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferExactBoundedSubscriber.onNext(java.lang.Object):void");
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    this.buffer = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    this.timer = this.w.schedulePeriodically(this, this.timespan, this.timespan, this.unit);
                    dVar.request(Long.MAX_VALUE);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.w.dispose();
                    dVar.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        public final boolean accept(c<? super U> cVar, U u) {
            cVar.onNext(u);
            return true;
        }

        BufferExactBoundedSubscriber(c<? super U> cVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, Scheduler.Worker worker) {
            super(cVar, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j;
            this.unit = timeUnit;
            this.maxSize = i;
            this.restartTimerOnMaxSize = z;
            this.w = worker;
        }
    }

    static final class BufferExactUnboundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Disposable, Runnable, d {
        U buffer;
        final Callable<U> bufferSupplier;
        final Scheduler scheduler;
        final AtomicReference<Disposable> timer = new AtomicReference<>();
        final long timespan;
        final TimeUnit unit;
        d upstream;

        public final void dispose() {
            cancel();
        }

        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            DisposableHelper.dispose(this.timer);
        }

        public final boolean isDisposed() {
            if (this.timer.get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
            if (enter() == false) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r4.queue, r4.downstream, false, null, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
            r4.queue.offer(r0);
            r4.done = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onComplete() {
            /*
                r4 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r4.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                monitor-enter(r4)
                U r0 = r4.buffer     // Catch:{ all -> 0x0027 }
                if (r0 != 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x0027 }
                return
            L_0x000c:
                r1 = 0
                r4.buffer = r1     // Catch:{ all -> 0x0027 }
                monitor-exit(r4)     // Catch:{ all -> 0x0027 }
                io.reactivex.internal.fuseable.SimplePlainQueue r2 = r4.queue
                r2.offer(r0)
                r0 = 1
                r4.done = r0
                boolean r0 = r4.enter()
                if (r0 == 0) goto L_0x0026
                io.reactivex.internal.fuseable.SimplePlainQueue r0 = r4.queue
                org.a.c r2 = r4.downstream
                r3 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r0, r2, r3, r1, r4)
            L_0x0026:
                return
            L_0x0027:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0027 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferExactUnboundedSubscriber.onComplete():void");
        }

        public final void run() {
            try {
                U u = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u2 = this.buffer;
                    if (u2 != null) {
                        this.buffer = u;
                        fastPathEmitMax(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
            }
        }

        public final void request(long j) {
            requested(j);
        }

        public final void onNext(T t) {
            synchronized (this) {
                U u = this.buffer;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        public final void onError(Throwable th) {
            DisposableHelper.dispose(this.timer);
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    this.buffer = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    if (!this.cancelled) {
                        dVar.request(Long.MAX_VALUE);
                        Disposable schedulePeriodicallyDirect = this.scheduler.schedulePeriodicallyDirect(this, this.timespan, this.timespan, this.unit);
                        if (!this.timer.compareAndSet(null, schedulePeriodicallyDirect)) {
                            schedulePeriodicallyDirect.dispose();
                        }
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        public final boolean accept(c<? super U> cVar, U u) {
            this.downstream.onNext(u);
            return true;
        }

        BufferExactUnboundedSubscriber(c<? super U> cVar, Callable<U> callable, long j, TimeUnit timeUnit, Scheduler scheduler2) {
            super(cVar, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j;
            this.unit = timeUnit;
            this.scheduler = scheduler2;
        }
    }

    static final class BufferSkipBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Runnable, d {
        final Callable<U> bufferSupplier;
        final List<U> buffers = new LinkedList();
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        d upstream;
        final Scheduler.Worker w;

        final class RemoveFromBuffer implements Runnable {
            private final U buffer;

            public final void run() {
                synchronized (BufferSkipBoundedSubscriber.this) {
                    BufferSkipBoundedSubscriber.this.buffers.remove(this.buffer);
                }
                BufferSkipBoundedSubscriber.this.fastPathOrderedEmitMax(this.buffer, false, BufferSkipBoundedSubscriber.this.w);
            }

            RemoveFromBuffer(U u) {
                this.buffer = u;
            }
        }

        /* access modifiers changed from: package-private */
        public final void clear() {
            synchronized (this) {
                this.buffers.clear();
            }
        }

        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.w.dispose();
            clear();
        }

        public final void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList<>(this.buffers);
                this.buffers.clear();
            }
            for (Collection offer : arrayList) {
                this.queue.offer(offer);
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this.w, this);
            }
        }

        public final void run() {
            if (!this.cancelled) {
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    synchronized (this) {
                        if (!this.cancelled) {
                            this.buffers.add(collection);
                            this.w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                        }
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    this.downstream.onError(th);
                }
            }
        }

        public final void request(long j) {
            requested(j);
        }

        public final void onError(Throwable th) {
            this.done = true;
            this.w.dispose();
            clear();
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            synchronized (this) {
                for (U add : this.buffers) {
                    add.add(t);
                }
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.buffers.add(collection);
                    this.downstream.onSubscribe(this);
                    dVar.request(Long.MAX_VALUE);
                    this.w.schedulePeriodically(this, this.timeskip, this.timeskip, this.unit);
                    this.w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.w.dispose();
                    dVar.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        public final boolean accept(c<? super U> cVar, U u) {
            cVar.onNext(u);
            return true;
        }

        BufferSkipBoundedSubscriber(c<? super U> cVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(cVar, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j;
            this.timeskip = j2;
            this.unit = timeUnit;
            this.w = worker;
        }
    }

    public final void subscribeActual(c<? super U> cVar) {
        if (this.timespan == this.timeskip && this.maxSize == Integer.MAX_VALUE) {
            Flowable flowable = this.source;
            BufferExactUnboundedSubscriber bufferExactUnboundedSubscriber = new BufferExactUnboundedSubscriber(new SerializedSubscriber(cVar), this.bufferSupplier, this.timespan, this.unit, this.scheduler);
            flowable.subscribe((FlowableSubscriber<? super T>) bufferExactUnboundedSubscriber);
            return;
        }
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        if (this.timespan == this.timeskip) {
            Flowable flowable2 = this.source;
            BufferExactBoundedSubscriber bufferExactBoundedSubscriber = new BufferExactBoundedSubscriber(new SerializedSubscriber(cVar), this.bufferSupplier, this.timespan, this.unit, this.maxSize, this.restartTimerOnMaxSize, createWorker);
            flowable2.subscribe((FlowableSubscriber<? super T>) bufferExactBoundedSubscriber);
            return;
        }
        Flowable flowable3 = this.source;
        BufferSkipBoundedSubscriber bufferSkipBoundedSubscriber = new BufferSkipBoundedSubscriber(new SerializedSubscriber(cVar), this.bufferSupplier, this.timespan, this.timeskip, this.unit, createWorker);
        flowable3.subscribe((FlowableSubscriber<? super T>) bufferSkipBoundedSubscriber);
    }

    public FlowableBufferTimed(Flowable<T> flowable, long j, long j2, TimeUnit timeUnit, Scheduler scheduler2, Callable<U> callable, int i, boolean z) {
        super(flowable);
        this.timespan = j;
        this.timeskip = j2;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
        this.bufferSupplier = callable;
        this.maxSize = i;
        this.restartTimerOnMaxSize = z;
    }
}
