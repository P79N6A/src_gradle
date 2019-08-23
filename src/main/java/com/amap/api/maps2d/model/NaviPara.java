package com.amap.api.maps2d.model;

public class NaviPara {

    /* renamed from: a  reason: collision with root package name */
    private int f6374a;

    /* renamed from: b  reason: collision with root package name */
    private LatLng f6375b;

    public int getNaviStyle() {
        return this.f6374a;
    }

    public LatLng getTargetPoint() {
        return this.f6375b;
    }

    public void setTargetPoint(LatLng latLng) {
        this.f6375b = latLng;
    }

    public void setNaviStyle(int i) {
        if (i >= 0 && i < 9) {
            this.f6374a = i;
        }
    }
}
