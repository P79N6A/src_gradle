package com.ss.android.ugc.aweme.festival.christmas.c;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class m implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avatar")
    private UrlModel userAvatarUrl;
    @SerializedName("cover")
    private UrlModel videoCoverUrl;

    public final UrlModel getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    public final UrlModel getVideoCoverUrl() {
        return this.videoCoverUrl;
    }

    public final void setUserAvatarUrl(UrlModel urlModel) {
        this.userAvatarUrl = urlModel;
    }

    public final void setVideoCoverUrl(UrlModel urlModel) {
        this.videoCoverUrl = urlModel;
    }
}
