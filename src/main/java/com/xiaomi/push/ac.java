package com.xiaomi.push;

public class ac {

    /* renamed from: a  reason: collision with root package name */
    private static int f81815a;

    /* renamed from: a  reason: collision with other field name */
    public static final String f144a;

    /* renamed from: a  reason: collision with other field name */
    public static final boolean f145a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f81816b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f81817c = "LOGABLE".equalsIgnoreCase(f144a);

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f81818d = f144a.contains("YY");

    /* renamed from: e  reason: collision with root package name */
    public static boolean f81819e = f144a.equalsIgnoreCase("TEST");

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f81820f = "BETA".equalsIgnoreCase(f144a);
    public static final boolean g;

    static {
        int i;
        String str = af.f146a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f144a = str;
        boolean contains = str.contains("2A2FE0D7");
        f145a = contains;
        boolean z = false;
        f81816b = contains || "DEBUG".equalsIgnoreCase(f144a);
        if (f144a != null && f144a.startsWith("RC")) {
            z = true;
        }
        g = z;
        f81815a = 1;
        if (f144a.equalsIgnoreCase("SANDBOX")) {
            i = 2;
        } else if (f144a.equalsIgnoreCase("ONEBOX")) {
            i = 3;
        } else {
            f81815a = 1;
            return;
        }
        f81815a = i;
    }

    public static int a() {
        return f81815a;
    }

    public static void a(int i) {
        f81815a = i;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m82a() {
        return f81815a == 2;
    }

    public static boolean b() {
        return f81815a == 3;
    }
}
