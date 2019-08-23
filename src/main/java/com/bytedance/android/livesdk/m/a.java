package com.bytedance.android.livesdk.m;

import com.meituan.robust.ChangeQuickRedirect;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16321a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> int a(T... r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f16321a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = 0
            r5 = 1
            r6 = 12578(0x3122, float:1.7626E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f16321a
            r13 = 1
            r14 = 12578(0x3122, float:1.7626E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0039:
            if (r0 != 0) goto L_0x003c
            return r9
        L_0x003c:
            int r2 = r0.length
            r1 = 0
            r3 = 1
        L_0x003f:
            if (r1 >= r2) goto L_0x0053
            r4 = r0[r1]
            if (r4 != 0) goto L_0x0047
            r4 = 0
            goto L_0x004b
        L_0x0047:
            int r4 = r4.hashCode()
        L_0x004b:
            int r5 = r3 << 5
            int r5 = r5 - r3
            r3 = r5 ^ r4
            int r1 = r1 + 1
            goto L_0x003f
        L_0x0053:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.a.a(java.lang.Object[]):int");
    }
}
