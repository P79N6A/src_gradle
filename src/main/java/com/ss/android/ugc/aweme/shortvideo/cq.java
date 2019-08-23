package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66127a;

    /* renamed from: b  reason: collision with root package name */
    private final co f66128b;

    cq(co coVar) {
        this.f66128b = coVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66127a, false, 74227, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66127a, false, 74227, new Class[0], Void.TYPE);
            return;
        }
        this.f66128b.f66029c.b();
    }
}
