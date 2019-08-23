package com.ss.android.ugc.aweme.miniapp.card;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55647a;

    /* renamed from: b  reason: collision with root package name */
    private final MicroAppVideoCardView f55648b;

    h(MicroAppVideoCardView microAppVideoCardView) {
        this.f55648b = microAppVideoCardView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f55647a, false, 59199, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55647a, false, 59199, new Class[0], Void.TYPE);
            return;
        }
        this.f55648b.l = true;
    }
}
