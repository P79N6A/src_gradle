package com.alipay.sdk.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.URL;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f5485a;

    /* renamed from: b  reason: collision with root package name */
    private Context f5486b;

    private URL a() {
        try {
            return new URL(this.f5485a);
        } catch (Exception unused) {
            return null;
        }
    }

    private NetworkInfo b() {
        try {
            return ((ConnectivityManager) this.f5486b.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    private String c() {
        try {
            NetworkInfo b2 = b();
            if (b2 == null || !b2.isAvailable()) {
                return "none";
            }
            if (b2.getType() == 1) {
                return "wifi";
            }
            return b2.getExtraInfo().toLowerCase();
        } catch (Exception unused) {
            return "none";
        }
    }

    public a(Context context, String str) {
        this.f5486b = context;
        this.f5485a = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e A[Catch:{ Throwable -> 0x0107, Throwable -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085 A[Catch:{ Throwable -> 0x0107, Throwable -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf A[Catch:{ Throwable -> 0x0107, Throwable -> 0x0117 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.apache.http.HttpResponse a(byte[] r7, java.util.List<org.apache.http.Header> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "requestUrl : "
            r0.<init>(r1)
            java.lang.String r1 = r6.f5485a
            r0.append(r1)
            com.alipay.sdk.e.b r0 = com.alipay.sdk.e.b.a()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            org.apache.http.impl.client.DefaultHttpClient r2 = r0.f5488b     // Catch:{ Throwable -> 0x0107 }
            org.apache.http.params.HttpParams r2 = r2.getParams()     // Catch:{ Throwable -> 0x0107 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0107 }
            r4 = 11
            if (r3 < r4) goto L_0x005b
            java.lang.String r3 = r6.c()     // Catch:{ Throwable -> 0x0107 }
            if (r3 == 0) goto L_0x0030
            java.lang.String r4 = "wap"
            boolean r3 = r3.contains(r4)     // Catch:{ Throwable -> 0x0107 }
            if (r3 != 0) goto L_0x0030
        L_0x002e:
            r5 = r1
            goto L_0x007c
        L_0x0030:
            java.net.URL r3 = r6.a()     // Catch:{ Throwable -> 0x0107 }
            if (r3 == 0) goto L_0x002e
            java.lang.String r3 = r3.getProtocol()     // Catch:{ Throwable -> 0x0107 }
            java.lang.String r4 = "https"
            r4.equalsIgnoreCase(r3)     // Catch:{ Throwable -> 0x0107 }
            java.lang.String r3 = "https.proxyHost"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch:{ Throwable -> 0x0107 }
            java.lang.String r4 = "https.proxyPort"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch:{ Throwable -> 0x0107 }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0107 }
            if (r5 != 0) goto L_0x002e
            org.apache.http.HttpHost r5 = new org.apache.http.HttpHost     // Catch:{ Throwable -> 0x0107 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Throwable -> 0x0107 }
            r5.<init>(r3, r4)     // Catch:{ Throwable -> 0x0107 }
            goto L_0x007c
        L_0x005b:
            android.net.NetworkInfo r3 = r6.b()     // Catch:{ Throwable -> 0x0107 }
            if (r3 == 0) goto L_0x002e
            boolean r4 = r3.isAvailable()     // Catch:{ Throwable -> 0x0107 }
            if (r4 == 0) goto L_0x002e
            int r3 = r3.getType()     // Catch:{ Throwable -> 0x0107 }
            if (r3 != 0) goto L_0x002e
            java.lang.String r3 = android.net.Proxy.getDefaultHost()     // Catch:{ Throwable -> 0x0107 }
            int r4 = android.net.Proxy.getDefaultPort()     // Catch:{ Throwable -> 0x0107 }
            if (r3 == 0) goto L_0x002e
            org.apache.http.HttpHost r5 = new org.apache.http.HttpHost     // Catch:{ Throwable -> 0x0107 }
            r5.<init>(r3, r4)     // Catch:{ Throwable -> 0x0107 }
        L_0x007c:
            if (r5 == 0) goto L_0x0083
            java.lang.String r3 = "http.route.default-proxy"
            r2.setParameter(r3, r5)     // Catch:{ Throwable -> 0x0107 }
        L_0x0083:
            if (r7 == 0) goto L_0x00b6
            int r2 = r7.length     // Catch:{ Throwable -> 0x0107 }
            if (r2 != 0) goto L_0x0089
            goto L_0x00b6
        L_0x0089:
            org.apache.http.client.methods.HttpPost r2 = new org.apache.http.client.methods.HttpPost     // Catch:{ Throwable -> 0x0107 }
            java.lang.String r3 = r6.f5485a     // Catch:{ Throwable -> 0x0107 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0107 }
            org.apache.http.entity.ByteArrayEntity r3 = new org.apache.http.entity.ByteArrayEntity     // Catch:{ Throwable -> 0x0107 }
            r3.<init>(r7)     // Catch:{ Throwable -> 0x0107 }
            java.lang.String r7 = "application/octet-stream;binary/octet-stream"
            r3.setContentType(r7)     // Catch:{ Throwable -> 0x0107 }
            r7 = r2
            org.apache.http.client.methods.HttpPost r7 = (org.apache.http.client.methods.HttpPost) r7     // Catch:{ Throwable -> 0x0107 }
            r7.setEntity(r3)     // Catch:{ Throwable -> 0x0107 }
            java.lang.String r7 = "Accept-Charset"
            java.lang.String r3 = "UTF-8"
            r2.addHeader(r7, r3)     // Catch:{ Throwable -> 0x0107 }
            java.lang.String r7 = "Connection"
            java.lang.String r3 = "Keep-Alive"
            r2.addHeader(r7, r3)     // Catch:{ Throwable -> 0x0107 }
            java.lang.String r7 = "Keep-Alive"
            java.lang.String r3 = "timeout=180, max=100"
            r2.addHeader(r7, r3)     // Catch:{ Throwable -> 0x0107 }
            goto L_0x00bd
        L_0x00b6:
            org.apache.http.client.methods.HttpGet r2 = new org.apache.http.client.methods.HttpGet     // Catch:{ Throwable -> 0x0107 }
            java.lang.String r7 = r6.f5485a     // Catch:{ Throwable -> 0x0107 }
            r2.<init>(r7)     // Catch:{ Throwable -> 0x0107 }
        L_0x00bd:
            if (r8 == 0) goto L_0x00d3
            java.util.Iterator r7 = r8.iterator()     // Catch:{ Throwable -> 0x0107 }
        L_0x00c3:
            boolean r8 = r7.hasNext()     // Catch:{ Throwable -> 0x0107 }
            if (r8 == 0) goto L_0x00d3
            java.lang.Object r8 = r7.next()     // Catch:{ Throwable -> 0x0107 }
            org.apache.http.Header r8 = (org.apache.http.Header) r8     // Catch:{ Throwable -> 0x0107 }
            r2.addHeader(r8)     // Catch:{ Throwable -> 0x0107 }
            goto L_0x00c3
        L_0x00d3:
            org.apache.http.HttpResponse r7 = r0.a(r2)     // Catch:{ Throwable -> 0x0107 }
            java.lang.String r8 = "X-Hostname"
            org.apache.http.Header[] r8 = r7.getHeaders(r8)     // Catch:{ Throwable -> 0x0107 }
            r2 = 0
            if (r8 == 0) goto L_0x00ef
            int r3 = r8.length     // Catch:{ Throwable -> 0x0107 }
            if (r3 <= 0) goto L_0x00ef
            r8 = r8[r2]     // Catch:{ Throwable -> 0x0107 }
            if (r8 == 0) goto L_0x00ef
            java.lang.String r8 = "X-Hostname"
            org.apache.http.Header[] r8 = r7.getHeaders(r8)     // Catch:{ Throwable -> 0x0107 }
            r8 = r8[r2]     // Catch:{ Throwable -> 0x0107 }
        L_0x00ef:
            java.lang.String r8 = "X-ExecuteTime"
            org.apache.http.Header[] r8 = r7.getHeaders(r8)     // Catch:{ Throwable -> 0x0107 }
            if (r8 == 0) goto L_0x0106
            int r3 = r8.length     // Catch:{ Throwable -> 0x0107 }
            if (r3 <= 0) goto L_0x0106
            r8 = r8[r2]     // Catch:{ Throwable -> 0x0107 }
            if (r8 == 0) goto L_0x0106
            java.lang.String r8 = "X-ExecuteTime"
            org.apache.http.Header[] r8 = r7.getHeaders(r8)     // Catch:{ Throwable -> 0x0107 }
            r8 = r8[r2]     // Catch:{ Throwable -> 0x0107 }
        L_0x0106:
            return r7
        L_0x0107:
            r7 = move-exception
            if (r0 == 0) goto L_0x0117
            org.apache.http.impl.client.DefaultHttpClient r8 = r0.f5488b     // Catch:{ Throwable -> 0x0117 }
            org.apache.http.conn.ClientConnectionManager r8 = r8.getConnectionManager()     // Catch:{ Throwable -> 0x0117 }
            if (r8 == 0) goto L_0x0117
            r8.shutdown()     // Catch:{ Throwable -> 0x0117 }
            com.alipay.sdk.e.b.f5487a = r1     // Catch:{ Throwable -> 0x0117 }
        L_0x0117:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.e.a.a(byte[], java.util.List):org.apache.http.HttpResponse");
    }
}
