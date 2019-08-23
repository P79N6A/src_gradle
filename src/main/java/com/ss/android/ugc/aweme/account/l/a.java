package com.ss.android.ugc.aweme.account.l;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32021a;

    public static void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f32021a, true, 21461, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, f32021a, true, 21461, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.monitor.cloudmessage.a.b(str);
    }
}
