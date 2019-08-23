package com.tencent.a.a.a.a;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    String f79213a;

    /* renamed from: b  reason: collision with root package name */
    String f79214b;

    /* renamed from: c  reason: collision with root package name */
    public String f79215c = PushConstants.PUSH_TYPE_NOTIFY;

    /* renamed from: d  reason: collision with root package name */
    long f79216d;

    static c a(String str) {
        c cVar = new c();
        if (h.a(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.isNull("ui")) {
                    cVar.f79213a = jSONObject.getString("ui");
                }
                if (!jSONObject.isNull("mc")) {
                    cVar.f79214b = jSONObject.getString("mc");
                }
                if (!jSONObject.isNull("mid")) {
                    cVar.f79215c = jSONObject.getString("mid");
                }
                if (!jSONObject.isNull(TimeDisplaySetting.TIME_DISPLAY_SETTING)) {
                    cVar.f79216d = jSONObject.getLong(TimeDisplaySetting.TIME_DISPLAY_SETTING);
                }
            } catch (JSONException unused) {
            }
        }
        return cVar;
    }

    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            h.a(jSONObject, "ui", this.f79213a);
            h.a(jSONObject, "mc", this.f79214b);
            h.a(jSONObject, "mid", this.f79215c);
            jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, this.f79216d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return a().toString();
    }
}
