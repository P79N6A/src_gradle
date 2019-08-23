package com.xiaomi.push;

import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.do  reason: invalid class name */
public class Cdo {

    /* renamed from: a  reason: collision with root package name */
    private int f81942a;

    /* renamed from: a  reason: collision with other field name */
    private long f269a;

    /* renamed from: a  reason: collision with other field name */
    private String f270a;

    /* renamed from: b  reason: collision with root package name */
    private long f81943b;

    /* renamed from: c  reason: collision with root package name */
    private long f81944c;

    public Cdo() {
        this(0, 0, 0, null);
    }

    public Cdo(int i, long j, long j2, Exception exc) {
        this.f81942a = i;
        this.f269a = j;
        this.f81944c = j2;
        this.f81943b = System.currentTimeMillis();
        if (exc != null) {
            this.f270a = exc.getClass().getSimpleName();
        }
    }

    public int a() {
        return this.f81942a;
    }

    public Cdo a(JSONObject jSONObject) {
        this.f269a = jSONObject.getLong("cost");
        this.f81944c = jSONObject.getLong("size");
        this.f81943b = jSONObject.getLong(TimeDisplaySetting.TIME_DISPLAY_SETTING);
        this.f81942a = jSONObject.getInt("wt");
        this.f270a = jSONObject.optString("expt");
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public JSONObject m176a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f269a);
        jSONObject.put("size", this.f81944c);
        jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, this.f81943b);
        jSONObject.put("wt", this.f81942a);
        jSONObject.put("expt", this.f270a);
        return jSONObject;
    }
}
