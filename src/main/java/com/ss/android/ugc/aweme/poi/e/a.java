package com.ss.android.ugc.aweme.poi.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59770a = null;

    /* renamed from: b  reason: collision with root package name */
    static double f59771b = 52.35987755982988d;

    /* renamed from: c  reason: collision with root package name */
    static double f59772c = 3.141592653589793d;

    /* renamed from: d  reason: collision with root package name */
    static double f59773d = 6378245.0d;

    /* renamed from: e  reason: collision with root package name */
    static double f59774e = 0.006693421622965943d;

    private static boolean f(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59770a, true, 66785, new Class[]{Double.TYPE, Double.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59770a, true, 66785, new Class[]{Double.TYPE, Double.TYPE}, Boolean.TYPE)).booleanValue();
        }
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isOutOfChina(d3, d2);
    }

    public static double[] a(double d2, double d3) {
        double d4 = d2;
        double d5 = d3;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59770a, true, 66779, new Class[]{Double.TYPE, Double.TYPE}, double[].class)) {
            return (double[]) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59770a, true, 66779, new Class[]{Double.TYPE, Double.TYPE}, double[].class);
        }
        double sqrt = Math.sqrt((d4 * d4) + (d5 * d5)) + (Math.sin(f59771b * d5) * 2.0E-5d);
        double atan2 = Math.atan2(d5, d4) + (Math.cos(d4 * f59771b) * 3.0E-6d);
        return new double[]{(Math.cos(atan2) * sqrt) + 0.0065d, (sqrt * Math.sin(atan2)) + 0.006d};
    }

    public static double[] b(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59770a, true, 66781, new Class[]{Double.TYPE, Double.TYPE}, double[].class)) {
            return (double[]) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59770a, true, 66781, new Class[]{Double.TYPE, Double.TYPE}, double[].class);
        } else if (f(d2, d3)) {
            return new double[]{d2, d3};
        } else {
            double d4 = d2 - 105.0d;
            double d5 = d3 - 35.0d;
            double d6 = d(d4, d5);
            double e2 = e(d4, d5);
            double d7 = (d3 / 180.0d) * f59772c;
            double sin = Math.sin(d7);
            double d8 = 1.0d - ((f59774e * sin) * sin);
            double sqrt = Math.sqrt(d8);
            return new double[]{d2 + ((e2 * 180.0d) / (((f59773d / sqrt) * Math.cos(d7)) * f59772c)), d3 + ((d6 * 180.0d) / (((f59773d * (1.0d - f59774e)) / (d8 * sqrt)) * f59772c))};
        }
    }

    public static double[] c(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59770a, true, 66782, new Class[]{Double.TYPE, Double.TYPE}, double[].class)) {
            return (double[]) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59770a, true, 66782, new Class[]{Double.TYPE, Double.TYPE}, double[].class);
        } else if (f(d2, d3)) {
            return new double[]{d2, d3};
        } else {
            double d4 = d2 - 105.0d;
            double d5 = d3 - 35.0d;
            double d6 = d(d4, d5);
            double e2 = e(d4, d5);
            double d7 = (d3 / 180.0d) * f59772c;
            double sin = Math.sin(d7);
            double d8 = 1.0d - ((f59774e * sin) * sin);
            double sqrt = Math.sqrt(d8);
            double d9 = d2 * 2.0d;
            return new double[]{d9 - (d2 + ((e2 * 180.0d) / (((f59773d / sqrt) * Math.cos(d7)) * f59772c))), (d3 * 2.0d) - (d3 + ((d6 * 180.0d) / (((f59773d * (1.0d - f59774e)) / (d8 * sqrt)) * f59772c)))};
        }
    }

    private static double d(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59770a, true, 66783, new Class[]{Double.TYPE, Double.TYPE}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59770a, true, 66783, new Class[]{Double.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
        }
        double d4 = d2 * 2.0d;
        return -100.0d + d4 + (d3 * 3.0d) + (d3 * 0.2d * d3) + (0.1d * d2 * d3) + (Math.sqrt(Math.abs(d2)) * 0.2d) + ((((Math.sin((d2 * 6.0d) * f59772c) * 20.0d) + (Math.sin(d4 * f59772c) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f59772c * d3) * 20.0d) + (Math.sin((d3 / 3.0d) * f59772c) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d3 / 12.0d) * f59772c) * 160.0d) + (Math.sin((d3 * f59772c) / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    private static double e(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59770a, true, 66784, new Class[]{Double.TYPE, Double.TYPE}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f59770a, true, 66784, new Class[]{Double.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
        }
        double d4 = d2 * 0.1d;
        return d2 + 300.0d + (d3 * 2.0d) + (d4 * d2) + (d4 * d3) + (Math.sqrt(Math.abs(d2)) * 0.1d) + ((((Math.sin((6.0d * d2) * f59772c) * 20.0d) + (Math.sin((d2 * 2.0d) * f59772c) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f59772c * d2) * 20.0d) + (Math.sin((d2 / 3.0d) * f59772c) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * f59772c) * 150.0d) + (Math.sin((d2 / 30.0d) * f59772c) * 300.0d)) * 2.0d) / 3.0d);
    }
}
