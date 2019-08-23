package com.facebook.imagepipeline.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.support.v4.util.Pools;
import com.facebook.common.e.a;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.memory.d;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(21)
@ThreadSafe
public abstract class b implements f {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f23835b = b.class;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f23836d = {-1, -39};
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final Pools.SynchronizedPool<ByteBuffer> f23837a;

    /* renamed from: c  reason: collision with root package name */
    private final d f23838c;

    public abstract int getBitmapSize(int i, int i2, BitmapFactory.Options options);

    private static BitmapFactory.Options a(com.facebook.imagepipeline.image.b bVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = bVar.mSampleSize;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(bVar.getInputStream(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    public b(d dVar, int i, Pools.SynchronizedPool synchronizedPool) {
        this.f23838c = dVar;
        this.f23837a = synchronizedPool;
        for (int i2 = 0; i2 < i; i2++) {
            this.f23837a.release(ByteBuffer.allocate(16384));
        }
    }

    public CloseableReference<Bitmap> decodeJPEGFromEncodedImage(com.facebook.imagepipeline.image.b bVar, Bitmap.Config config, @Nullable Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(bVar, config, rect, i, false);
    }

    public CloseableReference<Bitmap> decodeFromEncodedImageWithColorSpace(com.facebook.imagepipeline.image.b bVar, Bitmap.Config config, @Nullable Rect rect, boolean z) {
        boolean z2;
        BitmapFactory.Options a2 = a(bVar, config);
        if (a2.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            return a(bVar.getInputStream(), a2, rect, z);
        } catch (RuntimeException e2) {
            if (z2) {
                return decodeFromEncodedImageWithColorSpace(bVar, Bitmap.Config.ARGB_8888, rect, z);
            }
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        com.facebook.common.logging.FLog.e(f23835b, "Could not decode region %s, decoding full bitmap instead.", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r0 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00d6 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d A[Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6, all -> 0x00a4, IOException -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084 A[Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6, all -> 0x00a4, IOException -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.common.references.CloseableReference<android.graphics.Bitmap> a(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, @javax.annotation.Nullable android.graphics.Rect r11, boolean r12) {
        /*
            r8 = this;
            com.facebook.common.internal.Preconditions.checkNotNull(r9)
            int r0 = r10.outWidth
            int r1 = r10.outHeight
            if (r11 == 0) goto L_0x0017
            int r0 = r11.width()
            int r1 = r10.inSampleSize
            int r0 = r0 / r1
            int r1 = r11.height()
            int r2 = r10.inSampleSize
            int r1 = r1 / r2
        L_0x0017:
            int r2 = r8.getBitmapSize(r0, r1, r10)
            com.facebook.imagepipeline.memory.d r3 = r8.f23838c
            java.lang.Object r2 = r3.get(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x00dd
            r10.inBitmap = r2
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L_0x0037
            if (r12 == 0) goto L_0x0037
            android.graphics.ColorSpace$Named r12 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r12 = android.graphics.ColorSpace.get(r12)
            r10.inPreferredColorSpace = r12
        L_0x0037:
            android.support.v4.util.Pools$SynchronizedPool<java.nio.ByteBuffer> r12 = r8.f23837a
            java.lang.Object r12 = r12.acquire()
            java.nio.ByteBuffer r12 = (java.nio.ByteBuffer) r12
            if (r12 != 0) goto L_0x0047
            r12 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r12)
        L_0x0047:
            r3 = 1
            r4 = 0
            byte[] r5 = r12.array()     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
            r10.inTempStorage = r5     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
            if (r11 == 0) goto L_0x0081
            android.graphics.Bitmap$Config r5 = r10.inPreferredConfig     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r2.reconfigure(r0, r1, r5)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r9, r3)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            android.graphics.Bitmap r1 = r0.decodeRegion(r11, r10)     // Catch:{ IOException -> 0x0068 }
            if (r0 == 0) goto L_0x0082
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
            goto L_0x0082
        L_0x0064:
            r11 = move-exception
            r0 = r4
            goto L_0x007b
        L_0x0067:
            r0 = r4
        L_0x0068:
            java.lang.Class<?> r1 = f23835b     // Catch:{ all -> 0x007a }
            java.lang.String r5 = "Could not decode region %s, decoding full bitmap instead."
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x007a }
            r7 = 0
            r6[r7] = r11     // Catch:{ all -> 0x007a }
            com.facebook.common.logging.FLog.e((java.lang.Class<?>) r1, (java.lang.String) r5, (java.lang.Object[]) r6)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0081
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
            goto L_0x0081
        L_0x007a:
            r11 = move-exception
        L_0x007b:
            if (r0 == 0) goto L_0x0080
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
        L_0x0080:
            throw r11     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
        L_0x0081:
            r1 = r4
        L_0x0082:
            if (r1 != 0) goto L_0x0088
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r9, r4, r10)     // Catch:{ IllegalArgumentException -> 0x00ad, RuntimeException -> 0x00a6 }
        L_0x0088:
            android.support.v4.util.Pools$SynchronizedPool<java.nio.ByteBuffer> r9 = r8.f23837a
            r9.release(r12)
            if (r2 != r1) goto L_0x0096
            com.facebook.imagepipeline.memory.d r9 = r8.f23838c
            com.facebook.common.references.CloseableReference r9 = com.facebook.common.references.CloseableReference.of(r1, r9)
            return r9
        L_0x0096:
            com.facebook.imagepipeline.memory.d r9 = r8.f23838c
            r9.release(r2)
            r1.recycle()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x00a4:
            r9 = move-exception
            goto L_0x00d7
        L_0x00a6:
            r9 = move-exception
            com.facebook.imagepipeline.memory.d r10 = r8.f23838c     // Catch:{ all -> 0x00a4 }
            r10.release(r2)     // Catch:{ all -> 0x00a4 }
            throw r9     // Catch:{ all -> 0x00a4 }
        L_0x00ad:
            r11 = move-exception
            com.facebook.imagepipeline.memory.d r0 = r8.f23838c     // Catch:{ all -> 0x00a4 }
            r0.release(r2)     // Catch:{ all -> 0x00a4 }
            r9.reset()     // Catch:{ IOException -> 0x00d6 }
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x00d6 }
            r0.<init>()     // Catch:{ IOException -> 0x00d6 }
            r0.inMutable = r3     // Catch:{ IOException -> 0x00d6 }
            int r10 = r10.inSampleSize     // Catch:{ IOException -> 0x00d6 }
            r0.inSampleSize = r10     // Catch:{ IOException -> 0x00d6 }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r9, r4, r0)     // Catch:{ IOException -> 0x00d6 }
            if (r9 == 0) goto L_0x00d5
            com.facebook.imagepipeline.bitmaps.f r10 = com.facebook.imagepipeline.bitmaps.f.getInstance()     // Catch:{ IOException -> 0x00d6 }
            com.facebook.common.references.CloseableReference r9 = com.facebook.common.references.CloseableReference.of(r9, r10)     // Catch:{ IOException -> 0x00d6 }
            android.support.v4.util.Pools$SynchronizedPool<java.nio.ByteBuffer> r10 = r8.f23837a
            r10.release(r12)
            return r9
        L_0x00d5:
            throw r11     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            throw r11     // Catch:{ all -> 0x00a4 }
        L_0x00d7:
            android.support.v4.util.Pools$SynchronizedPool<java.nio.ByteBuffer> r10 = r8.f23837a
            r10.release(r12)
            throw r9
        L_0x00dd:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "BitmapPool.get returned null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.c.b.a(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, boolean):com.facebook.common.references.CloseableReference");
    }

    public CloseableReference<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(com.facebook.imagepipeline.image.b bVar, Bitmap.Config config, @Nullable Rect rect, int i, boolean z) {
        InputStream inputStream;
        boolean z2;
        boolean isCompleteAt = bVar.isCompleteAt(i);
        BitmapFactory.Options a2 = a(bVar, config);
        InputStream inputStream2 = bVar.getInputStream();
        Preconditions.checkNotNull(inputStream2);
        if (bVar.getSize() > i) {
            inputStream2 = new a(inputStream2, i);
        }
        if (!isCompleteAt) {
            inputStream = new com.facebook.common.e.b(inputStream2, f23836d);
        } else {
            inputStream = inputStream2;
        }
        if (a2.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            return a(inputStream, a2, rect, z);
        } catch (RuntimeException e2) {
            if (z2) {
                return decodeJPEGFromEncodedImageWithColorSpace(bVar, Bitmap.Config.ARGB_8888, rect, i, z);
            }
            throw e2;
        }
    }
}
