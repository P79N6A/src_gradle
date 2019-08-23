package com.ss.android.ugc.aweme.message.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

@Keep
public class NoticeList extends BaseResponse {
    @SerializedName("follow_tab_channel_count")
    public List<FollowTabChannelCountStruct> followTabChannelCounts;
    @SerializedName("notice_count")
    public List<NoticeCount> items;
    @SerializedName("log_pb")
    public LogPbBean logPb;
    @SerializedName("user_id")
    public long userId;
}
