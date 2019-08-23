package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.e.b;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract class af<K, T extends Closeable> implements al<T> {
    @GuardedBy
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final Map<K, a> f24024a = new HashMap();
    public final al<T> mInputProducer;

    @VisibleForTesting
    class a {

        /* renamed from: b  reason: collision with root package name */
        private final K f24026b;
        @GuardedBy
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        private T f24027c;
        @GuardedBy

        /* renamed from: d  reason: collision with root package name */
        private float f24028d;
        @GuardedBy

        /* renamed from: e  reason: collision with root package name */
        private int f24029e;
        @GuardedBy
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        private com.facebook.imagepipeline.producers.af$a.a f24030f;
        public final CopyOnWriteArraySet<Pair<Consumer<T>, am>> mConsumerContextPairs = new CopyOnWriteArraySet<>();
        @GuardedBy
        @Nullable
        public d mMultiplexProducerContext;

        /* renamed from: com.facebook.imagepipeline.producers.af$a$a  reason: collision with other inner class name */
        class C0268a extends b<T> {
            /* access modifiers changed from: protected */
            public final void onCancellationImpl() {
                try {
                    if (b.isTracing()) {
                        b.beginSection("MultiplexProducer#onCancellation");
                    }
                    a.this.onCancelled(this);
                } finally {
                    if (b.isTracing()) {
                        b.endSection();
                    }
                }
            }

            private C0268a() {
            }

            /* access modifiers changed from: protected */
            public final void onFailureImpl(Throwable th) {
                try {
                    if (b.isTracing()) {
                        b.beginSection("MultiplexProducer#onFailure");
                    }
                    a.this.onFailure(this, th);
                } finally {
                    if (b.isTracing()) {
                        b.endSection();
                    }
                }
            }

            /* access modifiers changed from: protected */
            public final void onProgressUpdateImpl(float f2) {
                try {
                    if (b.isTracing()) {
                        b.beginSection("MultiplexProducer#onProgressUpdate");
                    }
                    a.this.onProgressUpdate(this, f2);
                } finally {
                    if (b.isTracing()) {
                        b.endSection();
                    }
                }
            }

            /* synthetic */ C0268a(a aVar, byte b2) {
                this();
            }

            /* access modifiers changed from: protected */
            public final /* synthetic */ void onNewResultImpl(Object obj, int i) {
                Closeable closeable = (Closeable) obj;
                try {
                    if (b.isTracing()) {
                        b.beginSection("MultiplexProducer#onNewResult");
                    }
                    a.this.onNextResult(this, closeable, i);
                } finally {
                    if (b.isTracing()) {
                        b.endSection();
                    }
                }
            }
        }

        @Nullable
        public final synchronized List<an> updateIsIntermediateResultExpected() {
            if (this.mMultiplexProducerContext == null) {
                return null;
            }
            return this.mMultiplexProducerContext.setIsIntermediateResultExpectedNoCallbacks(b());
        }

        @Nullable
        public final synchronized List<an> updateIsPrefetch() {
            if (this.mMultiplexProducerContext == null) {
                return null;
            }
            return this.mMultiplexProducerContext.setIsPrefetchNoCallbacks(a());
        }

        @Nullable
        public final synchronized List<an> updatePriority() {
            if (this.mMultiplexProducerContext == null) {
                return null;
            }
            return this.mMultiplexProducerContext.setPriorityNoCallbacks(c());
        }

        private synchronized boolean a() {
            Iterator<Pair<Consumer<T>, am>> it2 = this.mConsumerContextPairs.iterator();
            while (it2.hasNext()) {
                if (!((am) it2.next().second).isPrefetch()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized boolean b() {
            Iterator<Pair<Consumer<T>, am>> it2 = this.mConsumerContextPairs.iterator();
            while (it2.hasNext()) {
                if (((am) it2.next().second).isIntermediateResultExpected()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized Priority c() {
            Priority priority;
            priority = Priority.LOW;
            Iterator<Pair<Consumer<T>, am>> it2 = this.mConsumerContextPairs.iterator();
            while (it2.hasNext()) {
                priority = Priority.getHigherPriority(priority, ((am) it2.next().second).getPriority());
            }
            return priority;
        }

        public final void startInputProducerIfHasAttachedConsumers() {
            boolean z;
            synchronized (this) {
                boolean z2 = true;
                if (this.mMultiplexProducerContext == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z);
                if (this.f24030f != null) {
                    z2 = false;
                }
                Preconditions.checkArgument(z2);
                if (this.mConsumerContextPairs.isEmpty()) {
                    af.this.removeMultiplexer(this.f24026b, this);
                    return;
                }
                am amVar = (am) this.mConsumerContextPairs.iterator().next().second;
                d dVar = new d(amVar.getImageRequest(), amVar.getId(), amVar.getListener(), amVar.getCallerContext(), amVar.getLowestPermittedRequestLevel(), a(), b(), c());
                this.mMultiplexProducerContext = dVar;
                this.f24030f = new C0268a(this, (byte) 0);
                d dVar2 = this.mMultiplexProducerContext;
                com.facebook.imagepipeline.producers.af$a.a aVar = this.f24030f;
                af.this.mInputProducer.produceResults(aVar, dVar2);
            }
        }

        private static void a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        public final void onCancelled(com.facebook.imagepipeline.producers.af$a.a aVar) {
            synchronized (this) {
                if (this.f24030f == aVar) {
                    this.f24030f = null;
                    this.mMultiplexProducerContext = null;
                    a(this.f24027c);
                    this.f24027c = null;
                    startInputProducerIfHasAttachedConsumers();
                }
            }
        }

        public a(K k) {
            this.f24026b = k;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            r0 = r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((com.facebook.imagepipeline.producers.Consumer) r0.first).onFailure(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
            if (r3.hasNext() == false) goto L_0x003b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onFailure(com.facebook.imagepipeline.producers.af$a.a r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                com.facebook.imagepipeline.producers.af$a.a<> r0 = r2.f24030f     // Catch:{ all -> 0x003c }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x003c }
                return
            L_0x0007:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.Consumer<T>, com.facebook.imagepipeline.producers.am>> r3 = r2.mConsumerContextPairs     // Catch:{ all -> 0x003c }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x003c }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.Consumer<T>, com.facebook.imagepipeline.producers.am>> r0 = r2.mConsumerContextPairs     // Catch:{ all -> 0x003c }
                r0.clear()     // Catch:{ all -> 0x003c }
                com.facebook.imagepipeline.producers.af r0 = com.facebook.imagepipeline.producers.af.this     // Catch:{ all -> 0x003c }
                K r1 = r2.f24026b     // Catch:{ all -> 0x003c }
                r0.removeMultiplexer(r1, r2)     // Catch:{ all -> 0x003c }
                T r0 = r2.f24027c     // Catch:{ all -> 0x003c }
                a(r0)     // Catch:{ all -> 0x003c }
                r0 = 0
                r2.f24027c = r0     // Catch:{ all -> 0x003c }
                monitor-exit(r2)     // Catch:{ all -> 0x003c }
            L_0x0022:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0038 }
                com.facebook.imagepipeline.producers.Consumer r1 = (com.facebook.imagepipeline.producers.Consumer) r1     // Catch:{ all -> 0x0038 }
                r1.onFailure(r4)     // Catch:{ all -> 0x0038 }
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                goto L_0x0022
            L_0x0038:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                throw r3
            L_0x003b:
                return
            L_0x003c:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x003c }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.af.a.onFailure(com.facebook.imagepipeline.producers.af$a$a, java.lang.Throwable):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
            r0 = r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((com.facebook.imagepipeline.producers.Consumer) r0.first).onProgressUpdate(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            if (r3.hasNext() == false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onProgressUpdate(com.facebook.imagepipeline.producers.af$a.a r3, float r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                com.facebook.imagepipeline.producers.af$a.a<> r0 = r2.f24030f     // Catch:{ all -> 0x002a }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                return
            L_0x0007:
                r2.f24028d = r4     // Catch:{ all -> 0x002a }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.Consumer<T>, com.facebook.imagepipeline.producers.am>> r3 = r2.mConsumerContextPairs     // Catch:{ all -> 0x002a }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x002a }
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
            L_0x0010:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0029
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0026 }
                com.facebook.imagepipeline.producers.Consumer r1 = (com.facebook.imagepipeline.producers.Consumer) r1     // Catch:{ all -> 0x0026 }
                r1.onProgressUpdate(r4)     // Catch:{ all -> 0x0026 }
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                goto L_0x0010
            L_0x0026:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                throw r3
            L_0x0029:
                return
            L_0x002a:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.af.a.onProgressUpdate(com.facebook.imagepipeline.producers.af$a$a, float):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
            com.facebook.imagepipeline.producers.d.callOnIsPrefetchChanged(r1);
            com.facebook.imagepipeline.producers.d.callOnPriorityChanged(r2);
            com.facebook.imagepipeline.producers.d.callOnIsIntermediateResultExpectedChanged(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
            if (r4 == r7.f24027c) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r4 == null) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            r4 = r7.f24025a.cloneOrNull(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            if (r4 == null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
            if (r5 <= 0.0f) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.onProgressUpdate(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
            r8.onNewResult(r4, r6);
            a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
            r9.addCallbacks(new com.facebook.imagepipeline.producers.af.a.AnonymousClass1(r7));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean addNewConsumer(com.facebook.imagepipeline.producers.Consumer<T> r8, com.facebook.imagepipeline.producers.am r9) {
            /*
                r7 = this;
                android.util.Pair r0 = android.util.Pair.create(r8, r9)
                monitor-enter(r7)
                com.facebook.imagepipeline.producers.af r1 = com.facebook.imagepipeline.producers.af.this     // Catch:{ all -> 0x0065 }
                K r2 = r7.f24026b     // Catch:{ all -> 0x0065 }
                com.facebook.imagepipeline.producers.af$a r1 = r1.getExistingMultiplexer(r2)     // Catch:{ all -> 0x0065 }
                if (r1 == r7) goto L_0x0012
                r8 = 0
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                return r8
            L_0x0012:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.Consumer<T>, com.facebook.imagepipeline.producers.am>> r1 = r7.mConsumerContextPairs     // Catch:{ all -> 0x0065 }
                r1.add(r0)     // Catch:{ all -> 0x0065 }
                java.util.List r1 = r7.updateIsPrefetch()     // Catch:{ all -> 0x0065 }
                java.util.List r2 = r7.updatePriority()     // Catch:{ all -> 0x0065 }
                java.util.List r3 = r7.updateIsIntermediateResultExpected()     // Catch:{ all -> 0x0065 }
                T r4 = r7.f24027c     // Catch:{ all -> 0x0065 }
                float r5 = r7.f24028d     // Catch:{ all -> 0x0065 }
                int r6 = r7.f24029e     // Catch:{ all -> 0x0065 }
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                com.facebook.imagepipeline.producers.d.callOnIsPrefetchChanged(r1)
                com.facebook.imagepipeline.producers.d.callOnPriorityChanged(r2)
                com.facebook.imagepipeline.producers.d.callOnIsIntermediateResultExpectedChanged(r3)
                monitor-enter(r0)
                monitor-enter(r7)     // Catch:{ all -> 0x0062 }
                T r1 = r7.f24027c     // Catch:{ all -> 0x005f }
                if (r4 == r1) goto L_0x003b
                r4 = 0
                goto L_0x0043
            L_0x003b:
                if (r4 == 0) goto L_0x0043
                com.facebook.imagepipeline.producers.af r1 = com.facebook.imagepipeline.producers.af.this     // Catch:{ all -> 0x005f }
                java.io.Closeable r4 = r1.cloneOrNull(r4)     // Catch:{ all -> 0x005f }
            L_0x0043:
                monitor-exit(r7)     // Catch:{ all -> 0x005f }
                if (r4 == 0) goto L_0x0054
                r1 = 0
                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x004e
                r8.onProgressUpdate(r5)     // Catch:{ all -> 0x0062 }
            L_0x004e:
                r8.onNewResult(r4, r6)     // Catch:{ all -> 0x0062 }
                a(r4)     // Catch:{ all -> 0x0062 }
            L_0x0054:
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                com.facebook.imagepipeline.producers.af$a$1 r8 = new com.facebook.imagepipeline.producers.af$a$1
                r8.<init>(r0)
                r9.addCallbacks(r8)
                r8 = 1
                return r8
            L_0x005f:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x005f }
                throw r8     // Catch:{ all -> 0x0062 }
            L_0x0062:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                throw r8
            L_0x0065:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.af.a.addNewConsumer(com.facebook.imagepipeline.producers.Consumer, com.facebook.imagepipeline.producers.am):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            if (r3.hasNext() == false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
            r0 = r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            ((com.facebook.imagepipeline.producers.Consumer) r0.first).onNewResult(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNextResult(com.facebook.imagepipeline.producers.af$a.a r3, T r4, int r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                com.facebook.imagepipeline.producers.af$a.a<> r0 = r2.f24030f     // Catch:{ all -> 0x004d }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                return
            L_0x0007:
                T r3 = r2.f24027c     // Catch:{ all -> 0x004d }
                a(r3)     // Catch:{ all -> 0x004d }
                r3 = 0
                r2.f24027c = r3     // Catch:{ all -> 0x004d }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.Consumer<T>, com.facebook.imagepipeline.producers.am>> r3 = r2.mConsumerContextPairs     // Catch:{ all -> 0x004d }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x004d }
                boolean r0 = com.facebook.imagepipeline.producers.b.isNotLast(r5)     // Catch:{ all -> 0x004d }
                if (r0 == 0) goto L_0x0026
                com.facebook.imagepipeline.producers.af r0 = com.facebook.imagepipeline.producers.af.this     // Catch:{ all -> 0x004d }
                java.io.Closeable r0 = r0.cloneOrNull(r4)     // Catch:{ all -> 0x004d }
                r2.f24027c = r0     // Catch:{ all -> 0x004d }
                r2.f24029e = r5     // Catch:{ all -> 0x004d }
                goto L_0x0032
            L_0x0026:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.Consumer<T>, com.facebook.imagepipeline.producers.am>> r0 = r2.mConsumerContextPairs     // Catch:{ all -> 0x004d }
                r0.clear()     // Catch:{ all -> 0x004d }
                com.facebook.imagepipeline.producers.af r0 = com.facebook.imagepipeline.producers.af.this     // Catch:{ all -> 0x004d }
                K r1 = r2.f24026b     // Catch:{ all -> 0x004d }
                r0.removeMultiplexer(r1, r2)     // Catch:{ all -> 0x004d }
            L_0x0032:
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
            L_0x0033:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x004c
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0049 }
                com.facebook.imagepipeline.producers.Consumer r1 = (com.facebook.imagepipeline.producers.Consumer) r1     // Catch:{ all -> 0x0049 }
                r1.onNewResult(r4, r5)     // Catch:{ all -> 0x0049 }
                monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                goto L_0x0033
            L_0x0049:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                throw r3
            L_0x004c:
                return
            L_0x004d:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.af.a.onNextResult(com.facebook.imagepipeline.producers.af$a$a, java.io.Closeable, int):void");
        }
    }

    /* access modifiers changed from: protected */
    public abstract K a(am amVar);

    /* access modifiers changed from: protected */
    public abstract T cloneOrNull(T t);

    protected af(al<T> alVar) {
        this.mInputProducer = alVar;
    }

    private synchronized a a(K k) {
        a aVar;
        aVar = new a<>(k);
        this.f24024a.put(k, aVar);
        return aVar;
    }

    public synchronized a getExistingMultiplexer(K k) {
        return this.f24024a.get(k);
    }

    public synchronized void removeMultiplexer(K k, a aVar) {
        if (this.f24024a.get(k) == aVar) {
            this.f24024a.remove(k);
        }
    }

    public void produceResults(Consumer<T> consumer, am amVar) {
        boolean z;
        a existingMultiplexer;
        try {
            if (b.isTracing()) {
                b.beginSection("MultiplexProducer#produceResults");
            }
            Object a2 = a(amVar);
            do {
                z = false;
                synchronized (this) {
                    existingMultiplexer = getExistingMultiplexer(a2);
                    if (existingMultiplexer == null) {
                        existingMultiplexer = a((K) a2);
                        z = true;
                    }
                }
            } while (!existingMultiplexer.addNewConsumer(consumer, amVar));
            if (z) {
                existingMultiplexer.startInputProducerIfHasAttachedConsumers();
            }
            if (b.isTracing()) {
                b.endSection();
            }
        } catch (Throwable th) {
            if (b.isTracing()) {
                b.endSection();
            }
            throw th;
        }
    }
}
