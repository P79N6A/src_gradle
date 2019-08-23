package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;

@Keep
public class FollowNotice {
    @SerializedName("content")
    public String content;
    @SerializedName("relation_label")
    public RelationDynamicLabel relationLabel;
    @SerializedName("from_user")
    public User user;
}
