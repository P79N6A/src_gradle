package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;

public final /* synthetic */ class as implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46523a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageNearByFragment f46524b;

    /* renamed from: c  reason: collision with root package name */
    private final long f46525c;

    as(MainPageNearByFragment mainPageNearByFragment, long j) {
        this.f46524b = mainPageNearByFragment;
        this.f46525c = j;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f46523a, false, 42904, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46523a, false, 42904, new Class[0], Void.TYPE);
            return;
        }
        MainPageNearByFragment mainPageNearByFragment = this.f46524b;
        long j = this.f46525c;
        r.a(mainPageNearByFragment.getContext(), "stay_time", mainPageNearByFragment.n, j, 0);
        mainPageNearByFragment.b(j);
    }
}
