package com.amap.api.mapcore2d;

import com.amap.api.maps2d.model.LatLng;
import java.math.BigDecimal;

public class cg {
    private static LatLng b(LatLng latLng) {
        return a(latLng, 2);
    }

    private static double a(double d2) {
        return Math.sin(d2 * 3000.0d * 0.017453292519943295d) * 2.0E-5d;
    }

    private static double b(double d2) {
        return Math.cos(d2 * 3000.0d * 0.017453292519943295d) * 3.0E-6d;
    }

    public static LatLng a(LatLng latLng) {
        if (latLng != null) {
            return b(latLng);
        }
        return null;
    }

    private static double a(double d2, int i) {
        return new BigDecimal(d2).setScale(i, 4).doubleValue();
    }

    private static ch a(double d2, double d3) {
        ch chVar = new ch();
        double d4 = (d2 * d2) + (d3 * d3);
        chVar.f5836a = a((Math.cos(b(d2) + Math.atan2(d3, d2)) * (a(d3) + Math.sqrt(d4))) + 0.0065d, 8);
        chVar.f5837b = a((Math.sin(b(d2) + Math.atan2(d3, d2)) * (a(d3) + Math.sqrt(d4))) + 0.006d, 8);
        return chVar;
    }

    private static LatLng a(LatLng latLng, int i) {
        LatLng latLng2 = null;
        double d2 = 0.006401062d;
        double d3 = 0.0060424805d;
        for (int i2 = 0; i2 < i; i2++) {
            latLng2 = a(latLng.longitude, latLng.latitude, d2, d3);
            d2 = latLng.longitude - latLng2.longitude;
            d3 = latLng.latitude - latLng2.latitude;
        }
        return latLng2;
    }

    private static LatLng a(double d2, double d3, double d4, double d5) {
        ch chVar = new ch();
        double d6 = d2 - d4;
        double d7 = d3 - d5;
        ch a2 = a(d6, d7);
        chVar.f5836a = a((d2 + d6) - a2.f5836a, 8);
        chVar.f5837b = a((d3 + d7) - a2.f5837b, 8);
        return new LatLng(chVar.f5837b, chVar.f5836a);
    }
}
