package com.ss.android.ugc.aweme.commercialize.link.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39037a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceTagLayout f39038b;

    /* renamed from: c  reason: collision with root package name */
    private final o f39039c;

    r(CommerceTagLayout commerceTagLayout, o oVar) {
        this.f39038b = commerceTagLayout;
        this.f39039c = oVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f39037a, false, 30946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39037a, false, 30946, new Class[0], Void.TYPE);
            return;
        }
        CommerceTagLayout commerceTagLayout = this.f39038b;
        o oVar = this.f39039c;
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        oVar.c();
    }
}
