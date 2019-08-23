package com.ss.android.ugc.aweme.app.application.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.g.a;

public final class b implements AppLog.i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2640a;

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f2640a, false, 23239, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2640a, false, 23239, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a()) {
            z = true;
        }
        return z;
    }
}
