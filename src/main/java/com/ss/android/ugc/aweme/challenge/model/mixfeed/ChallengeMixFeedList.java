package com.ss.android.ugc.aweme.challenge.model.mixfeed;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class ChallengeMixFeedList extends BaseResponse implements h {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    public long cursor;
    @SerializedName("has_more")
    public int hasMore;
    @SerializedName("log_pb")
    public LogPbBean logPb;
    @SerializedName("data")
    public List<ChallengeMixFeed> mItems;
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
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 25844, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 25844, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.requestId = str;
        for (ChallengeMixFeed next : this.mItems) {
            if (next != null) {
                next.setRequestId(str);
            }
        }
    }
}
