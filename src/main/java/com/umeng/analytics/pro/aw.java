package com.umeng.analytics.pro;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.a;
import java.net.URLEncoder;

public class aw {

    /* renamed from: a  reason: collision with root package name */
    private String f80410a;

    /* renamed from: b  reason: collision with root package name */
    private String f80411b = "10.0.0.172";

    /* renamed from: c  reason: collision with root package name */
    private int f80412c = 80;

    /* renamed from: d  reason: collision with root package name */
    private Context f80413d;

    /* renamed from: e  reason: collision with root package name */
    private av f80414e;

    private void b() {
        String d2 = af.a(this.f80413d).b().d("");
        String c2 = af.a(this.f80413d).b().c("");
        if (!TextUtils.isEmpty(d2)) {
            a.f80291f = bt.b(d2);
        }
        if (!TextUtils.isEmpty(c2)) {
            a.g = bt.b(c2);
        }
        a.h = new String[]{a.f80291f, a.g};
        int b2 = bg.a(this.f80413d).b();
        if (b2 != -1) {
            if (b2 == 0) {
                a.h = new String[]{a.f80291f, a.g};
            } else if (b2 == 1) {
                a.h = new String[]{a.g, a.f80291f};
            }
        }
    }

    private boolean c() {
        if (this.f80413d.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f80413d.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f80413d.getSystemService("connectivity");
            if (!bv.a(this.f80413d, "android.permission.ACCESS_NETWORK_STATE")) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (!(activeNetworkInfo == null || activeNetworkInfo.getType() == 1)) {
                String extraInfo = activeNetworkInfo.getExtraInfo();
                if (extraInfo == null || (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap") && !extraInfo.equals("uniwap"))) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d3 A[SYNTHETIC, Splitter:B:29:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d9 A[SYNTHETIC, Splitter:B:35:0x00d9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = java.security.KeyStore.getDefaultType()     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r1.load(r0, r0)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            com.umeng.analytics.pro.bb r2 = new com.umeng.analytics.pro.bb     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.conn.ssl.X509HostnameVerifier r1 = org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r2.setHostnameVerifier(r1)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.client.methods.HttpGet r1 = new org.apache.http.client.methods.HttpGet     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            java.lang.String r3 = "https://uop.umeng.com"
            r1.<init>(r3)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.params.BasicHttpParams r3 = new org.apache.http.params.BasicHttpParams     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r3.<init>()     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.HttpVersion r4 = org.apache.http.HttpVersion.HTTP_1_1     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.params.HttpProtocolParams.setVersion(r3, r4)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            java.lang.String r4 = "ISO-8859-1"
            org.apache.http.params.HttpProtocolParams.setContentCharset(r3, r4)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r4 = 1
            org.apache.http.params.HttpProtocolParams.setUseExpectContinue(r3, r4)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r4 = 10000(0x2710, double:4.9407E-320)
            org.apache.http.conn.params.ConnManagerParams.setTimeout(r3, r4)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r4 = 10000(0x2710, float:1.4013E-41)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r3, r4)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r3, r4)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.conn.scheme.SchemeRegistry r4 = new org.apache.http.conn.scheme.SchemeRegistry     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r4.<init>()     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.conn.scheme.Scheme r5 = new org.apache.http.conn.scheme.Scheme     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            java.lang.String r6 = "http"
            org.apache.http.conn.scheme.PlainSocketFactory r7 = org.apache.http.conn.scheme.PlainSocketFactory.getSocketFactory()     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r8 = 80
            r5.<init>(r6, r7, r8)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r4.register(r5)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.conn.scheme.Scheme r5 = new org.apache.http.conn.scheme.Scheme     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            java.lang.String r6 = "https"
            r7 = 443(0x1bb, float:6.21E-43)
            r5.<init>(r6, r2, r7)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r4.register(r5)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager r2 = new org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.impl.client.DefaultHttpClient r4 = new org.apache.http.impl.client.DefaultHttpClient     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            r4.<init>(r2, r3)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.HttpResponse r1 = r4.execute(r1)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            org.apache.http.HttpEntity r1 = r1.getEntity()     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            java.io.InputStream r1 = r1.getContent()     // Catch:{ Throwable -> 0x00d7, all -> 0x00d0 }
            if (r1 == 0) goto L_0x00ca
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            r0.<init>()     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
        L_0x007f:
            int r3 = r1.read(r2)     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            r4 = -1
            if (r3 == r4) goto L_0x008b
            r4 = 0
            r0.write(r2, r4, r3)     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            goto L_0x007f
        L_0x008b:
            r0.close()     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            if (r0 != 0) goto L_0x00ca
            int r0 = r2.length()     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            if (r0 <= 0) goto L_0x00ca
            int r0 = r2.length()     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            r3 = 50
            if (r0 >= r3) goto L_0x00ca
            android.content.Context r0 = r10.f80413d     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            android.content.SharedPreferences r0 = com.umeng.analytics.pro.ba.a(r0)     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            if (r0 == 0) goto L_0x00ca
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            java.lang.String r3 = "uopdta"
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r2)     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            r0.commit()     // Catch:{ Throwable -> 0x00c8, all -> 0x00c3 }
            goto L_0x00ca
        L_0x00c3:
            r0 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x00d1
        L_0x00c8:
            r0 = r1
            goto L_0x00d7
        L_0x00ca:
            if (r1 == 0) goto L_0x00dd
            r1.close()     // Catch:{ Throwable -> 0x00cf }
        L_0x00cf:
            return
        L_0x00d0:
            r1 = move-exception
        L_0x00d1:
            if (r0 == 0) goto L_0x00d6
            r0.close()     // Catch:{ Throwable -> 0x00d6 }
        L_0x00d6:
            throw r1
        L_0x00d7:
            if (r0 == 0) goto L_0x00dd
            r0.close()     // Catch:{ Throwable -> 0x00dc }
        L_0x00dc:
            return
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.aw.a():void");
    }

    public void a(av avVar) {
        this.f80414e = avVar;
    }

    public aw(Context context) {
        this.f80413d = context;
        this.f80410a = a(context);
    }

    public byte[] a(byte[] bArr) {
        b();
        byte[] bArr2 = null;
        int i = 0;
        while (true) {
            if (i >= a.h.length) {
                break;
            }
            bArr2 = a(bArr, a.h[i]);
            if (bArr2 == null) {
                if (this.f80414e != null) {
                    this.f80414e.d();
                }
                i++;
            } else if (this.f80414e != null) {
                this.f80414e.c();
            }
        }
        return bArr2;
    }

    private String a(Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Android");
        stringBuffer.append("/");
        stringBuffer.append("6.1.1");
        stringBuffer.append(" ");
        try {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(bv.v(context));
            stringBuffer2.append("/");
            stringBuffer2.append(bv.b(context));
            stringBuffer2.append(" ");
            stringBuffer2.append(Build.MODEL);
            stringBuffer2.append("/");
            stringBuffer2.append(Build.VERSION.RELEASE);
            stringBuffer2.append(" ");
            stringBuffer2.append(bw.a(AnalyticsConfig.getAppkey(context)));
            stringBuffer.append(URLEncoder.encode(stringBuffer2.toString(), "UTF-8"));
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] a(byte[] r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 0
            com.umeng.analytics.pro.av r1 = r6.f80414e     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            if (r1 == 0) goto L_0x000a
            com.umeng.analytics.pro.av r1 = r6.f80414e     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            r1.a()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        L_0x000a:
            boolean r1 = r6.c()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            if (r1 == 0) goto L_0x002c
            java.net.Proxy r1 = new java.net.Proxy     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            java.net.Proxy$Type r2 = java.net.Proxy.Type.HTTP     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            java.lang.String r4 = r6.f80411b     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            int r5 = r6.f80412c     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            r3.<init>(r4, r5)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            r2.<init>(r8)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            java.net.URLConnection r1 = r2.openConnection(r1)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            goto L_0x0037
        L_0x002c:
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            r1.<init>(r8)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        L_0x0037:
            java.lang.String r2 = "X-Umeng-UTC"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x00e3 }
            r1.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r2 = "X-Umeng-Sdk"
            java.lang.String r3 = r6.f80410a     // Catch:{ Throwable -> 0x00e3 }
            r1.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r2 = "Msg-Type"
            java.lang.String r3 = "envelope/json"
            r1.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "envelope/json"
            r1.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x00e3 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setConnectTimeout(r2)     // Catch:{ Throwable -> 0x00e3 }
            r2 = 30000(0x7530, float:4.2039E-41)
            r1.setReadTimeout(r2)     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r2 = "POST"
            r1.setRequestMethod(r2)     // Catch:{ Throwable -> 0x00e3 }
            r2 = 1
            r1.setDoOutput(r2)     // Catch:{ Throwable -> 0x00e3 }
            r1.setDoInput(r2)     // Catch:{ Throwable -> 0x00e3 }
            r3 = 0
            r1.setUseCaches(r3)     // Catch:{ Throwable -> 0x00e3 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00e3 }
            r5 = 8
            if (r4 >= r5) goto L_0x0080
            java.lang.String r4 = "http.keepAlive"
            java.lang.String r5 = "false"
            java.lang.System.setProperty(r4, r5)     // Catch:{ Throwable -> 0x00e3 }
        L_0x0080:
            java.io.OutputStream r4 = r1.getOutputStream()     // Catch:{ Throwable -> 0x00e3 }
            r4.write(r7)     // Catch:{ Throwable -> 0x00e3 }
            r4.flush()     // Catch:{ Throwable -> 0x00e3 }
            r4.close()     // Catch:{ Throwable -> 0x00e3 }
            com.umeng.analytics.pro.av r7 = r6.f80414e     // Catch:{ Throwable -> 0x00e3 }
            if (r7 == 0) goto L_0x0096
            com.umeng.analytics.pro.av r7 = r6.f80414e     // Catch:{ Throwable -> 0x00e3 }
            r7.b()     // Catch:{ Throwable -> 0x00e3 }
        L_0x0096:
            int r7 = r1.getResponseCode()     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r4 = "Content-Type"
            java.lang.String r4 = r1.getHeaderField(r4)     // Catch:{ Throwable -> 0x00e3 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x00e3 }
            if (r5 != 0) goto L_0x00af
            java.lang.String r5 = "application/thrift"
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch:{ Throwable -> 0x00e3 }
            if (r4 == 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r2 = 0
        L_0x00b0:
            r3 = 200(0xc8, float:2.8E-43)
            if (r7 != r3) goto L_0x00dd
            if (r2 == 0) goto L_0x00dd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r2 = "Send message to "
            r7.<init>(r2)     // Catch:{ Throwable -> 0x00e3 }
            r7.append(r8)     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x00e3 }
            com.umeng.analytics.pro.by.c((java.lang.String) r7)     // Catch:{ Throwable -> 0x00e3 }
            java.io.InputStream r7 = r1.getInputStream()     // Catch:{ Throwable -> 0x00e3 }
            byte[] r8 = com.umeng.analytics.pro.bw.b((java.io.InputStream) r7)     // Catch:{ all -> 0x00d8 }
            com.umeng.analytics.pro.bw.c(r7)     // Catch:{ Throwable -> 0x00e3 }
            if (r1 == 0) goto L_0x00d7
            r1.disconnect()
        L_0x00d7:
            return r8
        L_0x00d8:
            r8 = move-exception
            com.umeng.analytics.pro.bw.c(r7)     // Catch:{ Throwable -> 0x00e3 }
            throw r8     // Catch:{ Throwable -> 0x00e3 }
        L_0x00dd:
            if (r1 == 0) goto L_0x00e2
            r1.disconnect()
        L_0x00e2:
            return r0
        L_0x00e3:
            r7 = move-exception
            goto L_0x00ea
        L_0x00e5:
            r7 = move-exception
            r1 = r0
            goto L_0x00f6
        L_0x00e8:
            r7 = move-exception
            r1 = r0
        L_0x00ea:
            java.lang.String r8 = "IOException,Failed to send message."
            com.umeng.analytics.pro.by.e((java.lang.String) r8, (java.lang.Throwable) r7)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x00f4
            r1.disconnect()
        L_0x00f4:
            return r0
        L_0x00f5:
            r7 = move-exception
        L_0x00f6:
            if (r1 == 0) goto L_0x00fb
            r1.disconnect()
        L_0x00fb:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.aw.a(byte[], java.lang.String):byte[]");
    }
}
