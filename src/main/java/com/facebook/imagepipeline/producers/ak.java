package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.g;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.request.Postprocessor;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class ak implements al<CloseableReference<CloseableImage>> {

    /* renamed from: a  reason: collision with root package name */
    private final al<CloseableReference<CloseableImage>> f24064a;
    public final PlatformBitmapFactory mBitmapFactory;
    public final Executor mExecutor;

    class a extends m<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {

        /* renamed from: b  reason: collision with root package name */
        private final ao f24066b;

        /* renamed from: c  reason: collision with root package name */
        private final String f24067c;

        /* renamed from: d  reason: collision with root package name */
        private final Postprocessor f24068d;
        @GuardedBy

        /* renamed from: e  reason: collision with root package name */
        private boolean f24069e;
        @GuardedBy

        /* renamed from: f  reason: collision with root package name */
        private boolean f24070f;
        @GuardedBy
        public boolean mIsDirty;
        @GuardedBy
        @Nullable
        public CloseableReference<CloseableImage> mSourceImageRef;
        @GuardedBy
        public int mStatus;

        /* access modifiers changed from: protected */
        public final void onCancellationImpl() {
            maybeNotifyOnCancellation();
        }

        private synchronized boolean c() {
            return this.f24069e;
        }

        private void a() {
            ak.this.mExecutor.execute(new Runnable() {
                public final void run() {
                    CloseableReference<CloseableImage> closeableReference;
                    int i;
                    synchronized (a.this) {
                        closeableReference = a.this.mSourceImageRef;
                        i = a.this.mStatus;
                        a.this.mSourceImageRef = null;
                        a.this.mIsDirty = false;
                    }
                    if (CloseableReference.isValid(closeableReference)) {
                        try {
                            a.this.doPostprocessing(closeableReference, i);
                        } finally {
                            CloseableReference.closeSafely(closeableReference);
                        }
                    }
                    a.this.clearRunningAndStartIfDirty();
                }
            });
        }

        public final void maybeNotifyOnCancellation() {
            if (d()) {
                this.mConsumer.onCancellation();
            }
        }

        private synchronized boolean b() {
            if (this.f24069e || !this.mIsDirty || this.f24070f || !CloseableReference.isValid(this.mSourceImageRef)) {
                return false;
            }
            this.f24070f = true;
            return true;
        }

        private boolean d() {
            synchronized (this) {
                if (this.f24069e) {
                    return false;
                }
                CloseableReference<CloseableImage> closeableReference = this.mSourceImageRef;
                this.mSourceImageRef = null;
                this.f24069e = true;
                CloseableReference.closeSafely(closeableReference);
                return true;
            }
        }

        public final void clearRunningAndStartIfDirty() {
            boolean b2;
            synchronized (this) {
                this.f24070f = false;
                b2 = b();
            }
            if (b2) {
                a();
            }
        }

        /* access modifiers changed from: protected */
        public final void onFailureImpl(Throwable th) {
            a(th);
        }

        private CloseableReference<CloseableImage> a(CloseableImage closeableImage) {
            CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableImage;
            CloseableReference<Bitmap> process = this.f24068d.process(closeableStaticBitmap.getUnderlyingBitmap(), ak.this.mBitmapFactory);
            try {
                return CloseableReference.of(new CloseableStaticBitmap(process, closeableImage.getQualityInfo(), closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation()));
            } finally {
                CloseableReference.closeSafely(process);
            }
        }

        private void a(Throwable th) {
            if (d()) {
                this.mConsumer.onFailure(th);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
            com.facebook.common.references.CloseableReference.closeSafely(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
            if (r2 == false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
            a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNewResultImpl(java.lang.Object r2, int r3) {
            /*
                r1 = this;
                com.facebook.common.references.CloseableReference r2 = (com.facebook.common.references.CloseableReference) r2
                boolean r0 = com.facebook.common.references.CloseableReference.isValid(r2)
                if (r0 != 0) goto L_0x0013
                boolean r2 = isLast(r3)
                if (r2 == 0) goto L_0x0012
                r2 = 0
                r1.a(r2, r3)
            L_0x0012:
                return
            L_0x0013:
                monitor-enter(r1)
                boolean r0 = r1.f24069e     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x001a
                monitor-exit(r1)     // Catch:{ all -> 0x0035 }
                return
            L_0x001a:
                com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage> r0 = r1.mSourceImageRef     // Catch:{ all -> 0x0035 }
                com.facebook.common.references.CloseableReference r2 = com.facebook.common.references.CloseableReference.cloneOrNull((com.facebook.common.references.CloseableReference<T>) r2)     // Catch:{ all -> 0x0035 }
                r1.mSourceImageRef = r2     // Catch:{ all -> 0x0035 }
                r1.mStatus = r3     // Catch:{ all -> 0x0035 }
                r2 = 1
                r1.mIsDirty = r2     // Catch:{ all -> 0x0035 }
                boolean r2 = r1.b()     // Catch:{ all -> 0x0035 }
                monitor-exit(r1)     // Catch:{ all -> 0x0035 }
                com.facebook.common.references.CloseableReference.closeSafely((com.facebook.common.references.CloseableReference<?>) r0)
                if (r2 == 0) goto L_0x0034
                r1.a()
            L_0x0034:
                return
            L_0x0035:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0035 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.ak.a.onNewResultImpl(java.lang.Object, int):void");
        }

        private void a(CloseableReference<CloseableImage> closeableReference, int i) {
            boolean isLast = isLast(i);
            if ((!isLast && !c()) || (isLast && d())) {
                this.mConsumer.onNewResult(closeableReference, i);
            }
        }

        public final void doPostprocessing(CloseableReference<CloseableImage> closeableReference, int i) {
            Preconditions.checkArgument(CloseableReference.isValid(closeableReference));
            if (!(((CloseableImage) closeableReference.get()) instanceof CloseableStaticBitmap)) {
                a(closeableReference, i);
                return;
            }
            this.f24066b.onProducerStart(this.f24067c, "PostprocessorProducer");
            CloseableReference<CloseableImage> closeableReference2 = null;
            try {
                CloseableReference<CloseableImage> a2 = a((CloseableImage) closeableReference.get());
                try {
                    this.f24066b.onProducerFinishWithSuccess(this.f24067c, "PostprocessorProducer", a(this.f24066b, this.f24067c, this.f24068d));
                    a(a2, i);
                    CloseableReference.closeSafely(a2);
                } catch (Throwable th) {
                    th = th;
                    closeableReference2 = a2;
                    CloseableReference.closeSafely(closeableReference2);
                    throw th;
                }
            } catch (Exception e2) {
                this.f24066b.onProducerFinishWithFailure(this.f24067c, "PostprocessorProducer", e2, a(this.f24066b, this.f24067c, this.f24068d));
                a((Throwable) e2);
                CloseableReference.closeSafely((CloseableReference<?>) null);
            } catch (Throwable th2) {
                th = th2;
                CloseableReference.closeSafely(closeableReference2);
                throw th;
            }
        }

        private static Map<String, String> a(ao aoVar, String str, Postprocessor postprocessor) {
            if (!aoVar.requiresExtraMap(str)) {
                return null;
            }
            return g.of("Postprocessor", postprocessor.getName());
        }

        public a(Consumer<CloseableReference<CloseableImage>> consumer, ao aoVar, String str, Postprocessor postprocessor, am amVar) {
            super(consumer);
            this.f24066b = aoVar;
            this.f24067c = str;
            this.f24068d = postprocessor;
            amVar.addCallbacks(new e(ak.this) {
                public final void onCancellationRequested() {
                    a.this.maybeNotifyOnCancellation();
                }
            });
        }
    }

    class b extends m<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> implements com.facebook.imagepipeline.request.b {
        @GuardedBy

        /* renamed from: b  reason: collision with root package name */
        private boolean f24075b;
        @GuardedBy
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        private CloseableReference<CloseableImage> f24076c;

        /* access modifiers changed from: protected */
        public final void onCancellationImpl() {
            if (close()) {
                this.mConsumer.onCancellation();
            }
        }

        public final boolean close() {
            synchronized (this) {
                if (this.f24075b) {
                    return false;
                }
                CloseableReference<CloseableImage> closeableReference = this.f24076c;
                this.f24076c = null;
                this.f24075b = true;
                CloseableReference.closeSafely(closeableReference);
                return true;
            }
        }

        /* access modifiers changed from: protected */
        public final void onFailureImpl(Throwable th) {
            if (close()) {
                this.mConsumer.onFailure(th);
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onNewResultImpl(Object obj, int i) {
            CloseableReference closeableReference = (CloseableReference) obj;
            if (!isNotLast(i)) {
                synchronized (this) {
                    if (!this.f24075b) {
                        CloseableReference<CloseableImage> closeableReference2 = this.f24076c;
                        this.f24076c = CloseableReference.cloneOrNull(closeableReference);
                        CloseableReference.closeSafely(closeableReference2);
                    }
                }
                synchronized (this) {
                    if (!this.f24075b) {
                        CloseableReference cloneOrNull = CloseableReference.cloneOrNull(this.f24076c);
                        try {
                            this.mConsumer.onNewResult(cloneOrNull, 0);
                        } finally {
                            CloseableReference.closeSafely(cloneOrNull);
                        }
                    }
                }
            }
        }

        private b(a aVar, com.facebook.imagepipeline.request.a aVar2, am amVar) {
            super(aVar);
            aVar2.setCallback(this);
            amVar.addCallbacks(new e(ak.this) {
                public final void onCancellationRequested() {
                    if (b.this.close()) {
                        b.this.mConsumer.onCancellation();
                    }
                }
            });
        }

        /* synthetic */ b(ak akVar, a aVar, com.facebook.imagepipeline.request.a aVar2, am amVar, byte b2) {
            this(aVar, aVar2, amVar);
        }
    }

    class c extends m<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        private c(a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onNewResultImpl(Object obj, int i) {
            CloseableReference closeableReference = (CloseableReference) obj;
            if (!isNotLast(i)) {
                this.mConsumer.onNewResult(closeableReference, i);
            }
        }

        /* synthetic */ c(ak akVar, a aVar, byte b2) {
            this(aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.facebook.imagepipeline.producers.ak$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.facebook.imagepipeline.producers.ak$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.facebook.imagepipeline.producers.ak$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.facebook.imagepipeline.producers.ak$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void produceResults(com.facebook.imagepipeline.producers.Consumer<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>> r10, com.facebook.imagepipeline.producers.am r11) {
        /*
            r9 = this;
            com.facebook.imagepipeline.producers.ao r3 = r11.getListener()
            com.facebook.imagepipeline.request.ImageRequest r0 = r11.getImageRequest()
            com.facebook.imagepipeline.request.Postprocessor r7 = r0.getPostprocessor()
            com.facebook.imagepipeline.producers.ak$a r8 = new com.facebook.imagepipeline.producers.ak$a
            java.lang.String r4 = r11.getId()
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r7
            r6 = r11
            r0.<init>(r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof com.facebook.imagepipeline.request.a
            if (r0 == 0) goto L_0x002c
            com.facebook.imagepipeline.producers.ak$b r6 = new com.facebook.imagepipeline.producers.ak$b
            r3 = r7
            com.facebook.imagepipeline.request.a r3 = (com.facebook.imagepipeline.request.a) r3
            r5 = 0
            r0 = r6
            r1 = r9
            r2 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0032
        L_0x002c:
            com.facebook.imagepipeline.producers.ak$c r6 = new com.facebook.imagepipeline.producers.ak$c
            r0 = 0
            r6.<init>(r9, r8, r0)
        L_0x0032:
            com.facebook.imagepipeline.producers.al<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>> r0 = r9.f24064a
            r0.produceResults(r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.ak.produceResults(com.facebook.imagepipeline.producers.Consumer, com.facebook.imagepipeline.producers.am):void");
    }

    public ak(al<CloseableReference<CloseableImage>> alVar, PlatformBitmapFactory platformBitmapFactory, Executor executor) {
        this.f24064a = (al) Preconditions.checkNotNull(alVar);
        this.mBitmapFactory = platformBitmapFactory;
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
    }
}
