package com.facebook.fresco.animation.bitmap.wrapper;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameRenderer;
import com.facebook.imagepipeline.animated.a.a;
import com.facebook.imagepipeline.animated.b.d;
import javax.annotation.Nullable;

public class AnimatedDrawableBackendFrameRenderer implements BitmapFrameRenderer {
    private static final Class<?> TAG = AnimatedDrawableBackendFrameRenderer.class;
    private a mAnimatedDrawableBackend;
    private d mAnimatedImageCompositor;
    public final BitmapFrameCache mBitmapFrameCache;
    private final d.a mCallback = new d.a() {
        public void onIntermediateResult(int i, Bitmap bitmap) {
        }

        @Nullable
        public CloseableReference<Bitmap> getCachedBitmap(int i) {
            return AnimatedDrawableBackendFrameRenderer.this.mBitmapFrameCache.getCachedFrame(i);
        }
    };

    public int getIntrinsicHeight() {
        return this.mAnimatedDrawableBackend.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.mAnimatedDrawableBackend.getWidth();
    }

    public void setBounds(@Nullable Rect rect) {
        a forNewBounds = this.mAnimatedDrawableBackend.forNewBounds(rect);
        if (forNewBounds != this.mAnimatedDrawableBackend) {
            this.mAnimatedDrawableBackend = forNewBounds;
            this.mAnimatedImageCompositor = new d(this.mAnimatedDrawableBackend, this.mCallback);
        }
    }

    public AnimatedDrawableBackendFrameRenderer(BitmapFrameCache bitmapFrameCache, a aVar) {
        this.mBitmapFrameCache = bitmapFrameCache;
        this.mAnimatedDrawableBackend = aVar;
        this.mAnimatedImageCompositor = new d(this.mAnimatedDrawableBackend, this.mCallback);
    }

    public boolean renderFrame(int i, Bitmap bitmap) {
        try {
            this.mAnimatedImageCompositor.renderFrame(i, bitmap);
            return true;
        } catch (IllegalStateException e2) {
            FLog.e(TAG, (Throwable) e2, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i));
            return false;
        }
    }
}
