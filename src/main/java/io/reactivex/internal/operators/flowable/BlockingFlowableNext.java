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
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.a.b;

public final class BlockingFlowableNext<T> implements Iterable<T> {
    final b<? extends T> source;

    static final class NextIterator<T> implements Iterator<T> {
        private Throwable error;
        private boolean hasNext = true;
        private boolean isNextConsumed = true;
        private final b<? extends T> items;
        private T next;
        private boolean started;
        private final NextSubscriber<T> subscriber;

        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }

        public final boolean hasNext() {
            if (this.error != null) {
                throw ExceptionHelper.wrapOrThrow(this.error);
            } else if (!this.hasNext) {
                return false;
            } else {
                if (!this.isNextConsumed || moveToNext()) {
                    return true;
                }
                return false;
            }
        }

        public final T next() {
            if (this.error != null) {
                throw ExceptionHelper.wrapOrThrow(this.error);
            } else if (hasNext()) {
                this.isNextConsumed = true;
                return this.next;
            } else {
                throw new NoSuchElementException("No more elements");
            }
        }

        private boolean moveToNext() {
            try {
                if (!this.started) {
                    this.started = true;
                    this.subscriber.setWaiting();
                    Flowable.fromPublisher(this.items).materialize().subscribe((FlowableSubscriber<? super T>) this.subscriber);
                }
                Notification takeNext = this.subscriber.takeNext();
                if (takeNext.isOnNext()) {
                    this.isNextConsumed = false;
                    this.next = takeNext.getValue();
                    return true;
                }
                this.hasNext = false;
                if (takeNext.isOnComplete()) {
                    return false;
                }
                if (takeNext.isOnError()) {
                    this.error = takeNext.getError();
                    throw ExceptionHelper.wrapOrThrow(this.error);
                }
                throw new IllegalStateException("Should not reach here");
            } catch (InterruptedException e2) {
                this.subscriber.dispose();
                this.error = e2;
                throw ExceptionHelper.wrapOrThrow(e2);
            }
        }

        NextIterator(b<? extends T> bVar, NextSubscriber<T> nextSubscriber) {
            this.items = bVar;
            this.subscriber = nextSubscriber;
        }
    }

    static final class NextSubscriber<T> extends DisposableSubscriber<Notification<T>> {
        private final BlockingQueue<Notification<T>> buf = new ArrayBlockingQueue(1);
        final AtomicInteger waiting = new AtomicInteger();

        public final void onComplete() {
        }

        /* access modifiers changed from: package-private */
        public final void setWaiting() {
            this.waiting.set(1);
        }

        public final Notification<T> takeNext() throws InterruptedException {
            setWaiting();
            BlockingHelper.verifyNonBlocking();
            return this.buf.take();
        }

        NextSubscriber() {
        }

        public final void onError(Throwable th) {
            RxJavaPlugins.onError(th);
        }

        public final void onNext(Notification<T> notification) {
            if (this.waiting.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.buf.offer(notification)) {
                    Notification<T> notification2 = (Notification) this.buf.poll();
                    if (notification2 != null && !notification2.isOnNext()) {
                        notification = notification2;
                    }
                }
            }
        }
    }

    public final Iterator<T> iterator() {
        return new NextIterator(this.source, new NextSubscriber());
    }

    public BlockingFlowableNext(b<? extends T> bVar) {
        this.source = bVar;
    }
}
