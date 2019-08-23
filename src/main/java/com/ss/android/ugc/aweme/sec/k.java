package com.ss.android.ugc.aweme.sec;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import okhttp3.Interceptor;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3851a;

    /* renamed from: b  reason: collision with root package name */
    public static b<Interceptor> f3852b;

    public static Interceptor a() {
        if (PatchProxy.isSupport(new Object[0], null, f3851a, true, 71120, new Class[0], Interceptor.class)) {
            return (Interceptor) PatchProxy.accessDispatch(new Object[0], null, f3851a, true, 71120, new Class[0], Interceptor.class);
        }
        if (f3852b == null) {
            return null;
        }
        return (Interceptor) f3852b.a();
    }
}
