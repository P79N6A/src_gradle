package com.bytedance.apm.f;

import org.json.JSONObject;

public class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public int f1983a;

    /* renamed from: b  reason: collision with root package name */
    public int f1984b;

    /* renamed from: c  reason: collision with root package name */
    public long f1985c;

    /* renamed from: d  reason: collision with root package name */
    public int f1986d;

    /* renamed from: e  reason: collision with root package name */
    public long f1987e;

    public a() {
    }

    public final e a(JSONObject jSONObject) {
        this.f1983a = jSONObject.optInt("front");
        this.f1985c = jSONObject.optLong("sid");
        this.f1984b = jSONObject.optInt("network_type");
        this.f1986d = jSONObject.optInt("hit_rules");
        this.f1987e = jSONObject.optLong("timing_totalSendBytes", 0) + jSONObject.optLong("timing_totalReceivedBytes", 0);
        return super.a(jSONObject);
    }

    public a(long j, String str, long j2, String str2) {
        super(j, str, j2, str2);
    }

    public a(long j, String str, long j2, JSONObject jSONObject) {
        super(j, str, j2, jSONObject);
    }
}
