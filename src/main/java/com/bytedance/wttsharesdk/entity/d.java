package com.bytedance.wttsharesdk.entity;

import android.text.TextUtils;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f22937a = new JSONObject();

    public final String toString() {
        return this.f22937a.toString();
    }

    public final d a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    this.f22937a.put(str, str2);
                    return this;
                }
            }
            return this;
        } catch (Exception unused) {
        }
    }
}
