package com.ss.android.ugc.aweme.music.util;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\tJ\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/music/util/MusicModelHelper;", "", "()V", "thousand", "", "getMusicId", "", "musicModel", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "musicEquals", "", "obj1", "obj2", "musicHashCode", "mMusic", "musicModelEquals", "musicModelHashCode", "mMusicModel", "musicModelToMusic", "Lcom/ss/android/ugc/aweme/music/model/Music;", "musicModelToString", "musicToMusicModel", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56795a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f56796b = new c();

    private c() {
    }

    @NotNull
    public final String a(@Nullable MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f56795a, false, 60599, new Class[]{MusicModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{musicModel}, this, f56795a, false, 60599, new Class[]{MusicModel.class}, String.class);
        }
        String str = null;
        if (musicModel != null) {
            str = musicModel.getMusicId();
        }
        if (str == null) {
            str = "";
        }
        return str;
    }

    @NotNull
    public final MusicModel a(@NotNull Music music) {
        Music music2 = music;
        if (PatchProxy.isSupport(new Object[]{music2}, this, f56795a, false, 60605, new Class[]{Music.class}, MusicModel.class)) {
            return (MusicModel) PatchProxy.accessDispatch(new Object[]{music2}, this, f56795a, false, 60605, new Class[]{Music.class}, MusicModel.class);
        }
        Intrinsics.checkParameterIsNotNull(music2, "mMusic");
        MusicModel musicModel = new MusicModel();
        musicModel.setMusic(music2);
        musicModel.setDuration(music.getEndTime());
        if (!(music.getCoverMedium() == null || music.getCoverMedium().getUrlList() == null || music.getCoverMedium().getUrlList().size() <= 0)) {
            musicModel.setPicPremium(music.getCoverMedium().getUrlList().get(0));
        }
        if (!(music.getCoverThumb() == null || music.getCoverThumb().getUrlList() == null || music.getCoverThumb().getUrlList().size() <= 0)) {
            musicModel.setPicSmall(music.getCoverThumb().getUrlList().get(0));
        }
        if (!(music.getCoverLarge() == null || music.getCoverLarge().getUrlList() == null || music.getCoverLarge().getUrlList().size() <= 0)) {
            musicModel.setPicBig(music.getCoverLarge().getUrlList().get(0));
        }
        if (music.getCollectStatus() == 1) {
            musicModel.setCollectionType(MusicModel.CollectionType.COLLECTED);
        } else {
            musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
        }
        MusicModel.MusicType musicType = MusicModel.MusicType.ONLINE;
        if (music.getSource() == 4) {
            musicType = MusicModel.MusicType.BAIDU;
        }
        musicModel.setSinger(music.getAuthorName());
        if (musicType != MusicModel.MusicType.ONLINE) {
            String str = "12345";
            if (music.getExtra() != null) {
                String extra = music.getExtra();
                musicModel.setExtra(extra);
                try {
                    str = new JSONObject(extra).getJSONObject("meta").getString("song_id");
                } catch (JSONException unused) {
                }
                if (str == null) {
                    str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                }
                musicModel.setPath(str);
            } else {
                musicModel.setPath(music.getPath());
            }
        } else if (!(music.getPlayUrl() == null || music.getPlayUrl().getUrlList() == null || music.getPlayUrl().getUrlList().isEmpty())) {
            musicModel.setPath(music.getPlayUrl().getUrlList().get(0));
        }
        musicModel.setMusicType(musicType);
        musicModel.setName(music.getMusicName());
        musicModel.setMusicId(music.getMid());
        musicModel.setDuration(music.getDuration() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        musicModel.setOfflineDesc(music.getOfflineDesc());
        musicModel.setMusicStatus(music.getMusicStatus());
        musicModel.setUserCount(music.getUserCount());
        musicModel.setOriginal(music.isOriginMusic());
        musicModel.setBillboardRank(music.getBillboardRank());
        musicModel.setId(music.getId());
        musicModel.setLrcUrl(music.getLrcUrl());
        musicModel.setLrcType(music.getLrcType());
        musicModel.setPreviewStartTime(music.getPreviewStartTime());
        if (!(music.getEffectsData() == null || music.getEffectsData().getUrlList() == null || music.getEffectsData().getUrlList().isEmpty())) {
            musicModel.setMusicEffects(music.getEffectsData().getUrlList().get(0));
        }
        musicModel.setRedirect(music.isRedirect());
        musicModel.setStrongBeatUrl(music.getStrongBeatUrl());
        musicModel.setPreventDownload(music.isPreventDownload());
        return musicModel;
    }

    @NotNull
    public final Music b(@NotNull MusicModel musicModel) {
        MusicModel musicModel2 = musicModel;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{musicModel2}, this, f56795a, false, 60601, new Class[]{MusicModel.class}, Music.class)) {
            return (Music) PatchProxy.accessDispatch(new Object[]{musicModel2}, this, f56795a, false, 60601, new Class[]{MusicModel.class}, Music.class);
        }
        Intrinsics.checkParameterIsNotNull(musicModel2, "mMusicModel");
        Music music = new Music();
        music.setMid(musicModel.getMusicId());
        music.setId(musicModel.getId());
        if (musicModel.getCollectionType() != MusicModel.CollectionType.COLLECTED) {
            i = 0;
        }
        music.setCollectStatus(i);
        music.setAlbum(musicModel.getAlbum());
        music.setAuthorName(musicModel.getSinger());
        if (musicModel.getMusic() != null) {
            Music music2 = musicModel.getMusic();
            Intrinsics.checkExpressionValueIsNotNull(music2, "mMusicModel.music");
            music.setChallenge(music2.getChallenge());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(musicModel.getPicBig());
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(arrayList);
        urlModel.setUri(Uri.decode(musicModel.getPicBig()));
        music.setCoverLarge(urlModel);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(musicModel.getPicPremium());
        UrlModel urlModel2 = new UrlModel();
        urlModel2.setUrlList(arrayList2);
        urlModel2.setUri(Uri.decode(musicModel.getPicPremium()));
        music.setCoverMedium(urlModel2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(musicModel.getPicSmall());
        UrlModel urlModel3 = new UrlModel();
        urlModel3.setUrlList(arrayList3);
        urlModel3.setUri(Uri.decode(musicModel.getPicSmall()));
        music.setCoverThumb(urlModel3);
        music.setDuration(musicModel.getDuration());
        music.setMusicName(musicModel.getName());
        music.setBillboardRank(musicModel.getBillboardRank());
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(musicModel.getPath());
        if (musicModel.getMusicType() == MusicModel.MusicType.ONLINE) {
            UrlModel urlModel4 = new UrlModel();
            urlModel4.setUrlList(arrayList4);
            urlModel4.setUri(Uri.decode(musicModel.getPath()));
            music.setPlayUrl(urlModel4);
        }
        music.setOfflineDesc(musicModel.getOfflineDesc());
        music.setMusicStatus(musicModel.getMusicStatus());
        if (musicModel.getMusicType() == MusicModel.MusicType.BAIDU) {
            music.setSource(4);
            if (musicModel.getExtra() != null) {
                music.setExtra(musicModel.getExtra());
            } else {
                music.setPath(musicModel.getPath());
            }
        }
        music.setRedirect(musicModel.isRedirect());
        music.setStrongBeatUrl(musicModel.getStrongBeatUrl());
        music.setLrcType(musicModel.getLrcType());
        music.setPreviewStartTime(musicModel.getPreviewStartTime());
        music.setLrcUrl(musicModel.getLrcUrl());
        music.setPreventDownload(musicModel.isPreventDownload());
        return music;
    }
}
