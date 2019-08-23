package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;

public final class cj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75688a;

    public static void a(int i, String str, String str2) {
        ck.a(i, str, str2);
    }

    public static void a(String str, a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, null, f75688a, true, 88377, new Class[]{String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar}, null, f75688a, true, 88377, new Class[]{String.class, a.class}, Void.TYPE);
            return;
        }
        ck.a(str, aVar);
    }
}
