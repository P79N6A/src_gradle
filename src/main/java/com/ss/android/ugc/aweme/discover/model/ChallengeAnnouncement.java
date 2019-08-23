package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class ChallengeAnnouncement implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("body")
    public String content;
    @SerializedName("title")
    public String title;

    public String getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
