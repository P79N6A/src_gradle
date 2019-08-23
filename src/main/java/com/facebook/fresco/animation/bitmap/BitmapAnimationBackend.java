package com.facebook.fresco.animation.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntRange;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.backend.AnimationBackendDelegateWithInactivityCheck;
import com.facebook.fresco.animation.backend.AnimationInformation;
import com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparationStrategy;
import com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparer;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.Nullable;

public class BitmapAnimationBackend implements AnimationBackend, AnimationBackendDelegateWithInactivityCheck.InactivityListener {
    private static final Class<?> TAG = BitmapAnimationBackend.class;
    private final AnimationInformation mAnimationInformation;
    private Bitmap.Config mBitmapConfig = Bitmap.Config.ARGB_8888;
    private final BitmapFrameCache mBitmapFrameCache;
    @Nullable
    private final BitmapFramePreparationStrategy mBitmapFramePreparationStrategy;
    @Nullable
    private final BitmapFramePreparer mBitmapFramePreparer;
    private final BitmapFrameRenderer mBitmapFrameRenderer;
    private int mBitmapHeight;
    private int mBitmapWidth;
    @Nullable
    private Rect mBounds;
    @Nullable
    private FrameListener mFrameListener;
    private final Paint mPaint;
    private final PlatformBitmapFactory mPlatformBitmapFactory;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FrameType {
    }

    public interface FrameListener {
        void onDrawFrameStart(BitmapAnimationBackend bitmapAnimationBackend, int i);

        void onFrameDrawn(BitmapAnimationBackend bitmapAnimationBackend, int i, int i2);

        void onFrameDropped(BitmapAnimationBackend bitmapAnimationBackend, int i);
    }

    public int getIntrinsicHeight() {
        return this.mBitmapHeight;
    }

    public int getIntrinsicWidth() {
        return this.mBitmapWidth;
    }

    public void onInactive() {
        clear();
    }

    public void clear() {
        this.mBitmapFrameCache.clear();
    }

    public int getFrameCount() {
        return this.mAnimationInformation.getFrameCount();
    }

    public int getLoopCount() {
        return this.mAnimationInformation.getLoopCount();
    }

    public int getSizeInBytes() {
        return this.mBitmapFrameCache.getSizeInBytes();
    }

    private void updateBitmapDimensions() {
        int i;
        this.mBitmapWidth = this.mBitmapFrameRenderer.getIntrinsicWidth();
        int i2 = -1;
        if (this.mBitmapWidth == -1) {
            if (this.mBounds == null) {
                i = -1;
            } else {
                i = this.mBounds.width();
            }
            this.mBitmapWidth = i;
        }
        this.mBitmapHeight = this.mBitmapFrameRenderer.getIntrinsicHeight();
        if (this.mBitmapHeight == -1) {
            if (this.mBounds != null) {
                i2 = this.mBounds.height();
            }
            this.mBitmapHeight = i2;
        }
    }

    public void setBitmapConfig(Bitmap.Config config) {
        this.mBitmapConfig = config;
    }

    public void setFrameListener(@Nullable FrameListener frameListener) {
        this.mFrameListener = frameListener;
    }

    public int getFrameDurationMs(int i) {
        return this.mAnimationInformation.getFrameDurationMs(i);
    }

    public boolean hasCacheFrame(int i) {
        return this.mBitmapFrameCache.contains(i);
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.mPaint.setAlpha(i);
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public void setBounds(@Nullable Rect rect) {
        this.mBounds = rect;
        this.mBitmapFrameRenderer.setBounds(rect);
        updateBitmapDimensions();
    }

    private boolean renderFrameInBitmap(int i, @Nullable CloseableReference<Bitmap> closeableReference) {
        if (!CloseableReference.isValid(closeableReference)) {
            return false;
        }
        boolean renderFrame = this.mBitmapFrameRenderer.renderFrame(i, (Bitmap) closeableReference.get());
        if (!renderFrame) {
            CloseableReference.closeSafely(closeableReference);
        }
        return renderFrame;
    }

    public boolean drawFrame(Drawable drawable, Canvas canvas, int i) {
        if (this.mFrameListener != null) {
            this.mFrameListener.onDrawFrameStart(this, i);
        }
        boolean drawFrameOrFallback = drawFrameOrFallback(canvas, i, 0);
        if (!drawFrameOrFallback && this.mFrameListener != null) {
            this.mFrameListener.onFrameDropped(this, i);
        }
        if (!(this.mBitmapFramePreparationStrategy == null || this.mBitmapFramePreparer == null)) {
            this.mBitmapFramePreparationStrategy.prepareFrames(this.mBitmapFramePreparer, this.mBitmapFrameCache, this, i);
        }
        return drawFrameOrFallback;
    }

    private boolean drawFrameOrFallback(Canvas canvas, int i, int i2) {
        CloseableReference<Bitmap> closeableReference;
        boolean z;
        while (true) {
            int i3 = 3;
            CloseableReference<Bitmap> closeableReference2 = null;
            boolean z2 = true;
            switch (i2) {
                case 0:
                    closeableReference = this.mBitmapFrameCache.getCachedFrame(i);
                    z = drawBitmapAndCache(i, closeableReference, canvas, 0);
                    i3 = 1;
                    break;
                case 1:
                    closeableReference = this.mBitmapFrameCache.getBitmapToReuseForFrame(i, this.mBitmapWidth, this.mBitmapHeight);
                    if (!renderFrameInBitmap(i, closeableReference) || !drawBitmapAndCache(i, closeableReference, canvas, 1)) {
                        z2 = false;
                    }
                    z = z2;
                    i3 = 2;
                    break;
                case 2:
                    closeableReference = this.mPlatformBitmapFactory.createBitmap(this.mBitmapWidth, this.mBitmapHeight, this.mBitmapConfig);
                    if (renderFrameInBitmap(i, closeableReference) && drawBitmapAndCache(i, closeableReference, canvas, 2)) {
                        z = true;
                        break;
                    } else {
                        z = false;
                        break;
                    }
                case 3:
                    try {
                        closeableReference = this.mBitmapFrameCache.getFallbackFrame(i);
                        try {
                            z = drawBitmapAndCache(i, closeableReference, canvas, 3);
                            i3 = -1;
                            break;
                        } catch (Throwable th) {
                            th = th;
                            closeableReference2 = closeableReference;
                            CloseableReference.closeSafely(closeableReference2);
                            throw th;
                        }
                    } catch (RuntimeException e2) {
                        FLog.w(TAG, "Failed to create frame bitmap", (Throwable) e2);
                        CloseableReference.closeSafely((CloseableReference<?>) null);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        CloseableReference.closeSafely(closeableReference2);
                        throw th;
                    }
                default:
                    CloseableReference.closeSafely((CloseableReference<?>) null);
                    return false;
            }
            CloseableReference.closeSafely(closeableReference);
            if (z || i3 == -1) {
                return z;
            }
            i2 = i3;
        }
        return z;
    }

    private boolean drawBitmapAndCache(int i, @Nullable CloseableReference<Bitmap> closeableReference, Canvas canvas, int i2) {
        if (!CloseableReference.isValid(closeableReference)) {
            return false;
        }
        if (this.mBounds == null) {
            canvas.drawBitmap((Bitmap) closeableReference.get(), 0.0f, 0.0f, this.mPaint);
        } else {
            canvas.drawBitmap((Bitmap) closeableReference.get(), null, this.mBounds, this.mPaint);
        }
        if (i2 != 3) {
            this.mBitmapFrameCache.onFrameRendered(i, closeableReference, i2);
        }
        if (this.mFrameListener != null) {
            this.mFrameListener.onFrameDrawn(this, i, i2);
        }
        return true;
    }

    public BitmapAnimationBackend(PlatformBitmapFactory platformBitmapFactory, BitmapFrameCache bitmapFrameCache, AnimationInformation animationInformation, BitmapFrameRenderer bitmapFrameRenderer, @Nullable BitmapFramePreparationStrategy bitmapFramePreparationStrategy, @Nullable BitmapFramePreparer bitmapFramePreparer) {
        this.mPlatformBitmapFactory = platformBitmapFactory;
        this.mBitmapFrameCache = bitmapFrameCache;
        this.mAnimationInformation = animationInformation;
        this.mBitmapFrameRenderer = bitmapFrameRenderer;
        this.mBitmapFramePreparationStrategy = bitmapFramePreparationStrategy;
        this.mBitmapFramePreparer = bitmapFramePreparer;
        this.mPaint = new Paint(6);
        updateBitmapDimensions();
    }
}
