package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38846a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38847b;

    o(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38847b = commerceVideoDelegate;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38846a, false, 30694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38846a, false, 30694, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38847b;
        commerceVideoDelegate.oldAdBottomLabelView.t();
        commerceVideoDelegate.n();
    }
}
