package com.bytedance.android.live.core.utils;

import com.bytedance.android.live.core.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8304a;

    /* renamed from: b  reason: collision with root package name */
    private final q.b f8305b;

    m(q.b bVar) {
        this.f8305b = bVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f8304a, false, 1134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8304a, false, 1134, new Class[0], Void.TYPE);
            return;
        }
        this.f8305b.a(null);
    }
}
