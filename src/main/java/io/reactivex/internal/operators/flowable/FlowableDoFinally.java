package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.a.c;
import org.a.d;

public final class FlowableDoFinally<T> extends AbstractFlowableWithUpstream<T, T> {
    final Action onFinally;

    static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final ConditionalSubscriber<? super T> downstream;
        final Action onFinally;
        QueueSubscription<T> qs;
        boolean syncFused;
        d upstream;

        public final void clear() {
            this.qs.clear();
        }

        public final boolean isEmpty() {
            return this.qs.isEmpty();
        }

        public final void cancel() {
            this.upstream.cancel();
            runFinally();
        }

        public final void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Nullable
        public final T poll() throws Exception {
            T poll = this.qs.poll();
            if (poll == null && this.syncFused) {
                runFinally();
            }
            return poll;
        }

        /* access modifiers changed from: package-private */
        public final void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void request(long j) {
            this.upstream.request(j);
        }

        public final boolean tryOnNext(T t) {
            return this.downstream.tryOnNext(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    this.qs = (QueueSubscription) dVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        public final int requestFusion(int i) {
            QueueSubscription<T> queueSubscription = this.qs;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = queueSubscription.requestFusion(i);
            if (requestFusion != 0) {
                boolean z = true;
                if (requestFusion != 1) {
                    z = false;
                }
                this.syncFused = z;
            }
            return requestFusion;
        }

        DoFinallyConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Action action) {
            this.downstream = conditionalSubscriber;
            this.onFinally = action;
        }
    }

    static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final c<? super T> downstream;
        final Action onFinally;
        QueueSubscription<T> qs;
        boolean syncFused;
        d upstream;

        public final void clear() {
            this.qs.clear();
        }

        public final boolean isEmpty() {
            return this.qs.isEmpty();
        }

        public final void cancel() {
            this.upstream.cancel();
            runFinally();
        }

        public final void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Nullable
        public final T poll() throws Exception {
            T poll = this.qs.poll();
            if (poll == null && this.syncFused) {
                runFinally();
            }
            return poll;
        }

        /* access modifiers changed from: package-private */
        public final void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void request(long j) {
            this.upstream.request(j);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    this.qs = (QueueSubscription) dVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        public final int requestFusion(int i) {
            QueueSubscription<T> queueSubscription = this.qs;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = queueSubscription.requestFusion(i);
            if (requestFusion != 0) {
                boolean z = true;
                if (requestFusion != 1) {
                    z = false;
                }
                this.syncFused = z;
            }
            return requestFusion;
        }

        DoFinallySubscriber(c<? super T> cVar, Action action) {
            this.downstream = cVar;
            this.onFinally = action;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber<? super T>) new DoFinallyConditionalSubscriber<Object>((ConditionalSubscriber) cVar, this.onFinally));
        } else {
            this.source.subscribe((FlowableSubscriber<? super T>) new DoFinallySubscriber<Object>(cVar, this.onFinally));
        }
    }

    public FlowableDoFinally(Flowable<T> flowable, Action action) {
        super(flowable);
        this.onFinally = action;
    }
}
