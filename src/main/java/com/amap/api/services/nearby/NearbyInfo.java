package com.amap.api.services.nearby;

import com.amap.api.services.core.LatLonPoint;

public class NearbyInfo {

    /* renamed from: a  reason: collision with root package name */
    private String f7069a;

    /* renamed from: b  reason: collision with root package name */
    private LatLonPoint f7070b;

    /* renamed from: c  reason: collision with root package name */
    private long f7071c;

    /* renamed from: d  reason: collision with root package name */
    private int f7072d;

    /* renamed from: e  reason: collision with root package name */
    private int f7073e;

    public int getDistance() {
        return this.f7072d;
    }

    public int getDrivingDistance() {
        return this.f7073e;
    }

    public LatLonPoint getPoint() {
        return this.f7070b;
    }

    public long getTimeStamp() {
        return this.f7071c;
    }

    public String getUserID() {
        return this.f7069a;
    }

    public void setDistance(int i) {
        this.f7072d = i;
    }

    public void setDrivingDistance(int i) {
        this.f7073e = i;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f7070b = latLonPoint;
    }

    public void setTimeStamp(long j) {
        this.f7071c = j;
    }

    public void setUserID(String str) {
        this.f7069a = str;
    }
}
