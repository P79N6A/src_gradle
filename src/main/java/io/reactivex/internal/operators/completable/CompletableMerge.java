package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.d;

public final class CompletableMerge extends Completable {
    final boolean delayErrors;
    final int maxConcurrency;
    final b<? extends CompletableSource> source;

    static final class CompletableMergeSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {
        private static final long serialVersionUID = -2108443387387077490L;
        final boolean delayErrors;
        final CompletableObserver downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final int maxConcurrency;
        final CompositeDisposable set = new CompositeDisposable();
        d upstream;

        final class MergeInnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            private static final long serialVersionUID = 251330541679988317L;

            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            public final void onComplete() {
                CompletableMergeSubscriber.this.innerComplete(this);
            }

            public final boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            MergeInnerObserver() {
            }

            public final void onError(Throwable th) {
                CompletableMergeSubscriber.this.innerError(this, th);
            }
        }

        public final boolean isDisposed() {
            return this.set.isDisposed();
        }

        public final void dispose() {
            this.upstream.cancel();
            this.set.dispose();
        }

        public final void onComplete() {
            if (decrementAndGet() == 0) {
                if (((Throwable) this.error.get()) != null) {
                    this.downstream.onError(this.error.terminate());
                    return;
                }
                this.downstream.onComplete();
            }
        }

        public final void onNext(CompletableSource completableSource) {
            getAndIncrement();
            MergeInnerObserver mergeInnerObserver = new MergeInnerObserver();
            this.set.add(mergeInnerObserver);
            completableSource.subscribe(mergeInnerObserver);
        }

        /* access modifiers changed from: package-private */
        public final void innerComplete(MergeInnerObserver mergeInnerObserver) {
            this.set.delete(mergeInnerObserver);
            if (decrementAndGet() == 0) {
                Throwable th = (Throwable) this.error.get();
                if (th != null) {
                    this.downstream.onError(th);
                } else {
                    this.downstream.onComplete();
                }
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1);
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    dVar.request(Long.MAX_VALUE);
                    return;
                }
                dVar.request((long) this.maxConcurrency);
            }
        }

        public final void onError(Throwable th) {
            if (!this.delayErrors) {
                this.set.dispose();
                if (!this.error.addThrowable(th)) {
                    RxJavaPlugins.onError(th);
                } else if (getAndSet(0) > 0) {
                    this.downstream.onError(this.error.terminate());
                }
            } else if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else if (decrementAndGet() == 0) {
                this.downstream.onError(this.error.terminate());
            }
        }

        /* access modifiers changed from: package-private */
        public final void innerError(MergeInnerObserver mergeInnerObserver, Throwable th) {
            this.set.delete(mergeInnerObserver);
            if (!this.delayErrors) {
                this.upstream.cancel();
                this.set.dispose();
                if (!this.error.addThrowable(th)) {
                    RxJavaPlugins.onError(th);
                } else if (getAndSet(0) > 0) {
                    this.downstream.onError(this.error.terminate());
                }
            } else if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else if (decrementAndGet() == 0) {
                this.downstream.onError(this.error.terminate());
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1);
            }
        }

        CompletableMergeSubscriber(CompletableObserver completableObserver, int i, boolean z) {
            this.downstream = completableObserver;
            this.maxConcurrency = i;
            this.delayErrors = z;
            lazySet(1);
        }
    }

    public final void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe(new CompletableMergeSubscriber(completableObserver, this.maxConcurrency, this.delayErrors));
    }

    public CompletableMerge(b<? extends CompletableSource> bVar, int i, boolean z) {
        this.source = bVar;
        this.maxConcurrency = i;
        this.delayErrors = z;
    }
}
