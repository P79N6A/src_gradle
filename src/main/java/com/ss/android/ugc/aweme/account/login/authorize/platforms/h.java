package com.ss.android.ugc.aweme.account.login.authorize.platforms;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32173a;

    /* renamed from: b  reason: collision with root package name */
    private final g f32174b;

    h(g gVar) {
        this.f32174b = gVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f32173a, false, 20187, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32173a, false, 20187, new Class[0], Void.TYPE);
            return;
        }
        g gVar = this.f32174b;
        if (gVar.f32170d) {
            gVar.a();
        }
    }
}
