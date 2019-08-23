package com.ss.android.ugc.aweme.commerce;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class d implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action")
    public String action;
    @SerializedName("offline_info_type")
    public int offlineInfoType;
    @SerializedName("text")
    public String text;

    public String getAction() {
        return this.action;
    }

    public int getOfflineInfoType() {
        return this.offlineInfoType;
    }

    public String getText() {
        return this.text;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setOfflineInfoType(int i) {
        this.offlineInfoType = i;
    }

    public void setText(String str) {
        this.text = str;
    }
}
