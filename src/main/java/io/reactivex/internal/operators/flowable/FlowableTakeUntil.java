package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableTakeUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {
    final b<? extends U> other;

    static final class TakeUntilMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -4945480365982832967L;
        final c<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final OtherSubscriber other = new OtherSubscriber<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<d> upstream = new AtomicReference<>();

        final class OtherSubscriber extends AtomicReference<d> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            public final void onComplete() {
                SubscriptionHelper.cancel(TakeUntilMainSubscriber.this.upstream);
                HalfSerializer.onComplete(TakeUntilMainSubscriber.this.downstream, (AtomicInteger) TakeUntilMainSubscriber.this, TakeUntilMainSubscriber.this.error);
            }

            OtherSubscriber() {
            }

            public final void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                onComplete();
            }

            public final void onSubscribe(d dVar) {
                SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
            }

            public final void onError(Throwable th) {
                SubscriptionHelper.cancel(TakeUntilMainSubscriber.this.upstream);
                HalfSerializer.onError(TakeUntilMainSubscriber.this.downstream, th, (AtomicInteger) TakeUntilMainSubscriber.this, TakeUntilMainSubscriber.this.error);
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

        public final void onNext(T t) {
            HalfSerializer.onNext(this.downstream, t, (AtomicInteger) this, this.error);
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

        TakeUntilMainSubscriber(c<? super T> cVar) {
            this.downstream = cVar;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        TakeUntilMainSubscriber takeUntilMainSubscriber = new TakeUntilMainSubscriber(cVar);
        cVar.onSubscribe(takeUntilMainSubscriber);
        this.other.subscribe(takeUntilMainSubscriber.other);
        this.source.subscribe((FlowableSubscriber<? super T>) takeUntilMainSubscriber);
    }

    public FlowableTakeUntil(Flowable<T> flowable, b<? extends U> bVar) {
        super(flowable);
        this.other = bVar;
    }
}
