package com.ss.android.ugc.aweme.hotsearch.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49766a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListWordFragment f49767b;

    d(RankingListWordFragment rankingListWordFragment) {
        this.f49767b = rankingListWordFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f49766a, false, 49691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49766a, false, 49691, new Class[0], Void.TYPE);
            return;
        }
        this.f49767b.i();
    }
}
