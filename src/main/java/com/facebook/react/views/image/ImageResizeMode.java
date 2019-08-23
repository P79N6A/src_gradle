package com.facebook.react.views.image;

import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import javax.annotation.Nullable;

public class ImageResizeMode {
    public static ScalingUtils.ScaleType defaultValue() {
        return ScalingUtils.ScaleType.CENTER_CROP;
    }

    public static ScalingUtils.ScaleType toScaleType(@Nullable String str) {
        if ("contain".equals(str)) {
            return ScalingUtils.ScaleType.FIT_CENTER;
        }
        if ("cover".equals(str)) {
            return ScalingUtils.ScaleType.CENTER_CROP;
        }
        if ("stretch".equals(str)) {
            return ScalingUtils.ScaleType.FIT_XY;
        }
        if ("center".equals(str)) {
            return ScalingUtils.ScaleType.CENTER_INSIDE;
        }
        if (str == null) {
            return defaultValue();
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
    }
}
