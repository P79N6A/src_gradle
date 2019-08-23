package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class SearchSugResponse extends BaseResponse {
    @SerializedName("log_pb")
    public LogPbBean logPb;
    @SerializedName("words_query_record")
    public RecommendWordMob recommendWordMob;
    @SerializedName("rid")
    public String requestId = "";
    @SerializedName("sug_list")
    public List<SearchSugEntity> sugList;
}
