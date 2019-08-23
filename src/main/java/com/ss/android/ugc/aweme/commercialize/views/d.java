package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40068a;

    /* renamed from: b  reason: collision with root package name */
    private final AdHalfWebPageContainer f40069b;

    public d(AdHalfWebPageContainer adHalfWebPageContainer) {
        this.f40069b = adHalfWebPageContainer;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40068a, false, 32762, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40068a, false, 32762, new Class[0], Void.TYPE);
            return;
        }
        this.f40069b.f39876b = false;
    }
}
