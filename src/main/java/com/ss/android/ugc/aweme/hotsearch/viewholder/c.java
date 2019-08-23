package com.ss.android.ugc.aweme.hotsearch.viewholder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;

public final /* synthetic */ class c implements AnimatedImageView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49963a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListVideoItemViewHolder f49964b;

    c(RankingListVideoItemViewHolder rankingListVideoItemViewHolder) {
        this.f49964b = rankingListVideoItemViewHolder;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49963a, false, 49889, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49963a, false, 49889, new Class[0], Void.TYPE);
            return;
        }
        RankingListVideoItemViewHolder rankingListVideoItemViewHolder = this.f49964b;
        rankingListVideoItemViewHolder.h.setUserVisibleHint(true);
        rankingListVideoItemViewHolder.h.b();
    }
}
