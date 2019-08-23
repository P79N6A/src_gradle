package com.bytedance.apm.d.b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.apm.d.b;
import com.bytedance.apm.d.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public String f18959a;

    /* renamed from: b  reason: collision with root package name */
    public String f18960b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18961c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f18962d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f18963e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f18964f;

    public final String b() {
        return "performance_monitor";
    }

    public final boolean d() {
        return true;
    }

    public e() {
    }

    public final String c() {
        return this.f18959a;
    }

    @Nullable
    public final JSONObject a() {
        try {
            if (this.f18964f == null) {
                this.f18964f = new JSONObject();
            }
            this.f18964f.put("log_type", "performance_monitor");
            this.f18964f.put("service", this.f18959a);
            this.f18964f.put("extra_values", this.f18962d);
            if (TextUtils.equals("start", this.f18959a) && TextUtils.equals("from", this.f18964f.optString("monitor-plugin"))) {
                if (this.f18963e == null) {
                    this.f18963e = new JSONObject();
                }
                this.f18963e.put("start_mode", com.bytedance.apm.c.f1924d);
            }
            if (this.f18963e != null) {
                this.f18964f.put("extra_status", this.f18963e);
            }
            return this.f18964f;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean a(@NonNull b bVar) {
        if (this.f18961c || bVar.b(this.f18959a) || bVar.c(this.f18960b)) {
            return true;
        }
        return false;
    }

    public e(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this(str, str2, false, jSONObject, jSONObject2, jSONObject3);
    }

    public e(String str, String str2, boolean z, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f18959a = str;
        this.f18960b = str2;
        this.f18961c = false;
        this.f18962d = jSONObject;
        this.f18963e = jSONObject2;
        this.f18964f = jSONObject3;
    }
}
