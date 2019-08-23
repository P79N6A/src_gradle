package com.ss.android.ugc.aweme.web.jsbridge.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76760a;

    /* renamed from: b  reason: collision with root package name */
    private final d f76761b;

    h(d dVar) {
        this.f76761b = dVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f76760a, false, 90086, new Class[0], Object.class)) {
            return this.f76761b.d();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f76760a, false, 90086, new Class[0], Object.class);
    }
}
