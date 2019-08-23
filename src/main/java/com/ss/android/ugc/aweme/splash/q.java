package com.ss.android.ugc.aweme.splash;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71619a;

    /* renamed from: b  reason: collision with root package name */
    private final TransitActivity f71620b;

    q(TransitActivity transitActivity) {
        this.f71620b = transitActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f71619a, false, 81957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71619a, false, 81957, new Class[0], Void.TYPE);
            return;
        }
        this.f71620b.finish();
    }
}
