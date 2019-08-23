package com.ss.android.ugc.aweme.base.share;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

@Keep
public class RocketFansGroupInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("download_url")
    public String downloadUrl;
    @SerializedName("schema")
    public String schema;
    @SerializedName("token")
    public String token;

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getToken() {
        return this.token;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
