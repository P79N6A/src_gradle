package com.ss.android.ugc.aweme.user.util;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ae;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.user.d;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75410a;

    private static SharedPreferences a() {
        if (PatchProxy.isSupport(new Object[0], null, f75410a, true, 87761, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], null, f75410a, true, 87761, new Class[0], SharedPreferences.class);
        }
        return c.a(ae.a(), "aweme_user", 0);
    }

    private static SharedPreferences b() {
        if (PatchProxy.isSupport(new Object[0], null, f75410a, true, 87762, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], null, f75410a, true, 87762, new Class[0], SharedPreferences.class);
        }
        return c.a(ae.a(), "com.ss.spipe_setting", 0);
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75410a, true, 87758, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f75410a, true, 87758, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a().edit().putString("user_info_raw", str2).commit();
    }

    public static d.a b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75410a, true, 87760, new Class[]{String.class}, d.a.class)) {
            return (d.a) PatchProxy.accessDispatch(new Object[]{str2}, null, f75410a, true, 87760, new Class[]{String.class}, d.a.class);
        }
        long j = b().getLong("user_id", 0);
        String string = b().getString("session_key", "");
        String string2 = b().getString("user_name", "");
        boolean z = b().getBoolean("user_verified", false);
        if (!TextUtils.equals(str2, String.valueOf(j))) {
            return null;
        }
        return d.a.a(j, string, string2, z);
    }
}
