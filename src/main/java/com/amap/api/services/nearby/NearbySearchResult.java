package com.amap.api.services.nearby;

import java.util.ArrayList;
import java.util.List;

public class NearbySearchResult {

    /* renamed from: a  reason: collision with root package name */
    private List<NearbyInfo> f7083a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f7084b = 0;

    public List<NearbyInfo> getNearbyInfoList() {
        return this.f7083a;
    }

    public int getTotalNum() {
        return this.f7084b;
    }

    public void setNearbyInfoList(List<NearbyInfo> list) {
        this.f7083a = list;
        this.f7084b = list.size();
    }
}
