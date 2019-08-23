package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8053a;

    /* renamed from: b  reason: collision with root package name */
    private final ae f8054b;

    j(ae aeVar) {
        this.f8054b = aeVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f8053a, false, 681, new Class[0], Object.class)) {
            return e.c(this.f8054b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f8053a, false, 681, new Class[0], Object.class);
    }
}
