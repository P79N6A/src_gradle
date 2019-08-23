package com.umeng.message.entity;

import org.json.JSONException;
import org.json.JSONObject;

public class ULocation {

    /* renamed from: a  reason: collision with root package name */
    private String f81167a;

    /* renamed from: b  reason: collision with root package name */
    private String f81168b;

    /* renamed from: c  reason: collision with root package name */
    private String f81169c;

    /* renamed from: d  reason: collision with root package name */
    private String f81170d;

    /* renamed from: e  reason: collision with root package name */
    private String f81171e;

    /* renamed from: f  reason: collision with root package name */
    private String f81172f;
    private String g;
    private String h;

    public String getCity() {
        return this.f81171e;
    }

    public String getCountry() {
        return this.f81169c;
    }

    public String getDistrict() {
        return this.f81172f;
    }

    public String getLatitude() {
        return this.f81168b;
    }

    public String getLongitude() {
        return this.f81167a;
    }

    public String getProvince() {
        return this.f81170d;
    }

    public String getRoad() {
        return this.g;
    }

    public String getStreet() {
        return this.h;
    }

    public ULocation(JSONObject jSONObject) {
        try {
            this.f81167a = jSONObject.getString("cenx");
            this.f81168b = jSONObject.getString("ceny");
            JSONObject jSONObject2 = jSONObject.getJSONObject("revergeo");
            this.f81169c = jSONObject2.getString("country");
            this.f81170d = jSONObject2.getString("province");
            this.f81171e = jSONObject2.getString("city");
            this.f81172f = jSONObject2.getString("district");
            this.g = jSONObject2.getString("road");
            this.h = jSONObject2.getString("street");
        } catch (JSONException unused) {
        }
    }
}
