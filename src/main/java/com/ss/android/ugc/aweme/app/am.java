package com.ss.android.ugc.aweme.app;

import com.meituan.robust.ChangeQuickRedirect;

public final class am {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2630a;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073 A[SYNTHETIC, Splitter:B:19:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a A[SYNTHETIC, Splitter:B:27:0x007a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(int r16) {
        /*
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r8 = 0
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f2630a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r8] = r2
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = 0
            r4 = 1
            r5 = 22576(0x5830, float:3.1636E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003b
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r9[r8] = r1
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = f2630a
            r12 = 1
            r13 = 22576(0x5830, float:3.1636E-41)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r14[r8] = r0
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x003b:
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0077, all -> 0x0070 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ Throwable -> 0x0077, all -> 0x0070 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0077, all -> 0x0070 }
            java.lang.String r4 = "/proc/"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0077, all -> 0x0070 }
            r4 = r16
            r3.append(r4)     // Catch:{ Throwable -> 0x0077, all -> 0x0070 }
            java.lang.String r4 = "/cmdline"
            r3.append(r4)     // Catch:{ Throwable -> 0x0077, all -> 0x0070 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0077, all -> 0x0070 }
            r0.<init>(r3)     // Catch:{ Throwable -> 0x0077, all -> 0x0070 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0077, all -> 0x0070 }
            java.lang.String r0 = r2.readLine()     // Catch:{ Throwable -> 0x0078, all -> 0x006d }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0078, all -> 0x006d }
            if (r3 != 0) goto L_0x0069
            java.lang.String r0 = r0.trim()     // Catch:{ Throwable -> 0x0078, all -> 0x006d }
        L_0x0069:
            r2.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            return r0
        L_0x006d:
            r0 = move-exception
            r1 = r2
            goto L_0x0071
        L_0x0070:
            r0 = move-exception
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            throw r0
        L_0x0077:
            r2 = r1
        L_0x0078:
            if (r2 == 0) goto L_0x007d
            r2.close()     // Catch:{ IOException -> 0x007d }
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.am.a(int):java.lang.String");
    }
}
