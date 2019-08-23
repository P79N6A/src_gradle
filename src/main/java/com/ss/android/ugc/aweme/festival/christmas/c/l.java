package com.ss.android.ugc.aweme.festival.christmas.c;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public final class l implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("after")
    private d afterActionContent;
    @SerializedName("feedback")
    private d feedback;
    @SerializedName("image")
    public m image;
    @SerializedName("link")
    private d link;
    @SerializedName("title")
    private d title;

    public final d getAfterActionContent() {
        return this.afterActionContent;
    }

    public final d getFeedback() {
        return this.feedback;
    }

    public final m getImage() {
        return this.image;
    }

    public final d getLink() {
        return this.link;
    }

    public final d getTitle() {
        return this.title;
    }

    public final void setAfterActionContent(d dVar) {
        this.afterActionContent = dVar;
    }

    public final void setFeedback(d dVar) {
        this.feedback = dVar;
    }

    public final void setImage(m mVar) {
        this.image = mVar;
    }

    public final void setLink(d dVar) {
        this.link = dVar;
    }

    public final void setTitle(d dVar) {
        this.title = dVar;
    }
}
