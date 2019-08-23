package com.ss.android.ugc.aweme.shortvideo;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ao.a.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class e implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("album")
    public String album;
    @SerializedName("audio_track")
    public UrlModel audioTrack;
    @SerializedName("author")
    public String authorName;
    @SerializedName("challenge")
    public c challenge;
    private int comeFromForMod;
    @SerializedName("cover_hd")
    public UrlModel coverHd;
    @SerializedName("cover_large")
    public UrlModel coverLarge;
    @SerializedName("cover_medium")
    public UrlModel coverMedium;
    @SerializedName("cover_thumb")
    public UrlModel coverThumb;
    @SerializedName("duration")
    public int duration;
    @SerializedName("extra")
    public String extra;
    @SerializedName("id")
    public long id;
    @SerializedName("is_mv_theme_music")
    private boolean isMvThemeMusic;
    private b logPb;
    @Nullable
    @SerializedName("lyric_type")
    private int lrcType;
    @Nullable
    @SerializedName("lyric_url")
    private String lrcUrl;
    @SerializedName("id_str")
    public String mid;
    @SerializedName("title")
    public String musicName;
    @SerializedName("status")
    public int musicStatus;
    @SerializedName("music_type")
    public int musicType;
    @SerializedName("music_wave_data")
    private float[] musicWaveData;
    @SerializedName("offline_desc")
    public String offlineDesc;
    @SerializedName("path")
    public String path;
    @SerializedName("play_url")
    public UrlModel playUrl;
    @SerializedName("prevent_download")
    private boolean preventDownload;
    @Nullable
    @SerializedName("preview_start_time")
    private float previewStartTime;
    private boolean redirect;
    private String searchKeyWords;
    private String songId;
    @SerializedName("source_platform")
    public int source;
    @Nullable
    @SerializedName("strong_beat_url")
    public UrlModel strongBeatUrl;

    public String getAlbum() {
        return this.album;
    }

    public int getComeFromForMod() {
        return this.comeFromForMod;
    }

    public UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public int getDuration() {
        return this.duration;
    }

    public long getId() {
        return this.id;
    }

    public b getLogPb() {
        return this.logPb;
    }

    public int getLrcType() {
        return this.lrcType;
    }

    public String getLrcUrl() {
        return this.lrcUrl;
    }

    public String getMid() {
        return this.mid;
    }

    public String getMusicId() {
        return this.mid;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public int getMusicType() {
        return this.musicType;
    }

    public float[] getMusicWaveData() {
        return this.musicWaveData;
    }

    public String getName() {
        return this.musicName;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getPath() {
        return this.path;
    }

    public UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public String getSearchKeyWords() {
        return this.searchKeyWords;
    }

    public String getSinger() {
        return this.authorName;
    }

    public String getSongId() {
        return this.songId;
    }

    @Nullable
    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public boolean isMvThemeMusic() {
        return this.isMvThemeMusic;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isRedirect() {
        return this.redirect;
    }

    public String getPicBig() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73899, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73899, new Class[0], String.class);
        } else if (this.coverLarge == null || this.coverLarge.getUrlList() == null || this.coverLarge.getUrlList().isEmpty()) {
            return null;
        } else {
            return this.coverLarge.getUrlList().get(0);
        }
    }

    public String getPicMedium() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73900, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73900, new Class[0], String.class);
        } else if (this.coverMedium == null || this.coverMedium.getUrlList() == null || this.coverMedium.getUrlList().isEmpty()) {
            return null;
        } else {
            return this.coverMedium.getUrlList().get(0);
        }
    }

    public String getPicSmall() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73898, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73898, new Class[0], String.class);
        } else if (this.coverThumb == null || this.coverThumb.getUrlList() == null || this.coverThumb.getUrlList().isEmpty()) {
            return null;
        } else {
            return this.coverThumb.getUrlList().get(0);
        }
    }

    public void setComeFromForMod(int i) {
        this.comeFromForMod = i;
    }

    public void setLogPb(b bVar) {
        this.logPb = bVar;
    }

    public void setLrcType(int i) {
        this.lrcType = i;
    }

    public void setLrcUrl(String str) {
        this.lrcUrl = str;
    }

    public void setMusicId(String str) {
        this.mid = str;
    }

    public void setMusicWaveData(float[] fArr) {
        this.musicWaveData = fArr;
    }

    public void setMvThemeMusic(boolean z) {
        this.isMvThemeMusic = z;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPreviewStartTime(float f2) {
        this.previewStartTime = f2;
    }

    public void setRedirect(boolean z) {
        this.redirect = z;
    }

    public void setSearchKeyWords(String str) {
        this.searchKeyWords = str;
    }

    public void setSongId(String str) {
        this.songId = str;
    }

    public void setStrongBeatUrl(@Nullable UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }
}
