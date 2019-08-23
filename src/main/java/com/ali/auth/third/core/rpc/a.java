package com.ali.auth.third.core.rpc;

import android.text.TextUtils;
import com.ali.auth.third.core.rpc.protocol.b;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.core.util.RSAKey;
import com.ali.auth.third.core.util.Rsa;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4946a = "a";

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        throw new com.ali.auth.third.core.rpc.protocol.RpcException("net work error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        r5 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        r5 = r5.getMessage();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:6:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.io.InputStream r5, java.lang.String r6) throws java.io.UnsupportedEncodingException {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
        L_0x0009:
            int r2 = r5.read(r1)     // Catch:{ IOException -> 0x0094 }
            r3 = -1
            if (r2 == r3) goto L_0x0015
            r3 = 0
            r0.write(r1, r3, r2)     // Catch:{ IOException -> 0x0094 }
            goto L_0x0009
        L_0x0015:
            java.lang.String r5 = new java.lang.String
            byte[] r0 = r0.toByteArray()
            r5.<init>(r0, r6)
            java.lang.String r6 = com.ali.auth.third.core.rpc.protocol.b.a()
            java.lang.String r6 = com.ali.auth.third.core.rpc.a.a.b(r6, r5)     // Catch:{ JSONException -> 0x0065, Exception -> 0x005d }
            java.lang.String r5 = f4946a     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            java.lang.String r1 = "gateway response="
            r0.<init>(r1)     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            r0.append(r6)     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            com.ali.auth.third.core.trace.SDKLogger.e(r5, r0)     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            r5.<init>(r6)     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            java.lang.String r0 = "resultStatus"
            int r0 = r5.getInt(r0)     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 != r1) goto L_0x004f
            java.lang.String r0 = "result"
            java.lang.String r5 = r5.getString(r0)     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            return r5
        L_0x004f:
            com.ali.auth.third.core.rpc.protocol.RpcException r5 = new com.ali.auth.third.core.rpc.protocol.RpcException     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            java.lang.String r1 = "memo"
            r5.<init>((java.lang.Integer) r0, (java.lang.String) r1)     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
            throw r5     // Catch:{ JSONException -> 0x005b, Exception -> 0x005d }
        L_0x005b:
            r5 = move-exception
            goto L_0x0069
        L_0x005d:
            com.ali.auth.third.core.rpc.protocol.RpcException r5 = new com.ali.auth.third.core.rpc.protocol.RpcException
            java.lang.String r6 = "net work error"
            r5.<init>(r6)
            throw r5
        L_0x0065:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x0069:
            com.ali.auth.third.core.rpc.protocol.RpcException r0 = new com.ali.auth.third.core.rpc.protocol.RpcException
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "response  ="
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = ":"
            r2.append(r6)
            r2.append(r5)
            java.lang.String r6 = r2.toString()
            if (r6 != 0) goto L_0x008c
            java.lang.String r5 = ""
            goto L_0x0090
        L_0x008c:
            java.lang.String r5 = r5.getMessage()
        L_0x0090:
            r0.<init>((java.lang.Integer) r1, (java.lang.String) r5)
            throw r0
        L_0x0094:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.auth.third.core.rpc.a.a(java.io.InputStream, java.lang.String):java.lang.String");
    }

    public static String a(String str) {
        return "utf-8";
    }

    public static String a(String str, String str2) {
        String rsaPubkey = RSAKey.getRsaPubkey();
        if (!TextUtils.isEmpty(rsaPubkey)) {
            String encrypt = Rsa.encrypt(str, rsaPubkey);
            String a2 = com.ali.auth.third.core.rpc.a.a.a(str, str2);
            return String.format(Locale.getDefault(), "%08X%s%08X%s", new Object[]{Integer.valueOf(encrypt.length()), encrypt, Integer.valueOf(a2.length()), a2});
        }
        throw new IllegalArgumentException("get rsa from server failed!!!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da A[SYNTHETIC, Splitter:B:41:0x00da] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = f4946a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "post target = "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " params"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.ali.auth.third.core.trace.SDKLogger.d(r0, r1)
            r0 = 0
            com.ali.auth.third.core.config.Environment r1 = com.ali.auth.third.core.context.KernelContext.getEnvironment()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            com.ali.auth.third.core.config.Environment r2 = com.ali.auth.third.core.config.Environment.PRE     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            if (r1 != r2) goto L_0x0032
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            java.lang.String r2 = "http://hz.pre.tbusergw.taobao.net/gw.do"
            r1.<init>(r2)     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
        L_0x002f:
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            goto L_0x0052
        L_0x0032:
            com.ali.auth.third.core.config.Environment r1 = com.ali.auth.third.core.context.KernelContext.getEnvironment()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            com.ali.auth.third.core.config.Environment r2 = com.ali.auth.third.core.config.Environment.TEST     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            if (r1 != r2) goto L_0x0046
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            java.lang.String r2 = "http://hz.tbusergw.taobao.net/gw.do"
            r1.<init>(r2)     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            goto L_0x002f
        L_0x0046:
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            java.lang.String r2 = "https://mgw.m.taobao.com/gw.do"
            r1.<init>(r2)     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c9 }
            goto L_0x002f
        L_0x0052:
            r2 = 1
            r1.setDoInput(r2)     // Catch:{ Throwable -> 0x00c7 }
            r1.setDoOutput(r2)     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r2 = "POST"
            r1.setRequestMethod(r2)     // Catch:{ Throwable -> 0x00c7 }
            r2 = 0
            r1.setUseCaches(r2)     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/x-www-form-urlencoded"
            r1.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x00c7 }
            r2 = 15000(0x3a98, float:2.102E-41)
            r1.setConnectTimeout(r2)     // Catch:{ Throwable -> 0x00c7 }
            r1.setReadTimeout(r2)     // Catch:{ Throwable -> 0x00c7 }
            com.ali.auth.third.core.service.impl.CredentialManager r2 = com.ali.auth.third.core.service.impl.CredentialManager.INSTANCE     // Catch:{ Throwable -> 0x00c7 }
            com.ali.auth.third.core.model.InternalSession r2 = r2.getInternalSession()     // Catch:{ Throwable -> 0x00c7 }
            com.ali.auth.third.core.model.User r3 = r2.user     // Catch:{ Throwable -> 0x00c7 }
            if (r3 == 0) goto L_0x008e
            com.ali.auth.third.core.model.User r3 = r2.user     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r3 = r3.userId     // Catch:{ Throwable -> 0x00c7 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x00c7 }
            if (r3 != 0) goto L_0x008e
            java.lang.String r3 = "userid"
            com.ali.auth.third.core.model.User r2 = r2.user     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r2 = r2.userId     // Catch:{ Throwable -> 0x00c7 }
            r1.setRequestProperty(r3, r2)     // Catch:{ Throwable -> 0x00c7 }
        L_0x008e:
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ Throwable -> 0x00c7 }
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch:{ Throwable -> 0x00c7 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r4 = b(r4, r5, r6)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            r2.write(r4)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            r2.flush()     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            int r4 = r1.getResponseCode()     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            a((int) r4)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            java.io.InputStream r4 = r1.getInputStream()     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            java.lang.String r5 = r1.getContentType()     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            java.lang.String r5 = a((java.lang.String) r5)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            java.lang.String r4 = a((java.io.InputStream) r4, (java.lang.String) r5)     // Catch:{ Throwable -> 0x00c4, all -> 0x00c1 }
            com.ali.auth.third.core.util.IOUtils.closeQuietly(r2)
            if (r1 == 0) goto L_0x00c0
            r1.disconnect()     // Catch:{ Exception -> 0x00c0 }
        L_0x00c0:
            return r4
        L_0x00c1:
            r4 = move-exception
            r0 = r2
            goto L_0x00d5
        L_0x00c4:
            r4 = move-exception
            r0 = r2
            goto L_0x00ce
        L_0x00c7:
            r4 = move-exception
            goto L_0x00ce
        L_0x00c9:
            r4 = move-exception
            r1 = r0
            goto L_0x00d5
        L_0x00cc:
            r4 = move-exception
            r1 = r0
        L_0x00ce:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x00d4 }
            r5.<init>(r4)     // Catch:{ all -> 0x00d4 }
            throw r5     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r4 = move-exception
        L_0x00d5:
            com.ali.auth.third.core.util.IOUtils.closeQuietly(r0)
            if (r1 == 0) goto L_0x00dd
            r1.disconnect()     // Catch:{ Exception -> 0x00dd }
        L_0x00dd:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.auth.third.core.rpc.a.a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private static void a(int i) {
        if (i != 200) {
            throw new RuntimeException("http request exception, response code: " + i);
        }
    }

    public static String b(String str, String str2, String str3) {
        String a2 = com.ali.auth.third.core.rpc.protocol.a.a(24);
        b.a(a2);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("id=1&");
            sb.append("apiName=" + str + "&");
            sb.append("apiVersion=" + str2 + "&");
            StringBuilder sb2 = new StringBuilder("requestData=");
            sb2.append(URLEncoder.encode(a(a2, str3), "UTF-8"));
            sb.append(sb2.toString());
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            SDKLogger.e(f4946a, e2.getMessage());
            throw new RuntimeException(e2);
        }
    }
}
