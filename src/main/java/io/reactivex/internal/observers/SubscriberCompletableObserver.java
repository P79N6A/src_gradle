package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import org.a.c;
import org.a.d;

public final class SubscriberCompletableObserver<T> implements CompletableObserver, d {
    final c<? super T> subscriber;
    Disposable upstream;

    public final void request(long j) {
    }

    public final void cancel() {
        this.upstream.dispose();
    }

    public final void onComplete() {
        this.subscriber.onComplete();
    }

    public SubscriberCompletableObserver(c<? super T> cVar) {
        this.subscriber = cVar;
    }

    public final void onError(Throwable th) {
        this.subscriber.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.subscriber.onSubscribe(this);
        }
    }
}
