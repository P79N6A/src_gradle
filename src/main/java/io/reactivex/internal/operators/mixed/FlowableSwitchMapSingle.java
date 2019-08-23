package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {
    final boolean delayErrors;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final Flowable<T> source;

    static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d {
        static final SwitchMapSingleObserver<Object> INNER_DISPOSED = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final c<? super R> downstream;
        long emitted;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        final AtomicLong requested = new AtomicLong();
        d upstream;

        static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapSingleSubscriber<?, R> parent;

            /* access modifiers changed from: package-private */
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            SwitchMapSingleObserver(SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber) {
                this.parent = switchMapSingleSubscriber;
            }

            public final void onError(Throwable th) {
                this.parent.innerError(this, th);
            }

            public final void onSuccess(R r) {
                this.item = r;
                this.parent.drain();
            }
        }

        public final void onComplete() {
            this.done = true;
            drain();
        }

        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
        }

        /* access modifiers changed from: package-private */
        public final void disposeInner() {
            SwitchMapSingleObserver<Object> andSet = this.inner.getAndSet(INNER_DISPOSED);
            if (andSet != null && andSet != INNER_DISPOSED) {
                andSet.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                c<? super R> cVar = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                AtomicLong atomicLong = this.requested;
                long j = this.emitted;
                int i = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() == null || this.delayErrors) {
                        boolean z2 = this.done;
                        SwitchMapSingleObserver switchMapSingleObserver = atomicReference.get();
                        if (switchMapSingleObserver == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2 && z) {
                            Throwable terminate = atomicThrowable.terminate();
                            if (terminate != null) {
                                cVar.onError(terminate);
                                return;
                            } else {
                                cVar.onComplete();
                                return;
                            }
                        } else if (z || switchMapSingleObserver.item == null || j == atomicLong.get()) {
                            this.emitted = j;
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(switchMapSingleObserver, null);
                            cVar.onNext(switchMapSingleObserver.item);
                            j++;
                        }
                    } else {
                        cVar.onError(atomicThrowable.terminate());
                        return;
                    }
                }
            }
        }

        public final void request(long j) {
            BackpressureHelper.add(this.requested, j);
            drain();
        }

        public final void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
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
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            SwitchMapSingleObserver switchMapSingleObserver = this.inner.get();
            if (switchMapSingleObserver != null) {
                switchMapSingleObserver.dispose();
            }
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null SingleSource");
                SwitchMapSingleObserver switchMapSingleObserver2 = new SwitchMapSingleObserver(this);
                while (true) {
                    SwitchMapSingleObserver<Object> switchMapSingleObserver3 = this.inner.get();
                    if (switchMapSingleObserver3 != INNER_DISPOSED) {
                        if (this.inner.compareAndSet(switchMapSingleObserver3, switchMapSingleObserver2)) {
                            singleSource.subscribe(switchMapSingleObserver2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                this.inner.getAndSet(INNER_DISPOSED);
                onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public final void innerError(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th) {
            if (!this.inner.compareAndSet(switchMapSingleObserver, null) || !this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.cancel();
                disposeInner();
            }
            drain();
        }

        SwitchMapSingleSubscriber(c<? super R> cVar, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
            this.downstream = cVar;
            this.mapper = function;
            this.delayErrors = z;
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new SwitchMapSingleSubscriber<Object>(cVar, this.mapper, this.delayErrors));
    }

    public FlowableSwitchMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        this.source = flowable;
        this.mapper = function;
        this.delayErrors = z;
    }
}
