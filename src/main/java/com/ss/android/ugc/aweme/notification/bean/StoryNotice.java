package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import java.util.List;

@Keep
public class StoryNotice {
    @SerializedName("comment")
    public Comment comment;
    @SerializedName("content")
    public String content;
    @SerializedName("is_expired")
    public boolean isExpired;
    @SerializedName("story")
    public LifeStory lifeStory;
    @SerializedName("merge_count")
    public int mergeCount;
    @SerializedName("from_user")
    public List<User> users;
}
