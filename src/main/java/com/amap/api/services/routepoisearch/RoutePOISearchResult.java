package com.amap.api.services.routepoisearch;

import java.util.ArrayList;
import java.util.List;

public class RoutePOISearchResult {

    /* renamed from: a  reason: collision with root package name */
    private List<RoutePOIItem> f7292a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private RoutePOISearchQuery f7293b;

    public RoutePOISearchQuery getQuery() {
        return this.f7293b;
    }

    public List<RoutePOIItem> getRoutePois() {
        return this.f7292a;
    }

    public RoutePOISearchResult(ArrayList<RoutePOIItem> arrayList, RoutePOISearchQuery routePOISearchQuery) {
        this.f7292a = arrayList;
        this.f7293b = routePOISearchQuery;
    }
}
