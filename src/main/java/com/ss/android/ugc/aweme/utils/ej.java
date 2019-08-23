package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ej {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75822a;

    public static boolean a(Context context, String str) {
        if (PatchProxy.isSupport(new Object[]{context, str}, null, f75822a, true, 88614, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, null, f75822a, true, 88614, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return b(context, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(Context context, String str) {
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f75822a, true, 88615, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f75822a, true, 88615, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (context != null && !StringUtils.isEmpty(str)) {
            try {
                if (context.getPackageManager().getPackageInfo(str2, 64) != null) {
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }
}
