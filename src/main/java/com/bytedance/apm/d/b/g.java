package com.bytedance.apm.d.b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.apm.d.b;
import com.bytedance.apm.d.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public String f18965a;

    /* renamed from: b  reason: collision with root package name */
    public String f18966b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f18967c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f18968d;

    public final String b() {
        return "ui_action";
    }

    public final String c() {
        return "ui_action";
    }

    public final boolean d() {
        return true;
    }

    @Nullable
    public final JSONObject a() {
        try {
            if (this.f18968d == null) {
                this.f18968d = new JSONObject();
            }
            this.f18968d.put("log_type", "ui_action");
            this.f18968d.put("action", this.f18965a);
            this.f18968d.put("page", this.f18966b);
            this.f18968d.put("context", this.f18967c);
            return this.f18968d;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean a(@NonNull b bVar) {
        return bVar.a("ui_action");
    }

    public g(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f18965a = str;
        this.f18966b = str2;
        this.f18967c = jSONObject;
        this.f18968d = jSONObject2;
    }
}
