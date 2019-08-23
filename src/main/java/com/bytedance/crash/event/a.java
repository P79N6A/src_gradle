package com.bytedance.crash.event;

import android.os.Build;
import com.bytedance.crash.event.json.Key;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements Serializable {
    @Key
    String access;
    @Key
    String aid;
    @Key
    String appVersion;
    @Key
    String crashSummary;
    @Key
    long crashTime;
    @Key
    String crashType;
    @Key
    String deviceId;
    @Key
    String deviceModel = Build.MODEL;
    @Key
    String errorInfo;
    @Key
    String event;
    @Key
    long eventTime;
    @Key
    String eventType = "crash";
    @Key
    String mccMnc;
    @Key
    String osType;
    @Key
    String osVersion;
    @Key
    String sdkVersion;
    @Key
    int state;
    @Key
    String updateVersionCode;
    @Key
    String uuid;

    public final long getCrashTime() {
        return this.crashTime;
    }

    public final String toString() {
        return this.crashType + "\t" + this.crashTime + "\t" + this.event + "\t" + this.state + "\t" + this.crashSummary;
    }

    public final a clone() {
        a aVar = new a();
        aVar.crashTime = this.crashTime;
        aVar.eventTime = this.eventTime;
        aVar.event = this.event;
        aVar.eventType = this.eventType;
        aVar.crashSummary = this.crashSummary;
        aVar.crashType = this.crashType;
        aVar.state = this.state;
        aVar.errorInfo = this.errorInfo;
        aVar.osType = this.osType;
        aVar.osVersion = this.osVersion;
        aVar.deviceModel = this.deviceModel;
        aVar.appVersion = this.appVersion;
        aVar.updateVersionCode = this.updateVersionCode;
        aVar.sdkVersion = this.sdkVersion;
        aVar.mccMnc = this.mccMnc;
        aVar.access = this.access;
        aVar.aid = this.aid;
        aVar.deviceId = this.deviceId;
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("crash_time", this.crashTime);
            jSONObject.put("event_time", this.eventTime);
            jSONObject.put("event", this.event);
            jSONObject.put("event_type", this.eventType);
            jSONObject.put("crash_summary", this.crashSummary);
            jSONObject.put("crash_type", this.crashType);
            jSONObject.put("state", this.state);
            jSONObject.put("error_info", this.errorInfo);
            jSONObject.put("os", this.osType);
            jSONObject.put("os_version", this.osVersion);
            jSONObject.put("device_model", this.deviceModel);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("update_version_code", this.updateVersionCode);
            jSONObject.put("sdk_version", this.sdkVersion);
            jSONObject.put("mcc_mnc", this.mccMnc);
            jSONObject.put("access", this.access);
            jSONObject.put("aid", this.aid);
            jSONObject.put("device_id", this.deviceId);
            jSONObject.put("uuid", this.uuid);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final a errorInfo(String str) {
        this.errorInfo = str;
        return this;
    }

    public final a eventType(String str) {
        this.event = str;
        return this;
    }

    public final a state(int i) {
        this.state = i;
        return this;
    }

    public final a errorInfo(Throwable th) {
        if (th != null) {
            this.errorInfo = th.getMessage();
        }
        return this;
    }

    public final a errorInfo(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.errorInfo = jSONObject.toString();
        }
        return this;
    }
}
