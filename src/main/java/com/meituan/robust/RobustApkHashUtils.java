package com.meituan.robust;

import android.content.Context;
import android.text.TextUtils;

public class RobustApkHashUtils {
    private static String robustApkHashValue;

    private static String readRobustApkHashFile(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        try {
            str = readFirstLine(context, "robust.apkhash");
        } catch (Throwable unused) {
            str = "";
        }
        return str;
    }

    public static String readRobustApkHash(Context context) {
        if (TextUtils.isEmpty(robustApkHashValue)) {
            robustApkHashValue = readRobustApkHashFile(context);
        }
        return robustApkHashValue;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023 A[SYNTHETIC, Splitter:B:15:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002b A[SYNTHETIC, Splitter:B:22:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String readFirstLine(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0027, all -> 0x0020 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0027, all -> 0x0020 }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ IOException -> 0x0027, all -> 0x0020 }
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ IOException -> 0x0027, all -> 0x0020 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0027, all -> 0x0020 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0027, all -> 0x0020 }
            java.lang.String r3 = r1.readLine()     // Catch:{ IOException -> 0x001e, all -> 0x001b }
            r1.close()     // Catch:{ IOException -> 0x001a }
        L_0x001a:
            return r3
        L_0x001b:
            r3 = move-exception
            r0 = r1
            goto L_0x0021
        L_0x001e:
            r0 = r1
            goto L_0x0027
        L_0x0020:
            r3 = move-exception
        L_0x0021:
            if (r0 == 0) goto L_0x0026
            r0.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            throw r3
        L_0x0027:
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x002e
            r0.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.robust.RobustApkHashUtils.readFirstLine(android.content.Context, java.lang.String):java.lang.String");
    }
}
