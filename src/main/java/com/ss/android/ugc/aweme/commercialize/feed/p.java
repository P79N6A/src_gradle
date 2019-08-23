package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38848a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38849b;

    p(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38849b = commerceVideoDelegate;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38848a, false, 30695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38848a, false, 30695, new Class[0], Void.TYPE);
            return;
        }
        this.f38849b.feedAdLayout.setVisibility(8);
    }
}
