package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableZip<T, R> extends Observable<R> {
    final int bufferSize;
    final boolean delayError;
    final ObservableSource<? extends T>[] sources;
    final Iterable<? extends ObservableSource<? extends T>> sourcesIterable;
    final Function<? super Object[], ? extends R> zipper;

    static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final Observer<? super R> downstream;
        final ZipObserver<T, R>[] observers;
        final T[] row;
        final Function<? super Object[], ? extends R> zipper;

        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public final void cancel() {
            clear();
            cancelSources();
        }

        /* access modifiers changed from: package-private */
        public final void cancelSources() {
            for (ZipObserver<T, R> dispose : this.observers) {
                dispose.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public final void clear() {
            for (ZipObserver<T, R> zipObserver : this.observers) {
                zipObserver.queue.clear();
            }
        }

        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelSources();
                if (getAndIncrement() == 0) {
                    clear();
                }
            }
        }

        public final void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                ZipObserver<T, R>[] zipObserverArr = this.observers;
                Observer<? super R> observer = this.downstream;
                T[] tArr = this.row;
                boolean z2 = this.delayError;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (ZipObserver<T, R> zipObserver : zipObserverArr) {
                        if (tArr[i2] == null) {
                            boolean z3 = zipObserver.done;
                            T poll = zipObserver.queue.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!checkTerminated(z3, z, observer, z2, zipObserver)) {
                                if (!z) {
                                    tArr[i2] = poll;
                                } else {
                                    i3++;
                                }
                            } else {
                                return;
                            }
                        } else if (zipObserver.done && !z2) {
                            Throwable th = zipObserver.error;
                            if (th != null) {
                                cancel();
                                observer.onError(th);
                                return;
                            }
                        }
                        i2++;
                    }
                    if (i3 == 0) {
                        try {
                            observer.onNext(ObjectHelper.requireNonNull(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                            Arrays.fill(tArr, null);
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            cancel();
                            observer.onError(th2);
                            return;
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
        }

        public final void subscribe(ObservableSource<? extends T>[] observableSourceArr, int i) {
            ZipObserver<T, R>[] zipObserverArr = this.observers;
            int length = zipObserverArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                zipObserverArr[i2] = new ZipObserver<>(this, i);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.cancelled; i3++) {
                observableSourceArr[i3].subscribe(zipObserverArr[i3]);
            }
        }

        ZipCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i, boolean z) {
            this.downstream = observer;
            this.zipper = function;
            this.observers = new ZipObserver[i];
            this.row = (Object[]) new Object[i];
            this.delayError = z;
        }

        /* access modifiers changed from: package-private */
        public final boolean checkTerminated(boolean z, boolean z2, Observer<? super R> observer, boolean z3, ZipObserver<?, ?> zipObserver) {
            if (this.cancelled) {
                cancel();
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = zipObserver.error;
                    if (th != null) {
                        cancel();
                        observer.onError(th);
                        return true;
                    } else if (z2) {
                        cancel();
                        observer.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = zipObserver.error;
                    cancel();
                    if (th2 != null) {
                        observer.onError(th2);
                    } else {
                        observer.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    static final class ZipObserver<T, R> implements Observer<T> {
        volatile boolean done;
        Throwable error;
        final ZipCoordinator<T, R> parent;
        final SpscLinkedArrayQueue<T> queue;
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        public final void dispose() {
            DisposableHelper.dispose(this.upstream);
        }

        public final void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            this.parent.drain();
        }

        public final void onNext(T t) {
            this.queue.offer(t);
            this.parent.drain();
        }

        ZipObserver(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.queue = new SpscLinkedArrayQueue<>(i);
        }
    }

    public final void subscribeActual(Observer<? super R> observer) {
        Observable[] observableArr;
        int i;
        ObservableSource<? extends T>[] observableSourceArr = this.sources;
        if (observableSourceArr == null) {
            observableArr = new Observable[8];
            i = 0;
            for (ObservableSource<? extends T> observableSource : this.sourcesIterable) {
                if (i == observableArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[((i >> 2) + i)];
                    System.arraycopy(observableArr, 0, observableSourceArr2, 0, i);
                    observableArr = observableSourceArr2;
                }
                observableArr[i] = observableSource;
                i++;
            }
        } else {
            observableArr = observableSourceArr;
            i = observableSourceArr.length;
        }
        if (i == 0) {
            EmptyDisposable.complete(observer);
        } else {
            new ZipCoordinator(observer, this.zipper, i, this.delayError).subscribe(observableArr, this.bufferSize);
        }
    }

    public ObservableZip(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.sources = observableSourceArr;
        this.sourcesIterable = iterable;
        this.zipper = function;
        this.bufferSize = i;
        this.delayError = z;
    }
}
