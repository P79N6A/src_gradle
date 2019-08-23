package com.mapbox.mapboxsdk.location;

import android.animation.ValueAnimator;
import com.mapbox.mapboxsdk.location.r;
import java.util.List;

public final class j extends t<r.b> {
    /* access modifiers changed from: package-private */
    public final int a() {
        return 2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (r.b b2 : this.f26542b) {
            b2.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    j(Float f2, Float f3, List<r.b> list) {
        super(f2, f3, list);
    }
}
