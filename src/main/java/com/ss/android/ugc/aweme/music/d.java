package com.ss.android.ugc.aweme.music;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.music.ui.c;
import com.ss.android.ugc.aweme.photomovie.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.music.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.List;

public final class d implements IMusicService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56325a;

    public final Music getDefaultMusic() {
        if (!PatchProxy.isSupport(new Object[0], this, f56325a, false, 59808, new Class[0], Music.class)) {
            return a.a();
        }
        return (Music) PatchProxy.accessDispatch(new Object[0], this, f56325a, false, 59808, new Class[0], Music.class);
    }

    public final i<List<MusicModel>> refreshHotMusicList() {
        if (!PatchProxy.isSupport(new Object[0], this, f56325a, false, 59804, new Class[0], i.class)) {
            return ChooseMusicApi.a().getHotMusicList(0, 10).a((g<TResult, TContinuationResult>) new g<MusicList, List<MusicModel>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56328a;

                public final /* synthetic */ Object then(i iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f56328a, false, 59810, new Class[]{i.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{iVar}, this, f56328a, false, 59810, new Class[]{i.class}, List.class);
                    } else if (iVar.c() || iVar.d() || iVar.e() == null) {
                        return null;
                    } else {
                        return com.ss.android.ugc.aweme.choosemusic.f.d.a(((MusicList) iVar.e()).items);
                    }
                }
            });
        }
        return (i) PatchProxy.accessDispatch(new Object[0], this, f56325a, false, 59804, new Class[0], i.class);
    }

    public final a provideMusicDownloadPlayHelper(c cVar) {
        c cVar2 = cVar;
        if (!PatchProxy.isSupport(new Object[]{cVar2}, this, f56325a, false, 59807, new Class[]{c.class}, a.class)) {
            return new com.ss.android.ugc.aweme.music.ui.a(cVar2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f56325a, false, 59807, new Class[]{c.class}, a.class);
    }

    public final Music getMusicDetail(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f56325a, false, 59806, new Class[]{String.class, Integer.TYPE}, Music.class)) {
            return (Music) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f56325a, false, 59806, new Class[]{String.class, Integer.TYPE}, Music.class);
        }
        try {
            MusicDetail a2 = MusicApi.a(str, i);
            if (a2 != null) {
                return a2.music;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final i<SuggestMusicList> refreshSuggestList(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f56325a, false, 59803, new Class[]{String.class, String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f56325a, false, 59803, new Class[]{String.class, String.class}, i.class);
        }
        ChooseMusicApi.API a2 = ChooseMusicApi.a();
        return a2.getRecommenMusicListFromAI(0, 10, "shoot_page", str, ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().recommentMusicByAIPolicy(), str2).a((g<TResult, TContinuationResult>) new g<MusicList, SuggestMusicList>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56326a;

            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f56326a, false, 59809, new Class[]{i.class}, SuggestMusicList.class)) {
                    return (SuggestMusicList) PatchProxy.accessDispatch(new Object[]{iVar}, this, f56326a, false, 59809, new Class[]{i.class}, SuggestMusicList.class);
                } else if (iVar.d() || iVar.c() || iVar.e() == null) {
                    return null;
                } else {
                    SuggestMusicList suggestMusicList = new SuggestMusicList();
                    suggestMusicList.musicList = com.ss.android.ugc.aweme.choosemusic.f.d.a(((MusicList) iVar.e()).items);
                    suggestMusicList.musicType = Integer.valueOf(((MusicList) iVar.e()).mMusicType);
                    suggestMusicList.logPb = ((MusicList) iVar.e()).logPb;
                    return suggestMusicList;
                }
            }
        });
    }

    public final i<CollectedMusicList> userCollectedMusicList(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56325a, false, 59805, new Class[]{Integer.TYPE, Integer.TYPE}, i.class)) {
            return ChooseMusicApi.a().userCollectedMusicList(i, i2);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56325a, false, 59805, new Class[]{Integer.TYPE, Integer.TYPE}, i.class);
    }
}
