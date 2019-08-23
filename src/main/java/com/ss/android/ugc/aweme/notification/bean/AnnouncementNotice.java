package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;

@Keep
public class AnnouncementNotice {
    @SerializedName("challenge")
    public Challenge challenge;
    @SerializedName("content")
    public String content;
    @SerializedName("image_url")
    public UrlModel imageUrl;
    @SerializedName("object_id")
    public String objectId;
    @SerializedName("schema_url")
    public String schemaUrl;
    @SerializedName("search")
    public Search search;
    @SerializedName("task_id")
    public long taskId;
    @SerializedName("title")
    public String title;
    @SerializedName("type")
    public int type;
}
