package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.an;

public final /* synthetic */ class ah implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38797a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38798b;

    public ah(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38798b = commerceVideoDelegate;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38797a, false, 30713, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38797a, false, 30713, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38798b;
        if (PatchProxy.isSupport(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30651, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30651, new Class[0], Void.TYPE);
        } else {
            an.a(commerceVideoDelegate.introContainer, 1.0f, 0.0f, 150);
            commerceVideoDelegate.introContainer.postDelayed(new n(commerceVideoDelegate), 150);
        }
        commerceVideoDelegate.oldAdBottomLabelView.s();
        commerceVideoDelegate.commerceGoodHalfCardContainer.postDelayed(new x(commerceVideoDelegate), 180);
    }
}
