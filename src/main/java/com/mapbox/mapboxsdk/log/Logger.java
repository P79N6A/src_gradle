package com.mapbox.mapboxsdk.log;

import android.support.annotation.Keep;

@Keep
public final class Logger {
    private static final a DEFAULT;
    private static volatile a logger;

    public static void d(String str, String str2) {
    }

    public static void d(String str, String str2, Throwable th) {
    }

    public static void e(String str, String str2) {
    }

    public static void e(String str, String str2, Throwable th) {
    }

    public static void i(String str, String str2) {
    }

    public static void i(String str, String str2, Throwable th) {
    }

    public static void v(String str, String str2) {
    }

    public static void v(String str, String str2, Throwable th) {
    }

    public static void w(String str, String str2) {
    }

    public static void w(String str, String str2, Throwable th) {
    }

    static {
        AnonymousClass1 r0 = new a() {
        };
        DEFAULT = r0;
        logger = r0;
    }

    public static void setLoggerDefinition(a aVar) {
        logger = aVar;
    }

    public static void log(int i, String str, String str2) {
        switch (i) {
            case 2:
                v(str, str2);
                return;
            case 3:
                d(str, str2);
                return;
            case 4:
                i(str, str2);
                return;
            case 5:
                w(str, str2);
                return;
            case 6:
                e(str, str2);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
