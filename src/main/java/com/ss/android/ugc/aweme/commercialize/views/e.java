package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40070a;

    /* renamed from: b  reason: collision with root package name */
    private final AdHalfWebPageContainer f40071b;

    e(AdHalfWebPageContainer adHalfWebPageContainer) {
        this.f40071b = adHalfWebPageContainer;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40070a, false, 32763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40070a, false, 32763, new Class[0], Void.TYPE);
            return;
        }
        this.f40071b.f39876b = true;
    }
}
