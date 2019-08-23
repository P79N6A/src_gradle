package com.ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35049a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f35050b = "s";

    public static String a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f35049a, true, 25289, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f35049a, true, 25289, new Class[]{Context.class}, String.class);
        } else if (context2 == null) {
            return "-1";
        } else {
            return ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        }
    }

    public static int b(Context context) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{context}, null, f35049a, true, 25290, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f35049a, true, 25290, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        String a2 = a(context);
        if ("46000".equals(a2) || "46002".equals(a2) || "46007".equals(a2)) {
            i = 3;
        } else if ("46001".equals(a2) || "46006".equals(a2)) {
            i = 2;
        } else if (!"46003".equals(a2) && !"46005".equals(a2) && !"46011".equals(a2)) {
            i = 0;
        }
        return i;
    }
}
