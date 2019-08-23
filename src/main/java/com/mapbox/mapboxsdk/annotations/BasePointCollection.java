package com.mapbox.mapboxsdk.annotations;

import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.geometry.LatLng;
import java.util.ArrayList;
import java.util.List;

public abstract class BasePointCollection extends a {
    @Keep
    public float alpha = 1.0f;
    @Keep
    List<LatLng> points = new ArrayList();

    /* access modifiers changed from: package-private */
    public abstract void c();

    public final List<LatLng> b() {
        return new ArrayList(this.points);
    }

    protected BasePointCollection() {
    }
}
