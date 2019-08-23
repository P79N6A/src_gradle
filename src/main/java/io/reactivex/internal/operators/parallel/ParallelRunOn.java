package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;
import org.a.d;

public final class ParallelRunOn<T> extends ParallelFlowable<T> {
    final int prefetch;
    final Scheduler scheduler;
    final ParallelFlowable<? extends T> source;

    static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Runnable, d {
        private static final long serialVersionUID = 9222303586456402150L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        Throwable error;
        final int limit;
        final int prefetch;
        final SpscArrayQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        d upstream;
        final Scheduler.Worker worker;

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                schedule();
            }
        }

        /* access modifiers changed from: package-private */
        public final void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.schedule(this);
            }
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                schedule();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (!this.queue.offer(t)) {
                    this.upstream.cancel();
                    onError(new MissingBackpressureException("Queue is full?!"));
                    return;
                }
                schedule();
            }
        }

        BaseRunOnSubscriber(int i, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker2) {
            this.prefetch = i;
            this.queue = spscArrayQueue;
            this.limit = i - (i >> 2);
            this.worker = worker2;
        }
    }

    final class MultiWorkerCallback implements SchedulerMultiWorkerSupport.WorkerCallback {
        final c<T>[] parents;
        final c<? super T>[] subscribers;

        public final void onWorker(int i, Scheduler.Worker worker) {
            ParallelRunOn.this.createSubscriber(i, this.subscribers, this.parents, worker);
        }

        MultiWorkerCallback(c<? super T>[] cVarArr, c<T>[] cVarArr2) {
            this.subscribers = cVarArr;
            this.parents = cVarArr2;
        }
    }

    static final class RunOnConditionalSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final ConditionalSubscriber<? super T> downstream;

        public final void run() {
            boolean z;
            int i;
            int i2 = this.consumed;
            SpscArrayQueue spscArrayQueue = this.queue;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            int i3 = this.limit;
            int i4 = 1;
            while (true) {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z2 = this.done;
                    if (z2) {
                        Throwable th = this.error;
                        if (th != null) {
                            spscArrayQueue.clear();
                            conditionalSubscriber.onError(th);
                            this.worker.dispose();
                            return;
                        }
                    }
                    Object poll = spscArrayQueue.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2 || !z) {
                        if (z) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(poll)) {
                            j2++;
                        }
                        i2++;
                        if (i2 == i3) {
                            i = i4;
                            this.upstream.request((long) i2);
                            i2 = 0;
                        } else {
                            i = i4;
                        }
                        i4 = i;
                    } else {
                        conditionalSubscriber.onComplete();
                        this.worker.dispose();
                        return;
                    }
                }
                int i5 = i4;
                if (j2 == j) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    } else if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            conditionalSubscriber.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            conditionalSubscriber.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                    this.requested.addAndGet(-j2);
                }
                int i6 = get();
                int i7 = i5;
                if (i6 == i7) {
                    this.consumed = i2;
                    i6 = addAndGet(-i7);
                    if (i6 == 0) {
                        return;
                    }
                }
                i4 = i6;
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request((long) this.prefetch);
            }
        }

        RunOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, int i, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i, spscArrayQueue, worker);
            this.downstream = conditionalSubscriber;
        }
    }

    static final class RunOnSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final c<? super T> downstream;

        public final void run() {
            boolean z;
            int i;
            int i2 = this.consumed;
            SpscArrayQueue spscArrayQueue = this.queue;
            c<? super T> cVar = this.downstream;
            int i3 = this.limit;
            int i4 = 1;
            while (true) {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z2 = this.done;
                    if (z2) {
                        Throwable th = this.error;
                        if (th != null) {
                            spscArrayQueue.clear();
                            cVar.onError(th);
                            this.worker.dispose();
                            return;
                        }
                    }
                    Object poll = spscArrayQueue.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2 || !z) {
                        if (z) {
                            break;
                        }
                        cVar.onNext(poll);
                        j2++;
                        i2++;
                        if (i2 == i3) {
                            i = i4;
                            this.upstream.request((long) i2);
                            i2 = 0;
                        } else {
                            i = i4;
                        }
                        i4 = i;
                    } else {
                        cVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                }
                int i5 = i4;
                if (j2 == j) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    } else if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            cVar.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            cVar.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                    this.requested.addAndGet(-j2);
                }
                int i6 = get();
                int i7 = i5;
                if (i6 == i7) {
                    this.consumed = i2;
                    i6 = addAndGet(-i7);
                    if (i6 == 0) {
                        return;
                    }
                }
                i4 = i6;
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request((long) this.prefetch);
            }
        }

        RunOnSubscriber(c<? super T> cVar, int i, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i, spscArrayQueue, worker);
            this.downstream = cVar;
        }
    }

    public final int parallelism() {
        return this.source.parallelism();
    }

    public final void subscribe(c<? super T>[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            c[] cVarArr2 = new c[length];
            if (this.scheduler instanceof SchedulerMultiWorkerSupport) {
                ((SchedulerMultiWorkerSupport) this.scheduler).createWorkers(length, new MultiWorkerCallback(cVarArr, cVarArr2));
            } else {
                for (int i = 0; i < length; i++) {
                    createSubscriber(i, cVarArr, cVarArr2, this.scheduler.createWorker());
                }
            }
            this.source.subscribe(cVarArr2);
        }
    }

    public ParallelRunOn(ParallelFlowable<? extends T> parallelFlowable, Scheduler scheduler2, int i) {
        this.source = parallelFlowable;
        this.scheduler = scheduler2;
        this.prefetch = i;
    }

    /* access modifiers changed from: package-private */
    public final void createSubscriber(int i, c<? super T>[] cVarArr, c<T>[] cVarArr2, Scheduler.Worker worker) {
        ConditionalSubscriber conditionalSubscriber = cVarArr[i];
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
        if (conditionalSubscriber instanceof ConditionalSubscriber) {
            cVarArr2[i] = new RunOnConditionalSubscriber(conditionalSubscriber, this.prefetch, spscArrayQueue, worker);
        } else {
            cVarArr2[i] = new RunOnSubscriber(conditionalSubscriber, this.prefetch, spscArrayQueue, worker);
        }
    }
}
