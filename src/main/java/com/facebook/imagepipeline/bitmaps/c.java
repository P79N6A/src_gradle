package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;

public final class c extends PlatformBitmapFactory {
    public final CloseableReference<Bitmap> createBitmapInternal(int i, int i2, Bitmap.Config config) {
        return CloseableReference.of(Bitmap.createBitmap(i, i2, config), f.getInstance());
    }
}
