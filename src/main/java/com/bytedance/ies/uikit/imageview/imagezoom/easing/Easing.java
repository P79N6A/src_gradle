package com.bytedance.ies.uikit.imageview.imagezoom.easing;

public interface Easing {
    double easeIn(double d2, double d3, double d4, double d5);

    double easeInOut(double d2, double d3, double d4, double d5);

    double easeOut(double d2, double d3, double d4, double d5);
}
