package com.amap.api.services.busline;

import com.amap.api.services.core.SuggestionCity;
import java.util.ArrayList;
import java.util.List;

public final class BusLineResult {

    /* renamed from: a  reason: collision with root package name */
    private int f6924a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<BusLineItem> f6925b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private BusLineQuery f6926c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f6927d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<SuggestionCity> f6928e = new ArrayList();

    public final List<BusLineItem> getBusLines() {
        return this.f6925b;
    }

    public final int getPageCount() {
        return this.f6924a;
    }

    public final BusLineQuery getQuery() {
        return this.f6926c;
    }

    public final List<SuggestionCity> getSearchSuggestionCities() {
        return this.f6928e;
    }

    public final List<String> getSearchSuggestionKeywords() {
        return this.f6927d;
    }

    private int a(int i) {
        int pageSize = this.f6926c.getPageSize();
        int i2 = ((i + pageSize) - 1) / pageSize;
        if (i2 > 30) {
            return 30;
        }
        return i2;
    }

    public static BusLineResult createPagedResult(BusLineQuery busLineQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusLineItem> arrayList) {
        BusLineResult busLineResult = new BusLineResult(busLineQuery, i, list, list2, arrayList);
        return busLineResult;
    }

    private BusLineResult(BusLineQuery busLineQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusLineItem> arrayList) {
        this.f6926c = busLineQuery;
        this.f6924a = a(i);
        this.f6928e = list;
        this.f6927d = list2;
        this.f6925b = arrayList;
    }
}
