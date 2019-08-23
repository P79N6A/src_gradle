package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, d {
    Throwable error;
    final AtomicReference<d> upstream = new AtomicReference<>();
    T value;

    public final void cancel() {
    }

    public final void request(long j) {
    }

    public FutureSubscriber() {
        super(1);
    }

    public final boolean isCancelled() {
        if (this.upstream.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    public final boolean isDone() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    public final T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.error;
            if (th == null) {
                return this.value;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    public final void onComplete() {
        d dVar;
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            dVar = this.upstream.get();
            if (dVar == this || dVar == SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!this.upstream.compareAndSet(dVar, this));
        countDown();
    }

    public final void onSubscribe(d dVar) {
        SubscriptionHelper.setOnce(this.upstream, dVar, Long.MAX_VALUE);
    }

    public final void onNext(T t) {
        if (this.value != null) {
            this.upstream.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.value = t;
    }

    public final boolean cancel(boolean z) {
        d dVar;
        do {
            dVar = this.upstream.get();
            if (dVar == this || dVar == SubscriptionHelper.CANCELLED) {
                return false;
            }
        } while (!this.upstream.compareAndSet(dVar, SubscriptionHelper.CANCELLED));
        if (dVar != null) {
            dVar.cancel();
        }
        countDown();
        return true;
    }

    public final void onError(Throwable th) {
        d dVar;
        do {
            dVar = this.upstream.get();
            if (dVar == this || dVar == SubscriptionHelper.CANCELLED) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
        } while (!this.upstream.compareAndSet(dVar, this));
        countDown();
    }

    public final T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.error;
            if (th == null) {
                return this.value;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
