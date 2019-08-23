package com.amap.api.services.busline;

import com.amap.api.services.core.SuggestionCity;
import java.util.ArrayList;
import java.util.List;

public final class BusStationResult {

    /* renamed from: a  reason: collision with root package name */
    private int f6940a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<BusStationItem> f6941b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private BusStationQuery f6942c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f6943d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<SuggestionCity> f6944e = new ArrayList();

    public final List<BusStationItem> getBusStations() {
        return this.f6941b;
    }

    public final int getPageCount() {
        return this.f6940a;
    }

    public final BusStationQuery getQuery() {
        return this.f6942c;
    }

    public final List<SuggestionCity> getSearchSuggestionCities() {
        return this.f6944e;
    }

    public final List<String> getSearchSuggestionKeywords() {
        return this.f6943d;
    }

    private int a(int i) {
        int pageSize = this.f6942c.getPageSize();
        int i2 = ((i + pageSize) - 1) / pageSize;
        if (i2 > 30) {
            return 30;
        }
        return i2;
    }

    public static BusStationResult createPagedResult(BusStationQuery busStationQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusStationItem> arrayList) {
        BusStationResult busStationResult = new BusStationResult(busStationQuery, i, list, list2, arrayList);
        return busStationResult;
    }

    private BusStationResult(BusStationQuery busStationQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusStationItem> arrayList) {
        this.f6942c = busStationQuery;
        this.f6940a = a(i);
        this.f6944e = list;
        this.f6943d = list2;
        this.f6941b = arrayList;
    }
}
