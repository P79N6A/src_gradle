package com.tencent.wxop.stat.a;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f79784a;

    /* renamed from: b  reason: collision with root package name */
    public String f79785b;

    /* renamed from: c  reason: collision with root package name */
    public int f79786c;

    /* renamed from: d  reason: collision with root package name */
    private String f79787d;

    /* renamed from: e  reason: collision with root package name */
    private String f79788e = PushConstants.PUSH_TYPE_NOTIFY;

    /* renamed from: f  reason: collision with root package name */
    private int f79789f;
    private long g;

    public c() {
    }

    public c(String str, String str2, int i) {
        this.f79784a = str;
        this.f79785b = str2;
        this.f79786c = i;
    }

    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            s.a(jSONObject, "ui", this.f79784a);
            s.a(jSONObject, "mc", this.f79785b);
            s.a(jSONObject, "mid", this.f79788e);
            s.a(jSONObject, "aid", this.f79787d);
            jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, this.g);
            jSONObject.put("ver", this.f79789f);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return a().toString();
    }
}
