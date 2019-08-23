package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableMergeWithCompletable<T> extends AbstractFlowableWithUpstream<T, T> {
    final CompletableSource other;

    static final class MergeWithSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -4592979584110982903L;
        final c<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        volatile boolean mainDone;
        final AtomicReference<d> mainSubscription = new AtomicReference<>();
        volatile boolean otherDone;
        final OtherObserver otherObserver = new OtherObserver(this);
        final AtomicLong requested = new AtomicLong();

        static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithSubscriber<?> parent;

            public final void onComplete() {
                this.parent.otherComplete();
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            OtherObserver(MergeWithSubscriber<?> mergeWithSubscriber) {
                this.parent = mergeWithSubscriber;
            }

            public final void onError(Throwable th) {
                this.parent.otherError(th);
            }
        }

        public final void cancel() {
            SubscriptionHelper.cancel(this.mainSubscription);
            DisposableHelper.dispose(this.otherObserver);
        }

        public final void onComplete() {
            this.mainDone = true;
            if (this.otherDone) {
                HalfSerializer.onComplete(this.downstream, (AtomicInteger) this, this.error);
            }
        }

        /* access modifiers changed from: package-private */
        public final void otherComplete() {
            this.otherDone = true;
            if (this.mainDone) {
                HalfSerializer.onComplete(this.downstream, (AtomicInteger) this, this.error);
            }
        }

        public final void onNext(T t) {
            HalfSerializer.onNext(this.downstream, t, (AtomicInteger) this, this.error);
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.mainSubscription, this.requested, dVar);
        }

        public final void request(long j) {
            SubscriptionHelper.deferredRequest(this.mainSubscription, this.requested, j);
        }

        public final void onError(Throwable th) {
            SubscriptionHelper.cancel(this.mainSubscription);
            HalfSerializer.onError(this.downstream, th, (AtomicInteger) this, this.error);
        }

        /* access modifiers changed from: package-private */
        public final void otherError(Throwable th) {
            SubscriptionHelper.cancel(this.mainSubscription);
            HalfSerializer.onError(this.downstream, th, (AtomicInteger) this, this.error);
        }

        MergeWithSubscriber(c<? super T> cVar) {
            this.downstream = cVar;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        MergeWithSubscriber mergeWithSubscriber = new MergeWithSubscriber(cVar);
        cVar.onSubscribe(mergeWithSubscriber);
        this.source.subscribe((FlowableSubscriber<? super T>) mergeWithSubscriber);
        this.other.subscribe(mergeWithSubscriber.otherObserver);
    }

    public FlowableMergeWithCompletable(Flowable<T> flowable, CompletableSource completableSource) {
        super(flowable);
        this.other = completableSource;
    }
}
