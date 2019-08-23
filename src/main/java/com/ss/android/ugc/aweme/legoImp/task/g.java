package com.ss.android.ugc.aweme.legoImp.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.app.AbTestSdkInitTask;
import com.ss.android.ugc.aweme.lego.LegoTask;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3414a;

    /* renamed from: b  reason: collision with root package name */
    private static LegoTask f3415b;

    /* renamed from: c  reason: collision with root package name */
    private static LegoTask f3416c;

    /* renamed from: d  reason: collision with root package name */
    private static LegoTask f3417d;

    public static LegoTask a() {
        if (PatchProxy.isSupport(new Object[0], null, f3414a, true, 55317, new Class[0], LegoTask.class)) {
            return (LegoTask) PatchProxy.accessDispatch(new Object[0], null, f3414a, true, 55317, new Class[0], LegoTask.class);
        }
        if (f3415b == null) {
            f3415b = new FrescoTask();
        }
        return f3415b;
    }

    public static LegoTask b() {
        if (PatchProxy.isSupport(new Object[0], null, f3414a, true, 55318, new Class[0], LegoTask.class)) {
            return (LegoTask) PatchProxy.accessDispatch(new Object[0], null, f3414a, true, 55318, new Class[0], LegoTask.class);
        }
        if (f3416c == null) {
            f3416c = new IndexServiceRouterTask();
        }
        return f3416c;
    }

    public static LegoTask c() {
        if (PatchProxy.isSupport(new Object[0], null, f3414a, true, 55319, new Class[0], LegoTask.class)) {
            return (LegoTask) PatchProxy.accessDispatch(new Object[0], null, f3414a, true, 55319, new Class[0], LegoTask.class);
        }
        if (f3417d == null) {
            f3417d = new AbTestSdkInitTask();
        }
        return f3417d;
    }
}
