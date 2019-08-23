package com.ss.android.ugc.aweme.commercialize.splash;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39459a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f39460b;

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f39459a, true, 32011, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f39459a, true, 32011, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(a.a().g)) {
            z = true;
        }
        return z;
    }

    static void a(boolean z) {
        if (!f39460b) {
            f39460b = z;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r18, android.view.View... r19) {
        /*
            r0 = r19
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r9 = 0
            r2[r9] = r3
            r10 = 1
            r2[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f39459a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r9] = r3
            java.lang.Class<android.view.View[]> r3 = android.view.View[].class
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 32013(0x7d0d, float:4.486E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0049
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r11[r9] = r2
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f39459a
            r14 = 1
            r15 = 32013(0x7d0d, float:4.486E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class<android.view.View[]> r1 = android.view.View[].class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0049:
            int r1 = r0.length
            if (r1 != 0) goto L_0x004d
            return
        L_0x004d:
            r1 = 8
            switch(r18) {
                case 1: goto L_0x00bb;
                case 2: goto L_0x00bb;
                case 3: goto L_0x006d;
                case 4: goto L_0x0054;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x00d0
        L_0x0054:
            int r2 = r0.length
            r3 = 0
        L_0x0056:
            if (r3 >= r2) goto L_0x00d0
            r4 = r0[r3]
            if (r4 == 0) goto L_0x006a
            int r5 = r4.getVisibility()
            if (r5 == r1) goto L_0x006a
            r4.setVisibility(r9)
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.setAlpha(r5)
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x0056
        L_0x006d:
            int r2 = r0.length
            r3 = 0
        L_0x006f:
            if (r3 >= r2) goto L_0x00ba
            r4 = r0[r3]
            if (r4 == 0) goto L_0x00b7
            int r5 = r4.getVisibility()
            if (r5 == r1) goto L_0x00b7
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r9] = r4
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f39459a
            r14 = 1
            r15 = 32014(0x7d0e, float:4.4861E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r5[r9] = r6
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x00ad
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r9] = r4
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f39459a
            r14 = 1
            r15 = 32014(0x7d0e, float:4.4861E-41)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r4[r9] = r5
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00b7
        L_0x00ad:
            com.ss.android.ugc.aweme.commercialize.splash.e r5 = new com.ss.android.ugc.aweme.commercialize.splash.e
            r5.<init>(r4)
            r6 = 260(0x104, double:1.285E-321)
            r4.postDelayed(r5, r6)
        L_0x00b7:
            int r3 = r3 + 1
            goto L_0x006f
        L_0x00ba:
            return
        L_0x00bb:
            int r2 = r0.length
        L_0x00bc:
            if (r9 >= r2) goto L_0x00cf
            r3 = r0[r9]
            if (r3 == 0) goto L_0x00cc
            int r4 = r3.getVisibility()
            if (r4 == r1) goto L_0x00cc
            r4 = 4
            r3.setVisibility(r4)
        L_0x00cc:
            int r9 = r9 + 1
            goto L_0x00bc
        L_0x00cf:
            return
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.splash.d.a(int, android.view.View[]):void");
    }
}
