package com.ss.android.ugc.aweme.profile;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;

@Keep
public class UserResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("toast_back")
    private int action;
    private User user;

    public int getAction() {
        return this.action;
    }

    public User getUser() {
        return this.user;
    }

    public void setAction(int i) {
        this.action = i;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
