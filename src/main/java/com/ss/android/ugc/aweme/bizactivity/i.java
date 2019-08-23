package com.ss.android.ugc.aweme.bizactivity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35239a;

    /* renamed from: b  reason: collision with root package name */
    private final BizActivityViewModel f35240b;

    i(BizActivityViewModel bizActivityViewModel) {
        this.f35240b = bizActivityViewModel;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f35239a, false, 25703, new Class[0], Object.class)) {
            return (h) this.f35240b.f2799c.getActivityInfo().get();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f35239a, false, 25703, new Class[0], Object.class);
    }
}
