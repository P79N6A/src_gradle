package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableWindowBoundary<T, B> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int capacityHint;
    final b<B> other;

    static final class WindowBoundaryInnerSubscriber<T, B> extends DisposableSubscriber<B> {
        boolean done;
        final WindowBoundaryMainSubscriber<T, B> parent;

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.parent.innerComplete();
            }
        }

        WindowBoundaryInnerSubscriber(WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }

        public final void onNext(B b2) {
            if (!this.done) {
                this.parent.innerNext();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.parent.innerError(th);
        }
    }

    static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements FlowableSubscriber<T>, Runnable, d {
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final WindowBoundaryInnerSubscriber<T, B> boundarySubscriber = new WindowBoundaryInnerSubscriber<>(this);
        final int capacityHint;
        volatile boolean done;
        final c<? super Flowable<T>> downstream;
        long emitted;
        final AtomicThrowable errors = new AtomicThrowable();
        final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicBoolean stopWindows = new AtomicBoolean();
        final AtomicReference<d> upstream = new AtomicReference<>();
        UnicastProcessor<T> window;
        final AtomicInteger windows = new AtomicInteger(1);

        /* access modifiers changed from: package-private */
        public final void innerComplete() {
            SubscriptionHelper.cancel(this.upstream);
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void innerNext() {
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        public final void onComplete() {
            this.boundarySubscriber.dispose();
            this.done = true;
            drain();
        }

        public final void run() {
            if (this.windows.decrementAndGet() == 0) {
                SubscriptionHelper.cancel(this.upstream);
            }
        }

        public final void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.boundarySubscriber.dispose();
                if (this.windows.decrementAndGet() == 0) {
                    SubscriptionHelper.cancel(this.upstream);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                c<? super Flowable<T>> cVar = this.downstream;
                MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
                AtomicThrowable atomicThrowable = this.errors;
                long j = this.emitted;
                int i = 1;
                while (this.windows.get() != 0) {
                    UnicastProcessor<T> unicastProcessor = this.window;
                    boolean z2 = this.done;
                    if (!z2 || atomicThrowable.get() == null) {
                        Object poll = mpscLinkedQueue.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2 && z) {
                            Throwable terminate = atomicThrowable.terminate();
                            if (terminate == null) {
                                if (unicastProcessor != null) {
                                    this.window = null;
                                    unicastProcessor.onComplete();
                                }
                                cVar.onComplete();
                                return;
                            }
                            if (unicastProcessor != null) {
                                this.window = null;
                                unicastProcessor.onError(terminate);
                            }
                            cVar.onError(terminate);
                            return;
                        } else if (z) {
                            this.emitted = j;
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else if (poll != NEXT_WINDOW) {
                            unicastProcessor.onNext(poll);
                        } else {
                            if (unicastProcessor != null) {
                                this.window = null;
                                unicastProcessor.onComplete();
                            }
                            if (!this.stopWindows.get()) {
                                UnicastProcessor<T> create = UnicastProcessor.create(this.capacityHint, this);
                                this.window = create;
                                this.windows.getAndIncrement();
                                if (j != this.requested.get()) {
                                    j++;
                                    cVar.onNext(create);
                                } else {
                                    SubscriptionHelper.cancel(this.upstream);
                                    this.boundarySubscriber.dispose();
                                    atomicThrowable.addThrowable(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                                    this.done = true;
                                }
                            }
                        }
                    } else {
                        mpscLinkedQueue.clear();
                        Throwable terminate2 = atomicThrowable.terminate();
                        if (unicastProcessor != null) {
                            this.window = null;
                            unicastProcessor.onError(terminate2);
                        }
                        cVar.onError(terminate2);
                        return;
                    }
                }
                mpscLinkedQueue.clear();
                this.window = null;
            }
        }

        public final void request(long j) {
            BackpressureHelper.add(this.requested, j);
        }

        public final void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this.upstream, dVar, Long.MAX_VALUE);
        }

        /* access modifiers changed from: package-private */
        public final void innerError(Throwable th) {
            SubscriptionHelper.cancel(this.upstream);
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onError(Throwable th) {
            this.boundarySubscriber.dispose();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        WindowBoundaryMainSubscriber(c<? super Flowable<T>> cVar, int i) {
            this.downstream = cVar;
            this.capacityHint = i;
        }
    }

    public final void subscribeActual(c<? super Flowable<T>> cVar) {
        WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = new WindowBoundaryMainSubscriber(cVar, this.capacityHint);
        cVar.onSubscribe(windowBoundaryMainSubscriber);
        windowBoundaryMainSubscriber.innerNext();
        this.other.subscribe(windowBoundaryMainSubscriber.boundarySubscriber);
        this.source.subscribe((FlowableSubscriber<? super T>) windowBoundaryMainSubscriber);
    }

    public FlowableWindowBoundary(Flowable<T> flowable, b<B> bVar, int i) {
        super(flowable);
        this.other = bVar;
        this.capacityHint = i;
    }
}
