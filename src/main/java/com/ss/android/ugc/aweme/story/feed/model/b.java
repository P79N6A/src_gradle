package com.ss.android.ugc.aweme.story.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.c;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import java.io.Serializable;

public class b extends c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("log_pb")
    LogPbBean mLogPbBean;
    @SerializedName("user_story")
    UserStory mUserStory;

    public LogPbBean getLogPbBean() {
        return this.mLogPbBean;
    }

    public UserStory getUserStory() {
        return this.mUserStory;
    }

    public void setLogPbBean(LogPbBean logPbBean) {
        this.mLogPbBean = logPbBean;
    }

    public void setUserStory(UserStory userStory) {
        this.mUserStory = userStory;
    }
}
