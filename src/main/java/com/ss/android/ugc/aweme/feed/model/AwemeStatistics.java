package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class AwemeStatistics implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aid")
    public String aid;
    @SerializedName("comment_count")
    public int commentCount;
    @SerializedName("digg_count")
    public int diggCount;
    @SerializedName("download_count")
    public int downloadCount;
    @SerializedName("forward_count")
    public int forwardCount;
    @SerializedName("play_count")
    public int playCount;
    @SerializedName("share_count")
    public int shareCount;

    public String getAid() {
        return this.aid;
    }

    public int getCommentCount() {
        return this.commentCount;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public int getDownloadCount() {
        return this.downloadCount;
    }

    public int getForwardCount() {
        return this.forwardCount;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public int getShareCount() {
        return this.shareCount;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41442, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41442, new Class[0], String.class);
        }
        return "AwemeStatistics{aid='" + this.aid + '\'' + ", comemntCount=" + this.commentCount + ", diggCount=" + this.diggCount + ", playCount=" + this.playCount + ", shareCount=" + this.shareCount + ", forwardCount=" + this.forwardCount + '}';
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCommentCount(int i) {
        this.commentCount = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setForwardCount(int i) {
        this.forwardCount = i;
    }

    public void setPlayCount(int i) {
        this.playCount = i;
    }

    public void setShareCount(int i) {
        this.shareCount = i;
    }
}
