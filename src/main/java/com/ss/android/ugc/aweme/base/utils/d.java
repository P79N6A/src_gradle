package com.ss.android.ugc.aweme.base.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35017a;

    public static Context a() {
        if (PatchProxy.isSupport(new Object[0], null, f35017a, true, 25197, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], null, f35017a, true, 25197, new Class[0], Context.class);
        }
        return k.a();
    }
}
