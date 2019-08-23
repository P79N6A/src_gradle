package com.mapbox.mapboxsdk.maps;

import android.graphics.Bitmap;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.e;
import com.mapbox.mapboxsdk.annotations.f;
import com.mapbox.mapboxsdk.d;
import java.util.HashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    final Map<e, Integer> f26643a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f26644b;

    /* renamed from: c  reason: collision with root package name */
    public int f26645c;

    /* renamed from: d  reason: collision with root package name */
    private NativeMapView f26646d;

    /* access modifiers changed from: package-private */
    public void b(e eVar) {
        a(eVar, true);
    }

    private void e(e eVar) {
        this.f26646d.c(eVar.f26435a);
        this.f26643a.remove(eVar);
    }

    h(NativeMapView nativeMapView) {
        this.f26646d = nativeMapView;
        c(f.a("com.mapbox.icons.icon_marker_view", f.f26437a));
    }

    /* access modifiers changed from: package-private */
    public final int a(e eVar) {
        double d2 = this.f26646d.d(eVar.f26435a);
        double d3 = (double) this.f26646d.f26582c;
        Double.isNaN(d3);
        return (int) (d2 * d3);
    }

    /* access modifiers changed from: package-private */
    public void c(e eVar) {
        Bitmap a2 = eVar.a();
        this.f26646d.a(eVar.f26435a, a2.getWidth(), a2.getHeight(), eVar.b(), eVar.c());
    }

    public final void d(e eVar) {
        Integer num = this.f26643a.get(eVar);
        if (num != null) {
            Integer valueOf = Integer.valueOf(num.intValue() - 1);
            if (valueOf.intValue() == 0) {
                e(eVar);
                return;
            }
            a(eVar, valueOf.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    public e a(Marker marker) {
        e a2 = f.a(d.b()).a();
        Bitmap a3 = a2.a();
        a(a3.getWidth(), a3.getHeight() / 2);
        marker.a(a2);
        return a2;
    }

    private void a(e eVar, int i) {
        this.f26643a.put(eVar, Integer.valueOf(i));
    }

    private void a(e eVar, boolean z) {
        if (!this.f26643a.keySet().contains(eVar)) {
            this.f26643a.put(eVar, 1);
            c(eVar);
            return;
        }
        this.f26643a.put(eVar, Integer.valueOf(this.f26643a.get(eVar).intValue() + 1));
    }

    /* access modifiers changed from: package-private */
    public void a(int i, int i2) {
        if (i > this.f26644b) {
            this.f26644b = i;
        }
        if (i2 > this.f26645c) {
            this.f26645c = i2;
        }
    }
}
