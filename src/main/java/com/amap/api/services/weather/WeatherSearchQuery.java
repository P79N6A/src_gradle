package com.amap.api.services.weather;

import com.amap.api.services.a.j;

public class WeatherSearchQuery implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private String f7350a;

    /* renamed from: b  reason: collision with root package name */
    private int f7351b = 1;

    public String getCity() {
        return this.f7350a;
    }

    public int getType() {
        return this.f7351b;
    }

    public WeatherSearchQuery() {
    }

    public WeatherSearchQuery clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            j.a(e2, "WeatherSearchQuery", "clone");
        }
        return new WeatherSearchQuery(this.f7350a, this.f7351b);
    }

    public WeatherSearchQuery(String str, int i) {
        this.f7350a = str;
        this.f7351b = i;
    }
}
