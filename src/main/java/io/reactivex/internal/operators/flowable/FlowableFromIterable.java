package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import org.a.c;

public final class FlowableFromIterable<T> extends Flowable<T> {
    final Iterable<? extends T> source;

    static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;

        /* renamed from: it  reason: collision with root package name */
        Iterator<? extends T> f83374it;
        boolean once;

        public final void cancel() {
            this.cancelled = true;
        }

        public final void clear() {
            this.f83374it = null;
        }

        /* access modifiers changed from: package-private */
        public abstract void fastPath();

        public final int requestFusion(int i) {
            return i & 1;
        }

        /* access modifiers changed from: package-private */
        public abstract void slowPath(long j);

        public final boolean isEmpty() {
            if (this.f83374it == null || !this.f83374it.hasNext()) {
                return true;
            }
            return false;
        }

        @Nullable
        public final T poll() {
            if (this.f83374it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!this.f83374it.hasNext()) {
                return null;
            }
            return ObjectHelper.requireNonNull(this.f83374it.next(), "Iterator.next() returned a null value");
        }

        BaseRangeSubscription(Iterator<? extends T> it2) {
            this.f83374it = it2;
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && BackpressureHelper.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    fastPath();
                    return;
                }
                slowPath(j);
            }
        }
    }

    static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final ConditionalSubscriber<? super T> downstream;

        /* access modifiers changed from: package-private */
        public final void fastPath() {
            Iterator it2 = this.f83374it;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            while (!this.cancelled) {
                try {
                    Object next = it2.next();
                    if (!this.cancelled) {
                        if (next == null) {
                            conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        conditionalSubscriber.tryOnNext(next);
                        if (!this.cancelled) {
                            try {
                                if (!it2.hasNext()) {
                                    if (!this.cancelled) {
                                        conditionalSubscriber.onComplete();
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                conditionalSubscriber.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void slowPath(long j) {
            Iterator it2 = this.f83374it;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        j2 = get();
                        if (j3 == j2) {
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.cancelled) {
                        try {
                            Object next = it2.next();
                            if (!this.cancelled) {
                                if (next == null) {
                                    conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                boolean tryOnNext = conditionalSubscriber.tryOnNext(next);
                                if (!this.cancelled) {
                                    try {
                                        if (!it2.hasNext()) {
                                            if (!this.cancelled) {
                                                conditionalSubscriber.onComplete();
                                            }
                                            return;
                                        } else if (tryOnNext) {
                                            j3++;
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.throwIfFatal(th);
                                        conditionalSubscriber.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            conditionalSubscriber.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }

        IteratorConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, Iterator<? extends T> it2) {
            super(it2);
            this.downstream = conditionalSubscriber;
        }
    }

    static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final c<? super T> downstream;

        /* access modifiers changed from: package-private */
        public final void fastPath() {
            Iterator it2 = this.f83374it;
            c<? super T> cVar = this.downstream;
            while (!this.cancelled) {
                try {
                    Object next = it2.next();
                    if (!this.cancelled) {
                        if (next == null) {
                            cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        cVar.onNext(next);
                        if (!this.cancelled) {
                            try {
                                if (!it2.hasNext()) {
                                    if (!this.cancelled) {
                                        cVar.onComplete();
                                    }
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

        /* access modifiers changed from: package-private */
        public final void slowPath(long j) {
            Iterator it2 = this.f83374it;
            c<? super T> cVar = this.downstream;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        j2 = get();
                        if (j3 == j2) {
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.cancelled) {
                        try {
                            Object next = it2.next();
                            if (!this.cancelled) {
                                if (next == null) {
                                    cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                cVar.onNext(next);
                                if (!this.cancelled) {
                                    try {
                                        if (!it2.hasNext()) {
                                            if (!this.cancelled) {
                                                cVar.onComplete();
                                            }
                                            return;
                                        }
                                        j3++;
                                    } catch (Throwable th) {
                                        Exceptions.throwIfFatal(th);
                                        cVar.onError(th);
                                        return;
                                    }
                                } else {
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
            } while (j2 != 0);
        }

        IteratorSubscription(c<? super T> cVar, Iterator<? extends T> it2) {
            super(it2);
            this.downstream = cVar;
        }
    }

    public FlowableFromIterable(Iterable<? extends T> iterable) {
        this.source = iterable;
    }

    public final void subscribeActual(c<? super T> cVar) {
        try {
            subscribe(cVar, this.source.iterator());
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }

    public static <T> void subscribe(c<? super T> cVar, Iterator<? extends T> it2) {
        try {
            if (!it2.hasNext()) {
                EmptySubscription.complete(cVar);
            } else if (cVar instanceof ConditionalSubscriber) {
                cVar.onSubscribe(new IteratorConditionalSubscription((ConditionalSubscriber) cVar, it2));
            } else {
                cVar.onSubscribe(new IteratorSubscription(cVar, it2));
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
