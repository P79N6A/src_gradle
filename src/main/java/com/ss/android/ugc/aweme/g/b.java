package com.ss.android.ugc.aweme.g;

import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49504a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f49504a, true, 34621, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f49504a, true, 34621, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (i.a() == null || !StringUtils.equal(i.a().getChannel(), "local_test")) {
            return false;
        }
        return true;
    }
}
