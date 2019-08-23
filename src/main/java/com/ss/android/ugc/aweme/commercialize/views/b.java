package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40008a;

    /* renamed from: b  reason: collision with root package name */
    private final AdHalfWebPageContainer f40009b;

    public b(AdHalfWebPageContainer adHalfWebPageContainer) {
        this.f40009b = adHalfWebPageContainer;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40008a, false, 32759, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40008a, false, 32759, new Class[0], Void.TYPE);
            return;
        }
        this.f40009b.f39876b = false;
    }
}
