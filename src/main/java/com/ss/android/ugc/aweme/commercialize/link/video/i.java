package com.ss.android.ugc.aweme.commercialize.link.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39011a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceTagLayout f39012b;

    /* renamed from: c  reason: collision with root package name */
    private final o f39013c;

    i(CommerceTagLayout commerceTagLayout, o oVar) {
        this.f39012b = commerceTagLayout;
        this.f39013c = oVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f39011a, false, 30931, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39011a, false, 30931, new Class[0], Void.TYPE);
            return;
        }
        CommerceTagLayout commerceTagLayout = this.f39012b;
        o oVar = this.f39013c;
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        oVar.c();
    }
}
