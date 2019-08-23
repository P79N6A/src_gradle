package com.bytedance.android.livesdk.utils;

import com.bytedance.android.live.core.utils.e;
import com.bytedance.android.live.core.utils.i;
import com.bytedance.android.live.uikit.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.k;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17641a;

    public static String a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f17641a, true, 13690, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f17641a, true, 13690, new Class[]{Long.TYPE}, String.class);
        } else if (a.a()) {
            return com.bytedance.android.live.uikit.d.a.a(j2, "w");
        } else {
            if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                return c(j);
            }
            return b(j);
        }
    }

    private static String c(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f17641a, true, 13692, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f17641a, true, 13692, new Class[]{Long.TYPE}, String.class);
        } else if (j2 < 1000) {
            return String.valueOf(j);
        } else {
            if (j2 < 100000) {
                StringBuilder sb = new StringBuilder();
                double d2 = (double) j2;
                Double.isNaN(d2);
                sb.append(i.a("%.1f", Double.valueOf((d2 * 1.0d) / 1000.0d)));
                sb.append(k.f55809b);
                return sb.toString();
            } else if (j2 < 1000000) {
                StringBuilder sb2 = new StringBuilder();
                double d3 = (double) j2;
                Double.isNaN(d3);
                sb2.append(i.a("%.0f", Double.valueOf((d3 * 1.0d) / 1000.0d)));
                sb2.append(k.f55809b);
                return sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                double d4 = (double) j2;
                Double.isNaN(d4);
                sb3.append(i.a("%.1f", Double.valueOf((d4 * 1.0d) / 1000000.0d)));
                sb3.append("m");
                return sb3.toString();
            }
        }
    }

    private static String b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f17641a, true, 13691, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f17641a, true, 13691, new Class[]{Long.TYPE}, String.class);
        } else if (a.f()) {
            return e.a(j);
        } else {
            if (j2 < 10000) {
                return String.valueOf(j);
            }
            if (j2 < 100000) {
                StringBuilder sb = new StringBuilder();
                double d2 = (double) j2;
                Double.isNaN(d2);
                sb.append(i.a("%.1f", Double.valueOf((d2 * 1.0d) / 10000.0d)));
                sb.append("万");
                return sb.toString();
            } else if (j2 < 1000000) {
                StringBuilder sb2 = new StringBuilder();
                double d3 = (double) j2;
                Double.isNaN(d3);
                sb2.append(i.a("%.0f", Double.valueOf((d3 * 1.0d) / 10000.0d)));
                sb2.append("万");
                return sb2.toString();
            } else if (j2 < 10000000) {
                StringBuilder sb3 = new StringBuilder();
                double d4 = (double) j2;
                Double.isNaN(d4);
                sb3.append(i.a("%.0f", Double.valueOf((d4 * 1.0d) / 10000.0d)));
                sb3.append("万");
                return sb3.toString();
            } else if (j2 < 100000000) {
                StringBuilder sb4 = new StringBuilder();
                double d5 = (double) j2;
                Double.isNaN(d5);
                sb4.append(i.a("%.1f", Double.valueOf((d5 * 1.0d) / 1.0E7d)));
                sb4.append("千万");
                return sb4.toString();
            } else if (j2 < 1000000000) {
                StringBuilder sb5 = new StringBuilder();
                double d6 = (double) j2;
                Double.isNaN(d6);
                sb5.append(i.a("%.1f", Double.valueOf((d6 * 1.0d) / 1.0E8d)));
                sb5.append("亿");
                return sb5.toString();
            } else {
                StringBuilder sb6 = new StringBuilder();
                double d7 = (double) j2;
                Double.isNaN(d7);
                sb6.append(i.a("%.0f", Double.valueOf((d7 * 1.0d) / 1.0E8d)));
                sb6.append("亿");
                return sb6.toString();
            }
        }
    }
}
