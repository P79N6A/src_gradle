package com.ss.android.ugc.aweme.account.f.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.f.a.c;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31884a;

    /* renamed from: b  reason: collision with root package name */
    private final c.AnonymousClass1 f31885b;

    e(c.AnonymousClass1 r1) {
        this.f31885b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f31884a, false, 20012, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31884a, false, 20012, new Class[0], Void.TYPE);
            return;
        }
        this.f31885b.c();
    }
}
