package com.ss.android.ugc.aweme.festival.christmas.c;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public final class d implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("text")
    private String content;
    @SerializedName("href")
    private String href;

    public final String getContent() {
        return this.content;
    }

    public final String getHref() {
        return this.href;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setHref(String str) {
        this.href = str;
    }
}
