package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class AwemeControl implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("can_comment")
    public boolean canComment = true;
    @SerializedName("can_forward")
    public boolean canForward = true;
    @SerializedName("can_share")
    public boolean canShare = true;
    @SerializedName("can_show_comment")
    public boolean canShowComment = true;

    public boolean canComment() {
        return this.canComment;
    }

    public boolean canForward() {
        return this.canForward;
    }

    public boolean canShare() {
        return this.canShare;
    }

    public boolean canShowComment() {
        return this.canShowComment;
    }

    public void setCanComment(boolean z) {
        this.canComment = z;
    }

    public void setCanForward(boolean z) {
        this.canForward = z;
    }

    public void setCanShare(boolean z) {
        this.canShare = z;
    }

    public void setCanShowComment(boolean z) {
        this.canShowComment = z;
    }
}
