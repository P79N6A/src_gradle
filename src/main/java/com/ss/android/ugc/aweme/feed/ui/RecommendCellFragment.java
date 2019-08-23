package com.ss.android.ugc.aweme.feed.ui;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public class RecommendCellFragment extends BaseCellFeedFragment {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f46282e;

    public final int e() {
        return 0;
    }

    public final String f() {
        return "timeline_list";
    }

    @NonNull
    public final String k() {
        return "from_hot";
    }

    public final String l() {
        return "homepage_hot";
    }

    public final CellFeedFragmentPanel a() {
        if (PatchProxy.isSupport(new Object[0], this, f46282e, false, 42987, new Class[0], CellFeedFragmentPanel.class)) {
            return (CellFeedFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, f46282e, false, 42987, new Class[0], CellFeedFragmentPanel.class);
        }
        if (this.f3192d == null) {
            this.f3192d = new CellFeedFragmentPanel("homepage_hot", this, this, e());
        }
        return this.f3192d;
    }

    public final int j() {
        if (!PatchProxy.isSupport(new Object[0], this, f46282e, false, 42988, new Class[0], Integer.TYPE)) {
            return AbTestManager.a().v();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f46282e, false, 42988, new Class[0], Integer.TYPE)).intValue();
    }
}
