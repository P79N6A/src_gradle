package com.ss.android.ugc.aweme.account.f.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31889a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31890b;

    b(boolean z) {
        this.f31890b = z;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f31889a, false, 20014, new Class[0], Object.class)) {
            return a.a(this.f31890b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f31889a, false, 20014, new Class[0], Object.class);
    }
}
