package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.newfollow.e.b;
import java.io.Serializable;
import java.util.List;

public class o extends b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avatar")
    public UrlModel avatar;
    private String commentId;
    @SerializedName("content")
    public String content;
    @SerializedName("cost")
    public double cost;
    @SerializedName("date")
    public String date;
    public boolean expand;
    private boolean hasDivider;
    @SerializedName("images")
    public List<UrlModel> imageList;
    @SerializedName("nickname")
    public String nickname;
    private String poiId;
    @SerializedName("rating")
    public double rating;
    @SerializedName("src")
    public String src;
    @SerializedName("url")
    public String url;

    public int getFeedType() {
        return 65442;
    }

    public void setFeedType(int i) {
    }

    public String getCommentId() {
        return this.commentId;
    }

    public List<UrlModel> getImages() {
        return this.imageList;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public boolean hasDivider() {
        return this.hasDivider;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setHasDivider(boolean z) {
        this.hasDivider = z;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }
}
