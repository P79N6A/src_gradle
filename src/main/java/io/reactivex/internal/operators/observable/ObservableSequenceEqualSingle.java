package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {
    final int bufferSize;
    final BiPredicate<? super T, ? super T> comparer;
    final ObservableSource<? extends T> first;
    final ObservableSource<? extends T> second;

    static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final BiPredicate<? super T, ? super T> comparer;
        final SingleObserver<? super Boolean> downstream;
        final ObservableSource<? extends T> first;
        final EqualObserver<T>[] observers;
        final ArrayCompositeDisposable resources = new ArrayCompositeDisposable(2);
        final ObservableSource<? extends T> second;
        T v1;
        T v2;

        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public final void subscribe() {
            EqualObserver<T>[] equalObserverArr = this.observers;
            this.first.subscribe(equalObserverArr[0]);
            this.second.subscribe(equalObserverArr[1]);
        }

        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.resources.dispose();
                if (getAndIncrement() == 0) {
                    EqualObserver<T>[] equalObserverArr = this.observers;
                    equalObserverArr[0].queue.clear();
                    equalObserverArr[1].queue.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                EqualObserver<T>[] equalObserverArr = this.observers;
                EqualObserver<T> equalObserver = equalObserverArr[0];
                SpscLinkedArrayQueue<T> spscLinkedArrayQueue = equalObserver.queue;
                EqualObserver<T> equalObserver2 = equalObserverArr[1];
                SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = equalObserver2.queue;
                int i = 1;
                while (!this.cancelled) {
                    boolean z3 = equalObserver.done;
                    if (z3) {
                        Throwable th = equalObserver.error;
                        if (th != null) {
                            cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                            this.downstream.onError(th);
                            return;
                        }
                    }
                    boolean z4 = equalObserver2.done;
                    if (z4) {
                        Throwable th2 = equalObserver2.error;
                        if (th2 != null) {
                            cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                            this.downstream.onError(th2);
                            return;
                        }
                    }
                    if (this.v1 == null) {
                        this.v1 = spscLinkedArrayQueue.poll();
                    }
                    if (this.v1 == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.v2 == null) {
                        this.v2 = spscLinkedArrayQueue2.poll();
                    }
                    if (this.v2 == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z3 && z4 && z && z2) {
                        this.downstream.onSuccess(Boolean.TRUE);
                        return;
                    } else if (!z3 || !z4 || z == z2) {
                        if (!z && !z2) {
                            try {
                                if (!this.comparer.test(this.v1, this.v2)) {
                                    cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                                    this.downstream.onSuccess(Boolean.FALSE);
                                    return;
                                }
                                this.v1 = null;
                                this.v2 = null;
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                                this.downstream.onError(th3);
                                return;
                            }
                        }
                        if (z || z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                        this.downstream.onSuccess(Boolean.FALSE);
                        return;
                    }
                }
                spscLinkedArrayQueue.clear();
                spscLinkedArrayQueue2.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean setDisposable(Disposable disposable, int i) {
            return this.resources.setResource(i, disposable);
        }

        /* access modifiers changed from: package-private */
        public final void cancel(SpscLinkedArrayQueue<T> spscLinkedArrayQueue, SpscLinkedArrayQueue<T> spscLinkedArrayQueue2) {
            this.cancelled = true;
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        EqualCoordinator(SingleObserver<? super Boolean> singleObserver, int i, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.downstream = singleObserver;
            this.first = observableSource;
            this.second = observableSource2;
            this.comparer = biPredicate;
            EqualObserver<T>[] equalObserverArr = new EqualObserver[2];
            this.observers = equalObserverArr;
            equalObserverArr[0] = new EqualObserver<>(this, 0, i);
            equalObserverArr[1] = new EqualObserver<>(this, 1, i);
        }
    }

    static final class EqualObserver<T> implements Observer<T> {
        volatile boolean done;
        Throwable error;
        final int index;
        final EqualCoordinator<T> parent;
        final SpscLinkedArrayQueue<T> queue;

        public final void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public final void onSubscribe(Disposable disposable) {
            this.parent.setDisposable(disposable, this.index);
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

        EqualObserver(EqualCoordinator<T> equalCoordinator, int i, int i2) {
            this.parent = equalCoordinator;
            this.index = i;
            this.queue = new SpscLinkedArrayQueue<>(i2);
        }
    }

    public final Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly((Observable<T>) new ObservableSequenceEqual<T>(this.first, this.second, this.comparer, this.bufferSize));
    }

    public final void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(singleObserver, this.bufferSize, this.first, this.second, this.comparer);
        singleObserver.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe();
    }

    public ObservableSequenceEqualSingle(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.first = observableSource;
        this.second = observableSource2;
        this.comparer = biPredicate;
        this.bufferSize = i;
    }
}
