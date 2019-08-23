package com.facebook.react.flat;

import android.content.Context;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.react.bridge.ReadableArray;
import javax.annotation.Nullable;

public interface DrawImage extends AttachDetachListener {
    int getBorderColor();

    float getBorderRadius();

    float getBorderWidth();

    ScalingUtils.ScaleType getScaleType();

    boolean hasImageRequest();

    void setBorderColor(int i);

    void setBorderRadius(float f2);

    void setBorderWidth(float f2);

    void setFadeDuration(int i);

    void setProgressiveRenderingEnabled(boolean z);

    void setReactTag(int i);

    void setScaleType(ScalingUtils.ScaleType scaleType);

    void setSource(Context context, @Nullable ReadableArray readableArray);

    void setTintColor(int i);
}
