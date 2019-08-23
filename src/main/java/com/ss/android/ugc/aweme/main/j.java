package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54843a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f54844b;

    j(MainActivity mainActivity) {
        this.f54844b = mainActivity;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f54843a, false, 57200, new Class[0], Object.class)) {
            return this.f54844b.lambda$onCreate$2$MainActivity();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f54843a, false, 57200, new Class[0], Object.class);
    }
}
