package com.ss.android.ugc.aweme.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.a;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63851a;

    /* renamed from: d  reason: collision with root package name */
    private static b f63852d;

    public final void a() {
        this.f2593c = "ab_test_config";
    }

    public static b b() {
        if (PatchProxy.isSupport(new Object[0], null, f63851a, true, 72035, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f63851a, true, 72035, new Class[0], b.class);
        }
        if (f63852d == null) {
            synchronized (b.class) {
                if (f63852d == null) {
                    f63852d = new b();
                }
            }
        }
        return f63852d;
    }
}
