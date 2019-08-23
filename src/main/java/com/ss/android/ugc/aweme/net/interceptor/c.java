package com.ss.android.ugc.aweme.net.interceptor;

import com.meituan.robust.ChangeQuickRedirect;
import okhttp3.Interceptor;

public final class c implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56967a;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r18) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f56967a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<okhttp3.Interceptor$Chain> r3 = okhttp3.Interceptor.Chain.class
            r7[r9] = r3
            java.lang.Class<okhttp3.Response> r8 = okhttp3.Response.class
            r5 = 0
            r6 = 60916(0xedf4, float:8.5361E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f56967a
            r13 = 0
            r14 = 60916(0xedf4, float:8.5361E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<okhttp3.Interceptor$Chain> r0 = okhttp3.Interceptor.Chain.class
            r15[r9] = r0
            java.lang.Class<okhttp3.Response> r16 = okhttp3.Response.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            okhttp3.Response r0 = (okhttp3.Response) r0
            return r0
        L_0x0039:
            okhttp3.Request r1 = r18.request()
            okhttp3.HttpUrl r2 = r1.url()
            java.lang.String r2 = r2.toString()
            long r11 = java.lang.System.currentTimeMillis()
            r13 = 0
            r15 = 0
            okhttp3.Response r1 = r0.proceed(r1)     // Catch:{ Exception -> 0x0088 }
            if (r1 == 0) goto L_0x007a
            int r0 = r1.code()     // Catch:{ Exception -> 0x0076 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 != r3) goto L_0x007a
            java.lang.String r0 = "X-TT-LOGID"
            java.lang.String r10 = r1.header(r0)     // Catch:{ Exception -> 0x0076 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0073 }
            r0 = 0
            long r13 = r3 - r11
            com.ss.android.common.util.NetworkUtils.handleApiOk(r2, r13, r15)     // Catch:{ Exception -> 0x0073 }
            r9 = 0
            r3 = r13
            r5 = r11
            r7 = r2
            r8 = r10
            com.ss.android.common.util.NetworkUtils.monitorApiSample(r3, r5, r7, r8, r9)     // Catch:{ Exception -> 0x0073 }
            goto L_0x0087
        L_0x0073:
            r0 = move-exception
            r3 = r13
            goto L_0x008c
        L_0x0076:
            r0 = move-exception
            r3 = r13
            r10 = r15
            goto L_0x008c
        L_0x007a:
            com.ss.android.common.util.NetworkUtils.handleApiError(r2, r15, r13, r15)     // Catch:{ Exception -> 0x0076 }
            r3 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r11
            r7 = r2
            com.ss.android.common.util.NetworkUtils.monitorApiError(r3, r5, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0076 }
        L_0x0087:
            return r1
        L_0x0088:
            r0 = move-exception
            r3 = r13
            r1 = r15
            r10 = r1
        L_0x008c:
            boolean r5 = r0 instanceof com.ss.android.ugc.aweme.base.api.a.b.a
            if (r5 != 0) goto L_0x00a6
            if (r1 == 0) goto L_0x009a
            java.lang.String r5 = "X-TT-LOGID"
            java.lang.String r1 = r1.header(r5)
            r8 = r1
            goto L_0x009b
        L_0x009a:
            r8 = r10
        L_0x009b:
            com.ss.android.common.util.NetworkUtils.handleApiError(r2, r15, r3, r15)
            r9 = 0
            r10 = 0
            r5 = r11
            r7 = r2
            com.ss.android.common.util.NetworkUtils.monitorApiError(r3, r5, r7, r8, r9, r10)
            throw r0
        L_0x00a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.interceptor.c.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
