package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

public final class CompletableToObservable<T> extends Observable<T> {
    final CompletableSource source;

    static final class ObserverCompletableObserver extends BasicQueueDisposable<Void> implements CompletableObserver {
        final Observer<?> observer;
        Disposable upstream;

        public final void clear() {
        }

        public final boolean isEmpty() {
            return true;
        }

        public final Void poll() throws Exception {
            return null;
        }

        public final int requestFusion(int i) {
            return i & 2;
        }

        public final void dispose() {
            this.upstream.dispose();
        }

        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public final void onComplete() {
            this.observer.onComplete();
        }

        ObserverCompletableObserver(Observer<?> observer2) {
            this.observer = observer2;
        }

        public final void onError(Throwable th) {
            this.observer.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.observer.onSubscribe(this);
            }
        }
    }

    public CompletableToObservable(CompletableSource completableSource) {
        this.source = completableSource;
    }

    public final void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new ObserverCompletableObserver(observer));
    }
}
