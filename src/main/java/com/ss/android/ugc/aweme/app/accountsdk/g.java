package com.ss.android.ugc.aweme.app.accountsdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.login.a.b;
import com.ss.android.ugc.aweme.utils.bg;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33728a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f33729b = new g();

    private g() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f33728a, false, 22994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33728a, false, 22994, new Class[0], Void.TYPE);
            return;
        }
        bg.a(new b());
    }
}
