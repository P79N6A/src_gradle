package com.bytedance.android.live.base.model.media;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class MediaAdInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("schema_url")
    private String schemaUrl;
    @SerializedName("title")
    private String title;

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
