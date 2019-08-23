package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableTakeLastOne<T> extends AbstractObservableWithUpstream<T, T> {

    static final class TakeLastOneObserver<T> implements Observer<T>, Disposable {
        final Observer<? super T> downstream;
        Disposable upstream;
        T value;

        public final void onComplete() {
            emit();
        }

        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public final void dispose() {
            this.value = null;
            this.upstream.dispose();
        }

        /* access modifiers changed from: package-private */
        public final void emit() {
            T t = this.value;
            if (t != null) {
                this.value = null;
                this.downstream.onNext(t);
            }
            this.downstream.onComplete();
        }

        public final void onNext(T t) {
            this.value = t;
        }

        TakeLastOneObserver(Observer<? super T> observer) {
            this.downstream = observer;
        }

        public final void onError(Throwable th) {
            this.value = null;
            this.downstream.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastOne(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    public final void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new TakeLastOneObserver(observer));
    }
}
