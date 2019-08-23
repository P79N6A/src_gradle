package com.amap.api.mapcore2d;

import android.location.Location;
import com.amap.api.maps2d.LocationSource;

public class d implements LocationSource.OnLocationChangedListener {

    /* renamed from: a  reason: collision with root package name */
    Location f5916a;

    /* renamed from: b  reason: collision with root package name */
    private y f5917b;

    d(y yVar) {
        this.f5917b = yVar;
    }

    public void onLocationChanged(Location location) {
        this.f5916a = location;
        try {
            if (this.f5917b.isMyLocationEnabled()) {
                this.f5917b.showMyLocationOverlay(location);
            }
        } catch (Throwable th) {
            cm.a(th, "AMapOnLocationChangedListener", "onLocationChanged");
        }
    }
}
