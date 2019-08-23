package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import org.a.d;

public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {
    volatile boolean cancelled;
    Throwable error;
    d upstream;
    T value;

    public final void onComplete() {
        countDown();
    }

    public BlockingBaseSubscriber() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e2) {
                d dVar = this.upstream;
                this.upstream = SubscriptionHelper.CANCELLED;
                if (dVar != null) {
                    dVar.cancel();
                }
                throw ExceptionHelper.wrapOrThrow(e2);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw ExceptionHelper.wrapOrThrow(th);
    }

    public final void onSubscribe(d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            if (!this.cancelled) {
                dVar.request(Long.MAX_VALUE);
                if (this.cancelled) {
                    this.upstream = SubscriptionHelper.CANCELLED;
                    dVar.cancel();
                }
            }
        }
    }
}
