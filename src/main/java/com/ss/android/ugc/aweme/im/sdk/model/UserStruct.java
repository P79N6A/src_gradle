package com.ss.android.ugc.aweme.im.sdk.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;

@Keep
public class UserStruct extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("user")
    User user;

    public User getUser() {
        return this.user;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
