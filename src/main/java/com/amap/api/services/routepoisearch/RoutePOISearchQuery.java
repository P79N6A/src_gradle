package com.amap.api.services.routepoisearch;

import com.amap.api.services.a.j;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.routepoisearch.RoutePOISearch;
import java.util.List;

public class RoutePOISearchQuery implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private LatLonPoint f7286a;

    /* renamed from: b  reason: collision with root package name */
    private LatLonPoint f7287b;

    /* renamed from: c  reason: collision with root package name */
    private int f7288c;

    /* renamed from: d  reason: collision with root package name */
    private RoutePOISearch.RoutePOISearchType f7289d;

    /* renamed from: e  reason: collision with root package name */
    private int f7290e = 250;

    /* renamed from: f  reason: collision with root package name */
    private List<LatLonPoint> f7291f;

    public LatLonPoint getFrom() {
        return this.f7286a;
    }

    public int getMode() {
        return this.f7288c;
    }

    public List<LatLonPoint> getPolylines() {
        return this.f7291f;
    }

    public int getRange() {
        return this.f7290e;
    }

    public RoutePOISearch.RoutePOISearchType getSearchType() {
        return this.f7289d;
    }

    public LatLonPoint getTo() {
        return this.f7287b;
    }

    public RoutePOISearchQuery clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            j.a(e2, "RoutePOISearchQuery", "RoutePOISearchQueryclone");
        }
        if (this.f7291f != null && this.f7291f.size() > 0) {
            return new RoutePOISearchQuery(this.f7291f, this.f7289d, this.f7290e);
        }
        RoutePOISearchQuery routePOISearchQuery = new RoutePOISearchQuery(this.f7286a, this.f7287b, this.f7288c, this.f7289d, this.f7290e);
        return routePOISearchQuery;
    }

    public RoutePOISearchQuery(List<LatLonPoint> list, RoutePOISearch.RoutePOISearchType routePOISearchType, int i) {
        this.f7291f = list;
        this.f7289d = routePOISearchType;
        this.f7290e = i;
    }

    public RoutePOISearchQuery(LatLonPoint latLonPoint, LatLonPoint latLonPoint2, int i, RoutePOISearch.RoutePOISearchType routePOISearchType, int i2) {
        this.f7286a = latLonPoint;
        this.f7287b = latLonPoint2;
        this.f7288c = i;
        this.f7289d = routePOISearchType;
        this.f7290e = i2;
    }
}
