package com.amap.api.services.core;

public class SuggestionCity {

    /* renamed from: a  reason: collision with root package name */
    private String f6995a;

    /* renamed from: b  reason: collision with root package name */
    private String f6996b;

    /* renamed from: c  reason: collision with root package name */
    private String f6997c;

    /* renamed from: d  reason: collision with root package name */
    private int f6998d;

    protected SuggestionCity() {
    }

    public String getAdCode() {
        return this.f6997c;
    }

    public String getCityCode() {
        return this.f6996b;
    }

    public String getCityName() {
        return this.f6995a;
    }

    public int getSuggestionNum() {
        return this.f6998d;
    }

    public void setAdCode(String str) {
        this.f6997c = str;
    }

    public void setCityCode(String str) {
        this.f6996b = str;
    }

    public void setCityName(String str) {
        this.f6995a = str;
    }

    public void setSuggestionNum(int i) {
        this.f6998d = i;
    }

    public SuggestionCity(String str, String str2, String str3, int i) {
        this.f6995a = str;
        this.f6996b = str2;
        this.f6997c = str3;
        this.f6998d = i;
    }
}
