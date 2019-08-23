package com.ss.android.ugc.aweme.challenge.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

public class ChallengeList extends BaseResponse {
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("is_match")
    public boolean isMatch;
    @SerializedName("challenge_list")
    public List<Challenge> items;
    @SerializedName("max_cursor")
    public long maxCursor;
    @SerializedName("min_cursor")
    public long minCursor;
}
