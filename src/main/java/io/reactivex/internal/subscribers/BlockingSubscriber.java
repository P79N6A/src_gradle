package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public final class BlockingSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T>, d {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public final void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public final boolean isCancelled() {
        if (get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    public BlockingSubscriber(Queue<Object> queue2) {
        this.queue = queue2;
    }

    public final void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    public final void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    public final void onSubscribe(d dVar) {
        if (SubscriptionHelper.setOnce(this, dVar)) {
            this.queue.offer(NotificationLite.subscription(this));
        }
    }

    public final void request(long j) {
        ((d) get()).request(j);
    }
}
