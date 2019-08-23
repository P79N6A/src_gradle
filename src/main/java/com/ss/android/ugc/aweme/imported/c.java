package com.ss.android.ugc.aweme.imported;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.miniapp.k;
import java.math.BigDecimal;
import java.math.RoundingMode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52914a;

    public static String a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f52914a, true, 54455, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f52914a, true, 54455, new Class[]{Long.TYPE}, String.class);
        } else if (!com.ss.android.ugc.aweme.i18n.c.a()) {
            return b(j);
        } else {
            return c(j);
        }
    }

    private static String b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f52914a, true, 54456, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f52914a, true, 54456, new Class[]{Long.TYPE}, String.class);
        } else if (j2 < 0) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            if (j2 < 10000) {
                return String.valueOf(j);
            }
            if (j2 < 100000000) {
                return a(j, 10000, "w", "10000.0", "1.0亿");
            }
            return a(j2, 100000000, "亿");
        }
    }

    private static String c(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f52914a, true, 54459, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f52914a, true, 54459, new Class[]{Long.TYPE}, String.class);
        } else if (j2 < 0) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            if (j2 < 1000) {
                return String.valueOf(j);
            }
            if (j2 < 1000000) {
                return a(j, 1000, k.f55809b, "1000.0", "1.0m");
            }
            if (j2 < 1000000000) {
                return a(j, 1000000, "m", "1000.0", "1.0b");
            }
            return a(j2, 1000000000, "b");
        }
    }

    private static String a(long j, long j2, String str) {
        long j3 = j;
        long j4 = j2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str2}, null, f52914a, true, 54460, new Class[]{Long.TYPE, Long.TYPE, String.class}, String.class)) {
            Object[] objArr = {new Long(j3), new Long(j4), str2};
            return (String) PatchProxy.accessDispatch(objArr, null, f52914a, true, 54460, new Class[]{Long.TYPE, Long.TYPE, String.class}, String.class);
        }
        String bigDecimal = new BigDecimal(j3).divide(new BigDecimal(j4), 1, RoundingMode.HALF_UP).toString();
        return bigDecimal + str2;
    }

    private static String a(long j, long j2, String str, String str2, String str3) {
        long j3 = j;
        long j4 = j2;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str4, str5, str3}, null, f52914a, true, 54461, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str4, str5, str3}, null, f52914a, true, 54461, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class}, String.class);
        }
        String a2 = a(j3, j4, "");
        if (a2.equals(str5)) {
            return str3;
        }
        return a2 + str4;
    }
}
