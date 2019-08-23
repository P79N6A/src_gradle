package com.bytedance.android.livesdkapi.depend.d;

import com.meituan.robust.ChangeQuickRedirect;

public enum a {
    FEED_WITH_PREVIEW("feed_with_preview"),
    FEED("feed"),
    FEED_SHORTCUT("feed_shortcut"),
    MOMENT("moment"),
    SLIDE("slide"),
    LIVE_END("live_end"),
    PUSH("push"),
    WEB("web"),
    OTHER("other");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String typeName;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
        if (r0.equals("feed") != false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.android.livesdkapi.depend.d.a convert(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<com.bytedance.android.livesdkapi.depend.d.a> r8 = com.bytedance.android.livesdkapi.depend.d.a.class
            r3 = 0
            r5 = 1
            r6 = 14931(0x3a53, float:2.0923E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 14931(0x3a53, float:2.0923E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<com.bytedance.android.livesdkapi.depend.d.a> r16 = com.bytedance.android.livesdkapi.depend.d.a.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.android.livesdkapi.depend.d.a r0 = (com.bytedance.android.livesdkapi.depend.d.a) r0
            return r0
        L_0x0035:
            boolean r2 = android.text.TextUtils.isEmpty(r17)
            r3 = 0
            if (r2 == 0) goto L_0x003d
            return r3
        L_0x003d:
            r2 = -1
            int r4 = r17.hashCode()
            switch(r4) {
                case -1068531200: goto L_0x0096;
                case 117588: goto L_0x008c;
                case 3138974: goto L_0x0083;
                case 3452698: goto L_0x0079;
                case 106069776: goto L_0x006e;
                case 109526449: goto L_0x0064;
                case 758159815: goto L_0x005a;
                case 1418007304: goto L_0x0050;
                case 1595681360: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x00a0
        L_0x0046:
            java.lang.String r1 = "feed_with_preview"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a0
            r1 = 0
            goto L_0x00a1
        L_0x0050:
            java.lang.String r1 = "live_end"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a0
            r1 = 5
            goto L_0x00a1
        L_0x005a:
            java.lang.String r1 = "feed_shortcut"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a0
            r1 = 2
            goto L_0x00a1
        L_0x0064:
            java.lang.String r1 = "slide"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a0
            r1 = 4
            goto L_0x00a1
        L_0x006e:
            java.lang.String r1 = "other"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a0
            r1 = 8
            goto L_0x00a1
        L_0x0079:
            java.lang.String r1 = "push"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a0
            r1 = 6
            goto L_0x00a1
        L_0x0083:
            java.lang.String r4 = "feed"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00a0
            goto L_0x00a1
        L_0x008c:
            java.lang.String r1 = "web"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a0
            r1 = 7
            goto L_0x00a1
        L_0x0096:
            java.lang.String r1 = "moment"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a0
            r1 = 3
            goto L_0x00a1
        L_0x00a0:
            r1 = -1
        L_0x00a1:
            switch(r1) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00ba;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00b1;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00ab;
                case 7: goto L_0x00a8;
                case 8: goto L_0x00a5;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            goto L_0x00bf
        L_0x00a5:
            com.bytedance.android.livesdkapi.depend.d.a r3 = OTHER
            goto L_0x00bf
        L_0x00a8:
            com.bytedance.android.livesdkapi.depend.d.a r3 = WEB
            goto L_0x00bf
        L_0x00ab:
            com.bytedance.android.livesdkapi.depend.d.a r3 = PUSH
            goto L_0x00bf
        L_0x00ae:
            com.bytedance.android.livesdkapi.depend.d.a r3 = LIVE_END
            goto L_0x00bf
        L_0x00b1:
            com.bytedance.android.livesdkapi.depend.d.a r3 = SLIDE
            goto L_0x00bf
        L_0x00b4:
            com.bytedance.android.livesdkapi.depend.d.a r3 = MOMENT
            goto L_0x00bf
        L_0x00b7:
            com.bytedance.android.livesdkapi.depend.d.a r3 = FEED_SHORTCUT
            goto L_0x00bf
        L_0x00ba:
            com.bytedance.android.livesdkapi.depend.d.a r3 = FEED
            goto L_0x00bf
        L_0x00bd:
            com.bytedance.android.livesdkapi.depend.d.a r3 = FEED_WITH_PREVIEW
        L_0x00bf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.depend.d.a.convert(java.lang.String):com.bytedance.android.livesdkapi.depend.d.a");
    }

    private a(String str) {
        this.typeName = str;
    }
}
