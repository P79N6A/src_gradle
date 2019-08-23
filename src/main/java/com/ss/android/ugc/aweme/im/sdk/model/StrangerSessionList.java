package com.ss.android.ugc.aweme.im.sdk.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

@Keep
public class StrangerSessionList {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("has_more")
    boolean hasMore;
    @SerializedName("session_list")
    List<StrangerMsgSession> lastMsg;
    @SerializedName("status_code")
    int statusCode;

    public List<StrangerMsgSession> getLastMsg() {
        return this.lastMsg;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setLastMsg(List<StrangerMsgSession> list) {
        this.lastMsg = list;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }
}
