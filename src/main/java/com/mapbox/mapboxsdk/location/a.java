package com.mapbox.mapboxsdk.location;

import android.animation.ValueAnimator;
import com.mapbox.mapboxsdk.location.r;
import java.util.List;

public final class a extends t<r.a> {
    /* access modifiers changed from: package-private */
    public final int a() {
        return 5;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (r.a b2 : this.f26542b) {
            b2.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    a(Float f2, Float f3, List<r.a> list) {
        super(f2, f3, list);
    }
}
