package com.monitor.cloudmessage.b.b.a;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f27341a;

    private static Map<String, Boolean> b(Context context) {
        boolean z;
        HashMap hashMap = new HashMap();
        if (f27341a != null) {
            for (String str : f27341a) {
                if (context == null || TextUtils.isEmpty(str) || context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                    z = false;
                } else {
                    z = true;
                }
                hashMap.put(str, Boolean.valueOf(z));
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf A[SYNTHETIC, Splitter:B:29:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4 A[Catch:{ IOException -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc A[SYNTHETIC, Splitter:B:39:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1 A[Catch:{ IOException -> 0x00d4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File a(android.content.Context r9) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00d5 }
            java.lang.String r2 = r9.getPackageName()     // Catch:{ NameNotFoundException -> 0x00d5 }
            r3 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x00d5 }
            java.lang.String[] r1 = r1.requestedPermissions     // Catch:{ NameNotFoundException -> 0x00d5 }
            f27341a = r1     // Catch:{ NameNotFoundException -> 0x00d5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = com.monitor.cloudmessage.e.b.a((android.content.Context) r9)
            java.lang.String r2 = r2.getAbsolutePath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = "permissionInfo"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r3 = "permission.txt"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
            boolean r4 = r3.exists()     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
            if (r4 != 0) goto L_0x0055
            r3.mkdirs()     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
        L_0x0055:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
            r4.<init>()     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
            r4.append(r1)     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
            java.lang.String r1 = java.io.File.separator     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
            r4.append(r1)     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
            java.lang.String r1 = "permission.txt"
            r4.append(r1)     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00c8, all -> 0x00bb }
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x00b9, all -> 0x00b7 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x00b9, all -> 0x00b7 }
            java.util.Map r9 = b(r9)     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
        L_0x0081:
            boolean r4 = r9.hasNext()     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
            if (r4 == 0) goto L_0x00a8
            java.lang.Object r4 = r9.next()     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
            java.lang.String r5 = "permission: %s, result: %b\n"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
            r7 = 0
            java.lang.Object r8 = r4.getKey()     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
            r6[r7] = r8     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
            r7 = 1
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
            r6[r7] = r4     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
            java.lang.String r4 = java.lang.String.format(r5, r6)     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
            r1.write(r4)     // Catch:{ IOException -> 0x00ca, all -> 0x00b4 }
            goto L_0x0081
        L_0x00a8:
            r1.close()     // Catch:{ IOException -> 0x00ae }
            r3.close()     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            java.io.File r9 = new java.io.File
            r9.<init>(r2)
            return r9
        L_0x00b4:
            r9 = move-exception
            r0 = r1
            goto L_0x00bd
        L_0x00b7:
            r9 = move-exception
            goto L_0x00bd
        L_0x00b9:
            r1 = r0
            goto L_0x00ca
        L_0x00bb:
            r9 = move-exception
            r3 = r0
        L_0x00bd:
            if (r0 == 0) goto L_0x00c2
            r0.close()     // Catch:{ IOException -> 0x00c7 }
        L_0x00c2:
            if (r3 == 0) goto L_0x00c7
            r3.close()     // Catch:{ IOException -> 0x00c7 }
        L_0x00c7:
            throw r9
        L_0x00c8:
            r1 = r0
            r3 = r1
        L_0x00ca:
            if (r1 == 0) goto L_0x00cf
            r1.close()     // Catch:{ IOException -> 0x00d4 }
        L_0x00cf:
            if (r3 == 0) goto L_0x00d4
            r3.close()     // Catch:{ IOException -> 0x00d4 }
        L_0x00d4:
            return r0
        L_0x00d5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.b.b.a.e.a(android.content.Context):java.io.File");
    }
}
