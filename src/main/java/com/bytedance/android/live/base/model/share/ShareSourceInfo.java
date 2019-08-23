package com.bytedance.android.live.base.model.share;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class ShareSourceInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("app_name")
    private String appName;
    @SerializedName("img_title")
    private String imgTitle;
    @SerializedName("img_url")
    private ImageModel imgUrl;
    @SerializedName("pkg_name")
    private String pkgName;
    @SerializedName("schema_url")
    private String schemaUrl;
    @SerializedName("title")
    private String title;

    public String getAppName() {
        return this.appName;
    }

    public String getImgTitle() {
        return this.imgTitle;
    }

    public ImageModel getImgUrl() {
        return this.imgUrl;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setImgTitle(String str) {
        this.imgTitle = str;
    }

    public void setImgUrl(ImageModel imageModel) {
        this.imgUrl = imageModel;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
