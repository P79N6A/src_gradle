package com.ss.android.ugc.aweme.tools.music.f;

import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/utils/AVMusicTransformation;", "Lcom/google/common/base/Function;", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "()V", "apply", "input", "Companion", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements f<MusicModel, e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74886a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f74887b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/utils/AVMusicTransformation$Companion;", "", "()V", "transform", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "fromList", "", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74888a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Nullable
    /* renamed from: a */
    public final e apply(@Nullable MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f74886a, false, 87236, new Class[]{MusicModel.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{musicModel}, this, f74886a, false, 87236, new Class[]{MusicModel.class}, e.class);
        }
        String str = null;
        if (musicModel == null) {
            return null;
        }
        e eVar = new e();
        Music convertToMusic = musicModel.convertToMusic();
        Intrinsics.checkExpressionValueIsNotNull(convertToMusic, "music");
        eVar.id = convertToMusic.getId();
        eVar.mid = convertToMusic.getMid();
        eVar.musicName = convertToMusic.getMusicName();
        eVar.album = convertToMusic.getAlbum();
        eVar.path = musicModel.getPath();
        eVar.audioTrack = convertToMusic.getAudioTrack();
        eVar.authorName = convertToMusic.getAuthorName();
        eVar.playUrl = convertToMusic.getPlayUrl();
        eVar.coverThumb = convertToMusic.getCoverThumb();
        eVar.coverMedium = convertToMusic.getCoverMedium();
        eVar.coverHd = convertToMusic.getConverHd();
        eVar.coverLarge = convertToMusic.getCoverLarge();
        eVar.duration = convertToMusic.getDuration();
        eVar.musicType = musicModel.getMusicType().ordinal();
        eVar.offlineDesc = musicModel.getOfflineDesc();
        eVar.musicStatus = convertToMusic.getMusicStatus();
        if (convertToMusic.getChallenge() != null) {
            eVar.challenge = new a().apply(convertToMusic.getChallenge());
        }
        eVar.strongBeatUrl = convertToMusic.getStrongBeatUrl();
        eVar.setLrcUrl(convertToMusic.getLrcUrl());
        eVar.setLrcType(convertToMusic.getLrcType());
        eVar.setPreviewStartTime(convertToMusic.getPreviewStartTime());
        eVar.setPreventDownload(musicModel.isPreventDownload());
        if (musicModel.getMusicWaveBean() != null) {
            eVar.setMusicWaveData(musicModel.getMusicWaveBean().getMusicWavePointArray());
        }
        eVar.setMvThemeMusic(musicModel.isMvThemeMusic());
        LogPbBean logPb = musicModel.getLogPb();
        if (logPb != null) {
            str = logPb.getImprId();
        }
        eVar.setLogPb(new com.ss.android.ugc.aweme.ao.a.b(str));
        eVar.setComeFromForMod(musicModel.getComeFromForMod());
        eVar.setRedirect(musicModel.isRedirect());
        eVar.setSearchKeyWords(musicModel.getSearchKeyWords());
        eVar.setSongId(musicModel.getSongId());
        return eVar;
    }
}
