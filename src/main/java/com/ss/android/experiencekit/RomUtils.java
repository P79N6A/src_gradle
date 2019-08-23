package com.ss.android.experiencekit;

import android.os.Build;
import android.text.TextUtils;

public final class RomUtils {

    public @interface AppRunFrom {
    }

    public static boolean a() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str) || !str.contains("HUAWEI")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC, Splitter:B:13:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[SYNTHETIC, Splitter:B:21:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r3 = "getprop "
            r2.<init>(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r2.append(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.Process r4 = r1.exec(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r4 = r1.readLine()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r4
        L_0x0032:
            r4 = move-exception
            r0 = r1
            goto L_0x0036
        L_0x0035:
            r4 = move-exception
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            throw r4
        L_0x003c:
            r1 = r0
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.experiencekit.RomUtils.a(java.lang.String):java.lang.String");
    }
}
