package com.facebook.imagepipeline.transcoder;

import android.graphics.Matrix;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.f;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.b;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import javax.annotation.Nullable;

public final class d {
    public static final f<Integer> INVERTED_EXIF_ORIENTATIONS = f.of(2, 7, 4, 5);

    public static boolean isExifOrientationAllowed(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case e.l /*?: ONE_ARG  (7 int)*/:
            case 8:
                return true;
            default:
                return false;
        }
    }

    @VisibleForTesting
    public static int roundNumerator(float f2, float f3) {
        return (int) (f3 + (f2 * 8.0f));
    }

    @VisibleForTesting
    public static int calculateDownsampleNumerator(int i) {
        return Math.max(1, 8 / i);
    }

    public static boolean isRotationAngleAllowed(int i) {
        if (i < 0 || i > 270 || i % 90 != 0) {
            return false;
        }
        return true;
    }

    public static int getForceRotatedInvertedExifOrientation(RotationOptions rotationOptions, b bVar) {
        int indexOf = INVERTED_EXIF_ORIENTATIONS.indexOf(Integer.valueOf(bVar.getExifOrientation()));
        if (indexOf >= 0) {
            int i = 0;
            if (!rotationOptions.useImageMetadata()) {
                i = rotationOptions.getForcedAngle();
            }
            return ((Integer) INVERTED_EXIF_ORIENTATIONS.get((indexOf + (i / 90)) % INVERTED_EXIF_ORIENTATIONS.size())).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    public static int getRotationAngle(RotationOptions rotationOptions, b bVar) {
        int i = 0;
        if (!rotationOptions.rotationEnabled()) {
            return 0;
        }
        int rotationAngle = bVar.getRotationAngle();
        if (rotationAngle == 90 || rotationAngle == 180 || rotationAngle == 270) {
            i = bVar.getRotationAngle();
        }
        if (rotationOptions.useImageMetadata()) {
            return i;
        }
        return (i + rotationOptions.getForcedAngle()) % 360;
    }

    @Nullable
    public static Matrix getTransformationMatrix(b bVar, RotationOptions rotationOptions) {
        if (INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(bVar.getExifOrientation()))) {
            int forceRotatedInvertedExifOrientation = getForceRotatedInvertedExifOrientation(rotationOptions, bVar);
            Matrix matrix = new Matrix();
            if (forceRotatedInvertedExifOrientation == 2) {
                matrix.setScale(-1.0f, 1.0f);
            } else if (forceRotatedInvertedExifOrientation != 7) {
                switch (forceRotatedInvertedExifOrientation) {
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    default:
                        return null;
                }
            } else {
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
            }
            return matrix;
        }
        int rotationAngle = getRotationAngle(rotationOptions, bVar);
        if (rotationAngle == 0) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRotate((float) rotationAngle);
        return matrix2;
    }

    @VisibleForTesting
    public static float determineResizeRatio(ResizeOptions resizeOptions, int i, int i2) {
        if (resizeOptions == null) {
            return 1.0f;
        }
        float f2 = (float) i;
        float f3 = (float) i2;
        float max = Math.max(((float) resizeOptions.width) / f2, ((float) resizeOptions.height) / f3);
        if (f2 * max > resizeOptions.maxBitmapSize) {
            max = resizeOptions.maxBitmapSize / f2;
        }
        if (f3 * max > resizeOptions.maxBitmapSize) {
            max = resizeOptions.maxBitmapSize / f3;
        }
        return max;
    }

    public static int getSoftwareNumerator(RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions, b bVar, boolean z) {
        int i;
        int i2;
        int i3;
        if (!z || resizeOptions == null) {
            return 8;
        }
        int rotationAngle = getRotationAngle(rotationOptions, bVar);
        boolean z2 = false;
        if (INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(bVar.getExifOrientation()))) {
            i = getForceRotatedInvertedExifOrientation(rotationOptions, bVar);
        } else {
            i = 0;
        }
        if (rotationAngle == 90 || rotationAngle == 270 || i == 5 || i == 7) {
            z2 = true;
        }
        if (z2) {
            i2 = bVar.getHeight();
        } else {
            i2 = bVar.getWidth();
        }
        if (z2) {
            i3 = bVar.getWidth();
        } else {
            i3 = bVar.getHeight();
        }
        int roundNumerator = roundNumerator(determineResizeRatio(resizeOptions, i2, i3), resizeOptions.roundUpFraction);
        if (roundNumerator > 8) {
            return 8;
        }
        if (roundNumerator <= 0) {
            return 1;
        }
        return roundNumerator;
    }
}
