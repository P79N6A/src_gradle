package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.dm;

public final /* synthetic */ class dn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62674a;

    /* renamed from: b  reason: collision with root package name */
    private final dm.AnonymousClass2 f62675b;

    dn(dm.AnonymousClass2 r1) {
        this.f62675b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62674a, false, 68997, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62674a, false, 68997, new Class[0], Void.TYPE);
            return;
        }
        dm.this.dismiss();
    }
}
