package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.a.c;
import org.a.d;

public final class ParallelCollect<T, C> extends ParallelFlowable<C> {
    final BiConsumer<? super C, ? super T> collector;
    final Callable<? extends C> initialCollection;
    final ParallelFlowable<? extends T> source;

    static final class ParallelCollectSubscriber<T, C> extends DeferredScalarSubscriber<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;
        C collection;
        final BiConsumer<? super C, ? super T> collector;
        boolean done;

        public final void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                C c2 = this.collection;
                this.collection = null;
                complete(c2);
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.collection = null;
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            if (!this.done) {
                try {
                    this.collector.accept(this.collection, t);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                }
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        ParallelCollectSubscriber(c<? super C> cVar, C c2, BiConsumer<? super C, ? super T> biConsumer) {
            super(cVar);
            this.collection = c2;
            this.collector = biConsumer;
        }
    }

    public final int parallelism() {
        return this.source.parallelism();
    }

    public final void subscribe(c<? super C>[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            c[] cVarArr2 = new c[length];
            int i = 0;
            while (i < length) {
                try {
                    cVarArr2[i] = new ParallelCollectSubscriber(cVarArr[i], ObjectHelper.requireNonNull(this.initialCollection.call(), "The initialSupplier returned a null value"), this.collector);
                    i++;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    reportError(cVarArr, th);
                    return;
                }
            }
            this.source.subscribe(cVarArr2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void reportError(c<?>[] cVarArr, Throwable th) {
        for (c<?> error : cVarArr) {
            EmptySubscription.error(th, error);
        }
    }

    public ParallelCollect(ParallelFlowable<? extends T> parallelFlowable, Callable<? extends C> callable, BiConsumer<? super C, ? super T> biConsumer) {
        this.source = parallelFlowable;
        this.initialCollection = callable;
        this.collector = biConsumer;
    }
}
