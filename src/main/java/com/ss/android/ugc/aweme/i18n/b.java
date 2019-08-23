package com.ss.android.ugc.aweme.i18n;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29724a;

    public static String a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f29724a, true, 49940, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f29724a, true, 49940, new Class[]{Long.TYPE}, String.class);
        } else if (!c.a()) {
            return c(j);
        } else {
            return d(j);
        }
    }

    private static String c(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f29724a, true, 49942, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f29724a, true, 49942, new Class[]{Long.TYPE}, String.class);
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

    public static String b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f29724a, true, 49941, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f29724a, true, 49941, new Class[]{Long.TYPE}, String.class);
        } else if (c.a()) {
            return d(j);
        } else {
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f29724a, true, 49943, new Class[]{Long.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f29724a, true, 49943, new Class[]{Long.TYPE}, String.class);
            } else if (j2 < 0) {
                return PushConstants.PUSH_TYPE_NOTIFY;
            } else {
                if (j2 < 10000) {
                    return String.valueOf(j);
                }
                if (j2 < 100000000) {
                    return a(j, 10000, "万", "10000.0", "1.0亿");
                }
                return a(j2, 100000000, "亿");
            }
        }
    }

    private static String d(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f29724a, true, 49944, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f29724a, true, 49944, new Class[]{Long.TYPE}, String.class);
        } else if (j2 < 0) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            if (j2 < 10000) {
                return String.valueOf(j);
            }
            if (j2 < 1000000) {
                return a(j, 1000, "K", "1000.0", "1.0M");
            }
            if (j2 < 1000000000) {
                return a(j, 1000000, "M", "1000.0", "1.0B");
            }
            return a(j2, 1000000000, "B");
        }
    }

    private static String a(long j, long j2, String str) {
        long j3 = j;
        long j4 = j2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str2}, null, f29724a, true, 49945, new Class[]{Long.TYPE, Long.TYPE, String.class}, String.class)) {
            Object[] objArr = {new Long(j3), new Long(j4), str2};
            return (String) PatchProxy.accessDispatch(objArr, null, f29724a, true, 49945, new Class[]{Long.TYPE, Long.TYPE, String.class}, String.class);
        }
        String bigDecimal = new BigDecimal(j3).divide(new BigDecimal(j4), 1, RoundingMode.HALF_UP).toString();
        return bigDecimal + str2;
    }

    private static String a(long j, long j2, String str, String str2, String str3) {
        long j3 = j;
        long j4 = j2;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str4, str5, str3}, null, f29724a, true, 49946, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str4, str5, str3}, null, f29724a, true, 49946, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class}, String.class);
        }
        String a2 = a(j3, j4, "");
        if (a2.equals(str5)) {
            return str3;
        }
        return a2 + str4;
    }
}
