package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import org.a.c;

public enum EmptySubscription implements QueueSubscription<Object> {
    INSTANCE;

    public final void cancel() {
    }

    public final void clear() {
    }

    public final boolean isEmpty() {
        return true;
    }

    @Nullable
    public final Object poll() {
        return null;
    }

    public final int requestFusion(int i) {
        return i & 2;
    }

    public final String toString() {
        return "EmptySubscription";
    }

    public final void request(long j) {
        SubscriptionHelper.validate(j);
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onComplete();
    }

    public static void error(Throwable th, c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th);
    }

    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
