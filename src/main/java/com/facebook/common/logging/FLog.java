package com.facebook.common.logging;

public class FLog {
    private static b sHandler = a.f23534a;

    public static void v(String str, String str2, Object obj) {
        if (sHandler.b(2)) {
            sHandler.a(str, formatString(str2, obj));
        }
    }

    public static void v(String str, String str2, Object obj, Object obj2) {
        if (sHandler.b(2)) {
            sHandler.a(str, formatString(str2, obj, obj2));
        }
    }

    public static void v(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.b(2)) {
            sHandler.a(str, formatString(str2, obj, obj2, obj3));
        }
    }

    public static void v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.b(2)) {
            sHandler.a(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        if (sHandler.b(2)) {
            sHandler.a(str, formatString(str2, objArr));
        }
    }

    public static void v(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.b(2)) {
            sHandler.a(str, formatString(str2, objArr), th);
        }
    }

    public static void v(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.b(2)) {
            sHandler.a(getTag(cls), formatString(str, objArr), th);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (sHandler.b(2)) {
            sHandler.a(str, str2, th);
        }
    }

    public static void d(String str, String str2, Object obj) {
        if (sHandler.b(3)) {
            sHandler.b(str, formatString(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (sHandler.b(3)) {
            sHandler.b(str, formatString(str2, obj, obj2));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.b(3)) {
            sHandler.b(str, formatString(str2, obj, obj2, obj3));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.b(3)) {
            sHandler.b(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (sHandler.b(3)) {
            d(str, formatString(str2, objArr));
        }
    }

    public static void d(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.b(3)) {
            d(str, formatString(str2, objArr), th);
        }
    }

    public static void d(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.b(3)) {
            sHandler.b(getTag(cls), formatString(str, objArr), th);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (sHandler.b(3)) {
            sHandler.b(str, str2, th);
        }
    }

    public static void i(String str, String str2, Object obj) {
        if (sHandler.b(4)) {
            sHandler.c(str, formatString(str2, obj));
        }
    }

    public static void i(String str, String str2, Object obj, Object obj2) {
        if (sHandler.b(4)) {
            sHandler.c(str, formatString(str2, obj, obj2));
        }
    }

    public static void i(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.b(4)) {
            sHandler.c(str, formatString(str2, obj, obj2, obj3));
        }
    }

    public static void i(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.b(4)) {
            sHandler.c(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        if (sHandler.b(4)) {
            sHandler.c(str, formatString(str2, objArr));
        }
    }

    public static void i(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.b(4)) {
            sHandler.c(str, formatString(str2, objArr), th);
        }
    }

    public static void i(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (isLoggable(4)) {
            sHandler.c(getTag(cls), formatString(str, objArr), th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (sHandler.b(4)) {
            sHandler.c(str, str2, th);
        }
    }

    public static int getMinimumLoggingLevel() {
        return sHandler.a();
    }

    private static String getTag(Class<?> cls) {
        return cls.getSimpleName();
    }

    public static boolean isLoggable(int i) {
        return sHandler.b(i);
    }

    public static void setMinimumLoggingLevel(int i) {
        sHandler.a(i);
    }

    public static void setLoggingDelegate(b bVar) {
        if (bVar != null) {
            sHandler = bVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    private static String formatString(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    public static void d(String str, String str2) {
        if (sHandler.b(3)) {
            sHandler.b(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (sHandler.b(6)) {
            sHandler.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (sHandler.b(4)) {
            sHandler.c(str, str2);
        }
    }

    public static void v(String str, String str2) {
        if (sHandler.b(2)) {
            sHandler.a(str, str2);
        }
    }

    public static void wtf(String str, String str2) {
        if (sHandler.b(6)) {
            sHandler.f(str, str2);
        }
    }

    public static void d(Class<?> cls, String str) {
        if (sHandler.b(3)) {
            sHandler.b(getTag(cls), str);
        }
    }

    public static void e(Class<?> cls, String str) {
        if (sHandler.b(6)) {
            sHandler.e(getTag(cls), str);
        }
    }

    public static void i(Class<?> cls, String str) {
        if (sHandler.b(4)) {
            sHandler.c(getTag(cls), str);
        }
    }

    public static void v(Class<?> cls, String str) {
        if (sHandler.b(2)) {
            sHandler.a(getTag(cls), str);
        }
    }

    public static void w(Class<?> cls, String str) {
        if (sHandler.b(5)) {
            sHandler.d(getTag(cls), str);
        }
    }

    public static void wtf(Class<?> cls, String str) {
        if (sHandler.b(6)) {
            sHandler.f(getTag(cls), str);
        }
    }

    public static void w(String str, String str2) {
        if (sHandler.b(5)) {
            sHandler.d(str, str2);
        }
    }

    public static void d(Class<?> cls, String str, Object obj) {
        if (sHandler.b(3)) {
            sHandler.b(getTag(cls), formatString(str, obj));
        }
    }

    public static void e(Class<?> cls, String str, Throwable th) {
        if (sHandler.b(6)) {
            sHandler.e(getTag(cls), str, th);
        }
    }

    public static void i(Class<?> cls, String str, Object obj) {
        if (sHandler.b(4)) {
            sHandler.c(getTag(cls), formatString(str, obj));
        }
    }

    public static void v(Class<?> cls, String str, Object obj) {
        if (sHandler.b(2)) {
            sHandler.a(getTag(cls), formatString(str, obj));
        }
    }

    public static void w(Class<?> cls, String str, Throwable th) {
        if (sHandler.b(5)) {
            sHandler.d(getTag(cls), str, th);
        }
    }

    public static void wtf(Class<?> cls, String str, Throwable th) {
        if (sHandler.b(6)) {
            sHandler.f(getTag(cls), str, th);
        }
    }

    public static void e(Class<?> cls, String str, Object... objArr) {
        if (sHandler.b(6)) {
            sHandler.e(getTag(cls), formatString(str, objArr));
        }
    }

    public static void w(Class<?> cls, String str, Object... objArr) {
        if (sHandler.b(5)) {
            sHandler.d(getTag(cls), formatString(str, objArr));
        }
    }

    public static void wtf(Class<?> cls, String str, Object... objArr) {
        if (sHandler.b(6)) {
            sHandler.f(getTag(cls), formatString(str, objArr));
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (sHandler.b(6)) {
            sHandler.e(str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (sHandler.b(5)) {
            sHandler.d(str, str2, th);
        }
    }

    public static void wtf(String str, String str2, Throwable th) {
        if (sHandler.b(6)) {
            sHandler.f(str, str2, th);
        }
    }

    public static void d(Class<?> cls, String str, Throwable th) {
        if (sHandler.b(3)) {
            sHandler.b(getTag(cls), str, th);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (sHandler.b(6)) {
            sHandler.e(str, formatString(str2, objArr));
        }
    }

    public static void i(Class<?> cls, String str, Throwable th) {
        if (sHandler.b(4)) {
            sHandler.c(getTag(cls), str, th);
        }
    }

    public static void v(Class<?> cls, String str, Throwable th) {
        if (sHandler.b(2)) {
            sHandler.a(getTag(cls), str, th);
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        if (sHandler.b(5)) {
            sHandler.d(str, formatString(str2, objArr));
        }
    }

    public static void wtf(String str, String str2, Object... objArr) {
        if (sHandler.b(6)) {
            sHandler.f(str, formatString(str2, objArr));
        }
    }

    public static void d(Class<?> cls, String str, Object... objArr) {
        if (sHandler.b(3)) {
            sHandler.b(getTag(cls), formatString(str, objArr));
        }
    }

    public static void i(Class<?> cls, String str, Object... objArr) {
        if (sHandler.b(4)) {
            sHandler.c(getTag(cls), formatString(str, objArr));
        }
    }

    public static void v(Class<?> cls, String str, Object... objArr) {
        if (sHandler.b(2)) {
            sHandler.a(getTag(cls), formatString(str, objArr));
        }
    }

    public static void w(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (isLoggable(5)) {
            w(cls, formatString(str, objArr), th);
        }
    }

    public static void d(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.b(3)) {
            sHandler.b(getTag(cls), formatString(str, obj, obj2));
        }
    }

    public static void i(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.b(4)) {
            sHandler.c(getTag(cls), formatString(str, obj, obj2));
        }
    }

    public static void v(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.b(2)) {
            sHandler.a(getTag(cls), formatString(str, obj, obj2));
        }
    }

    public static void e(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.b(6)) {
            sHandler.e(getTag(cls), formatString(str, objArr), th);
        }
    }

    public static void wtf(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.b(6)) {
            sHandler.f(getTag(cls), formatString(str, objArr), th);
        }
    }

    public static void e(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.b(6)) {
            sHandler.e(str, formatString(str2, objArr), th);
        }
    }

    public static void w(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.b(5)) {
            sHandler.d(str, formatString(str2, objArr), th);
        }
    }

    public static void wtf(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.b(6)) {
            sHandler.f(str, formatString(str2, objArr), th);
        }
    }

    public static void d(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (sHandler.b(3)) {
            sHandler.b(getTag(cls), formatString(str, obj, obj2, obj3));
        }
    }

    public static void i(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (sHandler.b(4)) {
            sHandler.c(getTag(cls), formatString(str, obj, obj2, obj3));
        }
    }

    public static void v(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (isLoggable(2)) {
            v(cls, formatString(str, obj, obj2, obj3));
        }
    }

    public static void d(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.b(3)) {
            sHandler.b(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    public static void i(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.b(4)) {
            sHandler.c(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    public static void v(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.b(2)) {
            sHandler.a(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }
}
