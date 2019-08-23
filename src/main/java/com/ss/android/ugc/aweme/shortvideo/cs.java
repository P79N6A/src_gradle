package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cs implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66131a;

    /* renamed from: b  reason: collision with root package name */
    private final co f66132b;

    cs(co coVar) {
        this.f66132b = coVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66131a, false, 74229, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66131a, false, 74229, new Class[0], Void.TYPE);
            return;
        }
        this.f66132b.f66029c.d();
    }
}
