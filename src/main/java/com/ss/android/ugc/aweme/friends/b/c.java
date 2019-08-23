package com.ss.android.ugc.aweme.friends.b;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("short_url")
    private String url;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
