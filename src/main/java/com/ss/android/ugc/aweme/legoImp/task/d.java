package com.ss.android.ugc.aweme.legoImp.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;

public final /* synthetic */ class d implements ServiceProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53149a;

    /* renamed from: b  reason: collision with root package name */
    static final ServiceProvider f53150b = new d();

    private d() {
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f53149a, false, 55270, new Class[0], Object.class)) {
            return e.f53152b;
        }
        return PatchProxy.accessDispatch(new Object[0], this, f53149a, false, 55270, new Class[0], Object.class);
    }
}
