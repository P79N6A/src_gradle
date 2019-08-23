package com.ss.android.ugc.aweme.o;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;

public final /* synthetic */ class g implements ServiceProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3711a;

    /* renamed from: b  reason: collision with root package name */
    private final IAVServiceProxy f3712b;

    public g(IAVServiceProxy iAVServiceProxy) {
        this.f3712b = iAVServiceProxy;
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f3711a, false, 54509, new Class[0], Object.class)) {
            return this.f3712b;
        }
        return PatchProxy.accessDispatch(new Object[0], this, f3711a, false, 54509, new Class[0], Object.class);
    }
}
