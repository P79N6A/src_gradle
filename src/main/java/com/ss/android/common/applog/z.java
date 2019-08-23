package com.ss.android.common.applog;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28227a;

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f28227a, true, 15634, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f28227a, true, 15634, new Class[0], String.class);
        }
        return AppLog.getServerDeviceId();
    }

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f28227a, true, 15636, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f28227a, true, 15636, new Class[0], String.class);
        }
        return AppLog.getInstallId();
    }

    public static void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f28227a, true, 15613, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f28227a, true, 15613, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        AppLog.onActivityCreate(context);
    }
}
