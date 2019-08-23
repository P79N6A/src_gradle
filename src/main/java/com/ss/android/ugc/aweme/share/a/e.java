package com.ss.android.ugc.aweme.share.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.coupon.model.c;
import java.io.Serializable;

public final class e implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("author_username")
    private String authorUserName;
    @SerializedName("coupon_info")
    public c couponInfo;
    @SerializedName("follow_status")
    private int followStatus;
    @SerializedName("forward_username")
    private String forwardUserName;
    @SerializedName("goods_name")
    private String goodsName = "";
    @SerializedName("live_username")
    private String liveUserName = "";
    @SerializedName("music_title")
    private String musicTitle = "";
    @SerializedName("user_nickname")
    private String nickName = "";
    @SerializedName("poi_name")
    private String poiName = "";
    @SerializedName("sticker_name")
    private String stickerName;
    @SerializedName("challenge")
    private b transChallenge;
    @SerializedName("avatar_url")
    private UrlModel userAvartar;
    @SerializedName("video")
    private c video;

    public final String getAuthorUserName() {
        return this.authorUserName;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final String getForwardUserName() {
        return this.forwardUserName;
    }

    public final String getGoodsName() {
        return this.goodsName;
    }

    public final String getLiveUserName() {
        return this.liveUserName;
    }

    public final String getMusicTitle() {
        return this.musicTitle;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getPoiName() {
        return this.poiName;
    }

    public final String getStickerName() {
        return this.stickerName;
    }

    public final b getTransChallenge() {
        return this.transChallenge;
    }

    public final UrlModel getUserAvartar() {
        return this.userAvartar;
    }

    public final c getVideo() {
        return this.video;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setGoodsName(String str) {
        this.goodsName = str;
    }

    public final void setLiveUserName(String str) {
        this.liveUserName = str;
    }

    public final void setMusicTitle(String str) {
        this.musicTitle = str;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setPoiName(String str) {
        this.poiName = str;
    }

    public final void setTransChallenge(b bVar) {
        this.transChallenge = bVar;
    }

    public final void setVideo(c cVar) {
        this.video = cVar;
    }
}
