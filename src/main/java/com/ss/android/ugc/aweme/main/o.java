package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54859a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f54860b;

    o(MainActivity mainActivity) {
        this.f54860b = mainActivity;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f54859a, false, 57205, new Class[0], Object.class)) {
            return this.f54860b.lambda$onDestroy$7$MainActivity();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f54859a, false, 57205, new Class[0], Object.class);
    }
}
