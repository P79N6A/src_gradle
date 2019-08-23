package com.ss.android.ugc.aweme.web.jsbridge.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76758a;

    /* renamed from: b  reason: collision with root package name */
    private final d f76759b;

    g(d dVar) {
        this.f76759b = dVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f76758a, false, 90085, new Class[0], Object.class)) {
            return this.f76759b.c();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f76758a, false, 90085, new Class[0], Object.class);
    }
}
