package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8055a;

    /* renamed from: b  reason: collision with root package name */
    private final ae f8056b;

    k(ae aeVar) {
        this.f8056b = aeVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f8055a, false, 682, new Class[0], Object.class)) {
            return e.b(this.f8056b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f8055a, false, 682, new Class[0], Object.class);
    }
}
