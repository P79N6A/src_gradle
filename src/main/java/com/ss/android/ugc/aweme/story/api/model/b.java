package com.ss.android.ugc.aweme.story.api.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.Required;
import java.io.Serializable;

public class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("comment_hasmore")
    d commentHasMore;
    boolean isRead;
    @SerializedName("log_pb")
    LogPbBean logPb;
    @SerializedName("story")
    @Required
    LifeStory mLifeStory;
    @SerializedName("recommend_reason")
    String reason;
    @SerializedName("view_user_list")
    i viewUserList;

    public d getCommentHasMore() {
        return this.commentHasMore;
    }

    public LifeStory getLifeStory() {
        return this.mLifeStory;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public String getReason() {
        return this.reason;
    }

    public i getViewUserList() {
        return this.viewUserList;
    }

    public boolean isRead() {
        return this.isRead;
    }

    public int getAwemeType() {
        if (this.mLifeStory != null) {
            return this.mLifeStory.awemeType;
        }
        return 0;
    }

    public String getStoryId() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82153, new Class[0], String.class)) {
            return this.mLifeStory.getStoryId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82153, new Class[0], String.class);
    }

    public void setCommentHasMore(d dVar) {
        this.commentHasMore = dVar;
    }

    public void setLifeStory(LifeStory lifeStory) {
        this.mLifeStory = lifeStory;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setRead(boolean z) {
        this.isRead = z;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setViewUserList(i iVar) {
        this.viewUserList = iVar;
    }
}
