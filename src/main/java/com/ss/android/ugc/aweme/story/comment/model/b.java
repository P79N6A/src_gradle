package com.ss.android.ugc.aweme.story.comment.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.c;
import com.ss.android.ugc.aweme.story.api.model.g;
import java.io.Serializable;
import java.util.List;

public class b extends c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    long cursor;
    @SerializedName("has_more")
    int hasMore;
    @SerializedName("status_code")
    int statusCode;
    @SerializedName("status_msg")
    String statusMsg;
    @SerializedName("comments")
    List<g> storyCommentList;
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

    public List<g> getStoryCommentList() {
        return this.storyCommentList;
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

    public void setStoryCommentList(List<g> list) {
        this.storyCommentList = list;
    }

    public void setTotalCount(long j) {
        this.totalCount = j;
    }
}
