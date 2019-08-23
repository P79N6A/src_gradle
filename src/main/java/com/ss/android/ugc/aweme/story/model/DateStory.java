package com.ss.android.ugc.aweme.story.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

@Keep
public class DateStory {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme_list")
    List<Aweme> awemeList;
    @SerializedName("story_date")
    long storyDate;

    public List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public long getStoryDate() {
        return this.storyDate;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84796, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84796, new Class[0], String.class);
        }
        return "DateStory{storyDate=" + this.storyDate + ", awemeList=" + this.awemeList + '}';
    }

    public void setAwemeList(List<Aweme> list) {
        this.awemeList = list;
    }

    public void setStoryDate(long j) {
        this.storyDate = j;
    }
}
