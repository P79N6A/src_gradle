package com.huawei.android.pushagent.plugin.a;

import com.huawei.android.pushagent.utils.a.b;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private String f25132a;

    /* renamed from: b  reason: collision with root package name */
    private String f25133b;

    /* renamed from: c  reason: collision with root package name */
    private int f25134c = -1;

    /* renamed from: d  reason: collision with root package name */
    private long f25135d;

    /* renamed from: e  reason: collision with root package name */
    private long f25136e;

    public String a() {
        return this.f25133b;
    }

    public void a(String str) {
        JSONObject a2 = b.a(str);
        if (a2 == null) {
            com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "enter SaltRsp.loadFromString, json is null");
            return;
        }
        this.f25132a = a2.optString("resultcode");
        this.f25133b = a2.optString("salt");
        this.f25134c = a2.optInt("belongId", -1);
        this.f25135d = a2.optLong("minUp", 0);
        this.f25136e = a2.optLong("maxUp", 0);
    }

    public int b() {
        return this.f25134c;
    }

    public long c() {
        return this.f25135d * 1000;
    }

    public long d() {
        return this.f25136e * 1000;
    }

    public String toString() {
        return "resultCode:" + this.f25132a + ";salt:" + this.f25133b + ";belongId:" + this.f25134c + ";minUp:" + this.f25135d + ";maxUp:" + this.f25136e;
    }
}
