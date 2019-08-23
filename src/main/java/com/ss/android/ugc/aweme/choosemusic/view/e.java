package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.ss.android.ugc.aweme.choosemusic.b.b;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public final class e extends BaseMusicListView<MusicModel> {
    public static ChangeQuickRedirect g;

    public final BaseAdapter e() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26847, new Class[0], BaseAdapter.class)) {
            return (BaseAdapter) PatchProxy.accessDispatch(new Object[0], this, g, false, 26847, new Class[0], BaseAdapter.class);
        }
        MusicAdapter musicAdapter = new MusicAdapter(this.f36005d);
        musicAdapter.i = this.f36006e;
        return musicAdapter;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26848, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 26848, new Class[0], Void.TYPE);
            return;
        }
        super.c();
        if (!a.a()) {
            MonitorUtils.monitorCommonLog("show_collect_empty", c.a().a("show_collect_empty_page", "choose_music").b());
        }
    }

    public final void a(com.ss.android.ugc.aweme.choosemusic.a aVar) {
        if (this.f36003b instanceof MusicAdapter) {
            ((MusicAdapter) this.f36003b).f35768f = aVar;
        }
    }

    public final void a(b bVar) {
        if (this.f36003b instanceof MusicAdapter) {
            ((MusicAdapter) this.f36003b).f35764b = bVar;
        }
    }

    public final void a(boolean z) {
        if (this.f36003b instanceof MusicAdapter) {
            ((MusicAdapter) this.f36003b).h = z;
        }
    }

    public e(Context context, View view, com.ss.android.ugc.aweme.choosemusic.b.a aVar, LoadMoreRecyclerViewAdapter.a aVar2, f<com.ss.android.ugc.aweme.choosemusic.a.b> fVar, int i) {
        super(context, view, aVar, C0906R.string.bh7, aVar2, fVar, i);
        this.mTitleBar.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) this.mRecyclerView.getLayoutParams()).topMargin = (int) UIUtils.dip2Px(this.mRecyclerView.getContext(), 10.0f);
        this.mRecyclerView.setOverScrollMode(2);
        if (a.a()) {
            this.mStatusView.setBuilder(this.mStatusView.a().b(LayoutInflater.from(view.getContext()).inflate(C0906R.layout.aqg, null)));
        }
    }
}
