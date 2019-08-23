package com.amap.api.mapcore2d;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static float f6266a = 0.9f;

    /* renamed from: b  reason: collision with root package name */
    public static String f6267b = "";

    /* renamed from: c  reason: collision with root package name */
    public static int f6268c = 19;

    /* renamed from: d  reason: collision with root package name */
    public static int f6269d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final a f6270e = a.PUBLIC;

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f6271f = {"com.amap.api.mapcore2d", "com.amap.api.maps2d"};
    public static String g;
    public static String h;
    public static int i = 1;
    public static int j = 256;
    public static int k = 21;
    public static int l;
    static int m;
    static int n;
    static int o;
    public static volatile cy p;
    public static int q = 7;
    static boolean r = true;
    static boolean s = true;
    public static boolean t;

    enum a {
        PUBLIC,
        ALIBABA,
        CHELIANWAGN,
        U116114
    }

    public static boolean b() {
        return t;
    }

    public static String a() {
        if (f6268c == 18) {
            return "/appmaptile?z=%d&x=%d&y=%d&lang=%s&size=1&scale=1&style=8";
        }
        return "/appmaptile?z=%d&x=%d&y=%d&lang=%s&size=1&scale=1&style=7";
    }

    public static void a(int i2) {
        f6268c = i2;
    }

    public static void b(int i2) {
        f6269d = i2;
    }

    public static void a(boolean z) {
        t = z;
    }
}
