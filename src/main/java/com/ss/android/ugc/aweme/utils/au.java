package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;

public final class au {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75543a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(java.io.File... r17) throws java.lang.Exception {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75543a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.io.File[]> r3 = java.io.File[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Long.TYPE
            r3 = 0
            r5 = 1
            r6 = 88146(0x15852, float:1.23519E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75543a
            r13 = 1
            r14 = 88146(0x15852, float:1.23519E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.io.File[]> r0 = java.io.File[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Long.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x003b:
            r2 = 0
            int r4 = r0.length
            r5 = r2
            r2 = 0
        L_0x0040:
            if (r2 >= r4) goto L_0x0071
            r3 = r0[r2]
            java.io.File[] r3 = r3.listFiles()     // Catch:{ Exception -> 0x006e }
            r6 = r5
            r5 = 0
        L_0x004a:
            int r8 = r3.length     // Catch:{ Exception -> 0x006d }
            if (r5 >= r8) goto L_0x006d
            r8 = r3[r5]     // Catch:{ Exception -> 0x006d }
            boolean r8 = r8.isDirectory()     // Catch:{ Exception -> 0x006d }
            if (r8 == 0) goto L_0x0062
            java.io.File[] r8 = new java.io.File[r1]     // Catch:{ Exception -> 0x006d }
            r10 = r3[r5]     // Catch:{ Exception -> 0x006d }
            r8[r9] = r10     // Catch:{ Exception -> 0x006d }
            long r10 = a(r8)     // Catch:{ Exception -> 0x006d }
            r8 = 0
            long r6 = r6 + r10
            goto L_0x006a
        L_0x0062:
            r8 = r3[r5]     // Catch:{ Exception -> 0x006d }
            long r10 = r8.length()     // Catch:{ Exception -> 0x006d }
            r8 = 0
            long r6 = r6 + r10
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x004a
        L_0x006d:
            r5 = r6
        L_0x006e:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x0071:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.au.a(java.io.File[]):long");
    }
}
