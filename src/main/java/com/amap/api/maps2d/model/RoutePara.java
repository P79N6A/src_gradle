package com.amap.api.maps2d.model;

public class RoutePara {

    /* renamed from: a  reason: collision with root package name */
    private int f6392a;

    /* renamed from: b  reason: collision with root package name */
    private int f6393b;

    /* renamed from: c  reason: collision with root package name */
    private LatLng f6394c;

    /* renamed from: d  reason: collision with root package name */
    private LatLng f6395d;

    /* renamed from: e  reason: collision with root package name */
    private String f6396e;

    /* renamed from: f  reason: collision with root package name */
    private String f6397f;

    public int getDrivingRouteStyle() {
        return this.f6392a;
    }

    public String getEndName() {
        return this.f6397f;
    }

    public LatLng getEndPoint() {
        return this.f6395d;
    }

    public String getStartName() {
        return this.f6396e;
    }

    public LatLng getStartPoint() {
        return this.f6394c;
    }

    public int getTransitRouteStyle() {
        return this.f6393b;
    }

    public void setEndName(String str) {
        this.f6397f = str;
    }

    public void setEndPoint(LatLng latLng) {
        this.f6395d = latLng;
    }

    public void setStartName(String str) {
        this.f6396e = str;
    }

    public void setStartPoint(LatLng latLng) {
        this.f6394c = latLng;
    }

    public void setTransitRouteStyle(int i) {
        if (i >= 0 && i < 6) {
            this.f6393b = i;
        }
    }

    public void setDrivingRouteStyle(int i) {
        if (i >= 0 && i < 9) {
            this.f6392a = i;
        }
    }
}
