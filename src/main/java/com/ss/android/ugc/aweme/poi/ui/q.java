package com.ss.android.ugc.aweme.poi.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60887a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiOptimizedInfoFragment f60888b;

    q(PoiOptimizedInfoFragment poiOptimizedInfoFragment) {
        this.f60888b = poiOptimizedInfoFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60887a, false, 66075, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60887a, false, 66075, new Class[0], Void.TYPE);
            return;
        }
        this.f60888b.U();
    }
}
