package com.ss.android.ugc.aweme.commercialize.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class i implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("easter_egg_id")
    String id;
    @SerializedName("is_h5")
    boolean isH5;
    @SerializedName("easter_egg_name")
    String name;
    @SerializedName("open_url")
    String openUrl;
    @SerializedName("source_type")
    String sourceType;
    @SerializedName("source_url")
    UrlModel sourceUrl;
    @SerializedName("web_title")
    String webTitle;
    @SerializedName("web_url")
    String webUrl;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public UrlModel getSourceUrl() {
        return this.sourceUrl;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public boolean isH5() {
        return this.isH5;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setSourceUrl(UrlModel urlModel) {
        this.sourceUrl = urlModel;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
