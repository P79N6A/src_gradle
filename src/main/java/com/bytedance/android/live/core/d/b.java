package com.bytedance.android.live.core.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7837a;

    public static String a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, null, f7837a, true, 341, new Class[]{String.class}, String.class)) {
            return d.a(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f7837a, true, 341, new Class[]{String.class}, String.class);
    }
}
