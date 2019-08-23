package com.tencent.open.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

public final class f {
    public static String a(int i) {
        if (i == 10103) {
            return "shareToQQ";
        }
        if (i == 10104) {
            return "shareToQzone";
        }
        if (i == 10105) {
            return "addToQQFavorites";
        }
        if (i == 10106) {
            return "sendToMyComputer";
        }
        if (i == 10107) {
            return "shareToTroopBar";
        }
        if (i == 11101) {
            return "action_login";
        }
        if (i == 10100) {
            return "action_request";
        }
        return null;
    }

    public static String a(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    public static String a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } else {
                com.tencent.open.a.f.c("openSDK_LOG.SystemUtils", "-->copy, copyed size is: " + j);
                return j;
            }
        }
    }

    public static int a(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str != null && str2 == null) {
            return 1;
        }
        if (str == null && str2 != null) {
            return -1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                int parseInt2 = Integer.parseInt(split2[i]);
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
                i++;
            } catch (NumberFormatException unused) {
                return str.compareTo(str2);
            }
        }
        if (split.length > i) {
            return 1;
        }
        if (split2.length > i) {
            return -1;
        }
        return 0;
    }

    public static String b(Context context, String str) {
        String str2;
        com.tencent.open.a.f.a("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString");
        try {
            String packageName = context.getPackageName();
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(signatureArr[0].toByteArray());
            String a2 = h.a(instance.digest());
            instance.reset();
            com.tencent.open.a.f.a("openSDK_LOG.SystemUtils", "-->sign: " + a2);
            instance.update(h.e(packageName + "_" + a2 + "_" + str));
            str2 = h.a(instance.digest());
            try {
                instance.reset();
                com.tencent.open.a.f.a("openSDK_LOG.SystemUtils", "-->signEncryped: " + str2);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = "";
            com.tencent.open.a.f.b("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString error", e);
            return str2;
        }
        return str2;
    }

    public static boolean a(Context context, Intent intent) {
        if (context == null || intent == null || context.getPackageManager().queryIntentActivities(intent, 0).size() == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b0 A[SYNTHETIC, Splitter:B:47:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b7 A[SYNTHETIC, Splitter:B:51:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bf A[SYNTHETIC, Splitter:B:58:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c6 A[SYNTHETIC, Splitter:B:62:0x00c6] */
    @android.annotation.SuppressLint({"SdCardPath"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r8, java.lang.String r9, int r10) {
        /*
            java.lang.String r10 = "openSDK_LOG.SystemUtils"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-->extractSecureLib, libName: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.open.a.f.c(r10, r0)
            android.content.Context r10 = com.tencent.open.d.c.a()
            r0 = 0
            if (r10 != 0) goto L_0x0022
            java.lang.String r8 = "openSDK_LOG.SystemUtils"
            java.lang.String r9 = "-->extractSecureLib, global context is null. "
            com.tencent.open.a.f.c(r8, r9)
            return r0
        L_0x0022:
            java.lang.String r1 = "secure_lib"
            android.content.SharedPreferences r1 = com.ss.android.ugc.aweme.q.c.a(r10, r1, r0)
            java.io.File r2 = new java.io.File
            java.io.File r3 = r10.getFilesDir()
            r2.<init>(r3, r9)
            boolean r3 = r2.exists()
            r4 = 1
            r5 = 3
            if (r3 != 0) goto L_0x0049
            java.io.File r3 = r2.getParentFile()
            if (r3 == 0) goto L_0x006d
            boolean r3 = r3.mkdirs()
            if (r3 == 0) goto L_0x006d
            r2.createNewFile()     // Catch:{ IOException -> 0x006d }
            goto L_0x006d
        L_0x0049:
            java.lang.String r2 = "version"
            int r2 = r1.getInt(r2, r0)
            java.lang.String r3 = "openSDK_LOG.SystemUtils"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "-->extractSecureLib, libVersion: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r7 = " | oldVersion: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.tencent.open.a.f.c(r3, r6)
            if (r5 != r2) goto L_0x006d
            return r4
        L_0x006d:
            r2 = 0
            android.content.res.AssetManager r3 = r10.getAssets()     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            java.io.InputStream r8 = r3.open(r8)     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            java.io.FileOutputStream r9 = r10.openFileOutput(r9, r0)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            a((java.io.InputStream) r8, (java.io.OutputStream) r9)     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            android.content.SharedPreferences$Editor r10 = r1.edit()     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            java.lang.String r1 = "version"
            r10.putInt(r1, r5)     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            r10.commit()     // Catch:{ Exception -> 0x0098, all -> 0x0096 }
            if (r8 == 0) goto L_0x0090
            r8.close()     // Catch:{ IOException -> 0x008f }
            goto L_0x0090
        L_0x008f:
        L_0x0090:
            if (r9 == 0) goto L_0x0095
            r9.close()     // Catch:{ IOException -> 0x0095 }
        L_0x0095:
            return r4
        L_0x0096:
            r10 = move-exception
            goto L_0x00bd
        L_0x0098:
            r10 = move-exception
            goto L_0x009f
        L_0x009a:
            r10 = move-exception
            r9 = r2
            goto L_0x00bd
        L_0x009d:
            r10 = move-exception
            r9 = r2
        L_0x009f:
            r2 = r8
            goto L_0x00a7
        L_0x00a1:
            r10 = move-exception
            r8 = r2
            r9 = r8
            goto L_0x00bd
        L_0x00a5:
            r10 = move-exception
            r9 = r2
        L_0x00a7:
            java.lang.String r8 = "openSDK_LOG.SystemUtils"
            java.lang.String r1 = "-->extractSecureLib, when copy lib execption."
            com.tencent.open.a.f.b(r8, r1, r10)     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x00b5
            r2.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00b5
        L_0x00b4:
        L_0x00b5:
            if (r9 == 0) goto L_0x00ba
            r9.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            return r0
        L_0x00bb:
            r10 = move-exception
            r8 = r2
        L_0x00bd:
            if (r8 == 0) goto L_0x00c4
            r8.close()     // Catch:{ IOException -> 0x00c3 }
            goto L_0x00c4
        L_0x00c3:
        L_0x00c4:
            if (r9 == 0) goto L_0x00c9
            r9.close()     // Catch:{ IOException -> 0x00c9 }
        L_0x00c9:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.d.f.a(java.lang.String, java.lang.String, int):boolean");
    }
}
