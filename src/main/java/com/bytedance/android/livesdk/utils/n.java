package com.bytedance.android.livesdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Locale;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17620a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r19, java.lang.Object... r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f17620a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 13654(0x3556, float:1.9133E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f17620a
            r15 = 1
            r16 = 13654(0x3556, float:1.9133E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0046:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.n.a(java.lang.String, java.lang.Object[]):java.lang.String");
    }

    public static String a(Locale locale, String str, Object... objArr) {
        if (!PatchProxy.isSupport(new Object[]{locale, str, objArr}, null, f17620a, true, 13655, new Class[]{Locale.class, String.class, Object[].class}, String.class)) {
            return String.format(locale, str, objArr);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{locale, str, objArr}, null, f17620a, true, 13655, new Class[]{Locale.class, String.class, Object[].class}, String.class);
    }
}
