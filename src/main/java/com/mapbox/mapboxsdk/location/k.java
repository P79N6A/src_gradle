package com.mapbox.mapboxsdk.location;

import android.animation.ValueAnimator;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.location.r;
import java.util.List;

public final class k extends u<r.b> {
    /* access modifiers changed from: package-private */
    public final int a() {
        return 0;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (r.b b2 : this.f26542b) {
            b2.b((LatLng) valueAnimator.getAnimatedValue());
        }
    }

    k(LatLng latLng, LatLng latLng2, List<r.b> list) {
        super(latLng, latLng2, list);
    }
}
