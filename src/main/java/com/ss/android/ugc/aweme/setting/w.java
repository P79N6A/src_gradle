package com.ss.android.ugc.aweme.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64465a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f64466b;

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f64465a, true, 72098, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f64465a, true, 72098, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (f64466b) {
            n.a("aweme_share_setting_wrong", new c().a("aweme_share_setting_wrong", str2).b());
        }
    }
}
