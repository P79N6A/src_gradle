package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.k;
import com.facebook.common.memory.e;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.memory.b;
import com.facebook.imagepipeline.memory.c;
import com.facebook.imageutils.a;
import java.util.Locale;
import javax.annotation.Nullable;

@DoNotStrip
public abstract class DalvikPurgeableDecoder implements f {
    protected static final byte[] EOI = {-1, -39};
    private final b mUnpooledBitmapsCounter = c.get();

    @DoNotStrip
    private static native void nativePinBitmap(Bitmap bitmap);

    /* access modifiers changed from: protected */
    public abstract Bitmap decodeByteArrayAsPurgeable(CloseableReference<e> closeableReference, BitmapFactory.Options options);

    /* access modifiers changed from: protected */
    public abstract Bitmap decodeJPEGByteArrayAsPurgeable(CloseableReference<e> closeableReference, int i, BitmapFactory.Options options);

    protected DalvikPurgeableDecoder() {
    }

    static {
        a.load();
    }

    public CloseableReference<Bitmap> pinBitmap(Bitmap bitmap) {
        Preconditions.checkNotNull(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.mUnpooledBitmapsCounter.increase(bitmap)) {
                return CloseableReference.of(bitmap, this.mUnpooledBitmapsCounter.mUnpooledBitmapsReleaser);
            }
            int a2 = a.a(bitmap);
            bitmap.recycle();
            throw new com.facebook.imagepipeline.common.b(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(a2), Integer.valueOf(this.mUnpooledBitmapsCounter.getCount()), Long.valueOf(this.mUnpooledBitmapsCounter.getSize()), Integer.valueOf(this.mUnpooledBitmapsCounter.getMaxCount()), Integer.valueOf(this.mUnpooledBitmapsCounter.getMaxSize())}));
        } catch (Exception e2) {
            bitmap.recycle();
            throw k.b(e2);
        }
    }

    @VisibleForTesting
    public static boolean endsWithEOI(CloseableReference<e> closeableReference, int i) {
        e eVar = (e) closeableReference.get();
        if (i >= 2 && eVar.read(i - 2) == -1 && eVar.read(i - 1) == -39) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public static BitmapFactory.Options getBitmapFactoryOptions(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (Build.VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    public CloseableReference<Bitmap> decodeFromEncodedImage(com.facebook.imagepipeline.image.b bVar, Bitmap.Config config, @Nullable Rect rect) {
        return decodeFromEncodedImageWithColorSpace(bVar, config, rect, false);
    }

    public CloseableReference<Bitmap> decodeJPEGFromEncodedImage(com.facebook.imagepipeline.image.b bVar, Bitmap.Config config, @Nullable Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(bVar, config, rect, i, false);
    }

    public CloseableReference<Bitmap> decodeFromEncodedImageWithColorSpace(com.facebook.imagepipeline.image.b bVar, Bitmap.Config config, @Nullable Rect rect, boolean z) {
        BitmapFactory.Options bitmapFactoryOptions = getBitmapFactoryOptions(bVar.mSampleSize, config);
        CloseableReference<e> byteBufferRef = bVar.getByteBufferRef();
        Preconditions.checkNotNull(byteBufferRef);
        try {
            return pinBitmap(decodeByteArrayAsPurgeable(byteBufferRef, bitmapFactoryOptions));
        } finally {
            CloseableReference.closeSafely(byteBufferRef);
        }
    }

    public CloseableReference<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(com.facebook.imagepipeline.image.b bVar, Bitmap.Config config, @Nullable Rect rect, int i, boolean z) {
        BitmapFactory.Options bitmapFactoryOptions = getBitmapFactoryOptions(bVar.mSampleSize, config);
        CloseableReference<e> byteBufferRef = bVar.getByteBufferRef();
        Preconditions.checkNotNull(byteBufferRef);
        try {
            return pinBitmap(decodeJPEGByteArrayAsPurgeable(byteBufferRef, i, bitmapFactoryOptions));
        } finally {
            CloseableReference.closeSafely(byteBufferRef);
        }
    }
}
