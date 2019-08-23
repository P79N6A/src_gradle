package com.ss.android.ugc.aweme.poi.ui.detail;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.ui.detail.PoiDetailFragment;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60703a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiDetailFragment.AnonymousClass1 f60704b;

    c(PoiDetailFragment.AnonymousClass1 r1) {
        this.f60704b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60703a, false, 66362, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60703a, false, 66362, new Class[0], Void.TYPE);
            return;
        }
        PoiDetailFragment.this.u.f();
    }
}
