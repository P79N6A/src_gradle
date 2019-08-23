package com.ss.android.ugc.aweme.commercialize.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class k implements Serializable {
    @SerializedName("feature_lable")
    public String featureLabel;
    @SerializedName("feedback_rate")
    public int feedbackRate = -1;
    @SerializedName("image")
    public UrlModel image;
    @SerializedName("image_url")
    public String imageUrl;
    @SerializedName("origin_price")
    public String originPrice;
    @SerializedName("prompt_text")
    public String service;
    @SerializedName("title")
    public String title;
}
