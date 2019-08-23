package com.bytedance.apm.d.b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.apm.d.b;
import com.bytedance.apm.d.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public String f1969a;

    /* renamed from: b  reason: collision with root package name */
    public int f1970b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f1971c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f1972d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f1973e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f1974f;

    public final String b() {
        return "service_monitor";
    }

    public final String c() {
        return "service_monitor";
    }

    public final boolean d() {
        return true;
    }

    @Nullable
    public final JSONObject a() {
        if (this.f1974f == null) {
            this.f1974f = new JSONObject();
        }
        try {
            this.f1974f.put("log_type", "service_monitor");
            this.f1974f.put("service", this.f1969a);
            this.f1974f.put("status", this.f1970b);
            if (this.f1971c != null) {
                this.f1974f.put("value", this.f1971c);
            }
            if (this.f1972d != null) {
                this.f1974f.put("category", this.f1972d);
            }
            if (this.f1973e != null) {
                this.f1974f.put("metric", this.f1973e);
            }
            return this.f1974f;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean a(@NonNull b bVar) {
        return bVar.b(this.f1969a);
    }

    public f(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f1969a = str;
        this.f1970b = i;
        this.f1971c = jSONObject;
        this.f1972d = jSONObject2;
        this.f1973e = jSONObject3;
        this.f1974f = jSONObject4;
    }
}
