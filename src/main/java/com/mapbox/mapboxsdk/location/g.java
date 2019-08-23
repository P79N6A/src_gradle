package com.mapbox.mapboxsdk.location;

import android.animation.ValueAnimator;
import com.mapbox.mapboxsdk.location.r;
import java.util.List;

public final class g extends t<r.b> {
    /* access modifiers changed from: package-private */
    public final int a() {
        return 6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (r.b d2 : this.f26542b) {
            d2.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    g(Float f2, Float f3, List<r.b> list) {
        super(f2, f3, list);
    }
}
