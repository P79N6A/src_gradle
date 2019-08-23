package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.a.c;

public final class FlowableDistinct<T, K> extends AbstractFlowableWithUpstream<T, T> {
    final Callable<? extends Collection<? super K>> collectionSupplier;
    final Function<? super T, K> keySelector;

    static final class DistinctSubscriber<T, K> extends BasicFuseableSubscriber<T, T> {
        final Collection<? super K> collection;
        final Function<? super T, K> keySelector;

        public final void clear() {
            this.collection.clear();
            super.clear();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.collection.clear();
                this.downstream.onComplete();
            }
        }

        @Nullable
        public final T poll() throws Exception {
            T poll;
            while (true) {
                poll = this.qs.poll();
                if (poll == null || this.collection.add(ObjectHelper.requireNonNull(this.keySelector.apply(poll), "The keySelector returned a null key"))) {
                    return poll;
                }
                if (this.sourceMode == 2) {
                    this.upstream.request(1);
                }
            }
            return poll;
        }

        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.collection.clear();
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode == 0) {
                    try {
                        if (this.collection.add(ObjectHelper.requireNonNull(this.keySelector.apply(t), "The keySelector returned a null key"))) {
                            this.downstream.onNext(t);
                        } else {
                            this.upstream.request(1);
                        }
                    } catch (Throwable th) {
                        fail(th);
                    }
                } else {
                    this.downstream.onNext(null);
                }
            }
        }

        DistinctSubscriber(c<? super T> cVar, Function<? super T, K> function, Collection<? super K> collection2) {
            super(cVar);
            this.keySelector = function;
            this.collection = collection2;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        try {
            this.source.subscribe((FlowableSubscriber<? super T>) new DistinctSubscriber<Object>(cVar, this.keySelector, (Collection) ObjectHelper.requireNonNull(this.collectionSupplier.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }

    public FlowableDistinct(Flowable<T> flowable, Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        super(flowable);
        this.keySelector = function;
        this.collectionSupplier = callable;
    }
}
