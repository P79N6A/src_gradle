package com.ss.android.ugc.aweme.discover.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41998a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListCoverViewHolder f41999b;

    x(RankingListCoverViewHolder rankingListCoverViewHolder) {
        this.f41999b = rankingListCoverViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f41998a, false, 35721, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41998a, false, 35721, new Class[0], Void.TYPE);
            return;
        }
        this.f41999b.j = false;
    }
}
