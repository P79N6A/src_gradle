package com.tencent.wxop.stat;

import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f79879a;

    /* renamed from: b  reason: collision with root package name */
    public int f79880b;

    /* renamed from: c  reason: collision with root package name */
    public String f79881c = "";

    /* renamed from: d  reason: collision with root package name */
    public int f79882d;

    /* renamed from: e  reason: collision with root package name */
    public String f79883e = "";

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tm", this.f79879a);
            jSONObject.put(TimeDisplaySetting.START_SHOW_TIME, this.f79880b);
            if (this.f79881c != null) {
                jSONObject.put("dm", this.f79881c);
            }
            jSONObject.put("pt", this.f79882d);
            if (this.f79883e != null) {
                jSONObject.put("rip", this.f79883e);
            }
            jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis() / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
