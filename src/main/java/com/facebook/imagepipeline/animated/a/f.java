package com.facebook.imagepipeline.animated.a;

import android.graphics.Bitmap;

public interface f {
    void dispose();

    int getHeight();

    int getWidth();

    int getXOffset();

    int getYOffset();

    void renderFrame(int i, int i2, Bitmap bitmap);
}
