package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.a.b;
import org.a.d;

public final class SingleFromPublisher<T> extends Single<T> {
    final b<? extends T> publisher;

    static final class ToSingleObserver<T> implements FlowableSubscriber<T>, Disposable {
        volatile boolean disposed;
        boolean done;
        final SingleObserver<? super T> downstream;
        d upstream;
        T value;

        public final boolean isDisposed() {
            return this.disposed;
        }

        public final void dispose() {
            this.disposed = true;
            this.upstream.cancel();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                T t = this.value;
                this.value = null;
                if (t == null) {
                    this.downstream.onError(new NoSuchElementException("The source Publisher is empty"));
                } else {
                    this.downstream.onSuccess(t);
                }
            }
        }

        ToSingleObserver(SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.value = null;
            this.downstream.onError(th);
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.value != null) {
                    this.upstream.cancel();
                    this.done = true;
                    this.value = null;
                    this.downstream.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
                    return;
                }
                this.value = t;
            }
        }
    }

    public SingleFromPublisher(b<? extends T> bVar) {
        this.publisher = bVar;
    }

    public final void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.publisher.subscribe(new ToSingleObserver(singleObserver));
    }
}
