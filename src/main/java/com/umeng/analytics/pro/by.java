package com.umeng.analytics.pro;

import android.text.TextUtils;
import java.util.Formatter;
import java.util.Locale;

public class by {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f80541a = false;

    /* renamed from: b  reason: collision with root package name */
    private static String f80542b = "MobclickAgent";
    private static int h = 2000;

    private by() {
    }

    public static void a(String str) {
        a(f80542b, str, (Throwable) null);
    }

    public static void b(String str) {
        b(f80542b, str, (Throwable) null);
    }

    public static void c(String str) {
        c(f80542b, str, (Throwable) null);
    }

    public static void d(String str) {
        d(f80542b, str, (Throwable) null);
    }

    public static void e(String str) {
        e(f80542b, str, (Throwable) null);
    }

    public static void b(Throwable th) {
        a(f80542b, (String) null, th);
    }

    public static void c(Throwable th) {
        d(f80542b, (String) null, th);
    }

    public static void d(Throwable th) {
        b(f80542b, (String) null, th);
    }

    public static void e(Throwable th) {
        e(f80542b, (String) null, th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002e A[SYNTHETIC, Splitter:B:20:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x003c A[SYNTHETIC, Splitter:B:29:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f(java.lang.Throwable r4) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ Throwable -> 0x0039, all -> 0x002a }
            r2.<init>()     // Catch:{ Throwable -> 0x0039, all -> 0x002a }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ Throwable -> 0x0028, all -> 0x0026 }
            r3.<init>(r2)     // Catch:{ Throwable -> 0x0028, all -> 0x0026 }
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r4, (java.io.PrintWriter) r3)     // Catch:{ Throwable -> 0x0024, all -> 0x0021 }
            r3.flush()     // Catch:{ Throwable -> 0x0024, all -> 0x0021 }
            r2.flush()     // Catch:{ Throwable -> 0x0024, all -> 0x0021 }
            java.lang.String r4 = r2.toString()     // Catch:{ Throwable -> 0x0024, all -> 0x0021 }
            r2.close()     // Catch:{ Throwable -> 0x001d }
        L_0x001d:
            r3.close()
            goto L_0x0047
        L_0x0021:
            r4 = move-exception
            r1 = r3
            goto L_0x002c
        L_0x0024:
            r1 = r3
            goto L_0x003a
        L_0x0026:
            r4 = move-exception
            goto L_0x002c
        L_0x0028:
            goto L_0x003a
        L_0x002a:
            r4 = move-exception
            r2 = r1
        L_0x002c:
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ Throwable -> 0x0032 }
            goto L_0x0033
        L_0x0032:
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.close()
        L_0x0038:
            throw r4
        L_0x0039:
            r2 = r1
        L_0x003a:
            if (r2 == 0) goto L_0x0041
            r2.close()     // Catch:{ Throwable -> 0x0040 }
            goto L_0x0041
        L_0x0040:
        L_0x0041:
            if (r1 == 0) goto L_0x0046
            r1.close()
        L_0x0046:
            r4 = r0
        L_0x0047:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.by.f(java.lang.Throwable):java.lang.String");
    }

    public static void a(Throwable th) {
        c(f80542b, (String) null, th);
    }

    public static void b(String str, Throwable th) {
        a(f80542b, str, th);
    }

    public static void c(String str, Throwable th) {
        d(f80542b, str, th);
    }

    public static void d(String str, Throwable th) {
        b(f80542b, str, th);
    }

    public static void e(String str, Throwable th) {
        e(f80542b, str, th);
    }

    public static void a(String str, Throwable th) {
        c(f80542b, str, th);
    }

    public static void b(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                b(f80542b, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = objArr[0];
            }
            b(str, str2, (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void c(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                e(f80542b, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = objArr[0];
            }
            e(str, str2, (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void d(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                a(f80542b, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = objArr[0];
            }
            a(str, str2, (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void e(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                d(f80542b, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = objArr[0];
            }
            d(str, str2, (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void a(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                c(f80542b, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = objArr[0];
            }
            c(str, str2, (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (f80541a) {
            a(1, str, str2, th);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (f80541a) {
            a(2, str, str2, th);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (f80541a) {
            a(3, str, str2, th);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f80541a) {
            a(4, str, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (f80541a) {
            a(5, str, str2, th);
        }
    }

    public static void b(Locale locale, String str, Object... objArr) {
        try {
            b(f80542b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void c(Locale locale, String str, Object... objArr) {
        try {
            e(f80542b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void d(Locale locale, String str, Object... objArr) {
        try {
            a(f80542b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void e(Locale locale, String str, Object... objArr) {
        try {
            d(f80542b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    public static void a(Locale locale, String str, Object... objArr) {
        try {
            c(f80542b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            e(th);
        }
    }

    private static void a(int i, String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str2)) {
            str2.length();
        }
        if (th != null) {
            TextUtils.isEmpty(f(th));
        }
    }
}
