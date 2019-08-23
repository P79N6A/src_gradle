package com.ss.android.ugc.aweme.hotsearch.fragment;

import android.arch.lifecycle.Observer;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49758a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListWordFragment f49759b;

    a(RankingListWordFragment rankingListWordFragment) {
        this.f49759b = rankingListWordFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f49758a, false, 49688, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f49758a, false, 49688, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        RankingListWordFragment rankingListWordFragment = this.f49759b;
        RecyclerView h = rankingListWordFragment.h();
        if (h != null) {
            h.post(new d(rankingListWordFragment));
        }
    }
}
