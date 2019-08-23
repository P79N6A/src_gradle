package com.bytedance.android.livesdk.h;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15516a;

    public static String a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f15516a, true, 9174, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f15516a, true, 9174, new Class[]{Context.class}, String.class);
        }
        switch (c(context)) {
            case 0:
                return "NONE";
            case 1:
                return "telecom";
            case 2:
                return "unicom";
            case 3:
                return "mobile";
            default:
                return "NONE";
        }
    }

    private static String b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f15516a, true, 9175, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f15516a, true, 9175, new Class[]{Context.class}, String.class);
        } else if (context2 == null) {
            return "-1";
        } else {
            return ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        }
    }

    private static int c(Context context) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{context}, null, f15516a, true, 9176, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f15516a, true, 9176, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        String b2 = b(context);
        if ("46000".equals(b2) || "46002".equals(b2) || "46007".equals(b2)) {
            i = 3;
        } else if ("46001".equals(b2) || "46006".equals(b2)) {
            i = 2;
        } else if (!"46003".equals(b2) && !"46005".equals(b2) && !"46011".equals(b2)) {
            i = 0;
        }
        return i;
    }
}
