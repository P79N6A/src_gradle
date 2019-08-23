package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class FollowerDetail implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("app_name")
    public String appName;
    @SerializedName("apple_id")
    public String appleId;
    @SerializedName("download_url")
    public String downloadUrl;
    @SerializedName("fans_count")
    public int fansCount;
    @SerializedName("icon")
    public String icon;
    @SerializedName("name")
    public String name;
    @SerializedName("open_url")
    public String openUrl;
    @SerializedName("package_name")
    public String packageName;

    public String getAppName() {
        return this.appName;
    }

    public String getAppleId() {
        return this.appleId;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public int getFansCount() {
        return this.fansCount;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppleId(String str) {
        this.appleId = str;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setFansCount(int i) {
        this.fansCount = i;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }
}
