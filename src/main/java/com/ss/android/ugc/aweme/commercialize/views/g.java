package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40104a;

    /* renamed from: b  reason: collision with root package name */
    private final AdHalfWebPageContainer f40105b;

    g(AdHalfWebPageContainer adHalfWebPageContainer) {
        this.f40105b = adHalfWebPageContainer;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40104a, false, 32765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40104a, false, 32765, new Class[0], Void.TYPE);
            return;
        }
        this.f40105b.f39876b = true;
    }
}
