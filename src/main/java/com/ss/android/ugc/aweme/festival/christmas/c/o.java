package com.ss.android.ugc.aweme.festival.christmas.c;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class o implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("feedback")
    private d feedback;
    @SerializedName("image")
    private UrlModel imageUrl;
    @SerializedName("title")
    private d title;
    @SerializedName("warning")
    private String warning;

    public final d getFeedback() {
        return this.feedback;
    }

    public final UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public final d getTitle() {
        return this.title;
    }

    public final String getWarning() {
        return this.warning;
    }

    public final void setFeedback(d dVar) {
        this.feedback = dVar;
    }

    public final void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public final void setTitle(d dVar) {
        this.title = dVar;
    }

    public final void setWarning(String str) {
        this.warning = str;
    }
}
