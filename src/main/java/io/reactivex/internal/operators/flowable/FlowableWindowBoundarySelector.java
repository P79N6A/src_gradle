package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableWindowBoundarySelector<T, B, V> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final Function<? super B, ? extends b<V>> close;
    final b<B> open;

    static final class OperatorWindowBoundaryCloseSubscriber<T, V> extends DisposableSubscriber<V> {
        boolean done;
        final WindowBoundaryMainSubscriber<T, ?, V> parent;
        final UnicastProcessor<T> w;

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.parent.close(this);
            }
        }

        public final void onNext(V v) {
            cancel();
            onComplete();
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.parent.error(th);
        }

        OperatorWindowBoundaryCloseSubscriber(WindowBoundaryMainSubscriber<T, ?, V> windowBoundaryMainSubscriber, UnicastProcessor<T> unicastProcessor) {
            this.parent = windowBoundaryMainSubscriber;
            this.w = unicastProcessor;
        }
    }

    static final class OperatorWindowBoundaryOpenSubscriber<T, B> extends DisposableSubscriber<B> {
        final WindowBoundaryMainSubscriber<T, B, ?> parent;

        public final void onComplete() {
            this.parent.onComplete();
        }

        OperatorWindowBoundaryOpenSubscriber(WindowBoundaryMainSubscriber<T, B, ?> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }

        public final void onError(Throwable th) {
            this.parent.error(th);
        }

        public final void onNext(B b2) {
            this.parent.open(b2);
        }
    }

    static final class WindowBoundaryMainSubscriber<T, B, V> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements d {
        final AtomicReference<Disposable> boundary = new AtomicReference<>();
        final int bufferSize;
        final Function<? super B, ? extends b<V>> close;
        final b<B> open;
        final CompositeDisposable resources;
        d upstream;
        final AtomicLong windows = new AtomicLong();
        final List<UnicastProcessor<T>> ws;

        public final boolean accept(c<? super Flowable<T>> cVar, Object obj) {
            return false;
        }

        public final void cancel() {
            this.cancelled = true;
        }

        /* access modifiers changed from: package-private */
        public final void dispose() {
            this.resources.dispose();
            DisposableHelper.dispose(this.boundary);
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                if (enter()) {
                    drainLoop();
                }
                if (this.windows.decrementAndGet() == 0) {
                    this.resources.dispose();
                }
                this.downstream.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainLoop() {
            boolean z;
            SimplePlainQueue simplePlainQueue = this.queue;
            c cVar = this.downstream;
            List<UnicastProcessor<T>> list = this.ws;
            int i = 1;
            while (true) {
                boolean z2 = this.done;
                Object poll = simplePlainQueue.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    dispose();
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
                    return;
                } else if (z) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll instanceof WindowOperation) {
                    WindowOperation windowOperation = (WindowOperation) poll;
                    if (windowOperation.w != null) {
                        if (list.remove(windowOperation.w)) {
                            windowOperation.w.onComplete();
                            if (this.windows.decrementAndGet() == 0) {
                                dispose();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.cancelled) {
                        UnicastProcessor create = UnicastProcessor.create(this.bufferSize);
                        long requested = requested();
                        if (requested != 0) {
                            list.add(create);
                            cVar.onNext(create);
                            if (requested != Long.MAX_VALUE) {
                                produced(1);
                            }
                            try {
                                b bVar = (b) ObjectHelper.requireNonNull(this.close.apply(windowOperation.open), "The publisher supplied is null");
                                OperatorWindowBoundaryCloseSubscriber operatorWindowBoundaryCloseSubscriber = new OperatorWindowBoundaryCloseSubscriber(this, create);
                                if (this.resources.add(operatorWindowBoundaryCloseSubscriber)) {
                                    this.windows.getAndIncrement();
                                    bVar.subscribe(operatorWindowBoundaryCloseSubscriber);
                                }
                            } catch (Throwable th2) {
                                this.cancelled = true;
                                cVar.onError(th2);
                            }
                        } else {
                            this.cancelled = true;
                            cVar.onError(new MissingBackpressureException("Could not deliver new window due to lack of requests"));
                        }
                    }
                } else {
                    for (UnicastProcessor<T> onNext : list) {
                        onNext.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
        }

        public final void request(long j) {
            requested(j);
        }

        /* access modifiers changed from: package-private */
        public final void close(OperatorWindowBoundaryCloseSubscriber<T, V> operatorWindowBoundaryCloseSubscriber) {
            this.resources.delete(operatorWindowBoundaryCloseSubscriber);
            this.queue.offer(new WindowOperation(operatorWindowBoundaryCloseSubscriber.w, null));
            if (enter()) {
                drainLoop();
            }
        }

        /* access modifiers changed from: package-private */
        public final void error(Throwable th) {
            this.upstream.cancel();
            this.resources.dispose();
            DisposableHelper.dispose(this.boundary);
            this.downstream.onError(th);
        }

        /* access modifiers changed from: package-private */
        public final void open(B b2) {
            this.queue.offer(new WindowOperation(null, b2));
            if (enter()) {
                drainLoop();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                this.resources.dispose();
            }
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (fastEnter()) {
                    for (UnicastProcessor<T> onNext : this.ws) {
                        onNext.onNext(t);
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

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    OperatorWindowBoundaryOpenSubscriber operatorWindowBoundaryOpenSubscriber = new OperatorWindowBoundaryOpenSubscriber(this);
                    if (this.boundary.compareAndSet(null, operatorWindowBoundaryOpenSubscriber)) {
                        this.windows.getAndIncrement();
                        dVar.request(Long.MAX_VALUE);
                        this.open.subscribe(operatorWindowBoundaryOpenSubscriber);
                    }
                }
            }
        }

        WindowBoundaryMainSubscriber(c<? super Flowable<T>> cVar, b<B> bVar, Function<? super B, ? extends b<V>> function, int i) {
            super(cVar, new MpscLinkedQueue());
            this.open = bVar;
            this.close = function;
            this.bufferSize = i;
            this.resources = new CompositeDisposable();
            this.ws = new ArrayList();
            this.windows.lazySet(1);
        }
    }

    static final class WindowOperation<T, B> {
        final B open;
        final UnicastProcessor<T> w;

        WindowOperation(UnicastProcessor<T> unicastProcessor, B b2) {
            this.w = unicastProcessor;
            this.open = b2;
        }
    }

    public final void subscribeActual(c<? super Flowable<T>> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new WindowBoundaryMainSubscriber<Object>(new SerializedSubscriber(cVar), this.open, this.close, this.bufferSize));
    }

    public FlowableWindowBoundarySelector(Flowable<T> flowable, b<B> bVar, Function<? super B, ? extends b<V>> function, int i) {
        super(flowable);
        this.open = bVar;
        this.close = function;
        this.bufferSize = i;
    }
}
