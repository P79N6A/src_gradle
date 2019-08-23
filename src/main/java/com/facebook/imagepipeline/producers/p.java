package com.facebook.imagepipeline.producers;

import android.support.annotation.Nullable;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.b;

public final class p {
    public static int determineSampleSize(RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions, b bVar, int i) {
        float f2;
        float f3;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        ResizeOptions resizeOptions2 = resizeOptions;
        int i6 = 1;
        if (!b.isMetaDataAvailable(bVar)) {
            return 1;
        }
        Preconditions.checkArgument(b.isMetaDataAvailable(bVar));
        int i7 = 2;
        if (resizeOptions2 == null || resizeOptions2.height <= 0 || resizeOptions2.width <= 0 || bVar.getWidth() == 0 || bVar.getHeight() == 0) {
            f2 = 1.0f;
        } else {
            if (!rotationOptions.useImageMetadata()) {
                i3 = 0;
            } else {
                i3 = bVar.getRotationAngle();
                if (i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Preconditions.checkArgument(z2);
            }
            if (i3 == 90 || i3 == 270) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i4 = bVar.getHeight();
            } else {
                i4 = bVar.getWidth();
            }
            if (z) {
                i5 = bVar.getWidth();
            } else {
                i5 = bVar.getHeight();
            }
            float f4 = ((float) resizeOptions2.width) / ((float) i4);
            float f5 = ((float) resizeOptions2.height) / ((float) i5);
            f2 = Math.max(f4, f5);
            FLog.v("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(resizeOptions2.width), Integer.valueOf(resizeOptions2.height), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f2));
        }
        if (bVar.getImageFormat() == com.facebook.b.b.f23288a) {
            if (f2 <= 0.6666667f) {
                i6 = 2;
                while (true) {
                    int i8 = i6 * 2;
                    double d2 = (double) i8;
                    Double.isNaN(d2);
                    double d3 = 1.0d / d2;
                    if (d3 + (d3 * 0.3333333432674408d) <= ((double) f2)) {
                        break;
                    }
                    i6 = i8;
                }
            }
        } else if (f2 <= 0.6666667f) {
            while (true) {
                double d4 = (double) i7;
                double pow = Math.pow(d4, 2.0d);
                Double.isNaN(d4);
                Double.isNaN(d4);
                if ((1.0d / d4) + ((1.0d / (pow - d4)) * 0.3333333432674408d) <= ((double) f2)) {
                    break;
                }
                int i9 = i;
                i7++;
            }
            i6 = i7 - 1;
        }
        int max = Math.max(bVar.getHeight(), bVar.getWidth());
        if (resizeOptions2 != null) {
            f3 = resizeOptions2.maxBitmapSize;
        } else {
            f3 = (float) i;
        }
        while (((float) (max / i6)) > f3) {
            if (bVar.getImageFormat() == com.facebook.b.b.f23288a) {
                i2 = i6 * 2;
            } else {
                i2 = i6 + 1;
            }
        }
        return i6;
    }
}
