package com.ss.android.ugc.aweme.detail.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public class BatchDetailList extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme_details")
    List<Aweme> items;
    @SerializedName("rid")
    String requestId;

    public List<Aweme> getItems() {
        return this.items;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setItems(List<Aweme> list) {
        this.items = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
