package com.mapbox.mapboxsdk.snapshotter;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.geometry.LatLng;

public class MapSnapshot {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f26769a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f26770b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26771c;
    @Keep
    private long nativePtr;

    @Keep
    private native void initialize();

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    @Keep
    public native LatLng latLngForPixel(PointF pointF);

    @Keep
    public native PointF pixelForLatLng(LatLng latLng);

    @Keep
    private MapSnapshot(long j, Bitmap bitmap, String[] strArr, boolean z) {
        this.nativePtr = j;
        this.f26769a = bitmap;
        this.f26770b = strArr;
        this.f26771c = z;
    }
}
