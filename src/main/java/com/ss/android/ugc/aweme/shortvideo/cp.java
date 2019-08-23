package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66125a;

    /* renamed from: b  reason: collision with root package name */
    private final co f66126b;

    cp(co coVar) {
        this.f66126b = coVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66125a, false, 74226, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66125a, false, 74226, new Class[0], Void.TYPE);
            return;
        }
        this.f66126b.f66029c.a();
    }
}
