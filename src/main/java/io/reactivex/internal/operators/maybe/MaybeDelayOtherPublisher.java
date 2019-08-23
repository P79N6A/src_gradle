package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.d;

public final class MaybeDelayOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {
    final b<U> other;

    static final class DelayMaybeObserver<T, U> implements MaybeObserver<T>, Disposable {
        final OtherSubscriber<T> other;
        final b<U> otherSource;
        Disposable upstream;

        public final void onComplete() {
            this.upstream = DisposableHelper.DISPOSED;
            subscribeNext();
        }

        /* access modifiers changed from: package-private */
        public final void subscribeNext() {
            this.otherSource.subscribe(this.other);
        }

        public final void dispose() {
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
            SubscriptionHelper.cancel(this.other);
        }

        public final boolean isDisposed() {
            if (this.other.get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        public final void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.other.error = th;
            subscribeNext();
        }

        public final void onSuccess(T t) {
            this.upstream = DisposableHelper.DISPOSED;
            this.other.value = t;
            subscribeNext();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.other.downstream.onSubscribe(this);
            }
        }

        DelayMaybeObserver(MaybeObserver<? super T> maybeObserver, b<U> bVar) {
            this.other = new OtherSubscriber<>(maybeObserver);
            this.otherSource = bVar;
        }
    }

    static final class OtherSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = -1215060610805418006L;
        final MaybeObserver<? super T> downstream;
        Throwable error;
        T value;

        public final void onComplete() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
                return;
            }
            T t = this.value;
            if (t != null) {
                this.downstream.onSuccess(t);
            } else {
                this.downstream.onComplete();
            }
        }

        OtherSubscriber(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
        }

        public final void onError(Throwable th) {
            Throwable th2 = this.error;
            if (th2 == null) {
                this.downstream.onError(th);
                return;
            }
            this.downstream.onError(new CompositeException(th2, th));
        }

        public final void onNext(Object obj) {
            d dVar = (d) get();
            if (dVar != SubscriptionHelper.CANCELLED) {
                lazySet(SubscriptionHelper.CANCELLED);
                dVar.cancel();
                onComplete();
            }
        }
    }

    public final void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new DelayMaybeObserver(maybeObserver, this.other));
    }

    public MaybeDelayOtherPublisher(MaybeSource<T> maybeSource, b<U> bVar) {
        super(maybeSource);
        this.other = bVar;
    }
}
