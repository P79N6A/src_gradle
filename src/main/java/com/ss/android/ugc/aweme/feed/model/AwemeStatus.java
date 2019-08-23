package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AwemeStatus implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aid")
    public String aid;
    @SerializedName("allow_comment")
    public boolean allowComment;
    @SerializedName("allow_share")
    public boolean allowShare;
    @SerializedName("download_status")
    public int downloadStatus;
    @SerializedName("in_reviewing")
    public boolean inReviewing;
    @SerializedName("is_delete")
    public boolean isDelete;
    @SerializedName("is_prohibited")
    public boolean isProhibited;
    @SerializedName("private_status")
    public int privateStatus;
    @SerializedName("reviewed")
    public int reviewed;
    @SerializedName("self_see")
    public boolean selfSee;
    @SerializedName("show_good_delay_time")
    public int showGoodDelayTime = 2000;
    @SerializedName("with_fusion_goods")
    public boolean withFusionGoods;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DownloadStatus {
    }

    public String getAid() {
        return this.aid;
    }

    public int getDownloadStatus() {
        return this.downloadStatus;
    }

    public int getPrivateStatus() {
        return this.privateStatus;
    }

    public int getShowGoodDelayTime() {
        return this.showGoodDelayTime;
    }

    public boolean isAllowComment() {
        return this.allowComment;
    }

    public boolean isAllowShare() {
        return this.allowShare;
    }

    public boolean isDelete() {
        return this.isDelete;
    }

    public boolean isInReviewing() {
        return this.inReviewing;
    }

    public boolean isProhibited() {
        return this.isProhibited;
    }

    public boolean isSelfSee() {
        return this.selfSee;
    }

    public boolean isWithGoods() {
        return this.withFusionGoods;
    }

    @Deprecated
    public boolean isPrivate() {
        if (this.privateStatus == 1) {
            return true;
        }
        return false;
    }

    public boolean isReviewed() {
        if (this.reviewed == 1) {
            return true;
        }
        return false;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAllowComment(boolean z) {
        this.allowComment = z;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setDelete(boolean z) {
        this.isDelete = z;
    }

    public void setDownloadStatus(int i) {
        this.downloadStatus = i;
    }

    public void setInReviewing(boolean z) {
        this.inReviewing = z;
    }

    public void setPrivateStatus(int i) {
        this.privateStatus = i;
    }

    public void setProhibited(boolean z) {
        this.isProhibited = z;
    }

    public void setSelfSee(boolean z) {
        this.selfSee = z;
    }

    public void setWithGoods(boolean z) {
        this.withFusionGoods = z;
    }

    @Deprecated
    public void setPrivate(boolean z) {
        if (z) {
            this.privateStatus = 1;
        } else {
            this.privateStatus = 0;
        }
    }
}
