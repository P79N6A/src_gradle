package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public final class BoundedSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T>, Disposable, LambdaConsumerIntrospection, d {
    private static final long serialVersionUID = -7251123623727029452L;
    final int bufferSize;
    int consumed;
    final int limit;
    final Action onComplete;
    final Consumer<? super Throwable> onError;
    final Consumer<? super T> onNext;
    final Consumer<? super d> onSubscribe;

    public final void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public final void dispose() {
        cancel();
    }

    public final boolean hasCustomOnError() {
        if (this.onError != Functions.ON_ERROR_MISSING) {
            return true;
        }
        return false;
    }

    public final boolean isDisposed() {
        if (get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
        }
    }

    public final void request(long j) {
        ((d) get()).request(j);
    }

    public final void onSubscribe(d dVar) {
        if (SubscriptionHelper.setOnce(this, dVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                dVar.cancel();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(th, th2));
            }
        } else {
            RxJavaPlugins.onError(th);
        }
    }

    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
                int i = this.consumed + 1;
                if (i == this.limit) {
                    this.consumed = 0;
                    ((d) get()).request((long) this.limit);
                } else {
                    this.consumed = i;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                ((d) get()).cancel();
                onError(th);
            }
        }
    }

    public BoundedSubscriber(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super d> consumer3, int i) {
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = action;
        this.onSubscribe = consumer3;
        this.bufferSize = i;
        this.limit = i - (i >> 2);
    }
}
