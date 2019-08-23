package com.ss.android.ugc.aweme.main.guide;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.sharedpref.c;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54837a;

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f54837a, true, 58114, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f54837a, true, 58114, new Class[0], c.class);
        }
        return (c) c.a(GlobalContext.getContext(), c.class);
    }
}
