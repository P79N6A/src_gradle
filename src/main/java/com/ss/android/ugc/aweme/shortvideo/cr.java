package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cr implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66129a;

    /* renamed from: b  reason: collision with root package name */
    private final co f66130b;

    cr(co coVar) {
        this.f66130b = coVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66129a, false, 74228, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66129a, false, 74228, new Class[0], Void.TYPE);
            return;
        }
        this.f66130b.f66029c.c();
    }
}
