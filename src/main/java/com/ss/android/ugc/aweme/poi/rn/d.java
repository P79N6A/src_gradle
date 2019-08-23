package com.ss.android.ugc.aweme.poi.rn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60303a;

    /* renamed from: b  reason: collision with root package name */
    private final c f60304b;

    d(c cVar) {
        this.f60304b = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60303a, false, 65659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60303a, false, 65659, new Class[0], Void.TYPE);
            return;
        }
        this.f60304b.a();
    }
}
