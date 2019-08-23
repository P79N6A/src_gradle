package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class SearchChallengeList extends SearchApiResult {
    @SerializedName("challenge_list")
    public List<SearchChallenge> challengeList;
    @SerializedName(alternate = {"min_cursor"}, value = "cursor")
    public int cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("is_match")
    public boolean isMatch;
}
