package com.ss.android.ugc.aweme.hotsearch.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;

public final /* synthetic */ class c implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49763a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListWordFragment f49764b;

    /* renamed from: c  reason: collision with root package name */
    private final HotSearchItem f49765c;

    c(RankingListWordFragment rankingListWordFragment, HotSearchItem hotSearchItem) {
        this.f49764b = rankingListWordFragment;
        this.f49765c = hotSearchItem;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f49763a, false, 49690, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f49763a, false, 49690, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        RankingListWordFragment rankingListWordFragment = this.f49764b;
        d.a(str, str2, j).b("track_url").a("track_ad").f("show").a(this.f49765c.getAdData()).a(rankingListWordFragment.getContext());
    }
}
