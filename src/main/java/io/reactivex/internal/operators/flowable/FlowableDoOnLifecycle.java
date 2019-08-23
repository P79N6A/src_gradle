package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.a.c;
import org.a.d;

public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {
    private final Action onCancel;
    private final LongConsumer onRequest;
    private final Consumer<? super d> onSubscribe;

    static final class SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, d {
        final c<? super T> downstream;
        final Action onCancel;
        final LongConsumer onRequest;
        final Consumer<? super d> onSubscribe;
        d upstream;

        public final void onComplete() {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onComplete();
            }
        }

        public final void cancel() {
            d dVar = this.upstream;
            if (dVar != SubscriptionHelper.CANCELLED) {
                this.upstream = SubscriptionHelper.CANCELLED;
                try {
                    this.onCancel.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
                dVar.cancel();
            }
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onError(Throwable th) {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        public final void request(long j) {
            try {
                this.onRequest.accept(j);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
            this.upstream.request(j);
        }

        public final void onSubscribe(d dVar) {
            try {
                this.onSubscribe.accept(dVar);
                if (SubscriptionHelper.validate(this.upstream, dVar)) {
                    this.upstream = dVar;
                    this.downstream.onSubscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                dVar.cancel();
                this.upstream = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th, this.downstream);
            }
        }

        SubscriptionLambdaSubscriber(c<? super T> cVar, Consumer<? super d> consumer, LongConsumer longConsumer, Action action) {
            this.downstream = cVar;
            this.onSubscribe = consumer;
            this.onCancel = action;
            this.onRequest = longConsumer;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new SubscriptionLambdaSubscriber<Object>(cVar, this.onSubscribe, this.onRequest, this.onCancel));
    }

    public FlowableDoOnLifecycle(Flowable<T> flowable, Consumer<? super d> consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.onSubscribe = consumer;
        this.onRequest = longConsumer;
        this.onCancel = action;
    }
}
