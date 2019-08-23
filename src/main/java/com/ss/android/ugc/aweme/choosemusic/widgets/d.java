package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.view.f;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ad;

public final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36191a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicBoardWidget f36192b;

    /* renamed from: c  reason: collision with root package name */
    private final MusicCollectionItem f36193c;

    d(MusicBoardWidget musicBoardWidget, MusicCollectionItem musicCollectionItem) {
        this.f36192b = musicBoardWidget;
        this.f36193c = musicCollectionItem;
    }

    public final void a(MusicItemViewHolder musicItemViewHolder, View view, MusicModel musicModel, int i) {
        String str;
        MusicItemViewHolder musicItemViewHolder2 = musicItemViewHolder;
        MusicModel musicModel2 = musicModel;
        if (PatchProxy.isSupport(new Object[]{musicItemViewHolder2, view, musicModel2, Integer.valueOf(i)}, this, f36191a, false, 26999, new Class[]{MusicItemViewHolder.class, View.class, MusicModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicItemViewHolder2, view, musicModel2, Integer.valueOf(i)}, this, f36191a, false, 26999, new Class[]{MusicItemViewHolder.class, View.class, MusicModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        MusicBoardWidget musicBoardWidget = this.f36192b;
        MusicCollectionItem musicCollectionItem = this.f36193c;
        int id = view.getId();
        if (id == C0906R.id.b3e) {
            Activity a2 = a.b().a();
            if (a2 == null) {
                str = "";
            } else {
                str = a2.getString(C0906R.string.ads);
            }
            if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
                e.a(a.b().a(), com.ss.android.ugc.aweme.choosemusic.f.d.a(i), "click_favorite_music", (c.a() || TextUtils.isEmpty(str)) ? null : ad.a().a("login_title", str).f75487b);
                return;
            }
            musicItemViewHolder.d();
            com.ss.android.ugc.aweme.choosemusic.f.c.a(musicItemViewHolder2.f36100b, musicModel.getMusicId(), musicBoardWidget.q, musicItemViewHolder2.f36103e, musicModel.getLogPb());
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
                h a3 = h.a();
                a3.a("aweme://music/detail/" + musicModel.getMusicId());
                com.ss.android.ugc.aweme.choosemusic.f.c.a(musicBoardWidget.q, musicModel.getMusicId(), false);
            }
        } else if (id == C0906R.id.dkt) {
            Intent intent = new Intent(musicBoardWidget.f2709d, MusicDetailListActivity.class);
            if (musicBoardWidget.n == 0) {
                intent.putExtra("music_type", 1);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.p);
            } else {
                intent.putExtra("music_class_id", musicCollectionItem.mcId);
                intent.putExtra("music_class_name", musicCollectionItem.mcName);
                intent.putExtra("music_type", 2);
                intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
                intent.putExtra("music_class_enter_method", "click_more");
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.p);
            }
            musicBoardWidget.a(intent, musicBoardWidget.o);
            com.ss.android.ugc.aweme.choosemusic.f.c.a(musicCollectionItem.mcName, "click_more", "", "change_music_page", musicCollectionItem.mcId);
        } else if (id == C0906R.id.bha) {
            if (musicItemViewHolder2 != null && musicModel2 != null) {
                if (musicBoardWidget.m == musicItemViewHolder2.f36103e && ((Integer) musicBoardWidget.g.b("music_position", -1)).intValue() == musicBoardWidget.n) {
                    musicBoardWidget.g.a("music_position", (Object) -1);
                    musicBoardWidget.g.a("music_index", (Object) -1);
                    musicItemViewHolder2.a(false);
                    musicBoardWidget.g();
                    return;
                }
                if (musicBoardWidget.k != null) {
                    musicBoardWidget.g();
                    musicItemViewHolder2.a(true);
                    musicItemViewHolder2.a(true, true);
                    musicBoardWidget.k.a((p.a) new e(musicBoardWidget));
                    musicBoardWidget.k.a(musicModel2, musicBoardWidget.q);
                    com.ss.android.ugc.aweme.choosemusic.f.c.a(musicItemViewHolder2.f36103e);
                }
                musicBoardWidget.g.a("music_position", (Object) Integer.valueOf(musicBoardWidget.n));
                musicBoardWidget.g.a("music_index", (Object) Integer.valueOf(musicItemViewHolder2.f36103e));
                musicBoardWidget.g.a("music_loading", (Object) Boolean.TRUE);
            }
        } else if (!(id != C0906R.id.bif || musicBoardWidget.k == null || musicModel2 == null)) {
            musicBoardWidget.k.b(musicModel2);
            com.ss.android.ugc.aweme.choosemusic.f.c.a(musicBoardWidget.q, musicModel.getMusicId(), musicBoardWidget.n, musicModel.getLogPb());
        }
    }
}
