package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class AsyncProcessor<T> extends FlowableProcessor<T> {
    static final AsyncSubscription[] EMPTY = new AsyncSubscription[0];
    static final AsyncSubscription[] TERMINATED = new AsyncSubscription[0];
    Throwable error;
    final AtomicReference<AsyncSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
    T value;

    static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncProcessor<T> parent;

        public final void cancel() {
            if (super.tryCancel()) {
                this.parent.remove(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void onComplete() {
            if (!isCancelled()) {
                this.downstream.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final void onError(Throwable th) {
            if (isCancelled()) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        AsyncSubscription(c<? super T> cVar, AsyncProcessor<T> asyncProcessor) {
            super(cVar);
            this.parent = asyncProcessor;
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> AsyncProcessor<T> create() {
        return new AsyncProcessor<>();
    }

    AsyncProcessor() {
    }

    @Nullable
    public final Throwable getThrowable() {
        if (this.subscribers.get() == TERMINATED) {
            return this.error;
        }
        return null;
    }

    @Nullable
    public final T getValue() {
        if (this.subscribers.get() == TERMINATED) {
            return this.value;
        }
        return null;
    }

    @Deprecated
    public final Object[] getValues() {
        Object value2 = getValue();
        if (value2 == null) {
            return new Object[0];
        }
        return new Object[]{value2};
    }

    public final boolean hasSubscribers() {
        if (((AsyncSubscription[]) this.subscribers.get()).length != 0) {
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

    public final boolean hasValue() {
        if (this.subscribers.get() != TERMINATED || this.value == null) {
            return false;
        }
        return true;
    }

    public final void onComplete() {
        if (this.subscribers.get() != TERMINATED) {
            T t = this.value;
            AsyncSubscription[] asyncSubscriptionArr = (AsyncSubscription[]) this.subscribers.getAndSet(TERMINATED);
            int i = 0;
            if (t == null) {
                int length = asyncSubscriptionArr.length;
                while (i < length) {
                    asyncSubscriptionArr[i].onComplete();
                    i++;
                }
                return;
            }
            int length2 = asyncSubscriptionArr.length;
            while (i < length2) {
                asyncSubscriptionArr[i].complete(t);
                i++;
            }
        }
    }

    @Deprecated
    public final T[] getValues(T[] tArr) {
        T value2 = getValue();
        if (value2 == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = Arrays.copyOf(tArr, 1);
        }
        tArr[0] = value2;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    public final void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.subscribers.get() != TERMINATED) {
            this.value = t;
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
    public final boolean add(AsyncSubscription<T> asyncSubscription) {
        AsyncSubscription[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = (AsyncSubscription[]) this.subscribers.get();
            if (asyncSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = asyncSubscriptionArr.length;
            asyncSubscriptionArr2 = new AsyncSubscription[(length + 1)];
            System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr2, 0, length);
            asyncSubscriptionArr2[length] = asyncSubscription;
        } while (!this.subscribers.compareAndSet(asyncSubscriptionArr, asyncSubscriptionArr2));
        return true;
    }

    public final void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.subscribers.get() == TERMINATED) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.value = null;
        this.error = th;
        for (AsyncSubscription onError : (AsyncSubscription[]) this.subscribers.getAndSet(TERMINATED)) {
            onError.onError(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final void remove(AsyncSubscription<T> asyncSubscription) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = (AsyncSubscription[]) this.subscribers.get();
            int length = asyncSubscriptionArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (asyncSubscriptionArr[i2] == asyncSubscription) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        asyncSubscriptionArr2 = EMPTY;
                    } else {
                        AsyncSubscription[] asyncSubscriptionArr3 = new AsyncSubscription[(length - 1)];
                        System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr3, 0, i);
                        System.arraycopy(asyncSubscriptionArr, i + 1, asyncSubscriptionArr3, i, (length - i) - 1);
                        asyncSubscriptionArr2 = asyncSubscriptionArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.subscribers.compareAndSet(asyncSubscriptionArr, asyncSubscriptionArr2));
    }

    public final void subscribeActual(c<? super T> cVar) {
        AsyncSubscription asyncSubscription = new AsyncSubscription(cVar, this);
        cVar.onSubscribe(asyncSubscription);
        if (!add(asyncSubscription)) {
            Throwable th = this.error;
            if (th != null) {
                cVar.onError(th);
                return;
            }
            T t = this.value;
            if (t != null) {
                asyncSubscription.complete(t);
                return;
            }
            asyncSubscription.onComplete();
        } else if (asyncSubscription.isCancelled()) {
            remove(asyncSubscription);
        }
    }
}
