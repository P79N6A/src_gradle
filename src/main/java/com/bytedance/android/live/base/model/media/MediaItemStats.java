package com.bytedance.android.live.base.model.media;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class MediaItemStats {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("comment_count")
    private int commentCount;
    @SerializedName("digg_count")
    private int diggCount;
    @SerializedName("id")
    private long id;
    @SerializedName("play_count")
    private int playCount;
    @SerializedName("share_count")
    private int shareCount;

    public int getCommentCount() {
        return this.commentCount;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public long getId() {
        return this.id;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public int getShareCount() {
        return this.shareCount;
    }

    public void setCommentCount(int i) {
        this.commentCount = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setPlayCount(int i) {
        this.playCount = i;
    }

    public void setShareCount(int i) {
        this.shareCount = i;
    }
}
