package com.ss.android.downloadlib.addownload.d;

import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public Long f28768a;

    /* renamed from: b  reason: collision with root package name */
    public String f28769b;

    public c() {
        this.f28768a = 0L;
        this.f28769b = "";
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mAdId", this.f28768a);
            jSONObject.put("mPackageName", this.f28769b);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public c(Long l, String str) {
        this.f28768a = l;
        this.f28769b = str;
    }
}
