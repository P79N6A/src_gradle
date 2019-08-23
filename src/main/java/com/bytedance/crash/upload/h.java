package com.bytedance.crash.upload;

import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f19587a;

    /* renamed from: b  reason: collision with root package name */
    public String f19588b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f19589c;

    public final boolean a() {
        if (this.f19587a == 0) {
            return true;
        }
        return false;
    }

    public h(int i) {
        this.f19587a = i;
    }

    public h(int i, String str) {
        this.f19587a = i;
        this.f19588b = str;
    }

    public h(int i, Throwable th) {
        this.f19587a = i;
        this.f19588b = th.getMessage();
    }

    public h(int i, JSONObject jSONObject) {
        this.f19587a = 0;
        this.f19589c = jSONObject;
    }
}
