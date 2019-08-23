package com.amap.api.services.geocoder;

import com.amap.api.services.core.LatLonPoint;

public class RegeocodeQuery {

    /* renamed from: a  reason: collision with root package name */
    private LatLonPoint f7041a;

    /* renamed from: b  reason: collision with root package name */
    private float f7042b = 1000.0f;

    /* renamed from: c  reason: collision with root package name */
    private String f7043c = "autonavi";

    /* renamed from: d  reason: collision with root package name */
    private String f7044d = "";

    public String getLatLonType() {
        return this.f7043c;
    }

    public String getPoiType() {
        return this.f7044d;
    }

    public LatLonPoint getPoint() {
        return this.f7041a;
    }

    public float getRadius() {
        return this.f7042b;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.f7043c == null) {
            i = 0;
        } else {
            i = this.f7043c.hashCode();
        }
        int i3 = (i + 31) * 31;
        if (this.f7041a != null) {
            i2 = this.f7041a.hashCode();
        }
        return ((i3 + i2) * 31) + Float.floatToIntBits(this.f7042b);
    }

    public void setPoiType(String str) {
        this.f7044d = str;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f7041a = latLonPoint;
    }

    public void setRadius(float f2) {
        this.f7042b = f2;
    }

    public void setLatLonType(String str) {
        if (str == null) {
            return;
        }
        if (str.equals("autonavi") || str.equals("gps")) {
            this.f7043c = str;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegeocodeQuery regeocodeQuery = (RegeocodeQuery) obj;
        if (this.f7043c == null) {
            if (regeocodeQuery.f7043c != null) {
                return false;
            }
        } else if (!this.f7043c.equals(regeocodeQuery.f7043c)) {
            return false;
        }
        if (this.f7041a == null) {
            if (regeocodeQuery.f7041a != null) {
                return false;
            }
        } else if (!this.f7041a.equals(regeocodeQuery.f7041a)) {
            return false;
        }
        if (Float.floatToIntBits(this.f7042b) != Float.floatToIntBits(regeocodeQuery.f7042b)) {
            return false;
        }
        return true;
    }

    public RegeocodeQuery(LatLonPoint latLonPoint, float f2, String str) {
        this.f7041a = latLonPoint;
        this.f7042b = f2;
        setLatLonType(str);
    }
}
