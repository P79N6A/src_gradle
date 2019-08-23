package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40006a;

    /* renamed from: b  reason: collision with root package name */
    private final AdHalfWebPageContainer f40007b;

    public a(AdHalfWebPageContainer adHalfWebPageContainer) {
        this.f40007b = adHalfWebPageContainer;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40006a, false, 32758, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40006a, false, 32758, new Class[0], Void.TYPE);
            return;
        }
        this.f40007b.f39876b = true;
    }
}
