package com.mapbox.mapboxsdk.location;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.o;
import com.mapbox.mapboxsdk.maps.x;

public final class z {
    public static float a(float f2, float f3) {
        double d2 = (double) (f3 - f2);
        return d2 > 180.0d ? f2 + 360.0f : d2 < -180.0d ? f2 - 360.0f : f2;
    }

    static int a(float f2) {
        int i = (int) (f2 + 0.5f);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }

    static float a(@NonNull o oVar, @Nullable Location location) {
        if (location == null) {
            return 0.0f;
        }
        double a2 = oVar.f26697c.a(location.getLatitude());
        double accuracy = (double) location.getAccuracy();
        Double.isNaN(accuracy);
        return (float) (accuracy * (1.0d / a2));
    }

    static boolean a(@NonNull x xVar, @NonNull LatLng latLng, @NonNull LatLng latLng2) {
        if (latLng.a(latLng2) / xVar.a((latLng.a() + latLng2.a()) / 2.0d) > 50000.0d) {
            return true;
        }
        return false;
    }
}
