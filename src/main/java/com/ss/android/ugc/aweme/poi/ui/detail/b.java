package com.ss.android.ugc.aweme.poi.ui.detail;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60701a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiDetailFragment f60702b;

    b(PoiDetailFragment poiDetailFragment) {
        this.f60702b = poiDetailFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60701a, false, 66359, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60701a, false, 66359, new Class[0], Void.TYPE);
            return;
        }
        this.f60702b.S();
    }
}
