package com.ss.android.ugc.aweme.im.sdk.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class StrangerMsgSession {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("last_msg")
    StrangerMessage lastMsg;
    @SerializedName("session_id")
    long sessionId;
    @SerializedName("unread_count")
    int unreadCount;

    public StrangerMessage getLastMsg() {
        return this.lastMsg;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public int getUnreadCount() {
        return this.unreadCount;
    }

    public void setLastMsg(StrangerMessage strangerMessage) {
        this.lastMsg = strangerMessage;
    }

    public void setSessionId(long j) {
        this.sessionId = j;
    }

    public void setUnreadCount(int i) {
        this.unreadCount = i;
    }
}
