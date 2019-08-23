package com.mapbox.mapboxsdk.location;

import android.animation.ValueAnimator;
import com.mapbox.mapboxsdk.location.r;
import java.util.List;

public final class b extends t<r.a> {
    /* access modifiers changed from: package-private */
    public final int a() {
        return 4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (r.a a2 : this.f26542b) {
            a2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    b(Float f2, Float f3, List<r.a> list) {
        super(f2, f3, list);
    }
}
