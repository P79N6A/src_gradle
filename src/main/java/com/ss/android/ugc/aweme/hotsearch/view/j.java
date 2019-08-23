package com.ss.android.ugc.aweme.hotsearch.view;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.adapter.BaseHotSearchAdapter;
import com.ss.android.ugc.aweme.hotsearch.adapter.SingleHotSearchStarAdapter;
import com.ss.android.ugc.aweme.hotsearch.b.k;
import com.ss.android.ugc.aweme.hotsearch.fragment.BaseRankingListFragment;

public final class j extends a<k> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f49899f;

    /* access modifiers changed from: package-private */
    public final BaseHotSearchAdapter f() {
        if (!PatchProxy.isSupport(new Object[0], this, f49899f, false, 49862, new Class[0], BaseHotSearchAdapter.class)) {
            return new SingleHotSearchStarAdapter(this.f49867b, (f) this.f49868c);
        }
        return (BaseHotSearchAdapter) PatchProxy.accessDispatch(new Object[0], this, f49899f, false, 49862, new Class[0], BaseHotSearchAdapter.class);
    }

    public j(View view, Context context, BaseRankingListFragment baseRankingListFragment) {
        super(view, context, baseRankingListFragment);
    }
}