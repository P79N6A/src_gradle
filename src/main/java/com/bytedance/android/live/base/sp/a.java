package com.bytedance.android.live.base.sp;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7784a;

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f7784a, true, 129, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f7784a, true, 129, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context2 != null) {
            SharedPreferences a2 = c.a(context2, "ttlive_sdk_shared_pref_cache", 0);
            if (a2 != null) {
                a2.edit().putLong("key_ttlive_sdk_flow_remind", System.currentTimeMillis()).apply();
            }
        }
    }

    public static boolean b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f7784a, true, 130, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f7784a, true, 130, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (context2 != null) {
            SharedPreferences a2 = c.a(context2, "ttlive_sdk_shared_pref_cache", 0);
            if (a2 != null) {
                if (((int) ((System.currentTimeMillis() - a2.getLong("key_ttlive_sdk_flow_remind", 0)) / 86400000)) <= 30) {
                    return true;
                }
            }
        }
        return false;
    }
}
