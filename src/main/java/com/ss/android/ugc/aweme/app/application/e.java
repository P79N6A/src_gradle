package com.ss.android.ugc.aweme.app.application;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.net.y;

public final /* synthetic */ class e implements ServiceProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33938a;

    /* renamed from: b  reason: collision with root package name */
    static final ServiceProvider f33939b = new e();

    private e() {
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f33938a, false, 23215, new Class[0], Object.class)) {
            return y.a().b();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f33938a, false, 23215, new Class[0], Object.class);
    }
}
