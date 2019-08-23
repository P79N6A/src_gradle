package com.facebook.imagepipeline.animated.a;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import java.util.List;
import javax.annotation.Nullable;

public final class g {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private CloseableReference<Bitmap> f23779a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private List<CloseableReference<Bitmap>> f23780b;
    public final int mFrameForPreview;
    public final e mImage;

    public final synchronized CloseableReference<Bitmap> getPreviewBitmap() {
        return CloseableReference.cloneOrNull(this.f23779a);
    }

    public final synchronized void dispose() {
        CloseableReference.closeSafely(this.f23779a);
        this.f23779a = null;
        CloseableReference.closeSafely((Iterable<? extends CloseableReference<?>>) this.f23780b);
        this.f23780b = null;
    }

    public final synchronized int getDecodedFrameSize() {
        if (this.f23780b == null) {
            return 0;
        }
        return this.f23780b.size();
    }

    public static g forAnimatedImage(e eVar) {
        return new g(eVar);
    }

    public static h newBuilder(e eVar) {
        return new h(eVar);
    }

    private g(e eVar) {
        this.mImage = (e) Preconditions.checkNotNull(eVar);
        this.mFrameForPreview = 0;
    }

    g(h hVar) {
        this.mImage = (e) Preconditions.checkNotNull(hVar.mImage);
        this.mFrameForPreview = hVar.mFrameForPreview;
        this.f23779a = hVar.getPreviewBitmap();
        this.f23780b = hVar.getDecodedFrames();
    }

    @Nullable
    public final synchronized CloseableReference<Bitmap> getDecodedFrame(int i) {
        if (this.f23780b == null) {
            return null;
        }
        return CloseableReference.cloneOrNull(this.f23780b.get(i));
    }

    public final synchronized boolean hasDecodedFrame(int i) {
        boolean z;
        if (this.f23780b == null || this.f23780b.get(i) == null) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }
}
