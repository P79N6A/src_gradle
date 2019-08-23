package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.b;

public final class ay implements al<b> {

    /* renamed from: a  reason: collision with root package name */
    private final az<b>[] f24113a;

    class a extends m<b, b> {

        /* renamed from: b  reason: collision with root package name */
        private final am f24115b;

        /* renamed from: c  reason: collision with root package name */
        private final int f24116c;

        /* renamed from: d  reason: collision with root package name */
        private final ResizeOptions f24117d = this.f24115b.getImageRequest().getResizeOptions();

        /* access modifiers changed from: protected */
        public final void onFailureImpl(Throwable th) {
            if (!ay.this.produceResultsFromThumbnailProducer(this.f24116c + 1, this.mConsumer, this.f24115b)) {
                this.mConsumer.onFailure(th);
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onNewResultImpl(Object obj, int i) {
            b bVar = (b) obj;
            if (bVar == null || (!isNotLast(i) && !ba.isImageBigEnough(bVar, this.f24117d))) {
                if (isLast(i)) {
                    b.closeSafely(bVar);
                    if (!ay.this.produceResultsFromThumbnailProducer(this.f24116c + 1, this.mConsumer, this.f24115b)) {
                        this.mConsumer.onNewResult(null, 1);
                    }
                }
                return;
            }
            this.mConsumer.onNewResult(bVar, i);
        }

        public a(Consumer<b> consumer, am amVar, int i) {
            super(consumer);
            this.f24115b = amVar;
            this.f24116c = i;
        }
    }

    public ay(az<b>... azVarArr) {
        this.f24113a = (az[]) Preconditions.checkNotNull(azVarArr);
        Preconditions.checkElementIndex(0, this.f24113a.length);
    }

    public final void produceResults(Consumer<b> consumer, am amVar) {
        if (amVar.getImageRequest().getResizeOptions() == null) {
            consumer.onNewResult(null, 1);
            return;
        }
        if (!produceResultsFromThumbnailProducer(0, consumer, amVar)) {
            consumer.onNewResult(null, 1);
        }
    }

    public final boolean produceResultsFromThumbnailProducer(int i, Consumer<b> consumer, am amVar) {
        ResizeOptions resizeOptions = amVar.getImageRequest().getResizeOptions();
        while (true) {
            if (i >= this.f24113a.length) {
                i = -1;
                break;
            } else if (this.f24113a[i].canProvideImageForSize(resizeOptions)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return false;
        }
        this.f24113a[i].produceResults(new a(consumer, amVar, i), amVar);
        return true;
    }
}
