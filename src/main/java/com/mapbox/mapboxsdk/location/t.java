package com.mapbox.mapboxsdk.location;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import java.util.List;

public abstract class t<L> extends r<Float, L> {
    /* access modifiers changed from: package-private */
    public final TypeEvaluator b() {
        return new FloatEvaluator();
    }

    t(Float f2, Float f3, List<L> list) {
        super(f2, f3, list);
    }
}
