package com.ss.android.ugc.aweme.commercialize.link.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39051a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceTagLayout f39052b;

    /* renamed from: c  reason: collision with root package name */
    private final o f39053c;

    v(CommerceTagLayout commerceTagLayout, o oVar) {
        this.f39052b = commerceTagLayout;
        this.f39053c = oVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f39051a, false, 30952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39051a, false, 30952, new Class[0], Void.TYPE);
            return;
        }
        CommerceTagLayout commerceTagLayout = this.f39052b;
        o oVar = this.f39053c;
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        oVar.c();
    }
}
