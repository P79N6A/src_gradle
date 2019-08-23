package com.toutiao.proxyserver;

import com.meituan.robust.ChangeQuickRedirect;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80008a;

    /* JADX WARNING: Removed duplicated region for block: B:109:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ce  */
    @me.ele.lancet.base.annotations.Insert
    @me.ele.lancet.base.annotations.TargetClass
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.toutiao.proxyserver.net.e a(com.toutiao.proxyserver.a r23, java.lang.String r24, int r25, int r26, java.lang.String r27) throws java.io.IOException {
        /*
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = 5
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r25)
            r13 = 2
            r4[r13] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r26)
            r14 = 3
            r4[r14] = r5
            r15 = 4
            r4[r15] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f80008a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<com.toutiao.proxyserver.a> r5 = com.toutiao.proxyserver.a.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r13] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r14] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r15] = r5
            java.lang.Class<com.toutiao.proxyserver.net.e> r10 = com.toutiao.proxyserver.net.e.class
            r5 = 0
            r7 = 1
            r8 = 91603(0x165d3, float:1.28363E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0085
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r11] = r0
            r4[r12] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r4[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r4[r14] = r0
            r4[r15] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f80008a
            r19 = 1
            r20 = 91603(0x165d3, float:1.28363E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.toutiao.proxyserver.a> r1 = com.toutiao.proxyserver.a.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r15] = r1
            java.lang.Class<com.toutiao.proxyserver.net.e> r22 = com.toutiao.proxyserver.net.e.class
            r16 = r4
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            com.toutiao.proxyserver.net.e r0 = (com.toutiao.proxyserver.net.e) r0
            return r0
        L_0x0085:
            com.ss.android.ugc.aweme.feed.al r10 = com.ss.android.ugc.aweme.feed.al.h
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.feed.al.f45034a
            r6 = 0
            r7 = 40239(0x9d2f, float:5.6387E-41)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r10
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x00ab
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.feed.al.f45034a
            r6 = 0
            r7 = 40239(0x9d2f, float:5.6387E-41)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00c9
        L_0x00ab:
            boolean r3 = com.ss.android.ugc.aweme.i18n.c.a()
            if (r3 == 0) goto L_0x00c9
            boolean r3 = com.ss.android.ugc.aweme.feed.al.f45039f
            if (r3 != 0) goto L_0x00c9
            boolean r3 = com.ss.android.ugc.aweme.feed.al.f45038e
            if (r3 == 0) goto L_0x00ba
            goto L_0x00c9
        L_0x00ba:
            com.ss.android.ugc.aweme.feed.al.f45039f = r12
            long r3 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.feed.al.g = r3
            com.ss.android.ugc.aweme.feed.al$b r3 = com.ss.android.ugc.aweme.feed.al.b.f45043b
            java.util.concurrent.Callable r3 = (java.util.concurrent.Callable) r3
            a.i.a((java.util.concurrent.Callable<TResult>) r3)
        L_0x00c9:
            com.toutiao.proxyserver.t r3 = r0.j
            if (r3 == 0) goto L_0x00cf
            r3 = 1
            goto L_0x00d0
        L_0x00cf:
            r3 = 0
        L_0x00d0:
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r7 = ""
            java.lang.String r8 = "&source_id="
            int r8 = r1.lastIndexOf(r8)
            r9 = 0
            if (r3 == 0) goto L_0x0194
            boolean r15 = com.ss.android.ugc.aweme.u.b.a.c()
            if (r15 != 0) goto L_0x0194
            boolean r15 = android.text.TextUtils.isEmpty(r24)
            if (r15 != 0) goto L_0x0194
            java.lang.String r15 = r0.h
            java.lang.String r15 = (java.lang.String) r15
            if (r8 <= 0) goto L_0x00fe
            int r6 = r8 + 11
            int r11 = r24.length()
            if (r6 >= r11) goto L_0x00fe
            java.lang.String r7 = r1.substring(r6)
        L_0x00fe:
            boolean r6 = android.text.TextUtils.isEmpty(r15)
            if (r6 != 0) goto L_0x010b
            java.lang.String r6 = "_"
            java.lang.String[] r6 = r15.split(r6)
            goto L_0x010c
        L_0x010b:
            r6 = 0
        L_0x010c:
            long r15 = com.ss.android.ugc.aweme.feed.z.f47069d
            com.ss.android.ugc.aweme.feed.z.f47069d = r9
            com.ss.android.ugc.aweme.common.t r11 = new com.ss.android.ugc.aweme.common.t
            r11.<init>()
            java.lang.String r12 = "duration"
            int r17 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r17 <= 0) goto L_0x0122
            long r17 = android.os.SystemClock.elapsedRealtime()
            long r15 = r17 - r15
            goto L_0x0123
        L_0x0122:
            r15 = r9
        L_0x0123:
            java.lang.String r15 = java.lang.Long.toString(r15)
            com.ss.android.ugc.aweme.common.t r11 = r11.a(r12, r15)
            java.lang.String r12 = "is_first"
            boolean r15 = com.ss.android.ugc.aweme.u.b.e.f75101a
            java.lang.String r15 = java.lang.String.valueOf(r15)
            com.ss.android.ugc.aweme.common.t r11 = r11.a(r12, r15)
            java.lang.String r12 = "group_id"
            com.ss.android.ugc.aweme.common.t r11 = r11.a(r12, r7)
            java.lang.String r12 = "bitRate"
            if (r6 == 0) goto L_0x0147
            int r15 = r6.length
            if (r15 <= r14) goto L_0x0147
            r15 = r6[r14]
            goto L_0x0149
        L_0x0147:
            java.lang.String r15 = ""
        L_0x0149:
            com.ss.android.ugc.aweme.common.t r11 = r11.a(r12, r15)
            java.lang.String r12 = "video_type"
            if (r6 == 0) goto L_0x0157
            int r15 = r6.length
            if (r15 <= r13) goto L_0x0157
            r15 = r6[r13]
            goto L_0x0159
        L_0x0157:
            java.lang.String r15 = ""
        L_0x0159:
            com.ss.android.ugc.aweme.common.t r11 = r11.a(r12, r15)
            java.lang.String r12 = "isH265"
            if (r6 == 0) goto L_0x0168
            int r15 = r6.length
            r9 = 1
            if (r15 <= r9) goto L_0x0168
            r10 = r6[r9]
            goto L_0x016a
        L_0x0168:
            java.lang.String r10 = ""
        L_0x016a:
            com.ss.android.ugc.aweme.common.t r9 = r11.a(r12, r10)
            java.lang.String r10 = "from_size"
            java.lang.String r11 = java.lang.String.valueOf(r25)
            com.ss.android.ugc.aweme.common.t r9 = r9.a(r10, r11)
            java.lang.String r10 = "to_size"
            java.lang.String r11 = java.lang.String.valueOf(r26)
            com.ss.android.ugc.aweme.common.t r9 = r9.a(r10, r11)
            org.json.JSONObject r9 = r9.a()
            com.ss.android.ugc.aweme.u.b.e$a r10 = new com.ss.android.ugc.aweme.u.b.e$a
            java.lang.String r11 = "video_api_request"
            r10.<init>(r11, r9)
            a.i.a((java.util.concurrent.Callable<TResult>) r10)
            r9 = 0
            com.ss.android.ugc.aweme.u.b.e.f75101a = r9
            goto L_0x0196
        L_0x0194:
            r9 = 0
            r6 = 0
        L_0x0196:
            if (r8 <= 0) goto L_0x01a4
            if (r3 == 0) goto L_0x01a4
            boolean r10 = android.text.TextUtils.isEmpty(r24)
            if (r10 != 0) goto L_0x01a4
            java.lang.String r1 = r1.substring(r9, r8)
        L_0x01a4:
            r8 = r26
            r10 = r1
            r1 = r25
            com.toutiao.proxyserver.net.e r0 = r0.b(r10, r1, r8, r2)
            if (r0 == 0) goto L_0x0207
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x0207
            com.ss.android.ugc.aweme.feed.al r2 = com.ss.android.ugc.aweme.feed.al.h
            java.lang.Object[] r15 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.feed.al.f45034a
            r18 = 0
            r19 = 40240(0x9d30, float:5.6388E-41)
            java.lang.Class[] r10 = new java.lang.Class[r9]
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r2
            r20 = r10
            boolean r10 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r10 == 0) goto L_0x01e3
            java.lang.Object[] r15 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.feed.al.f45034a
            r18 = 0
            r19 = 40240(0x9d30, float:5.6388E-41)
            java.lang.Class[] r10 = new java.lang.Class[r9]
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r2
            r20 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x01f1
        L_0x01e3:
            boolean r2 = com.ss.android.ugc.aweme.feed.al.f45038e
            if (r2 != 0) goto L_0x01f1
            r2 = 1
            com.ss.android.ugc.aweme.feed.al.f45038e = r2
            com.ss.android.ugc.aweme.feed.al$a r2 = com.ss.android.ugc.aweme.feed.al.a.f45041b
            java.util.concurrent.Callable r2 = (java.util.concurrent.Callable) r2
            a.i.a((java.util.concurrent.Callable<TResult>) r2)
        L_0x01f1:
            java.lang.String r2 = "Content-Length"
            java.lang.String r2 = r0.a(r2)     // Catch:{ Exception -> 0x01fe }
            if (r2 == 0) goto L_0x01fe
            long r9 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x01fe }
            goto L_0x0200
        L_0x01fe:
            r9 = 0
        L_0x0200:
            com.ss.android.ugc.traffic.a r2 = com.ss.android.ugc.traffic.a.y
            int r2 = com.ss.android.ugc.traffic.a.f77808b
            com.ss.android.ugc.traffic.a.a(r2, r9)
        L_0x0207:
            if (r3 == 0) goto L_0x02dc
            boolean r2 = com.ss.android.ugc.aweme.u.b.a.c()
            if (r2 != 0) goto L_0x02dc
            com.ss.android.ugc.aweme.common.t r2 = new com.ss.android.ugc.aweme.common.t
            r2.<init>()
            java.lang.String r3 = "feed_tab"
            java.lang.String r9 = com.ss.android.ugc.aweme.feed.z.e()
            com.ss.android.ugc.aweme.common.t r2 = r2.a(r3, r9)
            java.lang.String r3 = "duration"
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r9 - r4
            java.lang.String r4 = java.lang.String.valueOf(r9)
            com.ss.android.ugc.aweme.common.t r2 = r2.a(r3, r4)
            java.lang.String r3 = "is_first"
            boolean r4 = com.ss.android.ugc.aweme.u.b.e.f75102b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.ss.android.ugc.aweme.common.t r2 = r2.a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.common.t r2 = r2.a(r3, r7)
            java.lang.String r3 = "bitRate"
            if (r6 == 0) goto L_0x0249
            int r4 = r6.length
            if (r4 <= r14) goto L_0x0249
            r4 = r6[r14]
            goto L_0x024b
        L_0x0249:
            java.lang.String r4 = ""
        L_0x024b:
            com.ss.android.ugc.aweme.common.t r2 = r2.a(r3, r4)
            java.lang.String r3 = "video_type"
            if (r6 == 0) goto L_0x0259
            int r4 = r6.length
            if (r4 <= r13) goto L_0x0259
            r4 = r6[r13]
            goto L_0x025b
        L_0x0259:
            java.lang.String r4 = ""
        L_0x025b:
            com.ss.android.ugc.aweme.common.t r2 = r2.a(r3, r4)
            java.lang.String r3 = "isH265"
            if (r6 == 0) goto L_0x026a
            int r4 = r6.length
            r9 = 1
            if (r4 <= r9) goto L_0x026b
            r4 = r6[r9]
            goto L_0x026d
        L_0x026a:
            r9 = 1
        L_0x026b:
            java.lang.String r4 = ""
        L_0x026d:
            com.ss.android.ugc.aweme.common.t r2 = r2.a(r3, r4)
            java.lang.String r3 = "from_size"
            java.lang.String r1 = java.lang.String.valueOf(r25)
            com.ss.android.ugc.aweme.common.t r1 = r2.a(r3, r1)
            java.lang.String r2 = "to_size"
            java.lang.String r3 = java.lang.String.valueOf(r26)
            com.ss.android.ugc.aweme.common.t r1 = r1.a(r2, r3)
            java.lang.String r2 = "is_success"
            if (r0 == 0) goto L_0x0290
            boolean r3 = r0.a()
            if (r3 == 0) goto L_0x0290
            goto L_0x0291
        L_0x0290:
            r9 = 0
        L_0x0291:
            java.lang.String r3 = java.lang.String.valueOf(r9)
            com.ss.android.ugc.aweme.common.t r1 = r1.a(r2, r3)
            org.json.JSONObject r1 = r1.a()
            com.ss.android.ugc.aweme.u.b.e$a r2 = new com.ss.android.ugc.aweme.u.b.e$a
            java.lang.String r3 = "video_api_response"
            r2.<init>(r3, r1)
            a.i.a((java.util.concurrent.Callable<TResult>) r2)
            r1 = 0
            com.ss.android.ugc.aweme.u.b.e.f75102b = r1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.feed.z.f47066a
            r5 = 1
            r6 = 40118(0x9cb6, float:5.6217E-41)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r8 = java.lang.Void.TYPE
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x02ce
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.feed.z.f47066a
            r6 = 1
            r7 = 40118(0x9cb6, float:5.6217E-41)
            java.lang.Class[] r8 = new java.lang.Class[r1]
            java.lang.Class r9 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x02dc
        L_0x02ce:
            long r1 = com.ss.android.ugc.aweme.feed.z.f47070e
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x02dc
            long r1 = android.os.SystemClock.elapsedRealtime()
            com.ss.android.ugc.aweme.feed.z.f47070e = r1
        L_0x02dc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.b.a(com.toutiao.proxyserver.a, java.lang.String, int, int, java.lang.String):com.toutiao.proxyserver.net.e");
    }
}
