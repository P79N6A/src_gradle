package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38781a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38782b;

    aa(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38782b = commerceVideoDelegate;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38781a, false, 30706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38781a, false, 30706, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38782b;
        commerceVideoDelegate.n = -1;
        commerceVideoDelegate.m = -1;
        if ((commerceVideoDelegate.w == null || !commerceVideoDelegate.w.c()) && commerceVideoDelegate.adHalfWebPageContainer != null && commerceVideoDelegate.adHalfWebPageContainer.b()) {
            commerceVideoDelegate.g();
        }
    }
}
