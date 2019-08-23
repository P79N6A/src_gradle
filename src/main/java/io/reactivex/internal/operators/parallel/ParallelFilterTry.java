package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.a.c;
import org.a.d;

public final class ParallelFilterTry<T> extends ParallelFlowable<T> {
    final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
    final Predicate<? super T> predicate;
    final ParallelFlowable<T> source;

    static abstract class BaseFilterSubscriber<T> implements ConditionalSubscriber<T>, d {
        boolean done;
        final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> errorHandler;
        final Predicate<? super T> predicate;
        d upstream;

        public final void cancel() {
            this.upstream.cancel();
        }

        public final void request(long j) {
            this.upstream.request(j);
        }

        public final void onNext(T t) {
            if (!tryOnNext(t) && !this.done) {
                this.upstream.request(1);
            }
        }

        BaseFilterSubscriber(Predicate<? super T> predicate2, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            this.predicate = predicate2;
            this.errorHandler = biFunction;
        }
    }

    static final class ParallelFilterConditionalSubscriber<T> extends BaseFilterSubscriber<T> {
        final ConditionalSubscriber<? super T> downstream;

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        /* JADX WARNING: Removed duplicated region for block: B:3:0x0007 A[LOOP:0: B:3:0x0007->B:16:0x003b, LOOP_START, PHI: r2 
          PHI: (r2v1 long) = (r2v0 long), (r2v3 long) binds: [B:2:0x0005, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean tryOnNext(T r9) {
            /*
                r8 = this;
                boolean r0 = r8.done
                r1 = 0
                if (r0 != 0) goto L_0x0064
                r2 = 0
            L_0x0007:
                r0 = 1
                io.reactivex.functions.Predicate r4 = r8.predicate     // Catch:{ Throwable -> 0x001a }
                boolean r4 = r4.test(r9)     // Catch:{ Throwable -> 0x001a }
                if (r4 == 0) goto L_0x0019
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r2 = r8.downstream
                boolean r9 = r2.tryOnNext(r9)
                if (r9 == 0) goto L_0x0019
                return r0
            L_0x0019:
                return r1
            L_0x001a:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                io.reactivex.functions.BiFunction r5 = r8.errorHandler     // Catch:{ Throwable -> 0x004d }
                r6 = 1
                long r2 = r2 + r6
                java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch:{ Throwable -> 0x004d }
                java.lang.Object r5 = r5.apply(r6, r4)     // Catch:{ Throwable -> 0x004d }
                java.lang.String r6 = "The errorHandler returned a null item"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, (java.lang.String) r6)     // Catch:{ Throwable -> 0x004d }
                io.reactivex.parallel.ParallelFailureHandling r5 = (io.reactivex.parallel.ParallelFailureHandling) r5     // Catch:{ Throwable -> 0x004d }
                int[] r0 = io.reactivex.internal.operators.parallel.ParallelFilterTry.AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling
                int r5 = r5.ordinal()
                r0 = r0[r5]
                switch(r0) {
                    case 1: goto L_0x0007;
                    case 2: goto L_0x004c;
                    case 3: goto L_0x0045;
                    default: goto L_0x003e;
                }
            L_0x003e:
                r8.cancel()
                r8.onError(r4)
                return r1
            L_0x0045:
                r8.cancel()
                r8.onComplete()
                return r1
            L_0x004c:
                return r1
            L_0x004d:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r9)
                r8.cancel()
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r3[r1] = r4
                r3[r0] = r9
                r2.<init>((java.lang.Throwable[]) r3)
                r8.onError(r2)
                return r1
            L_0x0064:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelFilterTry.ParallelFilterConditionalSubscriber.tryOnNext(java.lang.Object):boolean");
        }

        ParallelFilterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.downstream = conditionalSubscriber;
        }
    }

    static final class ParallelFilterSubscriber<T> extends BaseFilterSubscriber<T> {
        final c<? super T> downstream;

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        /* JADX WARNING: Removed duplicated region for block: B:3:0x0007 A[LOOP:0: B:3:0x0007->B:15:0x0038, LOOP_START, PHI: r2 
          PHI: (r2v1 long) = (r2v0 long), (r2v3 long) binds: [B:2:0x0005, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean tryOnNext(T r9) {
            /*
                r8 = this;
                boolean r0 = r8.done
                r1 = 0
                if (r0 != 0) goto L_0x0061
                r2 = 0
            L_0x0007:
                r0 = 1
                io.reactivex.functions.Predicate r4 = r8.predicate     // Catch:{ Throwable -> 0x0017 }
                boolean r4 = r4.test(r9)     // Catch:{ Throwable -> 0x0017 }
                if (r4 == 0) goto L_0x0016
                org.a.c<? super T> r1 = r8.downstream
                r1.onNext(r9)
                return r0
            L_0x0016:
                return r1
            L_0x0017:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                io.reactivex.functions.BiFunction r5 = r8.errorHandler     // Catch:{ Throwable -> 0x004a }
                r6 = 1
                long r2 = r2 + r6
                java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch:{ Throwable -> 0x004a }
                java.lang.Object r5 = r5.apply(r6, r4)     // Catch:{ Throwable -> 0x004a }
                java.lang.String r6 = "The errorHandler returned a null item"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, (java.lang.String) r6)     // Catch:{ Throwable -> 0x004a }
                io.reactivex.parallel.ParallelFailureHandling r5 = (io.reactivex.parallel.ParallelFailureHandling) r5     // Catch:{ Throwable -> 0x004a }
                int[] r0 = io.reactivex.internal.operators.parallel.ParallelFilterTry.AnonymousClass1.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling
                int r5 = r5.ordinal()
                r0 = r0[r5]
                switch(r0) {
                    case 1: goto L_0x0007;
                    case 2: goto L_0x0049;
                    case 3: goto L_0x0042;
                    default: goto L_0x003b;
                }
            L_0x003b:
                r8.cancel()
                r8.onError(r4)
                return r1
            L_0x0042:
                r8.cancel()
                r8.onComplete()
                return r1
            L_0x0049:
                return r1
            L_0x004a:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r9)
                r8.cancel()
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r3[r1] = r4
                r3[r0] = r9
                r2.<init>((java.lang.Throwable[]) r3)
                r8.onError(r2)
                return r1
            L_0x0061:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelFilterTry.ParallelFilterSubscriber.tryOnNext(java.lang.Object):boolean");
        }

        ParallelFilterSubscriber(c<? super T> cVar, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.downstream = cVar;
        }
    }

    public final int parallelism() {
        return this.source.parallelism();
    }

    public final void subscribe(c<? super T>[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            c[] cVarArr2 = new c[length];
            for (int i = 0; i < length; i++) {
                ConditionalSubscriber conditionalSubscriber = cVarArr[i];
                if (conditionalSubscriber instanceof ConditionalSubscriber) {
                    cVarArr2[i] = new ParallelFilterConditionalSubscriber(conditionalSubscriber, this.predicate, this.errorHandler);
                } else {
                    cVarArr2[i] = new ParallelFilterSubscriber(conditionalSubscriber, this.predicate, this.errorHandler);
                }
            }
            this.source.subscribe(cVarArr2);
        }
    }

    public ParallelFilterTry(ParallelFlowable<T> parallelFlowable, Predicate<? super T> predicate2, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.source = parallelFlowable;
        this.predicate = predicate2;
        this.errorHandler = biFunction;
    }
}
