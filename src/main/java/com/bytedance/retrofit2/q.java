package com.bytedance.retrofit2;

public final class q {
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0127  */
    @me.ele.lancet.base.annotations.Insert
    @me.ele.lancet.base.annotations.TargetClass
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.bytedance.retrofit2.SsResponse a(com.bytedance.retrofit2.SsHttpCall r15) throws java.lang.Throwable {
        /*
            com.bytedance.retrofit2.client.Request r0 = r15.originalRequest
            com.bytedance.retrofit2.client.Request r0 = (com.bytedance.retrofit2.client.Request) r0
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 1
            com.bytedance.retrofit2.SsResponse r5 = r15.getResponseWithInterceptorChain$___twin___()     // Catch:{ a -> 0x0098 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ a -> 0x0096 }
            r6[r3] = r0     // Catch:{ a -> 0x0096 }
            r6[r4] = r5     // Catch:{ a -> 0x0096 }
            r7 = 0
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.g.f52993a     // Catch:{ a -> 0x0096 }
            r9 = 1
            r10 = 55037(0xd6fd, float:7.7123E-41)
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ a -> 0x0096 }
            java.lang.Class<com.bytedance.retrofit2.client.Request> r12 = com.bytedance.retrofit2.client.Request.class
            r11[r3] = r12     // Catch:{ a -> 0x0096 }
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r12 = com.bytedance.retrofit2.SsResponse.class
            r11[r4] = r12     // Catch:{ a -> 0x0096 }
            java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch:{ a -> 0x0096 }
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ a -> 0x0096 }
            if (r6 == 0) goto L_0x004f
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ a -> 0x0096 }
            r7[r3] = r0     // Catch:{ a -> 0x0096 }
            r7[r4] = r5     // Catch:{ a -> 0x0096 }
            r8 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.g.f52993a     // Catch:{ a -> 0x0096 }
            r10 = 1
            r11 = 55037(0xd6fd, float:7.7123E-41)
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ a -> 0x0096 }
            java.lang.Class<com.bytedance.retrofit2.client.Request> r6 = com.bytedance.retrofit2.client.Request.class
            r12[r3] = r6     // Catch:{ a -> 0x0096 }
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r6 = com.bytedance.retrofit2.SsResponse.class
            r12[r4] = r6     // Catch:{ a -> 0x0096 }
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch:{ a -> 0x0096 }
            java.lang.Object r6 = com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ a -> 0x0096 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ a -> 0x0096 }
            boolean r6 = r6.booleanValue()     // Catch:{ a -> 0x0096 }
            goto L_0x008c
        L_0x004f:
            com.bytedance.retrofit2.client.Response r6 = r5.raw()     // Catch:{ a -> 0x0096 }
            java.lang.String r7 = "Content-Type"
            com.bytedance.retrofit2.client.Header r6 = r6.getFirstHeader(r7)     // Catch:{ a -> 0x0096 }
            java.lang.String r7 = r0.getPath()     // Catch:{ a -> 0x0096 }
            if (r6 == 0) goto L_0x008b
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ a -> 0x0096 }
            if (r8 != 0) goto L_0x0076
            java.lang.String r8 = "/effect/api"
            boolean r8 = r7.contains(r8)     // Catch:{ a -> 0x0096 }
            if (r8 != 0) goto L_0x008b
            java.lang.String r8 = "/model/api"
            boolean r7 = r7.contains(r8)     // Catch:{ a -> 0x0096 }
            if (r7 == 0) goto L_0x0076
            goto L_0x008b
        L_0x0076:
            java.lang.String r6 = r6.getValue()     // Catch:{ a -> 0x0096 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ a -> 0x0096 }
            if (r7 != 0) goto L_0x0089
            java.lang.String r7 = "json"
            boolean r6 = r6.contains(r7)     // Catch:{ a -> 0x0096 }
            if (r6 != 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r6 = 0
            goto L_0x008c
        L_0x008b:
            r6 = 1
        L_0x008c:
            if (r6 == 0) goto L_0x008f
            return r5
        L_0x008f:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.e r6 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.a((com.bytedance.retrofit2.SsResponse) r5)     // Catch:{ a -> 0x0096 }
            if (r6 != 0) goto L_0x0121
            return r5
        L_0x0096:
            r1 = move-exception
            goto L_0x009c
        L_0x0098:
            r5 = move-exception
            r14 = r5
            r5 = r1
            r1 = r14
        L_0x009c:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r3] = r1
            r7 = 0
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.f52964a
            r9 = 1
            r10 = 55025(0xd6f1, float:7.7106E-41)
            java.lang.Class[] r11 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.base.api.a.b.a> r12 = com.ss.android.ugc.aweme.base.api.a.b.a.class
            r11[r3] = r12
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.e> r12 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.e.class
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x00cf
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r3] = r1
            r8 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.f52964a
            r10 = 1
            r11 = 55025(0xd6f1, float:7.7106E-41)
            java.lang.Class[] r12 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.base.api.a.b.a> r6 = com.ss.android.ugc.aweme.base.api.a.b.a.class
            r12[r3] = r6
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.e> r13 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.e.class
            java.lang.Object r6 = com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.e r6 = (com.ss.android.ugc.aweme.lancet.ssretrofitchain.e) r6
            goto L_0x0121
        L_0x00cf:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r3] = r1
            r8 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.f52964a
            r10 = 1
            r11 = 55026(0xd6f2, float:7.7108E-41)
            java.lang.Class[] r12 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.base.api.a.b.a> r6 = com.ss.android.ugc.aweme.base.api.a.b.a.class
            r12[r3] = r6
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.e$a> r13 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.e.a.class
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r6 == 0) goto L_0x0102
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r3] = r1
            r8 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.f52964a
            r10 = 1
            r11 = 55026(0xd6f2, float:7.7108E-41)
            java.lang.Class[] r12 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.base.api.a.b.a> r6 = com.ss.android.ugc.aweme.base.api.a.b.a.class
            r12[r3] = r6
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.e$a> r13 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.e.a.class
            java.lang.Object r6 = com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.e$a r6 = (com.ss.android.ugc.aweme.lancet.ssretrofitchain.e.a) r6
            goto L_0x0119
        L_0x0102:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.e$a r6 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.e$a
            r6.<init>()
            int r7 = r1.getErrorCode()
            r6.f52989a = r7
            java.lang.String r7 = r1.getErrorMsg()
            r6.f52990b = r7
            java.lang.String r7 = r1.getPrompt()
            r6.f52991c = r7
        L_0x0119:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.e r7 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.e
            r8 = -1
            r7.<init>(r6, r8)
            r6 = r7
        L_0x0121:
            if (r6 != 0) goto L_0x0127
            if (r1 != 0) goto L_0x0126
            return r5
        L_0x0126:
            throw r1
        L_0x0127:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.b r7 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.b.a()
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.c$a r6 = r7.b(r6, r0, r5)
            boolean r7 = r6.f52972a
            if (r7 == 0) goto L_0x023e
            java.lang.String r7 = r0.getUrl()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x023e
            com.bytedance.retrofit2.CallServerInterceptor r1 = r15.callServerInterceptor
            com.bytedance.retrofit2.CallServerInterceptor r1 = (com.bytedance.retrofit2.CallServerInterceptor) r1
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r3] = r0
            r7[r4] = r6
            r8 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.g.f52993a
            r10 = 1
            r11 = 55035(0xd6fb, float:7.712E-41)
            java.lang.Class[] r12 = new java.lang.Class[r2]
            java.lang.Class<com.bytedance.retrofit2.client.Request> r5 = com.bytedance.retrofit2.client.Request.class
            r12[r3] = r5
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.c$a> r5 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.c.a.class
            r12[r4] = r5
            java.lang.Class<com.bytedance.retrofit2.client.Request> r13 = com.bytedance.retrofit2.client.Request.class
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r5 == 0) goto L_0x0181
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r3] = r0
            r7[r4] = r6
            r8 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.g.f52993a
            r10 = 1
            r11 = 55035(0xd6fb, float:7.712E-41)
            java.lang.Class[] r12 = new java.lang.Class[r2]
            java.lang.Class<com.bytedance.retrofit2.client.Request> r0 = com.bytedance.retrofit2.client.Request.class
            r12[r3] = r0
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.c$a> r0 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.c.a.class
            r12[r4] = r0
            java.lang.Class<com.bytedance.retrofit2.client.Request> r13 = com.bytedance.retrofit2.client.Request.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)
            com.bytedance.retrofit2.client.Request r0 = (com.bytedance.retrofit2.client.Request) r0
            goto L_0x0234
        L_0x0181:
            java.util.Map<java.lang.String, java.lang.String> r5 = r6.f52974c
            if (r5 != 0) goto L_0x0197
            com.bytedance.retrofit2.client.Request$Builder r2 = r0.newBuilder()
            java.lang.String r0 = r0.getUrl()
            com.bytedance.retrofit2.client.Request$Builder r0 = r2.url(r0)
            com.bytedance.retrofit2.client.Request r0 = r0.build()
            goto L_0x0234
        L_0x0197:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r3] = r0
            r7[r4] = r6
            r8 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.g.f52993a
            r10 = 1
            r11 = 55036(0xd6fc, float:7.7122E-41)
            java.lang.Class[] r12 = new java.lang.Class[r2]
            java.lang.Class<com.bytedance.retrofit2.client.Request> r5 = com.bytedance.retrofit2.client.Request.class
            r12[r3] = r5
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.c$a> r5 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.c.a.class
            r12[r4] = r5
            java.lang.Class<com.bytedance.retrofit2.client.Request> r13 = com.bytedance.retrofit2.client.Request.class
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r5 == 0) goto L_0x01d6
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r3] = r0
            r7[r4] = r6
            r8 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.g.f52993a
            r10 = 1
            r11 = 55036(0xd6fc, float:7.7122E-41)
            java.lang.Class[] r12 = new java.lang.Class[r2]
            java.lang.Class<com.bytedance.retrofit2.client.Request> r0 = com.bytedance.retrofit2.client.Request.class
            r12[r3] = r0
            java.lang.Class<com.ss.android.ugc.aweme.lancet.ssretrofitchain.c$a> r0 = com.ss.android.ugc.aweme.lancet.ssretrofitchain.c.a.class
            r12[r4] = r0
            java.lang.Class<com.bytedance.retrofit2.client.Request> r13 = com.bytedance.retrofit2.client.Request.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)
            com.bytedance.retrofit2.client.Request r0 = (com.bytedance.retrofit2.client.Request) r0
            goto L_0x0234
        L_0x01d6:
            java.lang.String r2 = r0.getUrl()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.f52974c
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x01ec:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0220
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01ec
            java.lang.Object r5 = r4.getValue()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01ec
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r2.appendQueryParameter(r5, r4)
            goto L_0x01ec
        L_0x0220:
            com.bytedance.retrofit2.client.Request$Builder r0 = r0.newBuilder()
            android.net.Uri r2 = r2.build()
            java.lang.String r2 = r2.toString()
            com.bytedance.retrofit2.client.Request$Builder r0 = r0.url(r2)
            com.bytedance.retrofit2.client.Request r0 = r0.build()
        L_0x0234:
            r15.originalRequest = r0
            r1.b()
            com.bytedance.retrofit2.SsResponse r15 = r15.getResponseWithInterceptorChain$___twin___()
            return r15
        L_0x023e:
            if (r1 != 0) goto L_0x0241
            return r5
        L_0x0241:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.q.a(com.bytedance.retrofit2.SsHttpCall):com.bytedance.retrofit2.SsResponse");
    }
}
