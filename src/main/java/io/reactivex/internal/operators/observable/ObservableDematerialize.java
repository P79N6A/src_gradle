package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableDematerialize<T, R> extends AbstractObservableWithUpstream<T, R> {
    final Function<? super T, ? extends Notification<R>> selector;

    static final class DematerializeObserver<T, R> implements Observer<T>, Disposable {
        boolean done;
        final Observer<? super R> downstream;
        final Function<? super T, ? extends Notification<R>> selector;
        Disposable upstream;

        public final void dispose() {
            this.upstream.dispose();
        }

        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            if (this.done) {
                if (t instanceof Notification) {
                    Notification notification = (Notification) t;
                    if (notification.isOnError()) {
                        RxJavaPlugins.onError(notification.getError());
                    }
                }
                return;
            }
            try {
                Notification notification2 = (Notification) ObjectHelper.requireNonNull(this.selector.apply(t), "The selector returned a null Notification");
                if (notification2.isOnError()) {
                    this.upstream.dispose();
                    onError(notification2.getError());
                } else if (notification2.isOnComplete()) {
                    this.upstream.dispose();
                    onComplete();
                } else {
                    this.downstream.onNext(notification2.getValue());
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        DematerializeObserver(Observer<? super R> observer, Function<? super T, ? extends Notification<R>> function) {
            this.downstream = observer;
            this.selector = function;
        }
    }

    public final void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new DematerializeObserver(observer, this.selector));
    }

    public ObservableDematerialize(ObservableSource<T> observableSource, Function<? super T, ? extends Notification<R>> function) {
        super(observableSource);
        this.selector = function;
    }
}
