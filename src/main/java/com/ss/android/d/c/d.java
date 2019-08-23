package com.ss.android.d.c;

import android.os.Build;
import com.bytedance.common.utility.StringUtils;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final CharSequence f28394a = "amigo";

    /* renamed from: b  reason: collision with root package name */
    public static final CharSequence f28395b = "funtouch";

    /* renamed from: c  reason: collision with root package name */
    private static final CharSequence f28396c = "sony";

    public static boolean a() {
        String str = Build.MANUFACTURER;
        if (!StringUtils.isEmpty(str)) {
            return str.toLowerCase().contains("oppo");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[SYNTHETIC, Splitter:B:18:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC, Splitter:B:25:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            java.lang.String r4 = "getprop "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            r3.append(r5)     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            java.lang.String r5 = r3.toString()     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            java.lang.Process r5 = r2.exec(r5)     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            java.io.InputStream r4 = r5.getInputStream()     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            r4 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            java.lang.String r1 = r2.readLine()     // Catch:{ Throwable -> 0x0039, all -> 0x0036 }
            r5.destroy()     // Catch:{ Throwable -> 0x0034, all -> 0x0036 }
            r2.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            return r1
        L_0x0034:
            r0 = r1
            goto L_0x0043
        L_0x0036:
            r5 = move-exception
            r1 = r2
            goto L_0x003c
        L_0x0039:
            goto L_0x0043
        L_0x003b:
            r5 = move-exception
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            throw r5
        L_0x0042:
            r2 = r1
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.c.d.a(java.lang.String):java.lang.String");
    }
}
