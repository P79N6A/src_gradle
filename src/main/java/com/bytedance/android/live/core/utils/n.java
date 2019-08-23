package com.bytedance.android.live.core.utils;

import com.bytedance.android.live.core.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8306a;

    /* renamed from: b  reason: collision with root package name */
    private final q.b f8307b;

    n(q.b bVar) {
        this.f8307b = bVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f8306a, false, 1135, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8306a, false, 1135, new Class[0], Void.TYPE);
        }
    }
}
