package com.vivo.push.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public final class b {
    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = ((float) i) / ((float) width);
        float f3 = ((float) i2) / ((float) height);
        try {
            Matrix matrix = new Matrix();
            matrix.postScale(f2, f3);
            return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        } catch (Exception unused) {
            return bitmap;
        }
    }
}
