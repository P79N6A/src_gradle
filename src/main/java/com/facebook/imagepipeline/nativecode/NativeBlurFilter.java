package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;

@DoNotStrip
public class NativeBlurFilter {
    @DoNotStrip
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    static {
        b.load();
    }

    public static void iterativeBoxBlur(Bitmap bitmap, int i, int i2) {
        boolean z;
        Preconditions.checkNotNull(bitmap);
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (i2 > 0) {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }
}
