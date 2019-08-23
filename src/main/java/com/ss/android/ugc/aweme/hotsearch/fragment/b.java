package com.ss.android.ugc.aweme.hotsearch.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;

public final /* synthetic */ class b implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49760a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListWordFragment f49761b;

    /* renamed from: c  reason: collision with root package name */
    private final HotSearchItem f49762c;

    b(RankingListWordFragment rankingListWordFragment, HotSearchItem hotSearchItem) {
        this.f49761b = rankingListWordFragment;
        this.f49762c = hotSearchItem;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f49760a, false, 49689, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f49760a, false, 49689, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        RankingListWordFragment rankingListWordFragment = this.f49761b;
        d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(this.f49762c.getAdData()).a(rankingListWordFragment.getContext());
    }
}
