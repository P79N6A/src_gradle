package com.ss.android.ugc.aweme.hotsearch.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.HotSearchMusicItem;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.d.c;
import com.ss.android.ugc.aweme.hotsearch.view.a;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDetailActivity;
import java.util.Map;

public class RankingListMusicFragment extends BaseRankingListFragment implements f<Music>, c.b {
    public static ChangeQuickRedirect h;
    c i;

    public final void N_() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 49674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 49674, new Class[0], Void.TYPE);
            return;
        }
        this.i.a();
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 49669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 49669, new Class[0], Void.TYPE);
            return;
        }
        this.f49755d.a(null, null);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 49666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 49666, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.i.a();
        this.i.b();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 49667, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 49667, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.i.a();
    }

    /* access modifiers changed from: package-private */
    public final a b(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, this, h, false, 49670, new Class[]{View.class}, a.class)) {
            return new com.ss.android.ugc.aweme.hotsearch.view.c(view2, getActivity(), this);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{view2}, this, h, false, 49670, new Class[]{View.class}, a.class);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 49668, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, h, false, 49668, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (!z && this.i != null) {
            this.i.a();
        }
    }

    public final /* synthetic */ void a(Object obj, int i2) {
        Music music = (Music) obj;
        if (PatchProxy.isSupport(new Object[]{music, Integer.valueOf(i2)}, this, h, false, 49672, new Class[]{Music.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{music, Integer.valueOf(i2)}, this, h, false, 49672, new Class[]{Music.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        r.a("music_show", (Map) new d().a("enter_from", "music_leaderboard").a("music_id", music.getId()).f34114b);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, h, false, 49665, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, h, false, 49665, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        this.i = new c();
        super.onViewCreated(view, bundle);
    }

    public final /* synthetic */ void b(Object obj, int i2) {
        Music music = (Music) obj;
        if (PatchProxy.isSupport(new Object[]{music, Integer.valueOf(i2)}, this, h, false, 49671, new Class[]{Music.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{music, Integer.valueOf(i2)}, this, h, false, 49671, new Class[]{Music.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        r.a("cell_click", (Map) new d().a("enter_from", "music_leaderboard").a("scene_id", (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST).a("music_id", music.getId()).f34114b);
        r.a("enter_music_detail", (Map) new d().a("enter_from", "music_leaderboard").a("scene_id", 1005).a("music_id", music.getId()).f34114b);
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            MusicDetailActivity.a(activity, music.getId(), "1001");
        }
    }

    public final void a(HotSearchMusicItem hotSearchMusicItem, c.a aVar, int i2) {
        HotSearchMusicItem hotSearchMusicItem2 = hotSearchMusicItem;
        c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{hotSearchMusicItem2, aVar2, Integer.valueOf(i2)}, this, h, false, 49673, new Class[]{HotSearchMusicItem.class, c.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchMusicItem2, aVar2, Integer.valueOf(i2)}, this, h, false, 49673, new Class[]{HotSearchMusicItem.class, c.a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        r.a("play_music", (Map) new d().a("enter_from", "music_leaderboard").a("scene_id", (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST).a("music_id", hotSearchMusicItem2.mMusic.getId()).a("enter_method", "click").f34114b);
        this.i.a(getContext(), hotSearchMusicItem2, aVar2);
    }
}
