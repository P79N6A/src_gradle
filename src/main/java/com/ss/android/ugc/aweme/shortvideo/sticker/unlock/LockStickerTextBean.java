package com.ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class LockStickerTextBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_id")
    String activityId;
    @SerializedName("bubble_hint")
    String bubbleHint;
    @SerializedName("content")
    String content;
    @SerializedName("share_desc")
    String shareDesc;
    @SerializedName("share_url")
    String shareUrl;
    @SerializedName("title")
    String title;

    public String getActivityId() {
        return this.activityId;
    }

    public String getBubbleHint() {
        return this.bubbleHint;
    }

    public String getContent() {
        return this.content;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public void setBubbleHint(String str) {
        this.bubbleHint = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
