package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.model.o;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class SearchApiResult extends BaseResponse implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_info")
    public o adInfo;
    @SerializedName("guide_search_words")
    public List<GuideSearchWord> guideSearchWordList;
    @SerializedName("log_pb")
    public LogPbBean logPb;
    @SerializedName("query_correct_info")
    public QueryCorrectInfo queryCorrectInfo;
    String requestId = "";
    @SerializedName("search_nil_info")
    public SearchNilInfo searchNilInfo;
    @SerializedName("search_nil_text")
    public SearchNilText searchNilText;
    @SerializedName("suicide_prevent")
    public SearchPreventSuicide suicidePrevent;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
