package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

public final class SingleDoFinally<T> extends Single<T> {
    final Action onFinally;
    final SingleSource<T> source;

    static final class DoFinallyObserver<T> extends AtomicInteger implements SingleObserver<T>, Disposable {
        private static final long serialVersionUID = 4109457741734051389L;
        final SingleObserver<? super T> downstream;
        final Action onFinally;
        Disposable upstream;

        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public final void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        /* access modifiers changed from: package-private */
        public final void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
            runFinally();
        }

        DoFinallyObserver(SingleObserver<? super T> singleObserver, Action action) {
            this.downstream = singleObserver;
            this.onFinally = action;
        }
    }

    public final void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new DoFinallyObserver(singleObserver, this.onFinally));
    }

    public SingleDoFinally(SingleSource<T> singleSource, Action action) {
        this.source = singleSource;
        this.onFinally = action;
    }
}
