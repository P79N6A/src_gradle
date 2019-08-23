package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableRepeatWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    final Function<? super Flowable<Object>, ? extends b<?>> handler;

    static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        public final void onComplete() {
            again(0);
        }

        public final void onError(Throwable th) {
            this.receiver.cancel();
            this.downstream.onError(th);
        }

        RepeatWhenSubscriber(c<? super T> cVar, FlowableProcessor<Object> flowableProcessor, d dVar) {
            super(cVar, flowableProcessor, dVar);
        }
    }

    static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, d {
        private static final long serialVersionUID = 2827772011130406689L;
        final AtomicLong requested = new AtomicLong();
        final b<T> source;
        WhenSourceSubscriber<T, U> subscriber;
        final AtomicReference<d> upstream = new AtomicReference<>();

        public final void cancel() {
            SubscriptionHelper.cancel(this.upstream);
        }

        public final void onComplete() {
            this.subscriber.cancel();
            this.subscriber.downstream.onComplete();
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        public final void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        public final void onError(Throwable th) {
            this.subscriber.cancel();
            this.subscriber.downstream.onError(th);
        }

        WhenReceiver(b<T> bVar) {
            this.source = bVar;
        }

        public final void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                    this.source.subscribe(this.subscriber);
                    if (decrementAndGet() == 0) {
                    }
                }
            }
        }
    }

    static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final c<? super T> downstream;
        protected final FlowableProcessor<U> processor;
        private long produced;
        protected final d receiver;

        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }

        public final void onSubscribe(d dVar) {
            setSubscription(dVar);
        }

        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        /* access modifiers changed from: protected */
        public final void again(U u) {
            setSubscription(EmptySubscription.INSTANCE);
            long j = this.produced;
            if (j != 0) {
                this.produced = 0;
                produced(j);
            }
            this.receiver.request(1);
            this.processor.onNext(u);
        }

        WhenSourceSubscriber(c<? super T> cVar, FlowableProcessor<U> flowableProcessor, d dVar) {
            super(false);
            this.downstream = cVar;
            this.processor = flowableProcessor;
            this.receiver = dVar;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(cVar);
        FlowableProcessor serialized = UnicastProcessor.create(8).toSerialized();
        try {
            b bVar = (b) ObjectHelper.requireNonNull(this.handler.apply(serialized), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.source);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(serializedSubscriber, serialized, whenReceiver);
            whenReceiver.subscriber = repeatWhenSubscriber;
            cVar.onSubscribe(repeatWhenSubscriber);
            bVar.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }

    public FlowableRepeatWhen(Flowable<T> flowable, Function<? super Flowable<Object>, ? extends b<?>> function) {
        super(flowable);
        this.handler = function;
    }
}
