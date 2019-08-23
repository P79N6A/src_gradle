package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.a.c;

public final class SingleToFlowable<T> extends Flowable<T> {
    final SingleSource<? extends T> source;

    static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements SingleObserver<T> {
        private static final long serialVersionUID = 187782011903685568L;
        Disposable upstream;

        public final void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        SingleToFlowableObserver(c<? super T> cVar) {
            super(cVar);
        }

        public final void onSuccess(T t) {
            complete(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public SingleToFlowable(SingleSource<? extends T> singleSource) {
        this.source = singleSource;
    }

    public final void subscribeActual(c<? super T> cVar) {
        this.source.subscribe(new SingleToFlowableObserver(cVar));
    }
}
