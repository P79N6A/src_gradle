package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40072a;

    /* renamed from: b  reason: collision with root package name */
    private final AdHalfWebPageContainer f40073b;

    f(AdHalfWebPageContainer adHalfWebPageContainer) {
        this.f40073b = adHalfWebPageContainer;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40072a, false, 32764, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40072a, false, 32764, new Class[0], Void.TYPE);
            return;
        }
        AdHalfWebPageContainer adHalfWebPageContainer = this.f40073b;
        adHalfWebPageContainer.f39876b = false;
        adHalfWebPageContainer.setVisibility(8);
    }
}
