package com.mapbox.mapboxsdk.maps;

import android.graphics.RectF;
import android.support.v4.util.LongSparseArray;
import com.mapbox.mapboxsdk.annotations.a;
import java.util.ArrayList;
import java.util.List;

public final class y implements z {

    /* renamed from: a  reason: collision with root package name */
    private final NativeMapView f26749a;

    /* renamed from: b  reason: collision with root package name */
    private final LongSparseArray<a> f26750b;

    public final List<a> a(RectF rectF) {
        long[] jArr;
        RectF b2 = this.f26749a.b(rectF);
        NativeMapView nativeMapView = this.f26749a;
        if (nativeMapView.a("queryShapeAnnotations")) {
            jArr = new long[0];
        } else {
            jArr = nativeMapView.nativeQueryShapeAnnotations(b2);
        }
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            a aVar = (a) this.f26750b.get(j);
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    y(NativeMapView nativeMapView, LongSparseArray<a> longSparseArray) {
        this.f26749a = nativeMapView;
        this.f26750b = longSparseArray;
    }
}
