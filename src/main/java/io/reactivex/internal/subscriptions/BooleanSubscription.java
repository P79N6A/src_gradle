package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import org.a.d;

public final class BooleanSubscription extends AtomicBoolean implements d {
    private static final long serialVersionUID = -8127758972444290902L;

    public final void cancel() {
        lazySet(true);
    }

    public final boolean isCancelled() {
        return get();
    }

    public final String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }

    public final void request(long j) {
        SubscriptionHelper.validate(j);
    }
}
