package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.web.d;

public final /* synthetic */ class bt implements ServiceProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75636a;

    /* renamed from: b  reason: collision with root package name */
    private final String f75637b;

    /* renamed from: c  reason: collision with root package name */
    private final d f75638c;

    bt(String str, d dVar) {
        this.f75637b = str;
        this.f75638c = dVar;
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f75636a, false, 88337, new Class[0], Object.class)) {
            return bs.b(this.f75637b, this.f75638c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f75636a, false, 88337, new Class[0], Object.class);
    }
}
