package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46678a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedFragment f46679b;

    /* renamed from: c  reason: collision with root package name */
    private final long f46680c;

    m(FeedFragment feedFragment, long j) {
        this.f46679b = feedFragment;
        this.f46680c = j;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f46678a, false, 42627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46678a, false, 42627, new Class[0], Void.TYPE);
            return;
        }
        FeedFragment feedFragment = this.f46679b;
        long j = this.f46680c;
        r.a(feedFragment.getContext(), "stay_time", feedFragment.n, j, 0);
        feedFragment.b(j);
    }
}
