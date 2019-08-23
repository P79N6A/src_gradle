package com.ss.android.ugc.aweme.setting.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class FriendTabStruct {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("default_follow_tab")
    public boolean defaultFollowTab;
    @SerializedName("friend_tab_desc")
    public String friendTabDesc;

    public FriendTabStruct setDefaultFollowTab(boolean z) {
        this.defaultFollowTab = z;
        return this;
    }

    public FriendTabStruct setFriendTabDesc(String str) {
        this.friendTabDesc = str;
        return this;
    }
}
