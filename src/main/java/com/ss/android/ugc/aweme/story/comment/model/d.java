package com.ss.android.ugc.aweme.story.comment.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.c;
import java.io.Serializable;
import java.util.List;

public class d extends c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    long cursor;
    @SerializedName("has_more")
    int hasMore;
    @SerializedName("status_code")
    int statusCode;
    @SerializedName("status_msg")
    String statusMsg;
    @SerializedName("user_list")
    List<c> storyViewerList;
    @SerializedName("total")
    long totalCount;

    public long getCursor() {
        return this.cursor;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public List<c> getStoryViewerList() {
        return this.storyViewerList;
    }

    public long getTotalCount() {
        return this.totalCount;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public void setStoryViewerList(List<c> list) {
        this.storyViewerList = list;
    }

    public void setTotalCount(long j) {
        this.totalCount = j;
    }
}
