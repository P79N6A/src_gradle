package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class AwemeStarAtlas implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("review_status")
    public int reviewStatus;

    public int getReviewStatus() {
        return this.reviewStatus;
    }

    public void setReviewStatus(int i) {
        this.reviewStatus = i;
    }
}
