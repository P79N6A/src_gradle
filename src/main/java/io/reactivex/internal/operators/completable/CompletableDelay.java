package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableDelay extends Completable {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final CompletableSource source;
    final TimeUnit unit;

    static final class Delay extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final CompletableObserver downstream;
        Throwable error;
        final Scheduler scheduler;
        final TimeUnit unit;

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public final void onComplete() {
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this, this.delay, this.unit));
        }

        public final void run() {
            Throwable th = this.error;
            this.error = null;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            long j;
            this.error = th;
            Scheduler scheduler2 = this.scheduler;
            if (this.delayError) {
                j = this.delay;
            } else {
                j = 0;
            }
            DisposableHelper.replace(this, scheduler2.scheduleDirect(this, j, this.unit));
        }

        Delay(CompletableObserver completableObserver, long j, TimeUnit timeUnit, Scheduler scheduler2, boolean z) {
            this.downstream = completableObserver;
            this.delay = j;
            this.unit = timeUnit;
            this.scheduler = scheduler2;
            this.delayError = z;
        }
    }

    public final void subscribeActual(CompletableObserver completableObserver) {
        CompletableSource completableSource = this.source;
        Delay delay2 = new Delay(completableObserver, this.delay, this.unit, this.scheduler, this.delayError);
        completableSource.subscribe(delay2);
    }

    public CompletableDelay(CompletableSource completableSource, long j, TimeUnit timeUnit, Scheduler scheduler2, boolean z) {
        this.source = completableSource;
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
        this.delayError = z;
    }
}
