package com.ss.android.ugc.aweme.map.a.a.a;

import android.content.Context;
import android.util.TypedValue;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.amap.api.maps2d.model.Polyline;
import com.amap.api.maps2d.model.PolylineOptions;
import com.amap.api.services.core.LatLonPoint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f55028b;

    /* renamed from: c  reason: collision with root package name */
    public int f55029c = 10;

    /* renamed from: d  reason: collision with root package name */
    protected LatLng f55030d;

    /* renamed from: e  reason: collision with root package name */
    protected LatLng f55031e;

    /* renamed from: f  reason: collision with root package name */
    protected List<Polyline> f55032f = new ArrayList();
    protected AMap g;
    protected Context h;

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f55028b, false, 58396, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55028b, false, 58396, new Class[0], Void.TYPE);
            return;
        }
        try {
            for (Polyline remove : this.f55032f) {
                remove.remove();
            }
        } catch (Exception unused) {
        }
    }

    public LatLngBounds b() {
        if (PatchProxy.isSupport(new Object[0], this, f55028b, false, 58398, new Class[0], LatLngBounds.class)) {
            return (LatLngBounds) PatchProxy.accessDispatch(new Object[0], this, f55028b, false, 58398, new Class[0], LatLngBounds.class);
        }
        LatLngBounds.Builder builder = LatLngBounds.builder();
        builder.include(new LatLng(this.f55030d.latitude, this.f55030d.longitude));
        builder.include(new LatLng(this.f55031e.latitude, this.f55031e.longitude));
        return builder.build();
    }

    public final void d() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f55028b, false, 58397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55028b, false, 58397, new Class[0], Void.TYPE);
        } else if (this.f55031e != null && this.g != null) {
            try {
                LatLngBounds b2 = b();
                AMap aMap = this.g;
                if (PatchProxy.isSupport(new Object[0], this, f55028b, false, 58400, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f55028b, false, 58400, new Class[0], Integer.TYPE)).intValue();
                } else {
                    i = (int) TypedValue.applyDimension(1, 100.0f, this.h.getResources().getDisplayMetrics());
                }
                aMap.animateCamera(CameraUpdateFactory.newLatLngBounds(b2, i));
            } catch (Throwable unused) {
            }
        }
    }

    public static LatLng a(LatLonPoint latLonPoint) {
        if (!PatchProxy.isSupport(new Object[]{latLonPoint}, null, f55028b, true, 58401, new Class[]{LatLonPoint.class}, LatLng.class)) {
            return new LatLng(latLonPoint.getLatitude(), latLonPoint.getLongitude());
        }
        return (LatLng) PatchProxy.accessDispatch(new Object[]{latLonPoint}, null, f55028b, true, 58401, new Class[]{LatLonPoint.class}, LatLng.class);
    }

    public final void a(PolylineOptions polylineOptions) {
        if (PatchProxy.isSupport(new Object[]{polylineOptions}, this, f55028b, false, 58399, new Class[]{PolylineOptions.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{polylineOptions}, this, f55028b, false, 58399, new Class[]{PolylineOptions.class}, Void.TYPE);
        } else if (polylineOptions != null) {
            Polyline addPolyline = this.g.addPolyline(polylineOptions);
            if (addPolyline != null) {
                this.f55032f.add(addPolyline);
            }
        }
    }
}
