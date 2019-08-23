package com.ss.android.ugc.aweme.miniapp.card;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55649a;

    /* renamed from: b  reason: collision with root package name */
    private final MicroAppVideoCardView f55650b;

    i(MicroAppVideoCardView microAppVideoCardView) {
        this.f55650b = microAppVideoCardView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f55649a, false, 59200, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55649a, false, 59200, new Class[0], Void.TYPE);
            return;
        }
        MicroAppVideoCardView microAppVideoCardView = this.f55650b;
        microAppVideoCardView.l = false;
        microAppVideoCardView.setVisibility(8);
    }
}
