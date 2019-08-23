package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;

@Keep
public class AtMe {
    @SerializedName("content")
    public String content;
    @SerializedName("image_url")
    public UrlModel imageUrl;
    @SerializedName("relation_label")
    public RelationDynamicLabel relationLabel;
    @SerializedName("schema_url")
    public String schemaUrl;
    @SerializedName("sub_type")
    public int subType;
    @SerializedName("title")
    public String title;
    @SerializedName("user_info")
    public User user;
}
