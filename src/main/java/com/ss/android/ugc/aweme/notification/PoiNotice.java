package com.ss.android.ugc.aweme.notification;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;

@Keep
public class PoiNotice {
    @SerializedName("content")
    public String content;
    @SerializedName("image_url")
    public UrlModel imageUrl;
    @SerializedName("schema_url")
    public String schemaUrl;
    @SerializedName("title")
    public String title;
}
