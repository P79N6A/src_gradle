package com.ss.android.ugc.aweme.hotsearch.view;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.hotsearch.adapter.BaseHotSearchAdapter;
import com.ss.android.ugc.aweme.hotsearch.adapter.RankingListWordAdapter;
import com.ss.android.ugc.aweme.hotsearch.fragment.RankingListWordFragment;

public final class m extends a<HotSearchItem> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f49902f;

    /* access modifiers changed from: package-private */
    public final BaseHotSearchAdapter f() {
        if (!PatchProxy.isSupport(new Object[0], this, f49902f, false, 49866, new Class[0], BaseHotSearchAdapter.class)) {
            return new RankingListWordAdapter(this.f49867b, (RankingListWordFragment) this.f49868c);
        }
        return (BaseHotSearchAdapter) PatchProxy.accessDispatch(new Object[0], this, f49902f, false, 49866, new Class[0], BaseHotSearchAdapter.class);
    }

    public m(View view, Context context, RankingListWordFragment rankingListWordFragment) {
        super(view, context, rankingListWordFragment);
    }
}
