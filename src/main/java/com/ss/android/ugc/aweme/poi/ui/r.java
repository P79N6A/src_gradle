package com.ss.android.ugc.aweme.poi.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.ui.PoiOptimizedInfoFragment;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60889a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiOptimizedInfoFragment.AnonymousClass1 f60890b;

    r(PoiOptimizedInfoFragment.AnonymousClass1 r1) {
        this.f60890b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60889a, false, 66079, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60889a, false, 66079, new Class[0], Void.TYPE);
            return;
        }
        PoiOptimizedInfoFragment.this.u.f();
    }
}
