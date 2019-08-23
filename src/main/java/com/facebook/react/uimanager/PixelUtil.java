package com.facebook.react.uimanager;

import android.util.TypedValue;

public class PixelUtil {
    public static float toDIPFromPixel(float f2) {
        return f2 / DisplayMetricsHolder.getWindowDisplayMetrics().density;
    }

    public static float toPixelFromDIP(double d2) {
        return toPixelFromDIP((float) d2);
    }

    public static float toPixelFromSP(double d2) {
        return toPixelFromSP((float) d2);
    }

    public static float toPixelFromDIP(float f2) {
        return TypedValue.applyDimension(1, f2, DisplayMetricsHolder.getWindowDisplayMetrics());
    }

    public static float toPixelFromSP(float f2) {
        return TypedValue.applyDimension(2, f2, DisplayMetricsHolder.getWindowDisplayMetrics());
    }
}
