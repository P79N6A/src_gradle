package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

public final class i implements al<CloseableReference<CloseableImage>> {

    /* renamed from: a  reason: collision with root package name */
    private final al<CloseableReference<CloseableImage>> f24138a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24139b;

    /* renamed from: c  reason: collision with root package name */
    private final int f24140c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f24141d;

    static class a extends m<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {

        /* renamed from: a  reason: collision with root package name */
        private final int f24142a;

        /* renamed from: b  reason: collision with root package name */
        private final int f24143b;

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onNewResultImpl(Object obj, int i) {
            CloseableReference closeableReference = (CloseableReference) obj;
            if (closeableReference != null && closeableReference.isValid()) {
                CloseableImage closeableImage = (CloseableImage) closeableReference.get();
                if (closeableImage != null && !closeableImage.isClosed() && (closeableImage instanceof CloseableStaticBitmap)) {
                    Bitmap underlyingBitmap = ((CloseableStaticBitmap) closeableImage).getUnderlyingBitmap();
                    if (underlyingBitmap != null) {
                        int rowBytes = underlyingBitmap.getRowBytes() * underlyingBitmap.getHeight();
                        if (rowBytes >= this.f24142a && rowBytes <= this.f24143b) {
                            underlyingBitmap.prepareToDraw();
                        }
                    }
                }
            }
            this.mConsumer.onNewResult(closeableReference, i);
        }

        a(Consumer<CloseableReference<CloseableImage>> consumer, int i, int i2) {
            super(consumer);
            this.f24142a = i;
            this.f24143b = i2;
        }
    }

    public final void produceResults(Consumer<CloseableReference<CloseableImage>> consumer, am amVar) {
        if (!amVar.isPrefetch() || this.f24141d) {
            this.f24138a.produceResults(new a(consumer, this.f24139b, this.f24140c), amVar);
        } else {
            this.f24138a.produceResults(consumer, amVar);
        }
    }

    public i(al<CloseableReference<CloseableImage>> alVar, int i, int i2, boolean z) {
        boolean z2;
        if (i <= i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        this.f24138a = (al) Preconditions.checkNotNull(alVar);
        this.f24139b = i;
        this.f24140c = i2;
        this.f24141d = z;
    }
}
