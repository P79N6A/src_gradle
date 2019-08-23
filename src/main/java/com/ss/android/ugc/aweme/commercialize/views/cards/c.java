package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.views.BlackMaskLayer;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40052a;

    /* renamed from: b  reason: collision with root package name */
    private final BlackMaskLayer f40053b;

    c(BlackMaskLayer blackMaskLayer) {
        this.f40053b = blackMaskLayer;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40052a, false, 33044, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40052a, false, 33044, new Class[0], Void.TYPE);
            return;
        }
        this.f40053b.setVisibility(8);
    }
}
