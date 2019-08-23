package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSampleWithObservable<T> extends AbstractObservableWithUpstream<T, T> {
    final boolean emitLast;
    final ObservableSource<?> other;

    static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final AtomicInteger wip = new AtomicInteger();

        /* access modifiers changed from: package-private */
        public final void completeMain() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final void completeOther() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final void run() {
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z = this.done;
                    emit();
                    if (z) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }

        SampleMainEmitLast(Observer<? super T> observer, ObservableSource<?> observableSource) {
            super(observer, observableSource);
        }
    }

    static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* access modifiers changed from: package-private */
        public final void run() {
            emit();
        }

        /* access modifiers changed from: package-private */
        public final void completeMain() {
            this.downstream.onComplete();
        }

        /* access modifiers changed from: package-private */
        public final void completeOther() {
            this.downstream.onComplete();
        }

        SampleMainNoLast(Observer<? super T> observer, ObservableSource<?> observableSource) {
            super(observer, observableSource);
        }
    }

    static abstract class SampleMainObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable {
        private static final long serialVersionUID = -3517602651313910099L;
        final Observer<? super T> downstream;
        final AtomicReference<Disposable> other = new AtomicReference<>();
        final ObservableSource<?> sampler;
        Disposable upstream;

        /* access modifiers changed from: package-private */
        public abstract void completeMain();

        /* access modifiers changed from: package-private */
        public abstract void completeOther();

        /* access modifiers changed from: package-private */
        public abstract void run();

        public void complete() {
            this.upstream.dispose();
            completeOther();
        }

        public void dispose() {
            DisposableHelper.dispose(this.other);
            this.upstream.dispose();
        }

        /* access modifiers changed from: package-private */
        public void emit() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        public boolean isDisposed() {
            if (this.other.get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        public void onComplete() {
            DisposableHelper.dispose(this.other);
            completeMain();
        }

        public void onNext(T t) {
            lazySet(t);
        }

        /* access modifiers changed from: package-private */
        public boolean setOther(Disposable disposable) {
            return DisposableHelper.setOnce(this.other, disposable);
        }

        public void error(Throwable th) {
            this.upstream.dispose();
            this.downstream.onError(th);
        }

        public void onError(Throwable th) {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new SamplerObserver(this));
                }
            }
        }

        SampleMainObserver(Observer<? super T> observer, ObservableSource<?> observableSource) {
            this.downstream = observer;
            this.sampler = observableSource;
        }
    }

    static final class SamplerObserver<T> implements Observer<Object> {
        final SampleMainObserver<T> parent;

        public final void onComplete() {
            this.parent.complete();
        }

        SamplerObserver(SampleMainObserver<T> sampleMainObserver) {
            this.parent = sampleMainObserver;
        }

        public final void onError(Throwable th) {
            this.parent.error(th);
        }

        public final void onNext(Object obj) {
            this.parent.run();
        }

        public final void onSubscribe(Disposable disposable) {
            this.parent.setOther(disposable);
        }
    }

    public final void subscribeActual(Observer<? super T> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        if (this.emitLast) {
            this.source.subscribe(new SampleMainEmitLast(serializedObserver, this.other));
        } else {
            this.source.subscribe(new SampleMainNoLast(serializedObserver, this.other));
        }
    }

    public ObservableSampleWithObservable(ObservableSource<T> observableSource, ObservableSource<?> observableSource2, boolean z) {
        super(observableSource);
        this.other = observableSource2;
        this.emitLast = z;
    }
}
