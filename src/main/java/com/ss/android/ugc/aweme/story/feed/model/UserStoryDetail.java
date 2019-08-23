package com.ss.android.ugc.aweme.story.feed.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.c;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import java.io.Serializable;

@Keep
public class UserStoryDetail extends c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("log_pb")
    LogPbBean logPb;
    @SerializedName("user_story")
    UserStory mUserStory;

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public UserStory getUserStory() {
        return this.mUserStory;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setUserStory(UserStory userStory) {
        this.mUserStory = userStory;
    }
}
