package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class InquiryStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("desc")
    private String desc;
    @SerializedName("icon")
    private UrlModel icon;
    @SerializedName("open_url")
    private String openUrl;
    @SerializedName("web_url")
    private String webUrl;

    public String getDesc() {
        return this.desc;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }
}
