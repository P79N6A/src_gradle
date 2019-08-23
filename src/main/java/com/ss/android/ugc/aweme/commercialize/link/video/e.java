package com.ss.android.ugc.aweme.commercialize.link.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38999a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceTagLayout f39000b;

    /* renamed from: c  reason: collision with root package name */
    private final o f39001c;

    e(CommerceTagLayout commerceTagLayout, o oVar) {
        this.f39000b = commerceTagLayout;
        this.f39001c = oVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38999a, false, 30925, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38999a, false, 30925, new Class[0], Void.TYPE);
            return;
        }
        CommerceTagLayout commerceTagLayout = this.f39000b;
        o oVar = this.f39001c;
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        oVar.c();
    }
}
