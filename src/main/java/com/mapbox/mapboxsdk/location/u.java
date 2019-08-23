package com.mapbox.mapboxsdk.location;

import android.animation.TypeEvaluator;
import com.mapbox.mapboxsdk.geometry.LatLng;
import java.util.List;

public abstract class u<L> extends r<LatLng, L> {
    /* access modifiers changed from: package-private */
    public final TypeEvaluator b() {
        return new f();
    }

    u(LatLng latLng, LatLng latLng2, List<L> list) {
        super(latLng, latLng2, list);
    }
}
