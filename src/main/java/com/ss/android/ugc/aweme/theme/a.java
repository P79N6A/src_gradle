package com.ss.android.ugc.aweme.theme;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74538a;

    public static boolean a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f74538a, true, 86741, new Class[]{Context.class}, Boolean.TYPE)) {
            return a(context2, "is_user_theme", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f74538a, true, 86741, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }

    private static boolean a(Context context, String str, boolean z) {
        Context context2 = context;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context2, str2, (byte) 0}, null, f74538a, true, 86737, new Class[]{Context.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return c.a(context2, "share_theme_data", 0).getBoolean(str2, false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2, (byte) 0}, null, f74538a, true, 86737, new Class[]{Context.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
