package com.ss.android.ugc.aweme.feed.panel;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.adapter.t;
import com.ss.android.ugc.aweme.feed.f.m;
import com.ss.android.ugc.aweme.utils.bg;

class StaggeredNearbyFeedFragmentPanel$1 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45697a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u f45698b;

    StaggeredNearbyFeedFragmentPanel$1(u uVar) {
        this.f45698b = uVar;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f45697a, false, 41936, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f45697a, false, 41936, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (i3 > 20) {
            bg.a(new m(false));
        } else if (i3 < -20) {
            bg.a(new m(true));
        } else {
            if (i3 < 0) {
                View childAt = this.f45698b.mListView.getChildAt(0);
                if (childAt != null && (childAt instanceof t)) {
                    childAt.getLocationOnScreen(this.f45698b.u);
                    if (this.f45698b.u[1] > -100) {
                        bg.a(new m(true));
                    }
                }
            }
        }
    }
}
