package com.ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.base.sharedpref.f;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.av;

public final class ao {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45046a;

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f45046a, true, 40250, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f45046a, true, 40250, new Class[0], Void.TYPE);
            return;
        }
        c();
        f d2 = e.d();
        d2.b("share_guide_show_times", d2.a("share_guide_show_times", 0) + 1);
    }

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f45046a, true, 40251, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f45046a, true, 40251, new Class[0], String.class);
        }
        String a2 = e.d().a("last_share_type", (String) x.a().J().c());
        if (a.a() || AbTestManager.a().V() || !TextUtils.equals(a2, "chat_merge")) {
            return a2;
        }
        return (String) x.a().J().c();
    }

    public static void c() {
        if (PatchProxy.isSupport(new Object[0], null, f45046a, true, 40254, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f45046a, true, 40254, new Class[0], Void.TYPE);
            return;
        }
        int a2 = av.a(System.currentTimeMillis());
        f d2 = e.d();
        if (d2.a("share_guide_date_day", -1) != a2) {
            d2.b("share_guide_date_day", a2);
            d2.b("share_guide_show_times", 0);
        }
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f45046a, true, 40252, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f45046a, true, 40252, new Class[]{String.class}, Void.TYPE);
            return;
        }
        f d2 = e.d();
        if (a.a() || AbTestManager.a().V() || !"chat_merge".equals(str2)) {
            d2.b("last_share_type", str2);
        }
    }
}
