package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.a.d;

public final class FlowableElementAtMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {
    final long index;
    final Flowable<T> source;

    static final class ElementAtSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        long count;
        boolean done;
        final MaybeObserver<? super T> downstream;
        final long index;
        d upstream;

        public final void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        public final boolean isDisposed() {
            if (this.upstream == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            this.upstream = SubscriptionHelper.CANCELLED;
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.upstream = SubscriptionHelper.CANCELLED;
            this.downstream.onError(th);
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                long j = this.count;
                if (j == this.index) {
                    this.done = true;
                    this.upstream.cancel();
                    this.upstream = SubscriptionHelper.CANCELLED;
                    this.downstream.onSuccess(t);
                    return;
                }
                this.count = j + 1;
            }
        }

        ElementAtSubscriber(MaybeObserver<? super T> maybeObserver, long j) {
            this.downstream = maybeObserver;
            this.index = j;
        }
    }

    public final Flowable<T> fuseToFlowable() {
        FlowableElementAt flowableElementAt = new FlowableElementAt(this.source, this.index, null, false);
        return RxJavaPlugins.onAssembly((Flowable<T>) flowableElementAt);
    }

    public final void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe((FlowableSubscriber<? super T>) new ElementAtSubscriber<Object>(maybeObserver, this.index));
    }

    public FlowableElementAtMaybe(Flowable<T> flowable, long j) {
        this.source = flowable;
        this.index = j;
    }
}
