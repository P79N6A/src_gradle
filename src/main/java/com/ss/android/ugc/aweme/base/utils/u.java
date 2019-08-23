package com.ss.android.ugc.aweme.base.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35053a;

    public static long a(long j) {
        return j / 1000;
    }

    public static int b(long j) {
        return (int) (j / 86400000);
    }

    public static int a(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, null, f35053a, true, 25300, new Class[]{Double.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, null, f35053a, true, 25300, new Class[]{Double.TYPE}, Integer.TYPE)).intValue();
        } else if (GlobalContext.getContext() == null || GlobalContext.getContext().getResources() == null || GlobalContext.getContext().getResources().getDisplayMetrics() == null) {
            return 0;
        } else {
            double d3 = (double) GlobalContext.getContext().getResources().getDisplayMetrics().density;
            Double.isNaN(d3);
            return (int) ((d3 * d2) + 0.5d);
        }
    }

    public static int b(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, null, f35053a, true, 25301, new Class[]{Double.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, null, f35053a, true, 25301, new Class[]{Double.TYPE}, Integer.TYPE)).intValue();
        }
        double d3 = (double) GlobalContext.getContext().getResources().getDisplayMetrics().density;
        Double.isNaN(d3);
        return (int) ((d2 / d3) + 0.5d);
    }

    public static int c(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, null, f35053a, true, 25302, new Class[]{Double.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, null, f35053a, true, 25302, new Class[]{Double.TYPE}, Integer.TYPE)).intValue();
        }
        double d3 = (double) GlobalContext.getContext().getResources().getDisplayMetrics().scaledDensity;
        Double.isNaN(d3);
        return (int) ((d3 * d2) + 0.5d);
    }

    public static int a(Context context, int i) {
        if (!PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, null, f35053a, true, 25304, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)) {
            return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) / 2.0f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, null, f35053a, true, 25304, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)).intValue();
    }
}
