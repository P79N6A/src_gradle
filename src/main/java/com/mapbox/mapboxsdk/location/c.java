package com.mapbox.mapboxsdk.location;

import android.animation.ValueAnimator;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.location.r;
import java.util.List;

public final class c extends u<r.a> {
    /* access modifiers changed from: package-private */
    public final int a() {
        return 1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (r.a a2 : this.f26542b) {
            a2.a((LatLng) valueAnimator.getAnimatedValue());
        }
    }

    c(LatLng latLng, LatLng latLng2, List<r.a> list) {
        super(latLng, latLng2, list);
    }
}