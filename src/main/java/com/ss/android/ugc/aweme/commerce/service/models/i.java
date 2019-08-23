package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class i implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("category")
    private String category;
    @SerializedName("h5_url")
    private String h5Url;
    @SerializedName("promotion_image")
    private UrlModel promotionImage;
    @SerializedName("promotion_title")
    private String promotionTitle;
    @SerializedName("title")
    private String title;

    public String getCategory() {
        return this.category;
    }

    public String getH5Url() {
        return this.h5Url;
    }

    public UrlModel getPromotionImage() {
        return this.promotionImage;
    }

    public String getPromotionTitle() {
        return this.promotionTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setH5Url(String str) {
        this.h5Url = str;
    }

    public void setPromotionImage(UrlModel urlModel) {
        this.promotionImage = urlModel;
    }

    public void setPromotionTitle(String str) {
        this.promotionTitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
