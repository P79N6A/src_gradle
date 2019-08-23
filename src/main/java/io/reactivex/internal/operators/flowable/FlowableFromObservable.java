package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.a.c;
import org.a.d;

public final class FlowableFromObservable<T> extends Flowable<T> {
    private final Observable<T> upstream;

    static final class SubscriberObserver<T> implements Observer<T>, d {
        final c<? super T> downstream;
        Disposable upstream;

        public final void request(long j) {
        }

        public final void cancel() {
            this.upstream.dispose();
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        SubscriberObserver(c<? super T> cVar) {
            this.downstream = cVar;
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onSubscribe(Disposable disposable) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public FlowableFromObservable(Observable<T> observable) {
        this.upstream = observable;
    }

    public final void subscribeActual(c<? super T> cVar) {
        this.upstream.subscribe((Observer<? super T>) new SubscriberObserver<Object>(cVar));
    }
}
