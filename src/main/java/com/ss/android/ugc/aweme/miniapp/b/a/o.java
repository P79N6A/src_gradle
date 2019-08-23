package com.ss.android.ugc.aweme.miniapp.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55564a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f55565b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f55566c;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f55564a, true, 59345, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f55564a, true, 59345, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!f55566c) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f55565b = true;
                    f55566c = true;
                    return f55565b;
                }
            } catch (Exception unused) {
            }
            f55566c = true;
        }
        return f55565b;
    }
}
