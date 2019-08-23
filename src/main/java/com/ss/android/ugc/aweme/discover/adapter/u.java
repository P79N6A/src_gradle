package com.ss.android.ugc.aweme.discover.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41977a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListCoverViewHolder f41978b;

    u(RankingListCoverViewHolder rankingListCoverViewHolder) {
        this.f41978b = rankingListCoverViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f41977a, false, 35718, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41977a, false, 35718, new Class[0], Void.TYPE);
            return;
        }
        RankingListCoverViewHolder rankingListCoverViewHolder = this.f41978b;
        rankingListCoverViewHolder.f41703b.setSmoothScrollingEnabled(false);
        rankingListCoverViewHolder.f41703b.fullScroll(66);
        rankingListCoverViewHolder.f41703b.setSmoothScrollingEnabled(true);
    }
}
