package com.ss.android.ugc.aweme.shortvideo.util;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71106a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String[] r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f71106a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 81048(0x13c98, float:1.13572E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f71106a
            r15 = 1
            r16 = 81048(0x13c98, float:1.13572E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0048:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0054:
            int r3 = r0.length
            if (r10 >= r3) goto L_0x0066
            r3 = r0[r10]
            r2.append(r3)
            int r3 = r0.length
            int r3 = r3 - r11
            if (r10 == r3) goto L_0x0063
            r2.append(r1)
        L_0x0063:
            int r10 = r10 + 1
            goto L_0x0054
        L_0x0066:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.util.aj.a(java.lang.String[], java.lang.String):java.lang.String");
    }

    public static SpannableString a(SpannableString spannableString, int i, int i2, int i3) {
        SpannableString spannableString2 = spannableString;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{spannableString2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f71106a, true, 81047, new Class[]{SpannableString.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[]{spannableString2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f71106a, true, 81047, new Class[]{SpannableString.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, SpannableString.class);
        }
        int max = Math.max(0, i);
        if (TextUtils.isEmpty(spannableString) || max > i4 || max >= spannableString.length() || i4 > spannableString.length()) {
            return spannableString2;
        }
        ak.a(spannableString2, new ForegroundColorSpan(i3), max, i4, 17);
        return spannableString2;
    }
}
