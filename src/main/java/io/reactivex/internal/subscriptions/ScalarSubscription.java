package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import org.a.c;

public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    final c<? super T> subscriber;
    final T value;

    public final int requestFusion(int i) {
        return i & 1;
    }

    public final void cancel() {
        lazySet(2);
    }

    public final void clear() {
        lazySet(1);
    }

    public final boolean isCancelled() {
        if (get() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j) && compareAndSet(0, 1)) {
            c<? super T> cVar = this.subscriber;
            cVar.onNext(this.value);
            if (get() != 2) {
                cVar.onComplete();
            }
        }
    }

    public ScalarSubscription(c<? super T> cVar, T t) {
        this.subscriber = cVar;
        this.value = t;
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
