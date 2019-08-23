package com.ss.android.ugc.aweme.app;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.b;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2663a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f2664b = new l();

    private l() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f2663a, false, 22314, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2663a, false, 22314, new Class[0], Void.TYPE);
            return;
        }
        if (!b.a().f34110b) {
            k.a(-1);
        }
    }
}
