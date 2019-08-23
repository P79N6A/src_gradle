package com.ss.android.ugc.aweme.setting.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

public class WhiteList {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("long_whitelist")
    public String[] longWhiteList;
    @SerializedName("short_whitelist")
    public String[] shortWhiteList;

    public String[] getLongWhiteList() {
        if (this.longWhiteList == null) {
            this.longWhiteList = new String[0];
        }
        return this.longWhiteList;
    }

    public String[] getShortWhiteList() {
        if (this.shortWhiteList == null) {
            this.shortWhiteList = new String[0];
        }
        return this.shortWhiteList;
    }
}
