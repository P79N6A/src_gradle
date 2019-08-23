package com.ss.android.ugc.aweme.utils;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75956a;

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f75956a, true, 87982, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f75956a, true, 87982, new Class[0], String.class);
        }
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) d.a().getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str = telephonyManager.getNetworkOperator();
            return str;
        } catch (Exception unused) {
        }
    }

    public static String d() {
        if (PatchProxy.isSupport(new Object[0], null, f75956a, true, 87986, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f75956a, true, 87986, new Class[0], String.class);
        }
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) d.a().getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str = telephonyManager.getSimOperator();
            return str;
        } catch (Exception unused) {
        }
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f75956a, true, 87984, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75956a, true, 87984, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String a2 = a();
        if (TextUtils.isEmpty(a2)) {
            a2 = d();
        }
        if (TextUtils.isEmpty(a2) || a2.length() < 3) {
            return false;
        }
        return "460".equals(a2.substring(0, 3));
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f75956a, true, 87985, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75956a, true, 87985, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String d2 = d();
        if (TextUtils.isEmpty(d2) || d2.length() < 3) {
            return false;
        }
        return "440".equals(d2.substring(0, 3));
    }
}
