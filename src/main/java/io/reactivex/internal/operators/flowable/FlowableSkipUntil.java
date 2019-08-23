package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableSkipUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {
    final b<U> other;

    static final class SkipUntilMainSubscriber<T> extends AtomicInteger implements ConditionalSubscriber<T>, d {
        private static final long serialVersionUID = -6270983465606289181L;
        final c<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        volatile boolean gate;
        final OtherSubscriber other = new OtherSubscriber<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<d> upstream = new AtomicReference<>();

        final class OtherSubscriber extends AtomicReference<d> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -5592042965931999169L;

            public final void onComplete() {
                SkipUntilMainSubscriber.this.gate = true;
            }

            OtherSubscriber() {
            }

            public final void onNext(Object obj) {
                SkipUntilMainSubscriber.this.gate = true;
                ((d) get()).cancel();
            }

            public final void onSubscribe(d dVar) {
                SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
            }

            public final void onError(Throwable th) {
                SubscriptionHelper.cancel(SkipUntilMainSubscriber.this.upstream);
                HalfSerializer.onError(SkipUntilMainSubscriber.this.downstream, th, (AtomicInteger) SkipUntilMainSubscriber.this, SkipUntilMainSubscriber.this.error);
            }
        }

        public final void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            SubscriptionHelper.cancel(this.other);
        }

        public final void onComplete() {
            SubscriptionHelper.cancel(this.other);
            HalfSerializer.onComplete(this.downstream, (AtomicInteger) this, this.error);
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        public final void request(long j) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
        }

        public final void onError(Throwable th) {
            SubscriptionHelper.cancel(this.other);
            HalfSerializer.onError(this.downstream, th, (AtomicInteger) this, this.error);
        }

        public final boolean tryOnNext(T t) {
            if (!this.gate) {
                return false;
            }
            HalfSerializer.onNext(this.downstream, t, (AtomicInteger) this, this.error);
            return true;
        }

        public final void onNext(T t) {
            if (!tryOnNext(t)) {
                this.upstream.get().request(1);
            }
        }

        SkipUntilMainSubscriber(c<? super T> cVar) {
            this.downstream = cVar;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        SkipUntilMainSubscriber skipUntilMainSubscriber = new SkipUntilMainSubscriber(cVar);
        cVar.onSubscribe(skipUntilMainSubscriber);
        this.other.subscribe(skipUntilMainSubscriber.other);
        this.source.subscribe((FlowableSubscriber<? super T>) skipUntilMainSubscriber);
    }

    public FlowableSkipUntil(Flowable<T> flowable, b<U> bVar) {
        super(flowable);
        this.other = bVar;
    }
}
