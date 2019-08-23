package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.a.c;

public final class FlowableDoAfterNext<T> extends AbstractFlowableWithUpstream<T, T> {
    final Consumer<? super T> onAfterNext;

    static final class DoAfterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        final Consumer<? super T> onAfterNext;

        @Nullable
        public final T poll() throws Exception {
            T poll = this.qs.poll();
            if (poll != null) {
                this.onAfterNext.accept(poll);
            }
            return poll;
        }

        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
            if (this.sourceMode == 0) {
                try {
                    this.onAfterNext.accept(t);
                } catch (Throwable th) {
                    fail(th);
                }
            }
        }

        public final boolean tryOnNext(T t) {
            boolean tryOnNext = this.downstream.tryOnNext(t);
            try {
                this.onAfterNext.accept(t);
            } catch (Throwable th) {
                fail(th);
            }
            return tryOnNext;
        }

        DoAfterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer) {
            super(conditionalSubscriber);
            this.onAfterNext = consumer;
        }
    }

    static final class DoAfterSubscriber<T> extends BasicFuseableSubscriber<T, T> {
        final Consumer<? super T> onAfterNext;

        @Nullable
        public final T poll() throws Exception {
            T poll = this.qs.poll();
            if (poll != null) {
                this.onAfterNext.accept(poll);
            }
            return poll;
        }

        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        public final void onNext(T t) {
            if (!this.done) {
                this.downstream.onNext(t);
                if (this.sourceMode == 0) {
                    try {
                        this.onAfterNext.accept(t);
                    } catch (Throwable th) {
                        fail(th);
                    }
                }
            }
        }

        DoAfterSubscriber(c<? super T> cVar, Consumer<? super T> consumer) {
            super(cVar);
            this.onAfterNext = consumer;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber<? super T>) new DoAfterConditionalSubscriber<Object>((ConditionalSubscriber) cVar, this.onAfterNext));
        } else {
            this.source.subscribe((FlowableSubscriber<? super T>) new DoAfterSubscriber<Object>(cVar, this.onAfterNext));
        }
    }

    public FlowableDoAfterNext(Flowable<T> flowable, Consumer<? super T> consumer) {
        super(flowable);
        this.onAfterNext = consumer;
    }
}
