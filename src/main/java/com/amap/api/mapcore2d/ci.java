package com.amap.api.mapcore2d;

import com.amap.api.maps2d.model.LatLng;

public class ci {

    /* renamed from: a  reason: collision with root package name */
    static double f5838a = 3.141592653589793d;

    public static LatLng a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return cj.a(c(latLng.longitude, latLng.latitude));
    }

    public static double a(double d2, double d3) {
        return (Math.cos(d3 / 100000.0d) * (d2 / 18000.0d)) + (Math.sin(d2 / 100000.0d) * (d3 / 9000.0d));
    }

    public static double b(double d2, double d3) {
        return (Math.sin(d3 / 100000.0d) * (d2 / 18000.0d)) + (Math.cos(d2 / 100000.0d) * (d3 / 9000.0d));
    }

    private static LatLng c(double d2, double d3) {
        int i;
        double d4 = (double) (((long) (d2 * 100000.0d)) % 36000000);
        double d5 = (double) (((long) (d3 * 100000.0d)) % 36000000);
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = (double) ((int) ((-a(d4, d5)) + d4));
        double d7 = (double) ((int) ((-b(d4, d5)) + d5));
        Double.isNaN(d4);
        double d8 = (-a(d6, d7)) + d4;
        int i2 = -1;
        if (d4 > 0.0d) {
            i = 1;
        } else {
            i = -1;
        }
        double d9 = (double) i;
        Double.isNaN(d9);
        double d10 = (double) ((int) (d8 + d9));
        Double.isNaN(d5);
        double d11 = (-b(d10, d7)) + d5;
        if (d5 > 0.0d) {
            i2 = 1;
        }
        double d12 = (double) i2;
        Double.isNaN(d12);
        Double.isNaN(d10);
        double d13 = (double) ((int) (d11 + d12));
        Double.isNaN(d13);
        return new LatLng(d13 / 100000.0d, d10 / 100000.0d);
    }
}
