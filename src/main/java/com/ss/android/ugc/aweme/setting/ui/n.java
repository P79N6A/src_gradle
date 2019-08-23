package com.ss.android.ugc.aweme.setting.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.a;
import com.ss.android.ugc.aweme.setting.b;

public class n extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64440a;

    /* renamed from: d  reason: collision with root package name */
    private static n f64441d;

    public final void a() {
        this.f2593c = "local_ab_test_config";
    }

    public static n b() {
        if (PatchProxy.isSupport(new Object[0], null, f64440a, true, 72538, new Class[0], n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[0], null, f64440a, true, 72538, new Class[0], n.class);
        }
        if (f64441d == null) {
            synchronized (b.class) {
                if (f64441d == null) {
                    f64441d = new n();
                }
            }
        }
        return f64441d;
    }
}
