package com.ss.android.ugc.aweme.commercialize.link.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39065a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceTagLayout f39066b;

    /* renamed from: c  reason: collision with root package name */
    private final o f39067c;

    z(CommerceTagLayout commerceTagLayout, o oVar) {
        this.f39066b = commerceTagLayout;
        this.f39067c = oVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f39065a, false, 30961, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39065a, false, 30961, new Class[0], Void.TYPE);
            return;
        }
        CommerceTagLayout commerceTagLayout = this.f39066b;
        o oVar = this.f39067c;
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        oVar.c();
    }
}
