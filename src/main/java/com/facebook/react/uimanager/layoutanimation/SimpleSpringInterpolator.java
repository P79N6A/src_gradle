package com.facebook.react.uimanager.layoutanimation;

import android.view.animation.Interpolator;

public class SimpleSpringInterpolator implements Interpolator {
    SimpleSpringInterpolator() {
    }

    public float getInterpolation(float f2) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f2));
        double d2 = (double) (f2 - 0.125f);
        Double.isNaN(d2);
        return (float) ((pow * Math.sin(((d2 * 3.141592653589793d) * 2.0d) / 0.5d)) + 1.0d);
    }
}
