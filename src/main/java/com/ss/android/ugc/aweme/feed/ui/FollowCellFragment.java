package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.guide.b;
import com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;

public class FollowCellFragment extends BaseCellFeedFragment {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f46195e;

    public final int e() {
        return 1;
    }

    public final String f() {
        return "";
    }

    @NonNull
    public final String k() {
        return "from_follow";
    }

    public final String l() {
        return "homepage_follow";
    }

    public final CellFeedFragmentPanel a() {
        if (PatchProxy.isSupport(new Object[0], this, f46195e, false, 42795, new Class[0], CellFeedFragmentPanel.class)) {
            return (CellFeedFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, f46195e, false, 42795, new Class[0], CellFeedFragmentPanel.class);
        }
        if (this.f3192d == null) {
            this.f3192d = new CellFeedFragmentPanel("homepage_follow", this, this, e());
        }
        return this.f3192d;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46195e, false, 42796, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46195e, false, 42796, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.mStatusView.setBuilder(DmtStatusView.a.a((Context) getActivity()).b(new b(getActivity()).f45382b));
        this.mStatusView.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(C0906R.dimen.lj));
        this.f3192d.a((RecyclerView.OnScrollListener) new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46196a;

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f46196a, false, 42798, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f46196a, false, 42798, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    AwemeAppData.p().ai = false;
                }
            }
        });
    }

    public final int j() {
        Integer num;
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f46195e, false, 42797, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f46195e, false, 42797, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71721, new Class[0], Integer.class)) {
            num = (Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71721, new Class[0], Integer.class);
        } else if (!a.a()) {
            num = 1;
        } else if (a2.f63782f != null) {
            num = a2.f63782f;
        } else {
            AbTestModel d2 = a2.d();
            if (d2 == null) {
                a2.f63782f = 0;
            } else {
                int i2 = d2.followTabStyle;
                if (i2 >= 0 && i2 <= 1) {
                    i = i2;
                }
                a2.f63782f = Integer.valueOf(i);
            }
            num = a2.f63782f;
        }
        return num.intValue();
    }
}
