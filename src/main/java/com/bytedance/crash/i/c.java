package com.bytedance.crash.i;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.crash.upload.b;
import java.util.Locale;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f19474a;

    public static String a() {
        return a("ro.build.version.emui");
    }

    public static boolean c() {
        if (!f19474a) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    b.f19561a = true;
                    f19474a = true;
                    return b.f19561a;
                }
            } catch (Exception unused) {
            }
            f19474a = true;
        }
        return b.f19561a;
    }

    public static boolean d() {
        if (Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme")) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        try {
            if ((TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase(Locale.getDefault()).startsWith("huawei")) && (TextUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase(Locale.getDefault()).startsWith("huawei"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0027] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x003c, all -> 0x0037 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x003c, all -> 0x0037 }
            java.lang.String r3 = "getprop "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x003c, all -> 0x0037 }
            r2.append(r4)     // Catch:{ Throwable -> 0x003c, all -> 0x0037 }
            java.lang.String r4 = r2.toString()     // Catch:{ Throwable -> 0x003c, all -> 0x0037 }
            java.lang.Process r4 = r1.exec(r4)     // Catch:{ Throwable -> 0x003c, all -> 0x0037 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x003c, all -> 0x0037 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x003c, all -> 0x0037 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ Throwable -> 0x003c, all -> 0x0037 }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x003c, all -> 0x0037 }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch:{ Throwable -> 0x003c, all -> 0x0037 }
            java.lang.String r4 = r1.readLine()     // Catch:{ Throwable -> 0x003d, all -> 0x0034 }
            r1.close()     // Catch:{ Throwable -> 0x0032, all -> 0x0034 }
            com.bytedance.crash.i.f.a((java.io.Closeable) r1)
            return r4
        L_0x0032:
            r0 = r4
            goto L_0x003d
        L_0x0034:
            r4 = move-exception
            r0 = r1
            goto L_0x0038
        L_0x0037:
            r4 = move-exception
        L_0x0038:
            com.bytedance.crash.i.f.a((java.io.Closeable) r0)
            throw r4
        L_0x003c:
            r1 = r0
        L_0x003d:
            com.bytedance.crash.i.f.a((java.io.Closeable) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.i.c.a(java.lang.String):java.lang.String");
    }
}
