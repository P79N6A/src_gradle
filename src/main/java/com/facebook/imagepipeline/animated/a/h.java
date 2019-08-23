package com.facebook.imagepipeline.animated.a;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import java.util.Collection;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private CloseableReference<Bitmap> f23781a;

    /* renamed from: b  reason: collision with root package name */
    private List<CloseableReference<Bitmap>> f23782b;
    public int mFrameForPreview;
    public final e mImage;

    public final List<CloseableReference<Bitmap>> getDecodedFrames() {
        return CloseableReference.cloneOrNull((Collection<CloseableReference<T>>) this.f23782b);
    }

    public final CloseableReference<Bitmap> getPreviewBitmap() {
        return CloseableReference.cloneOrNull(this.f23781a);
    }

    public final g build() {
        try {
            return new g(this);
        } finally {
            CloseableReference.closeSafely(this.f23781a);
            this.f23781a = null;
            CloseableReference.closeSafely((Iterable<? extends CloseableReference<?>>) this.f23782b);
            this.f23782b = null;
        }
    }

    public final h setFrameForPreview(int i) {
        this.mFrameForPreview = i;
        return this;
    }

    h(e eVar) {
        this.mImage = eVar;
    }

    public final h setDecodedFrames(List<CloseableReference<Bitmap>> list) {
        this.f23782b = CloseableReference.cloneOrNull((Collection<CloseableReference<T>>) list);
        return this;
    }

    public final h setPreviewBitmap(CloseableReference<Bitmap> closeableReference) {
        this.f23781a = CloseableReference.cloneOrNull(closeableReference);
        return this;
    }
}
