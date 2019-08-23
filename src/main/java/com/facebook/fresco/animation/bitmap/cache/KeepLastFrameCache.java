package com.facebook.fresco.animation.bitmap.cache;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.imageutils.a;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class KeepLastFrameCache implements BitmapFrameCache {
    @Nullable
    private BitmapFrameCache.FrameCacheListener mFrameCacheListener;
    @GuardedBy
    @Nullable
    private CloseableReference<Bitmap> mLastBitmapReference;
    private int mLastFrameNumber = -1;

    public void onFramePrepared(int i, CloseableReference<Bitmap> closeableReference, int i2) {
    }

    public synchronized void clear() {
        closeAndResetLastBitmapReference();
    }

    private synchronized void closeAndResetLastBitmapReference() {
        if (!(this.mFrameCacheListener == null || this.mLastFrameNumber == -1)) {
            this.mFrameCacheListener.onFrameEvicted(this, this.mLastFrameNumber);
        }
        CloseableReference.closeSafely(this.mLastBitmapReference);
        this.mLastBitmapReference = null;
        this.mLastFrameNumber = -1;
    }

    public synchronized int getSizeInBytes() {
        if (this.mLastBitmapReference == null) {
            return 0;
        }
        return a.a((Bitmap) this.mLastBitmapReference.get());
    }

    public void setFrameCacheListener(BitmapFrameCache.FrameCacheListener frameCacheListener) {
        this.mFrameCacheListener = frameCacheListener;
    }

    @Nullable
    public synchronized CloseableReference<Bitmap> getFallbackFrame(int i) {
        return CloseableReference.cloneOrNull(this.mLastBitmapReference);
    }

    public synchronized boolean contains(int i) {
        boolean z;
        if (i != this.mLastFrameNumber || !CloseableReference.isValid(this.mLastBitmapReference)) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @Nullable
    public synchronized CloseableReference<Bitmap> getCachedFrame(int i) {
        if (this.mLastFrameNumber != i) {
            return null;
        }
        return CloseableReference.cloneOrNull(this.mLastBitmapReference);
    }

    public synchronized CloseableReference<Bitmap> getBitmapToReuseForFrame(int i, int i2, int i3) {
        CloseableReference<Bitmap> cloneOrNull;
        try {
            cloneOrNull = CloseableReference.cloneOrNull(this.mLastBitmapReference);
            closeAndResetLastBitmapReference();
        } catch (Throwable th) {
            closeAndResetLastBitmapReference();
            throw th;
        }
        return cloneOrNull;
    }

    public synchronized void onFrameRendered(int i, CloseableReference<Bitmap> closeableReference, int i2) {
        if (closeableReference != null) {
            if (this.mLastBitmapReference != null && ((Bitmap) closeableReference.get()).equals(this.mLastBitmapReference.get())) {
                return;
            }
        }
        CloseableReference.closeSafely(this.mLastBitmapReference);
        if (!(this.mFrameCacheListener == null || this.mLastFrameNumber == -1)) {
            this.mFrameCacheListener.onFrameEvicted(this, this.mLastFrameNumber);
        }
        this.mLastBitmapReference = CloseableReference.cloneOrNull(closeableReference);
        if (this.mFrameCacheListener != null) {
            this.mFrameCacheListener.onFrameCached(this, i);
        }
        this.mLastFrameNumber = i;
    }
}
