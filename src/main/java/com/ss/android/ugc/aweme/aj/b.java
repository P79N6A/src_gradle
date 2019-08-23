package com.ss.android.ugc.aweme.aj;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2594a;

    /* renamed from: d  reason: collision with root package name */
    private static b f2595d;

    public final void a() {
        this.f2593c = "default_config";
    }

    public static b b() {
        if (PatchProxy.isSupport(new Object[0], null, f2594a, true, 73868, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f2594a, true, 73868, new Class[0], b.class);
        }
        if (f2595d == null) {
            synchronized (b.class) {
                if (f2595d == null) {
                    f2595d = new b();
                }
            }
        }
        return f2595d;
    }
}
