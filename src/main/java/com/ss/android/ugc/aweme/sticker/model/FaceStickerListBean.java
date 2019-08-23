package com.ss.android.ugc.aweme.sticker.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.Required;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

@Keep
public class FaceStickerListBean extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cover_icon_url")
    UrlModel coverIconUrl;
    @SerializedName("cover_mark_url")
    UrlModel coverMarkUrl;
    @SerializedName("stickers")
    @Required
    List<FaceStickerBean> stickers;

    public UrlModel getCoverIconUrl() {
        return this.coverIconUrl;
    }

    public UrlModel getCoverMarkUrl() {
        return this.coverMarkUrl;
    }

    public List<FaceStickerBean> getStickers() {
        return this.stickers;
    }

    public void setCoverIconUrl(UrlModel urlModel) {
        this.coverIconUrl = urlModel;
    }

    public void setCoverMarkUrl(UrlModel urlModel) {
        this.coverMarkUrl = urlModel;
    }

    public void setStickers(List<FaceStickerBean> list) {
        this.stickers = list;
    }
}
