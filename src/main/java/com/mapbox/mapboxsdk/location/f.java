package com.mapbox.mapboxsdk.location;

import android.animation.TypeEvaluator;
import com.mapbox.mapboxsdk.geometry.LatLng;

public final class f implements TypeEvaluator<LatLng> {

    /* renamed from: a  reason: collision with root package name */
    private final LatLng f26500a = new LatLng();

    f() {
    }

    public final /* synthetic */ Object evaluate(float f2, Object obj, Object obj2) {
        LatLng latLng = (LatLng) obj;
        LatLng latLng2 = (LatLng) obj2;
        LatLng latLng3 = this.f26500a;
        double a2 = latLng.a();
        double a3 = latLng2.a() - latLng.a();
        double d2 = (double) f2;
        Double.isNaN(d2);
        latLng3.a(a2 + (a3 * d2));
        LatLng latLng4 = this.f26500a;
        double b2 = latLng.b();
        Double.isNaN(d2);
        latLng4.b(b2 + ((latLng2.b() - latLng.b()) * d2));
        return this.f26500a;
    }
}
