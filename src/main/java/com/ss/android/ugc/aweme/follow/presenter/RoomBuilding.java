package com.ss.android.ugc.aweme.follow.presenter;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;

@Keep
public class RoomBuilding extends BaseResponse {
    @SerializedName("activity_h5_url")
    public String activityH5Url;
    @SerializedName("activity_icon_url")
    public UrlModel activityIconUrl;
    @SerializedName("begin_time")
    public long beginTime;
    @SerializedName("end_time")
    public long endTime;
    @SerializedName("show_h5")
    public boolean showH5;
    @SerializedName("show_h5_url")
    public String showH5Url;
}
