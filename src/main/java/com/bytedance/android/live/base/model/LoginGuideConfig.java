package com.bytedance.android.live.base.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class LoginGuideConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("from_comment")
    private String fromComment;
    @SerializedName("from_default")
    private String fromDefault;
    @SerializedName("from_favorite")
    private String fromFavorite;
    @SerializedName("from_follow")
    private String fromFollow;
    @SerializedName("from_home_upper_right")
    private String fromHomeUpperRight;
    @SerializedName("image_url_from_comment")
    private String imageUrlFromComment;
    @SerializedName("image_url_from_default")
    private String imageUrlFromDefault;
    @SerializedName("image_url_from_favorite")
    private String imageUrlFromFavorite;
    @SerializedName("image_url_from_follow")
    private String imageUrlFromFollow;
    @SerializedName("image_url_from_home_upper_right")
    private String imageUrlFromHomeUpperRight;

    public String getFromComment() {
        return this.fromComment;
    }

    public String getFromDefault() {
        return this.fromDefault;
    }

    public String getFromFavorite() {
        return this.fromFavorite;
    }

    public String getFromFollow() {
        return this.fromFollow;
    }

    public String getFromHomeUpperRight() {
        return this.fromHomeUpperRight;
    }

    public String getImageUrlFromComment() {
        return this.imageUrlFromComment;
    }

    public String getImageUrlFromDefault() {
        return this.imageUrlFromDefault;
    }

    public String getImageUrlFromFavorite() {
        return this.imageUrlFromFavorite;
    }

    public String getImageUrlFromFollow() {
        return this.imageUrlFromFollow;
    }

    public String getImageUrlFromHomeUpperRight() {
        return this.imageUrlFromHomeUpperRight;
    }

    public void setFromComment(String str) {
        this.fromComment = str;
    }

    public void setFromDefault(String str) {
        this.fromDefault = str;
    }

    public void setFromFavorite(String str) {
        this.fromFavorite = str;
    }

    public void setFromFollow(String str) {
        this.fromFollow = str;
    }

    public void setFromHomeUpperRight(String str) {
        this.fromHomeUpperRight = str;
    }

    public void setImageUrlFromComment(String str) {
        this.imageUrlFromComment = str;
    }

    public void setImageUrlFromDefault(String str) {
        this.imageUrlFromDefault = str;
    }

    public void setImageUrlFromFavorite(String str) {
        this.imageUrlFromFavorite = str;
    }

    public void setImageUrlFromFollow(String str) {
        this.imageUrlFromFollow = str;
    }

    public void setImageUrlFromHomeUpperRight(String str) {
        this.imageUrlFromHomeUpperRight = str;
    }
}
