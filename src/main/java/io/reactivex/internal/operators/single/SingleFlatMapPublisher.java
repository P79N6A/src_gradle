package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class SingleFlatMapPublisher<T, R> extends Flowable<R> {
    final Function<? super T, ? extends b<? extends R>> mapper;
    final SingleSource<T> source;

    static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements FlowableSubscriber<T>, SingleObserver<S>, d {
        private static final long serialVersionUID = 7759721921468635667L;
        Disposable disposable;
        final c<? super T> downstream;
        final Function<? super S, ? extends b<? extends T>> mapper;
        final AtomicReference<d> parent = new AtomicReference<>();

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void cancel() {
            this.disposable.dispose();
            SubscriptionHelper.cancel(this.parent);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onSubscribe(Disposable disposable2) {
            this.disposable = disposable2;
            this.downstream.onSubscribe(this);
        }

        public final void request(long j) {
            SubscriptionHelper.deferredRequest(this.parent, this, j);
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.parent, this, dVar);
        }

        public final void onSuccess(S s) {
            try {
                ((b) ObjectHelper.requireNonNull(this.mapper.apply(s), "the mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        SingleFlatMapPublisherObserver(c<? super T> cVar, Function<? super S, ? extends b<? extends T>> function) {
            this.downstream = cVar;
            this.mapper = function;
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        this.source.subscribe(new SingleFlatMapPublisherObserver(cVar, this.mapper));
    }

    public SingleFlatMapPublisher(SingleSource<T> singleSource, Function<? super T, ? extends b<? extends R>> function) {
        this.source = singleSource;
        this.mapper = function;
    }
}
