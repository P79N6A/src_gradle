package com.ss.android.ugc.aweme.web.jsbridge.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76756a;

    /* renamed from: b  reason: collision with root package name */
    private final d f76757b;

    f(d dVar) {
        this.f76757b = dVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f76756a, false, 90084, new Class[0], Object.class)) {
            return this.f76757b.b();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f76756a, false, 90084, new Class[0], Object.class);
    }
}
