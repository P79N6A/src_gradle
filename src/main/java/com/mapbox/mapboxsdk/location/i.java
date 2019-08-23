package com.mapbox.mapboxsdk.location;

import android.animation.ValueAnimator;
import com.mapbox.mapboxsdk.location.r;
import java.util.List;

public final class i extends t<r.b> {
    /* access modifiers changed from: package-private */
    public final int a() {
        return 3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (r.b c2 : this.f26542b) {
            c2.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    i(Float f2, Float f3, List<r.b> list) {
        super(f2, f3, list);
    }
}
