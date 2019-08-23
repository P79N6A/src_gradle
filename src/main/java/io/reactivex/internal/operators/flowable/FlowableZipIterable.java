package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import org.a.c;
import org.a.d;

public final class FlowableZipIterable<T, U, V> extends AbstractFlowableWithUpstream<T, V> {
    final Iterable<U> other;
    final BiFunction<? super T, ? super U, ? extends V> zipper;

    static final class ZipIterableSubscriber<T, U, V> implements FlowableSubscriber<T>, d {
        boolean done;
        final c<? super V> downstream;
        final Iterator<U> iterator;
        d upstream;
        final BiFunction<? super T, ? super U, ? extends V> zipper;

        public final void cancel() {
            this.upstream.cancel();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public final void request(long j) {
            this.upstream.request(j);
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void error(Throwable th) {
            Exceptions.throwIfFatal(th);
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(th);
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            if (!this.done) {
                try {
                    try {
                        this.downstream.onNext(ObjectHelper.requireNonNull(this.zipper.apply(t, ObjectHelper.requireNonNull(this.iterator.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                        try {
                            if (!this.iterator.hasNext()) {
                                this.done = true;
                                this.upstream.cancel();
                                this.downstream.onComplete();
                            }
                        } catch (Throwable th) {
                            error(th);
                        }
                    } catch (Throwable th2) {
                        error(th2);
                    }
                } catch (Throwable th3) {
                    error(th3);
                }
            }
        }

        ZipIterableSubscriber(c<? super V> cVar, Iterator<U> it2, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.downstream = cVar;
            this.iterator = it2;
            this.zipper = biFunction;
        }
    }

    public final void subscribeActual(c<? super V> cVar) {
        try {
            Iterator it2 = (Iterator) ObjectHelper.requireNonNull(this.other.iterator(), "The iterator returned by other is null");
            try {
                if (!it2.hasNext()) {
                    EmptySubscription.complete(cVar);
                } else {
                    this.source.subscribe((FlowableSubscriber<? super T>) new ZipIterableSubscriber<Object>(cVar, it2, this.zipper));
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, cVar);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, cVar);
        }
    }

    public FlowableZipIterable(Flowable<T> flowable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        super(flowable);
        this.other = iterable;
        this.zipper = biFunction;
    }
}
