package com.ss.android.ugc.aweme.feed.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

@Keep
public class ImageInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("height")
    public int height;
    @SerializedName("label_large")
    public UrlModel labelLarge;
    @SerializedName("label_thumb")
    public UrlModel labelThumb;
    @SerializedName("width")
    public int width;

    public int getHeight() {
        return this.height;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
