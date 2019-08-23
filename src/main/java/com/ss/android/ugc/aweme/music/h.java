package com.ss.android.ugc.aweme.music;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class h implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("digg_count")
    public int diggCount;
    @SerializedName("music_count")
    public int musicCount;
    @SerializedName("music_cover_url")
    public UrlModel musicCoverUrl;
    @SerializedName("music_qrcode_url")
    public UrlModel musicQrcodeUrl;
    @SerializedName("music_used_count")
    public int musicUseCount;

    public int getDiggCount() {
        return this.diggCount;
    }

    public int getMusicCount() {
        return this.musicCount;
    }

    public UrlModel getMusicCoverUrl() {
        return this.musicCoverUrl;
    }

    public UrlModel getMusicQrcodeUrl() {
        return this.musicQrcodeUrl;
    }

    public int getMusicUseCount() {
        return this.musicUseCount;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setMusicCount(int i) {
        this.musicCount = i;
    }

    public void setMusicCoverUrl(UrlModel urlModel) {
        this.musicCoverUrl = urlModel;
    }

    public void setMusicQrcodeUrl(UrlModel urlModel) {
        this.musicQrcodeUrl = urlModel;
    }

    public void setMusicUseCount(int i) {
        this.musicUseCount = i;
    }
}
