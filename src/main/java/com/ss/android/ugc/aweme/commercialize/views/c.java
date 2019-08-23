package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40010a;

    /* renamed from: b  reason: collision with root package name */
    private final AdHalfWebPageContainer f40011b;

    public c(AdHalfWebPageContainer adHalfWebPageContainer) {
        this.f40011b = adHalfWebPageContainer;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40010a, false, 32761, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40010a, false, 32761, new Class[0], Void.TYPE);
            return;
        }
        this.f40011b.f39876b = true;
    }
}
