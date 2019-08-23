package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableOnErrorNext<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean allowFatal;
    final Function<? super Throwable, ? extends b<? extends T>> nextSupplier;

    static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4063763155303814625L;
        final boolean allowFatal;
        boolean done;
        final c<? super T> downstream;
        final Function<? super Throwable, ? extends b<? extends T>> nextSupplier;
        boolean once;
        long produced;

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.once = true;
                this.downstream.onComplete();
            }
        }

        public final void onSubscribe(d dVar) {
            setSubscription(dVar);
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (!this.once) {
                    this.produced++;
                }
                this.downstream.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            if (!this.once) {
                this.once = true;
                if (!this.allowFatal || (th instanceof Exception)) {
                    try {
                        b bVar = (b) ObjectHelper.requireNonNull(this.nextSupplier.apply(th), "The nextSupplier returned a null Publisher");
                        long j = this.produced;
                        if (j != 0) {
                            produced(j);
                        }
                        bVar.subscribe(this);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.downstream.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.downstream.onError(th);
                }
            } else if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        OnErrorNextSubscriber(c<? super T> cVar, Function<? super Throwable, ? extends b<? extends T>> function, boolean z) {
            super(false);
            this.downstream = cVar;
            this.nextSupplier = function;
            this.allowFatal = z;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber(cVar, this.nextSupplier, this.allowFatal);
        cVar.onSubscribe(onErrorNextSubscriber);
        this.source.subscribe((FlowableSubscriber<? super T>) onErrorNextSubscriber);
    }

    public FlowableOnErrorNext(Flowable<T> flowable, Function<? super Throwable, ? extends b<? extends T>> function, boolean z) {
        super(flowable);
        this.nextSupplier = function;
        this.allowFatal = z;
    }
}
