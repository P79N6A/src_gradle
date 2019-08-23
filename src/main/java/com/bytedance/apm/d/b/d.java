package com.bytedance.apm.d.b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.apm.d.b;
import com.bytedance.apm.d.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public String f18956a;

    /* renamed from: b  reason: collision with root package name */
    public String f18957b;

    /* renamed from: c  reason: collision with root package name */
    public float f18958c;

    public final String b() {
        return "timer";
    }

    public final String c() {
        return "timer";
    }

    public final boolean d() {
        return false;
    }

    @Nullable
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f18956a);
            jSONObject.put("key", this.f18957b);
            jSONObject.put("value", (double) this.f18958c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean a(@NonNull b bVar) {
        return bVar.c(this.f18956a);
    }

    public d(String str, String str2, float f2) {
        this.f18956a = str;
        this.f18957b = str2;
        this.f18958c = f2;
    }
}
