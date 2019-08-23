package com.alipay.sdk.f;

import android.text.TextUtils;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f5489a;

    /* renamed from: b  reason: collision with root package name */
    public String f5490b;

    public final JSONObject a() {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(this.f5490b)) {
            return null;
        }
        try {
            jSONObject = new JSONObject(this.f5490b);
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject;
    }

    public final String toString() {
        return "\nenvelop:" + this.f5489a + "\nbody:" + this.f5490b;
    }

    public b(String str, String str2) {
        this.f5489a = str;
        this.f5490b = str2;
    }
}
