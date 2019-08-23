package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableBufferBoundarySupplier<T, U extends Collection<? super T>, B> extends AbstractFlowableWithUpstream<T, U> {
    final Callable<? extends b<B>> boundarySupplier;
    final Callable<U> bufferSupplier;

    static final class BufferBoundarySubscriber<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {
        boolean once;
        final BufferBoundarySupplierSubscriber<T, U, B> parent;

        public final void onComplete() {
            if (!this.once) {
                this.once = true;
                this.parent.next();
            }
        }

        BufferBoundarySubscriber(BufferBoundarySupplierSubscriber<T, U, B> bufferBoundarySupplierSubscriber) {
            this.parent = bufferBoundarySupplierSubscriber;
        }

        public final void onError(Throwable th) {
            if (this.once) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.once = true;
            this.parent.onError(th);
        }

        public final void onNext(B b2) {
            if (!this.once) {
                this.once = true;
                cancel();
                this.parent.next();
            }
        }
    }

    static final class BufferBoundarySupplierSubscriber<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements FlowableSubscriber<T>, Disposable, d {
        final Callable<? extends b<B>> boundarySupplier;
        U buffer;
        final Callable<U> bufferSupplier;
        final AtomicReference<Disposable> other = new AtomicReference<>();
        d upstream;

        /* access modifiers changed from: package-private */
        public final void disposeOther() {
            DisposableHelper.dispose(this.other);
        }

        public final void dispose() {
            this.upstream.cancel();
            disposeOther();
        }

        public final boolean isDisposed() {
            if (this.other.get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                disposeOther();
                if (enter()) {
                    this.queue.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r3.queue, r3.downstream, false, r3, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            r3.queue.offer(r0);
            r3.done = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (enter() == false) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onComplete() {
            /*
                r3 = this;
                monitor-enter(r3)
                U r0 = r3.buffer     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                r1 = 0
                r3.buffer = r1     // Catch:{ all -> 0x0022 }
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                io.reactivex.internal.fuseable.SimplePlainQueue r1 = r3.queue
                r1.offer(r0)
                r0 = 1
                r3.done = r0
                boolean r0 = r3.enter()
                if (r0 == 0) goto L_0x0021
                io.reactivex.internal.fuseable.SimplePlainQueue r0 = r3.queue
                org.a.c r1 = r3.downstream
                r2 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r0, r1, r2, r3, r3)
            L_0x0021:
                return
            L_0x0022:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySupplierSubscriber.onComplete():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            r1.subscribe(r2);
            fastPathEmitMax(r3, false, r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void next() {
            /*
                r4 = this;
                java.util.concurrent.Callable<U> r0 = r4.bufferSupplier     // Catch:{ Throwable -> 0x0051 }
                java.lang.Object r0 = r0.call()     // Catch:{ Throwable -> 0x0051 }
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0051 }
                java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Throwable -> 0x0051 }
                java.util.concurrent.Callable<? extends org.a.b<B>> r1 = r4.boundarySupplier     // Catch:{ Throwable -> 0x003f }
                java.lang.Object r1 = r1.call()     // Catch:{ Throwable -> 0x003f }
                java.lang.String r2 = "The boundary publisher supplied is null"
                java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x003f }
                org.a.b r1 = (org.a.b) r1     // Catch:{ Throwable -> 0x003f }
                io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$BufferBoundarySubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$BufferBoundarySubscriber
                r2.<init>(r4)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r3 = r4.other
                boolean r3 = io.reactivex.internal.disposables.DisposableHelper.replace(r3, r2)
                if (r3 == 0) goto L_0x003e
                monitor-enter(r4)
                U r3 = r4.buffer     // Catch:{ all -> 0x003b }
                if (r3 != 0) goto L_0x0030
                monitor-exit(r4)     // Catch:{ all -> 0x003b }
                return
            L_0x0030:
                r4.buffer = r0     // Catch:{ all -> 0x003b }
                monitor-exit(r4)     // Catch:{ all -> 0x003b }
                r1.subscribe(r2)
                r0 = 0
                r4.fastPathEmitMax(r3, r0, r4)
                goto L_0x003e
            L_0x003b:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003b }
                throw r0
            L_0x003e:
                return
            L_0x003f:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1 = 1
                r4.cancelled = r1
                org.a.d r1 = r4.upstream
                r1.cancel()
                org.a.c r1 = r4.downstream
                r1.onError(r0)
                return
            L_0x0051:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r4.cancel()
                org.a.c r1 = r4.downstream
                r1.onError(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySupplierSubscriber.next():void");
        }

        public final void request(long j) {
            requested(j);
        }

        public final void onError(Throwable th) {
            cancel();
            this.downstream.onError(th);
        }

        public final void onNext(T t) {
            synchronized (this) {
                U u = this.buffer;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                c cVar = this.downstream;
                try {
                    this.buffer = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The buffer supplied is null");
                    try {
                        b bVar = (b) ObjectHelper.requireNonNull(this.boundarySupplier.call(), "The boundary publisher supplied is null");
                        BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(this);
                        this.other.set(bufferBoundarySubscriber);
                        cVar.onSubscribe(this);
                        if (!this.cancelled) {
                            dVar.request(Long.MAX_VALUE);
                            bVar.subscribe(bufferBoundarySubscriber);
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        dVar.cancel();
                        EmptySubscription.error(th, cVar);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    dVar.cancel();
                    EmptySubscription.error(th2, cVar);
                }
            }
        }

        public final boolean accept(c<? super U> cVar, U u) {
            this.downstream.onNext(u);
            return true;
        }

        BufferBoundarySupplierSubscriber(c<? super U> cVar, Callable<U> callable, Callable<? extends b<B>> callable2) {
            super(cVar, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.boundarySupplier = callable2;
        }
    }

    public final void subscribeActual(c<? super U> cVar) {
        this.source.subscribe((FlowableSubscriber<? super T>) new BufferBoundarySupplierSubscriber<Object>(new SerializedSubscriber(cVar), this.bufferSupplier, this.boundarySupplier));
    }

    public FlowableBufferBoundarySupplier(Flowable<T> flowable, Callable<? extends b<B>> callable, Callable<U> callable2) {
        super(flowable);
        this.boundarySupplier = callable;
        this.bufferSupplier = callable2;
    }
}
