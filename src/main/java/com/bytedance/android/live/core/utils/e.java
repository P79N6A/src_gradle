package com.bytedance.android.live.core.utils;

import com.bytedance.android.livesdkapi.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.k;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8252a;

    public static String b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f8252a, true, 977, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f8252a, true, 977, new Class[]{Long.TYPE}, String.class);
        } else if (j2 < 10000) {
            return String.valueOf(j);
        } else {
            StringBuilder sb = new StringBuilder();
            double d2 = (double) j2;
            Double.isNaN(d2);
            sb.append(i.a("%.1f", Double.valueOf((d2 * 1.0d) / 10000.0d)));
            sb.append("万");
            return sb.toString();
        }
    }

    public static String c(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f8252a, true, 979, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f8252a, true, 979, new Class[]{Long.TYPE}, String.class);
        } else if (a.f18614b) {
            return d(j);
        } else {
            if (com.bytedance.android.live.uikit.a.a.a()) {
                return f(j);
            }
            return g(j);
        }
    }

    public static boolean e(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f8252a, true, 982, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f8252a, true, 982, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.f() || com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.b()) {
            if (j2 >= 10000) {
                return true;
            }
            return false;
        } else if (j2 >= 1000) {
            return true;
        } else {
            return false;
        }
    }

    private static String f(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f8252a, true, 976, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f8252a, true, 976, new Class[]{Long.TYPE}, String.class);
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

    public static String d(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f8252a, true, 981, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f8252a, true, 981, new Class[]{Long.TYPE}, String.class);
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

    public static String a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f8252a, true, 974, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f8252a, true, 974, new Class[]{Long.TYPE}, String.class);
        } else if (com.bytedance.android.live.uikit.a.a.b() || com.bytedance.android.live.uikit.a.a.f()) {
            return g(j);
        } else {
            if (com.bytedance.android.live.uikit.a.a.a()) {
                return f(j);
            }
            if (com.bytedance.android.live.uikit.a.a.d()) {
                return g(j);
            }
            if (!com.bytedance.android.live.uikit.a.a.g()) {
                return d(j);
            }
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f8252a, true, 978, new Class[]{Long.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f8252a, true, 978, new Class[]{Long.TYPE}, String.class);
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
    }

    private static String g(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f8252a, true, 980, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f8252a, true, 980, new Class[]{Long.TYPE}, String.class);
        }
        if (com.bytedance.android.live.uikit.a.a.f()) {
            if (j2 >= 100000000) {
                StringBuilder sb = new StringBuilder();
                double d2 = (double) j2;
                Double.isNaN(d2);
                sb.append(i.a("%.1f", Double.valueOf((d2 * 1.0d) / 1.0E8d)));
                sb.append("亿");
                return sb.toString();
            } else if (j2 >= 10000) {
                StringBuilder sb2 = new StringBuilder();
                double d3 = (double) j2;
                Double.isNaN(d3);
                sb2.append(i.a("%.1f", Double.valueOf((d3 * 1.0d) / 10000.0d)));
                sb2.append("万");
                return sb2.toString();
            }
        } else if (j2 >= 100000000) {
            StringBuilder sb3 = new StringBuilder();
            double d4 = (double) j2;
            Double.isNaN(d4);
            sb3.append(i.a("%.2f", Double.valueOf((d4 * 1.0d) / 1.0E8d)));
            sb3.append("亿");
            return sb3.toString();
        } else if (j2 >= 10000) {
            StringBuilder sb4 = new StringBuilder();
            double d5 = (double) j2;
            Double.isNaN(d5);
            sb4.append(i.a("%.2f", Double.valueOf((d5 * 1.0d) / 10000.0d)));
            sb4.append("万");
            return sb4.toString();
        }
        return String.valueOf(j);
    }
}
