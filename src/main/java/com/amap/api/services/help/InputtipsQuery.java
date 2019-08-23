package com.amap.api.services.help;

import com.amap.api.services.core.LatLonPoint;

public class InputtipsQuery implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private String f7058a;

    /* renamed from: b  reason: collision with root package name */
    private String f7059b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7060c;

    /* renamed from: d  reason: collision with root package name */
    private String f7061d;

    /* renamed from: e  reason: collision with root package name */
    private LatLonPoint f7062e;

    public String getCity() {
        return this.f7059b;
    }

    public boolean getCityLimit() {
        return this.f7060c;
    }

    public String getKeyword() {
        return this.f7058a;
    }

    public LatLonPoint getLocation() {
        return this.f7062e;
    }

    public String getType() {
        return this.f7061d;
    }

    public void setCityLimit(boolean z) {
        this.f7060c = z;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.f7062e = latLonPoint;
    }

    public void setType(String str) {
        this.f7061d = str;
    }

    public InputtipsQuery(String str, String str2) {
        this.f7058a = str;
        this.f7059b = str2;
    }
}
