package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class PublishProcessor<T> extends FlowableProcessor<T> {
    static final PublishSubscription[] EMPTY = new PublishSubscription[0];
    static final PublishSubscription[] TERMINATED = new PublishSubscription[0];
    Throwable error;
    final AtomicReference<PublishSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);

    static final class PublishSubscription<T> extends AtomicLong implements d {
        private static final long serialVersionUID = 3562861878281475070L;
        final c<? super T> downstream;
        final PublishProcessor<T> parent;

        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        public final boolean isCancelled() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean isFull() {
            if (get() == 0) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.addCancel(this, j);
            }
        }

        public final void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        public final void onNext(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    this.downstream.onNext(t);
                    BackpressureHelper.producedCancel(this, 1);
                    return;
                }
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        PublishSubscription(c<? super T> cVar, PublishProcessor<T> publishProcessor) {
            this.downstream = cVar;
            this.parent = publishProcessor;
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> PublishProcessor<T> create() {
        return new PublishProcessor<>();
    }

    PublishProcessor() {
    }

    @Nullable
    public final Throwable getThrowable() {
        if (this.subscribers.get() == TERMINATED) {
            return this.error;
        }
        return null;
    }

    public final boolean hasSubscribers() {
        if (((PublishSubscription[]) this.subscribers.get()).length != 0) {
            return true;
        }
        return false;
    }

    public final boolean hasComplete() {
        if (this.subscribers.get() == TERMINATED && this.error == null) {
            return true;
        }
        return false;
    }

    public final boolean hasThrowable() {
        if (this.subscribers.get() != TERMINATED || this.error == null) {
            return false;
        }
        return true;
    }

    public final void onComplete() {
        if (this.subscribers.get() != TERMINATED) {
            for (PublishSubscription onComplete : (PublishSubscription[]) this.subscribers.getAndSet(TERMINATED)) {
                onComplete.onComplete();
            }
        }
    }

    public final void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishSubscription onNext : (PublishSubscription[]) this.subscribers.get()) {
            onNext.onNext(t);
        }
    }

    public final void onSubscribe(d dVar) {
        if (this.subscribers.get() == TERMINATED) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean add(PublishSubscription<T> publishSubscription) {
        PublishSubscription[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = (PublishSubscription[]) this.subscribers.get();
            if (publishSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new PublishSubscription[(length + 1)];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
        } while (!this.subscribers.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2));
        return true;
    }

    public final boolean offer(T t) {
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        PublishSubscription[] publishSubscriptionArr = (PublishSubscription[]) this.subscribers.get();
        for (PublishSubscription isFull : publishSubscriptionArr) {
            if (isFull.isFull()) {
                return false;
            }
        }
        for (PublishSubscription onNext : publishSubscriptionArr) {
            onNext.onNext(t);
        }
        return true;
    }

    public final void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.subscribers.get() == TERMINATED) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        for (PublishSubscription onError : (PublishSubscription[]) this.subscribers.getAndSet(TERMINATED)) {
            onError.onError(th);
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        PublishSubscription publishSubscription = new PublishSubscription(cVar, this);
        cVar.onSubscribe(publishSubscription);
        if (!add(publishSubscription)) {
            Throwable th = this.error;
            if (th != null) {
                cVar.onError(th);
                return;
            }
            cVar.onComplete();
        } else if (publishSubscription.isCancelled()) {
            remove(publishSubscription);
        }
    }

    /* access modifiers changed from: package-private */
    public final void remove(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = (PublishSubscription[]) this.subscribers.get();
            if (publishSubscriptionArr != TERMINATED && publishSubscriptionArr != EMPTY) {
                int length = publishSubscriptionArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (publishSubscriptionArr[i2] == publishSubscription) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        publishSubscriptionArr2 = EMPTY;
                    } else {
                        PublishSubscription[] publishSubscriptionArr3 = new PublishSubscription[(length - 1)];
                        System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr3, 0, i);
                        System.arraycopy(publishSubscriptionArr, i + 1, publishSubscriptionArr3, i, (length - i) - 1);
                        publishSubscriptionArr2 = publishSubscriptionArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.subscribers.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2));
    }
}
