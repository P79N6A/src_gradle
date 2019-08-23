package com.ss.android.ugc.aweme.challenge.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import java.util.List;

public class SearchChallengeList extends BaseResponse {
    @SerializedName("cursor")
    public long cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("keyword_disabled")
    public boolean isDisabled;
    @SerializedName("is_match")
    public boolean isMatch;
    @SerializedName("challenge_list")
    public List<SearchChallenge> items;
    public String keyword;
    @SerializedName("log_pb")
    public LogPbBean logPb;
}
