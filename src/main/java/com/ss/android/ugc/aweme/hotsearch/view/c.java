package com.ss.android.ugc.aweme.hotsearch.view;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.HotSearchMusicItem;
import com.ss.android.ugc.aweme.hotsearch.adapter.BaseHotSearchAdapter;
import com.ss.android.ugc.aweme.hotsearch.adapter.RankingListMusicAdaper;
import com.ss.android.ugc.aweme.hotsearch.fragment.RankingListMusicFragment;

public final class c extends a<HotSearchMusicItem> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f49874f;

    /* access modifiers changed from: package-private */
    public final BaseHotSearchAdapter f() {
        if (!PatchProxy.isSupport(new Object[0], this, f49874f, false, 49840, new Class[0], BaseHotSearchAdapter.class)) {
            return new RankingListMusicAdaper(this.f49867b, (RankingListMusicFragment) this.f49868c, (RankingListMusicFragment) this.f49868c);
        }
        return (BaseHotSearchAdapter) PatchProxy.accessDispatch(new Object[0], this, f49874f, false, 49840, new Class[0], BaseHotSearchAdapter.class);
    }

    public c(View view, Context context, RankingListMusicFragment rankingListMusicFragment) {
        super(view, context, rankingListMusicFragment);
    }
}
