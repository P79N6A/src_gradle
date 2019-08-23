package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.a.d;

public final class BlockingFlowableIterable<T> implements Iterable<T> {
    final int bufferSize;
    final Flowable<T> source;

    static final class BlockingFlowableIterator<T> extends AtomicReference<d> implements FlowableSubscriber<T>, Disposable, Runnable, Iterator<T> {
        private static final long serialVersionUID = 6695226475494099826L;
        final long batchSize;
        final Condition condition = this.lock.newCondition();
        volatile boolean done;
        Throwable error;
        final long limit;
        final Lock lock = new ReentrantLock();
        long produced;
        final SpscArrayQueue<T> queue;

        public final void dispose() {
            SubscriptionHelper.cancel(this);
        }

        public final void onComplete() {
            this.done = true;
            signalConsumer();
        }

        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }

        public final void run() {
            SubscriptionHelper.cancel(this);
            signalConsumer();
        }

        public final boolean isDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void signalConsumer() {
            this.lock.lock();
            try {
                this.condition.signalAll();
            } finally {
                this.lock.unlock();
            }
        }

        public final T next() {
            if (hasNext()) {
                T poll = this.queue.poll();
                long j = this.produced + 1;
                if (j == this.limit) {
                    this.produced = 0;
                    ((d) get()).request(j);
                } else {
                    this.produced = j;
                }
                return poll;
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            while (true) {
                boolean z = this.done;
                boolean isEmpty = this.queue.isEmpty();
                if (z) {
                    Throwable th = this.error;
                    if (th != null) {
                        throw ExceptionHelper.wrapOrThrow(th);
                    } else if (isEmpty) {
                        return false;
                    }
                }
                if (!isEmpty) {
                    return true;
                }
                BlockingHelper.verifyNonBlocking();
                this.lock.lock();
                while (!this.done && this.queue.isEmpty()) {
                    try {
                        this.condition.await();
                    } catch (InterruptedException e2) {
                        run();
                        throw ExceptionHelper.wrapOrThrow(e2);
                    } catch (Throwable th2) {
                        this.lock.unlock();
                        throw th2;
                    }
                }
                this.lock.unlock();
            }
        }

        public final void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, this.batchSize);
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            signalConsumer();
        }

        public final void onNext(T t) {
            if (!this.queue.offer(t)) {
                SubscriptionHelper.cancel(this);
                onError(new MissingBackpressureException("Queue full?!"));
                return;
            }
            signalConsumer();
        }

        BlockingFlowableIterator(int i) {
            this.queue = new SpscArrayQueue<>(i);
            this.batchSize = (long) i;
            this.limit = (long) (i - (i >> 2));
        }
    }

    public final Iterator<T> iterator() {
        BlockingFlowableIterator blockingFlowableIterator = new BlockingFlowableIterator(this.bufferSize);
        this.source.subscribe((FlowableSubscriber<? super T>) blockingFlowableIterator);
        return blockingFlowableIterator;
    }

    public BlockingFlowableIterable(Flowable<T> flowable, int i) {
        this.source = flowable;
        this.bufferSize = i;
    }
}
