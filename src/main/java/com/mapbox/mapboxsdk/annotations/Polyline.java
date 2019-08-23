package com.mapbox.mapboxsdk.annotations;

import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.maps.o;

public final class Polyline extends BasePointCollection {
    @Keep
    public int color = -16777216;
    @Keep
    public float width = 10.0f;

    /* access modifiers changed from: package-private */
    public final void c() {
        o oVar = this.f26422b;
        if (oVar != null) {
            oVar.a(this);
        }
    }

    Polyline() {
    }

    public final void a(float f2) {
        this.width = f2;
        c();
    }

    public final void a(int i) {
        this.color = i;
        c();
    }
}
