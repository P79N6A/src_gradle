package com.ss.android.ugc.aweme.story.api.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

public class e implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("date")
    long date;
    @SerializedName("story_list")
    List<b> storyList;

    public long getDate() {
        return this.date;
    }

    public List<b> getStoryList() {
        return this.storyList;
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setStoryList(List<b> list) {
        this.storyList = list;
    }
}
