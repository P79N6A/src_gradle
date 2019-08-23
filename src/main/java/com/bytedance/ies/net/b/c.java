package com.bytedance.ies.net.b;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.common.http.a.a;
import com.ss.android.common.http.b;
import com.ss.android.common.http.d;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.http.a.b.e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f20849a = " okhttp/3.5.0";

    /* renamed from: b  reason: collision with root package name */
    private a f20850b;

    public static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        Call f20857a;

        public final void a() {
            if (this.f20857a != null) {
                this.f20857a.cancel();
            }
        }

        public a(Call call) {
            this.f20857a = call;
        }
    }

    private static String a() {
        return "1.1.1.1";
    }

    public final byte[] a(int i, String str) throws Exception {
        ResponseBody responseBody;
        ResponseBody responseBody2 = null;
        try {
            Response execute = this.f20850b.b().newCall(new Request.Builder().url(str).build()).execute();
            if (execute.code() == 200) {
                responseBody = execute.body();
                if (responseBody != null) {
                    try {
                        InputStream byteStream = responseBody.byteStream();
                        String header = execute.header("Content-Length");
                        long j = -1;
                        if (header != null) {
                            j = Long.parseLong(header);
                        }
                        byte[] stream2ByteArray = NetworkUtils.stream2ByteArray(i, byteStream, j);
                        NetworkUtils.safeClose(responseBody);
                        return stream2ByteArray;
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        th = th;
                        responseBody2 = responseBody;
                        NetworkUtils.safeClose(responseBody2);
                        throw th;
                    }
                }
                NetworkUtils.safeClose(responseBody);
                return null;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
            NetworkUtils.safeClose(responseBody2);
            throw th;
        }
        responseBody = null;
        NetworkUtils.safeClose(responseBody);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0104 A[SYNTHETIC, Splitter:B:64:0x0104] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.ss.android.common.util.c<java.lang.String> r22, java.lang.String r23, com.ss.android.common.util.h r24, java.util.List<com.ss.android.http.a.b.e> r25, java.lang.String[] r26, int[] r27) throws java.lang.Exception {
        /*
            r16 = this;
            r1 = r16
            r0 = r24
            r13 = r26
            r2 = r27
            com.bytedance.ies.net.b.a r3 = r1.f20850b
            okhttp3.OkHttpClient r3 = r3.b()
            r4 = 0
            okhttp3.Request$Builder r5 = new okhttp3.Request$Builder     // Catch:{ all -> 0x00fd }
            r5.<init>()     // Catch:{ all -> 0x00fd }
            r6 = r18
            okhttp3.Request$Builder r5 = r5.url((java.lang.String) r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = com.ss.android.common.util.NetworkUtils.getUserAgent()     // Catch:{ all -> 0x00fd }
            boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ all -> 0x00fd }
            if (r7 != 0) goto L_0x003a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r7.<init>()     // Catch:{ all -> 0x00fd }
            r7.append(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = " okhttp/3.5.0"
            r7.append(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00fd }
            java.lang.String r7 = "User-Agent"
            r5.header(r7, r6)     // Catch:{ all -> 0x00fd }
        L_0x003a:
            if (r25 == 0) goto L_0x0058
            java.util.Iterator r6 = r25.iterator()     // Catch:{ all -> 0x00fd }
        L_0x0040:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00fd }
            if (r7 == 0) goto L_0x0058
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x00fd }
            com.ss.android.http.a.b.e r7 = (com.ss.android.http.a.b.e) r7     // Catch:{ all -> 0x00fd }
            java.lang.String r8 = r7.a()     // Catch:{ all -> 0x00fd }
            java.lang.String r7 = r7.b()     // Catch:{ all -> 0x00fd }
            r5.addHeader(r8, r7)     // Catch:{ all -> 0x00fd }
            goto L_0x0040
        L_0x0058:
            okhttp3.Request r5 = r5.build()     // Catch:{ all -> 0x00fd }
            okhttp3.Call r3 = r3.newCall(r5)     // Catch:{ all -> 0x00fd }
            okhttp3.Response r6 = r3.execute()     // Catch:{ all -> 0x00fd }
            java.lang.String r7 = "x-snssdk.remoteaddr"
            java.lang.String r14 = r6.header(r7)     // Catch:{ all -> 0x00fd }
            r7 = 0
            if (r0 == 0) goto L_0x007a
            boolean r8 = r0.f28335a     // Catch:{ all -> 0x0075 }
            if (r8 == 0) goto L_0x007a
            a((java.lang.String[]) r13, (java.lang.String) r14)
            return r7
        L_0x0075:
            r0 = move-exception
            r15 = r4
        L_0x0077:
            r4 = r14
            goto L_0x00ff
        L_0x007a:
            int r8 = r6.code()     // Catch:{ all -> 0x0075 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x00f1
            okhttp3.ResponseBody r15 = r6.body()     // Catch:{ all -> 0x0075 }
            if (r15 == 0) goto L_0x00e8
            java.lang.String r4 = "Content-Length"
            java.lang.String r4 = r6.header(r4)     // Catch:{ all -> 0x00e6 }
            r8 = -1
            if (r4 == 0) goto L_0x0096
            long r8 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x00e6 }
        L_0x0096:
            if (r2 == 0) goto L_0x00a7
            int r4 = r2.length     // Catch:{ all -> 0x00e6 }
            if (r4 <= 0) goto L_0x00a7
            r2[r7] = r7     // Catch:{ all -> 0x00e6 }
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x00a7
            int r4 = (int) r8     // Catch:{ all -> 0x00e6 }
            r2[r7] = r4     // Catch:{ all -> 0x00e6 }
        L_0x00a7:
            java.io.InputStream r2 = r15.byteStream()     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r4 = r6.header(r4)     // Catch:{ all -> 0x00e6 }
            if (r4 == 0) goto L_0x00c4
            java.lang.String r6 = "gzip"
            boolean r4 = r6.equalsIgnoreCase(r4)     // Catch:{ all -> 0x00e6 }
            if (r4 == 0) goto L_0x00c4
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00e6 }
            r4.<init>(r2)     // Catch:{ all -> 0x00e6 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x00e6 }
            r2 = r4
        L_0x00c4:
            com.bytedance.ies.net.b.c$1 r6 = new com.bytedance.ies.net.b.c$1     // Catch:{ all -> 0x00e6 }
            r6.<init>(r5, r3)     // Catch:{ all -> 0x00e6 }
            r3 = r8
            r5 = r6
            r6 = r17
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            boolean r0 = com.ss.android.common.util.NetworkUtils.stream2File(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00e6 }
            a((java.lang.String[]) r13, (java.lang.String) r14)
            if (r15 == 0) goto L_0x00e5
            com.ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x00e5 }
        L_0x00e5:
            return r0
        L_0x00e6:
            r0 = move-exception
            goto L_0x0077
        L_0x00e8:
            a((java.lang.String[]) r13, (java.lang.String) r14)
            if (r15 == 0) goto L_0x00f0
            com.ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x00f0 }
        L_0x00f0:
            return r7
        L_0x00f1:
            java.lang.String r0 = "Reason-Phrase"
            java.lang.String r0 = r6.header(r0)     // Catch:{ all -> 0x0075 }
            com.ss.android.http.a.a.b r2 = new com.ss.android.http.a.a.b     // Catch:{ all -> 0x0075 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x0075 }
            throw r2     // Catch:{ all -> 0x0075 }
        L_0x00fd:
            r0 = move-exception
            r15 = r4
        L_0x00ff:
            a((java.lang.String[]) r13, (java.lang.String) r4)
            if (r15 == 0) goto L_0x0107
            com.ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x0107 }
        L_0x0107:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.net.b.c.a(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.common.util.c, java.lang.String, com.ss.android.common.util.h, java.util.List, java.lang.String[], int[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x010b A[SYNTHETIC, Splitter:B:63:0x010b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r17, java.lang.String r18, java.lang.StringBuffer r19, java.lang.StringBuffer r20, java.lang.StringBuffer r21, com.ss.android.common.util.c<java.lang.String> r22, java.lang.String r23, com.ss.android.common.util.h r24, java.util.List<com.ss.android.http.a.b.e> r25, java.lang.String[] r26, int[] r27, org.apache.http.client.RedirectHandler r28) throws java.lang.Exception {
        /*
            r16 = this;
            r1 = r16
            r0 = r24
            r13 = r26
            r2 = r27
            com.bytedance.ies.net.b.a r3 = r1.f20850b
            okhttp3.OkHttpClient r3 = r3.b()
            r4 = 0
            okhttp3.Request$Builder r5 = new okhttp3.Request$Builder     // Catch:{ all -> 0x0104 }
            r5.<init>()     // Catch:{ all -> 0x0104 }
            r6 = r18
            okhttp3.Request$Builder r5 = r5.url((java.lang.String) r6)     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = com.ss.android.common.util.NetworkUtils.getUserAgent()     // Catch:{ all -> 0x0104 }
            boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ all -> 0x0104 }
            if (r7 != 0) goto L_0x003a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0104 }
            r7.<init>()     // Catch:{ all -> 0x0104 }
            r7.append(r6)     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = " okhttp/3.5.0"
            r7.append(r6)     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0104 }
            java.lang.String r7 = "User-Agent"
            r5.header(r7, r6)     // Catch:{ all -> 0x0104 }
        L_0x003a:
            if (r25 == 0) goto L_0x0058
            java.util.Iterator r6 = r25.iterator()     // Catch:{ all -> 0x0104 }
        L_0x0040:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0104 }
            if (r7 == 0) goto L_0x0058
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0104 }
            com.ss.android.http.a.b.e r7 = (com.ss.android.http.a.b.e) r7     // Catch:{ all -> 0x0104 }
            java.lang.String r8 = r7.a()     // Catch:{ all -> 0x0104 }
            java.lang.String r7 = r7.b()     // Catch:{ all -> 0x0104 }
            r5.addHeader(r8, r7)     // Catch:{ all -> 0x0104 }
            goto L_0x0040
        L_0x0058:
            okhttp3.Request r5 = r5.build()     // Catch:{ all -> 0x0104 }
            okhttp3.Call r3 = r3.newCall(r5)     // Catch:{ all -> 0x0104 }
            okhttp3.Response r6 = r3.execute()     // Catch:{ all -> 0x0104 }
            java.lang.String r7 = "x-snssdk.remoteaddr"
            java.lang.String r14 = r6.header(r7)     // Catch:{ all -> 0x0104 }
            r7 = 0
            if (r0 == 0) goto L_0x0078
            boolean r8 = r0.f28335a     // Catch:{ all -> 0x0075 }
            if (r8 == 0) goto L_0x0078
            a((java.lang.String[]) r13, (java.lang.String) r14)
            return r7
        L_0x0075:
            r0 = move-exception
            goto L_0x0106
        L_0x0078:
            int r8 = r6.code()     // Catch:{ all -> 0x0075 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x00f8
            okhttp3.ResponseBody r15 = r6.body()     // Catch:{ all -> 0x0075 }
            if (r15 == 0) goto L_0x00ef
            java.lang.String r4 = "Content-Length"
            java.lang.String r4 = r6.header(r4)     // Catch:{ all -> 0x00ec }
            r8 = -1
            if (r4 == 0) goto L_0x0094
            long r8 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x00ec }
        L_0x0094:
            if (r2 == 0) goto L_0x00a5
            int r4 = r2.length     // Catch:{ all -> 0x00ec }
            if (r4 <= 0) goto L_0x00a5
            r2[r7] = r7     // Catch:{ all -> 0x00ec }
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x00a5
            int r4 = (int) r8     // Catch:{ all -> 0x00ec }
            r2[r7] = r4     // Catch:{ all -> 0x00ec }
        L_0x00a5:
            java.io.InputStream r2 = r15.byteStream()     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r4 = r6.header(r4)     // Catch:{ all -> 0x00ec }
            if (r4 == 0) goto L_0x00c2
            java.lang.String r6 = "gzip"
            boolean r4 = r6.equalsIgnoreCase(r4)     // Catch:{ all -> 0x00ec }
            if (r4 == 0) goto L_0x00c2
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00ec }
            r4.<init>(r2)     // Catch:{ all -> 0x00ec }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x00ec }
            r2 = r4
        L_0x00c2:
            com.bytedance.ies.net.b.c$2 r6 = new com.bytedance.ies.net.b.c$2     // Catch:{ all -> 0x00ec }
            r6.<init>(r5, r3)     // Catch:{ all -> 0x00ec }
            java.lang.String r7 = r19.toString()     // Catch:{ all -> 0x00ec }
            java.lang.String r10 = r20.toString()     // Catch:{ all -> 0x00ec }
            java.lang.String r11 = r21.toString()     // Catch:{ all -> 0x00ec }
            r3 = r8
            r5 = r6
            r6 = r17
            r8 = r10
            r9 = r11
            r10 = r22
            r11 = r23
            r12 = r24
            boolean r0 = com.ss.android.common.util.NetworkUtils.stream2File(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00ec }
            a((java.lang.String[]) r13, (java.lang.String) r14)
            if (r15 == 0) goto L_0x00eb
            com.ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x00eb }
        L_0x00eb:
            return r0
        L_0x00ec:
            r0 = move-exception
            r4 = r15
            goto L_0x0106
        L_0x00ef:
            a((java.lang.String[]) r13, (java.lang.String) r14)
            if (r15 == 0) goto L_0x00f7
            com.ss.android.common.util.NetworkUtils.safeClose(r15)     // Catch:{ Throwable -> 0x00f7 }
        L_0x00f7:
            return r7
        L_0x00f8:
            java.lang.String r0 = "Reason-Phrase"
            java.lang.String r0 = r6.header(r0)     // Catch:{ all -> 0x0075 }
            com.ss.android.http.a.a.b r2 = new com.ss.android.http.a.a.b     // Catch:{ all -> 0x0075 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x0075 }
            throw r2     // Catch:{ all -> 0x0075 }
        L_0x0104:
            r0 = move-exception
            r14 = r4
        L_0x0106:
            a((java.lang.String[]) r13, (java.lang.String) r14)
            if (r4 == 0) goto L_0x010e
            com.ss.android.common.util.NetworkUtils.safeClose(r4)     // Catch:{ Throwable -> 0x010e }
        L_0x010e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.net.b.c.a(int, java.lang.String, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, com.ss.android.common.util.c, java.lang.String, com.ss.android.common.util.h, java.util.List, java.lang.String[], int[], org.apache.http.client.RedirectHandler):boolean");
    }

    public final String a(int i, String str, com.ss.android.common.http.a.a aVar, com.ss.android.common.util.d<Long> dVar, long j, d[] dVarArr) throws Exception {
        Request.Builder url = new Request.Builder().url(str);
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (a.c next : aVar.f28293b) {
            if (next instanceof a.d) {
                type.addFormDataPart(next.a(), (String) next.b());
            } else if (next instanceof a.C0332a) {
                a.C0332a aVar2 = (a.C0332a) next;
                type.addFormDataPart(aVar2.a(), aVar2.f28296c, RequestBody.create((MediaType) null, (byte[]) aVar2.b()));
            } else if (next instanceof a.b) {
                File file = (File) next.b();
                type.addFormDataPart(next.a(), file.getName(), RequestBody.create((MediaType) null, file));
            }
        }
        return a(0, i, str, url, (RequestBody) type.build(), dVarArr);
    }

    public final String a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list) throws Exception {
        RequestBody create;
        Request.Builder url = new Request.Builder().url(str);
        if (str2 != null) {
            url.header("Content-Encoding", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            url.header("Content-Type", str3);
        }
        url.addHeader("Accept-Encoding", "gzip");
        if (list != null) {
            for (com.ss.android.http.a.a next : list) {
                url.addHeader(next.a(), next.b());
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            create = RequestBody.create(MediaType.parse(str3), bArr);
        } else {
            create = RequestBody.create((MediaType) null, bArr);
        }
        return a(i, i2, str, url, create, (d[]) null);
    }

    public c(a aVar) {
        this.f20850b = aVar;
    }

    private static void a(String[] strArr, String str) {
        if (strArr != null && strArr.length != 0 && !StringUtils.isEmpty(str)) {
            try {
                strArr[0] = str;
            } catch (Throwable unused) {
            }
        }
    }

    private static Request a(int i, Request request) throws Exception {
        if (i < 0) {
            return request;
        }
        return request.newBuilder().cacheControl(new CacheControl.Builder().maxStale(i, TimeUnit.SECONDS).build()).removeHeader("Pragma").build();
    }

    private static String a(int i, ResponseBody responseBody, Response response) throws IOException {
        String str;
        if (responseBody == null || response == null) {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
        InputStream byteStream = responseBody.byteStream();
        boolean z = false;
        String header = response.header("Content-Encoding");
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
                str = response.header("Content-Type");
            }
            if (str == null) {
                str = "";
            }
            boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
            long contentLength = responseBody.contentLength();
            String str2 = null;
            if (contentLength > 2147483647L) {
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

    public final String a(int i, int i2, String str, byte[] bArr, String str2, String str3) throws Exception {
        return a(i, i2, str, bArr, str2, str3, (List<com.ss.android.http.a.a>) null);
    }

    public final String a(int i, int i2, String str, List<e> list, com.ss.android.common.http.a.a aVar, d[] dVarArr) throws Exception {
        Request.Builder url = new Request.Builder().url(str);
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (e next : list) {
            type.addFormDataPart(next.a(), next.b());
        }
        for (a.c next2 : aVar.f28293b) {
            if (next2 instanceof a.d) {
                type.addFormDataPart(next2.a(), (String) next2.b());
            } else if (next2 instanceof a.C0332a) {
                a.C0332a aVar2 = (a.C0332a) next2;
                type.addFormDataPart(aVar2.a(), aVar2.f28296c, RequestBody.create((MediaType) null, (byte[]) aVar2.b()));
            } else if (next2 instanceof a.b) {
                File file = (File) next2.b();
                type.addFormDataPart(next2.a(), file.getName(), RequestBody.create((MediaType) null, file));
            }
        }
        url.addHeader("Accept-Encoding", "gzip");
        return a(i, i2, str, url, (RequestBody) new d(type.build()), dVarArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00df, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        r6 = r1;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.ss.android.common.util.NetworkUtils.safeClose(r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0103 A[SYNTHETIC, Splitter:B:62:0x0103] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(int r20, int r21, java.lang.String r22, okhttp3.Request.Builder r23, okhttp3.RequestBody r24, com.ss.android.common.http.d[] r25) throws java.lang.Exception {
        /*
            r19 = this;
            r5 = r22
            r9 = r19
            r0 = r25
            com.bytedance.ies.net.b.a r1 = r9.f20850b
            okhttp3.OkHttpClient r1 = r1.a()
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.common.util.NetworkUtils$f r7 = new com.ss.android.common.util.NetworkUtils$f
            r7.<init>()
            java.lang.String r4 = a()
            r7.f28330a = r4
            r4 = 0
            r23.post(r24)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            okhttp3.Request r6 = r23.build()     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            r8 = r20
            okhttp3.Request r6 = a((int) r8, (okhttp3.Request) r6)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            okhttp3.Call r1 = r1.newCall(r6)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            if (r0 == 0) goto L_0x003d
            int r8 = r0.length     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            if (r8 <= 0) goto L_0x003d
            r6.tag()     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            r8 = 0
            com.bytedance.ies.net.b.c$a r10 = new com.bytedance.ies.net.b.c$a     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            r10.<init>(r1)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            r0[r8] = r10     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
        L_0x003d:
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            okhttp3.Response r0 = r1.execute()     // Catch:{ Exception -> 0x00e3, all -> 0x00e5 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e3, all -> 0x00e5 }
            r3 = 0
            long r10 = r1 - r17
            java.lang.String r1 = "X-TT-LOGID"
            java.lang.String r1 = r0.header(r1)     // Catch:{ Exception -> 0x00e3, all -> 0x00e5 }
            com.ss.android.common.util.NetworkUtils$d r2 = com.ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            if (r2 == 0) goto L_0x0092
            com.ss.android.common.util.NetworkUtils$d r2 = com.ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            java.lang.String r2 = r2.a()     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            if (r3 != 0) goto L_0x0092
            java.util.List r2 = r0.headers(r2)     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            if (r2 == 0) goto L_0x0092
            int r3 = r2.size()     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            if (r3 <= 0) goto L_0x0092
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            r3.<init>()     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
        L_0x007b:
            boolean r8 = r2.hasNext()     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            if (r8 == 0) goto L_0x008b
            java.lang.Object r8 = r2.next()     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            r3.add(r8)     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            goto L_0x007b
        L_0x008b:
            com.ss.android.common.util.NetworkUtils$d r2 = com.ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            r2.a(r3)     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
        L_0x0092:
            int r2 = r0.code()     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x00d3
            okhttp3.ResponseBody r2 = r0.body()     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            if (r2 == 0) goto L_0x00cd
            r3 = r21
            java.lang.String r0 = a(r3, r2, r0)     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
            com.ss.android.common.util.NetworkUtils.handleTimeStampFromResponse(r0)     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
            com.ss.android.common.util.NetworkUtils.handleApiOk(r5, r10, r4)     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
            okhttp3.HttpUrl r3 = r6.url()     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
            java.net.URL r3 = r3.url()     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
            java.lang.String r14 = r3.toString()     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
            r12 = r17
            r15 = r1
            r16 = r7
            com.ss.android.common.util.NetworkUtils.monitorApiSample(r10, r12, r14, r15, r16)     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
            if (r2 == 0) goto L_0x00c5
            com.ss.android.common.util.NetworkUtils.safeClose(r2)     // Catch:{ Throwable -> 0x00c5 }
        L_0x00c5:
            return r0
        L_0x00c6:
            r0 = move-exception
            r4 = r2
            goto L_0x0101
        L_0x00c9:
            r0 = move-exception
            r6 = r1
            r10 = r2
            goto L_0x00ec
        L_0x00cd:
            if (r2 == 0) goto L_0x00d2
            com.ss.android.common.util.NetworkUtils.safeClose(r2)     // Catch:{ Throwable -> 0x00d2 }
        L_0x00d2:
            return r4
        L_0x00d3:
            java.lang.String r3 = "Reason-Phrase"
            java.lang.String r0 = r0.header(r3)     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            com.ss.android.http.a.a.b r3 = new com.ss.android.http.a.a.b     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            r3.<init>(r2, r0)     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
            throw r3     // Catch:{ Exception -> 0x00df, all -> 0x00e5 }
        L_0x00df:
            r0 = move-exception
            r6 = r1
            r10 = r4
            goto L_0x00ec
        L_0x00e3:
            r0 = move-exception
            goto L_0x00ea
        L_0x00e5:
            r0 = move-exception
            goto L_0x0101
        L_0x00e7:
            r0 = move-exception
            r17 = r2
        L_0x00ea:
            r6 = r4
            r10 = r6
        L_0x00ec:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ff }
            r3 = 0
            long r1 = r1 - r17
            com.ss.android.common.util.NetworkUtils.handleApiError(r5, r0, r1, r4)     // Catch:{ all -> 0x00ff }
            r3 = r17
            r5 = r22
            r8 = r0
            com.ss.android.common.util.NetworkUtils.monitorApiError(r1, r3, r5, r6, r7, r8)     // Catch:{ all -> 0x00ff }
            throw r0     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            r4 = r10
        L_0x0101:
            if (r4 == 0) goto L_0x0106
            com.ss.android.common.util.NetworkUtils.safeClose(r4)     // Catch:{ Throwable -> 0x0106 }
        L_0x0106:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.net.b.c.a(int, int, java.lang.String, okhttp3.Request$Builder, okhttp3.RequestBody, com.ss.android.common.http.d[]):java.lang.String");
    }

    public final String a(int i, int i2, String str, List<e> list, boolean z, d[] dVarArr, List<com.ss.android.http.a.a> list2) throws Exception {
        Request.Builder url = new Request.Builder().url(str);
        FormBody.Builder builder = new FormBody.Builder();
        for (e next : list) {
            builder.add(next.a(), next.b());
        }
        url.addHeader("Accept-Encoding", "gzip");
        if (list2 != null) {
            for (com.ss.android.http.a.a next2 : list2) {
                url.addHeader(next2.a(), next2.b());
            }
        }
        return a(i, i2, str, url, (RequestBody) builder.build(), dVarArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0151, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0152, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0155, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0156, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        com.ss.android.common.util.NetworkUtils.safeClose(r16);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0151 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x001b] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016f A[SYNTHETIC, Splitter:B:83:0x016f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(int r19, int r20, java.lang.String r21, java.util.List<com.ss.android.http.a.a> r22, boolean r23, boolean r24, com.ss.android.http.a.b.f r25, boolean r26) throws java.lang.Exception {
        /*
            r18 = this;
            r5 = r21
            r0 = r25
            long r3 = java.lang.System.currentTimeMillis()
            r13 = r18
            com.bytedance.ies.net.b.a r1 = r13.f20850b
            okhttp3.OkHttpClient r1 = r1.a()
            com.ss.android.common.util.NetworkUtils$f r14 = new com.ss.android.common.util.NetworkUtils$f
            r14.<init>()
            java.lang.String r2 = a()
            r14.f28330a = r2
            okhttp3.Request$Builder r6 = new okhttp3.Request$Builder     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            r6.<init>()     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            okhttp3.Request$Builder r6 = r6.url((java.lang.String) r5)     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            java.lang.String r7 = "Accept-Encoding"
            java.lang.String r8 = "gzip"
            r6.addHeader(r7, r8)     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            if (r22 == 0) goto L_0x0051
            java.util.Iterator r7 = r22.iterator()     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
        L_0x0031:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            if (r8 == 0) goto L_0x0051
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            com.ss.android.http.a.a r8 = (com.ss.android.http.a.a) r8     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            java.lang.String r9 = r8.a()     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            java.lang.String r8 = r8.b()     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            if (r9 == 0) goto L_0x0031
            int r10 = r9.length()     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            if (r10 <= 0) goto L_0x0031
            r6.addHeader(r9, r8)     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            goto L_0x0031
        L_0x0051:
            okhttp3.Request r6 = r6.build()     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            r7 = r19
            okhttp3.Request r6 = a((int) r7, (okhttp3.Request) r6)     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            okhttp3.Call r1 = r1.newCall(r6)     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            okhttp3.Response r1 = r1.execute()     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            r9 = 0
            long r7 = r7 - r3
            java.lang.String r9 = "X-TT-LOGID"
            java.lang.String r15 = r1.header(r9)     // Catch:{ Exception -> 0x0155, all -> 0x0151 }
            com.ss.android.common.util.NetworkUtils$d r9 = com.ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            if (r9 == 0) goto L_0x00af
            com.ss.android.common.util.NetworkUtils$d r9 = com.ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            java.lang.String r9 = r9.a()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            boolean r10 = com.bytedance.common.utility.StringUtils.isEmpty(r9)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            if (r10 != 0) goto L_0x00af
            java.util.List r9 = r1.headers(r9)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            if (r9 == 0) goto L_0x00af
            int r10 = r9.size()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            if (r10 <= 0) goto L_0x00af
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            r10.<init>()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
        L_0x0098:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            if (r11 == 0) goto L_0x00a8
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            r10.add(r11)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            goto L_0x0098
        L_0x00a8:
            com.ss.android.common.util.NetworkUtils$d r9 = com.ss.android.common.util.NetworkUtils.getCommandListener()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            r9.a(r10)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
        L_0x00af:
            if (r0 == 0) goto L_0x00ff
            okhttp3.Headers r9 = r1.headers()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            r10 = 0
            int r11 = r9.size()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
        L_0x00ba:
            if (r10 >= r11) goto L_0x00ff
            java.lang.String r12 = r9.name(r10)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            java.lang.String r2 = "ETag"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            if (r2 != 0) goto L_0x00ec
            java.lang.String r2 = "Last-Modified"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            if (r2 != 0) goto L_0x00ec
            java.lang.String r2 = "Cache-Control"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            if (r2 != 0) goto L_0x00ec
            java.lang.String r2 = "X-SS-SIGN"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            if (r2 != 0) goto L_0x00ec
            java.lang.String r2 = "X-TT-LOGID"
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            if (r2 == 0) goto L_0x00e9
            goto L_0x00ec
        L_0x00e9:
            r17 = r9
            goto L_0x00fa
        L_0x00ec:
            java.lang.String r2 = r9.value(r10)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            r17 = r9
            com.ss.android.http.a.b.a r9 = new com.ss.android.http.a.b.a     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            r9.<init>(r12, r2)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            r0.a((com.ss.android.http.a.a) r9)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
        L_0x00fa:
            int r10 = r10 + 1
            r9 = r17
            goto L_0x00ba
        L_0x00ff:
            int r0 = r1.code()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x0142
            okhttp3.ResponseBody r2 = r1.body()     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            if (r2 == 0) goto L_0x013b
            r0 = r20
            java.lang.String r0 = a(r0, r2, r1)     // Catch:{ Exception -> 0x0137, all -> 0x0133 }
            com.ss.android.common.util.NetworkUtils.handleTimeStampFromResponse(r0)     // Catch:{ Exception -> 0x0137, all -> 0x0133 }
            r1 = 0
            com.ss.android.common.util.NetworkUtils.handleApiOk(r5, r7, r1)     // Catch:{ Exception -> 0x0137, all -> 0x0133 }
            okhttp3.HttpUrl r1 = r6.url()     // Catch:{ Exception -> 0x0137, all -> 0x0133 }
            java.net.URL r1 = r1.url()     // Catch:{ Exception -> 0x0137, all -> 0x0133 }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x0137, all -> 0x0133 }
            r6 = r7
            r8 = r3
            r11 = r15
            r12 = r14
            com.ss.android.common.util.NetworkUtils.monitorApiSample(r6, r8, r10, r11, r12)     // Catch:{ Exception -> 0x0137, all -> 0x0133 }
            if (r2 == 0) goto L_0x0132
            com.ss.android.common.util.NetworkUtils.safeClose(r2)     // Catch:{ Throwable -> 0x0132 }
        L_0x0132:
            return r0
        L_0x0133:
            r0 = move-exception
            r16 = r2
            goto L_0x016d
        L_0x0137:
            r0 = move-exception
            r9 = r2
            r6 = r15
            goto L_0x0158
        L_0x013b:
            if (r2 == 0) goto L_0x0140
            com.ss.android.common.util.NetworkUtils.safeClose(r2)     // Catch:{ Throwable -> 0x0140 }
        L_0x0140:
            r1 = 0
            return r1
        L_0x0142:
            java.lang.String r2 = "Reason-Phrase"
            java.lang.String r1 = r1.header(r2)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            com.ss.android.http.a.a.b r2 = new com.ss.android.http.a.a.b     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
            throw r2     // Catch:{ Exception -> 0x014e, all -> 0x0151 }
        L_0x014e:
            r0 = move-exception
            r6 = r15
            goto L_0x0157
        L_0x0151:
            r0 = move-exception
            r16 = 0
            goto L_0x016d
        L_0x0155:
            r0 = move-exception
            r6 = 0
        L_0x0157:
            r9 = 0
        L_0x0158:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x016a }
            r7 = 0
            long r1 = r1 - r3
            r7 = 0
            com.ss.android.common.util.NetworkUtils.handleApiError(r5, r0, r1, r7)     // Catch:{ all -> 0x016a }
            r5 = r21
            r7 = r14
            r8 = r0
            com.ss.android.common.util.NetworkUtils.monitorApiError(r1, r3, r5, r6, r7, r8)     // Catch:{ all -> 0x016a }
            throw r0     // Catch:{ all -> 0x016a }
        L_0x016a:
            r0 = move-exception
            r16 = r9
        L_0x016d:
            if (r16 == 0) goto L_0x0172
            com.ss.android.common.util.NetworkUtils.safeClose(r16)     // Catch:{ Throwable -> 0x0172 }
        L_0x0172:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.net.b.c.a(int, int, java.lang.String, java.util.List, boolean, boolean, com.ss.android.http.a.b.f, boolean):java.lang.String");
    }
}
