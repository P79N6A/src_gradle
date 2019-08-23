package com.ss.android.ugc.aweme.choosemusic.fragment;

import a.g;
import a.i;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.choosemusic.b.a;
import com.ss.android.ugc.aweme.choosemusic.d.e;
import com.ss.android.ugc.aweme.choosemusic.view.PreloadRecyclerViewConverter;
import com.ss.android.ugc.aweme.choosemusic.view.h;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.music.model.Music;

public class HotMusicListFragment extends BaseMusicListFragment implements a<Music>, LoadMoreRecyclerViewAdapter.a {
    public static ChangeQuickRedirect i;

    public final /* bridge */ /* synthetic */ void a(Object obj, int i2) {
    }

    public final String b() {
        return "hot_music_list_data";
    }

    public final String c() {
        return "refresh_status_hot_music_list";
    }

    public final String d() {
        return "loadmore_status_hot_music_list";
    }

    public final int k() {
        return 0;
    }

    public final String l() {
        return "";
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26589, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26589, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f2829e.c(0, 20);
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26591, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2829e != null) {
            this.f2829e.c(0, 20);
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26593, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26592, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26592, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a();
        }
        if (!(this.f2829e == null || this.f2830f == null)) {
            com.ss.android.ugc.aweme.choosemusic.d.a aVar = this.f2829e;
            int intValue = ((Integer) ((b) this.f2830f.a(b())).a("list_cursor")).intValue();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue), 20}, aVar, com.ss.android.ugc.aweme.choosemusic.d.a.f35803a, false, 26736, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                com.ss.android.ugc.aweme.choosemusic.d.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue), 20}, aVar2, com.ss.android.ugc.aweme.choosemusic.d.a.f35803a, false, 26736, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (!aVar.h) {
                aVar.h = true;
                aVar.f35804b.getHotMusicList(intValue, 20).a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(aVar), i.f1052b);
            }
        }
    }

    public static Fragment a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, i, true, 26588, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, i, true, 26588, new Class[]{Integer.TYPE}, Fragment.class);
        }
        HotMusicListFragment hotMusicListFragment = new HotMusicListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        hotMusicListFragment.setArguments(bundle);
        return hotMusicListFragment;
    }

    public final c b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, i, false, 26590, new Class[]{View.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{view}, this, i, false, 26590, new Class[]{View.class}, c.class);
        }
        h hVar = new h(getContext(), view, this, C0906R.string.bhi, this, this, this.h);
        hVar.a((int) C0906R.string.bwg);
        hVar.a((com.ss.android.ugc.aweme.choosemusic.b.b) this);
        if (getContext() != null) {
            hVar.a(new com.ss.android.ugc.aweme.choosemusic.a("change_music_page_detail", getContext().getString(C0906R.string.bwg), "click_more", com.ss.android.ugc.aweme.choosemusic.f.c.a()));
        }
        hVar.a((PreloadRecyclerViewConverter.a) new f(this), 10);
        return hVar;
    }
}
