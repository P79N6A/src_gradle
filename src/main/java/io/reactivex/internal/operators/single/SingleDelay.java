package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

public final class SingleDelay<T> extends Single<T> {
    final boolean delayError;
    final Scheduler scheduler;
    final SingleSource<? extends T> source;
    final long time;
    final TimeUnit unit;

    final class Delay implements SingleObserver<T> {
        final SingleObserver<? super T> downstream;
        private final SequentialDisposable sd;

        final class OnError implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            private final Throwable f83379e;

            public final void run() {
                Delay.this.downstream.onError(this.f83379e);
            }

            OnError(Throwable th) {
                this.f83379e = th;
            }
        }

        final class OnSuccess implements Runnable {
            private final T value;

            public final void run() {
                Delay.this.downstream.onSuccess(this.value);
            }

            OnSuccess(T t) {
                this.value = t;
            }
        }

        public final void onSubscribe(Disposable disposable) {
            this.sd.replace(disposable);
        }

        public final void onSuccess(T t) {
            this.sd.replace(SingleDelay.this.scheduler.scheduleDirect(new OnSuccess(t), SingleDelay.this.time, SingleDelay.this.unit));
        }

        public final void onError(Throwable th) {
            long j;
            SequentialDisposable sequentialDisposable = this.sd;
            Scheduler scheduler = SingleDelay.this.scheduler;
            OnError onError = new OnError(th);
            if (SingleDelay.this.delayError) {
                j = SingleDelay.this.time;
            } else {
                j = 0;
            }
            sequentialDisposable.replace(scheduler.scheduleDirect(onError, j, SingleDelay.this.unit));
        }

        Delay(SequentialDisposable sequentialDisposable, SingleObserver<? super T> singleObserver) {
            this.sd = sequentialDisposable;
            this.downstream = singleObserver;
        }
    }

    public final void subscribeActual(SingleObserver<? super T> singleObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.source.subscribe(new Delay(sequentialDisposable, singleObserver));
    }

    public SingleDelay(SingleSource<? extends T> singleSource, long j, TimeUnit timeUnit, Scheduler scheduler2, boolean z) {
        this.source = singleSource;
        this.time = j;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
        this.delayError = z;
    }
}
