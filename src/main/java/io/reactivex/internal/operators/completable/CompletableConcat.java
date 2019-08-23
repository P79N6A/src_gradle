package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.d;

public final class CompletableConcat extends Completable {
    final int prefetch;
    final b<? extends CompletableSource> sources;

    static final class CompletableConcatSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {
        private static final long serialVersionUID = 9032184911934499404L;
        volatile boolean active;
        int consumed;
        volatile boolean done;
        final CompletableObserver downstream;
        final ConcatInnerObserver inner = new ConcatInnerObserver(this);
        final int limit;
        final AtomicBoolean once = new AtomicBoolean();
        final int prefetch;
        SimpleQueue<CompletableSource> queue;
        int sourceFused;
        d upstream;

        static final class ConcatInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -5454794857847146511L;
            final CompletableConcatSubscriber parent;

            public final void onComplete() {
                this.parent.innerComplete();
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            ConcatInnerObserver(CompletableConcatSubscriber completableConcatSubscriber) {
                this.parent = completableConcatSubscriber;
            }

            public final void onError(Throwable th) {
                this.parent.innerError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public final void innerComplete() {
            this.active = false;
            drain();
        }

        public final void onComplete() {
            this.done = true;
            drain();
        }

        public final void dispose() {
            this.upstream.cancel();
            DisposableHelper.dispose(this.inner);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) this.inner.get());
        }

        /* access modifiers changed from: package-private */
        public final void request() {
            if (this.sourceFused != 1) {
                int i = this.consumed + 1;
                if (i == this.limit) {
                    this.consumed = 0;
                    this.upstream.request((long) i);
                    return;
                }
                this.consumed = i;
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.active) {
                        boolean z2 = this.done;
                        try {
                            CompletableSource completableSource = (CompletableSource) this.queue.poll();
                            if (completableSource == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                if (this.once.compareAndSet(false, true)) {
                                    this.downstream.onComplete();
                                }
                                return;
                            } else if (!z) {
                                this.active = true;
                                completableSource.subscribe(this.inner);
                                request();
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            innerError(th);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void innerError(Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                this.upstream.cancel();
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onError(Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.inner);
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onNext(CompletableSource completableSource) {
            if (this.sourceFused != 0 || this.queue.offer(completableSource)) {
                drain();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        public final void onSubscribe(d dVar) {
            long j;
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (this.prefetch == Integer.MAX_VALUE) {
                    j = Long.MAX_VALUE;
                } else {
                    j = (long) this.prefetch;
                }
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceFused = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceFused = requestFusion;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        dVar.request(j);
                        return;
                    }
                }
                if (this.prefetch == Integer.MAX_VALUE) {
                    this.queue = new SpscLinkedArrayQueue(Flowable.bufferSize());
                } else {
                    this.queue = new SpscArrayQueue(this.prefetch);
                }
                this.downstream.onSubscribe(this);
                dVar.request(j);
            }
        }

        CompletableConcatSubscriber(CompletableObserver completableObserver, int i) {
            this.downstream = completableObserver;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }
    }

    public final void subscribeActual(CompletableObserver completableObserver) {
        this.sources.subscribe(new CompletableConcatSubscriber(completableObserver, this.prefetch));
    }

    public CompletableConcat(b<? extends CompletableSource> bVar, int i) {
        this.sources = bVar;
        this.prefetch = i;
    }
}
