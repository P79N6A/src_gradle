package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.d;

public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {
    final b<U> other;

    static final class DelayMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        private static final long serialVersionUID = 706635022205076709L;
        final MaybeObserver<? super T> downstream;

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        DelayMaybeObserver(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    static final class OtherSubscriber<T> implements FlowableSubscriber<Object>, Disposable {
        final DelayMaybeObserver<T> main;
        MaybeSource<T> source;
        d upstream;

        public final void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
            DisposableHelper.dispose(this.main);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) this.main.get());
        }

        public final void onComplete() {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.upstream = SubscriptionHelper.CANCELLED;
                subscribeNext();
            }
        }

        /* access modifiers changed from: package-private */
        public final void subscribeNext() {
            MaybeSource<T> maybeSource = this.source;
            this.source = null;
            maybeSource.subscribe(this.main);
        }

        public final void onError(Throwable th) {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.upstream = SubscriptionHelper.CANCELLED;
                this.main.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onNext(Object obj) {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.upstream.cancel();
                this.upstream = SubscriptionHelper.CANCELLED;
                subscribeNext();
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.main.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        OtherSubscriber(MaybeObserver<? super T> maybeObserver, MaybeSource<T> maybeSource) {
            this.main = new DelayMaybeObserver<>(maybeObserver);
            this.source = maybeSource;
        }
    }

    public final void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.other.subscribe(new OtherSubscriber(maybeObserver, this.source));
    }

    public MaybeDelaySubscriptionOtherPublisher(MaybeSource<T> maybeSource, b<U> bVar) {
        super(maybeSource);
        this.other = bVar;
    }
}
