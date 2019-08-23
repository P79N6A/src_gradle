package com.xiaomi.push;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class cg {

    /* renamed from: a  reason: collision with root package name */
    private final double f81896a;

    /* renamed from: a  reason: collision with other field name */
    private final long f216a;

    /* renamed from: a  reason: collision with other field name */
    private final String f217a;

    /* renamed from: a  reason: collision with other field name */
    private final List f218a;

    /* renamed from: b  reason: collision with root package name */
    private final double f81897b;

    /* renamed from: b  reason: collision with other field name */
    private final long f219b;

    /* renamed from: b  reason: collision with other field name */
    private final String f220b;

    /* renamed from: c  reason: collision with root package name */
    private final String f81898c;

    /* renamed from: d  reason: collision with root package name */
    private final String f81899d;

    /* renamed from: e  reason: collision with root package name */
    private final String f81900e;

    /* renamed from: f  reason: collision with root package name */
    private final String f81901f;
    private final String g;
    private final String h;

    private cg(ce ceVar) {
        this.f217a = ce.a(ceVar);
        this.f220b = ce.b(ceVar);
        this.f81898c = ceVar.f81891c;
        this.f81899d = ceVar.f81892d;
        this.f81896a = ce.a(ceVar);
        this.f81897b = ce.b(ceVar);
        this.f81900e = ceVar.f81893e;
        this.f81901f = ceVar.f81894f;
        this.f216a = ce.a(ceVar);
        this.f219b = ce.b(ceVar);
        this.g = ceVar.g;
        this.h = ceVar.h;
        this.f218a = ce.a(ceVar);
    }

    private void a(JSONObject jSONObject, String str, Object obj) {
        if (!(jSONObject == null || obj == null)) {
            if (!(obj instanceof String)) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused) {
                }
            } else if (!((String) obj).isEmpty()) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused2) {
                }
            }
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "m", this.f217a);
        a(jSONObject, "i", this.f220b);
        a(jSONObject, "a", this.f81898c);
        a(jSONObject, "o", this.f81899d);
        a(jSONObject, "lg", Double.valueOf(this.f81896a));
        a(jSONObject, "lt", Double.valueOf(this.f81897b));
        a(jSONObject, "am", this.f81900e);
        a(jSONObject, AdvanceSetting.ADVANCE_SETTING, this.f81901f);
        a(jSONObject, "ast", Long.valueOf(this.f216a));
        a(jSONObject, "ad", Long.valueOf(this.f219b));
        a(jSONObject, "ds", this.g);
        a(jSONObject, "dm", this.h);
        JSONArray jSONArray = new JSONArray();
        for (String put : this.f218a) {
            jSONArray.put(put);
        }
        a(jSONObject, "devices", jSONArray);
        return jSONObject;
    }
}
