package com.ss.android.ugc.aweme.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a extends com.ss.android.ugc.aweme.aj.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63791a;

    /* renamed from: d  reason: collision with root package name */
    private static a f63792d;

    public final void a() {
        this.f2593c = "ab_test_mock_config";
    }

    public static a b() {
        if (PatchProxy.isSupport(new Object[0], null, f63791a, true, 72034, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f63791a, true, 72034, new Class[0], a.class);
        }
        if (f63792d == null) {
            synchronized (a.class) {
                if (f63792d == null) {
                    f63792d = new a();
                }
            }
        }
        return f63792d;
    }
}
