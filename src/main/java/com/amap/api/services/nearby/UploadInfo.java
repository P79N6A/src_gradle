package com.amap.api.services.nearby;

import com.amap.api.services.core.LatLonPoint;

public class UploadInfo {

    /* renamed from: a  reason: collision with root package name */
    private int f7085a = 1;

    /* renamed from: b  reason: collision with root package name */
    private String f7086b;

    /* renamed from: c  reason: collision with root package name */
    private LatLonPoint f7087c;

    public int getCoordType() {
        return this.f7085a;
    }

    public LatLonPoint getPoint() {
        return this.f7087c;
    }

    public String getUserID() {
        return this.f7086b;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f7087c = latLonPoint;
    }

    public void setUserID(String str) {
        this.f7086b = str;
    }

    public void setCoordType(int i) {
        if (i == 0 || i == 1) {
            this.f7085a = i;
        } else {
            this.f7085a = 1;
        }
    }
}
