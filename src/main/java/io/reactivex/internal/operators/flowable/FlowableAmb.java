package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableAmb<T> extends Flowable<T> {
    final b<? extends T>[] sources;
    final Iterable<? extends b<? extends T>> sourcesIterable;

    static final class AmbCoordinator<T> implements d {
        final c<? super T> downstream;
        final AmbInnerSubscriber<T>[] subscribers;
        final AtomicInteger winner = new AtomicInteger();

        public final void cancel() {
            if (this.winner.get() != -1) {
                this.winner.lazySet(-1);
                for (AmbInnerSubscriber<T> cancel : this.subscribers) {
                    cancel.cancel();
                }
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                int i = this.winner.get();
                if (i > 0) {
                    this.subscribers[i - 1].request(j);
                } else if (i == 0) {
                    for (AmbInnerSubscriber<T> request : this.subscribers) {
                        request.request(j);
                    }
                }
            }
        }

        public final void subscribe(b<? extends T>[] bVarArr) {
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                ambInnerSubscriberArr[i] = new AmbInnerSubscriber<>(this, i2, this.downstream);
                i = i2;
            }
            this.winner.lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.winner.get() == 0; i3++) {
                bVarArr[i3].subscribe(ambInnerSubscriberArr[i3]);
            }
        }

        public final boolean win(int i) {
            int i2 = 0;
            if (this.winner.get() != 0 || !this.winner.compareAndSet(0, i)) {
                return false;
            }
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (i3 != i) {
                    ambInnerSubscriberArr[i2].cancel();
                }
                i2 = i3;
            }
            return true;
        }

        AmbCoordinator(c<? super T> cVar, int i) {
            this.downstream = cVar;
            this.subscribers = new AmbInnerSubscriber[i];
        }
    }

    static final class AmbInnerSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -1185974347409665484L;
        final c<? super T> downstream;
        final int index;
        final AtomicLong missedRequested = new AtomicLong();
        final AmbCoordinator<T> parent;
        boolean won;

        public final void cancel() {
            SubscriptionHelper.cancel(this);
        }

        public final void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            } else {
                ((d) get()).cancel();
            }
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this, this.missedRequested, dVar);
        }

        public final void request(long j) {
            SubscriptionHelper.deferredRequest(this, this.missedRequested, j);
        }

        public final void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                ((d) get()).cancel();
                RxJavaPlugins.onError(th);
            }
        }

        public final void onNext(T t) {
            if (this.won) {
                this.downstream.onNext(t);
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onNext(t);
            } else {
                ((d) get()).cancel();
            }
        }

        AmbInnerSubscriber(AmbCoordinator<T> ambCoordinator, int i, c<? super T> cVar) {
            this.parent = ambCoordinator;
            this.index = i;
            this.downstream = cVar;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        int i;
        b<? extends T>[] bVarArr = this.sources;
        if (bVarArr == null) {
            bVarArr = new b[8];
            try {
                i = 0;
                for (b<? extends T> bVar : this.sourcesIterable) {
                    if (bVar == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), cVar);
                        return;
                    }
                    if (i == bVarArr.length) {
                        b<? extends T>[] bVarArr2 = new b[((i >> 2) + i)];
                        System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
                        bVarArr = bVarArr2;
                    }
                    int i2 = i + 1;
                    bVarArr[i] = bVar;
                    i = i2;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, cVar);
                return;
            }
        } else {
            i = bVarArr.length;
        }
        if (i == 0) {
            EmptySubscription.complete(cVar);
        } else if (i == 1) {
            bVarArr[0].subscribe(cVar);
        } else {
            new AmbCoordinator(cVar, i).subscribe(bVarArr);
        }
    }

    public FlowableAmb(b<? extends T>[] bVarArr, Iterable<? extends b<? extends T>> iterable) {
        this.sources = bVarArr;
        this.sourcesIterable = iterable;
    }
}
