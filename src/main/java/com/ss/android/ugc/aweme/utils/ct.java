package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/MusicModelHelperV2;", "", "()V", "thousand", "", "musicEquals", "", "obj1", "obj2", "musicHashCode", "mMusic", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "musicModelEquals", "musicModelHashCode", "mMusicModel", "musicModelToMusic", "Lcom/ss/android/ugc/aweme/music/model/Music;", "musicModelToString", "", "musicToMusicModel", "mainservice_release"}, k = 1, mv = {1, 1, 15})
public final class ct {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75696a;

    /* renamed from: b  reason: collision with root package name */
    public static final ct f75697b = new ct();

    private ct() {
    }

    @NotNull
    public final MusicModel a(@NotNull Music music) {
        Music music2 = music;
        if (PatchProxy.isSupport(new Object[]{music2}, this, f75696a, false, 88419, new Class[]{Music.class}, MusicModel.class)) {
            return (MusicModel) PatchProxy.accessDispatch(new Object[]{music2}, this, f75696a, false, 88419, new Class[]{Music.class}, MusicModel.class);
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
}
