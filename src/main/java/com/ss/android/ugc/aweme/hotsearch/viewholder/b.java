package com.ss.android.ugc.aweme.hotsearch.viewholder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;

public final /* synthetic */ class b implements AnimatedImageView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49961a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListVideoItemViewHolder f49962b;

    b(RankingListVideoItemViewHolder rankingListVideoItemViewHolder) {
        this.f49962b = rankingListVideoItemViewHolder;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49961a, false, 49888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49961a, false, 49888, new Class[0], Void.TYPE);
            return;
        }
        RankingListVideoItemViewHolder rankingListVideoItemViewHolder = this.f49962b;
        rankingListVideoItemViewHolder.h.setDrawingCacheEnabled(true);
        rankingListVideoItemViewHolder.h.getDrawingCache();
        if (rankingListVideoItemViewHolder.f49935c != null) {
            rankingListVideoItemViewHolder.f49935c.countDown();
        }
    }
}
