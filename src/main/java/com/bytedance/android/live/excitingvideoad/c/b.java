package com.bytedance.android.live.excitingvideoad.c;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8384a;

    public static boolean a(Context context, String str) {
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f8384a, true, 1642, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f8384a, true, 1642, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                if (context.getPackageManager().getPackageInfo(str2, 16777216) != null) {
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }
}
