package com.ss.android.ugc.aweme.share.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public final class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("author_name")
    private String authorName;
    @SerializedName("cha_name")
    private String chaName;

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getChaName() {
        return this.chaName;
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setChaName(String str) {
        this.chaName = str;
    }
}
