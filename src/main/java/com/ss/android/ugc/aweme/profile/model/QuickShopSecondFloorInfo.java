package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class QuickShopSecondFloorInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("enter_text")
    public String enterText;
    @SerializedName("process_text")
    public String processText;
    @SerializedName("trans_bg_text")
    public String transBgText;

    public String getEnterText() {
        return this.enterText;
    }

    public String getProcessText() {
        return this.processText;
    }

    public String getTransBgText() {
        return this.transBgText;
    }

    public void setEnterText(String str) {
        this.enterText = str;
    }

    public void setProcessText(String str) {
        this.processText = str;
    }

    public void setTransBgText(String str) {
        this.transBgText = str;
    }
}
