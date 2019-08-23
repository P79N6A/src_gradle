package com.ss.android.ugc.aweme.music.model;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.discover.model.CategoryCoverStruct;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.hotsearch.b.a;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Music implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("album")
    public String album;
    @SerializedName("audio_track")
    public UrlModel audioTrack;
    @SerializedName("author")
    public String authorName;
    @SerializedName("avatar_thumb")
    public UrlModel avatarThumb;
    @SerializedName("billboard_rank")
    public int billboardRank;
    @SerializedName("music_billboard_type")
    public int billboardType;
    @SerializedName("bodydance_challenge")
    public Challenge bodyDanceChallenge;
    @SerializedName("bodydance_url")
    public UrlModel bodyDanceUrl;
    @Nullable
    @SerializedName("category_cover_info")
    public CategoryCoverStruct categoryCover;
    @SerializedName("challenge")
    public Challenge challenge;
    @SerializedName("challenge_name")
    public String challengeName;
    @SerializedName("cluster_id")
    public long clusterId;
    @SerializedName("collect_stat")
    public int collectStatus;
    @SerializedName("cover_hd")
    public UrlModel converHd;
    @SerializedName("cover_large")
    public UrlModel coverLarge;
    @SerializedName("cover_medium")
    public UrlModel coverMedium;
    @SerializedName("cover_thumb")
    public UrlModel coverThumb;
    @SerializedName("duration")
    public int duration;
    @SerializedName("effects_data")
    public UrlModel effectsData;
    @SerializedName("end_time")
    public int endTime;
    @SerializedName("extra")
    public String extra;
    @SerializedName("id")
    public long id;
    @SerializedName("author_deleted")
    public boolean isAuthorDeleted;
    @SerializedName("is_original")
    public boolean isOriginMusic;
    @SerializedName("lyric_type")
    public int lrcType;
    @SerializedName("lyric_url")
    public String lrcUrl;
    @SerializedName("external_song_info")
    public List<ExternalMusicInfo> mExternalMusicInfos;
    @SerializedName("id_str")
    public String mid;
    @SerializedName("title")
    public String musicName;
    @SerializedName("status")
    public int musicStatus;
    @SerializedName("offline_desc")
    public String offlineDesc;
    @SerializedName("owner_handle")
    public String ownerHandle;
    @SerializedName("owner_id")
    public String ownerId;
    @SerializedName("owner_nickname")
    public String ownerNickName;
    public String path;
    @SerializedName("play_url")
    public UrlModel playUrl;
    @SerializedName("position")
    public List<Position> positions;
    @SerializedName("prevent_download")
    public boolean preventDownload;
    @SerializedName("preview_start_time")
    public float previewStartTime;
    @SerializedName("redirect")
    public boolean redirect;
    @SerializedName("related_musics")
    public List<Music> relatedMusics = new ArrayList();
    public String requestId;
    @SerializedName("schema_url")
    public String schema;
    @SerializedName("sec_uid")
    public String secUid;
    @SerializedName("share_info")
    public ShareInfo shareInfo;
    @SerializedName("source_platform")
    public int source;
    @SerializedName("start_time")
    public int startTime;
    @Nullable
    @SerializedName("strong_beat_url")
    public UrlModel strongBeatUrl;
    @SerializedName("user_count")
    public int userCount;
    @SerializedName("music_billboard_weekly_info")
    public a weeklyBillInfo;

    public String getAlbum() {
        return this.album;
    }

    public UrlModel getAudioTrack() {
        return this.audioTrack;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public int getBillboardRank() {
        return this.billboardRank;
    }

    public int getBillboardType() {
        return this.billboardType;
    }

    public Challenge getBodyDanceChallenge() {
        return this.bodyDanceChallenge;
    }

    public UrlModel getBodyDanceUrl() {
        return this.bodyDanceUrl;
    }

    @Nullable
    public CategoryCoverStruct getCategoryCover() {
        return this.categoryCover;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public long getClusterId() {
        return this.clusterId;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public UrlModel getConverHd() {
        return this.converHd;
    }

    public UrlModel getCoverLarge() {
        return this.coverLarge;
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

    public UrlModel getEffectsData() {
        return this.effectsData;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public List<ExternalMusicInfo> getExternalMusicInfos() {
        return this.mExternalMusicInfos;
    }

    public String getExtra() {
        return this.extra;
    }

    public long getId() {
        return this.id;
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

    public String getMusicName() {
        return this.musicName;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getOwnerHandle() {
        return this.ownerHandle;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getOwnerNickName() {
        return this.ownerNickName;
    }

    public String getPath() {
        return this.path;
    }

    public UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public List<Position> getPositions() {
        return this.positions;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public List<Music> getRelatedMusics() {
        return this.relatedMusics;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public int getSource() {
        return this.source;
    }

    public int getStartTime() {
        return this.startTime;
    }

    @Nullable
    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public a getWeeklyBillInfo() {
        return this.weeklyBillInfo;
    }

    public boolean isAuthorDeleted() {
        return this.isAuthorDeleted;
    }

    public boolean isOriginMusic() {
        return this.isOriginMusic;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isRedirect() {
        return this.redirect;
    }

    public boolean isCollected() {
        if (this.collectStatus == 1) {
            return true;
        }
        return false;
    }

    public MusicModel convertToMusicModel() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 60008, new Class[0], MusicModel.class)) {
            return ct.f75697b.a(this);
        }
        return (MusicModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 60008, new Class[0], MusicModel.class);
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 60007, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 60007, new Class[0], Integer.TYPE)).intValue();
        }
        if (getMid() != null) {
            i = getMid().hashCode();
        }
        return i;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setAuthorDeleted(boolean z) {
        this.isAuthorDeleted = z;
    }

    public void setAuthorName(String str) {
        this.authorName = str;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public void setBillboardRank(int i) {
        this.billboardRank = i;
    }

    public void setBillboardType(int i) {
        this.billboardType = i;
    }

    public void setBodyDanceChallenge(Challenge challenge2) {
        this.bodyDanceChallenge = challenge2;
    }

    public void setBodyDanceUrl(UrlModel urlModel) {
        this.bodyDanceUrl = urlModel;
    }

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setClusterId(long j) {
        this.clusterId = j;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setConverHd(UrlModel urlModel) {
        this.converHd = urlModel;
    }

    public void setCoverLarge(UrlModel urlModel) {
        this.coverLarge = urlModel;
    }

    public void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public Music setEffectsData(UrlModel urlModel) {
        this.effectsData = urlModel;
        return this;
    }

    public void setEndTime(int i) {
        this.endTime = i;
    }

    public void setExternalMusicInfos(List<ExternalMusicInfo> list) {
        this.mExternalMusicInfos = list;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setLrcType(int i) {
        this.lrcType = i;
    }

    public void setLrcUrl(String str) {
        this.lrcUrl = str;
    }

    public void setMid(String str) {
        this.mid = str;
    }

    public void setMusicName(String str) {
        this.musicName = str;
    }

    public void setMusicStatus(int i) {
        this.musicStatus = i;
    }

    public void setOfflineDesc(String str) {
        this.offlineDesc = str;
    }

    public void setOriginMusic(boolean z) {
        this.isOriginMusic = z;
    }

    public void setOwnerHandle(String str) {
        this.ownerHandle = str;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setOwnerNickName(String str) {
        this.ownerNickName = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPlayUrl(UrlModel urlModel) {
        this.playUrl = urlModel;
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

    public void setRelatedMusics(List<Music> list) {
        this.relatedMusics = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setStartTime(int i) {
        this.startTime = i;
    }

    public void setStrongBeatUrl(@Nullable UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setWeeklyBillInfo(a aVar) {
        this.weeklyBillInfo = aVar;
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, changeQuickRedirect, false, 60006, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, changeQuickRedirect, false, 60006, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (!(obj2 instanceof Music)) {
            return false;
        } else {
            return TextUtils.equals(((Music) obj2).getMid(), getMid());
        }
    }
}
