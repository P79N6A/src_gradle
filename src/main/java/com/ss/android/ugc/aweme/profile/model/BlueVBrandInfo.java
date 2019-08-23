package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class BlueVBrandInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("brand_id")
    public int brandId;
    @SerializedName("brand_name")
    public String brandName;
    @SerializedName("category_id")
    public int categoryId;
    @SerializedName("category_name")
    public String categoryName;
    @SerializedName("heat")
    public long heat;
    @SerializedName("logo_url")
    public UrlModel logoUrl;
    @SerializedName("rank")
    public int rank;
    @SerializedName("rank_diff")
    public int rankDiff;
    @SerializedName("tag_name")
    public String tagName;

    public int getBrandId() {
        return this.brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public long getHeat() {
        return this.heat;
    }

    public UrlModel getLogoUrl() {
        return this.logoUrl;
    }

    public int getRank() {
        return this.rank;
    }

    public int getRankDiff() {
        return this.rankDiff;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setBrandId(int i) {
        this.brandId = i;
    }

    public void setBrandName(String str) {
        this.brandName = str;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setHeat(long j) {
        this.heat = j;
    }

    public void setLogoUrl(UrlModel urlModel) {
        this.logoUrl = urlModel;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setRankDiff(int i) {
        this.rankDiff = i;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }
}
