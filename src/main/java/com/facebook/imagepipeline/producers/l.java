package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.g;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.b.e;
import com.facebook.imagepipeline.b.f;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.d;
import com.facebook.imagepipeline.producers.v;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class l implements al<CloseableReference<CloseableImage>> {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.common.memory.a f24147a;

    /* renamed from: b  reason: collision with root package name */
    private final e f24148b;

    /* renamed from: c  reason: collision with root package name */
    private final al<com.facebook.imagepipeline.image.b> f24149c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f24150d;

    /* renamed from: e  reason: collision with root package name */
    private final int f24151e;
    public final boolean mDownsampleEnabled;
    public final boolean mDownsampleEnabledForNetwork;
    public final Executor mExecutor;
    public final com.facebook.imagepipeline.b.c mImageDecoder;

    class a extends c {
        /* access modifiers changed from: protected */
        public final d a() {
            return com.facebook.imagepipeline.image.c.of(0, false, false);
        }

        /* access modifiers changed from: protected */
        public final int a(com.facebook.imagepipeline.image.b bVar) {
            return bVar.getSize();
        }

        /* access modifiers changed from: protected */
        public final synchronized boolean a(com.facebook.imagepipeline.image.b bVar, int i) {
            if (isNotLast(i)) {
                return false;
            }
            return super.a(bVar, i);
        }

        public a(Consumer<CloseableReference<CloseableImage>> consumer, am amVar, boolean z, int i) {
            super(consumer, amVar, z, i);
        }
    }

    class b extends c {

        /* renamed from: c  reason: collision with root package name */
        private final f f24154c;

        /* renamed from: d  reason: collision with root package name */
        private final e f24155d;

        /* renamed from: e  reason: collision with root package name */
        private int f24156e = 0;

        /* access modifiers changed from: protected */
        public final d a() {
            return this.f24155d.getQualityInfo(this.f24154c.mBestScanNumber);
        }

        /* access modifiers changed from: protected */
        public final int a(com.facebook.imagepipeline.image.b bVar) {
            return this.f24154c.mBestScanEndOffset;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
            return r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean a(com.facebook.imagepipeline.image.b r4, int r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = super.a(r4, r5)     // Catch:{ all -> 0x0053 }
                boolean r1 = isNotLast(r5)     // Catch:{ all -> 0x0053 }
                if (r1 != 0) goto L_0x0013
                r1 = 8
                boolean r1 = statusHasFlag(r5, r1)     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x0051
            L_0x0013:
                r1 = 4
                boolean r5 = statusHasFlag(r5, r1)     // Catch:{ all -> 0x0053 }
                if (r5 != 0) goto L_0x0051
                boolean r5 = com.facebook.imagepipeline.image.b.isValid(r4)     // Catch:{ all -> 0x0053 }
                if (r5 == 0) goto L_0x0051
                com.facebook.b.c r5 = r4.getImageFormat()     // Catch:{ all -> 0x0053 }
                com.facebook.b.c r1 = com.facebook.b.b.f23288a     // Catch:{ all -> 0x0053 }
                if (r5 != r1) goto L_0x0051
                com.facebook.imagepipeline.b.f r5 = r3.f24154c     // Catch:{ all -> 0x0053 }
                boolean r4 = r5.parseMoreData(r4)     // Catch:{ all -> 0x0053 }
                r5 = 0
                if (r4 != 0) goto L_0x0033
                monitor-exit(r3)
                return r5
            L_0x0033:
                com.facebook.imagepipeline.b.f r4 = r3.f24154c     // Catch:{ all -> 0x0053 }
                int r4 = r4.mBestScanNumber     // Catch:{ all -> 0x0053 }
                int r1 = r3.f24156e     // Catch:{ all -> 0x0053 }
                if (r4 > r1) goto L_0x003d
                monitor-exit(r3)
                return r5
            L_0x003d:
                com.facebook.imagepipeline.b.e r1 = r3.f24155d     // Catch:{ all -> 0x0053 }
                int r2 = r3.f24156e     // Catch:{ all -> 0x0053 }
                int r1 = r1.getNextScanNumberToDecode(r2)     // Catch:{ all -> 0x0053 }
                if (r4 >= r1) goto L_0x004f
                com.facebook.imagepipeline.b.f r1 = r3.f24154c     // Catch:{ all -> 0x0053 }
                boolean r1 = r1.mEndMarkerRead     // Catch:{ all -> 0x0053 }
                if (r1 != 0) goto L_0x004f
                monitor-exit(r3)
                return r5
            L_0x004f:
                r3.f24156e = r4     // Catch:{ all -> 0x0053 }
            L_0x0051:
                monitor-exit(r3)
                return r0
            L_0x0053:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.l.b.a(com.facebook.imagepipeline.image.b, int):boolean");
        }

        public b(Consumer<CloseableReference<CloseableImage>> consumer, am amVar, f fVar, e eVar, boolean z, int i) {
            super(consumer, amVar, z, i);
            this.f24154c = (f) Preconditions.checkNotNull(fVar);
            this.f24155d = (e) Preconditions.checkNotNull(eVar);
        }
    }

    abstract class c extends m<com.facebook.imagepipeline.image.b, CloseableReference<CloseableImage>> {

        /* renamed from: a  reason: collision with root package name */
        private final String f24157a = "ProgressiveDecoder";

        /* renamed from: c  reason: collision with root package name */
        private final ao f24159c;

        /* renamed from: d  reason: collision with root package name */
        private final ImageDecodeOptions f24160d;
        @GuardedBy

        /* renamed from: e  reason: collision with root package name */
        private boolean f24161e;
        public final v mJobScheduler;
        public final am mProducerContext;

        /* access modifiers changed from: protected */
        public abstract int a(com.facebook.imagepipeline.image.b bVar);

        /* access modifiers changed from: protected */
        public abstract d a();

        public void onCancellationImpl() {
            handleCancellation();
        }

        private synchronized boolean b() {
            return this.f24161e;
        }

        public void handleCancellation() {
            a(true);
            this.mConsumer.onCancellation();
        }

        public void onFailureImpl(Throwable th) {
            a(th);
        }

        private void a(Throwable th) {
            a(true);
            this.mConsumer.onFailure(th);
        }

        /* access modifiers changed from: protected */
        public final void onProgressUpdateImpl(float f2) {
            super.onProgressUpdateImpl(f2 * 0.99f);
        }

        private void a(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f24161e) {
                        this.mConsumer.onProgressUpdate(1.0f);
                        this.f24161e = true;
                        this.mJobScheduler.clearJob();
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public boolean a(com.facebook.imagepipeline.image.b bVar, int i) {
            return this.mJobScheduler.updateJob(bVar, i);
        }

        public void onNewResultImpl(com.facebook.imagepipeline.image.b bVar, int i) {
            try {
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.beginSection("DecodeProducer#onNewResultImpl");
                }
                boolean isLast = isLast(i);
                if (isLast && !com.facebook.imagepipeline.image.b.isValid(bVar)) {
                    a((Throwable) new com.facebook.common.f.a("Encoded image is not valid."));
                } else if (!a(bVar, i)) {
                    if (com.facebook.imagepipeline.e.b.isTracing()) {
                        com.facebook.imagepipeline.e.b.endSection();
                    }
                } else {
                    boolean statusHasFlag = statusHasFlag(i, 4);
                    if (isLast || statusHasFlag || this.mProducerContext.isIntermediateResultExpected()) {
                        this.mJobScheduler.scheduleJob();
                    }
                    if (com.facebook.imagepipeline.e.b.isTracing()) {
                        com.facebook.imagepipeline.e.b.endSection();
                    }
                }
            } finally {
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6 A[Catch:{ all -> 0x010d, all -> 0x0165 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void doDecode(com.facebook.imagepipeline.image.b r19, int r20) {
            /*
                r18 = this;
                r11 = r18
                r12 = r19
                r0 = r20
                com.facebook.b.c r1 = r19.getImageFormat()
                com.facebook.b.c r2 = com.facebook.b.b.f23288a
                if (r1 == r2) goto L_0x0015
                boolean r1 = isNotLast(r20)
                if (r1 == 0) goto L_0x0015
                return
            L_0x0015:
                boolean r1 = r18.b()
                if (r1 != 0) goto L_0x016a
                boolean r1 = com.facebook.imagepipeline.image.b.isValid(r19)
                if (r1 != 0) goto L_0x0023
                goto L_0x016a
            L_0x0023:
                com.facebook.b.c r1 = r19.getImageFormat()
                if (r1 == 0) goto L_0x002d
                java.lang.String r1 = r1.f23296c
            L_0x002b:
                r7 = r1
                goto L_0x0030
            L_0x002d:
                java.lang.String r1 = "unknown"
                goto L_0x002b
            L_0x0030:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r19.getWidth()
                r1.append(r2)
                java.lang.String r2 = "x"
                r1.append(r2)
                int r2 = r19.getHeight()
                r1.append(r2)
                java.lang.String r8 = r1.toString()
                int r1 = r12.mSampleSize
                java.lang.String r10 = java.lang.String.valueOf(r1)
                boolean r6 = isLast(r20)
                if (r6 == 0) goto L_0x0062
                r3 = 8
                boolean r3 = statusHasFlag(r0, r3)
                if (r3 != 0) goto L_0x0062
                r3 = 1
                goto L_0x0063
            L_0x0062:
                r3 = 0
            L_0x0063:
                r4 = 4
                boolean r5 = statusHasFlag(r0, r4)
                com.facebook.imagepipeline.producers.am r9 = r11.mProducerContext
                com.facebook.imagepipeline.request.ImageRequest r9 = r9.getImageRequest()
                com.facebook.imagepipeline.common.ResizeOptions r9 = r9.getResizeOptions()
                if (r9 == 0) goto L_0x008d
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                int r14 = r9.width
                r13.append(r14)
                java.lang.String r14 = "x"
                r13.append(r14)
                int r9 = r9.height
                r13.append(r9)
                java.lang.String r9 = r13.toString()
                goto L_0x008f
            L_0x008d:
                java.lang.String r9 = "unknown"
            L_0x008f:
                com.facebook.imagepipeline.producers.v r13 = r11.mJobScheduler     // Catch:{ all -> 0x0165 }
                long r13 = r13.getQueuedTime()     // Catch:{ all -> 0x0165 }
                com.facebook.imagepipeline.producers.am r15 = r11.mProducerContext     // Catch:{ all -> 0x0165 }
                com.facebook.imagepipeline.request.ImageRequest r15 = r15.getImageRequest()     // Catch:{ all -> 0x0165 }
                android.net.Uri r15 = r15.getSourceUri()     // Catch:{ all -> 0x0165 }
                java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0165 }
                if (r3 != 0) goto L_0x00af
                if (r5 == 0) goto L_0x00a8
                goto L_0x00af
            L_0x00a8:
                int r16 = r18.a((com.facebook.imagepipeline.image.b) r19)     // Catch:{ all -> 0x0165 }
            L_0x00ac:
                r1 = r16
                goto L_0x00b4
            L_0x00af:
                int r16 = r19.getSize()     // Catch:{ all -> 0x0165 }
                goto L_0x00ac
            L_0x00b4:
                if (r3 != 0) goto L_0x00bf
                if (r5 == 0) goto L_0x00b9
                goto L_0x00bf
            L_0x00b9:
                com.facebook.imagepipeline.image.d r3 = r18.a()     // Catch:{ all -> 0x0165 }
            L_0x00bd:
                r5 = r3
                goto L_0x00c2
            L_0x00bf:
                com.facebook.imagepipeline.image.d r3 = com.facebook.imagepipeline.image.c.FULL_QUALITY     // Catch:{ all -> 0x0165 }
                goto L_0x00bd
            L_0x00c2:
                com.facebook.imagepipeline.producers.ao r3 = r11.f24159c     // Catch:{ all -> 0x0165 }
                com.facebook.imagepipeline.producers.am r4 = r11.mProducerContext     // Catch:{ all -> 0x0165 }
                java.lang.String r4 = r4.getId()     // Catch:{ all -> 0x0165 }
                java.lang.String r2 = "DecodeProducer"
                r3.onProducerStart(r4, r2)     // Catch:{ all -> 0x0165 }
                com.facebook.imagepipeline.producers.l r3 = com.facebook.imagepipeline.producers.l.this     // Catch:{ a -> 0x0119 }
                com.facebook.imagepipeline.b.c r3 = r3.mImageDecoder     // Catch:{ a -> 0x0119 }
                com.facebook.imagepipeline.common.ImageDecodeOptions r4 = r11.f24160d     // Catch:{ a -> 0x0119 }
                com.facebook.imagepipeline.image.CloseableImage r16 = r3.decode(r12, r1, r5, r4)     // Catch:{ a -> 0x0119 }
                int r1 = r12.mSampleSize     // Catch:{ Exception -> 0x0112 }
                r2 = 1
                if (r1 == r2) goto L_0x00e0
                r0 = r0 | 16
            L_0x00e0:
                r1 = r18
                r2 = r16
                r3 = r13
                java.util.Map r1 = r1.a(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0165 }
                com.facebook.imagepipeline.producers.ao r2 = r11.f24159c     // Catch:{ all -> 0x0165 }
                com.facebook.imagepipeline.producers.am r3 = r11.mProducerContext     // Catch:{ all -> 0x0165 }
                java.lang.String r3 = r3.getId()     // Catch:{ all -> 0x0165 }
                java.lang.String r4 = "DecodeProducer"
                r2.onProducerFinishWithSuccess(r3, r4, r1)     // Catch:{ all -> 0x0165 }
                com.facebook.common.references.CloseableReference r1 = com.facebook.common.references.CloseableReference.of(r16)     // Catch:{ all -> 0x0165 }
                boolean r2 = isLast(r0)     // Catch:{ all -> 0x010d }
                r11.a((boolean) r2)     // Catch:{ all -> 0x010d }
                com.facebook.imagepipeline.producers.Consumer<O> r2 = r11.mConsumer     // Catch:{ all -> 0x010d }
                r2.onNewResult(r1, r0)     // Catch:{ all -> 0x010d }
                com.facebook.common.references.CloseableReference.closeSafely((com.facebook.common.references.CloseableReference<?>) r1)     // Catch:{ all -> 0x0165 }
                com.facebook.imagepipeline.image.b.closeSafely(r19)
                return
            L_0x010d:
                r0 = move-exception
                com.facebook.common.references.CloseableReference.closeSafely((com.facebook.common.references.CloseableReference<?>) r1)     // Catch:{ all -> 0x0165 }
                throw r0     // Catch:{ all -> 0x0165 }
            L_0x0112:
                r0 = move-exception
                r2 = r16
                goto L_0x014a
            L_0x0116:
                r0 = move-exception
                r2 = 0
                goto L_0x014a
            L_0x0119:
                r0 = move-exception
                com.facebook.imagepipeline.image.b r1 = r0.getEncodedImage()     // Catch:{ Exception -> 0x0116 }
                java.lang.String r3 = "ProgressiveDecoder"
                java.lang.String r4 = "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0116 }
                java.lang.String r16 = r0.getMessage()     // Catch:{ Exception -> 0x0116 }
                r17 = 0
                r2[r17] = r16     // Catch:{ Exception -> 0x0116 }
                r16 = 1
                r2[r16] = r15     // Catch:{ Exception -> 0x0116 }
                r15 = 10
                java.lang.String r15 = r1.getFirstBytesAsHexString(r15)     // Catch:{ Exception -> 0x0116 }
                r16 = 2
                r2[r16] = r15     // Catch:{ Exception -> 0x0116 }
                r15 = 3
                int r1 = r1.getSize()     // Catch:{ Exception -> 0x0116 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0116 }
                r2[r15] = r1     // Catch:{ Exception -> 0x0116 }
                com.facebook.common.logging.FLog.w((java.lang.String) r3, (java.lang.String) r4, (java.lang.Object[]) r2)     // Catch:{ Exception -> 0x0116 }
                throw r0     // Catch:{ Exception -> 0x0116 }
            L_0x014a:
                r1 = r18
                r3 = r13
                java.util.Map r1 = r1.a(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0165 }
                com.facebook.imagepipeline.producers.ao r2 = r11.f24159c     // Catch:{ all -> 0x0165 }
                com.facebook.imagepipeline.producers.am r3 = r11.mProducerContext     // Catch:{ all -> 0x0165 }
                java.lang.String r3 = r3.getId()     // Catch:{ all -> 0x0165 }
                java.lang.String r4 = "DecodeProducer"
                r2.onProducerFinishWithFailure(r3, r4, r0, r1)     // Catch:{ all -> 0x0165 }
                r11.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0165 }
                com.facebook.imagepipeline.image.b.closeSafely(r19)
                return
            L_0x0165:
                r0 = move-exception
                com.facebook.imagepipeline.image.b.closeSafely(r19)
                throw r0
            L_0x016a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.l.c.doDecode(com.facebook.imagepipeline.image.b, int):void");
        }

        public c(Consumer<CloseableReference<CloseableImage>> consumer, final am amVar, final boolean z, final int i) {
            super(consumer);
            this.mProducerContext = amVar;
            this.f24159c = amVar.getListener();
            this.f24160d = amVar.getImageRequest().getImageDecodeOptions();
            this.f24161e = false;
            this.mJobScheduler = new v(l.this.mExecutor, new v.a(l.this) {
                public final void run(com.facebook.imagepipeline.image.b bVar, int i) {
                    if (bVar != null) {
                        if (l.this.mDownsampleEnabled || !b.statusHasFlag(i, 16)) {
                            ImageRequest imageRequest = amVar.getImageRequest();
                            if (l.this.mDownsampleEnabledForNetwork || !com.facebook.common.f.f.b(imageRequest.getSourceUri())) {
                                bVar.mSampleSize = p.determineSampleSize(imageRequest.getRotationOptions(), imageRequest.getResizeOptions(), bVar, i);
                            }
                        }
                        c.this.doDecode(bVar, i);
                    }
                }
            }, this.f24160d.minDecodeIntervalMs);
            this.mProducerContext.addCallbacks(new e(l.this) {
                public final void onCancellationRequested() {
                    if (z) {
                        c.this.handleCancellation();
                    }
                }

                public final void onIsIntermediateResultExpectedChanged() {
                    if (c.this.mProducerContext.isIntermediateResultExpected()) {
                        c.this.mJobScheduler.scheduleJob();
                    }
                }
            });
        }

        private Map<String, String> a(@Nullable CloseableImage closeableImage, long j, d dVar, boolean z, String str, String str2, String str3, String str4) {
            if (!this.f24159c.requiresExtraMap(this.mProducerContext.getId())) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(dVar.isOfGoodEnoughQuality());
            String valueOf3 = String.valueOf(z);
            if (closeableImage instanceof CloseableStaticBitmap) {
                Bitmap underlyingBitmap = ((CloseableStaticBitmap) closeableImage).getUnderlyingBitmap();
                HashMap hashMap = new HashMap(8);
                hashMap.put("bitmapSize", underlyingBitmap.getWidth() + "x" + underlyingBitmap.getHeight());
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                hashMap.put("sampleSize", str4);
                return g.copyOf(hashMap);
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str2);
            hashMap2.put("imageFormat", str);
            hashMap2.put("requestedImageSize", str3);
            hashMap2.put("sampleSize", str4);
            return g.copyOf(hashMap2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.facebook.imagepipeline.producers.l$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.facebook.imagepipeline.producers.l$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.facebook.imagepipeline.producers.l$a} */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.facebook.imagepipeline.producers.Consumer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void produceResults(com.facebook.imagepipeline.producers.Consumer<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>> r10, com.facebook.imagepipeline.producers.am r11) {
        /*
            r9 = this;
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "DecodeProducer#produceResults"
            com.facebook.imagepipeline.e.b.beginSection(r0)     // Catch:{ all -> 0x004e }
        L_0x000b:
            com.facebook.imagepipeline.request.ImageRequest r0 = r11.getImageRequest()     // Catch:{ all -> 0x004e }
            android.net.Uri r0 = r0.getSourceUri()     // Catch:{ all -> 0x004e }
            boolean r0 = com.facebook.common.f.f.b(r0)     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x0027
            com.facebook.imagepipeline.producers.l$a r0 = new com.facebook.imagepipeline.producers.l$a     // Catch:{ all -> 0x004e }
            boolean r5 = r9.f24150d     // Catch:{ all -> 0x004e }
            int r6 = r9.f24151e     // Catch:{ all -> 0x004e }
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x004e }
            goto L_0x003e
        L_0x0027:
            com.facebook.imagepipeline.b.f r4 = new com.facebook.imagepipeline.b.f     // Catch:{ all -> 0x004e }
            com.facebook.common.memory.a r0 = r9.f24147a     // Catch:{ all -> 0x004e }
            r4.<init>(r0)     // Catch:{ all -> 0x004e }
            com.facebook.imagepipeline.producers.l$b r8 = new com.facebook.imagepipeline.producers.l$b     // Catch:{ all -> 0x004e }
            com.facebook.imagepipeline.b.e r5 = r9.f24148b     // Catch:{ all -> 0x004e }
            boolean r6 = r9.f24150d     // Catch:{ all -> 0x004e }
            int r7 = r9.f24151e     // Catch:{ all -> 0x004e }
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = r8
        L_0x003e:
            com.facebook.imagepipeline.producers.al<com.facebook.imagepipeline.image.b> r10 = r9.f24149c     // Catch:{ all -> 0x004e }
            r10.produceResults(r0, r11)     // Catch:{ all -> 0x004e }
            boolean r10 = com.facebook.imagepipeline.e.b.isTracing()
            if (r10 == 0) goto L_0x004d
            com.facebook.imagepipeline.e.b.endSection()
            return
        L_0x004d:
            return
        L_0x004e:
            r10 = move-exception
            boolean r11 = com.facebook.imagepipeline.e.b.isTracing()
            if (r11 == 0) goto L_0x0058
            com.facebook.imagepipeline.e.b.endSection()
        L_0x0058:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.l.produceResults(com.facebook.imagepipeline.producers.Consumer, com.facebook.imagepipeline.producers.am):void");
    }

    public l(com.facebook.common.memory.a aVar, Executor executor, com.facebook.imagepipeline.b.c cVar, e eVar, boolean z, boolean z2, boolean z3, al<com.facebook.imagepipeline.image.b> alVar, int i) {
        this.f24147a = (com.facebook.common.memory.a) Preconditions.checkNotNull(aVar);
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
        this.mImageDecoder = (com.facebook.imagepipeline.b.c) Preconditions.checkNotNull(cVar);
        this.f24148b = (e) Preconditions.checkNotNull(eVar);
        this.mDownsampleEnabled = z;
        this.mDownsampleEnabledForNetwork = z2;
        this.f24149c = (al) Preconditions.checkNotNull(alVar);
        this.f24150d = z3;
        this.f24151e = i;
    }
}
