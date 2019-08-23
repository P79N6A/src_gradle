package com.ss.android.ugc.aweme.sec;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import okhttp3.Interceptor;

public final class h implements b<Interceptor> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3850a;

    public final /* synthetic */ Object a() {
        if (!PatchProxy.isSupport(new Object[0], this, f3850a, false, 71107, new Class[0], Interceptor.class)) {
            return new i();
        }
        return (Interceptor) PatchProxy.accessDispatch(new Object[0], this, f3850a, false, 71107, new Class[0], Interceptor.class);
    }
}
