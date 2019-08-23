package com.ss.android.ugc.aweme.poi.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60899a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiPureAwemeFeedFragment f60900b;

    /* renamed from: c  reason: collision with root package name */
    private final long f60901c;

    u(PoiPureAwemeFeedFragment poiPureAwemeFeedFragment, long j) {
        this.f60900b = poiPureAwemeFeedFragment;
        this.f60901c = j;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60899a, false, 66116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60899a, false, 66116, new Class[0], Void.TYPE);
            return;
        }
        PoiPureAwemeFeedFragment poiPureAwemeFeedFragment = this.f60900b;
        long j = this.f60901c;
        r.a(poiPureAwemeFeedFragment.getContext(), "stay_time", poiPureAwemeFeedFragment.n, j, 0);
        poiPureAwemeFeedFragment.b(j);
    }
}
