package com.ss.android.ugc.aweme.sticker.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_owner_id")
    public String adOwnerId;
    @SerializedName("ad_owner_name")
    public String adOwnerName;
    @SerializedName("challenge_id")
    public String challengeId;
    @SerializedName("unlock_info")
    public b commerceStickerUnlockInfo;
    @SerializedName("detail_desc")
    public String detailDesc;
    @SerializedName("detail_letters")
    public String detailLetters;
    @SerializedName("detail_open_url")
    public String detailOpenUrl;
    @SerializedName("detail_web_url")
    public String detailWebUrl;
    @SerializedName("detail_web_url_title")
    public String detailWebUrlTitle;
    @SerializedName("expire_time")
    public long expireTime;
    @SerializedName("id")
    public String id;
    @SerializedName("music_id")
    public String musicId;
    @SerializedName("screen_desc")
    public String screenDesc;
    @SerializedName("screen_icon")
    public UrlModel screenIcon;

    public String getAdOwnerId() {
        return this.adOwnerId;
    }

    public String getAdOwnerName() {
        return this.adOwnerName;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public b getCommerceStickerUnlockInfo() {
        return this.commerceStickerUnlockInfo;
    }

    public String getDetailDesc() {
        return this.detailDesc;
    }

    public String getDetailLetters() {
        return this.detailLetters;
    }

    public String getDetailOpenUrl() {
        return this.detailOpenUrl;
    }

    public String getDetailWebUrl() {
        return this.detailWebUrl;
    }

    public String getDetailWebUrlTitle() {
        return this.detailWebUrlTitle;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public String getId() {
        return this.id;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getScreenDesc() {
        return this.screenDesc;
    }

    public UrlModel getScreenIcon() {
        return this.screenIcon;
    }

    public void setAdOwnerId(String str) {
        this.adOwnerId = str;
    }

    public void setAdOwnerName(String str) {
        this.adOwnerName = str;
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setCommerceStickerUnlockInfo(b bVar) {
        this.commerceStickerUnlockInfo = bVar;
    }

    public void setDetailDesc(String str) {
        this.detailDesc = str;
    }

    public void setDetailLetters(String str) {
        this.detailLetters = str;
    }

    public void setDetailOpenUrl(String str) {
        this.detailOpenUrl = str;
    }

    public void setDetailWebUrl(String str) {
        this.detailWebUrl = str;
    }

    public void setDetailWebUrlTitle(String str) {
        this.detailWebUrlTitle = str;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setScreenDesc(String str) {
        this.screenDesc = str;
    }

    public void setScreenIcon(UrlModel urlModel) {
        this.screenIcon = urlModel;
    }
}
