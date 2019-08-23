package com.alibaba.sdk.android.httpdns;

import org.json.JSONObject;

public class e {

    /* renamed from: b  reason: collision with root package name */
    private int f5097b;

    /* renamed from: e  reason: collision with root package name */
    private String f5098e;

    e(int i, String str) {
        this.f5097b = i;
        this.f5098e = new JSONObject(str).getString("code");
    }

    public String a() {
        return this.f5098e;
    }
}
