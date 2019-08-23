package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.web.d;

public final /* synthetic */ class bu implements ServiceProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75639a;

    /* renamed from: b  reason: collision with root package name */
    private final String f75640b;

    /* renamed from: c  reason: collision with root package name */
    private final d f75641c;

    bu(String str, d dVar) {
        this.f75640b = str;
        this.f75641c = dVar;
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f75639a, false, 88338, new Class[0], Object.class)) {
            return bs.a(this.f75640b, this.f75641c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f75639a, false, 88338, new Class[0], Object.class);
    }
}
