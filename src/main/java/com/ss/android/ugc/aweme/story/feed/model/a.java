package com.ss.android.ugc.aweme.story.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.c;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import java.io.Serializable;
import java.util.List;

public class a extends c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    long cursor;
    @SerializedName("has_more")
    int hasMore;
    @SerializedName("room_list")
    public List<c> liveStories;
    @SerializedName("log_pb")
    LogPbBean logPb;
    @SerializedName("user_story_list")
    List<UserStory> userStoryList;

    public long getCursor() {
        return this.cursor;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public List<UserStory> getUserStoryList() {
        return this.userStoryList;
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

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setUserStoryList(List<UserStory> list) {
        this.userStoryList = list;
    }
}
