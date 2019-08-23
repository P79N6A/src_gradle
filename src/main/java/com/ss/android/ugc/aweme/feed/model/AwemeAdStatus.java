package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class AwemeAdStatus extends BaseResponse {
    @SerializedName("ad_exist")
    public boolean adExist;
    @SerializedName("ad_id")
    public String adId;
    @SerializedName("pass")
    public boolean pass;
    @SerializedName("url")
    public String url;
}
