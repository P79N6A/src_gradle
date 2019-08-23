package com.ss.android.ugc.aweme.miniapp.card;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55643a;

    /* renamed from: b  reason: collision with root package name */
    private final MicroAppVideoCardView f55644b;

    f(MicroAppVideoCardView microAppVideoCardView) {
        this.f55644b = microAppVideoCardView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f55643a, false, 59197, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55643a, false, 59197, new Class[0], Void.TYPE);
            return;
        }
        this.f55644b.l = true;
    }
}
