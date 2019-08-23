package com.ss.android.ugc.aweme.profile.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61340a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61341b;

    g(String str) {
        this.f61341b = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f61340a, false, 67464, new Class[0], Object.class)) {
            return d.b(this.f61341b, true, null);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f61340a, false, 67464, new Class[0], Object.class);
    }
}
