package com.ss.android.ugc.aweme.share;

import com.meituan.robust.ChangeQuickRedirect;

public final class cn {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64994a;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f64994a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = 0
            r5 = 1
            r6 = 73375(0x11e9f, float:1.0282E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f64994a
            r13 = 1
            r14 = 73375(0x11e9f, float:1.0282E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            r2 = -1
            int r3 = r17.hashCode()
            switch(r3) {
                case -1322993519: goto L_0x00b9;
                case -1134307907: goto L_0x00af;
                case -929929834: goto L_0x00a4;
                case -925677868: goto L_0x009a;
                case -791575966: goto L_0x0090;
                case -427019145: goto L_0x0086;
                case 3616: goto L_0x007c;
                case 3357525: goto L_0x0072;
                case 108102557: goto L_0x0067;
                case 113011944: goto L_0x005c;
                case 169159643: goto L_0x0051;
                case 1406022185: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x00c3
        L_0x0045:
            java.lang.String r3 = "save_local"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c3
            r0 = 11
            goto L_0x00c4
        L_0x0051:
            java.lang.String r3 = "rocket_space"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c3
            r0 = 7
            goto L_0x00c4
        L_0x005c:
            java.lang.String r3 = "weibo"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c3
            r0 = 8
            goto L_0x00c4
        L_0x0067:
            java.lang.String r3 = "qzone"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c3
            r0 = 9
            goto L_0x00c4
        L_0x0072:
            java.lang.String r3 = "more"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c3
            r0 = 2
            goto L_0x00c4
        L_0x007c:
            java.lang.String r3 = "qq"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c3
            r0 = 4
            goto L_0x00c4
        L_0x0086:
            java.lang.String r3 = "share_native"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c3
            r0 = 0
            goto L_0x00c4
        L_0x0090:
            java.lang.String r3 = "weixin"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c3
            r0 = 3
            goto L_0x00c4
        L_0x009a:
            java.lang.String r3 = "rocket"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c3
            r0 = 6
            goto L_0x00c4
        L_0x00a4:
            java.lang.String r3 = "weixin_moments"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c3
            r0 = 10
            goto L_0x00c4
        L_0x00af:
            java.lang.String r3 = "toutiao"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c3
            r0 = 5
            goto L_0x00c4
        L_0x00b9:
            java.lang.String r3 = "chat_merge"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c3
            r0 = 1
            goto L_0x00c4
        L_0x00c3:
            r0 = -1
        L_0x00c4:
            switch(r0) {
                case 0: goto L_0x00c8;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00c8;
                case 4: goto L_0x00c8;
                case 5: goto L_0x00c8;
                case 6: goto L_0x00c8;
                case 7: goto L_0x00c8;
                case 8: goto L_0x00c8;
                case 9: goto L_0x00c8;
                case 10: goto L_0x00c8;
                case 11: goto L_0x00c8;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            return r9
        L_0x00c8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.cn.a(java.lang.String):boolean");
    }
}
