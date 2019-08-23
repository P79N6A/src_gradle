package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

@Keep
public class UserTextNotice {
    @SerializedName("content")
    public String content;
    @SerializedName("image_url")
    public UrlModel imageUrl;
    @SerializedName("object_id")
    public String objectId;
    @SerializedName("schema_url")
    public String schemaUrl;
    @SerializedName("sub_type")
    public int subType;
    @SerializedName("task_id")
    public long taskId;
    @SerializedName("title")
    public String title;
    @SerializedName("user_info")
    public User user;
}
