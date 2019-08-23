package com.ss.android.ugc.aweme.map.a.a.a;

import android.content.Context;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.amap.api.maps2d.model.PolylineOptions;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.WalkPath;
import com.amap.api.services.route.WalkStep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55033a;
    private WalkPath i;
    private PolylineOptions j;
    private List<LatLng> k;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f55033a, false, 58403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55033a, false, 58403, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f55033a, false, 58404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55033a, false, 58404, new Class[0], Void.TYPE);
        } else {
            this.j = null;
            this.j = new PolylineOptions();
            this.j.color(-2145996545).width((float) this.f55029c);
        }
        try {
            if (this.g != null && this.i != null) {
                this.k = new ArrayList();
                for (WalkStep polyline : this.i.getSteps()) {
                    for (LatLonPoint next : polyline.getPolyline()) {
                        this.j.add(a(next));
                        this.k.add(a(next));
                    }
                }
                if (PatchProxy.isSupport(new Object[0], this, f55033a, false, 58405, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f55033a, false, 58405, new Class[0], Void.TYPE);
                    return;
                }
                a(this.j);
            }
        } catch (Throwable unused) {
        }
    }

    public final LatLngBounds b() {
        if (PatchProxy.isSupport(new Object[0], this, f55033a, false, 58406, new Class[0], LatLngBounds.class)) {
            return (LatLngBounds) PatchProxy.accessDispatch(new Object[0], this, f55033a, false, 58406, new Class[0], LatLngBounds.class);
        }
        LatLngBounds.Builder builder = LatLngBounds.builder();
        builder.include(new LatLng(this.f55030d.latitude, this.f55030d.longitude));
        builder.include(new LatLng(this.f55031e.latitude, this.f55031e.longitude));
        if (this.k != null && this.k.size() > 0) {
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                builder.include(new LatLng(this.k.get(i2).latitude, this.k.get(i2).longitude));
            }
        }
        return builder.build();
    }

    public c(Context context, AMap aMap, WalkPath walkPath, LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
        this.g = aMap;
        this.i = walkPath;
        this.f55030d = a(latLonPoint);
        this.f55031e = a(latLonPoint2);
        this.h = context;
    }
}
