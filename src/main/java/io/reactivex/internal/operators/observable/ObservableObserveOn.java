package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableObserveOn<T> extends AbstractObservableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;

    static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final Observer<? super T> downstream;
        Throwable error;
        boolean outputFused;
        SimpleQueue<T> queue;
        int sourceMode;
        Disposable upstream;
        final Scheduler.Worker worker;

        public final boolean isDisposed() {
            return this.disposed;
        }

        public final void clear() {
            this.queue.clear();
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Nullable
        public final T poll() throws Exception {
            return this.queue.poll();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                schedule();
            }
        }

        public final void run() {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        /* access modifiers changed from: package-private */
        public final void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.schedule(this);
            }
        }

        public final void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.upstream.dispose();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainFused() {
            int i = 1;
            while (!this.disposed) {
                boolean z = this.done;
                Throwable th = this.error;
                if (this.delayError || !z || th == null) {
                    this.downstream.onNext(null);
                    if (z) {
                        this.disposed = true;
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            this.downstream.onError(th2);
                        } else {
                            this.downstream.onComplete();
                        }
                        this.worker.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.disposed = true;
                    this.downstream.onError(this.error);
                    this.worker.dispose();
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainNormal() {
            boolean z;
            SimpleQueue<T> simpleQueue = this.queue;
            Observer<? super T> observer = this.downstream;
            int i = 1;
            while (!checkTerminated(this.done, simpleQueue.isEmpty(), observer)) {
                while (true) {
                    boolean z2 = this.done;
                    try {
                        Object poll = simpleQueue.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!checkTerminated(z2, z, observer)) {
                            if (!z) {
                                observer.onNext(poll);
                            } else {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.disposed = true;
                        this.upstream.dispose();
                        simpleQueue.clear();
                        observer.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 2) {
                    this.queue.offer(t);
                }
                schedule();
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        schedule();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueDisposable;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean checkTerminated(boolean z, boolean z2, Observer<? super T> observer) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            }
            if (z) {
                Throwable th = this.error;
                if (this.delayError) {
                    if (z2) {
                        this.disposed = true;
                        if (th != null) {
                            observer.onError(th);
                        } else {
                            observer.onComplete();
                        }
                        this.worker.dispose();
                        return true;
                    }
                } else if (th != null) {
                    this.disposed = true;
                    this.queue.clear();
                    observer.onError(th);
                    this.worker.dispose();
                    return true;
                } else if (z2) {
                    this.disposed = true;
                    observer.onComplete();
                    this.worker.dispose();
                    return true;
                }
            }
            return false;
        }

        ObserveOnObserver(Observer<? super T> observer, Scheduler.Worker worker2, boolean z, int i) {
            this.downstream = observer;
            this.worker = worker2;
            this.delayError = z;
            this.bufferSize = i;
        }
    }

    public final void subscribeActual(Observer<? super T> observer) {
        if (this.scheduler instanceof TrampolineScheduler) {
            this.source.subscribe(observer);
            return;
        }
        this.source.subscribe(new ObserveOnObserver(observer, this.scheduler.createWorker(), this.delayError, this.bufferSize));
    }

    public ObservableObserveOn(ObservableSource<T> observableSource, Scheduler scheduler2, boolean z, int i) {
        super(observableSource);
        this.scheduler = scheduler2;
        this.delayError = z;
        this.bufferSize = i;
    }
}
