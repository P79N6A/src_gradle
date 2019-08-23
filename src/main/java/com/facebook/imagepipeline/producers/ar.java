package com.facebook.imagepipeline.producers;

import com.facebook.common.f.e;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.g;
import com.facebook.common.memory.f;
import com.facebook.common.memory.h;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.producers.v;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.transcoder.c;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public final class ar implements al<b> {

    /* renamed from: a  reason: collision with root package name */
    private final al<b> f24083a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f24084b;

    /* renamed from: c  reason: collision with root package name */
    private final c f24085c;
    public final Executor mExecutor;
    public final f mPooledByteBufferFactory;

    class a extends m<b, b> {
        public final c mImageTranscoderFactory;
        public boolean mIsCancelled;
        public final boolean mIsResizingEnabled;
        public final v mJobScheduler;
        public final am mProducerContext;

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onNewResultImpl(@Nullable Object obj, int i) {
            b bVar = (b) obj;
            if (!this.mIsCancelled) {
                boolean isLast = isLast(i);
                if (bVar == null) {
                    if (isLast) {
                        this.mConsumer.onNewResult(null, 1);
                    }
                    return;
                }
                e shouldTransform = ar.shouldTransform(this.mProducerContext.getImageRequest(), bVar, (com.facebook.imagepipeline.transcoder.b) Preconditions.checkNotNull(this.mImageTranscoderFactory.createImageTranscoder(bVar.getImageFormat(), this.mIsResizingEnabled)));
                if (isLast || shouldTransform != e.UNSET) {
                    if (shouldTransform != e.YES) {
                        if (!(this.mProducerContext.getImageRequest().getRotationOptions().canDeferUntilRendered() || bVar.getRotationAngle() == 0 || bVar.getRotationAngle() == -1)) {
                            b cloneOrNull = b.cloneOrNull(bVar);
                            bVar.close();
                            cloneOrNull.mRotationAngle = 0;
                            bVar = cloneOrNull;
                        }
                        this.mConsumer.onNewResult(bVar, i);
                    } else if (this.mJobScheduler.updateJob(bVar, i) && (isLast || this.mProducerContext.isIntermediateResultExpected())) {
                        this.mJobScheduler.scheduleJob();
                    }
                }
            }
        }

        public final void doTransform(b bVar, int i, com.facebook.imagepipeline.transcoder.b bVar2) {
            b bVar3;
            String str;
            this.mProducerContext.getListener().onProducerStart(this.mProducerContext.getId(), "ResizeAndRotateProducer");
            ImageRequest imageRequest = this.mProducerContext.getImageRequest();
            h newOutputStream = ar.this.mPooledByteBufferFactory.newOutputStream();
            g gVar = null;
            try {
                com.facebook.imagepipeline.transcoder.a transcode = bVar2.transcode(bVar, newOutputStream, imageRequest.getRotationOptions(), imageRequest.getResizeOptions(), null, 85);
                if (transcode.mTranscodeStatus != 2) {
                    ResizeOptions resizeOptions = imageRequest.getResizeOptions();
                    String identifier = bVar2.getIdentifier();
                    if (this.mProducerContext.getListener().requiresExtraMap(this.mProducerContext.getId())) {
                        String str2 = bVar.getWidth() + "x" + bVar.getHeight();
                        if (resizeOptions != null) {
                            str = resizeOptions.width + "x" + resizeOptions.height;
                        } else {
                            str = "Unspecified";
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("Image format", String.valueOf(bVar.getImageFormat()));
                        hashMap.put("Original size", str2);
                        hashMap.put("Requested size", str);
                        hashMap.put("queueTime", String.valueOf(this.mJobScheduler.getQueuedTime()));
                        hashMap.put("Transcoder id", identifier);
                        hashMap.put("Transcoding result", String.valueOf(transcode));
                        gVar = g.copyOf(hashMap);
                    }
                    CloseableReference of = CloseableReference.of(newOutputStream.toByteBuffer());
                    try {
                        bVar3 = new b(of);
                        bVar3.mImageFormat = com.facebook.b.b.f23288a;
                        bVar3.parseMetaData();
                        this.mProducerContext.getListener().onProducerFinishWithSuccess(this.mProducerContext.getId(), "ResizeAndRotateProducer", gVar);
                        if (transcode.mTranscodeStatus != 1) {
                            i |= 16;
                        }
                        this.mConsumer.onNewResult(bVar3, i);
                        b.closeSafely(bVar3);
                        CloseableReference.closeSafely(of);
                        newOutputStream.close();
                    } catch (Throwable th) {
                        CloseableReference.closeSafely(of);
                        throw th;
                    }
                } else {
                    throw new RuntimeException("Error while transcoding the image");
                }
            } catch (Exception e2) {
                try {
                    this.mProducerContext.getListener().onProducerFinishWithFailure(this.mProducerContext.getId(), "ResizeAndRotateProducer", e2, gVar);
                    if (isLast(i)) {
                        this.mConsumer.onFailure(e2);
                    }
                } finally {
                    newOutputStream.close();
                }
            }
        }

        a(final Consumer<b> consumer, am amVar, boolean z, c cVar) {
            super(consumer);
            this.mProducerContext = amVar;
            this.mIsResizingEnabled = z;
            this.mImageTranscoderFactory = cVar;
            this.mJobScheduler = new v(ar.this.mExecutor, new v.a(ar.this) {
                public final void run(b bVar, int i) {
                    a.this.doTransform(bVar, i, (com.facebook.imagepipeline.transcoder.b) Preconditions.checkNotNull(a.this.mImageTranscoderFactory.createImageTranscoder(bVar.getImageFormat(), a.this.mIsResizingEnabled)));
                }
            }, 100);
            this.mProducerContext.addCallbacks(new e(ar.this) {
                public final void onCancellationRequested() {
                    a.this.mJobScheduler.clearJob();
                    a.this.mIsCancelled = true;
                    consumer.onCancellation();
                }

                public final void onIsIntermediateResultExpectedChanged() {
                    if (a.this.mProducerContext.isIntermediateResultExpected()) {
                        a.this.mJobScheduler.scheduleJob();
                    }
                }
            });
        }
    }

    public final void produceResults(Consumer<b> consumer, am amVar) {
        al<b> alVar = this.f24083a;
        a aVar = new a(consumer, amVar, this.f24084b, this.f24085c);
        alVar.produceResults(aVar, amVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r0 != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.common.f.e shouldTransform(com.facebook.imagepipeline.request.ImageRequest r4, com.facebook.imagepipeline.image.b r5, com.facebook.imagepipeline.transcoder.b r6) {
        /*
            if (r5 == 0) goto L_0x0065
            com.facebook.b.c r0 = r5.getImageFormat()
            com.facebook.b.c r1 = com.facebook.b.c.f23294a
            if (r0 != r1) goto L_0x000b
            goto L_0x0065
        L_0x000b:
            com.facebook.b.c r0 = r5.getImageFormat()
            boolean r0 = r6.canTranscode(r0)
            if (r0 != 0) goto L_0x0018
            com.facebook.common.f.e r4 = com.facebook.common.f.e.NO
            return r4
        L_0x0018:
            com.facebook.imagepipeline.common.RotationOptions r0 = r4.getRotationOptions()
            boolean r1 = r0.canDeferUntilRendered()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x004d
            int r1 = com.facebook.imagepipeline.transcoder.d.getRotationAngle(r0, r5)
            if (r1 != 0) goto L_0x004b
            boolean r1 = r0.rotationEnabled()
            if (r1 == 0) goto L_0x0046
            boolean r0 = r0.canDeferUntilRendered()
            if (r0 == 0) goto L_0x0037
            goto L_0x0046
        L_0x0037:
            com.facebook.common.internal.f<java.lang.Integer> r0 = com.facebook.imagepipeline.transcoder.d.INVERTED_EXIF_ORIENTATIONS
            int r1 = r5.getExifOrientation()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            goto L_0x0049
        L_0x0046:
            r5.mExifOrientation = r3
            r0 = 0
        L_0x0049:
            if (r0 == 0) goto L_0x004d
        L_0x004b:
            r0 = 1
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 != 0) goto L_0x0060
            com.facebook.imagepipeline.common.RotationOptions r0 = r4.getRotationOptions()
            com.facebook.imagepipeline.common.ResizeOptions r4 = r4.getResizeOptions()
            boolean r4 = r6.canResize(r5, r0, r4)
            if (r4 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            com.facebook.common.f.e r4 = com.facebook.common.f.e.valueOf((boolean) r2)
            return r4
        L_0x0065:
            com.facebook.common.f.e r4 = com.facebook.common.f.e.UNSET
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.ar.shouldTransform(com.facebook.imagepipeline.request.ImageRequest, com.facebook.imagepipeline.image.b, com.facebook.imagepipeline.transcoder.b):com.facebook.common.f.e");
    }

    public ar(Executor executor, f fVar, al<b> alVar, boolean z, c cVar) {
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
        this.mPooledByteBufferFactory = (f) Preconditions.checkNotNull(fVar);
        this.f24083a = (al) Preconditions.checkNotNull(alVar);
        this.f24085c = (c) Preconditions.checkNotNull(cVar);
        this.f24084b = z;
    }
}
