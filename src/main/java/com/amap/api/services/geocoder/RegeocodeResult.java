package com.amap.api.services.geocoder;

public class RegeocodeResult {

    /* renamed from: a  reason: collision with root package name */
    private RegeocodeQuery f7045a;

    /* renamed from: b  reason: collision with root package name */
    private RegeocodeAddress f7046b;

    public RegeocodeAddress getRegeocodeAddress() {
        return this.f7046b;
    }

    public RegeocodeQuery getRegeocodeQuery() {
        return this.f7045a;
    }

    public void setRegeocodeAddress(RegeocodeAddress regeocodeAddress) {
        this.f7046b = regeocodeAddress;
    }

    public void setRegeocodeQuery(RegeocodeQuery regeocodeQuery) {
        this.f7045a = regeocodeQuery;
    }

    public RegeocodeResult(RegeocodeQuery regeocodeQuery, RegeocodeAddress regeocodeAddress) {
        this.f7045a = regeocodeQuery;
        this.f7046b = regeocodeAddress;
    }
}
