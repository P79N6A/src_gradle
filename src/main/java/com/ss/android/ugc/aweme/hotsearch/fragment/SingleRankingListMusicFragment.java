package com.ss.android.ugc.aweme.hotsearch.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.HotSearchMusicItem;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.d.c;
import com.ss.android.ugc.aweme.hotsearch.view.a;
import com.ss.android.ugc.aweme.hotsearch.view.i;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDetailActivity;
import java.util.Map;

public class SingleRankingListMusicFragment extends BaseSingleRankingListFragment implements f<Music>, c.b {
    public static ChangeQuickRedirect p;
    c q;

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
    }

    public final int m() {
        return 2;
    }

    public final void N_() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 49702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 49702, new Class[0], Void.TYPE);
            return;
        }
        this.q.a();
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 49699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 49699, new Class[0], Void.TYPE);
            return;
        }
        this.f49755d.a(Integer.valueOf(this.k), this.l);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 49696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 49696, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.q.a();
        this.q.b();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 49697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 49697, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.q.a();
    }

    public final Uri o() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 49695, new Class[0], Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[0], this, p, false, 49695, new Class[0], Uri.class);
        }
        try {
            return Uri.parse((String) SharePrefCache.inst().getMusicBillboardRuleUrl().c());
        } catch (Exception unused) {
            return Uri.parse("");
        }
    }

    /* access modifiers changed from: package-private */
    public final a b(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, this, p, false, 49693, new Class[]{View.class}, a.class)) {
            return new i(view2, getActivity(), this);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{view2}, this, p, false, 49693, new Class[]{View.class}, a.class);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, p, false, 49698, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, p, false, 49698, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (!z && this.q != null) {
            this.q.a();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, p, false, 49694, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, p, false, 49694, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        this.q = new c();
        super.onViewCreated(view, bundle);
        this.j.a((int) C0906R.string.bv4);
        this.j.b(2130838139);
    }

    public final /* synthetic */ void b(Object obj, int i) {
        Music music = (Music) obj;
        if (PatchProxy.isSupport(new Object[]{music, Integer.valueOf(i)}, this, p, false, 49700, new Class[]{Music.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{music, Integer.valueOf(i)}, this, p, false, 49700, new Class[]{Music.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        r.a("enter_music_detail", (Map) new d().a("enter_from", "music_leaderboard").a("scene_id", 1005).a("music_id", music.getId()).a("order", i).f34114b);
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            MusicDetailActivity.a(activity, music.getId(), "1001");
        }
    }

    public final void a(HotSearchMusicItem hotSearchMusicItem, c.a aVar, int i) {
        HotSearchMusicItem hotSearchMusicItem2 = hotSearchMusicItem;
        c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{hotSearchMusicItem2, aVar2, Integer.valueOf(i)}, this, p, false, 49701, new Class[]{HotSearchMusicItem.class, c.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchMusicItem2, aVar2, Integer.valueOf(i)}, this, p, false, 49701, new Class[]{HotSearchMusicItem.class, c.a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        r.a("play_music", (Map) new d().a("enter_from", "music_leaderboard").a("scene_id", 1015).a("music_id", hotSearchMusicItem2.mMusic.getId()).a("order", i).f34114b);
        this.q.a(getContext(), hotSearchMusicItem2, aVar2);
    }
}
