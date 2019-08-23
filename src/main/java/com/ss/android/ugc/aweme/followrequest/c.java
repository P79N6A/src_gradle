package com.ss.android.ugc.aweme.followrequest;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.q;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48258a;

    public static void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f48258a, true, 45307, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f48258a, true, 45307, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        ((q) new q().b(str4).a(str6)).k(str5).e();
    }
}
