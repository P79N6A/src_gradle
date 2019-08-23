package com.ss.android.ugc.aweme.commerce.preview.refresh;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37621a;

    /* renamed from: b  reason: collision with root package name */
    private final PtrFrameLayout f37622b;

    b(PtrFrameLayout ptrFrameLayout) {
        this.f37622b = ptrFrameLayout;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f37621a, false, 29151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37621a, false, 29151, new Class[0], Void.TYPE);
            return;
        }
        this.f37622b.b();
    }
}
