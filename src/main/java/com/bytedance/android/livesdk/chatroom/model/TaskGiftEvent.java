package com.bytedance.android.livesdk.chatroom.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class TaskGiftEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    private String data;
    @SerializedName("subtitle")
    private String subtitle;
    @SerializedName("type")
    private int type;

    public String getData() {
        return this.data;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public int getType() {
        return this.type;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
