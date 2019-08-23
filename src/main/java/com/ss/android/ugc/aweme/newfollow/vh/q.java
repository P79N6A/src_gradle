package com.ss.android.ugc.aweme.newfollow.vh;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57751a;

    /* renamed from: b  reason: collision with root package name */
    private final n f57752b;

    q(n nVar) {
        this.f57752b = nVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f57751a, false, 62288, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57751a, false, 62288, new Class[0], Void.TYPE);
            return;
        }
        this.f57752b.t();
    }
}
