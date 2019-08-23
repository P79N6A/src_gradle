package com.ss.android.ugc.aweme.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75437a;

    public static void a(String str, boolean z, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Byte.valueOf(z ? (byte) 1 : 0), str4}, null, f75437a, true, 87821, new Class[]{String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Byte.valueOf(z), str4}, null, f75437a, true, 87821, new Class[]{String.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        c a2 = c.a().a(PushConstants.WEB_URL, str3).a("errorDesc", str4);
        if (z) {
            n.a("aweme_open_schema_rate", 0, a2.b());
        } else {
            n.a("aweme_open_schema_rate", 1, a2.b());
        }
    }
}
