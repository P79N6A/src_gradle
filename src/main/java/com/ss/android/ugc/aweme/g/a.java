package com.ss.android.ugc.aweme.g;

import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3353a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f3353a, true, 34620, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f3353a, true, 34620, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.ugc.aweme.framework.core.a.b().f3306d || StringUtils.equal(com.ss.android.ugc.aweme.framework.core.a.b().f3304b, "local_test")) {
            return true;
        }
        return false;
    }
}
