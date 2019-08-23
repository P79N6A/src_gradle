package com.ss.android.ugc.aweme.shortvideo.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.h;
import java.util.List;

public class AVSearchChallengeList {
    @SerializedName("cursor")
    public long cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("keyword_disabled")
    public boolean isDisabled;
    @SerializedName("is_match")
    public boolean isMatch;
    @SerializedName("challenge_list")
    public List<h> items;
    public String keyword;
    @SerializedName("log_pb")
    public LogPbBean logPb;
}
