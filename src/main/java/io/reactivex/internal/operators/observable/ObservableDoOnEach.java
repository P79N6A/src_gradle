package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableDoOnEach<T> extends AbstractObservableWithUpstream<T, T> {
    final Action onAfterTerminate;
    final Action onComplete;
    final Consumer<? super Throwable> onError;
    final Consumer<? super T> onNext;

    static final class DoOnEachObserver<T> implements Observer<T>, Disposable {
        boolean done;
        final Observer<? super T> downstream;
        final Action onAfterTerminate;
        final Action onComplete;
        final Consumer<? super Throwable> onError;
        final Consumer<? super T> onNext;
        Disposable upstream;

        public final void dispose() {
            this.upstream.dispose();
        }

        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public final void onComplete() {
            if (!this.done) {
                try {
                    this.onComplete.run();
                    this.done = true;
                    this.downstream.onComplete();
                    try {
                        this.onAfterTerminate.run();
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        RxJavaPlugins.onError(th);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    onError(th2);
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                try {
                    this.onNext.accept(t);
                    this.downstream.onNext(t);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                th = new CompositeException(th, th2);
            }
            this.downstream.onError(th);
            try {
                this.onAfterTerminate.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(th3);
            }
        }

        DoOnEachObserver(Observer<? super T> observer, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            this.downstream = observer;
            this.onNext = consumer;
            this.onError = consumer2;
            this.onComplete = action;
            this.onAfterTerminate = action2;
        }
    }

    public final void subscribeActual(Observer<? super T> observer) {
        ObservableSource observableSource = this.source;
        DoOnEachObserver doOnEachObserver = new DoOnEachObserver(observer, this.onNext, this.onError, this.onComplete, this.onAfterTerminate);
        observableSource.subscribe(doOnEachObserver);
    }

    public ObservableDoOnEach(ObservableSource<T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(observableSource);
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = action;
        this.onAfterTerminate = action2;
    }
}
