package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class CompletableAndThenPublisher<R> extends Flowable<R> {
    final b<? extends R> other;
    final CompletableSource source;

    static final class AndThenPublisherSubscriber<R> extends AtomicReference<d> implements CompletableObserver, FlowableSubscriber<R>, d {
        private static final long serialVersionUID = -8948264376121066672L;
        final c<? super R> downstream;
        b<? extends R> other;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        public final void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        public final void onComplete() {
            b<? extends R> bVar = this.other;
            if (bVar == null) {
                this.downstream.onComplete();
                return;
            }
            this.other = null;
            bVar.subscribe(this);
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

        AndThenPublisherSubscriber(c<? super R> cVar, b<? extends R> bVar) {
            this.downstream = cVar;
            this.other = bVar;
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        this.source.subscribe(new AndThenPublisherSubscriber(cVar, this.other));
    }

    public CompletableAndThenPublisher(CompletableSource completableSource, b<? extends R> bVar) {
        this.source = completableSource;
        this.other = bVar;
    }
}
