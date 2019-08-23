package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.a.c;

public final class FlowableFilter<T> extends AbstractFlowableWithUpstream<T, T> {
    final Predicate<? super T> predicate;

    static final class FilterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        final Predicate<? super T> filter;

        @Nullable
        public final T poll() throws Exception {
            QueueSubscription queueSubscription = this.qs;
            Predicate<? super T> predicate = this.filter;
            while (true) {
                T poll = queueSubscription.poll();
                if (poll == null) {
                    return null;
                }
                if (predicate.test(poll)) {
                    return poll;
                }
                if (this.sourceMode == 2) {
                    queueSubscription.request(1);
                }
            }
        }

        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        public final void onNext(T t) {
            if (!tryOnNext(t)) {
                this.upstream.request(1);
            }
        }

        public final boolean tryOnNext(T t) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                return this.downstream.tryOnNext(null);
            }
            try {
                if (!this.filter.test(t) || !this.downstream.tryOnNext(t)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                fail(th);
                return true;
            }
        }

        FilterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate) {
            super(conditionalSubscriber);
            this.filter = predicate;
        }
    }

    static final class FilterSubscriber<T> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {
        final Predicate<? super T> filter;

        @Nullable
        public final T poll() throws Exception {
            QueueSubscription queueSubscription = this.qs;
            Predicate<? super T> predicate = this.filter;
            while (true) {
                T poll = queueSubscription.poll();
                if (poll == null) {
                    return null;
                }
                if (predicate.test(poll)) {
                    return poll;
                }
                if (this.sourceMode == 2) {
                    queueSubscription.request(1);
                }
            }
        }

        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        public final void onNext(T t) {
            if (!tryOnNext(t)) {
                this.upstream.request(1);
            }
        }

        public final boolean tryOnNext(T t) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return true;
            }
            try {
                boolean test = this.filter.test(t);
                if (test) {
                    this.downstream.onNext(t);
                }
                return test;
            } catch (Throwable th) {
                fail(th);
                return true;
            }
        }

        FilterSubscriber(c<? super T> cVar, Predicate<? super T> predicate) {
            super(cVar);
            this.filter = predicate;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber<? super T>) new FilterConditionalSubscriber<Object>((ConditionalSubscriber) cVar, this.predicate));
        } else {
            this.source.subscribe((FlowableSubscriber<? super T>) new FilterSubscriber<Object>(cVar, this.predicate));
        }
    }

    public FlowableFilter(Flowable<T> flowable, Predicate<? super T> predicate2) {
        super(flowable);
        this.predicate = predicate2;
    }
}
