package com.bytedance.apm.d.b;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.apm.d.b;
import com.bytedance.apm.d.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public String f18948a;

    /* renamed from: b  reason: collision with root package name */
    public long f18949b;

    /* renamed from: c  reason: collision with root package name */
    public long f18950c;

    /* renamed from: d  reason: collision with root package name */
    public String f18951d;

    /* renamed from: e  reason: collision with root package name */
    public String f18952e;

    /* renamed from: f  reason: collision with root package name */
    public String f18953f;
    public int g;
    public JSONObject h;

    public final boolean a(@NonNull b bVar) {
        return false;
    }

    public final String b() {
        return null;
    }

    public final String c() {
        return null;
    }

    public final boolean d() {
        return true;
    }

    @Nullable
    public final JSONObject a() {
        if (TextUtils.isEmpty(this.f18948a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.f18948a);
            jSONObject.put("duration", this.f18949b);
            jSONObject.put("uri", Uri.parse(this.f18951d));
            if (this.f18950c > 0) {
                jSONObject.put("timestamp", this.f18950c);
            }
            jSONObject.put("status", this.g);
            if (!TextUtils.isEmpty(this.f18952e)) {
                jSONObject.put("ip", this.f18952e);
            }
            if (!TextUtils.isEmpty(this.f18953f)) {
                jSONObject.put("trace_code", this.f18953f);
            } else {
                jSONObject.put("trace_code", "");
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(String str) throws JSONException {
        if (this.h.isNull("net_consume_type")) {
            this.h.put("net_consume_type", str);
        }
    }

    public final void a(boolean z) throws JSONException {
        if (this.h.isNull("front")) {
            this.h.put("front", z ? 1 : 0);
        }
    }

    public a(String str, long j, long j2, String str2, String str3, String str4, int i, JSONObject jSONObject) {
        this.f18948a = str;
        this.f18949b = j;
        this.f18950c = j2;
        this.f18951d = str2;
        this.f18952e = str3;
        this.f18953f = str4;
        this.g = i;
        if (jSONObject == null) {
            this.h = new JSONObject();
        } else {
            this.h = jSONObject;
        }
    }
}
