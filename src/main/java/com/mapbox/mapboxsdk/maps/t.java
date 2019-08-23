package com.mapbox.mapboxsdk.maps;

import android.support.v4.util.LongSparseArray;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.a;

public final class t implements u {

    /* renamed from: a  reason: collision with root package name */
    private final NativeMapView f26737a;

    /* renamed from: b  reason: collision with root package name */
    private final LongSparseArray<a> f26738b;

    public final void a(Polygon polygon) {
        NativeMapView nativeMapView = this.f26737a;
        if (!nativeMapView.a("updatePolygon")) {
            nativeMapView.nativeUpdatePolygon(polygon.f26421a, polygon);
        }
        this.f26738b.setValueAt(this.f26738b.indexOfKey(polygon.f26421a), polygon);
    }

    t(NativeMapView nativeMapView, LongSparseArray<a> longSparseArray) {
        this.f26737a = nativeMapView;
        this.f26738b = longSparseArray;
    }
}
