package com.mapbox.mapboxsdk.maps;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.v4.util.LongSparseArray;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.a;
import com.mapbox.mapboxsdk.annotations.c;
import com.mapbox.mapboxsdk.annotations.e;
import com.mapbox.mapboxsdk.annotations.i;
import com.mapbox.mapboxsdk.annotations.j;
import com.mapbox.mapboxsdk.geometry.LatLng;
import java.util.ArrayList;
import java.util.List;

public final class q implements r {

    /* renamed from: a  reason: collision with root package name */
    private final NativeMapView f26710a;

    /* renamed from: b  reason: collision with root package name */
    private final MapView f26711b;

    /* renamed from: c  reason: collision with root package name */
    private final LongSparseArray<a> f26712c;

    /* renamed from: d  reason: collision with root package name */
    private final h f26713d;

    /* renamed from: e  reason: collision with root package name */
    private final j f26714e;

    private List<a> b() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f26712c.size(); i++) {
            arrayList.add(this.f26712c.get(this.f26712c.keyAt(i)));
        }
        return arrayList;
    }

    public final void a() {
        h hVar = this.f26713d;
        for (e c2 : hVar.f26643a.keySet()) {
            hVar.c(c2);
        }
        int size = this.f26712c.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.f26712c.get((long) i);
            if (aVar instanceof Marker) {
                Marker marker = (Marker) aVar;
                this.f26710a.a(aVar.f26421a);
                marker.f26421a = this.f26710a.a(marker);
            }
        }
    }

    public final List<i> b(@NonNull RectF rectF) {
        float f2 = this.f26710a.f26582c;
        long[] a2 = this.f26710a.a(new RectF(rectF.left / f2, rectF.top / f2, rectF.right / f2, rectF.bottom / f2));
        ArrayList arrayList = new ArrayList(a2.length);
        for (long valueOf : a2) {
            arrayList.add(Long.valueOf(valueOf));
        }
        ArrayList arrayList2 = new ArrayList(a2.length);
        List<a> b2 = b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            a aVar = b2.get(i);
            if ((aVar instanceof i) && arrayList.contains(Long.valueOf(aVar.f26421a))) {
                arrayList2.add((i) aVar);
            }
        }
        return new ArrayList(arrayList2);
    }

    @NonNull
    public final List<Marker> a(@NonNull RectF rectF) {
        long[] a2 = this.f26710a.a(this.f26710a.b(rectF));
        ArrayList arrayList = new ArrayList(a2.length);
        for (long valueOf : a2) {
            arrayList.add(Long.valueOf(valueOf));
        }
        ArrayList arrayList2 = new ArrayList(a2.length);
        List<a> b2 = b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            a aVar = b2.get(i);
            if ((aVar instanceof Marker) && arrayList.contains(Long.valueOf(aVar.f26421a))) {
                arrayList2.add((Marker) aVar);
            }
        }
        return new ArrayList(arrayList2);
    }

    public final Marker a(@NonNull c cVar, @NonNull o oVar) {
        long j;
        Marker b2 = cVar.b();
        h hVar = this.f26713d;
        e c2 = b2.c();
        if (c2 == null) {
            c2 = hVar.a(b2);
        } else {
            Bitmap a2 = c2.a();
            hVar.a(a2.getWidth(), a2.getHeight());
        }
        hVar.b(c2);
        b2.h = this.f26713d.a(c2);
        if (this.f26710a != null) {
            j = this.f26710a.a(b2);
        } else {
            j = 0;
        }
        b2.a(oVar);
        b2.f26421a = j;
        this.f26712c.put(j, b2);
        return b2;
    }

    public final void a(@NonNull Marker marker, @NonNull o oVar) {
        Marker marker2;
        if (!(marker instanceof i)) {
            h hVar = this.f26713d;
            e c2 = marker.c();
            if (c2 == null) {
                c2 = hVar.a(marker);
            }
            hVar.b(c2);
            if (marker.f26421a != -1) {
                marker2 = (Marker) oVar.f26699e.a(marker.f26421a);
            } else {
                marker2 = null;
            }
            if (marker2 == null || marker2.c() == null || marker2.c() != marker.c()) {
                marker.h = hVar.a(c2);
            }
        }
        NativeMapView nativeMapView = this.f26710a;
        if (!nativeMapView.a("updateMarker")) {
            LatLng latLng = marker.position;
            e c3 = marker.c();
            nativeMapView.nativeUpdateMarker(marker.f26421a, latLng.a(), latLng.b(), c3.f26435a);
        }
        this.f26712c.setValueAt(this.f26712c.indexOfKey(marker.f26421a), marker);
    }

    q(NativeMapView nativeMapView, MapView mapView, LongSparseArray<a> longSparseArray, h hVar, j jVar) {
        this.f26710a = nativeMapView;
        this.f26711b = mapView;
        this.f26712c = longSparseArray;
        this.f26713d = hVar;
        this.f26714e = jVar;
    }
}
