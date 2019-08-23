package com.amap.api.services.geocoder;

import java.util.ArrayList;
import java.util.List;

public class GeocodeResult {

    /* renamed from: a  reason: collision with root package name */
    private GeocodeQuery f7032a;

    /* renamed from: b  reason: collision with root package name */
    private List<GeocodeAddress> f7033b = new ArrayList();

    public List<GeocodeAddress> getGeocodeAddressList() {
        return this.f7033b;
    }

    public GeocodeQuery getGeocodeQuery() {
        return this.f7032a;
    }

    public void setGeocodeAddressList(List<GeocodeAddress> list) {
        this.f7033b = list;
    }

    public void setGeocodeQuery(GeocodeQuery geocodeQuery) {
        this.f7032a = geocodeQuery;
    }

    public GeocodeResult(GeocodeQuery geocodeQuery, List<GeocodeAddress> list) {
        this.f7032a = geocodeQuery;
        this.f7033b = list;
    }
}
