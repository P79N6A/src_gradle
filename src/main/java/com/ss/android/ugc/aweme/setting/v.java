package com.ss.android.ugc.aweme.setting;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.q.c;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64463a;

    /* renamed from: b  reason: collision with root package name */
    static SharedPreferences f64464b = c.a(k.a(), "share_setting_preference", 0);

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f64463a, true, 72096, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f64463a, true, 72096, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return f64464b.getBoolean("key_has_setting", false);
    }
}
