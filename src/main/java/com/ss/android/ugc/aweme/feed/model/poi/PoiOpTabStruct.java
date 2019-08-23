package com.ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public class PoiOpTabStruct {
    @SerializedName("activity_id")
    public int activityId;
    @SerializedName("city_code")
    public String cityCode;
    @SerializedName("icon_url")
    public UrlModel iconUrl;
    @SerializedName("title")
    public String title;
    @SerializedName("url")
    public String url;
}
