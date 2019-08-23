package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.geometry.LatLng;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final NativeMapView f26747a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f26748b = {0, 0, 0, 0};

    public static double b(double d2) {
        return ((d2 % 360.0d) * 3.141592653589793d) / 180.0d;
    }

    /* access modifiers changed from: package-private */
    public final float b() {
        return (float) this.f26747a.l();
    }

    /* access modifiers changed from: package-private */
    public final float a() {
        return (float) this.f26747a.m();
    }

    public final double a(@FloatRange(from = -90.0d, to = 90.0d) double d2) {
        return this.f26747a.c(d2);
    }

    x(@NonNull NativeMapView nativeMapView) {
        this.f26747a = nativeMapView;
    }

    @NonNull
    public final PointF a(@NonNull LatLng latLng) {
        return this.f26747a.a(latLng);
    }

    @NonNull
    public final LatLng a(@NonNull PointF pointF) {
        return this.f26747a.a(pointF);
    }

    public static double a(double d2, double d3) {
        double abs = Math.abs(d2 - d3);
        if (d2 > d3) {
            return abs;
        }
        return 360.0d - abs;
    }
}
