package com.ss.android.ugc.aweme.an;

import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33306a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f33307b = "a";

    private static String a(int i, ResponseBody responseBody, Response response) throws IOException {
        String str;
        Response response2 = response;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), responseBody, response2}, null, f33306a, true, 86725, new Class[]{Integer.TYPE, ResponseBody.class, Response.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), responseBody, response2}, null, f33306a, true, 86725, new Class[]{Integer.TYPE, ResponseBody.class, Response.class}, String.class);
        } else if (responseBody == null || response2 == null) {
            throw new IllegalArgumentException("HTTP body may not be null");
        } else {
            InputStream byteStream = responseBody.byteStream();
            String header = response2.header("Content-Encoding");
            if (header == null || !"gzip".equalsIgnoreCase(header)) {
                Logger.debug();
            } else {
                z = true;
            }
            try {
                MediaType contentType = responseBody.contentType();
                if (contentType != null) {
                    str = contentType.toString();
                } else {
                    str = response2.header("Content-Type");
                }
                if (str == null) {
                    str = "";
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
                String str2 = null;
                if (responseBody.contentLength() > 2147483647L) {
                    return null;
                }
                if (contentType != null) {
                    if (contentType.charset() != null) {
                        str2 = contentType.charset().name();
                    }
                }
                if (str2 == null) {
                    str2 = "UTF-8";
                }
                String response2String = NetworkUtils.response2String(z, testIsSSBinary, i, byteStream, str2);
                NetworkUtils.safeClose(byteStream);
                return response2String;
            } finally {
                NetworkUtils.safeClose(byteStream);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c2, code lost:
        r8 = r0;
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c6, code lost:
        r8 = r0;
        r5 = null;
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ca, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        com.ss.android.common.util.NetworkUtils.safeClose(r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ca A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e6 A[SYNTHETIC, Splitter:B:67:0x01e6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(int r27, int r28, java.lang.String r29, okhttp3.Request.Builder r30, okhttp3.RequestBody r31, com.ss.android.common.http.d[] r32) throws java.lang.Exception {
        /*
            r0 = r27
            r4 = r29
            r3 = 6
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r27)
            r12 = 0
            r5[r12] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r28)
            r13 = 1
            r5[r13] = r6
            r14 = 2
            r5[r14] = r4
            r15 = 3
            r5[r15] = r30
            r16 = 4
            r5[r16] = r31
            r17 = 5
            r11 = 0
            r5[r17] = r11
            com.meituan.robust.ChangeQuickRedirect r7 = f33306a
            java.lang.Class[] r10 = new java.lang.Class[r3]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r12] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r13] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r14] = r6
            java.lang.Class<okhttp3.Request$Builder> r6 = okhttp3.Request.Builder.class
            r10[r15] = r6
            java.lang.Class<okhttp3.RequestBody> r6 = okhttp3.RequestBody.class
            r10[r16] = r6
            java.lang.Class<com.ss.android.common.http.d[]> r6 = com.ss.android.common.http.d[].class
            r10[r17] = r6
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r6 = 0
            r8 = 1
            r9 = 86724(0x152c4, float:1.21526E-40)
            r11 = r18
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0096
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            r5[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)
            r5[r13] = r0
            r5[r14] = r4
            r5[r15] = r30
            r5[r16] = r31
            r6 = 0
            r5[r17] = r6
            r21 = 0
            com.meituan.robust.ChangeQuickRedirect r22 = f33306a
            r23 = 1
            r24 = 86724(0x152c4, float:1.21526E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r14] = r1
            java.lang.Class<okhttp3.Request$Builder> r1 = okhttp3.Request.Builder.class
            r0[r15] = r1
            java.lang.Class<okhttp3.RequestBody> r1 = okhttp3.RequestBody.class
            r0[r16] = r1
            java.lang.Class<com.ss.android.common.http.d[]> r1 = com.ss.android.common.http.d[].class
            r0[r17] = r1
            java.lang.Class<java.lang.String> r26 = java.lang.String.class
            r20 = r5
            r25 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0096:
            r6 = 0
            com.ss.android.ugc.aweme.net.y r3 = com.ss.android.ugc.aweme.net.y.a()
            okhttp3.OkHttpClient r3 = r3.b()
            long r7 = java.lang.System.currentTimeMillis()
            r30.post(r31)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            okhttp3.Request r1 = r30.build()     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r27)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            r15[r12] = r2     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            r15[r13] = r1     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = f33306a     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            r18 = 1
            r19 = 86723(0x152c3, float:1.21525E-40)
            java.lang.Class[] r2 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            r2[r12] = r5     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            java.lang.Class<okhttp3.Request> r5 = okhttp3.Request.class
            r2[r13] = r5     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            java.lang.Class<okhttp3.Request> r21 = okhttp3.Request.class
            r20 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            if (r2 == 0) goto L_0x00f9
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            r15[r12] = r0     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            r15[r13] = r1     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = f33306a     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            r18 = 1
            r19 = 86723(0x152c3, float:1.21525E-40)
            java.lang.Class[] r0 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            r0[r12] = r1     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            java.lang.Class<okhttp3.Request> r1 = okhttp3.Request.class
            r0[r13] = r1     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            java.lang.Class<okhttp3.Request> r21 = okhttp3.Request.class
            r20 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            okhttp3.Request r0 = (okhttp3.Request) r0     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            goto L_0x011d
        L_0x00f9:
            if (r0 < 0) goto L_0x011c
            okhttp3.CacheControl$Builder r2 = new okhttp3.CacheControl$Builder     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            r2.<init>()     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            okhttp3.CacheControl$Builder r0 = r2.maxStale(r0, r5)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            okhttp3.CacheControl r0 = r0.build()     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            okhttp3.Request$Builder r1 = r1.newBuilder()     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            okhttp3.Request$Builder r0 = r1.cacheControl(r0)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            java.lang.String r1 = "Pragma"
            okhttp3.Request$Builder r0 = r0.removeHeader(r1)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            okhttp3.Request r1 = r0.build()     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
        L_0x011c:
            r0 = r1
        L_0x011d:
            okhttp3.Call r1 = r3.newCall(r0)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            okhttp3.Response r1 = r1.execute()     // Catch:{ Exception -> 0x01c5, all -> 0x01ca }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01c5, all -> 0x01ca }
            r5 = 0
            long r9 = r7 - r2
            java.lang.String r5 = "X-TT-LOGID"
            java.lang.String r5 = r1.header(r5)     // Catch:{ Exception -> 0x01c5, all -> 0x01ca }
            com.ss.android.common.util.NetworkUtils$d r7 = com.ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            if (r7 == 0) goto L_0x0176
            com.ss.android.common.util.NetworkUtils$d r7 = com.ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            java.lang.String r7 = r7.a()     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            boolean r8 = com.bytedance.common.utility.StringUtils.isEmpty(r7)     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            if (r8 != 0) goto L_0x0176
            java.util.List r7 = r1.headers(r7)     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            if (r7 == 0) goto L_0x0176
            int r8 = r7.size()     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            if (r8 <= 0) goto L_0x0176
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            r8.<init>()     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
        L_0x015f:
            boolean r11 = r7.hasNext()     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            if (r11 == 0) goto L_0x016f
            java.lang.Object r11 = r7.next()     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            r8.add(r11)     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            goto L_0x015f
        L_0x016f:
            com.ss.android.common.util.NetworkUtils$d r7 = com.ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            r7.a(r8)     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
        L_0x0176:
            int r7 = r1.code()     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 != r8) goto L_0x01b5
            okhttp3.ResponseBody r7 = r1.body()     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            if (r7 == 0) goto L_0x01af
            r8 = r28
            java.lang.String r1 = a(r8, r7, r1)     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            com.ss.android.common.util.NetworkUtils.handleTimeStampFromResponse(r1)     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            com.ss.android.common.util.NetworkUtils.handleApiOk(r4, r9, r6)     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            java.net.URL r0 = r0.url()     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            java.lang.String r13 = r0.toString()     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            r15 = 0
            r11 = r2
            r14 = r5
            com.ss.android.common.util.NetworkUtils.monitorApiSample(r9, r11, r13, r14, r15)     // Catch:{ Exception -> 0x01ab, all -> 0x01a8 }
            if (r7 == 0) goto L_0x01a7
            com.ss.android.common.util.NetworkUtils.safeClose(r7)     // Catch:{ Throwable -> 0x01a7 }
        L_0x01a7:
            return r1
        L_0x01a8:
            r0 = move-exception
            r6 = r7
            goto L_0x01e4
        L_0x01ab:
            r0 = move-exception
            r8 = r0
            r11 = r7
            goto L_0x01d1
        L_0x01af:
            if (r7 == 0) goto L_0x01b4
            com.ss.android.common.util.NetworkUtils.safeClose(r7)     // Catch:{ Throwable -> 0x01b4 }
        L_0x01b4:
            return r6
        L_0x01b5:
            java.lang.String r0 = "Reason-Phrase"
            java.lang.String r0 = r1.header(r0)     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            com.ss.android.http.a.a.b r1 = new com.ss.android.http.a.a.b     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            r1.<init>(r7, r0)     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
            throw r1     // Catch:{ Exception -> 0x01c1, all -> 0x01ca }
        L_0x01c1:
            r0 = move-exception
            r8 = r0
            r11 = r6
            goto L_0x01d1
        L_0x01c5:
            r0 = move-exception
            r8 = r0
            r5 = r6
            r11 = r5
            goto L_0x01d1
        L_0x01ca:
            r0 = move-exception
            goto L_0x01e4
        L_0x01cc:
            r0 = move-exception
            r5 = r6
            r11 = r5
            r2 = r7
            r8 = r0
        L_0x01d1:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01e2 }
            r7 = 0
            long r0 = r0 - r2
            com.ss.android.common.util.NetworkUtils.handleApiError(r4, r8, r0, r6)     // Catch:{ all -> 0x01e2 }
            r6 = 0
            r4 = r29
            r7 = r8
            com.ss.android.common.util.NetworkUtils.monitorApiError(r0, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x01e2 }
            throw r8     // Catch:{ all -> 0x01e2 }
        L_0x01e2:
            r0 = move-exception
            r6 = r11
        L_0x01e4:
            if (r6 == 0) goto L_0x01e9
            com.ss.android.common.util.NetworkUtils.safeClose(r6)     // Catch:{ Throwable -> 0x01e9 }
        L_0x01e9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.an.a.a(int, int, java.lang.String, okhttp3.Request$Builder, okhttp3.RequestBody, com.ss.android.common.http.d[]):java.lang.String");
    }
}
