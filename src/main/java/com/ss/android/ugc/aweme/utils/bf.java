package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttplatformsdk.a.a;
import com.ss.android.ugc.aweme.app.k;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class bf {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75614a;

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f75614a, true, 88270, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f75614a, true, 88270, new Class[0], Void.TYPE);
            return;
        }
        String format = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
        String b2 = a.a(k.a()).b("enjoy_today_date", "");
        if (TextUtils.isEmpty(b2) || !b2.equals(format)) {
            a.a(k.a()).a("enjoy_today_date", format);
        }
    }
}
