package com.amap.api.maps2d.model;

public class MyTrafficStyle {

    /* renamed from: a  reason: collision with root package name */
    private int f6370a = -16735735;

    /* renamed from: b  reason: collision with root package name */
    private int f6371b = -35576;

    /* renamed from: c  reason: collision with root package name */
    private int f6372c = -1441006;

    /* renamed from: d  reason: collision with root package name */
    private int f6373d = -7208950;

    public int getCongestedColor() {
        return this.f6372c;
    }

    public int getSeriousCongestedColor() {
        return this.f6373d;
    }

    public int getSlowColor() {
        return this.f6371b;
    }

    public int getSmoothColor() {
        return this.f6370a;
    }

    public void setCongestedColor(int i) {
        this.f6372c = i;
    }

    public void setSeriousCongestedColor(int i) {
        this.f6373d = i;
    }

    public void setSlowColor(int i) {
        this.f6371b = i;
    }

    public void setSmoothColor(int i) {
        this.f6370a = i;
    }
}
