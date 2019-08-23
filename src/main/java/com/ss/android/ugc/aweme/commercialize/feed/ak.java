package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;

public final /* synthetic */ class ak implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38803a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate.AnonymousClass3 f38804b;

    ak(CommerceVideoDelegate.AnonymousClass3 r1) {
        this.f38804b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38803a, false, 30723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38803a, false, 30723, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate.AnonymousClass3 r0 = this.f38804b;
        CommerceVideoDelegate.this.oldAdBottomLabelView.t();
        CommerceVideoDelegate.this.n();
    }
}
