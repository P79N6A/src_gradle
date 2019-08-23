package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableRetryWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    final Function<? super Flowable<Throwable>, ? extends b<?>> handler;

    static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen.WhenSourceSubscriber<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        public final void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }

        public final void onError(Throwable th) {
            again(th);
        }

        RetryWhenSubscriber(c<? super T> cVar, FlowableProcessor<Throwable> flowableProcessor, d dVar) {
            super(cVar, flowableProcessor, dVar);
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(cVar);
        FlowableProcessor serialized = UnicastProcessor.create(8).toSerialized();
        try {
            b bVar = (b) ObjectHelper.requireNonNull(this.handler.apply(serialized), "handler returned a null Publisher");
            FlowableRepeatWhen.WhenReceiver whenReceiver = new FlowableRepeatWhen.WhenReceiver(this.source);
            RetryWhenSubscriber retryWhenSubscriber = new RetryWhenSubscriber(serializedSubscriber, serialized, whenReceiver);
            whenReceiver.subscriber = retryWhenSubscriber;
            cVar.onSubscribe(retryWhenSubscriber);
            bVar.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }

    public FlowableRetryWhen(Flowable<T> flowable, Function<? super Flowable<Throwable>, ? extends b<?>> function) {
        super(flowable);
        this.handler = function;
    }
}
