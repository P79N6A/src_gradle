package com.bytedance.android.livesdk.feed.l;

import com.bytedance.android.live.core.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14218a;

    public static String a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f14218a, true, 8961, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f14218a, true, 8961, new Class[]{Long.TYPE}, String.class);
        } else if (c.b()) {
            return c(j);
        } else {
            if (c.a()) {
                return b(j);
            }
            if (c.e()) {
                return d(j);
            }
            return c(j);
        }
    }

    private static String b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f14218a, true, 8963, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f14218a, true, 8963, new Class[]{Long.TYPE}, String.class);
        } else if (j2 < 10000) {
            return String.valueOf(j);
        } else {
            StringBuilder sb = new StringBuilder();
            double d2 = (double) j2;
            Double.isNaN(d2);
            sb.append(i.a("%.1f", Double.valueOf((d2 * 1.0d) / 10000.0d)));
            sb.append("w");
            return sb.toString();
        }
    }

    private static String c(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f14218a, true, 8967, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f14218a, true, 8967, new Class[]{Long.TYPE}, String.class);
        } else if (j2 >= 100000000) {
            StringBuilder sb = new StringBuilder();
            double d2 = (double) j2;
            Double.isNaN(d2);
            sb.append(i.a("%.2f", Double.valueOf((d2 * 1.0d) / 1.0E8d)));
            sb.append("亿");
            return sb.toString();
        } else if (j2 < 10000) {
            return String.valueOf(j);
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d3 = (double) j2;
            Double.isNaN(d3);
            sb2.append(i.a("%.2f", Double.valueOf((d3 * 1.0d) / 10000.0d)));
            sb2.append("万");
            return sb2.toString();
        }
    }

    private static String d(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f14218a, true, 8968, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f14218a, true, 8968, new Class[]{Long.TYPE}, String.class);
        } else if (j2 >= 1000000) {
            StringBuilder sb = new StringBuilder();
            double d2 = (double) j2;
            Double.isNaN(d2);
            sb.append(i.a("%.2f", Double.valueOf((d2 * 1.0d) / 1000000.0d)));
            sb.append("m");
            return sb.toString();
        } else if (j2 < 1000) {
            return String.valueOf(j);
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d3 = (double) j2;
            Double.isNaN(d3);
            sb2.append(i.a("%.2f", Double.valueOf((d3 * 1.0d) / 1000.0d)));
            sb2.append(k.f55809b);
            return sb2.toString();
        }
    }
}
