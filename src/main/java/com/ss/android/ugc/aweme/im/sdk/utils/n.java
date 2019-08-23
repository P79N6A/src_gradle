package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.miniapp.k;
import java.math.BigDecimal;
import java.math.RoundingMode;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52604a;

    public static String a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f52604a, true, 53398, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f52604a, true, 53398, new Class[]{Long.TYPE}, String.class);
        } else if (!c.a()) {
            return b(j);
        } else {
            return c(j);
        }
    }

    private static String b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f52604a, true, 53399, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f52604a, true, 53399, new Class[]{Long.TYPE}, String.class);
        } else if (j2 < 10000) {
            return String.valueOf(j);
        } else {
            if (j2 < 100000000) {
                return a(j2, 10000, "w");
            }
            return a(j2, 100000000, "亿");
        }
    }

    private static String c(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f52604a, true, 53400, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f52604a, true, 53400, new Class[]{Long.TYPE}, String.class);
        } else if (j2 < 1000) {
            return String.valueOf(j);
        } else {
            if (j2 < 1000000) {
                return a(j2, 1000, k.f55809b);
            }
            if (j2 < 1000000000) {
                return a(j2, 1000000, "m");
            }
            return a(j2, 1000000000, "b");
        }
    }

    private static String a(long j, long j2, String str) {
        long j3 = j;
        long j4 = j2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str2}, null, f52604a, true, 53401, new Class[]{Long.TYPE, Long.TYPE, String.class}, String.class)) {
            Object[] objArr = {new Long(j3), new Long(j4), str2};
            return (String) PatchProxy.accessDispatch(objArr, null, f52604a, true, 53401, new Class[]{Long.TYPE, Long.TYPE, String.class}, String.class);
        }
        String bigDecimal = new BigDecimal(j3).divide(new BigDecimal(j4), 1, RoundingMode.HALF_UP).toString();
        if ('0' == bigDecimal.charAt(bigDecimal.length() - 1)) {
            return bigDecimal.substring(0, bigDecimal.length() - 2) + str2;
        }
        return bigDecimal + str2;
    }
}
