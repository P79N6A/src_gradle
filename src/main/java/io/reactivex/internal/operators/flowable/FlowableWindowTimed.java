package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.a.c;
import org.a.d;

public final class FlowableWindowTimed<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final long maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    static final class WindowExactBoundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements d {
        final int bufferSize;
        long count;
        final long maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        final Scheduler scheduler;
        volatile boolean terminated;
        final SequentialDisposable timer = new SequentialDisposable();
        final long timespan;
        final TimeUnit unit;
        d upstream;
        UnicastProcessor<T> window;
        final Scheduler.Worker worker;

        static final class ConsumerIndexHolder implements Runnable {
            final long index;
            final WindowExactBoundedSubscriber<?> parent;

            public final void run() {
                WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber = this.parent;
                if (!windowExactBoundedSubscriber.cancelled) {
                    windowExactBoundedSubscriber.queue.offer(this);
                } else {
                    windowExactBoundedSubscriber.terminated = true;
                    windowExactBoundedSubscriber.dispose();
                }
                if (windowExactBoundedSubscriber.enter()) {
                    windowExactBoundedSubscriber.drainLoop();
                }
            }

            ConsumerIndexHolder(long j, WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber) {
                this.index = j;
                this.parent = windowExactBoundedSubscriber;
            }
        }

        public final void cancel() {
            this.cancelled = true;
        }

        public final void dispose() {
            DisposableHelper.dispose(this.timer);
            Scheduler.Worker worker2 = this.worker;
            if (worker2 != null) {
                worker2.dispose();
            }
        }

        public final void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            dispose();
        }

        /* access modifiers changed from: package-private */
        public final void drainLoop() {
            boolean z;
            SimplePlainQueue simplePlainQueue = this.queue;
            c cVar = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.window;
            int i = 1;
            while (!this.terminated) {
                boolean z2 = this.done;
                Object poll = simplePlainQueue.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = poll instanceof ConsumerIndexHolder;
                if (z2 && (z || z3)) {
                    this.window = null;
                    simplePlainQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        unicastProcessor.onError(th);
                    } else {
                        unicastProcessor.onComplete();
                    }
                    dispose();
                    return;
                } else if (z) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    ConsumerIndexHolder consumerIndexHolder = (ConsumerIndexHolder) poll;
                    if (this.restartTimerOnMaxSize || this.producerIndex == consumerIndexHolder.index) {
                        unicastProcessor.onComplete();
                        this.count = 0;
                        unicastProcessor = UnicastProcessor.create(this.bufferSize);
                        this.window = unicastProcessor;
                        long requested = requested();
                        if (requested != 0) {
                            cVar.onNext(unicastProcessor);
                            if (requested != Long.MAX_VALUE) {
                                produced(1);
                            }
                        } else {
                            this.window = null;
                            this.queue.clear();
                            this.upstream.cancel();
                            cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                            dispose();
                            return;
                        }
                    }
                } else {
                    unicastProcessor.onNext(NotificationLite.getValue(poll));
                    long j = this.count + 1;
                    if (j >= this.maxSize) {
                        this.producerIndex++;
                        this.count = 0;
                        unicastProcessor.onComplete();
                        long requested2 = requested();
                        if (requested2 != 0) {
                            UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                            this.window = create;
                            this.downstream.onNext(create);
                            if (requested2 != Long.MAX_VALUE) {
                                produced(1);
                            }
                            if (this.restartTimerOnMaxSize) {
                                ((Disposable) this.timer.get()).dispose();
                                this.timer.replace(this.worker.schedulePeriodically(new ConsumerIndexHolder(this.producerIndex, this), this.timespan, this.timespan, this.unit));
                            }
                            unicastProcessor = create;
                        } else {
                            this.window = null;
                            this.upstream.cancel();
                            this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                            dispose();
                            return;
                        }
                    } else {
                        this.count = j;
                    }
                }
            }
            this.upstream.cancel();
            simplePlainQueue.clear();
            dispose();
        }

        public final void request(long j) {
            requested(j);
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
            dispose();
        }

        public final void onSubscribe(d dVar) {
            Disposable disposable;
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                c cVar = this.downstream;
                cVar.onSubscribe(this);
                if (!this.cancelled) {
                    UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                    this.window = create;
                    long requested = requested();
                    if (requested != 0) {
                        cVar.onNext(create);
                        if (requested != Long.MAX_VALUE) {
                            produced(1);
                        }
                        ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                        if (this.restartTimerOnMaxSize) {
                            disposable = this.worker.schedulePeriodically(consumerIndexHolder, this.timespan, this.timespan, this.unit);
                        } else {
                            disposable = this.scheduler.schedulePeriodicallyDirect(consumerIndexHolder, this.timespan, this.timespan, this.unit);
                        }
                        if (this.timer.replace(disposable)) {
                            dVar.request(Long.MAX_VALUE);
                        }
                    } else {
                        this.cancelled = true;
                        dVar.cancel();
                        cVar.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
                    }
                }
            }
        }

        public final void onNext(T t) {
            if (!this.terminated) {
                if (fastEnter()) {
                    UnicastProcessor<T> unicastProcessor = this.window;
                    unicastProcessor.onNext(t);
                    long j = this.count + 1;
                    if (j >= this.maxSize) {
                        this.producerIndex++;
                        this.count = 0;
                        unicastProcessor.onComplete();
                        long requested = requested();
                        if (requested != 0) {
                            UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                            this.window = create;
                            this.downstream.onNext(create);
                            if (requested != Long.MAX_VALUE) {
                                produced(1);
                            }
                            if (this.restartTimerOnMaxSize) {
                                ((Disposable) this.timer.get()).dispose();
                                this.timer.replace(this.worker.schedulePeriodically(new ConsumerIndexHolder(this.producerIndex, this), this.timespan, this.timespan, this.unit));
                            }
                        } else {
                            this.window = null;
                            this.upstream.cancel();
                            this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                            dispose();
                            return;
                        }
                    } else {
                        this.count = j;
                    }
                    if (leave(-1) == 0) {
                        return;
                    }
                } else {
                    this.queue.offer(NotificationLite.next(t));
                    if (!enter()) {
                        return;
                    }
                }
                drainLoop();
            }
        }

        WindowExactBoundedSubscriber(c<? super Flowable<T>> cVar, long j, TimeUnit timeUnit, Scheduler scheduler2, int i, long j2, boolean z) {
            super(cVar, new MpscLinkedQueue());
            this.timespan = j;
            this.unit = timeUnit;
            this.scheduler = scheduler2;
            this.bufferSize = i;
            this.maxSize = j2;
            this.restartTimerOnMaxSize = z;
            if (z) {
                this.worker = scheduler2.createWorker();
            } else {
                this.worker = null;
            }
        }
    }

    static final class WindowExactUnboundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements FlowableSubscriber<T>, Runnable, d {
        static final Object NEXT = new Object();
        final int bufferSize;
        final Scheduler scheduler;
        volatile boolean terminated;
        final SequentialDisposable timer = new SequentialDisposable();
        final long timespan;
        final TimeUnit unit;
        d upstream;
        UnicastProcessor<T> window;

        public final void cancel() {
            this.cancelled = true;
        }

        public final void dispose() {
            DisposableHelper.dispose(this.timer);
        }

        public final void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            dispose();
        }

        public final void run() {
            if (this.cancelled) {
                this.terminated = true;
                dispose();
            }
            this.queue.offer(NEXT);
            if (enter()) {
                drainLoop();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainLoop() {
            SimplePlainQueue simplePlainQueue = this.queue;
            c cVar = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.window;
            int i = 1;
            while (true) {
                boolean z = this.terminated;
                boolean z2 = this.done;
                Object poll = simplePlainQueue.poll();
                if (!z2 || !(poll == null || poll == NEXT)) {
                    if (poll == null) {
                        i = leave(-i);
                        if (i == 0) {
                            return;
                        }
                    } else if (poll == NEXT) {
                        unicastProcessor.onComplete();
                        if (!z) {
                            unicastProcessor = UnicastProcessor.create(this.bufferSize);
                            this.window = unicastProcessor;
                            long requested = requested();
                            if (requested != 0) {
                                cVar.onNext(unicastProcessor);
                                if (requested != Long.MAX_VALUE) {
                                    produced(1);
                                }
                            } else {
                                this.window = null;
                                this.queue.clear();
                                this.upstream.cancel();
                                dispose();
                                cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                return;
                            }
                        } else {
                            this.upstream.cancel();
                        }
                    } else {
                        unicastProcessor.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
            this.window = null;
            simplePlainQueue.clear();
            dispose();
            Throwable th = this.error;
            if (th != null) {
                unicastProcessor.onError(th);
            } else {
                unicastProcessor.onComplete();
            }
        }

        public final void request(long j) {
            requested(j);
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
            dispose();
        }

        public final void onNext(T t) {
            if (!this.terminated) {
                if (fastEnter()) {
                    this.window.onNext(t);
                    if (leave(-1) == 0) {
                        return;
                    }
                } else {
                    this.queue.offer(NotificationLite.next(t));
                    if (!enter()) {
                        return;
                    }
                }
                drainLoop();
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.window = UnicastProcessor.create(this.bufferSize);
                c cVar = this.downstream;
                cVar.onSubscribe(this);
                long requested = requested();
                if (requested != 0) {
                    cVar.onNext(this.window);
                    if (requested != Long.MAX_VALUE) {
                        produced(1);
                    }
                    if (!this.cancelled) {
                        if (this.timer.replace(this.scheduler.schedulePeriodicallyDirect(this, this.timespan, this.timespan, this.unit))) {
                            dVar.request(Long.MAX_VALUE);
                        }
                    }
                } else {
                    this.cancelled = true;
                    dVar.cancel();
                    cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                }
            }
        }

        WindowExactUnboundedSubscriber(c<? super Flowable<T>> cVar, long j, TimeUnit timeUnit, Scheduler scheduler2, int i) {
            super(cVar, new MpscLinkedQueue());
            this.timespan = j;
            this.unit = timeUnit;
            this.scheduler = scheduler2;
            this.bufferSize = i;
        }
    }

    static final class WindowSkipSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Runnable, d {
        final int bufferSize;
        volatile boolean terminated;
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        d upstream;
        final List<UnicastProcessor<T>> windows = new LinkedList();
        final Scheduler.Worker worker;

        final class Completion implements Runnable {
            private final UnicastProcessor<T> processor;

            public final void run() {
                WindowSkipSubscriber.this.complete(this.processor);
            }

            Completion(UnicastProcessor<T> unicastProcessor) {
                this.processor = unicastProcessor;
            }
        }

        static final class SubjectWork<T> {
            final boolean open;
            final UnicastProcessor<T> w;

            SubjectWork(UnicastProcessor<T> unicastProcessor, boolean z) {
                this.w = unicastProcessor;
                this.open = z;
            }
        }

        public final void cancel() {
            this.cancelled = true;
        }

        public final void dispose() {
            this.worker.dispose();
        }

        public final void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            dispose();
        }

        public final void run() {
            SubjectWork subjectWork = new SubjectWork(UnicastProcessor.create(this.bufferSize), true);
            if (!this.cancelled) {
                this.queue.offer(subjectWork);
            }
            if (enter()) {
                drainLoop();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainLoop() {
            boolean z;
            SimplePlainQueue simplePlainQueue = this.queue;
            c cVar = this.downstream;
            List<UnicastProcessor<T>> list = this.windows;
            int i = 1;
            while (!this.terminated) {
                boolean z2 = this.done;
                Object poll = simplePlainQueue.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = poll instanceof SubjectWork;
                if (z2 && (z || z3)) {
                    simplePlainQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        for (UnicastProcessor<T> onError : list) {
                            onError.onError(th);
                        }
                    } else {
                        for (UnicastProcessor<T> onComplete : list) {
                            onComplete.onComplete();
                        }
                    }
                    list.clear();
                    dispose();
                    return;
                } else if (z) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    SubjectWork subjectWork = (SubjectWork) poll;
                    if (!subjectWork.open) {
                        list.remove(subjectWork.w);
                        subjectWork.w.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.terminated = true;
                        }
                    } else if (!this.cancelled) {
                        long requested = requested();
                        if (requested != 0) {
                            UnicastProcessor create = UnicastProcessor.create(this.bufferSize);
                            list.add(create);
                            cVar.onNext(create);
                            if (requested != Long.MAX_VALUE) {
                                produced(1);
                            }
                            this.worker.schedule(new Completion(create), this.timespan, this.unit);
                        } else {
                            cVar.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                        }
                    }
                } else {
                    for (UnicastProcessor<T> onNext : list) {
                        onNext.onNext(poll);
                    }
                }
            }
            this.upstream.cancel();
            dispose();
            simplePlainQueue.clear();
            list.clear();
        }

        public final void request(long j) {
            requested(j);
        }

        /* access modifiers changed from: package-private */
        public final void complete(UnicastProcessor<T> unicastProcessor) {
            this.queue.offer(new SubjectWork(unicastProcessor, false));
            if (enter()) {
                drainLoop();
            }
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
            dispose();
        }

        public final void onNext(T t) {
            if (fastEnter()) {
                for (UnicastProcessor<T> onNext : this.windows) {
                    onNext.onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(t);
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    long requested = requested();
                    if (requested != 0) {
                        UnicastProcessor create = UnicastProcessor.create(this.bufferSize);
                        this.windows.add(create);
                        this.downstream.onNext(create);
                        if (requested != Long.MAX_VALUE) {
                            produced(1);
                        }
                        this.worker.schedule(new Completion(create), this.timespan, this.unit);
                        this.worker.schedulePeriodically(this, this.timeskip, this.timeskip, this.unit);
                        dVar.request(Long.MAX_VALUE);
                        return;
                    }
                    dVar.cancel();
                    this.downstream.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
                }
            }
        }

        WindowSkipSubscriber(c<? super Flowable<T>> cVar, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker2, int i) {
            super(cVar, new MpscLinkedQueue());
            this.timespan = j;
            this.timeskip = j2;
            this.unit = timeUnit;
            this.worker = worker2;
            this.bufferSize = i;
        }
    }

    public final void subscribeActual(c<? super Flowable<T>> cVar) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(cVar);
        if (this.timespan != this.timeskip) {
            Flowable flowable = this.source;
            WindowSkipSubscriber windowSkipSubscriber = new WindowSkipSubscriber(serializedSubscriber, this.timespan, this.timeskip, this.unit, this.scheduler.createWorker(), this.bufferSize);
            flowable.subscribe((FlowableSubscriber<? super T>) windowSkipSubscriber);
        } else if (this.maxSize == Long.MAX_VALUE) {
            Flowable flowable2 = this.source;
            WindowExactUnboundedSubscriber windowExactUnboundedSubscriber = new WindowExactUnboundedSubscriber(serializedSubscriber, this.timespan, this.unit, this.scheduler, this.bufferSize);
            flowable2.subscribe((FlowableSubscriber<? super T>) windowExactUnboundedSubscriber);
        } else {
            Flowable flowable3 = this.source;
            WindowExactBoundedSubscriber windowExactBoundedSubscriber = new WindowExactBoundedSubscriber(serializedSubscriber, this.timespan, this.unit, this.scheduler, this.bufferSize, this.maxSize, this.restartTimerOnMaxSize);
            flowable3.subscribe((FlowableSubscriber<? super T>) windowExactBoundedSubscriber);
        }
    }

    public FlowableWindowTimed(Flowable<T> flowable, long j, long j2, TimeUnit timeUnit, Scheduler scheduler2, long j3, int i, boolean z) {
        super(flowable);
        this.timespan = j;
        this.timeskip = j2;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
        this.maxSize = j3;
        this.bufferSize = i;
        this.restartTimerOnMaxSize = z;
    }
}
