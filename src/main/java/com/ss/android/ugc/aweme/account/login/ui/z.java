package com.ss.android.ugc.aweme.account.login.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;

public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32658a;

    /* renamed from: b  reason: collision with root package name */
    private final ThirdPartyLoginView f32659b;

    z(ThirdPartyLoginView thirdPartyLoginView) {
        this.f32659b = thirdPartyLoginView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f32658a, false, 20779, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32658a, false, 20779, new Class[0], Void.TYPE);
            return;
        }
        ThirdPartyLoginView thirdPartyLoginView = this.f32659b;
        thirdPartyLoginView.i.setTranslationY((float) ((u.a(16.0d) + thirdPartyLoginView.g.getHeight()) * -1));
    }
}
