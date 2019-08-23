package com.ss.android.ugc.aweme.miniapp.card;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55645a;

    /* renamed from: b  reason: collision with root package name */
    private final MicroAppVideoCardView f55646b;

    g(MicroAppVideoCardView microAppVideoCardView) {
        this.f55646b = microAppVideoCardView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f55645a, false, 59198, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55645a, false, 59198, new Class[0], Void.TYPE);
            return;
        }
        this.f55646b.l = false;
    }
}
