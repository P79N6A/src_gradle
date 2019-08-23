package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class RelativeUserInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avatar")
    public UrlModel avatar;
    @SerializedName("uid")
    public String uid;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public String getUid() {
        return this.uid;
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
