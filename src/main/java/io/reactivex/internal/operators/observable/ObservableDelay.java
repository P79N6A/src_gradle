package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

public final class ObservableDelay<T> extends AbstractObservableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final TimeUnit unit;

    static final class DelayObserver<T> implements Observer<T>, Disposable {
        final long delay;
        final boolean delayError;
        final Observer<? super T> downstream;
        final TimeUnit unit;
        Disposable upstream;
        final Scheduler.Worker w;

        final class OnComplete implements Runnable {
            public final void run() {
                try {
                    DelayObserver.this.downstream.onComplete();
                } finally {
                    DelayObserver.this.w.dispose();
                }
            }

            OnComplete() {
            }
        }

        final class OnError implements Runnable {
            private final Throwable throwable;

            public final void run() {
                try {
                    DelayObserver.this.downstream.onError(this.throwable);
                } finally {
                    DelayObserver.this.w.dispose();
                }
            }

            OnError(Throwable th) {
                this.throwable = th;
            }
        }

        final class OnNext implements Runnable {
            private final T t;

            public final void run() {
                DelayObserver.this.downstream.onNext(this.t);
            }

            OnNext(T t2) {
                this.t = t2;
            }
        }

        public final boolean isDisposed() {
            return this.w.isDisposed();
        }

        public final void dispose() {
            this.upstream.dispose();
            this.w.dispose();
        }

        public final void onComplete() {
            this.w.schedule(new OnComplete(), this.delay, this.unit);
        }

        public final void onNext(T t) {
            this.w.schedule(new OnNext(t), this.delay, this.unit);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            long j;
            Scheduler.Worker worker = this.w;
            OnError onError = new OnError(th);
            if (this.delayError) {
                j = this.delay;
            } else {
                j = 0;
            }
            worker.schedule(onError, j, this.unit);
        }

        DelayObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, Scheduler.Worker worker, boolean z) {
            this.downstream = observer;
            this.delay = j;
            this.unit = timeUnit;
            this.w = worker;
            this.delayError = z;
        }
    }

    public final void subscribeActual(Observer<? super T> observer) {
        SerializedObserver serializedObserver;
        if (this.delayError) {
            serializedObserver = observer;
        } else {
            serializedObserver = new SerializedObserver(observer);
        }
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        ObservableSource observableSource = this.source;
        DelayObserver delayObserver = new DelayObserver(serializedObserver, this.delay, this.unit, createWorker, this.delayError);
        observableSource.subscribe(delayObserver);
    }

    public ObservableDelay(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler2, boolean z) {
        super(observableSource);
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
        this.delayError = z;
    }
}
