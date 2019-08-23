package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

public final class BlockingObservableLatest<T> implements Iterable<T> {
    final ObservableSource<T> source;

    static final class BlockingObservableLatestIterator<T> extends DisposableObserver<Notification<T>> implements Iterator<T> {
        Notification<T> iteratorNotification;
        final Semaphore notify = new Semaphore(0);
        final AtomicReference<Notification<T>> value = new AtomicReference<>();

        public final void onComplete() {
        }

        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        BlockingObservableLatestIterator() {
        }

        public final T next() {
            if (hasNext()) {
                T value2 = this.iteratorNotification.getValue();
                this.iteratorNotification = null;
                return value2;
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            if (this.iteratorNotification == null || !this.iteratorNotification.isOnError()) {
                if (this.iteratorNotification == null) {
                    try {
                        BlockingHelper.verifyNonBlocking();
                        this.notify.acquire();
                        Notification<T> andSet = this.value.getAndSet(null);
                        this.iteratorNotification = andSet;
                        if (andSet.isOnError()) {
                            throw ExceptionHelper.wrapOrThrow(andSet.getError());
                        }
                    } catch (InterruptedException e2) {
                        dispose();
                        this.iteratorNotification = Notification.createOnError(e2);
                        throw ExceptionHelper.wrapOrThrow(e2);
                    }
                }
                return this.iteratorNotification.isOnNext();
            }
            throw ExceptionHelper.wrapOrThrow(this.iteratorNotification.getError());
        }

        public final void onError(Throwable th) {
            RxJavaPlugins.onError(th);
        }

        public final void onNext(Notification<T> notification) {
            boolean z;
            if (this.value.getAndSet(notification) == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.notify.release();
            }
        }
    }

    public final Iterator<T> iterator() {
        BlockingObservableLatestIterator blockingObservableLatestIterator = new BlockingObservableLatestIterator();
        Observable.wrap(this.source).materialize().subscribe((Observer<? super T>) blockingObservableLatestIterator);
        return blockingObservableLatestIterator;
    }

    public BlockingObservableLatest(ObservableSource<T> observableSource) {
        this.source = observableSource;
    }
}
