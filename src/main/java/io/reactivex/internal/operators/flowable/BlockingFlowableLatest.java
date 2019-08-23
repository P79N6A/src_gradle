package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;

public final class BlockingFlowableLatest<T> implements Iterable<T> {
    final b<? extends T> source;

    static final class LatestSubscriberIterator<T> extends DisposableSubscriber<Notification<T>> implements Iterator<T> {
        Notification<T> iteratorNotification;
        final Semaphore notify = new Semaphore(0);
        final AtomicReference<Notification<T>> value = new AtomicReference<>();

        public final void onComplete() {
        }

        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        LatestSubscriberIterator() {
        }

        public final T next() {
            if (!hasNext() || !this.iteratorNotification.isOnNext()) {
                throw new NoSuchElementException();
            }
            T value2 = this.iteratorNotification.getValue();
            this.iteratorNotification = null;
            return value2;
        }

        public final boolean hasNext() {
            if (this.iteratorNotification == null || !this.iteratorNotification.isOnError()) {
                if ((this.iteratorNotification == null || this.iteratorNotification.isOnNext()) && this.iteratorNotification == null) {
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
        LatestSubscriberIterator latestSubscriberIterator = new LatestSubscriberIterator();
        Flowable.fromPublisher(this.source).materialize().subscribe((FlowableSubscriber<? super T>) latestSubscriberIterator);
        return latestSubscriberIterator;
    }

    public BlockingFlowableLatest(b<? extends T> bVar) {
        this.source = bVar;
    }
}
