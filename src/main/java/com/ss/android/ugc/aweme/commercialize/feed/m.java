package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.an;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38842a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38843b;

    m(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38843b = commerceVideoDelegate;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38842a, false, 30692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38842a, false, 30692, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38843b;
        commerceVideoDelegate.commerceGoodHalfCardContainer.setVisibility(8);
        commerceVideoDelegate.oldAdBottomLabelView.t();
        if (PatchProxy.isSupport(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30652, new Class[0], Void.TYPE);
            return;
        }
        commerceVideoDelegate.introContainer.setVisibility(0);
        an.a(commerceVideoDelegate.introContainer, 0.0f, 1.0f, 150);
    }
}
