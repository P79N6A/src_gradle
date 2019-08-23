package com.ss.android.ad.splash.utils;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f27848a = "0123456789ABCDEF".toCharArray();

    public static boolean a(String str) {
        if (g.a(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
            return false;
        }
        return true;
    }

    public static int a(long j, long j2) {
        int i;
        if (j2 > 0) {
            double d2 = (double) j;
            Double.isNaN(d2);
            double d3 = (double) j2;
            Double.isNaN(d3);
            i = (int) (((d2 * 1.0d) / d3) * 100.0d);
        } else {
            i = 0;
        }
        return Math.min(Math.max(0, i), 100);
    }
}
