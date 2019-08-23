package com.mapbox.mapboxsdk.maps;

import android.support.annotation.NonNull;
import android.support.v4.util.LongSparseArray;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final NativeMapView f26590a;

    /* renamed from: b  reason: collision with root package name */
    private final LongSparseArray<com.mapbox.mapboxsdk.annotations.a> f26591b;

    public final void a() {
        int size = this.f26591b.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = this.f26591b.keyAt(i);
        }
        if (this.f26590a != null) {
            this.f26590a.a(jArr);
        }
        this.f26591b.clear();
    }

    public final com.mapbox.mapboxsdk.annotations.a a(long j) {
        return (com.mapbox.mapboxsdk.annotations.a) this.f26591b.get(j);
    }

    public final void a(@NonNull com.mapbox.mapboxsdk.annotations.a aVar) {
        long j = aVar.f26421a;
        if (this.f26590a != null) {
            this.f26590a.a(j);
        }
        this.f26591b.remove(j);
    }

    a(NativeMapView nativeMapView, LongSparseArray<com.mapbox.mapboxsdk.annotations.a> longSparseArray) {
        this.f26590a = nativeMapView;
        this.f26591b = longSparseArray;
    }
}
