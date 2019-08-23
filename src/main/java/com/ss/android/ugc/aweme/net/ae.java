package com.ss.android.ugc.aweme.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ae implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56903a;

    /* renamed from: b  reason: collision with root package name */
    private final ad f56904b;

    ae(ad adVar) {
        this.f56904b = adVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f56903a, false, 60807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56903a, false, 60807, new Class[0], Void.TYPE);
            return;
        }
        this.f56904b.f56898f.cancel();
    }
}
