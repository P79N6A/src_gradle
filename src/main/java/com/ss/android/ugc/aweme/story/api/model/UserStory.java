package com.ss.android.ugc.aweme.story.api.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

@Keep
public class UserStory extends c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("all_story_list")
    List<IdWithScoreStruct> allStoryList;
    @SerializedName("story_list")
    List<b> awemeList;
    @SerializedName("cur_pos")
    long curPos;
    @SerializedName("friend_type")
    int friendType;
    @SerializedName("has_more")
    int hasMore;
    private boolean isAllStoriesLoaded;
    @SerializedName("label_large")
    UrlModel labelLarge;
    long lastPos;
    @SerializedName("log_pb")
    LogPbBean logPb;
    @SerializedName("max_cursor")
    long maxCursor;
    @SerializedName("min_cursor")
    long minCursor;
    @SerializedName("read_flag")
    int readFlag;
    @SerializedName("total_count")
    long totalCount;
    @SerializedName("user")
    User user;

    public int getType() {
        return 0;
    }

    public List<IdWithScoreStruct> getAllStoryList() {
        return this.allStoryList;
    }

    public List<b> getAwemeList() {
        return this.awemeList;
    }

    public long getCurPos() {
        return this.curPos;
    }

    public int getFriendType() {
        return this.friendType;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public long getLastPos() {
        return this.lastPos;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public int getReadFlag() {
        return this.readFlag;
    }

    public long getTotalCount() {
        return this.totalCount;
    }

    public User getUser() {
        return this.user;
    }

    public boolean isAllStoriesLoaded() {
        return this.isAllStoriesLoaded;
    }

    public void setAllStoriesLoaded(boolean z) {
        this.isAllStoriesLoaded = z;
    }

    public void setAllStoryList(List<IdWithScoreStruct> list) {
        this.allStoryList = list;
    }

    public void setAwemeList(List<b> list) {
        this.awemeList = list;
    }

    public void setCurPos(long j) {
        this.curPos = j;
    }

    public void setFriendType(int i) {
        this.friendType = i;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setLastPos(long j) {
        this.lastPos = j;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setReadFlag(int i) {
        this.readFlag = i;
    }

    public void setTotalCount(long j) {
        this.totalCount = j;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
