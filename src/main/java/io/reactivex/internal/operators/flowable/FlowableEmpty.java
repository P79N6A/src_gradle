package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.EmptySubscription;
import org.a.c;

public final class FlowableEmpty extends Flowable<Object> implements ScalarCallable<Object> {
    public static final Flowable<Object> INSTANCE = new FlowableEmpty();

    public final Object call() {
        return null;
    }

    private FlowableEmpty() {
    }

    public final void subscribeActual(c<? super Object> cVar) {
        EmptySubscription.complete(cVar);
    }
}
