package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableSamplePublisher<T> extends Flowable<T> {
    final boolean emitLast;
    final b<?> other;
    final b<T> source;

    static final class SampleMainEmitLast<T> extends SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final AtomicInteger wip = new AtomicInteger();

        /* access modifiers changed from: package-private */
        public final void completeMain() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final void completeOther() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final void run() {
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z = this.done;
                    emit();
                    if (z) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }

        SampleMainEmitLast(c<? super T> cVar, b<?> bVar) {
            super(cVar, bVar);
        }
    }

    static final class SampleMainNoLast<T> extends SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* access modifiers changed from: package-private */
        public final void run() {
            emit();
        }

        /* access modifiers changed from: package-private */
        public final void completeMain() {
            this.downstream.onComplete();
        }

        /* access modifiers changed from: package-private */
        public final void completeOther() {
            this.downstream.onComplete();
        }

        SampleMainNoLast(c<? super T> cVar, b<?> bVar) {
            super(cVar, bVar);
        }
    }

    static abstract class SamplePublisherSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -3517602651313910099L;
        final c<? super T> downstream;
        final AtomicReference<d> other = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final b<?> sampler;
        d upstream;

        /* access modifiers changed from: package-private */
        public abstract void completeMain();

        /* access modifiers changed from: package-private */
        public abstract void completeOther();

        /* access modifiers changed from: package-private */
        public abstract void run();

        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            this.upstream.cancel();
        }

        public void complete() {
            this.upstream.cancel();
            completeOther();
        }

        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            completeMain();
        }

        /* access modifiers changed from: package-private */
        public void emit() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(andSet);
                    BackpressureHelper.produced(this.requested, 1);
                    return;
                }
                cancel();
                this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
            }
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void error(Throwable th) {
            this.upstream.cancel();
            this.downstream.onError(th);
        }

        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onError(th);
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
            }
        }

        /* access modifiers changed from: package-private */
        public void setOther(d dVar) {
            SubscriptionHelper.setOnce(this.other, dVar, Long.MAX_VALUE);
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new SamplerSubscriber(this));
                    dVar.request(Long.MAX_VALUE);
                }
            }
        }

        SamplePublisherSubscriber(c<? super T> cVar, b<?> bVar) {
            this.downstream = cVar;
            this.sampler = bVar;
        }
    }

    static final class SamplerSubscriber<T> implements FlowableSubscriber<Object> {
        final SamplePublisherSubscriber<T> parent;

        public final void onComplete() {
            this.parent.complete();
        }

        SamplerSubscriber(SamplePublisherSubscriber<T> samplePublisherSubscriber) {
            this.parent = samplePublisherSubscriber;
        }

        public final void onError(Throwable th) {
            this.parent.error(th);
        }

        public final void onNext(Object obj) {
            this.parent.run();
        }

        public final void onSubscribe(d dVar) {
            this.parent.setOther(dVar);
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(cVar);
        if (this.emitLast) {
            this.source.subscribe(new SampleMainEmitLast(serializedSubscriber, this.other));
        } else {
            this.source.subscribe(new SampleMainNoLast(serializedSubscriber, this.other));
        }
    }

    public FlowableSamplePublisher(b<T> bVar, b<?> bVar2, boolean z) {
        this.source = bVar;
        this.other = bVar2;
        this.emitLast = z;
    }
}
