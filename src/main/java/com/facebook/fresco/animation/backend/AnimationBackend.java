package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntRange;
import javax.annotation.Nullable;

public interface AnimationBackend extends AnimationInformation {
    void clear();

    boolean drawFrame(Drawable drawable, Canvas canvas, int i);

    int getIntrinsicHeight();

    int getIntrinsicWidth();

    int getSizeInBytes();

    boolean hasCacheFrame(int i);

    void setAlpha(@IntRange(from = 0, to = 255) int i);

    void setBounds(Rect rect);

    void setColorFilter(@Nullable ColorFilter colorFilter);
}
