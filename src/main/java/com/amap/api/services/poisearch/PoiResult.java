package com.amap.api.services.poisearch;

import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.SuggestionCity;
import com.amap.api.services.poisearch.PoiSearch;
import java.util.ArrayList;
import java.util.List;

public final class PoiResult {

    /* renamed from: a  reason: collision with root package name */
    private int f7095a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<PoiItem> f7096b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private PoiSearch.Query f7097c;

    /* renamed from: d  reason: collision with root package name */
    private PoiSearch.SearchBound f7098d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f7099e;

    /* renamed from: f  reason: collision with root package name */
    private List<SuggestionCity> f7100f;
    private int g;

    public final PoiSearch.SearchBound getBound() {
        return this.f7098d;
    }

    public final int getPageCount() {
        return this.f7095a;
    }

    public final ArrayList<PoiItem> getPois() {
        return this.f7096b;
    }

    public final PoiSearch.Query getQuery() {
        return this.f7097c;
    }

    public final List<SuggestionCity> getSearchSuggestionCitys() {
        return this.f7100f;
    }

    public final List<String> getSearchSuggestionKeywords() {
        return this.f7099e;
    }

    private int a(int i) {
        return ((i + this.g) - 1) / this.g;
    }

    public static PoiResult createPagedResult(PoiSearch.Query query, PoiSearch.SearchBound searchBound, List<String> list, List<SuggestionCity> list2, int i, int i2, ArrayList<PoiItem> arrayList) {
        PoiResult poiResult = new PoiResult(query, searchBound, list, list2, i, i2, arrayList);
        return poiResult;
    }

    private PoiResult(PoiSearch.Query query, PoiSearch.SearchBound searchBound, List<String> list, List<SuggestionCity> list2, int i, int i2, ArrayList<PoiItem> arrayList) {
        this.f7097c = query;
        this.f7098d = searchBound;
        this.f7099e = list;
        this.f7100f = list2;
        this.g = i;
        this.f7095a = a(i2);
        this.f7096b = arrayList;
    }
}
