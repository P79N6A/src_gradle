package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class BannerList extends BaseResponse implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("banner")
    public List<Banner> items;
    @SerializedName("log_pb")
    public LogPbBean logPb;
    String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
