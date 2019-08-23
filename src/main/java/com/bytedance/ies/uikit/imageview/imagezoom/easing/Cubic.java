package com.bytedance.ies.uikit.imageview.imagezoom.easing;

public class Cubic implements Easing {
    public double easeIn(double d2, double d3, double d4, double d5) {
        double d6 = d2 / d5;
        return (d4 * d6 * d6 * d6) + d3;
    }

    public double easeInOut(double d2, double d3, double d4, double d5) {
        double d6 = d2 / (d5 / 2.0d);
        if (d6 < 1.0d) {
            return ((d4 / 2.0d) * d6 * d6 * d6) + d3;
        }
        double d7 = d6 - 2.0d;
        return ((d4 / 2.0d) * ((d7 * d7 * d7) + 2.0d)) + d3;
    }

    public double easeOut(double d2, double d3, double d4, double d5) {
        double d6 = (d2 / d5) - 1.0d;
        return (d4 * ((d6 * d6 * d6) + 1.0d)) + d3;
    }
}
