package com.ss.android.ugc.aweme.feed.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.f.y;
import com.ss.android.ugc.aweme.feed.panel.AbsCellFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.r;
import org.greenrobot.eventbus.Subscribe;

public class NearByFragment extends BaseCellFeedFragment {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f3207e;

    public int e() {
        return 7;
    }

    public String f() {
        return "timeline_list";
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public int j() {
        return 1;
    }

    @NonNull
    public String k() {
        return "from_nearby";
    }

    public String l() {
        return "homepage_fresh";
    }

    public CellFeedFragmentPanel a() {
        if (PatchProxy.isSupport(new Object[0], this, f3207e, false, 42905, new Class[0], CellFeedFragmentPanel.class)) {
            return (CellFeedFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, f3207e, false, 42905, new Class[0], CellFeedFragmentPanel.class);
        }
        if (this.f3192d == null) {
            this.f3192d = new r("homepage_fresh", this, this, e());
        }
        return this.f3192d;
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3207e, false, 42907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3207e, false, 42907, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.f3192d.a((RecyclerView.OnScrollListener) new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46230a;

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f46230a, false, 42909, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f46230a, false, 42909, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    AwemeAppData.p().ai = false;
                }
            }
        });
    }

    @Subscribe
    public void onNearbyTabRefreshEvent(y yVar) {
        if (PatchProxy.isSupport(new Object[]{yVar}, this, f3207e, false, 42906, new Class[]{y.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{yVar}, this, f3207e, false, 42906, new Class[]{y.class}, Void.TYPE);
            return;
        }
        d(false);
    }

    public final void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f3207e, false, 42908, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f3207e, false, 42908, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3192d != null) {
            CellFeedFragmentPanel cellFeedFragmentPanel = this.f3192d;
            if (PatchProxy.isSupport(new Object[0], cellFeedFragmentPanel, AbsCellFeedFragmentPanel.f3157a, false, 41519, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cellFeedFragmentPanel, AbsCellFeedFragmentPanel.f3157a, false, 41519, new Class[0], Void.TYPE);
            } else if (cellFeedFragmentPanel.mListView != null) {
                cellFeedFragmentPanel.mListView.scrollToPosition(0);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, BaseCellFeedFragment.f3189a, false, 42434, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, BaseCellFeedFragment.f3189a, false, 42434, new Class[0], Void.TYPE);
            return;
        }
        this.mRefreshLayout.setRefreshing(true);
        d(false);
    }
}
