package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38844a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38845b;

    n(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38845b = commerceVideoDelegate;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38844a, false, 30693, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38844a, false, 30693, new Class[0], Void.TYPE);
            return;
        }
        this.f38845b.introContainer.setVisibility(4);
    }
}
