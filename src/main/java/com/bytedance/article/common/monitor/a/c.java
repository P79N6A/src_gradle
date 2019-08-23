package com.bytedance.article.common.monitor.a;

import android.content.Context;
import com.bytedance.apm.k.o;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static long f19120a;

    /* renamed from: b  reason: collision with root package name */
    private static String[] f19121b;

    private static Map<String, Boolean> b(Context context) {
        HashMap hashMap = new HashMap();
        if (f19121b != null) {
            for (String str : f19121b) {
                hashMap.put(str, Boolean.valueOf(o.a(context, str)));
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f5 A[SYNTHETIC, Splitter:B:34:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fa A[Catch:{ IOException -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0101 A[SYNTHETIC, Splitter:B:44:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0106 A[Catch:{ IOException -> 0x0109 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r13) {
        /*
            boolean r0 = com.bytedance.apm.k.o.a(r13)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.pm.PackageManager r0 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x010a }
            java.lang.String r2 = r13.getPackageName()     // Catch:{ NameNotFoundException -> 0x010a }
            r3 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x010a }
            java.lang.String[] r0 = r0.requestedPermissions     // Catch:{ NameNotFoundException -> 0x010a }
            f19121b = r0     // Catch:{ NameNotFoundException -> 0x010a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r2 = com.bytedance.apm.k.e.a()
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = "backfetch"
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = "permissioninfo"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            boolean r4 = r3.exists()     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            if (r4 != 0) goto L_0x004d
            r3.mkdirs()     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
        L_0x004d:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            r4.<init>()     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            r4.append(r0)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.lang.String r0 = java.io.File.separator     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            r4.append(r0)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.lang.String r5 = "yyyy-MM-dd-HH-mm"
            r0.<init>(r5)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            org.json.JSONObject r5 = com.bytedance.apm.c.f()     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.lang.String r5 = com.bytedance.article.common.monitor.a.b.a(r5)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x008b
            java.lang.String r5 = "%s_permissionInfo"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.util.Date r9 = new java.util.Date     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.lang.String r0 = r0.format(r9)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            r6[r1] = r0     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.lang.String r0 = java.lang.String.format(r5, r6)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            goto L_0x00a4
        L_0x008b:
            java.lang.String r6 = "%s_permissionInfo_%s"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.util.Date r10 = new java.util.Date     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            r10.<init>(r11)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.lang.String r0 = r0.format(r10)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            r9[r1] = r0     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            r9[r8] = r5     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.lang.String r0 = java.lang.String.format(r6, r9)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
        L_0x00a4:
            r4.append(r0)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00fe, all -> 0x00f1 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x00ff, all -> 0x00ef }
            r0.<init>(r3)     // Catch:{ IOException -> 0x00ff, all -> 0x00ef }
            java.util.Map r13 = b(r13)     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            java.util.Set r13 = r13.entrySet()     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
        L_0x00bf:
            boolean r2 = r13.hasNext()     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            if (r2 == 0) goto L_0x00e3
            java.lang.Object r2 = r13.next()     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            java.lang.String r4 = "permission: %s, result: %b\n"
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            java.lang.Object r6 = r2.getKey()     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            r5[r1] = r6     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            r5[r8] = r2     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            java.lang.String r2 = java.lang.String.format(r4, r5)     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            r0.write(r2)     // Catch:{ IOException -> 0x00ed, all -> 0x00ea }
            goto L_0x00bf
        L_0x00e3:
            r0.close()     // Catch:{ IOException -> 0x00e9 }
            r3.close()     // Catch:{ IOException -> 0x00e9 }
        L_0x00e9:
            return r8
        L_0x00ea:
            r13 = move-exception
            r2 = r0
            goto L_0x00f3
        L_0x00ed:
            r2 = r0
            goto L_0x00ff
        L_0x00ef:
            r13 = move-exception
            goto L_0x00f3
        L_0x00f1:
            r13 = move-exception
            r3 = r2
        L_0x00f3:
            if (r2 == 0) goto L_0x00f8
            r2.close()     // Catch:{ IOException -> 0x00fd }
        L_0x00f8:
            if (r3 == 0) goto L_0x00fd
            r3.close()     // Catch:{ IOException -> 0x00fd }
        L_0x00fd:
            throw r13
        L_0x00fe:
            r3 = r2
        L_0x00ff:
            if (r2 == 0) goto L_0x0104
            r2.close()     // Catch:{ IOException -> 0x0109 }
        L_0x0104:
            if (r3 == 0) goto L_0x0109
            r3.close()     // Catch:{ IOException -> 0x0109 }
        L_0x0109:
            return r1
        L_0x010a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.article.common.monitor.a.c.a(android.content.Context):boolean");
    }
}
