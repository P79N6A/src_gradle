package com.ss.android.ugc.aweme.crossplatform.business;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40765a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsShareBusiness f40766b;

    b(AbsShareBusiness absShareBusiness) {
        this.f40766b = absShareBusiness;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f40765a, false, 34226, new Class[0], Object.class)) {
            return this.f40766b.d();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f40765a, false, 34226, new Class[0], Object.class);
    }
}
