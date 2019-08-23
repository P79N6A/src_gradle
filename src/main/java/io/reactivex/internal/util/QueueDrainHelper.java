package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;
import org.a.d;

public final class QueueDrainHelper {
    private QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> SimpleQueue<T> createQueue(int i) {
        if (i < 0) {
            return new SpscLinkedArrayQueue(-i);
        }
        return new SpscArrayQueue(i);
    }

    static boolean isCancelled(BooleanSupplier booleanSupplier) {
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return true;
        }
    }

    public static void request(d dVar, int i) {
        long j;
        if (i < 0) {
            j = Long.MAX_VALUE;
        } else {
            j = (long) i;
        }
        dVar.request(j);
    }

    public static <T> void postComplete(c<? super T> cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j;
        long j2;
        if (queue.isEmpty()) {
            cVar.onComplete();
        } else if (!postCompleteDrain(atomicLong.get(), cVar, queue, atomicLong, booleanSupplier)) {
            do {
                j = atomicLong.get();
                if ((j & Long.MIN_VALUE) == 0) {
                    j2 = j | Long.MIN_VALUE;
                } else {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j2));
            if (j != 0) {
                postCompleteDrain(j2, cVar, queue, atomicLong, booleanSupplier);
            }
        }
    }

    public static <T, U> void drainLoop(SimplePlainQueue<T> simplePlainQueue, Observer<? super U> observer, boolean z, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        boolean z2;
        int i = 1;
        while (!checkTerminated(observableQueueDrain.done(), simplePlainQueue.isEmpty(), observer, z, simplePlainQueue, disposable, observableQueueDrain)) {
            while (true) {
                boolean done = observableQueueDrain.done();
                Object poll = simplePlainQueue.poll();
                if (poll == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!checkTerminated(done, z2, observer, z, simplePlainQueue, disposable, observableQueueDrain)) {
                    if (!z2) {
                        observableQueueDrain.accept(observer, poll);
                    } else {
                        i = observableQueueDrain.leave(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static <T> boolean postCompleteRequest(long j, c<? super T> cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j2;
        long j3 = j;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, BackpressureHelper.addCap(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
        if (j2 != Long.MIN_VALUE) {
            return false;
        }
        postCompleteDrain(j3 | Long.MIN_VALUE, cVar, queue, atomicLong, booleanSupplier);
        return true;
    }

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> simplePlainQueue, c<? super U> cVar, boolean z, Disposable disposable, QueueDrain<T, U> queueDrain) {
        boolean z2;
        int i = 1;
        while (true) {
            boolean done = queueDrain.done();
            Object poll = simplePlainQueue.poll();
            if (poll == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (checkTerminated(done, z2, cVar, z, simplePlainQueue, queueDrain)) {
                if (disposable != null) {
                    disposable.dispose();
                }
                return;
            } else if (!z2) {
                long requested = queueDrain.requested();
                if (requested == 0) {
                    simplePlainQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    cVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                } else if (queueDrain.accept(cVar, poll) && requested != Long.MAX_VALUE) {
                    queueDrain.produced(1);
                }
            } else {
                i = queueDrain.leave(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    static <T> boolean postCompleteDrain(long j, c<? super T> cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                T poll = queue.poll();
                if (poll == null) {
                    cVar.onComplete();
                    return true;
                }
                cVar.onNext(poll);
                j2++;
            } else if (isCancelled(booleanSupplier)) {
                return true;
            } else {
                if (queue.isEmpty()) {
                    cVar.onComplete();
                    return true;
                }
                j = atomicLong.get();
                if (j == j2) {
                    long addAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & addAndGet) == 0) {
                        return false;
                    }
                    j = addAndGet;
                    j2 = addAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T, U> boolean checkTerminated(boolean z, boolean z2, c<?> cVar, boolean z3, SimpleQueue<?> simpleQueue, QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        }
        if (z) {
            if (!z3) {
                Throwable error = queueDrain.error();
                if (error != null) {
                    simpleQueue.clear();
                    cVar.onError(error);
                    return true;
                } else if (z2) {
                    cVar.onComplete();
                    return true;
                }
            } else if (z2) {
                Throwable error2 = queueDrain.error();
                if (error2 != null) {
                    cVar.onError(error2);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    public static <T, U> boolean checkTerminated(boolean z, boolean z2, Observer<?> observer, boolean z3, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (z) {
            if (!z3) {
                Throwable error = observableQueueDrain.error();
                if (error != null) {
                    simpleQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    observer.onError(error);
                    return true;
                } else if (z2) {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    observer.onComplete();
                    return true;
                }
            } else if (z2) {
                if (disposable != null) {
                    disposable.dispose();
                }
                Throwable error2 = observableQueueDrain.error();
                if (error2 != null) {
                    observer.onError(error2);
                } else {
                    observer.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}
