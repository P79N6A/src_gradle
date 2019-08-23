package com.ss.android.ugc.aweme.miniapp.l;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class n implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55855a;

    /* renamed from: b  reason: collision with root package name */
    private final String f55856b;

    n(String str) {
        this.f55856b = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f55855a, false, 59583, new Class[0], Object.class)) {
            return k.f(this.f55856b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f55855a, false, 59583, new Class[0], Object.class);
    }
}
