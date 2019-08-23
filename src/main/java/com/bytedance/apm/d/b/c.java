package com.bytedance.apm.d.b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.apm.d.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements com.bytedance.apm.d.c {

    /* renamed from: a  reason: collision with root package name */
    private String f18954a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f18955b;

    public final boolean d() {
        return true;
    }

    public final String b() {
        return this.f18954a;
    }

    public final String c() {
        return this.f18954a;
    }

    @Nullable
    public final JSONObject a() {
        if (this.f18955b == null) {
            return null;
        }
        try {
            this.f18955b.put("log_type", this.f18954a);
        } catch (JSONException unused) {
        }
        return this.f18955b;
    }

    public final boolean a(@NonNull b bVar) {
        return bVar.a(this.f18954a);
    }

    public c(String str, JSONObject jSONObject) {
        this.f18954a = str;
        this.f18955b = jSONObject;
    }
}
