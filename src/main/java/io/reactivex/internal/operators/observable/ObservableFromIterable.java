package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

public final class ObservableFromIterable<T> extends Observable<T> {
    final Iterable<? extends T> source;

    static final class FromIterableDisposable<T> extends BasicQueueDisposable<T> {
        boolean checkNext;
        volatile boolean disposed;
        boolean done;
        final Observer<? super T> downstream;
        boolean fusionMode;

        /* renamed from: it  reason: collision with root package name */
        final Iterator<? extends T> f83378it;

        public final void clear() {
            this.done = true;
        }

        public final void dispose() {
            this.disposed = true;
        }

        public final boolean isDisposed() {
            return this.disposed;
        }

        public final boolean isEmpty() {
            return this.done;
        }

        @Nullable
        public final T poll() {
            if (this.done) {
                return null;
            }
            if (!this.checkNext) {
                this.checkNext = true;
            } else if (!this.f83378it.hasNext()) {
                this.done = true;
                return null;
            }
            return ObjectHelper.requireNonNull(this.f83378it.next(), "The iterator returned a null value");
        }

        /* access modifiers changed from: package-private */
        public final void run() {
            while (!isDisposed()) {
                try {
                    this.downstream.onNext(ObjectHelper.requireNonNull(this.f83378it.next(), "The iterator returned a null value"));
                    if (!isDisposed()) {
                        try {
                            if (!this.f83378it.hasNext()) {
                                if (!isDisposed()) {
                                    this.downstream.onComplete();
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.downstream.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.downstream.onError(th2);
                    return;
                }
            }
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.fusionMode = true;
            return 1;
        }

        FromIterableDisposable(Observer<? super T> observer, Iterator<? extends T> it2) {
            this.downstream = observer;
            this.f83378it = it2;
        }
    }

    public ObservableFromIterable(Iterable<? extends T> iterable) {
        this.source = iterable;
    }

    public final void subscribeActual(Observer<? super T> observer) {
        try {
            Iterator<? extends T> it2 = this.source.iterator();
            try {
                if (!it2.hasNext()) {
                    EmptyDisposable.complete(observer);
                    return;
                }
                FromIterableDisposable fromIterableDisposable = new FromIterableDisposable(observer, it2);
                observer.onSubscribe(fromIterableDisposable);
                if (!fromIterableDisposable.fusionMode) {
                    fromIterableDisposable.run();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptyDisposable.error(th, observer);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
