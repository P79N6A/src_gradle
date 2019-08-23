package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75116a;

    /* renamed from: b  reason: collision with root package name */
    private final d f75117b;

    e(d dVar) {
        this.f75117b = dVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f75116a, false, 58838, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75116a, false, 58838, new Class[0], Void.TYPE);
            return;
        }
        this.f75117b.g();
    }
}
