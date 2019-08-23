package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class MaybeFlatMapPublisher<T, R> extends Flowable<R> {
    final Function<? super T, ? extends b<? extends R>> mapper;
    final MaybeSource<T> source;

    static final class FlatMapPublisherSubscriber<T, R> extends AtomicReference<d> implements FlowableSubscriber<R>, MaybeObserver<T>, d {
        private static final long serialVersionUID = -8948264376121066672L;
        final c<? super R> downstream;
        final Function<? super T, ? extends b<? extends R>> mapper;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onNext(R r) {
            this.downstream.onNext(r);
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, dVar);
        }

        public final void request(long j) {
            SubscriptionHelper.deferredRequest(this, this.requested, j);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            try {
                ((b) ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        FlatMapPublisherSubscriber(c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function) {
            this.downstream = cVar;
            this.mapper = function;
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        this.source.subscribe(new FlatMapPublisherSubscriber(cVar, this.mapper));
    }

    public MaybeFlatMapPublisher(MaybeSource<T> maybeSource, Function<? super T, ? extends b<? extends R>> function) {
        this.source = maybeSource;
        this.mapper = function;
    }
}
