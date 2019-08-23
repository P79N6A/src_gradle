package com.ss.android.ugc.aweme.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.k;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40311a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f40311a, true, 33326, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f40311a, true, 33326, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return b.b().c(k.a(), "enable_douyidou_and_shake");
    }
}
