package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

@Keep
public class Notice extends BaseResponse {
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("notice_list")
    public List<BaseNotice> items;
    @SerializedName("log_pb")
    public LogPbBean logPbBean;
    @SerializedName("max_time")
    public long maxTime;
    @SerializedName("min_time")
    public long minTime;
    @SerializedName("total")
    public int total;
}
