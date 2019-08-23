package com.ss.android.ugc.aweme.story.api.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class IdWithScoreStruct {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("create_time")
    long createTime;
    @SerializedName("story_id")
    String stroyId;

    public long getCreateTime() {
        return this.createTime;
    }

    public String getStroyId() {
        return this.stroyId;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setStroyId(String str) {
        this.stroyId = str;
    }
}
