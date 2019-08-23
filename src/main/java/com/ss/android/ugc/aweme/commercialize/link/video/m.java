package com.ss.android.ugc.aweme.commercialize.link.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39025a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceTagLayout f39026b;

    /* renamed from: c  reason: collision with root package name */
    private final o f39027c;

    m(CommerceTagLayout commerceTagLayout, o oVar) {
        this.f39026b = commerceTagLayout;
        this.f39027c = oVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f39025a, false, 30940, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39025a, false, 30940, new Class[0], Void.TYPE);
            return;
        }
        CommerceTagLayout commerceTagLayout = this.f39026b;
        o oVar = this.f39027c;
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        oVar.c();
    }
}
