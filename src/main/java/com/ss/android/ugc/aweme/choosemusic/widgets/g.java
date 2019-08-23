package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.choosemusic.f.d;
import com.ss.android.ugc.aweme.choosemusic.view.f;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ad;

public final /* synthetic */ class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36198a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerMusicWidget f36199b;

    g(StickerMusicWidget stickerMusicWidget) {
        this.f36199b = stickerMusicWidget;
    }

    public final void a(MusicItemViewHolder musicItemViewHolder, View view, MusicModel musicModel, int i) {
        String str;
        MusicItemViewHolder musicItemViewHolder2 = musicItemViewHolder;
        MusicModel musicModel2 = musicModel;
        if (PatchProxy.isSupport(new Object[]{musicItemViewHolder2, view, musicModel2, Integer.valueOf(i)}, this, f36198a, false, 27028, new Class[]{MusicItemViewHolder.class, View.class, MusicModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicItemViewHolder2, view, musicModel2, Integer.valueOf(i)}, this, f36198a, false, 27028, new Class[]{MusicItemViewHolder.class, View.class, MusicModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        StickerMusicWidget stickerMusicWidget = this.f36199b;
        int id = view.getId();
        Bundle bundle = null;
        if (id == C0906R.id.b3e) {
            Activity a2 = a.b().a();
            if (a2 == null) {
                str = "";
            } else {
                str = a2.getString(C0906R.string.ads);
            }
            if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
                Activity a3 = a.b().a();
                String a4 = d.a(i);
                if (!c.a() && !TextUtils.isEmpty(str)) {
                    bundle = ad.a().a("login_title", str).f75487b;
                }
                e.a(a3, a4, "click_favorite_music", bundle);
                return;
            }
            musicItemViewHolder.d();
            com.ss.android.ugc.aweme.choosemusic.f.c.a(musicItemViewHolder2.f36100b, musicModel.getMusicId(), stickerMusicWidget.o, musicItemViewHolder2.f36103e, musicModel.getLogPb());
            return;
        }
        if (id == C0906R.id.b3g) {
            if (musicModel2 != null && musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = view.getContext().getString(C0906R.string.bel);
                }
                com.bytedance.ies.dmt.ui.d.a.c(view.getContext(), offlineDesc).a();
            } else if (musicModel2 != null && com.ss.android.ugc.aweme.music.util.d.a(musicModel2, view.getContext(), true)) {
                h a5 = h.a();
                a5.a("aweme://music/detail/" + musicModel.getMusicId());
                com.ss.android.ugc.aweme.choosemusic.f.c.a(new com.ss.android.ugc.aweme.choosemusic.a("change_music_page", "attached_song", "click_button", com.ss.android.ugc.aweme.choosemusic.f.c.a()), musicModel.getMusicId(), false);
            }
        } else if (id == C0906R.id.bha) {
            if (stickerMusicWidget.l == musicItemViewHolder2.f36103e && ((Integer) stickerMusicWidget.g.b("music_position", -1)).intValue() == -2) {
                stickerMusicWidget.g.a("music_position", (Object) -1);
                stickerMusicWidget.g.a("music_index", (Object) -1);
                musicItemViewHolder2.a(false);
                stickerMusicWidget.e();
                return;
            }
            if (stickerMusicWidget.k != null) {
                stickerMusicWidget.e();
                com.ss.android.ugc.aweme.choosemusic.f.c.a(musicItemViewHolder2.f36103e);
                com.ss.android.ugc.aweme.choosemusic.a aVar = new com.ss.android.ugc.aweme.choosemusic.a("change_music_page", "prop", "", com.ss.android.ugc.aweme.choosemusic.f.c.a());
                aVar.f35736f = (String) stickerMusicWidget.g.b("sticker_id", null);
                stickerMusicWidget.k.a((p.a) new h(stickerMusicWidget));
                stickerMusicWidget.k.a(musicModel2, aVar);
                musicItemViewHolder2.a(true);
            }
            stickerMusicWidget.g.a("music_position", (Object) -2);
            stickerMusicWidget.g.a("music_index", (Object) Integer.valueOf(musicItemViewHolder2.f36103e));
            stickerMusicWidget.g.a("music_loading", (Object) Boolean.TRUE);
        } else if (id == C0906R.id.bif) {
            if (stickerMusicWidget.q != null) {
                stickerMusicWidget.q.b(9);
            }
            if (stickerMusicWidget.k != null) {
                stickerMusicWidget.k.b(musicModel2);
                com.ss.android.ugc.aweme.choosemusic.f.c.a(stickerMusicWidget.o, musicModel.getMusicId(), musicItemViewHolder2.f36103e, musicModel.getLogPb());
            }
        }
    }
}
