package com.ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public class PoiClassInfoStruct {
    @SerializedName("code")
    public int code;
    @SerializedName("icon_url")
    public UrlModel iconUrl;
    @SerializedName("name")
    public String name;
}
