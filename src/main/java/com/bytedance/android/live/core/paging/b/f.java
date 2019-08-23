package com.bytedance.android.live.core.paging.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7938a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7939b;

    f(c cVar) {
        this.f7939b = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f7938a, false, 570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f7938a, false, 570, new Class[0], Void.TYPE);
            return;
        }
        this.f7939b.invalidate();
    }
}
