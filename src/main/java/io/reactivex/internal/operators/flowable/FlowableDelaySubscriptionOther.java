package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {
    final b<? extends T> main;
    final b<U> other;

    static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 2259811067697317255L;
        final c<? super T> downstream;
        final b<? extends T> main;
        final OtherSubscriber other = new OtherSubscriber<>();
        final AtomicReference<d> upstream = new AtomicReference<>();

        final class OtherSubscriber extends AtomicReference<d> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            public final void onComplete() {
                if (((d) get()) != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.next();
                }
            }

            OtherSubscriber() {
            }

            public final void onSubscribe(d dVar) {
                if (SubscriptionHelper.setOnce(this, dVar)) {
                    dVar.request(Long.MAX_VALUE);
                }
            }

            public final void onError(Throwable th) {
                if (((d) get()) != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.downstream.onError(th);
                } else {
                    RxJavaPlugins.onError(th);
                }
            }

            public final void onNext(Object obj) {
                d dVar = (d) get();
                if (dVar != SubscriptionHelper.CANCELLED) {
                    lazySet(SubscriptionHelper.CANCELLED);
                    dVar.cancel();
                    MainSubscriber.this.next();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void next() {
            this.main.subscribe(this);
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void cancel() {
            SubscriptionHelper.cancel(this.other);
            SubscriptionHelper.cancel(this.upstream);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this, dVar);
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                SubscriptionHelper.deferredRequest(this.upstream, this, j);
            }
        }

        MainSubscriber(c<? super T> cVar, b<? extends T> bVar) {
            this.downstream = cVar;
            this.main = bVar;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        MainSubscriber mainSubscriber = new MainSubscriber(cVar, this.main);
        cVar.onSubscribe(mainSubscriber);
        this.other.subscribe(mainSubscriber.other);
    }

    public FlowableDelaySubscriptionOther(b<? extends T> bVar, b<U> bVar2) {
        this.main = bVar;
        this.other = bVar2;
    }
}
