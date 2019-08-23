package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.Required;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public class MusicAwemeList extends BaseResponse implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    public long cursor;
    @SerializedName("has_more")
    public int hasMore;
    @SerializedName("aweme_list")
    @Required
    public List<Aweme> items;
    @SerializedName("rid")
    String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
