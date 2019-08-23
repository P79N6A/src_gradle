package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;

public final class j implements al<b> {

    /* renamed from: a  reason: collision with root package name */
    private final al<b> f24144a;
    public final al<b> mInputProducer2;

    class a extends m<b, b> {

        /* renamed from: b  reason: collision with root package name */
        private am f24146b;

        /* access modifiers changed from: protected */
        public final void onFailureImpl(Throwable th) {
            j.this.mInputProducer2.produceResults(this.mConsumer, this.f24146b);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onNewResultImpl(Object obj, int i) {
            b bVar = (b) obj;
            ImageRequest imageRequest = this.f24146b.getImageRequest();
            boolean isLast = isLast(i);
            boolean isImageBigEnough = ba.isImageBigEnough(bVar, imageRequest.getResizeOptions());
            if (bVar != null && (isImageBigEnough || imageRequest.getLocalThumbnailPreviewsEnabled())) {
                if (!isLast || !isImageBigEnough) {
                    this.mConsumer.onNewResult(bVar, turnOffStatusFlag(i, 1));
                } else {
                    this.mConsumer.onNewResult(bVar, i);
                }
            }
            if (isLast && !isImageBigEnough) {
                b.closeSafely(bVar);
                j.this.mInputProducer2.produceResults(this.mConsumer, this.f24146b);
            }
        }

        private a(Consumer<b> consumer, am amVar) {
            super(consumer);
            this.f24146b = amVar;
        }

        /* synthetic */ a(j jVar, Consumer consumer, am amVar, byte b2) {
            this(consumer, amVar);
        }
    }

    public j(al<b> alVar, al<b> alVar2) {
        this.f24144a = alVar;
        this.mInputProducer2 = alVar2;
    }

    public final void produceResults(Consumer<b> consumer, am amVar) {
        this.f24144a.produceResults(new a(this, consumer, amVar, (byte) 0), amVar);
    }
}
