package com.ss.android.ugc.aweme.festival.christmas.c;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public final class f implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("post")
    private int postLeftCount;
    @SerializedName("share")
    private int shareLeftCount;

    public final int getPostLeftCount() {
        return this.postLeftCount;
    }

    public final int getShareLeftCount() {
        return this.shareLeftCount;
    }

    public final void setPostLeftCount(int i) {
        this.postLeftCount = i;
    }

    public final void setShareLeftCount(int i) {
        this.shareLeftCount = i;
    }
}
