package com.ss.android.ugc.aweme.share.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("author_name")
    private String authorName;
    @SerializedName("aweme_id")
    private String awemeId;
    @SerializedName("cover")
    private UrlModel cover;
    @SerializedName("desc")
    private String desc;

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }
}
