package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class AwemeLabelModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("label_type")
    public int labelType;
    @SerializedName("label_url")
    public UrlModel urlModels;

    public AwemeLabelModel() {
    }

    public int getLabelType() {
        return this.labelType;
    }

    public UrlModel getUrlModels() {
        return this.urlModels;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setUrlModels(UrlModel urlModel) {
        this.urlModels = urlModel;
    }

    public AwemeLabelModel(UrlModel urlModel, int i) {
        this.urlModels = urlModel;
        this.labelType = i;
    }
}
