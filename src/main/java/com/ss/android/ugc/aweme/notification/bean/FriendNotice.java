package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.profile.model.User;

@Keep
public class FriendNotice {
    @SerializedName("content")
    public String content;
    @SerializedName("schema_url")
    public String openUrl;
    @SerializedName("type")
    public int type;
    @SerializedName("from_user")
    public User user;
}
