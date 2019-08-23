package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;

public final class MaybeFlatMapIterableFlowable<T, R> extends Flowable<R> {
    final Function<? super T, ? extends Iterable<? extends R>> mapper;
    final MaybeSource<T> source;

    static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements MaybeObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        volatile boolean cancelled;
        final c<? super R> downstream;

        /* renamed from: it  reason: collision with root package name */
        volatile Iterator<? extends R> f83375it;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        boolean outputFused;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        public final void clear() {
            this.f83375it = null;
        }

        public final boolean isEmpty() {
            if (this.f83375it == null) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void cancel() {
            this.cancelled = true;
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        @Nullable
        public final R poll() throws Exception {
            Iterator<? extends R> it2 = this.f83375it;
            if (it2 == null) {
                return null;
            }
            R requireNonNull = ObjectHelper.requireNonNull(it2.next(), "The iterator returned a null value");
            if (!it2.hasNext()) {
                this.f83375it = null;
            }
            return requireNonNull;
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                c<? super R> cVar = this.downstream;
                Iterator<? extends R> it2 = this.f83375it;
                if (!this.outputFused || it2 == null) {
                    int i = 1;
                    while (true) {
                        if (it2 != null) {
                            long j = this.requested.get();
                            if (j == Long.MAX_VALUE) {
                                fastPath(cVar, it2);
                                return;
                            }
                            long j2 = 0;
                            while (j2 != j) {
                                if (!this.cancelled) {
                                    try {
                                        cVar.onNext(ObjectHelper.requireNonNull(it2.next(), "The iterator returned a null value"));
                                        if (!this.cancelled) {
                                            j2++;
                                            try {
                                                if (!it2.hasNext()) {
                                                    cVar.onComplete();
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Exceptions.throwIfFatal(th);
                                                cVar.onError(th);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        cVar.onError(th2);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            if (j2 != 0) {
                                BackpressureHelper.produced(this.requested, j2);
                            }
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                        if (it2 == null) {
                            it2 = this.f83375it;
                        }
                    }
                } else {
                    cVar.onNext(null);
                    cVar.onComplete();
                }
            }
        }

        public final void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public final void onSuccess(T t) {
            try {
                Iterator<? extends R> it2 = ((Iterable) this.mapper.apply(t)).iterator();
                if (!it2.hasNext()) {
                    this.downstream.onComplete();
                    return;
                }
                this.f83375it = it2;
                drain();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        FlatMapIterableObserver(c<? super R> cVar, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.downstream = cVar;
            this.mapper = function;
        }

        /* access modifiers changed from: package-private */
        public final void fastPath(c<? super R> cVar, Iterator<? extends R> it2) {
            while (!this.cancelled) {
                try {
                    cVar.onNext(it2.next());
                    if (!this.cancelled) {
                        try {
                            if (!it2.hasNext()) {
                                cVar.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            cVar.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cVar.onError(th2);
                    return;
                }
            }
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        this.source.subscribe(new FlatMapIterableObserver(cVar, this.mapper));
    }

    public MaybeFlatMapIterableFlowable(MaybeSource<T> maybeSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.source = maybeSource;
        this.mapper = function;
    }
}
