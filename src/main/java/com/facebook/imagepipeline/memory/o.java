package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;

public final class o implements d {
    public final void trim(MemoryTrimType memoryTrimType) {
    }

    public final void release(Bitmap bitmap) {
        bitmap.recycle();
    }

    public final Bitmap get(int i) {
        double d2 = (double) i;
        Double.isNaN(d2);
        return Bitmap.createBitmap(1, (int) Math.ceil(d2 / 2.0d), Bitmap.Config.RGB_565);
    }
}
