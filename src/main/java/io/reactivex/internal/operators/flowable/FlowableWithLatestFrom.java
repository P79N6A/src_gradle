package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableWithLatestFrom<T, U, R> extends AbstractFlowableWithUpstream<T, R> {
    final BiFunction<? super T, ? super U, ? extends R> combiner;
    final b<? extends U> other;

    final class FlowableWithLatestSubscriber implements FlowableSubscriber<U> {
        private final WithLatestFromSubscriber<T, U, R> wlf;

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            this.wlf.otherError(th);
        }

        public final void onNext(U u) {
            this.wlf.lazySet(u);
        }

        public final void onSubscribe(d dVar) {
            if (this.wlf.setOther(dVar)) {
                dVar.request(Long.MAX_VALUE);
            }
        }

        FlowableWithLatestSubscriber(WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber) {
            this.wlf = withLatestFromSubscriber;
        }
    }

    static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, d {
        private static final long serialVersionUID = -312246233408980075L;
        final BiFunction<? super T, ? super U, ? extends R> combiner;
        final c<? super R> downstream;
        final AtomicReference<d> other = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<d> upstream = new AtomicReference<>();

        public final void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            SubscriptionHelper.cancel(this.other);
        }

        public final void onComplete() {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onComplete();
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        public final void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        public final boolean setOther(d dVar) {
            return SubscriptionHelper.setOnce(this.other, dVar);
        }

        public final void onError(Throwable th) {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onError(th);
        }

        public final void otherError(Throwable th) {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            if (!tryOnNext(t)) {
                this.upstream.get().request(1);
            }
        }

        public final boolean tryOnNext(T t) {
            Object obj = get();
            if (obj == null) {
                return false;
            }
            try {
                this.downstream.onNext(ObjectHelper.requireNonNull(this.combiner.apply(t, obj), "The combiner returned a null value"));
                return true;
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
                return false;
            }
        }

        WithLatestFromSubscriber(c<? super R> cVar, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.downstream = cVar;
            this.combiner = biFunction;
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(cVar);
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(serializedSubscriber, this.combiner);
        serializedSubscriber.onSubscribe(withLatestFromSubscriber);
        this.other.subscribe(new FlowableWithLatestSubscriber(withLatestFromSubscriber));
        this.source.subscribe((FlowableSubscriber<? super T>) withLatestFromSubscriber);
    }

    public FlowableWithLatestFrom(Flowable<T> flowable, BiFunction<? super T, ? super U, ? extends R> biFunction, b<? extends U> bVar) {
        super(flowable);
        this.combiner = biFunction;
        this.other = bVar;
    }
}
