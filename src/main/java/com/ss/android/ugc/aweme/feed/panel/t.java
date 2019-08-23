package com.ss.android.ugc.aweme.feed.panel;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.poi.nearby.adapter.CardStaggeredGridItemDecoration;
import com.ss.android.ugc.aweme.poi.nearby.adapter.StaggeredGridItemDecoration;
import com.ss.android.ugc.aweme.profile.ui.WrapStaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public class t extends CellFeedFragmentPanel {
    public static ChangeQuickRedirect p;

    public boolean i() {
        return true;
    }

    public final RecyclerView.LayoutManager b() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 41906, new Class[0], RecyclerView.LayoutManager.class)) {
            return (RecyclerView.LayoutManager) PatchProxy.accessDispatch(new Object[0], this, p, false, 41906, new Class[0], RecyclerView.LayoutManager.class);
        }
        WrapStaggeredGridLayoutManager wrapStaggeredGridLayoutManager = new WrapStaggeredGridLayoutManager(2, 1);
        wrapStaggeredGridLayoutManager.setGapStrategy(0);
        return wrapStaggeredGridLayoutManager;
    }

    public final RecyclerView.ItemDecoration f() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 41907, new Class[0], RecyclerView.ItemDecoration.class)) {
            return (RecyclerView.ItemDecoration) PatchProxy.accessDispatch(new Object[0], this, p, false, 41907, new Class[0], RecyclerView.ItemDecoration.class);
        } else if (AbTestManager.a().aw() != 1) {
            return new CardStaggeredGridItemDecoration(8, 4);
        } else {
            return new StaggeredGridItemDecoration(8);
        }
    }

    public t(String str, d dVar, m mVar, int i) {
        super(str, dVar, mVar, i);
    }
}
