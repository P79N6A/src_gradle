package com.ss.android.ugc.aweme.shortvideo.model;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.adapter.type.d;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.ct;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public class MusicModel implements d, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8201137807648519242L;
    private String album;
    private String allRate;
    private int billboardRank;
    private int challengeUserCount;
    private CollectionType collectionType;
    private int comeFromForMod;
    public int dataType;
    private int duration;
    private String extra;
    private long id;
    private boolean isChallengeMusic;
    private boolean isMvThemeMusic;
    private boolean isOriginal;
    private String localMusicDuration;
    private LogPbBean logPb;
    private int lrcType;
    private String lrcUrl;
    private Music music;
    private String musicEffectsUrl;
    private String musicId;
    private int musicStatus;
    MusicType musicType;
    private MusicWaveBean musicWaveBean;
    private String name;
    private String offlineDesc;
    private String path;
    private String picBig;
    private String picHuge;
    private String picPremium;
    private String picSmall;
    private boolean preventDownload;
    private float previewStartTime;
    private boolean redirect;
    private String searchKeyWords;
    private boolean showDetail;
    private String singer;
    private String songId;
    private int sourcePlatform;
    private UrlModel strongBeatUrl;
    private int userCount;

    public enum CollectionType {
        NOT_COLLECTED,
        COLLECTED;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public enum MusicType {
        LOCAL,
        ONLINE,
        BAIDU;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public String getAlbum() {
        return this.album;
    }

    public String getAllRate() {
        return this.allRate;
    }

    public int getBillboardRank() {
        return this.billboardRank;
    }

    public int getChallengeUserCount() {
        return this.challengeUserCount;
    }

    public int getComeFromForMod() {
        return this.comeFromForMod;
    }

    public int getDataType() {
        return this.dataType;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getExtra() {
        return this.extra;
    }

    public long getId() {
        return this.id;
    }

    public String getLocalMusicDuration() {
        return this.localMusicDuration;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public int getLrcType() {
        return this.lrcType;
    }

    public String getLrcUrl() {
        return this.lrcUrl;
    }

    public Music getMusic() {
        return this.music;
    }

    public String getMusicEffects() {
        return this.musicEffectsUrl;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public MusicType getMusicType() {
        return this.musicType;
    }

    public MusicWaveBean getMusicWaveBean() {
        return this.musicWaveBean;
    }

    public String getName() {
        return this.name;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getPath() {
        return this.path;
    }

    public String getPicBig() {
        return this.picBig;
    }

    public String getPicHuge() {
        return this.picHuge;
    }

    public String getPicPremium() {
        return this.picPremium;
    }

    public String getPicSmall() {
        return this.picSmall;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public String getSearchKeyWords() {
        return this.searchKeyWords;
    }

    public String getSinger() {
        return this.singer;
    }

    public String getSongId() {
        return this.songId;
    }

    public int getSourcePlatform() {
        return this.sourcePlatform;
    }

    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public boolean isChallengeMusic() {
        return this.isChallengeMusic;
    }

    public boolean isMvThemeMusic() {
        return this.isMvThemeMusic;
    }

    public boolean isOriginal() {
        return this.isOriginal;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isRedirect() {
        return this.redirect;
    }

    public CollectionType getCollectionType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77639, new Class[0], CollectionType.class)) {
            return (CollectionType) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77639, new Class[0], CollectionType.class);
        } else if (this.music == null) {
            return this.collectionType;
        } else {
            if (this.music.getCollectStatus() != 1) {
                return CollectionType.NOT_COLLECTED;
            }
            return CollectionType.COLLECTED;
        }
    }

    public Music convertToMusic() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77641, new Class[0], Music.class)) {
            return (Music) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77641, new Class[0], Music.class);
        }
        ct ctVar = ct.f75697b;
        if (PatchProxy.isSupport(new Object[]{this}, ctVar, ct.f75696a, false, 88415, new Class[]{MusicModel.class}, Music.class)) {
            return (Music) PatchProxy.accessDispatch(new Object[]{this}, ctVar, ct.f75696a, false, 88415, new Class[]{MusicModel.class}, Music.class);
        }
        Intrinsics.checkParameterIsNotNull(this, "mMusicModel");
        Music music2 = new Music();
        music2.setMid(getMusicId());
        music2.setId(getId());
        if (getCollectionType() == CollectionType.COLLECTED) {
            i = 1;
        }
        music2.setCollectStatus(i);
        music2.setAlbum(getAlbum());
        music2.setAuthorName(getSinger());
        if (getMusic() != null) {
            Music music3 = getMusic();
            Intrinsics.checkExpressionValueIsNotNull(music3, "mMusicModel.music");
            music2.setChallenge(music3.getChallenge());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(getPicBig());
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(arrayList);
        urlModel.setUri(Uri.decode(getPicBig()));
        music2.setCoverLarge(urlModel);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getPicPremium());
        UrlModel urlModel2 = new UrlModel();
        urlModel2.setUrlList(arrayList2);
        urlModel2.setUri(Uri.decode(getPicPremium()));
        music2.setCoverMedium(urlModel2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(getPicSmall());
        UrlModel urlModel3 = new UrlModel();
        urlModel3.setUrlList(arrayList3);
        urlModel3.setUri(Uri.decode(getPicSmall()));
        music2.setCoverThumb(urlModel3);
        music2.setDuration(getDuration());
        music2.setMusicName(getName());
        music2.setBillboardRank(getBillboardRank());
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(getPath());
        if (getMusicType() == MusicType.ONLINE) {
            UrlModel urlModel4 = new UrlModel();
            urlModel4.setUrlList(arrayList4);
            urlModel4.setUri(Uri.decode(getPath()));
            music2.setPlayUrl(urlModel4);
        }
        music2.setOfflineDesc(getOfflineDesc());
        music2.setMusicStatus(getMusicStatus());
        if (getMusicType() == MusicType.BAIDU) {
            music2.setSource(4);
            if (getExtra() != null) {
                music2.setExtra(getExtra());
            } else {
                music2.setPath(getPath());
            }
        }
        music2.setRedirect(isRedirect());
        music2.setStrongBeatUrl(getStrongBeatUrl());
        music2.setLrcType(getLrcType());
        music2.setPreviewStartTime(getPreviewStartTime());
        music2.setLrcUrl(getLrcUrl());
        music2.setPreventDownload(isPreventDownload());
        return music2;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setAllRate(String str) {
        this.allRate = str;
    }

    public void setBillboardRank(int i) {
        this.billboardRank = i;
    }

    public void setChallengeMusic(boolean z) {
        this.isChallengeMusic = z;
    }

    public void setChallengeUserCount(int i) {
        this.challengeUserCount = i;
    }

    public void setComeFromForMod(int i) {
        this.comeFromForMod = i;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setLocalMusicDuration(String str) {
        this.localMusicDuration = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setLrcType(int i) {
        this.lrcType = i;
    }

    public void setLrcUrl(String str) {
        this.lrcUrl = str;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public MusicModel setMusicEffects(String str) {
        this.musicEffectsUrl = str;
        return this;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setMusicStatus(int i) {
        this.musicStatus = i;
    }

    public void setMusicType(MusicType musicType2) {
        this.musicType = musicType2;
    }

    public void setMusicWaveBean(MusicWaveBean musicWaveBean2) {
        this.musicWaveBean = musicWaveBean2;
    }

    public void setMvThemeMusic(boolean z) {
        this.isMvThemeMusic = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOfflineDesc(String str) {
        this.offlineDesc = str;
    }

    public void setOriginal(boolean z) {
        this.isOriginal = z;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPicBig(String str) {
        this.picBig = str;
    }

    public void setPicHuge(String str) {
        this.picHuge = str;
    }

    public void setPicPremium(String str) {
        this.picPremium = str;
    }

    public void setPicSmall(String str) {
        this.picSmall = str;
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

    public void setSinger(String str) {
        this.singer = str;
    }

    public void setSongId(String str) {
        this.songId = str;
    }

    public void setSourcePlatform(int i) {
        this.sourcePlatform = i;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setCollectionType(CollectionType collectionType2) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{collectionType2}, this, changeQuickRedirect, false, 77640, new Class[]{CollectionType.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{collectionType2}, this, changeQuickRedirect, false, 77640, new Class[]{CollectionType.class}, Void.TYPE);
            return;
        }
        this.collectionType = collectionType2;
        if (this.music != null) {
            Music music2 = this.music;
            if (collectionType2 == CollectionType.NOT_COLLECTED) {
                i = 0;
            }
            music2.setCollectStatus(i);
        }
    }
}
