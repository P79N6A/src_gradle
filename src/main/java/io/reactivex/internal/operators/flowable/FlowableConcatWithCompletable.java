package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableConcatWithCompletable<T> extends AbstractFlowableWithUpstream<T, T> {
    final CompletableSource other;

    static final class ConcatWithSubscriber<T> extends AtomicReference<Disposable> implements CompletableObserver, FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -7346385463600070225L;
        final c<? super T> downstream;
        boolean inCompletable;
        CompletableSource other;
        d upstream;

        public final void cancel() {
            this.upstream.cancel();
            DisposableHelper.dispose(this);
        }

        public final void onComplete() {
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            this.upstream = SubscriptionHelper.CANCELLED;
            CompletableSource completableSource = this.other;
            this.other = null;
            completableSource.subscribe(this);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
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

        ConcatWithSubscriber(c<? super T> cVar, CompletableSource completableSource) {
            this.downstream = cVar;
            this.other = completableSource;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new ConcatWithSubscriber<Object>(cVar, this.other));
    }

    public FlowableConcatWithCompletable(Flowable<T> flowable, CompletableSource completableSource) {
        super(flowable);
        this.other = completableSource;
    }
}
