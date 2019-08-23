package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class PlatformInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("full_synced")
    public boolean fullSynced;
    @SerializedName("nickname")
    public String nickName;
    @SerializedName("platform_name")
    public String patformName;

    public String getNickName() {
        return this.nickName;
    }

    public String getPatformName() {
        return this.patformName;
    }

    public boolean isFullSynced() {
        return this.fullSynced;
    }

    public void setFullSynced(boolean z) {
        this.fullSynced = z;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setPatformName(String str) {
        this.patformName = str;
    }
}
