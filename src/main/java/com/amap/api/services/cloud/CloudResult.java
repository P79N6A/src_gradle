package com.amap.api.services.cloud;

import com.amap.api.services.cloud.CloudSearch;
import java.util.ArrayList;

public final class CloudResult {

    /* renamed from: a  reason: collision with root package name */
    private int f6955a = a(this.f6957c);

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<CloudItem> f6956b;

    /* renamed from: c  reason: collision with root package name */
    private int f6957c;

    /* renamed from: d  reason: collision with root package name */
    private int f6958d;

    /* renamed from: e  reason: collision with root package name */
    private CloudSearch.Query f6959e;

    /* renamed from: f  reason: collision with root package name */
    private CloudSearch.SearchBound f6960f;

    public final CloudSearch.SearchBound getBound() {
        return this.f6960f;
    }

    public final ArrayList<CloudItem> getClouds() {
        return this.f6956b;
    }

    public final int getPageCount() {
        return this.f6955a;
    }

    public final CloudSearch.Query getQuery() {
        return this.f6959e;
    }

    public final int getTotalCount() {
        return this.f6957c;
    }

    private int a(int i) {
        return ((i + this.f6958d) - 1) / this.f6958d;
    }

    public static CloudResult createPagedResult(CloudSearch.Query query, int i, CloudSearch.SearchBound searchBound, int i2, ArrayList<CloudItem> arrayList) {
        CloudResult cloudResult = new CloudResult(query, i, searchBound, i2, arrayList);
        return cloudResult;
    }

    private CloudResult(CloudSearch.Query query, int i, CloudSearch.SearchBound searchBound, int i2, ArrayList<CloudItem> arrayList) {
        this.f6959e = query;
        this.f6957c = i;
        this.f6958d = i2;
        this.f6956b = arrayList;
        this.f6960f = searchBound;
    }
}
