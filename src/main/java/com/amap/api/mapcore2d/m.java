package com.amap.api.mapcore2d;

import android.graphics.Point;
import com.amap.api.a.m;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;

public class m extends com.amap.api.a.m {

    /* renamed from: a  reason: collision with root package name */
    private float f6248a;

    /* renamed from: b  reason: collision with root package name */
    private float f6249b;

    /* renamed from: c  reason: collision with root package name */
    private ae f6250c;

    private m() {
    }

    public static m a(LatLngBounds latLngBounds, int i) {
        m a2 = a();
        a2.nowType = m.a.newLatLngBounds;
        a2.bounds = latLngBounds;
        a2.padding = i;
        return a2;
    }

    public static m a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        m a2 = a();
        a2.nowType = m.a.newLatLngBoundsWithSize;
        a2.bounds = latLngBounds;
        a2.padding = i3;
        a2.width = i;
        a2.height = i2;
        return a2;
    }

    public static m a() {
        return new m();
    }

    public static m b() {
        m a2 = a();
        a2.nowType = m.a.zoomIn;
        return a2;
    }

    public static m c() {
        m a2 = a();
        a2.nowType = m.a.zoomOut;
        return a2;
    }

    public static m b(float f2) {
        return a(f2, (Point) null);
    }

    public static m a(float f2) {
        m a2 = a();
        a2.nowType = m.a.zoomTo;
        a2.zoom = f2;
        return a2;
    }

    public static m b(LatLng latLng) {
        return a(CameraPosition.builder().target(latLng).build());
    }

    public static m a(CameraPosition cameraPosition) {
        m a2 = a();
        a2.nowType = m.a.newCameraPosition;
        a2.cameraPosition = cameraPosition;
        return a2;
    }

    public static m a(LatLng latLng) {
        m a2 = a();
        a2.nowType = m.a.changeCenter;
        a2.cameraPosition = new CameraPosition(latLng, 0.0f, 0.0f, 0.0f);
        return a2;
    }

    public static m a(float f2, float f3) {
        m a2 = a();
        a2.nowType = m.a.scrollBy;
        a2.xPixel = f2;
        a2.yPixel = f3;
        return a2;
    }

    public static m a(float f2, Point point) {
        m a2 = a();
        a2.nowType = m.a.zoomBy;
        a2.amount = f2;
        a2.focus = point;
        return a2;
    }

    public static m a(LatLng latLng, float f2) {
        return a(CameraPosition.builder().target(latLng).zoom(f2).build());
    }

    static m a(ae aeVar, float f2, float f3, float f4) {
        m a2 = a();
        a2.nowType = m.a.changeGeoCenterZoomTiltBearing;
        a2.f6250c = aeVar;
        a2.zoom = f2;
        a2.f6249b = f3;
        a2.f6248a = f4;
        return a2;
    }

    public static m a(LatLng latLng, float f2, float f3, float f4) {
        return a(CameraPosition.builder().target(latLng).zoom(f2).bearing(f3).tilt(f4).build());
    }
}
