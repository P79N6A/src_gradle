package com.ss.android.ugc.aweme.poi.ui.detail;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60699a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiDetailFragment f60700b;

    a(PoiDetailFragment poiDetailFragment) {
        this.f60700b = poiDetailFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60699a, false, 66358, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60699a, false, 66358, new Class[0], Void.TYPE);
            return;
        }
        this.f60700b.mAppBarLayout.b(0);
    }
}
