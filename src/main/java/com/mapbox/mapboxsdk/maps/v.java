package com.mapbox.mapboxsdk.maps;

import android.support.annotation.NonNull;
import android.support.v4.util.LongSparseArray;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.a;
import com.mapbox.mapboxsdk.annotations.k;

public final class v implements w {

    /* renamed from: a  reason: collision with root package name */
    private final NativeMapView f26739a;

    /* renamed from: b  reason: collision with root package name */
    private final LongSparseArray<a> f26740b;

    public final void a(Polyline polyline) {
        NativeMapView nativeMapView = this.f26739a;
        if (!nativeMapView.a("updatePolyline")) {
            nativeMapView.nativeUpdatePolyline(polyline.f26421a, polyline);
        }
        this.f26740b.setValueAt(this.f26740b.indexOfKey(polyline.f26421a), polyline);
    }

    v(NativeMapView nativeMapView, LongSparseArray<a> longSparseArray) {
        this.f26739a = nativeMapView;
        this.f26740b = longSparseArray;
    }

    public final Polyline a(@NonNull k kVar, @NonNull o oVar) {
        Polyline polyline = kVar.f26461a;
        if (!polyline.b().isEmpty()) {
            long j = 0;
            if (this.f26739a != null) {
                NativeMapView nativeMapView = this.f26739a;
                if (!nativeMapView.a("addPolyline")) {
                    j = nativeMapView.nativeAddPolylines(new Polyline[]{polyline})[0];
                }
            }
            polyline.a(oVar);
            polyline.f26421a = j;
            this.f26740b.put(j, polyline);
        }
        return polyline;
    }
}
