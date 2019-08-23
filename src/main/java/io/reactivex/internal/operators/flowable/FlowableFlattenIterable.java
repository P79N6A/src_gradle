package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableFlattenIterable<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final Function<? super T, ? extends Iterable<? extends R>> mapper;
    final int prefetch;

    static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        volatile boolean cancelled;
        int consumed;
        Iterator<? extends R> current;
        volatile boolean done;
        final c<? super R> downstream;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        int fusionMode;
        final int limit;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        d upstream;

        public final void clear() {
            this.current = null;
            this.queue.clear();
        }

        public final boolean isEmpty() {
            if (this.current != null || !this.queue.isEmpty()) {
                return false;
            }
            return true;
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Nullable
        public final R poll() throws Exception {
            Iterator<? extends R> it2 = this.current;
            while (true) {
                if (it2 != null) {
                    break;
                }
                Object poll = this.queue.poll();
                if (poll != null) {
                    it2 = ((Iterable) this.mapper.apply(poll)).iterator();
                    if (it2.hasNext()) {
                        this.current = it2;
                        break;
                    }
                    it2 = null;
                } else {
                    return null;
                }
            }
            R requireNonNull = ObjectHelper.requireNonNull(it2.next(), "The iterator returned a null value");
            if (!it2.hasNext()) {
                this.current = null;
            }
            return requireNonNull;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0121, code lost:
            if (r6 != null) goto L_0x0123;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void drain() {
            /*
                r18 = this;
                r1 = r18
                int r0 = r18.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                org.a.c<? super R> r2 = r1.downstream
                io.reactivex.internal.fuseable.SimpleQueue<T> r3 = r1.queue
                int r0 = r1.fusionMode
                r4 = 0
                r5 = 1
                if (r0 == r5) goto L_0x0015
                r0 = 1
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                java.util.Iterator<? extends R> r6 = r1.current
                r7 = 0
                r8 = 1
            L_0x001a:
                if (r6 != 0) goto L_0x0080
                boolean r9 = r1.done
                java.lang.Object r10 = r3.poll()     // Catch:{ Throwable -> 0x0062 }
                if (r10 != 0) goto L_0x0026
                r11 = 1
                goto L_0x0027
            L_0x0026:
                r11 = 0
            L_0x0027:
                boolean r9 = r1.checkTerminated(r9, r11, r2, r3)
                if (r9 == 0) goto L_0x002e
                return
            L_0x002e:
                if (r10 == 0) goto L_0x0080
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r6 = r1.mapper     // Catch:{ Throwable -> 0x004a }
                java.lang.Object r6 = r6.apply(r10)     // Catch:{ Throwable -> 0x004a }
                java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ Throwable -> 0x004a }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x004a }
                boolean r9 = r6.hasNext()     // Catch:{ Throwable -> 0x004a }
                if (r9 != 0) goto L_0x0047
                r1.consumedOne(r0)
                r6 = r7
                goto L_0x001a
            L_0x0047:
                r1.current = r6
                goto L_0x0080
            L_0x004a:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.a.d r3 = r1.upstream
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                r2.onError(r0)
                return
            L_0x0062:
                r0 = move-exception
                r4 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                org.a.d r0 = r1.upstream
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r4)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                r1.current = r7
                r3.clear()
                r2.onError(r0)
                return
            L_0x0080:
                if (r6 == 0) goto L_0x0123
                java.util.concurrent.atomic.AtomicLong r9 = r1.requested
                long r9 = r9.get()
                r11 = 0
                r13 = r11
            L_0x008b:
                int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r15 == 0) goto L_0x00f6
                boolean r15 = r1.done
                boolean r15 = r1.checkTerminated(r15, r4, r2, r3)
                if (r15 == 0) goto L_0x0098
                return
            L_0x0098:
                java.lang.Object r15 = r6.next()     // Catch:{ Throwable -> 0x00dc }
                java.lang.String r5 = "The iterator returned a null value"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r15, (java.lang.String) r5)     // Catch:{ Throwable -> 0x00dc }
                r2.onNext(r5)
                boolean r5 = r1.done
                boolean r5 = r1.checkTerminated(r5, r4, r2, r3)
                if (r5 == 0) goto L_0x00ae
                return
            L_0x00ae:
                r16 = 1
                long r13 = r13 + r16
                boolean r5 = r6.hasNext()     // Catch:{ Throwable -> 0x00c1 }
                if (r5 != 0) goto L_0x00bf
                r1.consumedOne(r0)
                r1.current = r7
                r6 = r7
                goto L_0x00f6
            L_0x00bf:
                r5 = 1
                goto L_0x008b
            L_0x00c1:
                r0 = move-exception
                r3 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r1.current = r7
                org.a.d r0 = r1.upstream
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r3)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                r2.onError(r0)
                return
            L_0x00dc:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.current = r7
                org.a.d r3 = r1.upstream
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                r2.onError(r0)
                return
            L_0x00f6:
                int r5 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r5 != 0) goto L_0x010e
                boolean r5 = r1.done
                boolean r15 = r3.isEmpty()
                if (r15 == 0) goto L_0x0106
                if (r6 != 0) goto L_0x0106
                r15 = 1
                goto L_0x0107
            L_0x0106:
                r15 = 0
            L_0x0107:
                boolean r5 = r1.checkTerminated(r5, r15, r2, r3)
                if (r5 == 0) goto L_0x010e
                return
            L_0x010e:
                int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0121
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0121
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r9 = -r13
                r5.addAndGet(r9)
            L_0x0121:
                if (r6 == 0) goto L_0x012b
            L_0x0123:
                int r5 = -r8
                int r8 = r1.addAndGet(r5)
                if (r8 != 0) goto L_0x012b
                return
            L_0x012b:
                r5 = 1
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlattenIterable.FlattenIterableSubscriber.drain():void");
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0 || this.fusionMode != 1) {
                return 0;
            }
            return 1;
        }

        /* access modifiers changed from: package-private */
        public final void consumedOne(boolean z) {
            if (z) {
                int i = this.consumed + 1;
                if (i == this.limit) {
                    this.consumed = 0;
                    this.upstream.request((long) i);
                    return;
                }
                this.consumed = i;
            }
        }

        public final void onError(Throwable th) {
            if (this.done || !ExceptionHelper.addThrowable(this.error, th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            drain();
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.fusionMode != 0 || this.queue.offer(t)) {
                    drain();
                } else {
                    onError(new MissingBackpressureException("Queue is full?!"));
                }
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request((long) this.prefetch);
            }
        }

        FlattenIterableSubscriber(c<? super R> cVar, Function<? super T, ? extends Iterable<? extends R>> function, int i) {
            this.downstream = cVar;
            this.mapper = function;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        /* access modifiers changed from: package-private */
        public final boolean checkTerminated(boolean z, boolean z2, c<?> cVar, SimpleQueue<?> simpleQueue) {
            if (this.cancelled) {
                this.current = null;
                simpleQueue.clear();
                return true;
            }
            if (z) {
                if (this.error.get() != null) {
                    Throwable terminate = ExceptionHelper.terminate(this.error);
                    this.current = null;
                    simpleQueue.clear();
                    cVar.onError(terminate);
                    return true;
                } else if (z2) {
                    cVar.onComplete();
                    return true;
                }
            }
            return false;
        }
    }

    public final void subscribeActual(c<? super R> cVar) {
        if (this.source instanceof Callable) {
            try {
                Object call = ((Callable) this.source).call();
                if (call == null) {
                    EmptySubscription.complete(cVar);
                    return;
                }
                try {
                    FlowableFromIterable.subscribe(cVar, ((Iterable) this.mapper.apply(call)).iterator());
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, cVar);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, cVar);
            }
        } else {
            this.source.subscribe((FlowableSubscriber<? super T>) new FlattenIterableSubscriber<Object>(cVar, this.mapper, this.prefetch));
        }
    }

    public FlowableFlattenIterable(Flowable<T> flowable, Function<? super T, ? extends Iterable<? extends R>> function, int i) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i;
    }
}
