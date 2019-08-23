package com.facebook.fresco.animation.bitmap.cache;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.imagepipeline.animated.b.c;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.a;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class FrescoFrameCache implements BitmapFrameCache {
    private static final Class<?> TAG = FrescoFrameCache.class;
    private final c mAnimatedFrameCache;
    private final boolean mEnableBitmapReusing;
    private int mLastRenderedIndex = -1;
    @GuardedBy
    @Nullable
    private CloseableReference<CloseableImage> mLastRenderedItem;
    @GuardedBy
    private final SparseArray<CloseableReference<CloseableImage>> mPreparedPendingFrames;

    public void setFrameCacheListener(BitmapFrameCache.FrameCacheListener frameCacheListener) {
    }

    private synchronized int getPreparedPendingFramesSizeBytes() {
        int i;
        i = 0;
        for (int i2 = 0; i2 < this.mPreparedPendingFrames.size(); i2++) {
            i += getBitmapSizeBytes(this.mPreparedPendingFrames.valueAt(i2));
        }
        return i;
    }

    public synchronized int getSizeInBytes() {
        return getBitmapSizeBytes(this.mLastRenderedItem) + getPreparedPendingFramesSizeBytes();
    }

    public synchronized void clear() {
        CloseableReference.closeSafely(this.mLastRenderedItem);
        this.mAnimatedFrameCache.clear(this.mLastRenderedIndex);
        this.mLastRenderedItem = null;
        this.mLastRenderedIndex = -1;
        for (int i = 0; i < this.mPreparedPendingFrames.size(); i++) {
            CloseableReference valueAt = this.mPreparedPendingFrames.valueAt(i);
            if (valueAt != null) {
                CloseableReference.closeSafely(valueAt);
                this.mAnimatedFrameCache.clear(this.mPreparedPendingFrames.keyAt(i));
            }
        }
        this.mPreparedPendingFrames.clear();
    }

    @Nullable
    private static CloseableReference<CloseableImage> createImageReference(CloseableReference<Bitmap> closeableReference) {
        return CloseableReference.of(new CloseableStaticBitmap(closeableReference, com.facebook.imagepipeline.image.c.FULL_QUALITY, 0));
    }

    public synchronized boolean contains(int i) {
        return this.mAnimatedFrameCache.contains(i);
    }

    @Nullable
    public synchronized CloseableReference<Bitmap> getCachedFrame(int i) {
        return convertToBitmapReferenceAndClose(this.mAnimatedFrameCache.get(i));
    }

    @Nullable
    public synchronized CloseableReference<Bitmap> getFallbackFrame(int i) {
        return convertToBitmapReferenceAndClose(CloseableReference.cloneOrNull(this.mLastRenderedItem));
    }

    private static int getBitmapSizeBytes(@Nullable CloseableReference<CloseableImage> closeableReference) {
        if (!CloseableReference.isValid(closeableReference)) {
            return 0;
        }
        return getBitmapSizeBytes((CloseableImage) closeableReference.get());
    }

    @VisibleForTesting
    @Nullable
    static CloseableReference<Bitmap> convertToBitmapReferenceAndClose(@Nullable CloseableReference<CloseableImage> closeableReference) {
        try {
            if (CloseableReference.isValid(closeableReference) && (closeableReference.get() instanceof CloseableStaticBitmap)) {
                CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableReference.get();
                if (closeableStaticBitmap != null) {
                    return closeableStaticBitmap.cloneUnderlyingBitmapReference();
                }
            }
            CloseableReference.closeSafely(closeableReference);
            return null;
        } finally {
            CloseableReference.closeSafely(closeableReference);
        }
    }

    private static int getBitmapSizeBytes(@Nullable CloseableImage closeableImage) {
        if (!(closeableImage instanceof a)) {
            return 0;
        }
        return com.facebook.imageutils.a.a(((a) closeableImage).getUnderlyingBitmap());
    }

    private synchronized void removePreparedReference(int i) {
        CloseableReference closeableReference = this.mPreparedPendingFrames.get(i);
        if (closeableReference != null) {
            this.mPreparedPendingFrames.delete(i);
            CloseableReference.closeSafely(closeableReference);
            FLog.v(TAG, "removePreparedReference(%d) removed. Pending frames: %s", (Object) Integer.valueOf(i), (Object) this.mPreparedPendingFrames);
        }
    }

    public FrescoFrameCache(c cVar, boolean z) {
        this.mAnimatedFrameCache = cVar;
        this.mEnableBitmapReusing = z;
        this.mPreparedPendingFrames = new SparseArray<>();
    }

    @Nullable
    public synchronized CloseableReference<Bitmap> getBitmapToReuseForFrame(int i, int i2, int i3) {
        if (!this.mEnableBitmapReusing) {
            return null;
        }
        return convertToBitmapReferenceAndClose(this.mAnimatedFrameCache.getForReuse());
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:10:0x0020=Splitter:B:10:0x0020, B:16:0x0027=Splitter:B:16:0x0027} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onFrameRendered(int r1, com.facebook.common.references.CloseableReference<android.graphics.Bitmap> r2, int r3) {
        /*
            r0 = this;
            monitor-enter(r0)
            com.facebook.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x002b }
            r0.removePreparedReference(r1)     // Catch:{ all -> 0x002b }
            r3 = 0
            com.facebook.common.references.CloseableReference r2 = createImageReference(r2)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0020
            com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage> r3 = r0.mLastRenderedItem     // Catch:{ all -> 0x001e }
            com.facebook.common.references.CloseableReference.closeSafely((com.facebook.common.references.CloseableReference<?>) r3)     // Catch:{ all -> 0x001e }
            com.facebook.imagepipeline.animated.b.c r3 = r0.mAnimatedFrameCache     // Catch:{ all -> 0x001e }
            com.facebook.common.references.CloseableReference r3 = r3.cache(r1, r2)     // Catch:{ all -> 0x001e }
            r0.mLastRenderedItem = r3     // Catch:{ all -> 0x001e }
            r0.mLastRenderedIndex = r1     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r1 = move-exception
            goto L_0x0027
        L_0x0020:
            com.facebook.common.references.CloseableReference.closeSafely((com.facebook.common.references.CloseableReference<?>) r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            return
        L_0x0025:
            r1 = move-exception
            r2 = r3
        L_0x0027:
            com.facebook.common.references.CloseableReference.closeSafely((com.facebook.common.references.CloseableReference<?>) r2)     // Catch:{ all -> 0x002b }
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fresco.animation.bitmap.cache.FrescoFrameCache.onFrameRendered(int, com.facebook.common.references.CloseableReference, int):void");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0042=Splitter:B:22:0x0042, B:15:0x0039=Splitter:B:15:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onFramePrepared(int r3, com.facebook.common.references.CloseableReference<android.graphics.Bitmap> r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.facebook.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x0046 }
            r5 = 0
            com.facebook.common.references.CloseableReference r4 = createImageReference(r4)     // Catch:{ all -> 0x0040 }
            if (r4 != 0) goto L_0x0010
            com.facebook.common.references.CloseableReference.closeSafely((com.facebook.common.references.CloseableReference<?>) r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r2)
            return
        L_0x0010:
            com.facebook.imagepipeline.animated.b.c r5 = r2.mAnimatedFrameCache     // Catch:{ all -> 0x003e }
            com.facebook.common.references.CloseableReference r5 = r5.cache(r3, r4)     // Catch:{ all -> 0x003e }
            boolean r0 = com.facebook.common.references.CloseableReference.isValid(r5)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0039
            android.util.SparseArray<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>> r0 = r2.mPreparedPendingFrames     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x003e }
            com.facebook.common.references.CloseableReference r0 = (com.facebook.common.references.CloseableReference) r0     // Catch:{ all -> 0x003e }
            com.facebook.common.references.CloseableReference.closeSafely((com.facebook.common.references.CloseableReference<?>) r0)     // Catch:{ all -> 0x003e }
            android.util.SparseArray<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>> r0 = r2.mPreparedPendingFrames     // Catch:{ all -> 0x003e }
            r0.put(r3, r5)     // Catch:{ all -> 0x003e }
            java.lang.Class<?> r5 = TAG     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "cachePreparedFrame(%d) cached. Pending frames: %s"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003e }
            android.util.SparseArray<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>> r1 = r2.mPreparedPendingFrames     // Catch:{ all -> 0x003e }
            com.facebook.common.logging.FLog.v((java.lang.Class<?>) r5, (java.lang.String) r0, (java.lang.Object) r3, (java.lang.Object) r1)     // Catch:{ all -> 0x003e }
        L_0x0039:
            com.facebook.common.references.CloseableReference.closeSafely((com.facebook.common.references.CloseableReference<?>) r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r2)
            return
        L_0x003e:
            r3 = move-exception
            goto L_0x0042
        L_0x0040:
            r3 = move-exception
            r4 = r5
        L_0x0042:
            com.facebook.common.references.CloseableReference.closeSafely((com.facebook.common.references.CloseableReference<?>) r4)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fresco.animation.bitmap.cache.FrescoFrameCache.onFramePrepared(int, com.facebook.common.references.CloseableReference, int):void");
    }
}
