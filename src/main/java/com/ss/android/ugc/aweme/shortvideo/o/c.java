package com.ss.android.ugc.aweme.shortvideo.o;

import android.support.annotation.NonNull;
import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public final class c implements f<MusicModel, e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68803a;

    /* renamed from: a */
    public final e apply(@NonNull MusicModel musicModel) {
        MusicModel musicModel2 = musicModel;
        if (PatchProxy.isSupport(new Object[]{musicModel2}, this, f68803a, false, 80099, new Class[]{MusicModel.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{musicModel2}, this, f68803a, false, 80099, new Class[]{MusicModel.class}, e.class);
        }
        e eVar = new e();
        Music b2 = com.ss.android.ugc.aweme.music.util.c.f56796b.b(musicModel2);
        eVar.id = b2.getId();
        eVar.mid = b2.getMid();
        eVar.musicName = b2.getMusicName();
        eVar.album = b2.getAlbum();
        eVar.path = musicModel.getPath();
        eVar.audioTrack = b2.getAudioTrack();
        eVar.authorName = b2.getAuthorName();
        eVar.playUrl = b2.getPlayUrl();
        eVar.coverThumb = b2.getCoverThumb();
        eVar.coverMedium = b2.getCoverMedium();
        eVar.coverHd = b2.getConverHd();
        eVar.coverLarge = b2.getCoverLarge();
        eVar.duration = b2.getDuration();
        eVar.musicType = musicModel.getMusicType().ordinal();
        eVar.offlineDesc = musicModel.getOfflineDesc();
        eVar.musicStatus = b2.getMusicStatus();
        if (b2.getChallenge() != null) {
            eVar.challenge = new a().apply(b2.getChallenge());
        }
        eVar.strongBeatUrl = b2.getStrongBeatUrl();
        eVar.setLrcUrl(b2.getLrcUrl());
        eVar.setLrcType(b2.getLrcType());
        eVar.setPreviewStartTime(b2.getPreviewStartTime());
        eVar.setPreventDownload(musicModel.isPreventDownload());
        if (musicModel.getMusicWaveBean() != null) {
            eVar.setMusicWaveData(musicModel.getMusicWaveBean().getMusicWavePointArray());
        }
        return eVar;
    }
}
