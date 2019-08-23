package com.ss.android.ugc.aweme.story.feed.c;

import com.meituan.robust.ChangeQuickRedirect;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72495a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.res.Resources r20, long r21) {
        /*
            r0 = r20
            r1 = r21
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r1)
            r12 = 1
            r4[r12] = r5
            com.meituan.robust.ChangeQuickRedirect r6 = f72495a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.content.res.Resources> r5 = android.content.res.Resources.class
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r9[r12] = r5
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r5 = 0
            r7 = 1
            r8 = 83677(0x146dd, float:1.17256E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0053
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r13[r12] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f72495a
            r16 = 1
            r17 = 83677(0x146dd, float:1.17256E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r12] = r1
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0053:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r11] = r0
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r1)
            r4[r12] = r5
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f72495a
            r7 = 1
            r8 = 83678(0x146de, float:1.17258E-40)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.content.res.Resources> r10 = android.content.res.Resources.class
            r9[r11] = r10
            java.lang.Class r10 = java.lang.Long.TYPE
            r9[r12] = r10
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x009f
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r0
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r1)
            r13[r12] = r4
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f72495a
            r16 = 1
            r17 = 83678(0x146de, float:1.17258E-40)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.content.res.Resources> r6 = android.content.res.Resources.class
            r4[r11] = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            r4[r12] = r6
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r4
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00ed
        L_0x009f:
            boolean r4 = android.text.format.DateUtils.isToday(r21)
            if (r4 != 0) goto L_0x00a7
            r4 = r5
            goto L_0x00ed
        L_0x00a7:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            r8 = 60
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00bd
            r4 = 2131562738(0x7f0d10f2, float:1.8750913E38)
            java.lang.String r4 = r0.getString(r4)
            goto L_0x00ed
        L_0x00bd:
            long r13 = r6 / r8
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d7
            r4 = 2131562746(0x7f0d10fa, float:1.875093E38)
            java.lang.String r4 = r0.getString(r4)
            java.lang.Object[] r6 = new java.lang.Object[r12]
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            r6[r11] = r7
            java.lang.String r4 = java.lang.String.format(r4, r6)
            goto L_0x00ed
        L_0x00d7:
            r4 = 2131562737(0x7f0d10f1, float:1.8750911E38)
            java.lang.String r4 = r0.getString(r4)
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r9 = 3600(0xe10, double:1.7786E-320)
            long r6 = r6 / r9
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r8[r11] = r6
            java.lang.String r4 = java.lang.String.format(r4, r8)
        L_0x00ed:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x02a3
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r0
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r1)
            r13[r12] = r4
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f72495a
            r16 = 1
            r17 = 83679(0x146df, float:1.17259E-40)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.content.res.Resources> r6 = android.content.res.Resources.class
            r4[r11] = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            r4[r12] = r6
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            r6 = 5
            if (r4 == 0) goto L_0x0143
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r0
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r1)
            r13[r12] = r4
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f72495a
            r16 = 1
            r17 = 83679(0x146df, float:1.17259E-40)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.content.res.Resources> r7 = android.content.res.Resources.class
            r4[r11] = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            r4[r12] = r7
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r4
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x017e
        L_0x0143:
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r4.setTimeInMillis(r1)
            r4.add(r6, r12)
            long r7 = r4.getTimeInMillis()
            boolean r7 = android.text.format.DateUtils.isToday(r7)
            if (r7 != 0) goto L_0x0159
            r4 = r5
            goto L_0x017e
        L_0x0159:
            r7 = 2131562741(0x7f0d10f5, float:1.875092E38)
            java.lang.String r7 = r0.getString(r7)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r9 = 11
            int r9 = r4.get(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r11] = r9
            r9 = 12
            int r4 = r4.get(r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8[r12] = r4
            java.lang.String r4 = java.lang.String.format(r7, r8)
        L_0x017e:
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 == 0) goto L_0x02a3
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r0
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r1)
            r13[r12] = r4
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f72495a
            r16 = 1
            r17 = 83680(0x146e0, float:1.1726E-40)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.content.res.Resources> r7 = android.content.res.Resources.class
            r4[r11] = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            r4[r12] = r7
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x01d5
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r0
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r1)
            r13[r12] = r4
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f72495a
            r16 = 1
            r17 = 83680(0x146e0, float:1.1726E-40)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.content.res.Resources> r5 = android.content.res.Resources.class
            r4[r11] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r4[r12] = r5
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r4
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
        L_0x01d3:
            r4 = r5
            goto L_0x020e
        L_0x01d5:
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            r7.setTimeInMillis(r1)
            int r8 = r7.get(r12)
            int r4 = r4.get(r12)
            if (r8 == r4) goto L_0x01eb
            goto L_0x01d3
        L_0x01eb:
            r4 = 2131562722(0x7f0d10e2, float:1.875088E38)
            java.lang.String r4 = r0.getString(r4)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            int r8 = r7.get(r3)
            int r8 = r8 + r12
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r11] = r8
            int r7 = r7.get(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r12] = r7
            java.lang.String r5 = java.lang.String.format(r4, r5)
            goto L_0x01d3
        L_0x020e:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x02a3
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r0
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r1)
            r13[r12] = r4
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f72495a
            r16 = 1
            r17 = 83681(0x146e1, float:1.17262E-40)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.content.res.Resources> r5 = android.content.res.Resources.class
            r4[r11] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r4[r12] = r5
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x0264
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r13[r12] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f72495a
            r16 = 1
            r17 = 83681(0x146e1, float:1.17262E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r12] = r1
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0262:
            r4 = r0
            goto L_0x0299
        L_0x0264:
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r4.setTimeInMillis(r1)
            r1 = 2131562751(0x7f0d10ff, float:1.875094E38)
            java.lang.String r0 = r0.getString(r1)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.get(r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r11] = r2
            int r2 = r4.get(r3)
            int r2 = r2 + r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r12] = r2
            int r2 = r4.get(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r3] = r2
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0262
        L_0x0299:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x02a0
            goto L_0x02a3
        L_0x02a0:
            java.lang.String r0 = ""
            return r0
        L_0x02a3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.b.a(android.content.res.Resources, long):java.lang.String");
    }
}
