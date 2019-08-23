package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Action;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;
import org.a.d;

public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {
    final long bufferSize;
    final Action onOverflow;
    final BackpressureOverflowStrategy strategy;

    static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 3240706908776709697L;
        final long bufferSize;
        volatile boolean cancelled;
        final Deque<T> deque = new ArrayDeque();
        volatile boolean done;
        final c<? super T> downstream;
        Throwable error;
        final Action onOverflow;
        final AtomicLong requested = new AtomicLong();
        final BackpressureOverflowStrategy strategy;
        d upstream;

        public final void onComplete() {
            this.done = true;
            drain();
        }

        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                clear(this.deque);
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            boolean isEmpty;
            T poll;
            boolean z;
            if (getAndIncrement() == 0) {
                Deque<T> deque2 = this.deque;
                c<? super T> cVar = this.downstream;
                int i = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (!this.cancelled) {
                            boolean z2 = this.done;
                            synchronized (deque2) {
                                poll = deque2.poll();
                            }
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2) {
                                Throwable th = this.error;
                                if (th != null) {
                                    clear(deque2);
                                    cVar.onError(th);
                                    return;
                                } else if (z) {
                                    cVar.onComplete();
                                    return;
                                }
                            }
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j2++;
                        } else {
                            clear(deque2);
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (this.cancelled) {
                            clear(deque2);
                            return;
                        }
                        boolean z3 = this.done;
                        synchronized (deque2) {
                            isEmpty = deque2.isEmpty();
                        }
                        if (z3) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                clear(deque2);
                                cVar.onError(th2);
                                return;
                            } else if (isEmpty) {
                                cVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        BackpressureHelper.produced(this.requested, j2);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* access modifiers changed from: package-private */
        public final void clear(Deque<T> deque2) {
            synchronized (deque2) {
                deque2.clear();
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
            r5 = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(T r9) {
            /*
                r8 = this;
                boolean r0 = r8.done
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                java.util.Deque<T> r0 = r8.deque
                monitor-enter(r0)
                int r1 = r0.size()     // Catch:{ all -> 0x0064 }
                long r1 = (long) r1     // Catch:{ all -> 0x0064 }
                long r3 = r8.bufferSize     // Catch:{ all -> 0x0064 }
                r5 = 0
                r6 = 1
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 != 0) goto L_0x0032
                int[] r1 = io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.AnonymousClass1.$SwitchMap$io$reactivex$BackpressureOverflowStrategy     // Catch:{ all -> 0x0064 }
                io.reactivex.BackpressureOverflowStrategy r2 = r8.strategy     // Catch:{ all -> 0x0064 }
                int r2 = r2.ordinal()     // Catch:{ all -> 0x0064 }
                r1 = r1[r2]     // Catch:{ all -> 0x0064 }
                switch(r1) {
                    case 1: goto L_0x002a;
                    case 2: goto L_0x0023;
                    default: goto L_0x0022;
                }     // Catch:{ all -> 0x0064 }
            L_0x0022:
                goto L_0x0036
            L_0x0023:
                r0.poll()     // Catch:{ all -> 0x0064 }
                r0.offer(r9)     // Catch:{ all -> 0x0064 }
                goto L_0x0030
            L_0x002a:
                r0.pollLast()     // Catch:{ all -> 0x0064 }
                r0.offer(r9)     // Catch:{ all -> 0x0064 }
            L_0x0030:
                r5 = 1
                goto L_0x0035
            L_0x0032:
                r0.offer(r9)     // Catch:{ all -> 0x0064 }
            L_0x0035:
                r6 = 0
            L_0x0036:
                monitor-exit(r0)     // Catch:{ all -> 0x0064 }
                if (r5 == 0) goto L_0x0050
                io.reactivex.functions.Action r9 = r8.onOverflow
                if (r9 == 0) goto L_0x0063
                io.reactivex.functions.Action r9 = r8.onOverflow     // Catch:{ Throwable -> 0x0043 }
                r9.run()     // Catch:{ Throwable -> 0x0043 }
                return
            L_0x0043:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r9)
                org.a.d r0 = r8.upstream
                r0.cancel()
                r8.onError(r9)
                return
            L_0x0050:
                if (r6 == 0) goto L_0x0060
                org.a.d r9 = r8.upstream
                r9.cancel()
                io.reactivex.exceptions.MissingBackpressureException r9 = new io.reactivex.exceptions.MissingBackpressureException
                r9.<init>()
                r8.onError(r9)
                return
            L_0x0060:
                r8.drain()
            L_0x0063:
                return
            L_0x0064:
                r9 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0064 }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.OnBackpressureBufferStrategySubscriber.onNext(java.lang.Object):void");
        }

        OnBackpressureBufferStrategySubscriber(c<? super T> cVar, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy, long j) {
            this.downstream = cVar;
            this.onOverflow = action;
            this.strategy = backpressureOverflowStrategy;
            this.bufferSize = j;
        }
    }

    public final void subscribeActual(c<? super T> cVar) {
        Flowable flowable = this.source;
        OnBackpressureBufferStrategySubscriber onBackpressureBufferStrategySubscriber = new OnBackpressureBufferStrategySubscriber(cVar, this.onOverflow, this.strategy, this.bufferSize);
        flowable.subscribe((FlowableSubscriber<? super T>) onBackpressureBufferStrategySubscriber);
    }

    public FlowableOnBackpressureBufferStrategy(Flowable<T> flowable, long j, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(flowable);
        this.bufferSize = j;
        this.onOverflow = action;
        this.strategy = backpressureOverflowStrategy;
    }
}
