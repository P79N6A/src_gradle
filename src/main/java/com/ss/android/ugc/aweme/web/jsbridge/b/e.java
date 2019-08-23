package com.ss.android.ugc.aweme.web.jsbridge.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76754a;

    /* renamed from: b  reason: collision with root package name */
    private final d f76755b;

    e(d dVar) {
        this.f76755b = dVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f76754a, false, 90083, new Class[0], Object.class)) {
            return this.f76755b.e();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f76754a, false, 90083, new Class[0], Object.class);
    }
}
