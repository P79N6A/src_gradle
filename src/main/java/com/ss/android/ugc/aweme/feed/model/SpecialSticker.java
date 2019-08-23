package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class SpecialSticker implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("icon_url")
    public UrlModel iconUrl;
    @SerializedName("link")
    public String linkUrl;
    @SerializedName("open_url")
    public String openUrl;
    @SerializedName("sticker_id")
    public String stickerId;
    @SerializedName("sticker_type")
    public int stickerType;
    @SerializedName("title")
    public String title;

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerType() {
        return this.stickerType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerType(int i) {
        this.stickerType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
