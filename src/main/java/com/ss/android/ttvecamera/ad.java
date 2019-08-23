package com.ss.android.ttvecamera;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static String f31337a = "VESDK-";

    /* renamed from: b  reason: collision with root package name */
    public static byte f31338b = 3;

    /* renamed from: c  reason: collision with root package name */
    public static a f31339c = null;

    /* renamed from: d  reason: collision with root package name */
    private static byte f31340d = 1;

    /* renamed from: e  reason: collision with root package name */
    private static byte f31341e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static byte f31342f = 4;
    private static byte g = 8;
    private static byte h = 16;

    public interface a {
        void a(byte b2, String str, String str2);
    }

    public static void a(String str, String str2) {
        if ((f31342f & f31338b) != 0) {
            String str3 = f31337a + str;
            if (f31339c != null) {
                f31339c.a(f31342f, str3, str2);
            }
        }
    }

    public static void b(String str, String str2) {
        if ((g & f31338b) != 0) {
            String str3 = f31337a + str;
            if (f31339c != null) {
                f31339c.a(g, str3, str2);
            }
        }
    }

    public static void c(String str, String str2) {
        if ((f31341e & f31338b) != 0) {
            String str3 = f31337a + str;
            if (f31339c != null) {
                f31339c.a(f31341e, str3, str2);
            }
        }
    }

    public static void d(String str, String str2) {
        if ((f31340d & f31338b) != 0) {
            String str3 = f31337a + str;
            if (f31339c != null) {
                f31339c.a(f31340d, str3, str2);
            }
        }
    }
}
