package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableConcatMapEager<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends b<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;

    static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InnerQueuedSubscriberSupport<R>, d {
        private static final long serialVersionUID = -4255299542215038287L;
        volatile boolean cancelled;
        volatile InnerQueuedSubscriber<R> current;
        volatile boolean done;
        final c<? super R> downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final Function<? super T, ? extends b<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        final AtomicLong requested = new AtomicLong();
        final SpscLinkedArrayQueue<InnerQueuedSubscriber<R>> subscribers;
        d upstream;

        public final void onComplete() {
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void cancelAll() {
            while (true) {
                InnerQueuedSubscriber innerQueuedSubscriber = (InnerQueuedSubscriber) this.subscribers.poll();
                if (innerQueuedSubscriber != null) {
                    innerQueuedSubscriber.cancel();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainAndCancel() {
            if (getAndIncrement() == 0) {
                do {
                    cancelAll();
                } while (decrementAndGet() != 0);
            }
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                drainAndCancel();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:80:0x012e  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x013a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void drain() {
            /*
                r19 = this;
                r1 = r19
                int r0 = r19.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> r0 = r1.current
                org.a.c<? super R> r2 = r1.downstream
                io.reactivex.internal.util.ErrorMode r3 = r1.errorMode
                r5 = 1
            L_0x0010:
                java.util.concurrent.atomic.AtomicLong r6 = r1.requested
                long r6 = r6.get()
                if (r0 != 0) goto L_0x0056
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.END
                if (r3 == r0) goto L_0x0033
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x0033
                r19.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L_0x0033:
                boolean r0 = r1.done
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.internal.subscribers.InnerQueuedSubscriber<R>> r8 = r1.subscribers
                java.lang.Object r8 = r8.poll()
                io.reactivex.internal.subscribers.InnerQueuedSubscriber r8 = (io.reactivex.internal.subscribers.InnerQueuedSubscriber) r8
                if (r0 == 0) goto L_0x0051
                if (r8 != 0) goto L_0x0051
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                if (r0 == 0) goto L_0x004d
                r2.onError(r0)
                return
            L_0x004d:
                r2.onComplete()
                return
            L_0x0051:
                if (r8 == 0) goto L_0x0057
                r1.current = r8
                goto L_0x0057
            L_0x0056:
                r8 = r0
            L_0x0057:
                r9 = 0
                r11 = 0
                if (r8 == 0) goto L_0x0113
                io.reactivex.internal.fuseable.SimpleQueue r12 = r8.queue()
                if (r12 == 0) goto L_0x0113
                r16 = r5
                r13 = r9
            L_0x0065:
                r4 = 1
                int r17 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r17 == 0) goto L_0x00cc
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L_0x0073
                r19.cancelAll()
                return
            L_0x0073:
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r0) goto L_0x0093
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x0093
                r1.current = r11
                r8.cancel()
                r19.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L_0x0093:
                boolean r0 = r8.isDone()
                java.lang.Object r15 = r12.poll()     // Catch:{ Throwable -> 0x00bb }
                if (r15 != 0) goto L_0x00a0
                r17 = 1
                goto L_0x00a2
            L_0x00a0:
                r17 = 0
            L_0x00a2:
                if (r0 == 0) goto L_0x00b1
                if (r17 == 0) goto L_0x00b1
                r1.current = r11
                org.a.d r0 = r1.upstream
                r0.request(r4)
                r8 = r11
                r18 = 1
                goto L_0x00ce
            L_0x00b1:
                if (r17 != 0) goto L_0x00cc
                r2.onNext(r15)
                long r13 = r13 + r4
                r8.requestOne()
                goto L_0x0065
            L_0x00bb:
                r0 = move-exception
                r3 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r1.current = r11
                r8.cancel()
                r19.cancelAll()
                r2.onError(r3)
                return
            L_0x00cc:
                r18 = 0
            L_0x00ce:
                int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r0 != 0) goto L_0x0111
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L_0x00da
                r19.cancelAll()
                return
            L_0x00da:
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r0) goto L_0x00fa
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x00fa
                r1.current = r11
                r8.cancel()
                r19.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L_0x00fa:
                boolean r0 = r8.isDone()
                boolean r12 = r12.isEmpty()
                if (r0 == 0) goto L_0x0111
                if (r12 == 0) goto L_0x0111
                r1.current = r11
                org.a.d r0 = r1.upstream
                r0.request(r4)
                r0 = r11
                r18 = 1
                goto L_0x0119
            L_0x0111:
                r0 = r8
                goto L_0x0119
            L_0x0113:
                r16 = r5
                r0 = r8
                r13 = r9
                r18 = 0
            L_0x0119:
                int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r4 == 0) goto L_0x012c
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r8 == 0) goto L_0x012c
                java.util.concurrent.atomic.AtomicLong r4 = r1.requested
                long r5 = -r13
                r4.addAndGet(r5)
            L_0x012c:
                if (r18 != 0) goto L_0x013a
                r4 = r16
                int r4 = -r4
                int r5 = r1.addAndGet(r4)
                if (r5 == 0) goto L_0x0139
                goto L_0x0010
            L_0x0139:
                return
            L_0x013a:
                r4 = r16
                r5 = r4
                goto L_0x0010
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber.drain():void");
        }

        public final void innerComplete(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.setDone();
            drain();
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public final void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void onNext(T t) {
            try {
                b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null Publisher");
                InnerQueuedSubscriber innerQueuedSubscriber = new InnerQueuedSubscriber(this, this.prefetch);
                if (!this.cancelled) {
                    this.subscribers.offer(innerQueuedSubscriber);
                    bVar.subscribe(innerQueuedSubscriber);
                    if (this.cancelled) {
                        innerQueuedSubscriber.cancel();
                        drainAndCancel();
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        public final void onSubscribe(d dVar) {
            long j;
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    j = Long.MAX_VALUE;
                } else {
                    j = (long) this.maxConcurrency;
                }
                dVar.request(j);
            }
        }

        public final void innerError(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th) {
            if (this.errors.addThrowable(th)) {
                innerQueuedSubscriber.setDone();
                if (this.errorMode != ErrorMode.END) {
                    this.upstream.cancel();
                }
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public final void innerNext(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r) {
            if (innerQueuedSubscriber.queue().offer(r)) {
                drain();
                return;
            }
            innerQueuedSubscriber.cancel();
            innerError(innerQueuedSubscriber, new MissingBackpressureException());
        }

        ConcatMapEagerDelayErrorSubscriber(c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function, int i, int i2, ErrorMode errorMode2) {
            this.downstream = cVar;
            this.mapper = function;
            this.maxConcurrency = i;
            this.prefetch = i2;
            this.errorMode = errorMode2;
            this.subscribers = new SpscLinkedArrayQueue<>(Math.min(i2, i));
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        Flowable flowable = this.source;
        ConcatMapEagerDelayErrorSubscriber concatMapEagerDelayErrorSubscriber = new ConcatMapEagerDelayErrorSubscriber(cVar, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode);
        flowable.subscribe((FlowableSubscriber<? super T>) concatMapEagerDelayErrorSubscriber);
    }

    public FlowableConcatMapEager(Flowable<T> flowable, Function<? super T, ? extends b<? extends R>> function, int i, int i2, ErrorMode errorMode2) {
        super(flowable);
        this.mapper = function;
        this.maxConcurrency = i;
        this.prefetch = i2;
        this.errorMode = errorMode2;
    }
}
