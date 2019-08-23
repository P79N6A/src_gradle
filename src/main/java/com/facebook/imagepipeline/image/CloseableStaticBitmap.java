package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.b;
import com.facebook.imageutils.a;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class CloseableStaticBitmap extends a {
    private volatile Bitmap mBitmap;
    @GuardedBy
    private CloseableReference<Bitmap> mBitmapReference;
    private final int mExifOrientation;
    private final d mQualityInfo;
    private final int mRotationAngle;

    public int getExifOrientation() {
        return this.mExifOrientation;
    }

    public d getQualityInfo() {
        return this.mQualityInfo;
    }

    public int getRotationAngle() {
        return this.mRotationAngle;
    }

    public Bitmap getUnderlyingBitmap() {
        return this.mBitmap;
    }

    public int getSizeInBytes() {
        return a.a(this.mBitmap);
    }

    private synchronized CloseableReference<Bitmap> detachBitmapReference() {
        CloseableReference<Bitmap> closeableReference;
        closeableReference = this.mBitmapReference;
        this.mBitmapReference = null;
        this.mBitmap = null;
        return closeableReference;
    }

    @Nullable
    public synchronized CloseableReference<Bitmap> cloneUnderlyingBitmapReference() {
        return CloseableReference.cloneOrNull(this.mBitmapReference);
    }

    public void close() {
        CloseableReference<Bitmap> detachBitmapReference = detachBitmapReference();
        if (detachBitmapReference != null) {
            detachBitmapReference.close();
        }
    }

    public synchronized boolean isClosed() {
        boolean z;
        if (this.mBitmapReference == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized CloseableReference<Bitmap> convertToBitmapReference() {
        Preconditions.checkNotNull(this.mBitmapReference, "Cannot convert a closed static bitmap");
        return detachBitmapReference();
    }

    public int getHeight() {
        if (this.mRotationAngle % 180 != 0 || this.mExifOrientation == 5 || this.mExifOrientation == 7) {
            return getBitmapWidth(this.mBitmap);
        }
        return getBitmapHeight(this.mBitmap);
    }

    public int getWidth() {
        if (this.mRotationAngle % 180 != 0 || this.mExifOrientation == 5 || this.mExifOrientation == 7) {
            return getBitmapHeight(this.mBitmap);
        }
        return getBitmapWidth(this.mBitmap);
    }

    private static int getBitmapHeight(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int getBitmapWidth(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public CloseableStaticBitmap(CloseableReference<Bitmap> closeableReference, d dVar, int i) {
        this(closeableReference, dVar, i, 0);
    }

    public CloseableStaticBitmap(Bitmap bitmap, b<Bitmap> bVar, d dVar, int i) {
        this(bitmap, bVar, dVar, i, 0);
    }

    public CloseableStaticBitmap(CloseableReference<Bitmap> closeableReference, d dVar, int i, int i2) {
        this.mBitmapReference = (CloseableReference) Preconditions.checkNotNull(closeableReference.cloneOrNull());
        this.mBitmap = (Bitmap) this.mBitmapReference.get();
        this.mQualityInfo = dVar;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
    }

    public CloseableStaticBitmap(Bitmap bitmap, b<Bitmap> bVar, d dVar, int i, int i2) {
        this.mBitmap = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.mBitmapReference = CloseableReference.of(this.mBitmap, (b) Preconditions.checkNotNull(bVar));
        this.mQualityInfo = dVar;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
    }
}
