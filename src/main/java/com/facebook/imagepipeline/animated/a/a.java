package com.facebook.imagepipeline.animated.a;

import android.graphics.Canvas;
import android.graphics.Rect;

public interface a {
    a forNewBounds(Rect rect);

    int getDurationMsForFrame(int i);

    int getFrameCount();

    b getFrameInfo(int i);

    int getHeight();

    int getLoopCount();

    int getRenderedHeight();

    int getRenderedWidth();

    int getWidth();

    void renderFrame(int i, Canvas canvas);
}
