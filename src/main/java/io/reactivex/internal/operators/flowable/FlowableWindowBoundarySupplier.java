package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableWindowBoundarySupplier<T, B> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int capacityHint;
    final Callable<? extends b<B>> other;

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

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.parent.innerError(th);
        }

        public final void onNext(B b2) {
            if (!this.done) {
                this.done = true;
                dispose();
                this.parent.innerNext(this);
            }
        }
    }

    static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements FlowableSubscriber<T>, Runnable, d {
        static final WindowBoundaryInnerSubscriber<Object, Object> BOUNDARY_DISPOSED = new WindowBoundaryInnerSubscriber<>(null);
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final AtomicReference<WindowBoundaryInnerSubscriber<T, B>> boundarySubscriber = new AtomicReference<>();
        final int capacityHint;
        volatile boolean done;
        final c<? super Flowable<T>> downstream;
        long emitted;
        final AtomicThrowable errors = new AtomicThrowable();
        final Callable<? extends b<B>> other;
        final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        final AtomicLong requested;
        final AtomicBoolean stopWindows = new AtomicBoolean();
        d upstream;
        UnicastProcessor<T> window;
        final AtomicInteger windows = new AtomicInteger(1);

        /* access modifiers changed from: package-private */
        public final void innerComplete() {
            this.upstream.cancel();
            this.done = true;
            drain();
        }

        public final void onComplete() {
            disposeBoundary();
            this.done = true;
            drain();
        }

        public final void run() {
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }

        public final void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                disposeBoundary();
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void disposeBoundary() {
            Disposable andSet = this.boundarySubscriber.getAndSet(BOUNDARY_DISPOSED);
            if (andSet != null && andSet != BOUNDARY_DISPOSED) {
                andSet.dispose();
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
                                if (j != this.requested.get()) {
                                    UnicastProcessor<T> create = UnicastProcessor.create(this.capacityHint, this);
                                    this.window = create;
                                    this.windows.getAndIncrement();
                                    try {
                                        b bVar = (b) ObjectHelper.requireNonNull(this.other.call(), "The other Callable returned a null Publisher");
                                        WindowBoundaryInnerSubscriber windowBoundaryInnerSubscriber = new WindowBoundaryInnerSubscriber(this);
                                        if (this.boundarySubscriber.compareAndSet(null, windowBoundaryInnerSubscriber)) {
                                            bVar.subscribe(windowBoundaryInnerSubscriber);
                                            j++;
                                            cVar.onNext(create);
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.throwIfFatal(th);
                                        atomicThrowable.addThrowable(th);
                                        this.done = true;
                                    }
                                } else {
                                    this.upstream.cancel();
                                    disposeBoundary();
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

        /* access modifiers changed from: package-private */
        public final void innerError(Throwable th) {
            this.upstream.cancel();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* access modifiers changed from: package-private */
        public final void innerNext(WindowBoundaryInnerSubscriber<T, B> windowBoundaryInnerSubscriber) {
            this.boundarySubscriber.compareAndSet(windowBoundaryInnerSubscriber, null);
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        public final void onError(Throwable th) {
            disposeBoundary();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                this.queue.offer(NEXT_WINDOW);
                drain();
                dVar.request(Long.MAX_VALUE);
            }
        }

        WindowBoundaryMainSubscriber(c<? super Flowable<T>> cVar, int i, Callable<? extends b<B>> callable) {
            this.downstream = cVar;
            this.capacityHint = i;
            this.other = callable;
            this.requested = new AtomicLong();
        }
    }

    public final void subscribeActual(c<? super Flowable<T>> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new WindowBoundaryMainSubscriber<Object>(cVar, this.capacityHint, this.other));
    }

    public FlowableWindowBoundarySupplier(Flowable<T> flowable, Callable<? extends b<B>> callable, int i) {
        super(flowable);
        this.other = callable;
        this.capacityHint = i;
    }
}
