package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class AdCoverTitle implements Serializable, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("title")
    public String title;
    @SerializedName("web_url")
    public String webUrl;

    public String getTitle() {
        return this.title;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
