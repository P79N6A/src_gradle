package com.ss.android.ugc.aweme.qrcode.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.qrcode.b.a;

public final class g extends a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f63355c;

    public g(a.C0684a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r21, int r22) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r11 = 1
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f63355c
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 70409(0x11309, float:9.8664E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0054
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f63355c
            r3 = 0
            r4 = 70409(0x11309, float:9.8664E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0054:
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 == 0) goto L_0x005b
            return r10
        L_0x005b:
            android.net.Uri r0 = android.net.Uri.parse(r21)
            java.lang.String r1 = r0.getHost()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x006a
            return r10
        L_0x006a:
            java.lang.String r2 = "amemv.com"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L_0x0092
            java.lang.String r2 = "douyin.com"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L_0x0092
            java.lang.String r2 = "tiktok.com"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L_0x0092
            java.lang.String r2 = "tiktokv.com"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L_0x0092
            java.lang.String r2 = "musical.ly"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0191
        L_0x0092:
            java.util.List r0 = r0.getPathSegments()
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0191
            int r1 = r0.size()
            r2 = 3
            if (r1 < r2) goto L_0x0191
            java.lang.Object r1 = r0.get(r10)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "share"
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x0191
            java.lang.Object r1 = r0.get(r11)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.qrcode.c.f63357a
            r15 = 1
            r16 = 70357(0x112d5, float:9.8591E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r10] = r4
            java.lang.Class r18 = java.lang.Integer.TYPE
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            r4 = 8
            r5 = 7
            r6 = 5
            r12 = 4
            if (r3 == 0) goto L_0x00ff
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r13[r10] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.qrcode.c.f63357a
            r16 = 1
            r17 = 70357(0x112d5, float:9.8591E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class r19 = java.lang.Integer.TYPE
            r18 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r9 = r1.intValue()
            goto L_0x0182
        L_0x00ff:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0181
            r3 = -1
            int r13 = r1.hashCode()
            switch(r13) {
                case -677145915: goto L_0x015e;
                case -400675352: goto L_0x0154;
                case -186119313: goto L_0x014a;
                case 3322092: goto L_0x0140;
                case 3599307: goto L_0x0136;
                case 104263205: goto L_0x012c;
                case 112202875: goto L_0x0122;
                case 1402633315: goto L_0x0118;
                case 1948294547: goto L_0x010e;
                default: goto L_0x010d;
            }
        L_0x010d:
            goto L_0x0169
        L_0x010e:
            java.lang.String r13 = "sticker_detail"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0169
            r1 = 7
            goto L_0x016a
        L_0x0118:
            java.lang.String r13 = "challenge"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0169
            r1 = 1
            goto L_0x016a
        L_0x0122:
            java.lang.String r13 = "video"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0169
            r1 = 2
            goto L_0x016a
        L_0x012c:
            java.lang.String r13 = "music"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0169
            r1 = 3
            goto L_0x016a
        L_0x0136:
            java.lang.String r13 = "user"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0169
            r1 = 0
            goto L_0x016a
        L_0x0140:
            java.lang.String r13 = "live"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0169
            r1 = 4
            goto L_0x016a
        L_0x014a:
            java.lang.String r13 = "bodydancelist"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0169
            r1 = 6
            goto L_0x016a
        L_0x0154:
            java.lang.String r13 = "poilist"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0169
            r1 = 5
            goto L_0x016a
        L_0x015e:
            java.lang.String r13 = "forward"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0169
            r1 = 8
            goto L_0x016a
        L_0x0169:
            r1 = -1
        L_0x016a:
            switch(r1) {
                case 0: goto L_0x017f;
                case 1: goto L_0x0182;
                case 2: goto L_0x017d;
                case 3: goto L_0x017b;
                case 4: goto L_0x0179;
                case 5: goto L_0x0177;
                case 6: goto L_0x0174;
                case 7: goto L_0x0171;
                case 8: goto L_0x016e;
                default: goto L_0x016d;
            }
        L_0x016d:
            goto L_0x0181
        L_0x016e:
            r9 = 19
            goto L_0x0182
        L_0x0171:
            r9 = 17
            goto L_0x0182
        L_0x0174:
            r9 = 8
            goto L_0x0182
        L_0x0177:
            r9 = 7
            goto L_0x0182
        L_0x0179:
            r9 = 5
            goto L_0x0182
        L_0x017b:
            r9 = 3
            goto L_0x0182
        L_0x017d:
            r9 = 1
            goto L_0x0182
        L_0x017f:
            r9 = 4
            goto L_0x0182
        L_0x0181:
            r9 = 0
        L_0x0182:
            java.lang.String r1 = com.ss.android.ugc.aweme.qrcode.c.a(r9, r0)
            r7.f63349a = r1
            com.ss.android.ugc.aweme.qrcode.b.a$a r1 = r7.f63350b
            r2 = r22
            boolean r0 = r1.a(r9, r0, r8, r2)
            return r0
        L_0x0191:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.b.g.a(java.lang.String, int):boolean");
    }
}
