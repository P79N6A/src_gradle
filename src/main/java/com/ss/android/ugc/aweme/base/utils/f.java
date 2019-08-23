package com.ss.android.ugc.aweme.base.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35020a;

    public static boolean a(Class cls, Class cls2) {
        Class cls3 = cls;
        Class cls4 = cls2;
        if (!PatchProxy.isSupport(new Object[]{cls3, cls4}, null, f35020a, true, 25199, new Class[]{Class.class, Class.class}, Boolean.TYPE)) {
            return cls4.isAssignableFrom(cls3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{cls3, cls4}, null, f35020a, true, 25199, new Class[]{Class.class, Class.class}, Boolean.TYPE)).booleanValue();
    }
}
