package com.mapbox.mapboxsdk.annotations;

import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.b;
import com.mapbox.mapboxsdk.maps.o;
import java.util.ArrayList;
import java.util.List;

public final class Polygon extends BasePointCollection {
    @Keep
    public int fillColor = -16777216;
    @Keep
    private List<List<LatLng>> holes = new ArrayList();
    @Keep
    public int strokeColor = -16777216;

    Polygon() {
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        o oVar = this.f26422b;
        if (oVar != null) {
            b bVar = oVar.f26699e;
            if (!bVar.b((a) this)) {
                b.c(this);
                return;
            }
            bVar.l.a(this);
        }
    }
}
