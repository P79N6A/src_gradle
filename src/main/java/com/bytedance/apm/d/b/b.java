package com.bytedance.apm.d.b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.apm.d.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public String f1966a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f1967b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1968c;

    public final String b() {
        return "common_log";
    }

    public final String c() {
        return "common_log";
    }

    public final boolean d() {
        return true;
    }

    @Nullable
    public final JSONObject a() {
        if (this.f1967b == null) {
            return null;
        }
        try {
            this.f1967b.put("log_type", this.f1966a);
        } catch (JSONException unused) {
        }
        return this.f1967b;
    }

    public final boolean a(@NonNull com.bytedance.apm.d.b bVar) {
        return bVar.a(this.f1966a);
    }

    public b(String str, JSONObject jSONObject, boolean z) {
        this.f1966a = str;
        this.f1967b = jSONObject;
        this.f1968c = z;
    }
}
