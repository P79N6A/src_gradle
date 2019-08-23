package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;

@Keep
public class VideoUpdateTipsContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("tip_aid")
    String aid;
    @SerializedName("tip_content")
    String content;
    @SerializedName("tip_cover")
    UrlModel cover;
    @SerializedName("is_photo")
    boolean isPhoto;
    @SerializedName("tip_title")
    String title;
    @SerializedName("tip_uid")
    String uid;

    public String getAid() {
        return this.aid;
    }

    public String getContent() {
        return this.content;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isPhoto() {
        return this.isPhoto;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setPhoto(boolean z) {
        this.isPhoto = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
