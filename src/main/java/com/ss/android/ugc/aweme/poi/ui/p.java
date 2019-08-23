package com.ss.android.ugc.aweme.poi.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.sothree.slidinguppanel.SlidingUpPanelLayout;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60825a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiOptimizedInfoFragment f60826b;

    p(PoiOptimizedInfoFragment poiOptimizedInfoFragment) {
        this.f60826b = poiOptimizedInfoFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60825a, false, 66074, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60825a, false, 66074, new Class[0], Void.TYPE);
            return;
        }
        this.f60826b.mSlideUpPanelLayout.setPanelState(SlidingUpPanelLayout.d.COLLAPSED);
    }
}
