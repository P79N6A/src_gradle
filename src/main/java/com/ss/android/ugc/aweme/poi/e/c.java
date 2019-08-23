package com.ss.android.ugc.aweme.poi.e;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.a.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59776a;

    private static double b(double d2) {
        return (d2 * 3.141592653589793d) / 180.0d;
    }

    public static double[] a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, null, f59776a, true, 66795, new Class[]{String.class, String.class}, double[].class)) {
            return (double[]) PatchProxy.accessDispatch(new Object[]{str, str2}, null, f59776a, true, 66795, new Class[]{String.class, String.class}, double[].class);
        }
        try {
            return a(Double.parseDouble(str), Double.parseDouble(str2));
        } catch (Exception e2) {
            a.a(e2);
            return new double[]{0.0d, 0.0d};
        }
    }

    private static double a(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, null, f59776a, true, 66788, new Class[]{Double.TYPE}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, null, f59776a, true, 66788, new Class[]{Double.TYPE}, Double.TYPE)).doubleValue();
        }
        double sin = Math.sin(d2 / 2.0d);
        return sin * sin;
    }

    public static double a(double[] dArr, double[] dArr2) {
        if (!PatchProxy.isSupport(new Object[]{dArr, dArr2}, null, f59776a, true, 66789, new Class[]{double[].class, double[].class}, Double.TYPE)) {
            return a(dArr[0], dArr[1], dArr2[0], dArr2[1]);
        }
        return ((Double) PatchProxy.accessDispatch(new Object[]{dArr, dArr2}, null, f59776a, true, 66789, new Class[]{double[].class, double[].class}, Double.TYPE)).doubleValue();
    }

    public static double[] a(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59776a, true, 66796, new Class[]{Double.TYPE, Double.TYPE}, double[].class)) {
            return (double[]) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59776a, true, 66796, new Class[]{Double.TYPE, Double.TYPE}, double[].class);
        }
        double[] dArr = {0.0d, 0.0d};
        try {
            double[] b2 = a.b(d3, d2);
            dArr[0] = b2[1];
            dArr[1] = b2[0];
        } catch (Exception e2) {
            a.a(e2);
        }
        return dArr;
    }

    public static double a(double d2, double d3, double d4, double d5) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, null, f59776a, true, 66790, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, null, f59776a, true, 66790, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
        }
        double b2 = b(d2);
        double b3 = b(d3);
        double b4 = b(d4);
        return Math.asin(Math.sqrt(a(Math.abs(b2 - b4)) + (Math.cos(b2) * Math.cos(b4) * a(Math.abs(b3 - b(d5)))))) * 12742.0d;
    }

    public static String a(Context context, double d2, double d3, double d4, double d5) {
        if (PatchProxy.isSupport(new Object[]{context, Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, null, f59776a, true, 66793, new Class[]{Context.class, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, null, f59776a, true, 66793, new Class[]{Context.class, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, String.class);
        }
        double a2 = a(d2, d3, d4, d5);
        if (a2 > 1.0d) {
            return String.format(context.getResources().getString(C0906R.string.bog), new Object[]{Integer.valueOf((int) a2)});
        } else if (a2 > 0.1d) {
            return String.format(context.getResources().getString(C0906R.string.boh), new Object[]{Integer.valueOf((int) (a2 * 1000.0d))});
        } else {
            return String.format(context.getResources().getString(C0906R.string.bof), new Object[]{"<"});
        }
    }
}
