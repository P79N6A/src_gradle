package com.ss.android.ugc.aweme.hotsearch.view;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.HotSearchMusicItem;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.adapter.BaseHotSearchAdapter;
import com.ss.android.ugc.aweme.hotsearch.adapter.SingleHotSearchMusicAdapter;
import com.ss.android.ugc.aweme.hotsearch.d.c;
import com.ss.android.ugc.aweme.hotsearch.fragment.BaseRankingListFragment;

public final class i extends a<HotSearchMusicItem> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f49898f;

    /* access modifiers changed from: package-private */
    public final BaseHotSearchAdapter f() {
        if (!PatchProxy.isSupport(new Object[0], this, f49898f, false, 49861, new Class[0], BaseHotSearchAdapter.class)) {
            return new SingleHotSearchMusicAdapter(this.f49867b, (f) this.f49868c, (c.b) this.f49868c);
        }
        return (BaseHotSearchAdapter) PatchProxy.accessDispatch(new Object[0], this, f49898f, false, 49861, new Class[0], BaseHotSearchAdapter.class);
    }

    public i(View view, Context context, BaseRankingListFragment baseRankingListFragment) {
        super(view, context, baseRankingListFragment);
    }
}
