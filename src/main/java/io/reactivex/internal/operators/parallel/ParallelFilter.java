package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.a.c;
import org.a.d;

public final class ParallelFilter<T> extends ParallelFlowable<T> {
    final Predicate<? super T> predicate;
    final ParallelFlowable<T> source;

    static abstract class BaseFilterSubscriber<T> implements ConditionalSubscriber<T>, d {
        boolean done;
        final Predicate<? super T> predicate;
        d upstream;

        public final void cancel() {
            this.upstream.cancel();
        }

        BaseFilterSubscriber(Predicate<? super T> predicate2) {
            this.predicate = predicate2;
        }

        public final void request(long j) {
            this.upstream.request(j);
        }

        public final void onNext(T t) {
            if (!tryOnNext(t) && !this.done) {
                this.upstream.request(1);
            }
        }
    }

    static final class ParallelFilterConditionalSubscriber<T> extends BaseFilterSubscriber<T> {
        final ConditionalSubscriber<? super T> downstream;

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public final boolean tryOnNext(T t) {
            if (!this.done) {
                try {
                    if (this.predicate.test(t)) {
                        return this.downstream.tryOnNext(t);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return false;
                }
            }
            return false;
        }

        ParallelFilterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate) {
            super(predicate);
            this.downstream = conditionalSubscriber;
        }
    }

    static final class ParallelFilterSubscriber<T> extends BaseFilterSubscriber<T> {
        final c<? super T> downstream;

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public final boolean tryOnNext(T t) {
            if (!this.done) {
                try {
                    if (this.predicate.test(t)) {
                        this.downstream.onNext(t);
                        return true;
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return false;
                }
            }
            return false;
        }

        ParallelFilterSubscriber(c<? super T> cVar, Predicate<? super T> predicate) {
            super(predicate);
            this.downstream = cVar;
        }
    }

    public final int parallelism() {
        return this.source.parallelism();
    }

    public final void subscribe(c<? super T>[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            c[] cVarArr2 = new c[length];
            for (int i = 0; i < length; i++) {
                ConditionalSubscriber conditionalSubscriber = cVarArr[i];
                if (conditionalSubscriber instanceof ConditionalSubscriber) {
                    cVarArr2[i] = new ParallelFilterConditionalSubscriber(conditionalSubscriber, this.predicate);
                } else {
                    cVarArr2[i] = new ParallelFilterSubscriber(conditionalSubscriber, this.predicate);
                }
            }
            this.source.subscribe(cVarArr2);
        }
    }

    public ParallelFilter(ParallelFlowable<T> parallelFlowable, Predicate<? super T> predicate2) {
        this.source = parallelFlowable;
        this.predicate = predicate2;
    }
}
