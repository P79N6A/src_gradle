package com.amap.api.mapcore2d;

import java.util.Locale;
import java.util.Random;

public class ax {

    /* renamed from: b  reason: collision with root package name */
    private static ax f5654b;

    /* renamed from: a  reason: collision with root package name */
    private String f5655a = "http://tm.amap.com";

    public String c() {
        return this.f5655a;
    }

    private ax() {
    }

    public static synchronized ax a() {
        ax axVar;
        synchronized (ax.class) {
            if (f5654b == null) {
                f5654b = new ax();
            }
            axVar = f5654b;
        }
        return axVar;
    }

    public String d() {
        return "http://grid.amap.com/grid/%d/%d/%d?ds=" + q.i;
    }

    public String e() {
        return String.format(Locale.US, "http://mst0%d.is.autonavi.com", new Object[]{Integer.valueOf((new Random(System.currentTimeMillis()).nextInt(100000) % 4) + 1)});
    }

    public String b() {
        String str;
        int nextInt = new Random(System.currentTimeMillis()).nextInt(100000) % 4;
        if (q.m == 2) {
            str = String.format(Locale.US, "http://wprd0%d.is.autonavi.com", new Object[]{Integer.valueOf(nextInt + 1)});
        } else {
            str = String.format(Locale.US, "http://webrd0%d.is.autonavi.com", new Object[]{Integer.valueOf(nextInt + 1)});
        }
        return str + q.a();
    }
}
