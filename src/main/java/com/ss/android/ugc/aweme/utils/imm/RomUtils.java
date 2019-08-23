package com.ss.android.ugc.aweme.utils.imm;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class RomUtils {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75894a;

    public @interface AppRunFrom {
    }

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f75894a, true, 88749, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75894a, true, 88749, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str) && str.contains("HUAWEI")) {
            z = true;
        }
        return z;
    }

    public static boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f75894a, true, 88757, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75894a, true, 88757, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String a2 = a("ro.vivo.os.name");
        if (!TextUtils.isEmpty(a2) && a2.toLowerCase().contains("funtouch")) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f A[SYNTHETIC, Splitter:B:17:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[SYNTHETIC, Splitter:B:25:0x0076] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75894a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 88748(0x15aac, float:1.24362E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75894a
            r13 = 1
            r14 = 88748(0x15aac, float:1.24362E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            java.lang.String r4 = "getprop "
            r3.<init>(r4)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            r3.append(r0)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            java.lang.Process r0 = r2.exec(r0)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            r0 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r0)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x0074, all -> 0x0069 }
            r2.close()     // Catch:{ IOException -> 0x0074, all -> 0x0069 }
            r2.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            return r0
        L_0x0069:
            r0 = move-exception
            r1 = r2
            goto L_0x006d
        L_0x006c:
            r0 = move-exception
        L_0x006d:
            if (r1 == 0) goto L_0x0072
            r1.close()     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            throw r0
        L_0x0073:
            r2 = r1
        L_0x0074:
            if (r2 == 0) goto L_0x0079
            r2.close()     // Catch:{ IOException -> 0x0079 }
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.imm.RomUtils.a(java.lang.String):java.lang.String");
    }
}
