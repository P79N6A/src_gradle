package com.ss.android.ugc.aweme.antiaddic.lock.entity;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class MinorSettingData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("event_type")
    private int eventType;
    @SerializedName("event_value")
    private String eventValue;
    @SerializedName("password")
    private String password;

    public int getEventType() {
        return this.eventType;
    }

    public String getEventValue() {
        return this.eventValue;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEventType(int i) {
        this.eventType = i;
    }

    public void setEventValue(String str) {
        this.eventValue = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }
}
