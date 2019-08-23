package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.b;

public final class ba {
    public static int getAcceptableSize(int i) {
        return (int) (((float) i) * 1.3333334f);
    }

    public static boolean isImageBigEnough(b bVar, ResizeOptions resizeOptions) {
        if (bVar == null) {
            return false;
        }
        int rotationAngle = bVar.getRotationAngle();
        if (rotationAngle == 90 || rotationAngle == 270) {
            return isImageBigEnough(bVar.getHeight(), bVar.getWidth(), resizeOptions);
        }
        return isImageBigEnough(bVar.getWidth(), bVar.getHeight(), resizeOptions);
    }

    public static boolean isImageBigEnough(int i, int i2, ResizeOptions resizeOptions) {
        if (resizeOptions == null) {
            if (((float) getAcceptableSize(i)) < 2048.0f || getAcceptableSize(i2) < 2048) {
                return false;
            }
            return true;
        } else if (getAcceptableSize(i) < resizeOptions.width || getAcceptableSize(i2) < resizeOptions.height) {
            return false;
        } else {
            return true;
        }
    }
}
